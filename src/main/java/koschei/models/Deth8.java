package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 { // Смерть
    @Override
    public String toString () {
        return "Прощай Кощей!";
    }
}

/*  Класс "Death8" помечен аннотацией "@Component", поэтому "Spring" будет интерпритировать этот класс как компонент,
    контейнера приложения Spring, в котором автоматически будет создавать объекты этого класса и управлять ими. Так
    например в даном классе Spring делает следующее:
     1. После того как мы явно переопределили метод "toString()", в теле которого создали строку "Прощай Кощей!" и
        сказали методу "toString()" "return"(возврати эту строку).
     2. Spring создаёт экземпляр этого класса в виде строкого представления, который содержит в себе строку "Прощай Кощей!"
        и использует его как зависимость, для внедрения в класс "Needle7".
     */