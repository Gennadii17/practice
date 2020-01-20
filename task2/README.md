# Java: Задача 2

Вторая задача заключается в том, чтобы ты научился создавать собственные классы и оперировать их свойствами.

# Условие

По условию мы имеем интерфейс Car.java который описывает такие методы как:

- go
- stop
- isMoving
- getPower

Их расшифровку и предназначение найдёшь в самом интерфейсе.

# Требования

1. Написать два или больше классов который будет реализовывать интерфейс Calculator

```java

public class MyCar1 implements Car {
   ...
}

public class MyCar2 implements Car {
   ...
}

public class MyCar3 implements Car {
   ...
}

```

Прошу тебя постараться вспомнить о свойствах (переменных) класса.

```java

public class Example {
   public int a = 5;
   public String test = "abc";
}

```


- По умолчанию, любой автомобиль стоит на месте, а это значит если я сделаю вот так:

```java

MyCar1 myCar = new MyCar1();

System.out.print(myCar.isMoving())

```
   То в консоли должен получить ответ false

- С помощью методов go() и stop() заставить машину двигаться:

```java

MyCar1 myCar = new MyCar1();

myCar.go();

System.out.print(myCar.isMoving()) // true

myCar.stop();

System.out.print(myCar.isMoving()) // false

```

- Реализовать метод getPower() чтобы он вернул число - мощность машины:

```java

MyCar1 myCar = new MyCar1();

System.out.print(myCar.getPower()) // 5

```

- Переопределить метод toString() который вернет имя машины:

```java

MyCar1 myCar = new MyCar1();

System.out.print(myCar) или System.out.print(myCar.toString()) // MyCar1

```


2. Продемонстрировать работу приложения с помощью 

```java

System.out.print()

```

3. В демонстрацию включить такие примеры:

- Названия машин
- Мощность
- Демонстрация алгоритма остановки/движения автомобиля

Прошу для более красивого и понятного вывода данных в консоль использовать конкатенацию строк.

Конкатенация строк это их склеивание, соединение.

"Hello " + "world";

```java

MyCar1 myCar = new MyCar1();

System.out.print("Мощность " + myCar.toString() + " : " + myCar.getPower() + " л.с.") // Мощность MyCar1 : 5 л.с.

```
