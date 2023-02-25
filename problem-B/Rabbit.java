class Cat extends Animal implements Pet{

    public Cat(){
    }
    public Cat(String name) {
        super(4);
        super.name = name;
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public void setName(String name){
        super.name = name;
    }

    @Override
    public void play() {
        System.out.println(super.name+ " is playing");
    }
    @Override
    public void eat(){
        System.out.println(super.name + " is eating");
    }
}
