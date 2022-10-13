package Controller;

import Model.CalcModel;
import View.CalcView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    private CalcView theView;
    private CalcModel theModel;

    public CalcController(CalcView theView, CalcModel theModel) {

        this.theView = theView;
        this.theModel = theModel;
        theView.addCalcListener(new CalcListener());

    }

    class CalcListener extends Component implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //The controller gets the user data from the view
            int first = 0, second = 0, sol = 0;
            try {
                //The controller gets user data from the view
                first = theView.getFirstNumber();
                second = theView.getSecondNumber();
                //The controller passes the user data to the model to perform operations
                theModel.addTwoNumbers(first, second);

                //The controller gets the resulted data from the model
                sol = theModel.getTheSolution();
                //the controller sends the resulted data to the view
                theView.setTheSolution(sol);
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("Please input ints!");
            }
        }
    }
}


