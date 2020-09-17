package Part2;

import java.text.NumberFormat;

public class SalaryTable {

    public static void main(String[] args) {
        int salary = 40000;
        int raise;
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        //print column headings
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%20s", "RAISE");
        System.out.format("%20s\n", "NEW SALARY");

        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%20s", "=====");
        System.out.format("%20s\n", "==========");

        for (int year = 1; year <= 10; year += 1) {
            if (year == 1) {
                System.out.format("%5d", year);
                System.out.format("%20s", "-------");
                System.out.format("%20s", nf.format(salary));
                System.out.format("%20s\n", nf.format(salary));
            } else {
                System.out.format("%5d", year);
                System.out.format("%20s", nf.format(salary));
                raise = (int) (0.03 * salary); //have to cast to integer
                System.out.format("%20s", nf.format(raise));
                salary = salary + raise;
                System.out.format("%20s\n", nf.format(salary));
            }

        }

    }
}
