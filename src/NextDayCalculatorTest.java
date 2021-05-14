import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
     void testFindNextDay() {
        int day = 1;
        int month = 5;
        int year = 2000;
        String expected = "2 5 2000";
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testFindNextDay1() {
        int day = 31;
        int month = 5;
        int year = 2000;
        String expected = "1 6 2000";
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testFindNextDay3() {
        int day = 31;
        int month = 12;
        int year = 2000;
        String expected = "1 1 2001";
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);
    }
}