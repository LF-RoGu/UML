public class Main
{
    public static void main(String[] args)
    {
        boolean petInHouse = true;
        Pets l_classDog = new Pets.Dog("Woof", "wags its tail", petInHouse);
        Pets l_classCat = new Pets.Cat("Miau", "purrs", petInHouse);

        l_classDog.PetSound();
        l_classCat.PetSound();
    }
}