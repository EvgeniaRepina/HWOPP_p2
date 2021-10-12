package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    // __________________звук__________________________
    @Test
    public void shouldIncreaseCurrentSoundVolumeMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(0);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumePreMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(1);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumeMid() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(5);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentSoundVolumeMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(10);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentSoundVolumePreMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(9);
        int actual = radio1.increaseCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }
//    ________________________________________________________________

    @Test
    public void shouldDecreaseCurrentSoundVolumeMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(0);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumePreMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(1);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumeMid() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(5);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentSoundVolumeMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(10);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentSoundVolumePreMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(9);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }
    //____________________для покрытия______________________
    @Test
    public void shouldSetCurrentSoundVolumeOverLimit() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(33);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUnderlimit() {

        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(-10);
        int actual = radio1.decreaseCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationUnderLimit() {

        Radio radio1 = new Radio();
        radio1.setCurrentStationForCoverage(11);
        int actual = radio1.increaseCurrentStation();
        int expected = 11;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationOverLimit() {

        Radio radio1 = new Radio();
        radio1.setCurrentStationForCoverage(-3);
        int actual = radio1.decreaseCurrentStation();
        int expected = -3;
        assertEquals(expected, actual);
    }

    //________________станция_____________________________
    @Test
    public void shouldIncreaseCurrentStationMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(0);
        int actual = radio1.increaseCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationPreMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(1);
        int actual = radio1.increaseCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationMid() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(5);
        int actual = radio1.increaseCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(9);
        int actual = radio1.increaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationPreMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(8);
        int actual = radio1.increaseCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    //___________________________________________________-

    @Test
    public void shouldDecreaseCurrentStationMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(0);
        int actual = radio1.decreaseCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationPreMin() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(1);
        int actual = radio1.decreaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationMid() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(5);
        int actual = radio1.decreaseCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(9);
        int actual = radio1.decreaseCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationPreMax() {

        Radio radio1 = new Radio();
        radio1.setCurrentStation(8);
        int actual = radio1.decreaseCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }
    //______________Сеттер______________________________________
    @Test
    public void shouldSetCurrentRadioStationNumberUnderLimit() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(-5);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberPreLimit() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(-1);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMin() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(0);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberPostMin() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(1);
        int actual = radio1.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMid() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(5);
        int actual = radio1.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationPreMax() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(8);
        int actual = radio1.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberMax() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(9);
        int actual = radio1.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationPostMax() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(10);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberOverLimit() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(55);
        int actual = radio1.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

}