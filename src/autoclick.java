import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class autoclick {
    public static void main(String[] args){
        try{
            Robot r = new Robot();
            int button = InputEvent.BUTTON1_DOWN_MASK;
            System.out.println("Click");
            Thread.sleep(30000);
            r.mouseMove(800,880);
            r.mousePress(button);
            r.mouseRelease(button);
            r.mouseMove(600,690);
            r.mousePress(button);
            r.mouseRelease(button);
            Robot re = new Robot();
            for (char c : ("Hai Sober").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : (" Bantu isi ulasan ").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_3);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : ("BersinarMengajar yuk").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : (" dengan cara buka link berikut https").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : ("//bit.ly/KelasBersinar").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : ("Kalian juga bisa kirim donasi untuk Bersinar sehingga kami bisa terus berkembang dan menjangkau lebih banyak pelajar lainnya.").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            for (char c : (" Klik link di bawah ini ya").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : (" https").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SHIFT);
            for (char c : ("//bit.ly/TraktirinBersinar").toCharArray()) {
                int code = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c))
                    re.keyPress(KeyEvent.VK_SHIFT);
                re.keyPress(code);
                re.keyRelease(code);
                if (Character.isUpperCase(c))
                    r.keyRelease(KeyEvent.VK_SHIFT);
            }
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
