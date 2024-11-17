package JavaBasic.EX19;

public class score {
    private int idSubject;
    private String nameSubject;
    private double studyScore;
    public score(int idSubject, String nameSubject, double studyScore){
        super();
        this.nameSubject = nameSubject;
        this.studyScore = studyScore;
        this.idSubject = idSubject;
    }


    public String getNameSubject() {
        return nameSubject;
    }

    public double getStudyScore() {
        return studyScore;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setStudyScore(double studyScore) {
        this.studyScore = studyScore;
    }
    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;

    }
    @Override
    public String toString() {
        return "Information{" +
                "Name_Subject='" + nameSubject + '\'' +
                ", ID_Subject=" + idSubject +
                ", Score=" + studyScore +
                '}';


    }
}
