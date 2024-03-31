import java.util.*;
//  Класс для подчета количества фруктов
public class Counter implements Function {
    // Внутренний метод переводо массива строк в ArrayList
    private ArrayList<String> arrlist_fruits (String[] line_arr) {
        ArrayList<String> fruits = new ArrayList<>();
        for (int i = 0; i < line_arr.length; i++) {
            if (!line_arr[i].isEmpty()){
                fruits.add(line_arr[i]);
            }
        }
        return fruits;
    }
    // Метод подчета количества фруктов в корзине
    public void count_fruits (String[] line_arr) {
        arrlist_fruits(line_arr);
        ArrayList<String> fruits = new ArrayList<>();
        for (int i = 0; i < line_arr.length; i++) {
            if (!line_arr[i].isEmpty()){
                fruits.add(line_arr[i]);
            }
        }
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            count++;
        }
        System.out.println("Число фруктов в корзине - " + count);
    }
    // Метод подчета макисмального кличества букв в слове, а также вывод самых длинных слов
    public void longer_fruits (String[] line_arr) {
        ArrayList<String> fruits = arrlist_fruits(line_arr);
        int max_let = 0;
        for (int i = 0; i <fruits.size(); i++) {
            int count_let = 0;
            for (int j = 0; j < fruits.get(i).length(); j++) {
                count_let++;
            }
            if (count_let > max_let) {
                max_let = count_let;
            }
        }
        System.out.println("---------------------------------\n");
        System.out.println("Максимальное число букв в словах фруктов: " + max_let);
        System.out.println("Список фруктов с самым длинным названием:");
        Set<String> list_fruits = new HashSet<>();
        for (int i = 0; i <fruits.size(); i++) {
            if (fruits.get(i).length() == max_let){
                list_fruits.add(fruits.get(i));
            }
        }
        for (String i : list_fruits)
            System.out.println(i + " - " + max_let);
    }
    // Метод подчета количества фруктов в корзине по названию фруктов
    public void count_list_fruits (String[] line_arr) {
        ArrayList<String> fruits = arrlist_fruits(line_arr);
        Map<String, Integer> sum_fruits = new HashMap<>();
        for (int i = 0; i <fruits.size(); i++) {

            if(!sum_fruits.containsKey(fruits.get(i))){
                sum_fruits.put(fruits.get(i), 1);
            } else{
                sum_fruits.put(fruits.get(i), sum_fruits.get(fruits.get(i)) + 1);
            }
        }
        System.out.println("---------------------------------\n");
        System.out.println("Список фруктов в корзине с указанием количества:");
        for (String key : sum_fruits.keySet()) {
            System.out.println(key + " - " + sum_fruits.get(key) + " штук.");
        }
    }
}
