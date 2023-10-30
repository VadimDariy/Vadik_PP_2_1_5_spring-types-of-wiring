package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}

/*   Класс "Ocean1" помечен аннотацией "@Component", что делает его компонентом в контейнере "Spring".
     При использовании аннотации "@Autowired" над переменной "private Island2 island", "Spring" автоматически создаёт
     экземпляр класса Ocean1 и конструктор "Ocean1(Island2 island)", он принимает у себя в параметрах экземпляр класса
     "Island2", содержащий в себе строку:

     ", на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

     Далее через автоматически созданный конструктор "Ocean1(Island2 island)" из контейнера, "Spring" инициализирует
     переменную "island":

     private Island2 island =
     ", на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

    Далее метод "toString()" объекта "Ocean1" конкатенирует результат "island.toString()" с собственной строкой
    "на океане остров ". В итоге строка в классе "Ocean1" принимает следующий вид:

   "на океане остров, на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление использует Spring для внедрения в компонент, класса Wood3. */