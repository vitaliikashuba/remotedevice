package task8;

public class RemoteController implements Device, Volume {
    private TVDevice tvDevice;

    public void powerOn() {

    }

    public void powerOff() {

    }

    public void setChannel(int channel) {

    }

    public void currentChannel() {

    }

    public void upVolume() {

    }

    public void downVolume() {

    }

    public void mute() {

    }

    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    public void disconnectDevice() {
        this.tvDevice = null;
    }

    private boolean checkifDeviceConnected() {
        return this.tvDevice == null;
    }
}
