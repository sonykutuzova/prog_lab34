public abstract class Insect implements Movable, Describable {
    protected String name;
    protected Size size;
    protected Location location;

    public Insect(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public abstract void interactWith(Describable target) throws TooUglyException;

    @Override
    public void moveTo(Location position) {
        this.location = location;
        System.out.println(name + " переместился в " + location);
    }

    @Override
    public String describe() {
        return name + ", размер: " + size;
    }
}
