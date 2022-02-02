package donggoi;

public class Main extends person {
    public static void main(String[] args) {
        
        person p = new person();
        p.setHoTen("hoang", "snape");
        System.out.println(p.getFullName());
        chuvi(5);
    }

    public static void chuvi(int a) {
        int cv = 4 * a;
        System.out.println(cv);
        return;
    }
}
