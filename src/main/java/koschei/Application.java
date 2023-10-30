package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}

/*
   1. ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
                Эта строка создает контейнер Spring, который управляет компонентами и их зависимостями на основе
                конфигурации, определенной в классе AppConfig.
          AppConfig.class - это выражение выступает в роли параметра конструктора, который синтаксически ожидает
                            экземпляр типа Class, поэтому мы с помощью рефлексии создаём этот экземпляр типа Class,
                            содержащий в себе даннные об конфигурационном классе.

   2. KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
                Эта строка создает экземпляр класса KoscheiTheDeathless, используя контейнер Spring
                (переменную applicationContext) и его метод getBean(), который у себя в парамертах принимает экземпляр
                 класса типа Class, содержащий в себе данные о всей цепочке зависимостей.
                 В результате, koscheiTheDeathless становится
                доступным для использования в приложении.

   3. System.out.println(koscheiTheDeathless.getRulesByDeth());
                В этой строке мы на объекте koscheiTheDeathless вызываем метод из класса KoscheiTheDeathless, который
                содержит в себе полностью сформированную строку о Кощее и выводим её в консоль.

                */
