import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  /*Задача 1
Создайте класс Person, которому при создании передавайте имя и дату рождения в виде строки в
формате "ДД.ММ.ГГГГ".
Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".

Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
Но можно сравнивать даты рождения!
Альтернативная подсказка: если очень хочется вычислять возраст, то можно это делать
в миллисекундах с использованием getTime()!*/

  public static void main(String[] args) throws ParseException {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Igor", "10.01.1989"));
    persons.add(new Person("Oleg", "08.11.2002"));
    persons.add(new Person("Oksana", "12.12.2012"));
    persons.add(new Person("Elena", "01.05.1976"));

    persons.forEach(System.out::println);
    System.out.println();

    Collections.sort(persons);
    for (Person p : persons) {
      System.out.println(p);
    }

  }
}