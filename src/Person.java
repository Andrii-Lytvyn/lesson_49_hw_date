import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person implements Comparable<Person> {
    /*Задача 1

Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".

Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
Но можно сравнивать даты рождения!
Альтернативная подсказка: если очень хочется вычислять возраст, то можно это делать
в миллисекундах с использованием getTime()!*/

  public final String name;
  public final String dateOfBirth;

  public Person(String name, String dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public int compareTo(Person o) {
    int sep = dateOfBirth.lastIndexOf('.');
    String year1 = dateOfBirth.substring(sep);
    int sep2 = o.dateOfBirth.lastIndexOf('.');
    String year2 = o.dateOfBirth.substring(sep);

    if (!year1.equals(year2)) {
      return year1.compareTo(year2);
    }
    return Integer.parseInt(dateOfBirth) - Integer.parseInt(o.dateOfBirth);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Person other)) {
      return false;
    }
    return compareTo(other) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateOfBirth);
  }

  @Override
  public String toString() {
    return "Name: " + name + ", date of birthday: " + dateOfBirth;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getName() {
    return name;
  }


}
