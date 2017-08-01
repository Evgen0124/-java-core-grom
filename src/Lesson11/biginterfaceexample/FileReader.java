package Lesson11.biginterfaceexample;

/**
 * Created by user on 02.08.2017.
 */
public class FileReader implements  Readable {
    @Override
    public void readFilesFromStorage(Storage storage) {
        printFile(findMaxSizeFile(storage.getFiles()));

    }
    private File  findMaxSizeFile(File[] files){
        File MaxSizeFile = files[0];
        for (File file : files){
            if (file.getSize() > MaxSizeFile.getSize()) {
            }    MaxSizeFile = file;
        }
        return MaxSizeFile;
    }
private void printFile(File file){
    System.out.println(file.getName());
    System.out.println(file.getPath());
    System.out.println(file.getExtension());
    System.out.println(file.getSize());
}
}
