package DataStructure.project.src;

import java.time.LocalDate;

public class Student {
        private String id;
        private String firstName;
        private String lastName;
        private LocalDate birthday;
        private double GPA;

        public Student(String id, String firstName, String lastName, LocalDate birthday, double GPA) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
            this.GPA = GPA;
        }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", GPA=" + GPA +
                '}';
    }
}
