package Lesson10.abstractfirstexample;

/**
 * Created by user on 16.07.2017.
 */
public abstract class DbProvider {
    private  String dbHost;
  abstract   void  connectToDb();


  abstract   void disconnectFromDb();
void  printDbHost(){
    System.out.println("DB host is"+dbHost);
}
    }


