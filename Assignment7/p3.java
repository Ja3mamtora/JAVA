import java.util.ArrayList;

public class p3 {
    static boolean check(loan x) {
        if (x.getAge() >= 21 && x.getAge() <= 60 && x.getIncome() >= 15000 && x.getExperience() >= 1
                && x.getCitizen().equals("Indian"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ArrayList<loan> a = new ArrayList<loan>(5);

        a.add(new loan(21, 18000, 2, "Indian"));
        a.add(new loan(12, 14000, 2, "Indian"));
        a.add(new loan(21, 18000, 0, "Indian"));
        a.add(new loan(21, 18000, 2, "American"));
        a.add(new loan(21, 8000, 2, "Indian"));
        for (loan l : a) {
            System.out.println(check(l));
        }
    }

}