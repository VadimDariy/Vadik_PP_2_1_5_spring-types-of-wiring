package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}

/*  Класс "KoscheiTheDeathless" помечен аннотацией "@Component", что делает его компонентом в контейнере "Spring".
    При использовании аннотации "@Autowired" над сеттором "setOcean(Ocean1 ocean)", "Spring" автоматически создаёт
    экземпляр класса KoscheiTheDeathless содержащий в себе строку:

    "на океане остров, на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

    Далее через сеттор "setOcean(Ocean1 ocean)" инициализируем переменную "ocean":

    private Ocean1 ocean = "на океане остров, на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

    Далее метод "String getRulesByDeth()" объекта "KoscheiTheDeathless" конкатенирует результат "ocean.toString()" с
    собственной строкой "На свете есть океан , ". В итоге строка в классе "KoscheiTheDeathless" принимает следующий вид:

   "На свете есть океан, на океане остров, на острове дерево, на дереве заяц, в зайце утка, в утке яйцо,
                                               в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление использует Spring для вывода полной строки в консоль, в классе Application.
            */
