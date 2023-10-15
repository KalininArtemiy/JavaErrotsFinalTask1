package FinalyTask;
import java.util.Scanner;
public class InputData {
    public String[] NewData(){
        Scanner newScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = newScanner.nextLine();
            String[] enteredData = data.split(" ");
            if (enteredData.length == 6) {
                return enteredData;
            } else if (enteredData.length < 6){
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }
   }
}
