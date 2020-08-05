package histogram;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class InputText {

    InputStreamReader rd = new InputStreamReader(System.in);

    void checkingEndText() {
        try {
            while (true) {
                int c = rd.read();
                if (c == -1) {                  //eof  ctrl+z
                    System.out.println("ctrl + z pushing");
                    break;
                }
                System.out.println((char) c);
            }
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    void histogramer() {
        System.out.println("text : ");

        checkingEndText();

        System.out.println("End");
        StringBuffer sbuff = new StringBuffer(rd.toString());


        for (int i = 0; i < sbuff.length(); i++) {
            System.out.println(sbuff.toString());
        }


    }


    public static void main(String[] args) {

        InputText a = new InputText();

        a.histogramer();
    }

}
