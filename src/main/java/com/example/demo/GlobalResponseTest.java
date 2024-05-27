package com.example.demo;

public record GlobalResponseTest<T> (
        int resultCode,
        T resultData
) {}
