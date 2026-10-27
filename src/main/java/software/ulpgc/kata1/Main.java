package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Daniela", LocalDate.of(2006, 02, 27));

        System.out.println("Nombre: " + person.getName());
        System.out.println("Fecha de cumpleaños: " + person.getBirthDate());
        System.out.println("Edad: " + person.getAge() +" años");
    }
}
