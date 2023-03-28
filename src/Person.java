public class Person {
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
