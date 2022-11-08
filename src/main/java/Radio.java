public class Radio {
    private int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumber) {
        if (newNumber > 9 || newNumber < 0) {
            newNumber = 0;
        }
        numberStation = newNumber;
    }

    public void setNextNumberStation() {
        int next = getNumberStation() + 1;
        setNumberStation(next);
    }

    public void setPrevNumberStation() {
        int prev = getNumberStation() - 1;
        if (prev < 0) {
            setNumberStation(9);
        } else {
            setNumberStation(prev);
        }
    }

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

    public void setPlusVolumeRadio() {
        int plus = getVolumeRadio() + 1;
        setVolumeRadio(plus);
    }

    public void setMinusVolumeRadio() {
        int minus = getVolumeRadio() - 1;
        setVolumeRadio(minus);

    }
}
