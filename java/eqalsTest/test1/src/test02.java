import java.util.Objects;

public class test02 {
    public static void main(String[] args) {
        studio st = new studio(111,"asdads");
        studio st2 = new studio (111,"asdads");
        System.out.println(st.equals(st2));
    }
}

class studio{
    int no;
    String school;

    public studio(int no, String school) {
        this.no = no;
        this.school = school;
    }

    public studio() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "studio{" +
                "no=" + no +
                ", school='" + school + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studio studio = (studio) o;
        return no == studio.no && Objects.equals(school, studio.school);
    }
}