package Behavioral.Chain_Of_Responsibility.Logger;

public class consoleLog extends Logger{


    @Override
   public void setNextLogger(ErrorType errorType) {
        if (errorType.getERROR()=="Aritmetic ERROR"){
            errorType.setLEVEL("1");
            errorType.setİNFO("Aritmetic error is says you what a such as a math.");
            System.out.println("REAL PROBLEMMM!!!" + errorType.getLEVEL() + errorType.getİNFO());
            logMessage(errorType);
        }else if (logger !=null){
        logger.setNextLogger(errorType);
        }
    }

    @Override
    void logMessage(ErrorType errorType) {
    }

    @Override
    void write(ErrorType errorType) {
        System.out.println(errorType);
    }
}
