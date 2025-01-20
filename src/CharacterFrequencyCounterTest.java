import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThreeTimesInHelloWorld() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello World");
        //Act
        int actualCount = counter.getFrequency('l');
        //Assert
        assertEquals(3, actualCount);
    }

    @Test
    public void testNonOccurringCharacterPercentageIsZero() {
        //arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hi There");
        //Act
        double actualPercentage = counter.getRelativePercentage('z');
        //Assert
        assertEquals(0.0, actualPercentage, 0.0001);
    }
}