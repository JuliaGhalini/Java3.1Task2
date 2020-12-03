package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();
    private int actual;


    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, Radio', 9, 10",
                    "'expected, Radio', 10, 0"
            }
    )
    void nextRadio(String test, int station, int expected) {
        radio.setStation(station);
        radio.nextStation();
        assertEquals(expected, radio.getStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, Radio', 8, 7",
                    "'expected, Radio', 0, 10"
            }
    )
    void shouldPrevRadio(String test, int station, int expected) {
        radio.setStation(station);
        radio.prevStation();
        assertEquals(expected, radio.getStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, Volume', 100, 100",
                    "'expected, Radio', 21, 22"
            }
    )
    void increaseVolume(String test, int volume, int expected) {
        radio.setVolume(volume);
        radio.incVolume();
        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, Volume', 0, 0",
                    "'expected, Radio', 8, 7"
            }
    )
    void decreaseCurrentVolume(String test, int volume, int expected) {
        radio.setVolume(volume);
        radio.decVolume();
        assertEquals(expected, radio.getVolume());
    }
    @Test
    public void numOfStationsDefault() {
        Radio radio = new Radio();
        actual = radio.getNumOfStations();
        int expected = 10;
        assertEquals(expected, actual);}

}

