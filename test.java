import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.util.Stack;

import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Test {
  public static void typeString(Robot robot, String text) throws InterruptedException {
    for (char c : text.toCharArray()) {
      typeChar(robot, c);
      Thread.sleep(80); // kleine Pause für realistischere Eingabe
    }
  }

  public static void typeChar(Robot robot, char c) {
        try {
            boolean upperCase = Character.isUpperCase(c);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

            if (keyCode == KeyEvent.VK_UNDEFINED) {
                throw new RuntimeException("Keycode nicht definiert für Zeichen " + c);
            }

            if (upperCase) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);

            if (upperCase) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Zeichen nicht unterstützt: " + c);
        }
    }

  public static int[][] getWhitePixels(BufferedImage screenshot) {
    int width = screenshot.getWidth();
    int height = screenshot.getHeight();
    int[][] whiteMatrix = new int[height][width];

    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        Color c = new Color(screenshot.getRGB(x, y));
        if (c.getRed() == 255 && c.getBlue() == 255 && c.getGreen() == 255) {
          whiteMatrix[y][x] = 1;
        } else {
          whiteMatrix[y][x] = 0;
        }
      }
    }
    return whiteMatrix;
  }

  public static Rectangle findLargestRectangle(int[][] whiteMatrix) throws AWTException {
    int height = whiteMatrix.length;
    int width = whiteMatrix[0].length;
    int[] histogram = new int[width];
    int maxArea = 0;
    int bestLeft = 0, bestRight = 0, bestTop = 0, bestBottom = 0;
    Robot robot = new Robot();
    for (int y=0; y<height; y++) {
      robot.mouseMove(1, y);
      for (int x=0; x<width; x++) {
        if (whiteMatrix[y][x] == 1) {
          histogram[x]++;
        } else {
          histogram[x] = 0;
        }
        Stack<Integer> stack = new Stack<>();
        int x1 = 0;
        while (x1 <= width) {
          //System.out.println(x1 + "<=" + width);
          int h = x1 < width ? histogram[x1] : 0;
          if (stack.isEmpty() || h >= histogram[stack.peek()]) {
            stack.push(x1++);
          } else {
            int top = stack.pop();
            int left = stack.isEmpty() ? 0 : stack.peek() + 1;
            int area = histogram[top] * (x1 - left);
            if (area > maxArea) {
              maxArea = area;
              bestLeft = left;
              bestRight = x1 - 1;
              bestTop = y - histogram[top] + 1;
              bestBottom = y;
            }
          }
        }
      }
    }
    return new Rectangle(bestLeft, bestTop, bestRight - bestLeft + 1, bestBottom - bestTop + 1);
  }

  public static void saveRectangle() throws InterruptedException, AWTException {
    Robot robot = new Robot();
    Thread.sleep(7000);
    int[][] whiteMatrix = null;

    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    BufferedImage screenshot = robot.createScreenCapture(screenRect);
    whiteMatrix = getWhitePixels(screenshot);
    Rectangle rect = findLargestRectangle(whiteMatrix);

    try (PrintWriter writer = new PrintWriter("./coords.txt")) {
      writer.println(rect.x + ";" + rect.y + ";" + rect.width + ";" + rect.height);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
    // Neues Bild mit weißem Hintergrund
    BufferedImage resultImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = resultImage.createGraphics();

    // Hintergrund weiß füllen
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, targetWidth, targetHeight);

    int imgWidth = originalImage.getWidth();
    int imgHeight = originalImage.getHeight();

    if (imgWidth <= targetWidth && imgHeight <= targetHeight) {
        // Bild ist kleiner: Zentriert einfügen ohne Skalierung
        int x = (targetWidth - imgWidth) / 2;
        int y = (targetHeight - imgHeight) / 2;
        g.drawImage(originalImage, x, y, imgWidth, imgHeight, null);
    } else {
        // Bild ist größer: skalieren auf Zielgröße (wie vorher)
        g.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
    }
    g.dispose();
    return resultImage;
  }

  public static BufferedImage toBlackAndWhite(BufferedImage src, int threshold) {
        int width = src.getWidth();
        int height = src.getHeight();
        BufferedImage bw = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(src.getRGB(x, y));
                int gray = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
                if (gray > threshold) {
                    bw.setRGB(x, y, Color.WHITE.getRGB());
                } else {
                    bw.setRGB(x, y, Color.BLACK.getRGB());
                }
            }
        }
        return bw;
    }

  public static void main(String[] args) throws AWTException, InterruptedException {
    Robot robot = new Robot();

    Thread.sleep(5000);
    Point point = MouseInfo.getPointerInfo().getLocation();
    System.out.println(point);
    // 200 130
    // U 1150 680


    int[] windows = {775, 350};
    robot.mouseMove(windows[1], windows[0]);
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    Thread.sleep(1000);

    typeString(robot, "Paint");

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

    Thread.sleep(30000);
    saveRectangle();

    while (true) {
      break;
    }

    try (
      BufferedReader reader = new BufferedReader(new FileReader("./coords.txt"));
    ) {
      String line = reader.readLine(); // liest die erste Zeile, z.B. "128;204;1023;479"
      String[] parts = line.split(";");

      int x = Integer.parseInt(parts[0]);
      int y = Integer.parseInt(parts[1]);
      int width = Integer.parseInt(parts[2]);
      int height = Integer.parseInt(parts[3]);

      BufferedImage resizedImage = resizeImage(ImageIO.read(new File("./local/bild.png")), width, height);
      BufferedImage grayScaleImage = toBlackAndWhite(resizedImage, 128);
      ImageIO.write(grayScaleImage, "png", new File("output_sw.png"));

      System.out.println("x:" + x + " y:" + y);
      System.out.println("width: " + width + " height:" + height);

      Thread.sleep(5000);
      robot.mouseMove(x, y);


      for (int j = 0; j < grayScaleImage.getHeight(); j++) {
      boolean isDrawing = false;

      for (int i = 0; i < grayScaleImage.getWidth(); i++) {
        int rgb = grayScaleImage.getRGB(i, j);
        int screenX = x + i;
        int screenY = y + j;

        if (rgb == Color.BLACK.getRGB()) {
          robot.mouseMove(screenX, screenY);

          if (!isDrawing) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            isDrawing = true;
          }
        } else {
          if (isDrawing) {
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            isDrawing = false;
          }
        }
   }

  if (isDrawing) {
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
  }
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}