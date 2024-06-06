package exceptions;

import java.io.IOException;


// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ExceptionDemo.java
// Date: 2024/06/06
// Modified Date: 2024/06/06
// Email: emjeydev@gmail.com
// Github: emjeydev


public class Account {
    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }
}
