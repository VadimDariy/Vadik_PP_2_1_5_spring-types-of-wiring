package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}

/*  class Island2 - это обычный Java-класс, внутри которого есть конструктор параметры которого автоматически принимают
                    зависимость объекта типа "Wood3 wood" из конфигурационного класса "AppConfig". Внутри
                    которого, метод Island2 getIsland(Wood3 wood) помечен аннотацией "@Bean". Далее этот метод внутри
                    себя создаёт биновый экземпляр класса "Island2", являющийся зависимостью для конструктора
                    "Island2(Wood3 wood)" из класса "Island2". Соответственно конструктор "Island2(Wood3 wood)" ожидает
                    когда "Spring" найдет для своего бинового объекта "new Island2(wood)" соответствующий конструктор,
                    который соответствует по типу данных внедряемой зависимости "wood". Причем отсутствие
                    над классом аннотации "@Component" не имеет ни какого влияние на процесс внедрения объекта в
                    конструктор "Island2(Wood3 wood)" класса "Island2". При внедрении зависимости подобным способом
                    имеет значение, только только соответствие типов данных и все.
                    После внедрения зависимости, конструктор инициализирует переменную "private Wood3 wood;", полученным
                    значением из класса "Wood3":

    private Wood3 wood =
                    ", на дереве заяц, в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

    Далее метод "toString()" объекта "Island2" конкатенирует результат "wood.toString()" с собственной строкой
    ", на острове дерево". В итоге строка в классе "Island2" принимает следующий вид:

 ", на острове дерево, на дереве заяц, в зайце утка, в утке яйцо, в яйце иголка, смерть Кощея на игле :( Прощай Кощей!".

   Это строковое представление будет использовано Spring для внедрения в компонент класса Ocean1 на основе
   конфигурационного класса с аннотацией @Bean. Аннотация @Bean в конфигурационном классе определяет, какие методы будут
   использоваться для создания и настройки бинов, даже для классов, которые сами не имеют аннотации о принадлежности к
   контейнеру Spring.


    */