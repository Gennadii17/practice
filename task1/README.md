# Java: Задача 1

Итак, суть первой задачи заключается в том, чтобы ты научился работать с созданием пакетов, созданием классов, переменных, арифметическими, логическими и побитовыми операторами.

# Условие

По условию мы имеем интерфейс Calculator.java который описывает такие методы как:

- add
- modulo
- diff
- divide
- multiply
- increment
- decrement
- isOdd
- isOddBinary

Их расшифровку и предназначение найдёшь в самом интерфейсе.

# Требования

1. Создать свой пакет.

Добиться сторого соблюдения имени

- com, org, edu и т.д.
- Название группы или компании
- Название проекта (task1)

2. Создать точку входа в приложение.

3. Перенести интерфейс Calculator в новый пакет.

4. Написать класс который будет реализовывать интерфейс Calculator

```java

public class MyCalculator implements Calculator {
   ...
}

```

5. Продемонстрировать работу приложения с помощью 

```java

System.out.print();

```

6. В демонстрацию включить использование переменных и операторов с присваиванием 

- +=
- -=
- /=
- *=
- &=
- |=