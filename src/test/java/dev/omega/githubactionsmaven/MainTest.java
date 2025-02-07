package dev.omega.githubactionsmaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAddNumbers(){
        int sum = Main.addNumbers(2, 6);
        Assertions.assertEquals(8,sum);
    }
}
