package org.writer.util;

import com.github.javafaker.Faker;
import org.writer.model.Months;
import org.writer.model.Person;
import org.writer.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Генератор случайных данных
 * для сущностей Person и Student
 *
 * @author Sidorin Aleksei
 * @version 1.0
 * @since 16.10.2025
 */
public class GeneratorFakeData {

    private static final Faker faker = new Faker(new Locale("ru"));

    private static final Random random = new Random();

    /**
     * Генерирует список объектов Person со случайными данными
     *
     * @param count количество генерируемых объектов
     * @return список объектов Person со случайными данными
     * @throws IllegalArgumentException если count меньше или равен 0
     */
    public static List<Person> generatePersons(int count) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            persons.add(generatePerson());
        }
        return persons;
    }

    private static Person generatePerson() {
        return Person.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .dayOfBirth(faker.number().numberBetween(1, 28))
                .monthOfBirth(Months.values()[faker.number().numberBetween(0, Months.values().length - 1)])
                .yearOfBirth(faker.number().numberBetween(1950, 2005))
                .build();
    }

    /**
     * Генерирует список объектов Student со случайными данными
     *
     * @param count количество генерируемых объектов
     * @return список объектов Student со случайными данными
     * @throws IllegalArgumentException если count меньше или равен 0
     */
    public static List<Student> generateStudents(int count) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            students.add(generateStudent());
        }
        return students;
    }

    private static Student generateStudent() {
        return Student.builder()
                .name(faker.name().firstName() + " " + faker.name().lastName())
                .score(generateScores())
                .build();
    }

    /**
     * Генерирует список случайных баллов в диапазоне от 0 до 100
     *
     * @return список строк, содержащих числовые баллы от 0 до 100
     */
    private static List<String> generateScores() {
        List<String> scores = new ArrayList<>();

        int count = 1 + random.nextInt(10);

        for (int i = 0; i < count; i++) {
            int score = random.nextInt(101); // 0-100
            scores.add(String.valueOf(score));
        }

        return scores;
    }

}
