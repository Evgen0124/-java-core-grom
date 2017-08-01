package Lesson11.biginterfaceexample;

/**
 * Created by user on 02.08.2017.
 */
public class SimpleReader implements  Readable {
    @Override
    public void readFilesFromStorage(Storage storage) {
        for (File file: storage.getFiles()) {
            if (file != null)
            System.out.println(file.getName());
            else
                System.out.println(file);
        }
    }
}
