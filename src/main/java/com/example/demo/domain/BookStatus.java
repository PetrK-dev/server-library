package com.example.demo.domain;

public enum BookStatus {
    AVAILABLE,    // Kniha je dostupná k vypůjčení
    BORROWED,     // Kniha je vypůjčená
    RESERVED,     // Kniha je rezervovaná
    LOST          // Kniha je ztracena
}