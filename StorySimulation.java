public class StorySimulation {
    public static void main(String[] args) throws TooUglyException {
        Thumbelina thumbelina = new Thumbelina();
        MayBeetle mayBeetle = new MayBeetle();
        Plants daisy = new Plants("ромашка");
        Plants tree = new Plants("дерево");
        Location treeloc = new Location("", tree);
        Location daisyloc = new Location("", daisy);

        // Майский жук приносит Дюймовочку на дерево
        mayBeetle.bringThumbelina(thumbelina, treeloc);


        // Описание Дюймовочки
        System.out.println(thumbelina.describe());
        System.out.println(mayBeetle.describe());

        // Жуки комментируют
        Beetle beetle1 = new Beetle("Жук 1", Size.SMALL);
        Beetle beetle2 = new Beetle("Жук 2", Size.SMALL);

        beetle1.comment(1);
        beetle2.comment(2);

        mayBeetle.interactWith(thumbelina);


        // Майский жук соглашается с ними
        mayBeetle.agreeWithOthers();

        // Майский жук сажает Дюймовочку на ромашку
        mayBeetle.bringThumbelina(thumbelina, daisyloc);


        // Дюймовочка грустит
        thumbelina.feelUgly();

    }
}
