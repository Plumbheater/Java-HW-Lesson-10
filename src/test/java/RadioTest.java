import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(9);

        int expected = 9;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHighMaxNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(10);

        int expected = 0;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowMinNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(-1);

        int expected = 0;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(8);
        number.setNextNumberStation();

        int expected = 9;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNextMaxNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(9);
        number.setNextNumberStation();

        int expected = 0;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(1);
        number.setPrevNumberStation();

        int expected = 0;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevMinNumberStation() {
        Radio number = new Radio();
        number.setNumberStation(0);
        number.setPrevNumberStation();

        int expected = 9;
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    //=============================================================================================
    @Test
    public void setVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(10);

        int expected = 10;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHighMaxVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(11);

        int expected = 10;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowMinVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(-1);

        int expected = 0;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPlusVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(9);
        volume.setPlusVolumeRadio();

        int expected = 10;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setPlusMaxVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(10);
        volume.setPlusVolumeRadio();

        int expected = 10;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setMinusVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(10);
        volume.setMinusVolumeRadio();

        int expected = 9;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinusMinVolumeRadio() {
        Radio volume = new Radio();
        volume.setVolumeRadio(0);
        volume.setMinusVolumeRadio();

        int expected = 0;
        int actual = volume.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

}

