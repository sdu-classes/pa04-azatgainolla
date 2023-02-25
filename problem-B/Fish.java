class Fish extends Animal implements Pet{

    public Fish(){
        System.out.println(super.name + "do not have legs");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " is eating");
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void play() {
        System.out.println(super.name + " is playing");
    }
    @Override
    public void walk(){
        System.out.println(super.name + " can not walking");
    }
}
