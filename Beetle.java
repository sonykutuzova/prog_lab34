import java.util.List;
import java.util.Random;


public class Beetle extends Insect {
    private static final List<String> femaleBeetleComments = List.of(
            "Какая у нее тонкая талия! Фи! Она совсем как человек! Как некрасиво!", "Она выглядит просто ужасно"
    );

    public Beetle(String name, Size size) {
        super(name, size);
    }

    @Override
    public void interactWith(Describable target) throws TooUglyException {

    }

    public void comment(int beetleNumber) {
        int randomInt = Math.random() < 0.5 ? 0 : 1;
        String comment = femaleBeetleComments.get(randomInt); // Берем единственную фразу
        System.out.println("Жук женщина" + beetleNumber + " говорит: \"" + comment + "\"");
        System.out.println("Состояние Жука женщины" + beetleNumber + ": Неодобрительное мнение о Дюймовочке");
    }
}
