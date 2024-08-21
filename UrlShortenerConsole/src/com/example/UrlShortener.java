package com.example;

import java.util.Base64;

public class UrlShortener {

    // Method to shorten URL using base-16 (hexadecimal)
    public String shortenUrlBase16(String longUrl) {
        int hashCode = longUrl.hashCode();
        return Integer.toHexString(hashCode);
    }

    // Method to shorten URL using custom 8-character encoding
    public String shortenUrlCustom8(String longUrl) {
        int hashCode = longUrl.hashCode();
        String base64Encoded = Base64.getUrlEncoder().encodeToString(Integer.toString(hashCode).getBytes());
        // Truncate or pad to 8 characters
        return base64Encoded.length() > 8 ? base64Encoded.substring(0, 8) : base64Encoded;
    }
}
