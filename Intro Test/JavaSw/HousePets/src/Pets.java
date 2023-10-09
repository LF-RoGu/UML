public abstract class Pets
{
    String l_strSound;
    String l_strBehaviour;
    boolean l_boolInHouse; /* 0 -> Dog in House 1 -> Cat in House */

    public Pets(String l_strSound, String l_strBehaviour, boolean l_boolInHouse) {
        this.l_strSound = l_strSound;
        this.l_strBehaviour = l_strBehaviour;
        this.l_boolInHouse = l_boolInHouse;
    }

    abstract void PetSound();

    static class Dog extends Pets
    {

        public Dog(String l_strSound, String l_strBehaviour, boolean l_boolInHouse) {
            super(l_strSound, l_strBehaviour, l_boolInHouse);
        }

        @Override
        void PetSound()
        {
            if(this.l_boolInHouse)
            {
                System.out.println("Cat is in house");
            }
            else
            {
                System.out.println("Pet... " + getClass().getName());
                System.out.println("Sound... " + this.l_strSound);
                System.out.println("Behaviour... " + this.l_strBehaviour);
            }
        }
    }
    static class Cat extends Pets
    {
        public Cat(String l_strSound, String l_strBehaviour, boolean l_boolInHouse) {
            super(l_strSound, l_strBehaviour, l_boolInHouse);
        }

        @Override
        void PetSound()
        {
            if(!this.l_boolInHouse)
            {
                System.out.println("Dog is in house");
            }
            else
            {
                System.out.println("Pet... " + getClass().getName());
                System.out.println("Sound... " + this.l_strSound);
                System.out.println("Behaviour... " + this.l_strBehaviour);
            }
        }
    }
}
