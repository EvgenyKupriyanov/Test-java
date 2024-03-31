
public class Main {
    public static void main(String[] args) {
        try {
            Reader line = new Reader();
            String[] line_arr = line.list("C:\\\\Users\\\\geny_\\\\OneDrive\\\\Рабочий стол\\\\Обучение\\\\Промежуточная контрольная\\\\Java\\\\Test_java\\\\src\\\\input.txt");
            Counter count_fruits = new Counter();
            count_fruits.count_fruits(line_arr);
            count_fruits.longer_fruits(line_arr);
            count_fruits.count_list_fruits(line_arr);
        } catch (NullPointerException e) {
            System.out.println("Файл пустой");
        }
    }
}