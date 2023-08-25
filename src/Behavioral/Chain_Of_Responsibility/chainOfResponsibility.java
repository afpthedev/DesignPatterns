package Behavioral.Chain_Of_Responsibility;

import Behavioral.Chain_Of_Responsibility.Logger.*;

public class chainOfResponsibility {
    public static void main(String[] args) {
        Logger errorLog1 =  new errorLog();
        Logger consoleLog =  new consoleLog();
        Logger fileLogger = new fileLog();

        errorLog1.setLogger(consoleLog);
        consoleLog.setLogger(fileLogger);

        ErrorType errorType1 =  new ErrorType("1","12","1","Aritmetic ERROR");
        ErrorType errorType2 =  new ErrorType("1","14","1","ERROR");
        ErrorType errorType3 =  new ErrorType("1","11","1","Aritmetic ERROR");
        ErrorType errorType4 =  new ErrorType("1","13","1","ERROR");

        errorLog1.setNextLogger(errorType1);
        errorLog1.setNextLogger(errorType2);
        errorLog1.setNextLogger(errorType4);
        errorLog1.setNextLogger(errorType3);




    }
}
