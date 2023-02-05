package HW_2;

import java.util.ArrayList;

public class Zoo {
    protected static ArrayList<Animal> animals = new ArrayList<>();
    {
        animals.add(new Cat(35, 5, "Grey", "Boolba", "Maine coon", "Yes", "Ginger", "29.08.2002", "Yes"));
        animals.add(new Dog(56, 8, "Green", "Julik", "Briard", "No", "Brown", "15.10.2001", "No"));
        animals.add(new Hen(40, 2, "Black", 1));
        animals.add(new Stork(235, 7, "Red", 800));
        animals.add(new Tiger(150, 15, "Purple", "Savannah", "23.07.1876"));
        animals.add(new Wolf(110, 6, "White", "Taiga", "03.05.2005", "No"));
    }    
}
