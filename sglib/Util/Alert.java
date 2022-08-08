package sglib.Util;

import sglib.Setting;

public class Alert {
	private static Alert alert = null;
	private String[] list;
	private int index;
	
	private Alert() {
		this.list = new String[Setting.MAX_ALERT_NUMBER + 1];
		for(int i = 0; i < Setting.MAX_ALERT_NUMBER + 1; i++) {
			list[i] = "";
		}
		
		this.index = 0;
	}
	
	public static Alert getInstance() {
		if(alert == null)
			alert = new Alert();
		return alert;
	}
	
	public void addAlert(String value) {
		if(this.index == Setting.MAX_ALERT_NUMBER)
			this.index = 0;
		list[index] = value;
		this.index++;
	}
	
	public void setAlertRow(int row, String newValue) {
		if(row < Setting.MAX_ALERT_NUMBER)
			list[row] = newValue;
	}
	
	public String[] getAlerts() {
		return this.list;
	}
	
	public int getIndex() {
		return this.index;
	}
}