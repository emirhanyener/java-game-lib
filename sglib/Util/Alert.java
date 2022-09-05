package sglib.Util;

import sglib.Setting;
import sglib.Util.StaticValues.AlertLevel;

public class Alert {
	private static Alert alert = null;
	private AlertInfo[] list;
	private int index;
	
	private Alert() {
		this.list = new AlertInfo[Setting.MAX_ALERT_NUMBER];
		for(int i = 0; i < Setting.MAX_ALERT_NUMBER; i++) {
			this.list[i] = new AlertInfo();
		}
		
		this.index = 0;
	}
	
	//get single object.
	public static Alert getInstance() {
		if(alert == null)
			alert = new Alert();
		return alert;
	}
	
	//add new alert.
	//(index = row)
	public void addAlert(String value, AlertLevel level) {
		if(this.index == Setting.MAX_ALERT_NUMBER){
			this.index = 0;
		}
		list[index].setMessage(value);
		list[index].setAlertLevel(level);;
		this.index++;
	}
	
	//set alert row.
	public void setAlertRow(int row, String value, AlertLevel level) {
		if(row < Setting.MAX_ALERT_NUMBER){
			list[row].setMessage(value);
			list[row].setAlertLevel(level);
		}
	}
	
	//get all alerts.
	public AlertInfo[] getAlerts() {
		return this.list;
	}
	
	//get current alert index.
	public int getIndex() {
		return this.index;
	}
}