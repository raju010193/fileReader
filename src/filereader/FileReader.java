/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import readExel.FileProperties;
import readExel.ReadExelSheet;
import readExel.output;

/**
 *
 * @author sidhu munagala
 */
public class FileReader {

    static String lastUploadFileDateTime;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {


        // TODO code application logic here

     

              for(int index=0;index<5;index++){

                String dirPath = "C:/Users/sidhu munagala/Documents/docs";
                File dir = new File(dirPath);
                File[] files = dir.listFiles();
                if (files == null || files.length == 0) {
                    System.out.println("it is empty");
                }
                System.out.println(System.getProperty("user.dir"));
                File lastModifiedFile = files[0];
                for (int i = 1; i < files.length; i++) {
                   
                  
                    if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                        
                        lastModifiedFile = files[i];
                    }
                }
                
                if(lastModifiedFile.canWrite()){
                System.out.println("path " + lastModifiedFile.canWrite());
                File file = new File(lastModifiedFile.toString());
                String FileCreatedTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(FileReader.getCreationTime(file).toMillis());

                System.out.println(file + " creation time :"
                        + FileCreatedTime);

                if (!FileCreatedTime.equals(lastUploadFileDateTime)) {
                    lastUploadFileDateTime = FileCreatedTime;
                   boolean isSccess = new ReadExelSheet().readExelData(lastModifiedFile.toString());

                    if (isSccess) {
                        System.out.print("Exel data reading success");
                      //  new output().getoutput(fileData);
                    } else {
                        System.out.print("Exel data reading Failed!!!");
                    }
                }
                }
                else{
                    System.out.println("file have write and read permission aslo so we con't read file");
                }
            }
       
    }

    public static FileTime getCreationTime(File file) throws IOException {
        Path p = Paths.get(file.getAbsolutePath());
        BasicFileAttributes view = Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
        
        FileTime fileTime = view.creationTime();

        return fileTime;
    }
}
