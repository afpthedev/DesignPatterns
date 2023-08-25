package Behavioral.Chain_Of_Responsibility.Logger;

public abstract class Logger {
    ErrorType errorType;
    Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public abstract void setNextLogger(ErrorType errorType);
     abstract void logMessage(ErrorType errorType);
     abstract void write(ErrorType errorType);



}
