class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x,y,xSpeed,ySpeed);
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return super.toString() + ",radius=" + radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
