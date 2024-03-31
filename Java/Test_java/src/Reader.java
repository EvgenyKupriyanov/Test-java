import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Метод чтения из файла
public class Reader {

    public String[] list (String FileName) throws NullPointerException{
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            line = reader.readLine().toUpperCase();
            reader.close();
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
        String[] line_arr = line.split(" ");
        return line_arr;
    }





//    try {
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\geny_\\OneDrive\\Рабочий стол\\Обучение\\Промежуточная контрольная\\Java\\Test_java\\src\\input.txt"));
//        line = reader.readLine().toUpperCase();
//            //System.out.println(line);
//        reader.close();
//    } catch (IOException e) {
//        System.out.println("Файл не найден");
//    }
//    } catch (FileNotFoundException ex) {
//        throw new RuntimeException(ex);
//    }
//
//    String[] line_arr = line.split(" ");
}
