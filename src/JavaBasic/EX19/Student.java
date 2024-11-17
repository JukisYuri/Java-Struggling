package JavaBasic.EX19;

import java.util.Arrays;

public class Student {
    protected String fullName;
    protected int id;
    protected String DMY;
    protected score[] scores;
    public Student(String fullName, int id, String DMY, score[] scores) {
        this.fullName = fullName;
        this.id = id;
        this.DMY = DMY;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDMY() {
        return DMY;
    }

    public score[] getScores() {
        return scores;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDMY(String DMY) {
        this.DMY = DMY;
    }

    public void setScores(score[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", DMY='" + DMY + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';

    }
    public String findNameStudent(String nameSts){
        return nameSts.equals(fullName) ? "Tìm thấy sinh viên đó"
                : "Không tìm thấy sinh viên đó";
}
    public double avgScore(){
        if(scores == null || scores.length == 0){
            return 0;
        }
        double totalScore = 0.0;
        double numberOfScores = scores.length;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i].getStudyScore();
        }
        return totalScore/scores.length;
    }
    public void displayScore(){
        System.out.println("Danh sách điểm: ");
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] != null){
                System.out.println("Score:" + (i+1) + ":");
                System.out.println(scores[i] + ",");
            }
        }
    }
    public double getMaxScore() {
        double maxScoreValue = Double.MIN_VALUE;
        for (score score : scores) {
            if (score.getStudyScore() > maxScoreValue) {
                maxScoreValue = score.getStudyScore();
            }
        }
        return maxScoreValue;
    }
}

