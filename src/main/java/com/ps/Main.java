package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

public class Main {
    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];

        UserInterface.display(username, password);

    }
}
