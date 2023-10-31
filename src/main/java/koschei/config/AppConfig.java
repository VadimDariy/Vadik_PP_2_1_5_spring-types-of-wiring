package koschei.config;

import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public  static Egg6 getEgg(Needle7 needle){
        return new Egg6(needle);
    }
}

/* Класс "AppConfig" помечен аннотацией "@Configuration", это означает, что "Spring" будет его читать как
   конфигурационный класс, в котором есть определённые настройпи:
   1. @ComponentScan(basePackages = "koschei") - Это аннотация говорит "Spring'у", что нужно сканировать все классы
                                                 помеченный аннотацией "@Component", которые находится в базовом пакете
                                                 (basePackages) с именем Кащей ("koschei");
   2. @Bean - возвращает экземпляр объекта в контексте "Spring", которым будет управлять "Spring" как компонентом. И
              внедрять его в классы соответствующие по типу с биновым объектом. Поле деятельности по внедрению бинового
              объекта  зависит только от соответствия типов этого объекта и кода в который будет внедрён этот объект,
              при чем этот код не обязан быть помечен аннотациями типа @Component и др. Это соответствие типов является
              ключевым фактором для успешного внедрения бинов в Spring Framework.В отдельных случаях Spring может
              внедрить биновый объект в любой другой класс при выполнении автоматического приведения типов.
   3. Island2 getIsland(Wood3 wood), где
              - Island2 - тип возвращаемого значения;
              - getIsland - имя метода;
              - Wood3 wood - это объект, который имеет тип данных "Wood3", а "wood" - эта переменная, которая
                             представляет в себе тип данных класса "Wood3"
   4. return new Island2(wood); - эта строка внутри метода "Island2 getIsland(Wood3 wood)" создаёт объект класса
                                  "Island2", и возвращает его в параметры конструктора Island2(Wood3 wood) внутири
                                   класса "Island2".


 */