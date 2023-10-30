package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 { // Утка

    private Egg6 egg;

    @Autowired
    public Duck5(Egg6 egg){
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
/* Класс "Duck5" помечен аннотацией "@Component", что делает его компонентом в контейнере "Spring".
   При использовании аннотации "@Autowired" над конструктором "Duck5(Egg6 egg)". "Spring" автоматически внедряет
   зависимость из класса "Egg6" в конструктор и инициализирует переменную "egg" значением:

   private Egg6 egg = ", в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Метод "toString()" объекта "Duck5" конкатенирует результат "egg.toString()" с собственной строкой ", в утке яйцо "
   В итоге строка строка в классе "Duck5" принимает следующий вид:

   ", в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление использует Spring для внедрения в компонент, класса Rabbit4.
   */