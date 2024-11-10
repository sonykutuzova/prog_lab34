public class MayBeetle extends Beetle {
    public MayBeetle() {
        super("Майский Жук", Size.MEDIUM);
    }

    public void bringThumbelina(Thumbelina thumbelina, Location location) {
        System.out.println("Майский Жук переносит Дюймовочку на локацию " + location);
        thumbelina.moveTo(location);

    }
    public void agreeWithOthers() {
        System.out.println(name + " соглашается: \"И правда, что-то в ней не так!\"");
        System.out.println("Состояние Майского Жука: Теперь он считает её недостаточно красивой.");
    }

    public void interactWith(Thumbelina thumbelina) throws TooUglyException {
        int f = 1;
        Thumbelina thumberlina = thumbelina;
        System.out.println("Майский Жук смотрит на " + thumberlina);
        System.out.println("Состояние Майского Жука: Он замечает её особенности.");
        if (f == 0) {
            throw new TooUglyException("Дюймовочка слишком некрасивое создание!");
        }

    }
}
