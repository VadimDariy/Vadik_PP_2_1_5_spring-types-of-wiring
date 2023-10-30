package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 { // Заяц

    @Autowired
    private Duck5 duck;

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}

/*   Класс "Rabbit4" помечен аннотацией "@Component", что делает его компонентом в контейнере "Spring".
     При использовании аннотации "@Autowired" над переменной "private Duck5 duck", "Spring" автоматически создаёт
     экземпляр класса Rabbit4 и конструктор "Rabbit4(Duck5 duck)", который принимает у себя в параметрах экземпляр класса
     "Duck5", содержащий в себе строку:", в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".
     Далее через автоматически созданный конструктор "Rabbit4(Duck5 duck)" из контейнера, "Spring" инициализирует
     переменную "duck":

            private Duck5 duck = ", в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!"

    Далее метод "toString()" объекта "Rabbit4" конкатенирует результат "duck.toString()" с собственной строкой
    ", в зайце утка ". В итоге строка в классе "Rabbit4" принимает следующий вид:

   ", в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление использует Spring для внедрения в компонент, класса Wood3.
            */
