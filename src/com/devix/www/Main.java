package com.devix.www;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        InetAddress address = null;

        try {
            address = InetAddress.getByName("www.google.com.mx");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);
    }
}
