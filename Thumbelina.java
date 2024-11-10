public class Thumbelina implements Movable, Describable {
    private String mood;
    private Location location; ;
    private String description;

    public Thumbelina() {
        this.mood = "в хорошем настроении";
        this.description = "прекраснейшее создание, нежная и ясная, точно лепесток розы";
    }

    @Override
    public void moveTo(Location location) {
        this.location = location;
        System.out.println("Состояние: Дюймовочка находится на позиции " + location);
    }
    public String toString() {
        return "Дюймовочку";
    }


    @Override
    public String describe() {
        return "Дюймовочка, " + description;
    }

    public void feelUgly() {
        this.mood = "печальная";
        System.out.println("Состояние: Дюймовочка была " + this.mood + " и принялась плакать, думая, что она такая безобразная.");
    }

    public String getMood() {
        return mood;
    }
}
