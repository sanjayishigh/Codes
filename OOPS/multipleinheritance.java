public class multipleinheritance {
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.eats();
        b1.behaves();
    }
}

interface Herbivore{
    void eats();
}

interface Carnivore{
    void behaves();
}

class Bear implements Herbivore,Carnivore{
    public void eats(){
        System.out.println("Eats grass");
    }

    public void behaves(){
        System.out.println("Behaves Violently");
    }
} 