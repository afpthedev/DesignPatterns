package Behavioral.Chain_Of_Responsibility.Logger;

public class ErrorType {
    private String İNFO;
    private String DEBUG;
    private String LEVEL;
    private String ERROR;

    public String getİNFO() {
        return İNFO;
    }

    public String getDEBUG() {
        return DEBUG;
    }

    public String getLEVEL() {
        return LEVEL;
    }

    public String getERROR() {
        return ERROR;
    }

    public void setİNFO(String İNFO) {
        this.İNFO = İNFO;
    }

    public void setDEBUG(String DEBUG) {
        this.DEBUG = DEBUG;
    }

    public void setLEVEL(String LEVEL) {
        this.LEVEL = LEVEL;
    }

    public void setERROR(String ERROR) {
        this.ERROR = ERROR;
    }

    public ErrorType(String İNFO, String DEBUG, String LEVEL, String ERROR) {
        this.İNFO = İNFO;
        this.DEBUG = DEBUG;
        this.LEVEL = LEVEL;
        this.ERROR = ERROR;
    }
}
