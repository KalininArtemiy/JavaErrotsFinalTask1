package FinalyTask;

public class ExcData extends Exception{
    public ExcData() {
    }
     public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("It`s not correct format: %s", i);
        System.out.println();
    }
}
