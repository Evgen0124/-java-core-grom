package Lesson9;

import Lesson9.utils.Checker;

/**
 * Created by user on 06.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println( company.countryFounded);
        System.out.println(company.name);
        company.name = "IBM";

        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.name));
        System.out.println(checker.companyNameValitatedCount);
    }
}
