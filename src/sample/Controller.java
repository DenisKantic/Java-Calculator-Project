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
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //METHODS FOR MATH OPERATION

    public void divide(){
        num=Double.parseDouble(mainLabel.getText());
        calculation=4;
        mainLabel.setText(""); // when we enter a first number and then we click on multiplication, this will clean our first number input
        history.setText(num+"/"); // this will store our cleaned input above so we can type another number
    }

    public void multiply(){
        num=Double.parseDouble(mainLabel.getText());
        calculation=3;
        mainLabel.setText(""); // when we enter a first number and then we click on multiplication, this will clean our first number input
        history.setText(num+"*"); // this will store our cleaned input above so we can type another number
    }

    public void minus(){
        num=Double.parseDouble(mainLabel.getText());
        calculation=2;
        mainLabel.setText(""); // when we enter a first number and then we click on multiplication, this will clean our first number input
        history.setText(num+"-"); // this will store our cleaned input above so we can type another number

    }

    public void plus(){
        num=Double.parseDouble(mainLabel.getText());
        calculation=1;
        mainLabel.setText(""); // when we enter a first number and then we click on multiplication, this will clean our first number input
        history.setText(num+"+"); // this will store our cleaned input above so we can type another number
    }

    public void equal(){

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //METHOD FOR DELLETING ALL INPUT AND HISTORY LABEL

    // DELETE ALL
    public void AC(){

            mainLabel.setText("");
            history.setText("");
    }

    // DELETE ONE BY ONE
    public void delete(){

            int length=mainLabel.getText().length(); // get length of the string
            int number=mainLabel.getText().length()-1; // this -1 means substract 1 from length
        String store;

        if(length>0){

            StringBuilder back=new StringBuilder(mainLabel.getText()); // store the input here
            back.deleteCharAt(number); // deleting with this command
            store=back.toString();  // transform it back to string, we want String input not the math numerical
            mainLabel.setText(store); // now finished string place on display
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    //METHOD FOR ARITHMETIC OPERATION

        double num,ans;
        int calculation;


    public void calculate(){

           switch (calculation){ // above in methods for plus,minus... we will initialize calculation with calculation=1 for example and then
                                // it will do in following case for that number we initialize

               case 1: // adition
                   ans=num+Double.parseDouble(mainLabel.getText()); // convert string into double
                   mainLabel.setText(Double.toString(ans)); // convert back to string
                   break;

               case 2: // substraction
                   ans=num-Double.parseDouble(mainLabel.getText()); // convert string into double
                   mainLabel.setText(Double.toString(ans)); // convert back to string
                   break;

               case 3: // multiplication
                   ans=num*Double.parseDouble(mainLabel.getText()); // convert string into double
               mainLabel.setText(Double.toString(ans)); // convert back to string
               break;

               case 4: // divide
                   ans=num/Double.parseDouble(mainLabel.getText()); // convert string into double
                   mainLabel.setText(Double.toString(ans)); // convert back to string
                   break;
           }
    }

}
