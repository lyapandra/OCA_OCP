package internet.lambda.vertex;

import java.util.List;

public class Human {
        private final String name;
        private final List<String> pets;

        //constructors, getters

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }
}
