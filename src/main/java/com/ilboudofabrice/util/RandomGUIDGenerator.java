package com.ilboudofabrice.util;

import java.util.UUID;

public class RandomGUIDGenerator {

    public static String generateRandomGUID() {
        return UUID.randomUUID().toString().toUpperCase();
    }
}