package sglib.Util;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyController implements KeyListener {
    private static KeyController manager = null;
    private KeyManager keys = null;

    private KeyController() {
        keys = KeyManager.getManager();
    }

    // get single object.
    public static KeyController getManager() {
        if (manager == null) {
            manager = new KeyController();
        }
        return manager;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    ////////////////////////////// Key Down //////////////////////////////

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            keys.KeyA = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            keys.KeyB = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_C) {
            keys.KeyC = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            keys.KeyD = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            keys.KeyE = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            keys.KeyF = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_G) {
            keys.KeyG = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
            keys.KeyH = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_I) {
            keys.KeyI = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            keys.KeyJ = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_K) {
            keys.KeyK = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_L) {
            keys.KeyL = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_M) {
            keys.KeyM = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_N) {
            keys.KeyN = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_O) {
            keys.KeyO = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_P) {
            keys.KeyP = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            keys.KeyQ = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            keys.KeyR = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            keys.KeyS = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            keys.KeyT = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_U) {
            keys.KeyU = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            keys.KeyV = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            keys.KeyW = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            keys.KeyX = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Y) {
            keys.KeyY = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            keys.KeyZ = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_1) {
            keys.Key1 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            keys.Key2 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            keys.Key3 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            keys.Key4 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            keys.Key5 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            keys.Key6 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            keys.Key7 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            keys.Key8 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_9) {
            keys.Key9 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            keys.Key0 = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            keys.KeyNum0 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            keys.KeyNum1 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            keys.KeyNum2 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            keys.KeyNum3 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            keys.KeyNum4 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            keys.KeyNum5 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            keys.KeyNum6 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            keys.KeyNum7 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            keys.KeyNum8 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            keys.KeyNum9 = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            keys.KeyNumMultiply = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_ADD) {
            keys.KeyNumAdd = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SLASH) {
            keys.KeyNumSlash = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            keys.KeyNumMinus = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_COMMA) {
            keys.KeyNumCompa = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
            keys.KeyNumPeriod = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_F1) {
            keys.KeyF1 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F2) {
            keys.KeyF2 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F3) {
            keys.KeyF3 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F4) {
            keys.KeyF4 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F5) {
            keys.KeyF5 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F6) {
            keys.KeyF6 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F7) {
            keys.KeyF7 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F8) {
            keys.KeyF8 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F9) {
            keys.KeyF9 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F10) {
            keys.KeyF10 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F11) {
            keys.KeyF11 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F12) {
            keys.KeyF12 = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            keys.KeyRight = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            keys.KeyLeft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            keys.KeyUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys.KeyDown = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            keys.KeySpace = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            keys.KeyBackSpace = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            keys.KeyEscape = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_PRINTSCREEN) {
            keys.KeyPrintScreen = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAUSE) {
            keys.KeyPause = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            keys.KeyDelete = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_HOME) {
            keys.KeyHome = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            keys.KeyPageUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            keys.KeyPageDown = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_END) {
            keys.KeyEnd = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            keys.KeyTab = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
            keys.KeyCapsLock = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUM_LOCK) {
            keys.KeyNumLock = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            keys.KeyEnter = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            keys.KeyShift = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
            keys.KeyControl = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_ALT) {
            keys.KeyAlt = true;
        }
    }

    ////////////////////////////// Key Up //////////////////////////////

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            keys.KeyA = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            keys.KeyB = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_C) {
            keys.KeyC = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            keys.KeyD = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            keys.KeyE = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            keys.KeyF = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_G) {
            keys.KeyG = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
            keys.KeyH = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_I) {
            keys.KeyI = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            keys.KeyJ = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_K) {
            keys.KeyK = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_L) {
            keys.KeyL = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_M) {
            keys.KeyM = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_N) {
            keys.KeyN = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_O) {
            keys.KeyO = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_P) {
            keys.KeyP = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            keys.KeyQ = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            keys.KeyR = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            keys.KeyS = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            keys.KeyT = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_U) {
            keys.KeyU = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            keys.KeyV = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            keys.KeyW = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            keys.KeyX = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Y) {
            keys.KeyY = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            keys.KeyZ = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_1) {
            keys.Key1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            keys.Key2 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            keys.Key3 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            keys.Key4 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            keys.Key5 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            keys.Key6 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            keys.Key7 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            keys.Key8 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_9) {
            keys.Key9 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            keys.Key0 = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            keys.KeyNum0 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            keys.KeyNum1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            keys.KeyNum2 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            keys.KeyNum3 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            keys.KeyNum4 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            keys.KeyNum5 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            keys.KeyNum6 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            keys.KeyNum7 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            keys.KeyNum8 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            keys.KeyNum9 = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            keys.KeyNumMultiply = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_ADD) {
            keys.KeyNumAdd = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SLASH) {
            keys.KeyNumSlash = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            keys.KeyNumMinus = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_COMMA) {
            keys.KeyNumCompa = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
            keys.KeyNumPeriod = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_F1) {
            keys.KeyF1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F2) {
            keys.KeyF2 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F3) {
            keys.KeyF3 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F4) {
            keys.KeyF4 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F5) {
            keys.KeyF5 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F6) {
            keys.KeyF6 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F7) {
            keys.KeyF7 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F8) {
            keys.KeyF8 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F9) {
            keys.KeyF9 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F10) {
            keys.KeyF10 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F11) {
            keys.KeyF11 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F12) {
            keys.KeyF12 = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            keys.KeyRight = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            keys.KeyLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            keys.KeyUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys.KeyDown = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            keys.KeySpace = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            keys.KeyBackSpace = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            keys.KeyEscape = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_PRINTSCREEN) {
            keys.KeyPrintScreen = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAUSE) {
            keys.KeyPause = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            keys.KeyDelete = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_HOME) {
            keys.KeyHome = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            keys.KeyPageUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            keys.KeyPageDown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_END) {
            keys.KeyEnd = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            keys.KeyTab = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
            keys.KeyCapsLock = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUM_LOCK) {
            keys.KeyNumLock = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            keys.KeyEnter = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            keys.KeyShift = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
            keys.KeyControl = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_ALT) {
            keys.KeyAlt = false;
        }
    }
}
