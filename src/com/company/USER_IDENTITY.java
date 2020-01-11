package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class USER_IDENTITY {
    public static String get() throws IOException {

        FileReader fr = new FileReader("C:\\Users\\wayne\\PycharmProjects\\python_STT\\USER_identity.txt");

        BufferedReader br = new BufferedReader(fr);
        String USER_identity="";
        while (br.ready()) {
            USER_identity=br.readLine();
            System.out.println(USER_identity);

        }

        fr.close();
        return USER_identity;
    }
}

