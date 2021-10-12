package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio1 = new Radio();
    // __________________звук__________________________
    @Test
    public void shouldIncreaseCurrentSoundVolumeMin() {


        radio1.setCurrentSoundVolume(0);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumePreMin() {


        radio1.setCurrentSoundVolume(1);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumeMid() {


        radio1.setCurrentSoundVolume(50);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentSoundVolumeMax() {


        radio1.setCurrentSoundVolume(100);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumePreMax() {


        radio1.setCurrentSoundVolume(99);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }
//    ________________________________________________________________

    @Test
    public void shouldDecreaseCurrentSoundVolumeMin() {


        radio1.setCurrentSoundVolume(0);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumePreMin() {


        radio1.setCurrentSoundVolume(1);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumeMid() {


        radio1.setCurrentSoundVolume(50);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentSoundVolumeMax() {


        radio1.setCurrentSoundVolume(100);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumePreMax() {


        radio1.setCurrentSoundVolume(99);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 98;
        assertEquals(expected, actual);
    }
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


        radio1.setCurrentStation(5);
        int actual = radio1.increaseCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationMax() {


        radio1.setCurrentStation(9);
        int actual = radio1.increaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationPreMax() {


        radio1.setCurrentStation(8);
        int actual = radio1.increaseCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    //___________________________________________________-

    @Test
    public void shouldDecreaseCurrentStationMin() {


        radio1.setCurrentStation(0);
        int actual = radio1.decreaseCurrentStation();
        int expected = 9;
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


        radio1.setCurrentStation(5);
        int actual = radio1.decreaseCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationMax() {


        radio1.setCurrentStation(9);
        int actual = radio1.decreaseCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationPreMax() {


        radio1.setCurrentStation(8);
        int actual = radio1.decreaseCurrentStation();
        int expected = 7;
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

        radio1.setCurrentStation(8);
        int actual = radio1.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMax() {

        radio1.setCurrentStation(9);
        int actual = radio1.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationPostMax() {

        radio1.setCurrentStation(11);
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