package ru.suleymanovtat;

class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forgot to check the number of cats
        this.name = name;
        this.age = age;
        counter += 1;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}

class CatMain {

    public static void main(String[] args) {
        new Cat("1", 1);
        new Cat("1", 1);
        new Cat("1", 1);
        new Cat("1", 1);
        new Cat("1", 1);
        new Cat("1", 1);
        new Cat("1", 1);
        System.out.println(Cat.getNumberOfCats());
    }
}
