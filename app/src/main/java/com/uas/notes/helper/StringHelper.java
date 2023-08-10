/**
 * NIM : 10120059
 * NAMA : Muhammad Fazrin Ar-Rahman
 * KELAS : IF-2
 */
package com.uas.notes.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
