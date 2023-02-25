public abstract class Animal {

    protected String name;

    protected int legs;

    protected Animal(){

    }
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("This Animal walks on " + legs + " legs");
    }
    public abstract void eat();

}
