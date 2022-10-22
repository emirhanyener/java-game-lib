package sglib;

import java.awt.Color;

public class Setting {
	// window settings
	public static final int     WINDOW_POSITION_X   = 50;
	public static final int     WINDOW_POSITION_Y   = 50;
	public static final int     WINDOW_WIDTH        = 800;
	public static final int     WINDOW_HEIGHT       = 600;
	public static final boolean MAXIMIZED           = false;
	
	// game settings
	//Refresh rate(miliseconds)
	public static final long    REFRESH_RATE        = 10;
	//Physics gravity force power
	public static final float   GRAVITY             = 9.81f / 100;
	//Background color(rgb)
	public static final Color   BACKGROUND_COLOR    = new Color(180, 240, 255);
	//Default gameobject color(rgb)
	public static final Color   DEFAULT_COLOR       = new Color(255, 0, 255);
	//Alerts visible state
	public static final boolean IS_ALERT_ACTIVE     = true;
	//If alerts are visible, max showed alert number
	public static final int     MAX_ALERT_NUMBER    = 3;
	//GUI objects visible state
	public static final boolean IS_GUI_ACTIVE       = true;
	public static final int     STOKE_WIDTH         = 2;
	//Physics gameobject velocity GUI visible state
	public static final boolean VELOCITY_GUI_ACTIVE = true;
	//Key down repeat state
	public static final boolean IS_KEY_REPEAT       = false;
	//Key down repeat delay
	public static final int     KEY_REPEAT_DELAY    = 10;
	//Game developer mode(all gameobject positions and physics velocity info)
	public static final boolean DEVELOPER_MODE      = true;
}
