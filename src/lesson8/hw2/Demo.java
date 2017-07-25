package lesson8.hw2;

/**
 * Created by user on 04.07.2017.
 */
public class Demo {
    public Student createHighestParent(){
        Student createHignest = new Student("Evgen","Dyndar",4,new Course[1]);
        return createHignest;
    }
    public SpecialStudent createLowestChild(){
        SpecialStudent createLowest = new SpecialStudent("Evgen","Dyndar",25,new Course[9],25,"dyndar1@ukr.net");
        return createLowest;

    }
}
