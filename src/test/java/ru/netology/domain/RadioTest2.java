package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest2 {
    Radio radio1 = new Radio(8);

    //____________________для покрытия______________________
    @Test
    public void shouldSetCurrentSoundVolumeOverLimit() {


        radio1.setCurrentSoundVolume(133);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUnderlimit() {


        radio1.setCurrentSoundVolume(-10);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationUnderLimit() {


        radio1.setCurrentStationForCoverage(11);
        int actual = radio1.increaseCurrentStation();
        int expected = 11;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationOverLimit() {


        radio1.setCurrentStationForCoverage(-3);
        int actual = radio1.decreaseCurrentStation();
        int expected = -3;
        assertEquals(expected, actual);
    }

    //________________станция_____________________________
    @Test
    public void shouldIncreaseCurrentStationMin() {


        radio1.setCurrentStation(0);
        int actual = radio1.increaseCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationPreMin() {


        radio1.setCurrentStation(1);
        int actual = radio1.increaseCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationMid() {


        radio1.setCurrentStation(4);
        int actual = radio1.increaseCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationMax() {


        radio1.setCurrentStation(7);
        int actual = radio1.increaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationPreMax() {


        radio1.setCurrentStation(6);
        int actual = radio1.increaseCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    //___________________________________________________-

    @Test
    public void shouldDecreaseCurrentStationMin() {


        radio1.setCurrentStation(0);
        int actual = radio1.decreaseCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationPreMin() {


        radio1.setCurrentStation(1);
        int actual = radio1.decreaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationMid() {


        radio1.setCurrentStation(4);
        int actual = radio1.decreaseCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationMax() {


        radio1.setCurrentStation(7);
        int actual = radio1.decreaseCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationPreMax() {


        radio1.setCurrentStation(6);
        int actual = radio1.decreaseCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    //______________Сеттер______________________________________
    @Test
    public void shouldSetCurrentRadioStationNumberUnderLimit() {

        radio1.setCurrentStation(-5);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberPreLimit() {

        radio1.setCurrentStation(-1);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMin() {

        radio1.setCurrentStation(0);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberPostMin() {

        radio1.setCurrentStation(1);
        int actual = radio1.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMid() {

        radio1.setCurrentStation(5);
        int actual = radio1.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationPreMax() {

        radio1.setCurrentStation(6);
        int actual = radio1.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMax() {

        radio1.setCurrentStation(7);
        int actual = radio1.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationPostMax() {

        radio1.setCurrentStation(8);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberOverLimit() {

        radio1.setCurrentStation(55);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

}