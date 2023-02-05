package HW_2;

import java.util.Scanner;

public class AddAnimal {
    public static void addCat(Scanner input){
        String nickname;
        String breed;
        String vaccinations;
        String coat_color;
        String birthday;
        int height;
        int weight;
        String eye_color;
        String wool;

        System.out.print("Имя: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccinations = input.next();
        System.out.print("Введите цвет: ");
        coat_color = input.next();
        System.out.print("Дата рождения: ");
        birthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.animals.add(new Cat(height, weight, eye_color, nickname, breed, vaccinations, coat_color, birthday, wool));
    }

    public static void addDog(Scanner input){
        String nickname;
        String breed;
        String vaccination;
        String coat_color;
        String birthday;
        int height;
        int weight;
        String eye_color;
        String training;

        System.out.print("Имя: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccination = input.next();
        System.out.print("Введите цвет: ");
        coat_color = input.next();
        System.out.print("Дата рождения: ");
        birthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        Zoo.animals.add(new Dog(height, weight, eye_color, nickname, breed, vaccination, coat_color, birthday, training));
    }

    public static void addTiger(Scanner input){
        int height;
        int weight;
        String eye_color;
        String habitat;
        String date_of_location;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        date_of_location = input.next();

        Zoo.animals.add(new Tiger(height, weight, eye_color, habitat, date_of_location));
    }

    public static void addWolf(Scanner input){
        int height;
        int weight;
        String eye_color;
        String habitat;
        String date_of_location;
        String leader;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        date_of_location = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        Zoo.animals.add(new Wolf(height, weight, eye_color, habitat, date_of_location, leader));
    }

    public static void addHen(Scanner input){
        int height;
        int weight;
        String eye_color;
        int flying_height;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Высота полета: ");
        flying_height = input.nextInt();

        Zoo.animals.add(new Hen(height, weight, eye_color, flying_height));
    }

    public static void addStork(Scanner input){
        int height;
        int weight;
        String eye_color;
        int flying_height;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eye_color = input.next();
        System.out.print("Высота полета: ");
        flying_height = input.nextInt();

        Zoo.animals.add(new Stork(height, weight, eye_color, flying_height));
    }
}
