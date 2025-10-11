import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.util.Stack;

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

  public static void main(String[] args) throws AWTException, InterruptedException, InterruptedException {
    Robot robot = new Robot();
    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

    //Point point = MouseInfo.getPointerInfo().getLocation();
    // 200 130
    // U 1150 680


    int[] windows = {772, 304};
    robot.mouseMove(windows[1], windows[0]);
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    Thread.sleep(100);

    typeString(robot, "Paint");

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

    Thread.sleep(7000);
    try {
      BufferedImage image = ImageIO.read(new File("./image.png"));
      BufferedImage screenshot = robot.createScreenCapture(screenRect);
      int[][] whiteMatrix = getWhitePixels(screenshot);
      Rectangle rect = findLargestRectangle(whiteMatrix);
      for (int y = rect.y; y < rect.y + rect.height; y++) {
        for (int x = rect.x; x < rect.x + rect.width; x++) {
          if (Math.round(Math.random()) == 1) {
            System.out.println(y + " " + x);
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
          }
      }
    }
    } catch (IOException e) {
      System.err.println("Fehler beim einlesen des Bildes: " + e.getMessage());
    }

    int width = 1920;
    int height = 1080;

    int x1 = 200, y1 = 130;
    int x2 = 1150, y2 = 680;

    for (int y = y1; y<=y2; y++) {
      for (int x = x1; x<=x2; x++) {
        System.out.println("click");
        break;
        //robot.mouseMove(x, y);
        //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      }
      break;
    }
  }
}