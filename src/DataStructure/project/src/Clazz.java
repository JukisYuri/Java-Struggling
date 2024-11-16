package DataStructure.project.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Clazz {
    private String name;
    private String year; // 2017, 2018, 2019, ...
    private ArrayList<Student> students = new ArrayList<Student>();

    public Clazz(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void loadStudents(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while(true){
            String line = reader.readLine();
            if(line == null){
                break;
            } else {
                StringTokenizer tokens = new StringTokenizer(line, "\t");
                String id = tokens.nextToken();
                String firstName = tokens.nextToken();
                String lastName = tokens.nextToken();
                LocalDate birthDay = LocalDate.parse(tokens.nextToken());
                double gpa = Double.parseDouble(tokens.nextToken());
                this.students.add(new Student(id, firstName, lastName, birthDay, gpa));
            }
        }
        reader.close();
    }
    // Task 2. sort students according to the given comparator c
    public void sortStudents(Comparator<Student> c) {
        students.sort(c);
    }
    // Task 3. get top n students with highest GPA
    public List<Student> getTopNStudents(int n) {
        ArrayList<Student> listTopNStudents = new ArrayList<>();
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int checkGPA = Double.compare(o2.getGPA(), o1.getGPA());
                if(checkGPA == 0){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return checkGPA;
            }
        });
        for (int i = 0; i < Math.min(n, students.size()); i++) {
            listTopNStudents.add(students.get(i));
        }
        return listTopNStudents;
    }
    // Task 4. get random n students from the list of students
    public ArrayList<Student> getRandomNStudents(int n) {
        ArrayList<Student> listRandomNStudents = new ArrayList<>();
        Collections.shuffle(this.students);
        for (int i = 0; i < Math.min(n, students.size()); i++) {
            listRandomNStudents.add(students.get(i));
        }
        return listRandomNStudents;
    }
    // Task 5. remove a student based on a given id
    public boolean removeStudent(String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                return true;  // Chỉ trả về true khi xóa thành công sinh viên
            }
        }
        return false;
    }
    // Task 6. get all students who were born in a given birth year.
    public ArrayList<Student> getStudentByBirthYear(int birthYear) {
        ArrayList<Student> listStudentGetByBirth = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthday().getYear() == birthYear) {
                listStudentGetByBirth.add(student);
            }
        }
        return listStudentGetByBirth;
    }
    // Task 7. get all students who have birthdays in the current month (i.e., November).
    public ArrayList<Student> getStudentsHavingBirthdaysInCurrentMonth() {
        ArrayList<Student> listStudentsBirthInCurrentMonth = new ArrayList<>();
        for(Student student : students){
            if(student.getBirthday().getMonth() == LocalDate.now().getMonth()){
                listStudentsBirthInCurrentMonth.add(student);
            }
        }
        return listStudentsBirthInCurrentMonth;
    }
    // Task 8. get all students who do not graduate on time (> 4 years from admission year). (ko làm)
    public ArrayList<Student> getLateGraduationStudents() {
        return null;
    }
    // Task 9. get the oldest student based on the birth year.
    public Student getOldestStudent() {
        if (students.isEmpty()) {
            return null;
        } else {
            Student oldestStudent = students.getFirst();
            for (Student student : students){
                if(student.getBirthday().isBefore(oldestStudent.getBirthday())){
                    oldestStudent = student;
                }
            }
            return oldestStudent;
        }
    }
    // Task 10. get the student having the highest GPA based on a given admission year.
    public Student getHighestGPAStudent(int year) {
        if(students.isEmpty()){
            return null;
        } else {
            Student studentWithHighestGpa = students.getFirst();
            for (Student student : students){
                String studentId = student.getId();
                int admissionYear = Integer.parseInt(studentId.substring(0,2)) + 2000; // Chuyển đổi thành năm
                if(student.getGPA() > studentWithHighestGpa.getGPA() && admissionYear == year){
                    studentWithHighestGpa = student;
                }
            }
            return studentWithHighestGpa;
        }
    }
}

