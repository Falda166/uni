namespace test
{
    class Program
    {
        public static void Main(string[] args) {
            Dog dog1 = new Dog("Coco", 12, "Schäferhund");
            Console.WriteLine(dog1.Name);
            Console.WriteLine(dog1.Age);
            Console.WriteLine(dog1.Breed);
            dog1.Bark();
        }
    }
}