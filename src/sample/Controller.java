package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    Main main;
    @FXML
    Label mainscreen,secscreen;
    String s="";
    String display="";
    String nextdigit="";
    public long calculation=0;
    public long temp1,temp2;
    public int operation=0;
    public int use=0;


    public void setMain(Main main){
        this.main=main;
    }
    public void Actionbut1(){
        s=s+"1";
        display=display+"1";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut2(){
        s=s+"2";
        display=display+"2";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut3(){
        s=s+"3";
        display=display+"3";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut4(){
        s=s+"4";
        display=display+"4";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut5(){
        s=s+"5";
        display=display+"5";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut6(){
        s=s+"6";
        display=display+"6";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut7(){
        s=s+"7";
        display=display+"7";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut8(){
        s=s+"8";
        display=display+"8";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut9(){
        s=s+"9";
        display=display+"9";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbut0(){
        s=s+"0";
        display=display+"0";
        mainscreen.setText(s);
        secscreen.setText(display);
    }
    public void Actionbutpos(){
        operationfunction();
        operation=1;
        display=display+"+";
        secscreen.setText(display);
        s="";
        use=1;
    }
    public void Actionbutneg(){
        operationfunction();
        s="";
        display=display+"-";
        secscreen.setText(display);
        operation=2;
        use=1;
    }
    public void Actionbutmul(){
       operationfunction();
        display=display+"*";
        secscreen.setText(display);
        s="";
        operation=3;
        use=1;
    }
    public void Actionbutdiv(){
        operationfunction();
        display=display+"/";
        secscreen.setText(display);
        s="";
        operation=4;
    }
    public void Actionbuteq(){
        if(operation==1){
            temp1=Long.parseLong(s);

                calculation = calculation + temp1;
                s = Long.toString(calculation);
                mainscreen.setText(s);

            calculation=0;
        }
        else if(operation==2){
            temp1=Long.parseLong(s);

            calculation = calculation - temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);

            calculation=0;
        }
        else if(operation==3){
            temp1=Long.parseLong(s);

            calculation = calculation * temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);

            calculation=0;
        }
        s="";
        display="";
        operation=0;
    }

    public void Actionbutclear(){
        s="0";
        mainscreen.setText(s);
        secscreen.setText(s);
        calculation=0;
        s="";
        display="";
        operation=0;

    }
    public void operationfunction(){
        temp1=Long.parseLong(s);

        if(operation==1){
            calculation = calculation + temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);
        }
        else if(operation==2){
            calculation = calculation - temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);
        }
        else if(operation==3){
            calculation = calculation * temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);
        }
        else if(operation==4){
            calculation = calculation * temp1;
            s = Long.toString(calculation);
            mainscreen.setText(s);
        }
        else {
            calculation = temp1;
        }
    }



}
