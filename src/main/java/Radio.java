public class Radio {
    private int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumber) {
        if (newNumber < 0 || newNumber > 9) {
            newNumber = 0;
        }
        numberStation = newNumber;
    }

    public void setNextNumberStation(String next) {
        if (next == "next") {
            setNumberStation(getNumberStation() + 1);
        } else {
            getNumberStation();
        }

    }

    public void setPrevNumberStation(String prev) {
        if (prev == "prev") {
            numberStation = numberStation - 1;
        } else {
            getNumberStation();
        }
        if (numberStation < 0) {
            numberStation = 9;
        }
    }
//
//    не могу придумать как правильно это сделать, не получается обойти первое условие в public void setNumberStation
//            прошу помочь в решении.
    private int volumeRadio;

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
            setVolumeRadio(getVolumeRadio() + 1);
        } else {
            getVolumeRadio();
        }
    }

    public void setMinusVolumeRadio(String minus) {
        if (minus == "-") {
            setVolumeRadio(getVolumeRadio() - 1);
        } else {
            getVolumeRadio();
        }
    }
}