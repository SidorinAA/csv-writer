package org.writer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.writer.annotation.CSVField;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Student {

    @CSVField(name = "Имя", order = 1)
    private String name;

    @CSVField(name = "Баллы", order = 2)
    private List<String> score;
}