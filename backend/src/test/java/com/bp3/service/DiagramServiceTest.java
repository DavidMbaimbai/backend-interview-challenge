package com.bp3.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagramServiceTest {


    @Test
    void processAllFiles() {
        DiagramService diagramService = new DiagramService();
        diagramService.processAllFiles("C:\\Users\\admin\\Downloads\\backend-interview-challenge\\backend\\src\\test\\resources");

    }
}
