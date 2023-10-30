package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 { // Дерево

    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}

/*   Класс "Wood3" помечен аннотацией "@Component", что делает его компонентом в контейнере "Spring".
     При использовании аннотации "@Autowired" над конструктором Wood3(Rabbit4 rabbit), "Spring" автоматически создаёт
     экземпляр класса Wood3, конструктор которого принимает у себя в параметрах экземпляр класса "Rabbit4", содержащий в
     себе строку:", в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!" и инициализирует
     переменную "rabbit":

     private final Rabbit4 rabbit = ", в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

    Далее метод "toString()" объекта "Wood3" конкатенирует результат "Rabbit4.toString()" с собственной строкой
    ", на дереве заяц ". В итоге строка в классе "Wood3" принимает следующий вид:

   ", на дереве заяц, в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление использует Spring для внедрения в компонент, класса Island2.
            */
