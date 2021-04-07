package hu.nive.ujratervezes.zarovizsga.countchars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DaVinciCodeTest {

    private DaVinciCode daVinciCode;

    @BeforeEach
    void init() {
        daVinciCode = new DaVinciCode();
    }

    @Test
    void test_encode_zero_emptyInputWithX() throws IOException {
        String input = "src/test/resources/countchars/input1.txt";

        assertEquals(0, daVinciCode.decode(input, 'x'));
    }

    @Test
    void test_decode_zero_inputWithoutXCharToFindX() throws IOException {
        String input = "src/test/resources/countchars/input2.txt";

        assertEquals(0, daVinciCode.decode(input, 'x'));
    }

    @Test
    void test_decode_one_inputWithOne1CharToFindOne() throws IOException {
        String input = "src/test/resources/countchars/input3.txt";

        assertEquals(1, daVinciCode.decode(input, '1'));
    }

    @Test
    void test_decode_five_input012345x0x0ertz0fx0() throws IOException {
        String input = "src/test/resources/countchars/input4.txt";

        assertEquals(5, daVinciCode.decode(input, '0'));
    }

    @Test
    void test_decode_four_inputInMoreLinesWithFourX() throws IOException {
        String input = "src/test/resources/countchars/input5.txt";

        assertEquals(4, daVinciCode.decode(input, 'x'));
    }

    @Test
    void test_decode_illegalArgumentException_inputInMoreLinesCharToFindD() {
        String input = "src/test/resources/countchars/input5.txt";
        assertThrows(IllegalArgumentException.class, () -> daVinciCode.decode(input,'D'));
    }

}