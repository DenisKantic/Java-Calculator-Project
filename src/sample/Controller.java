package sample;

import javafx.scene.control.Label;

public class Controller {

        public Label mainLabel;
        public Label history;

// METHODS FOR PRINTING NUMBERS ON DISPLAY ( mainLabel ) WHEN USER CLICKS ON BUTTON, IT WILL APPEAR IN DISPLAY
        public void zero(){
            mainLabel.setText(mainLabel.getText()+"0");
        }

        public void one(){

            mainLabel.setText(mainLabel.getText()+"1");
        }
    public void two(){
        mainLabel.setText(mainLabel.getText()+"2");
    }
    public void three(){
        mainLabel.setText(mainLabel.getText()+"3");
    }
    public void four(){
        mainLabel.setText(mainLabel.getText()+"4");
    }
    public void five(){
        mainLabel.setText(mainLabel.getText()+"5");
    }
    public void six(){
        mainLabel.setText(mainLabel.getText()+"6");
    }
    public void seven(){
        mainLabel.setText(mainLabel.getText()+"7");
    }
    public void eight(){
        mainLabel.setText(mainLabel.getText()+"8");
    }
    public void nine(){
        mainLabel.setText(mainLabel.getText()+"9");
    }
//////////////////////////////////////////////////////////////////////////

    //METHODS FOR MATH OPERATION

    public void divide(){

    }

    public void multiply(){

    }

    public void minus(){

    }

    public void plus(){

    }

    public void percentage(){

    }

    public void equal(){

    }




    //METHOD FOR DELLETING ALL INPUT AND HISTORY LABEL
    public void AC(){

            mainLabel.setText("");
            history.setText("");
    }


}
