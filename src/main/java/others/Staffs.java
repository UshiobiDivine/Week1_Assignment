package others;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//an abstract Staff class
abstract class Staffs {
    private String name;
    private int id = 0;

    public Staffs(String name) {
        this.name = name;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
