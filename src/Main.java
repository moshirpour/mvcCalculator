import Controller.CalcController;
import Model.CalcModel;
import View.CalcView;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CalcView theView = new CalcView();
        CalcModel theModel = new CalcModel();
        CalcController theController = new CalcController(theView, theModel);

        theView.setVisible(true);

    }
}