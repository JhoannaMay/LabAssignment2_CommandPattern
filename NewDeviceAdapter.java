public class NewDeviceAdapter implements Command {
    private NewDevice newDevice;

    public NewDeviceAdapter(NewDevice newDevice) {
        this.newDevice = newDevice;
    }

    @Override
    public void execute() {
        newDevice.performAction();
    }
}