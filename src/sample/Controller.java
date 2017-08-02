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
    public double calculation=0;
    public double temp1,temp2;
    public int operation=0;
    public int use=0;
    public int backvar=0;
    public int statusdecimal=1;


    public void setMain(Main main){
        this.main=main;
    }
    public void Actionbut1(){
        if(s.length()<12) {
            s = s + "1";
            display = display + "1";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut2(){
        if(s.length()<12) {
            s = s + "2";
            display = display + "2";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut3(){
        if(s.length()<12) {
            s = s + "3";
            display = display + "3";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut4(){
        if(s.length()<12) {
            s = s + "4";
            display = display + "4";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut5(){
        if(s.length()<12) {
            s = s + "5";
            display = display + "5";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut6(){
        if(s.length()<12) {
            s = s + "6";
            display = display + "6";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut7(){
        if(s.length()<12) {
            s = s + "7";
            display = display + "7";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut8(){
        if(s.length()<12) {
            s = s + "8";
            display = display + "8";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut9(){
        if(s.length()<12) {
            s = s + "9";
            display = display + "9";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbut0(){
        if(s.length()<12) {
            s = s + "0";
            display = display + "0";
            mainscreen.setText(s);
            secscreen.setText(display);
            backvar=1;
        }
    }
    public void Actionbutpos(){
        operationfunction();
        operation=1;
        display=display+"+";
        secscreen.setText(display);
        s="";
        use=1;
        backvar=0;
        statusdecimal=1;
    }
    public void Actionbutneg(){
        operationfunction();
        s="";
        display=display+"-";
        secscreen.setText(display);
        operation=2;
        use=1;
        backvar=0;
        statusdecimal=1;
    }
    public void Actionbutmul(){
       operationfunction();
        display=display+"*";
        secscreen.setText(display);
        s="";
        operation=3;
        use=1;
        backvar=0;
        statusdecimal=1;
    }
    public void Actionbutdiv(){
        operationfunction();
        display=display+"/";
        secscreen.setText(display);
        s="";
        operation=4;
        backvar=0;
        statusdecimal=1;
    }
    public void Actionbuteq(){
        if(operation==1){
            temp1=Double.parseDouble(s);

            calculation = calculation + temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
                mainscreen.setText(s);

            calculation=0;
        }
        else if(operation==2){
            temp1=Double.parseDouble(s);

            calculation = calculation - temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);

            calculation=0;

        }
        else if(operation==3){
            temp1=Double.parseDouble(s);

            calculation = calculation * temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);

            calculation=0;
        }
        else if(operation==4){
            temp1=Double.parseDouble(s);

            calculation = calculation / temp1;

            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }

            if(s.length()>12){
                s=s.substring(0,13);
            }

            mainscreen.setText(s);

            calculation=0;
        }
        s="";
        display="";
        operation=0;
        backvar=0;
        statusdecimal=1;
    }

    public void Actionbutclear(){
        s="0";
        mainscreen.setText(s);
        secscreen.setText(s);
        calculation=0;
        s="";
        display="";
        operation=0;
        backvar=0;
        statusdecimal=1;

    }
    public void Actiondecimal(){
        if(statusdecimal==1){
            s = s + ".";
            display = display + ".";
            statusdecimal=0;
        }
        mainscreen.setText(s);
        secscreen.setText(display);


    }
    public void Actionbackspace(){
        if(backvar==1){
            if(s.length()>1){
                int j=s.length();
                s=s.substring(0,j-1);
                display=display.substring(0,display.length()-1);
            }
            else if(s.length()==1){
                s="0";
                display=display.substring(0,display.length()-1);
            }
            mainscreen.setText(s);
            secscreen.setText(display);

            if(s=="0"){
                s="";
            }
            if(s.indexOf('.')<0){
                statusdecimal=1;
            }
        }
    }
    public void operationfunction(){
        temp1=Double.parseDouble(s);

        if(operation==1){
            calculation = calculation + temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);
        }
        else if(operation==2){
            calculation = calculation - temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);
        }
        else if(operation==3){
            calculation = calculation * temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);
        }
        else if(operation==4){
            calculation = calculation / temp1;
            if(calculation==(int)calculation){
                s = Integer.toString((int)calculation);
            }
            else{
                s = Double.toString(calculation);
            }
            if(s.length()>12){
                s=s.substring(0,13);
            }
            mainscreen.setText(s);
        }
        else {
            calculation = temp1;
        }
    }



}
