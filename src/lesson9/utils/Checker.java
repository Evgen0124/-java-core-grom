package lesson9.utils;

/**
 * Created by user on 07.07.2017.
 */
public class Checker {
public  int companyNameValitatedCount = 0;

public     boolean checkCompanyName(String companyName){
    if (companyNameValitatedCount > 10)
        return false;
         companyNameValitatedCount++;
        return  companyName != "Google" && companyName != "Amazone";
    }
}
