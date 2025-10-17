package org.writer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.writer.annotation.CSVField;

@Data
@Builder
@AllArgsConstructor
public class Person {

    @CSVField(name = "Имя", order = 1)
    private String firstName;

    @CSVField(name = "Фамилия", order = 2)
    private String lastName;

    @CSVField(name = "День рождения", order = 3)
    private int dayOfBirth;

    @CSVField(name = "Месяц рождения", order = 4)
    private Months monthOfBirth;

    @CSVField(name = "Год рождения", order = 5)
    private int yearOfBirth;

}
