package com.sai.passwordgui;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static final SecureRandom random = new SecureRandom();

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUM = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}?/";

    public String generate(boolean lower, boolean upper, boolean numbers, boolean symbols, int length) {
        StringBuilder pool = new StringBuilder();

        if (lower) pool.append(LOWER);
        if (upper) pool.append(UPPER);
        if (numbers) pool.append(NUM);
        if (symbols) pool.append(SYMBOLS);

        if (pool.length() == 0)
            throw new IllegalArgumentException("No options selected");

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(pool.length());
            password.append(pool.charAt(index));
        }

        return password.toString();
    }
}
