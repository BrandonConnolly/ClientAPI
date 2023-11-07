package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConnectionTest {

    private Connection connection;

    @BeforeEach
    public void setUp() {
        // change as we test
        connection = new Connection("http://localhost:8080/cloudvendor/1", "8080", "/path");
    }

    @Test
    public void testGetUrl() {
        assertEquals("http://localhost:8080/cloudvendor/1", connection.getUrl());
    }

    @Test
    public void testGetPort() {
        assertEquals("8080", connection.getPort());
    }

    @Test
    public void testSetUrl() {
        connection.setUrl("http://localhost:8080/cloudvendor/1");
        assertEquals("http://localhost:8080/cloudvendor/1", connection.getUrl());
    }

    @Test
    public void testSetPort() {
        connection.setPort("8080");
        assertEquals("8080", connection.getPort());
    }

    @Test
    public void testSetPath() {
        connection.setPath("cloudvendor/1");
        assertEquals("cloudvendor/1", connection.getPath());
    }
}
