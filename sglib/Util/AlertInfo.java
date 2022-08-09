package sglib.Util;

import sglib.Util.StaticValues.AlertLevel;

public class AlertInfo {
    private String message;
    private AlertLevel alertLevel;

    //constructors
    public AlertInfo(){
        this.message = "";
        this.alertLevel = AlertLevel.info;
    }
    public AlertInfo(String message){
        this.message = message;
        this.alertLevel = AlertLevel.info;
    }
    public AlertInfo(String message, AlertLevel level){
        this.message = message;
        this.alertLevel = level;
    }

    //getters
    public AlertLevel getAlertLevel() {
        return alertLevel;
    }
    public String getMessage() {
        return message;
    }

    //setters
    public void setAlertLevel(AlertLevel alertLevel) {
        this.alertLevel = alertLevel;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
