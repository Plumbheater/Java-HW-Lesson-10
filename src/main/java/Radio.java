public class Radio {
    public int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumber) {
        if (newNumber < 0 || newNumber > 9) {
            return;
        }
        numberStation = newNumber;
    }

    public void setNextNumberStation(String next) {
        if (next == "next") {
            numberStation = numberStation + 1;
        }
        if (next != "next") {
            numberStation = numberStation;
        }
        if (numberStation > 9) {
            numberStation = 0;
        }
    }

    public void setPrevNumberStation(String prev) {
        if (prev == "prev") {
            numberStation = numberStation - 1;
        }
        if (prev != "prev") {
            numberStation = numberStation;
        }
        if (numberStation < 0) {
            numberStation = 0;
        }
    }

    public int volumeRadio;

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int newVolume) {
        if (newVolume <= 0) {
            newVolume = 0;
        }
        if (newVolume >= 10) {
            newVolume = 10;
        }
        {
            volumeRadio = newVolume;
        }
    }

    public void setPlusVolumeRadio(String plus) {
        if (plus == "+") {
            volumeRadio = volumeRadio + 1;
        }
        if (plus != "+") {
            volumeRadio = volumeRadio;
        }
        if (volumeRadio > 10) {
            volumeRadio = 10;
        }
    }

    public void setMinusVolumeRadio(String minus) {
        if (minus == "-") {
            volumeRadio = volumeRadio - 1;
        }
        if (minus != "-") {
            volumeRadio = volumeRadio;
        }
        if (volumeRadio < 0) {
            volumeRadio = 0;
        }
    }
}