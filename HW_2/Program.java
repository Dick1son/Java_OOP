package HW_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Zoo animals = new Zoo();
        Scanner input = new Scanner(System.in);
        showMenu(animals, input);
        input.close();

    }

    private static void showMenu(Zoo animals, Scanner input) {
        System.out.println("\n1. Добавить животное в зоопарк");
        System.out.println("2. Удалить животное из зоопарка");
        System.out.println("3. Просмотреть информацию о конкретном животном");
        System.out.println("4. Заставить конкретное животное издать звук");
        System.out.println("5. Просмотреть информацию о всех животных в зоопарке");
        System.out.println("6. Заставить все животные в зоопарке издать звук");
        System.out.println("7. Выйти");
        System.out.print("Выберите пункт меню: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addAnimal(animals, input);
                showMenu(animals, input);
            case 2:
                removeAnimal(animals, input);
                showMenu(animals, input);
            case 3:
                infoAnimal(animals, input);
                showMenu(animals, input);
            case 4:
                sayAnimal(animals, input);
                showMenu(animals, input);
            case 5:
                showAll();
                showMenu(animals, input);
            case 6:
                sayAllAnimals();
                showMenu(animals, input);
            case 7:
                System.exit(choice);
        }

    }

    private static void showAll(){
        int i = 1;
        for (Animal obj : Zoo.animals) {
            System.out.printf("%d) ", i);
            System.out.println(obj.getInfo());
            System.out.println("----");
            i++;
        }
    }

    private static void addAnimal(Zoo animals, Scanner input) {
        System.out.println("\n1. Добавить кота\n2. Добавить собаку\n3. Добавить тигра\n4. Добавить волка\n5. Добавить курицу\n6. Добавить аиста\n7. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                AddAnimal.addCat(input);
                showMenu(animals, input);
            case 2:
                AddAnimal.addDog(input);
                showMenu(animals, input);
            case 3:
                AddAnimal.addTiger(input);
                showMenu(animals, input);
            case 4:
                AddAnimal.addWolf(input);
                showMenu(animals, input);
            case 5:
                AddAnimal.addHen(input);
                showMenu(animals, input);
            case 6:
                AddAnimal.addStork(input);
                showMenu(animals, input);
            case 7:
                showMenu(animals, input);
        }
    }

    private static void sayAnimal(Zoo animal, Scanner input) {
        showAll();
        System.out.print("Введите цифру, кто должен произнести звук: ");
        int choice = input.nextInt();
        System.out.println(Sound.noice(Zoo.animals.get(choice - 1))); 
    }

    private static void removeAnimal(Zoo animal, Scanner input) {
        showAll();
        System.out.print("Введите цифру, кто должен покинуть зоопарк: ");
        int choice = input.nextInt();
        Zoo.animals.remove(choice - 1);
    }

    private static void infoAnimal(Zoo animal, Scanner input) {
        showAll();
        System.out.print("Введите цифру, о ком нужно вывести информацию: ");
        int choice = input.nextInt();
        Animal choiceAnimal = Zoo.animals.get(choice - 1);
        System.out.println(choiceAnimal.getInfo());

        if (choiceAnimal instanceof Hen) {
            System.out.print("Курица хочет полетать, разрешить?(y/n): ");
            String answer =  input.next().toLowerCase();
            if ("y".equals(answer)) {
                ((Hen)choiceAnimal).fly();
            }else System.out.println("Курица расстроилась.");
        }

        if (choiceAnimal instanceof Stork) {
            System.out.print("Аист хочет полетать, разрешить?(y/n): ");
            String answer =  input.next().toLowerCase();
            if ("y".equals(answer)) {
                ((Stork)choiceAnimal).fly();
            }else System.out.println("Аист расстроился.");
        }

        if (choiceAnimal instanceof Cat) {
            System.out.print("Хотите погладить кошку?(y/n): ");
            String answer =  input.next().toLowerCase();
            if ("y".equals(answer)) {
                ((Cat)choiceAnimal).showAffection();
            }else System.out.println("Кошка расстроилась.");
        }

        if (choiceAnimal instanceof Dog) {
            System.out.println("1. Погладить собаку\n2. Дрессировать собаку\n3. Назад");
            System.out.print("Выберите пункт меню: ");
            int answer =  input.nextInt();

            switch (answer) {
                case 1:
                    ((Dog)choiceAnimal).showAffection();
                    showMenu(animal, input);
                case 2:
                    ((Dog)choiceAnimal).setTraining();;
                    showMenu(animal, input);
                default:
                    showMenu(animal, input);
            }
        }
    }

    private static void sayAllAnimals(){
        for (Animal obj : Zoo.animals) {
            System.out.println(Sound.noice(obj));
            System.out.println("----");
        }
    }
}

