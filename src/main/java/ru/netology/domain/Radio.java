package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentSoundVolume;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }

    public int increaseCurrentSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        return currentSoundVolume;
    }

    public int decreaseCurrentSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }

    public int increaseCurrentStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return currentStation;
        }

        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        }
        return currentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > numberOfStations - 1) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

        this.currentStation = newCurrentStation;

    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {

        if (newCurrentSoundVolume > 100) {
            return;
        }
        if (newCurrentSoundVolume < 0) {
            return;
        }

        this.currentSoundVolume = newCurrentSoundVolume;

    }

    //____________________для покрытия______________________
    public void setCurrentStationForCoverage(int newCurrentStation) {

        this.currentStation = newCurrentStation;

    }
}
