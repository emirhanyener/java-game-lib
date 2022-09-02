package sglib.Util;

public class KeyManager{
    private static KeyManager manager = null;

    boolean KeyA = false;
    boolean KeyB = false;
    boolean KeyC = false;
    boolean KeyD = false;
    boolean KeyE = false;
    boolean KeyF = false;
    boolean KeyG = false;
    boolean KeyH = false;
    boolean KeyI = false;
    boolean KeyJ = false;
    boolean KeyK = false;
    boolean KeyL = false;
    boolean KeyM = false;
    boolean KeyN = false;
    boolean KeyO = false;
    boolean KeyP = false;
    boolean KeyQ = false;
    boolean KeyR = false;
    boolean KeyS = false;
    boolean KeyT = false;
    boolean KeyU = false;
    boolean KeyV = false;
    boolean KeyW = false;
    boolean KeyX = false;
    boolean KeyY = false;
    boolean KeyZ = false;
    
    boolean Key1 = false;
    boolean Key2 = false;
    boolean Key3 = false;
    boolean Key4 = false;
    boolean Key5 = false;
    boolean Key6 = false;
    boolean Key7 = false;
    boolean Key8 = false;
    boolean Key9 = false;
    boolean Key0 = false;

    boolean KeyNum0 = false;
    boolean KeyNum1 = false;
    boolean KeyNum2 = false;
    boolean KeyNum3 = false;
    boolean KeyNum4 = false;
    boolean KeyNum5 = false;
    boolean KeyNum6 = false;
    boolean KeyNum7 = false;
    boolean KeyNum8 = false;
    boolean KeyNum9 = false;

    boolean KeyNumMultiply = false;
    boolean KeyNumAdd = false;
    boolean KeyNumSlash = false;
    boolean KeyNumMinus = false;
    boolean KeyNumCompa = false;
    boolean KeyNumPeriod = false;
    
    boolean KeyF1 = false;
    boolean KeyF2 = false;
    boolean KeyF3 = false;
    boolean KeyF4 = false;
    boolean KeyF5 = false;
    boolean KeyF6 = false;
    boolean KeyF7 = false;
    boolean KeyF8 = false;
    boolean KeyF9 = false;
    boolean KeyF10 = false;
    boolean KeyF11 = false;
    boolean KeyF12 = false;

    boolean KeyRight = false;
    boolean KeyLeft = false;
    boolean KeyUp = false;
    boolean KeyDown = false;

    boolean KeySpace = false;
    boolean KeyBackSpace = false;
    boolean KeyEscape = false;
    boolean KeyPrintScreen = false;
    boolean KeyPause = false;
    boolean KeyDelete = false;
    boolean KeyHome = false;
    boolean KeyPageUp = false;
    boolean KeyPageDown = false;
    boolean KeyEnd = false;
    boolean KeyTab = false;
    boolean KeyCapsLock = false;
    boolean KeyNumLock = false;

    boolean KeyEnter = false;
    boolean KeyShift = false;
    boolean KeyControl = false;
    boolean KeyAlt = false;
    
    private KeyManager(){

    }

    public static KeyManager getManager(){
        if(manager == null){
            manager = new KeyManager();
        }
        return manager;
    }

    public boolean isKeyA(){
        return this.KeyA;
    }
    public boolean isKeyB(){
        return this.KeyB;
    }
    public boolean isKeyC(){
        return this.KeyC;
    }
    public boolean isKeyD(){
        return this.KeyD;
    }
    public boolean isKeyE(){
        return this.KeyE;
    }
    public boolean isKeyF(){
        return this.KeyF;
    }
    public boolean isKeyG(){
        return this.KeyG;
    }
    public boolean isKeyH(){
        return this.KeyH;
    }
    public boolean isKeyI(){
        return this.KeyI;
    }
    public boolean isKeyJ(){
        return this.KeyJ;
    }
    public boolean isKeyK(){
        return this.KeyK;
    }
    public boolean isKeyL(){
        return this.KeyL;
    }
    public boolean isKeyM(){
        return this.KeyM;
    }
    public boolean isKeyN(){
        return this.KeyN;
    }
    public boolean isKeyO(){
        return this.KeyO;
    }
    public boolean isKeyP(){
        return this.KeyP;
    }
    public boolean isKeyQ(){
        return this.KeyQ;
    }
    public boolean isKeyR(){
        return this.KeyR;
    }
    public boolean isKeyS(){
        return this.KeyS;
    }
    public boolean isKeyT(){
        return this.KeyT;
    }
    public boolean isKeyU(){
        return this.KeyU;
    }
    public boolean isKeyV(){
        return this.KeyV;
    }
    public boolean isKeyW(){
        return this.KeyW;
    }
    public boolean isKeyX(){
        return this.KeyX;
    }
    public boolean isKeyY(){
        return this.KeyY;
    }
    public boolean isKeyZ(){
        return this.KeyZ;
    }


    public boolean isKey1(){
        return this.Key1;
    }
    public boolean isKey2(){
        return this.Key2;
    }
    public boolean isKey3(){
        return this.Key3;
    }
    public boolean isKey4(){
        return this.Key4;
    }
    public boolean isKey5(){
        return this.Key5;
    }
    public boolean isKey6(){
        return this.Key6;
    }
    public boolean isKey7(){
        return this.Key7;
    }
    public boolean isKey8(){
        return this.Key8;
    }
    public boolean isKey9(){
        return this.Key9;
    }
    public boolean isKey0(){
        return this.Key0;
    }


    public boolean isKeyNum0(){
        return this.KeyNum0;
    }
    public boolean isKeyNum1(){
        return this.KeyNum1;
    }
    public boolean isKeyNum2(){
        return this.KeyNum2;
    }
    public boolean isKeyNum3(){
        return this.KeyNum3;
    }
    public boolean isKeyNum4(){
        return this.KeyNum4;
    }
    public boolean isKeyNum5(){
        return this.KeyNum5;
    }
    public boolean isKeyNum6(){
        return this.KeyNum6;
    }
    public boolean isKeyNum7(){
        return this.KeyNum7;
    }
    public boolean isKeyNum8(){
        return this.KeyNum8;
    }
    public boolean isKeyNum9(){
        return this.KeyNum9;
    }
    
    
    public boolean isKeyNumMultiply(){
        return this.KeyNumMultiply;
    }
    public boolean isKeyNumAdd(){
        return this.KeyNumAdd;
    }
    public boolean isKeyNumSlash(){
        return this.KeyNumSlash;
    }
    public boolean isKeyNumMinus(){
        return this.KeyNumMinus;
    }
    public boolean isKeyNumCompa(){
        return this.KeyNumCompa;
    }
    public boolean isKeyNumPeriod(){
        return this.KeyNumPeriod;
    }


    public boolean isKeyF1(){
        return this.KeyF1;
    }
    public boolean isKeyF2(){
        return this.KeyF2;
    }
    public boolean isKeyF3(){
        return this.KeyF3;
    }
    public boolean isKeyF4(){
        return this.KeyF4;
    }
    public boolean isKeyF5(){
        return this.KeyF5;
    }
    public boolean isKeyF6(){
        return this.KeyF6;
    }
    public boolean isKeyF7(){
        return this.KeyF7;
    }
    public boolean isKeyF8(){
        return this.KeyF8;
    }
    public boolean isKeyF9(){
        return this.KeyF9;
    }
    public boolean isKeyF10(){
        return this.KeyF10;
    }
    public boolean isKeyF11(){
        return this.KeyF11;
    }
    public boolean isKeyF12(){
        return this.KeyF12;
    }


    public boolean isKeyRight(){
        return this.KeyRight;
    }
    public boolean isKeyLeft(){
        return this.KeyLeft;
    }
    public boolean isKeyUp(){
        return this.KeyUp;
    }
    public boolean isKeyDown(){
        return this.KeyDown;
    }
    
    public boolean isKeySpace(){
        return this.KeySpace;
    }
    public boolean isKeyBackSpace(){
        return this.KeyBackSpace;
    }
    public boolean isKeyEscape(){
        return this.KeyEscape;
    }
    public boolean isKeyPrintScreen(){
        return this.KeyPrintScreen;
    }
    public boolean isKeyPause(){
        return this.KeyPause;
    }
    public boolean isKeyDelete(){
        return this.KeyDelete;
    }
    public boolean isKeyHome(){
        return this.KeyHome;
    }
    public boolean isKeyPageUp(){
        return this.KeyPageUp;
    }
    public boolean isKeyPageDown(){
        return this.KeyPageDown;
    }
    public boolean isKeyEnd(){
        return this.KeyEnd;
    }
    public boolean isKeyTab(){
        return this.KeyTab;
    }
    public boolean isKeyCapsLock(){
        return this.KeyCapsLock;
    }
    public boolean isKeyNumLock(){
        return this.KeyNumLock;
    }


    public boolean isKeyEnter(){
        return this.KeyEnter;
    }
    public boolean isKeyShift(){
        return this.KeyShift;
    }
    public boolean isKeyControl(){
        return this.KeyControl;
    }
    public boolean isKeyAlt(){
        return this.KeyAlt;
    }
}
