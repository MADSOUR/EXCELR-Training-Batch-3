public class Demo024 {

    static class Person {
        String name;
        int age;
        String address;

        Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void displayInfo() {
            System.out.println(name + ", " + age + " years old, lives at " + address);
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("Ram", 19, "123 Main St"),
            new Person("Dileep Gandu", 22, "456 Oak St"),
            new Person("Rithvick jako", 25, "789 Pine St")
        };

        for (Person person : people) {
            person.displayInfo();
        }
    }
}
