//Author: Shinta Nurkaafi
package sdk4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SdK4 {
    public static void main(String[] args) {
        String filename;
        do{
            System.out.print("Location of file: ");
            Scanner filenameScan = new Scanner(System.in);
            filename = filenameScan.nextLine();
            try{
                //scan file
                File file = new File(filename);
                Scanner fileScan = new Scanner(file);

                //search and print
                while(fileScan.hasNextLine())
                    System.out.println(fileScan.nextLine());
                break;
            }catch(FileNotFoundException e){
                System.out.println("File tidak ditemukan!");
                filename ="";
            }
        }while (filename.isEmpty());
    }
}
