package donggoi;

public class person {
    private String name;
    private String surname;

    public void setHoTen(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return this.surname + " " + this.name;
    }

}



