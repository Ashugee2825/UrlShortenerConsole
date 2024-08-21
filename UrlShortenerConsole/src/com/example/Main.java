package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UrlShortener shortener = new UrlShortener();
        Scanner scanner = new Scanner(System.in);

        System.out.println("http://eprashikshan.com/course/?fp2course=1");
        String longUrl = scanner.nextLine();

        // Shorten URL using base-16
        String shortUrlBase16 = shortener.shortenUrlBase16(longUrl);
        System.out.println("Shortened URL (Base-16): " + shortUrlBase16);

        // Shorten URL using custom 8-character encoding
        String shortUrlCustom8 = shortener.shortenUrlCustom8(longUrl);
        System.out.println("Shortened URL (Custom 8-character): " + shortUrlCustom8);

        scanner.close();
    }
}
