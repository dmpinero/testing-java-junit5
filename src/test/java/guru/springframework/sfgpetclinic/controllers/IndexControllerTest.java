package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
      assertEquals("index", controller.index());
      assertEquals("index", controller.index(), "Wrong View Returned");

      assertEquals("index", controller.index(), () -> "Another expensive message " +
              "Make me only if you have to");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(Optional.ofNullable(controller)), () -> "This is some expensive" +
                "Message to build" +
                "for my test");
    }
}