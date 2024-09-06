public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        Light light = new Light();
        Command lightOn = new TurnOnLightCommand(light);
        Command lightOff = new TurnOffLightCommand(light);

        hub.setCommand(lightOn);
        hub.pressButton(); // Output: Light is On

        hub.setCommand(lightOff);
        hub.pressButton(); // Output: Light is Off
    }
}