
public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("333", "V", "333");
        Monitor monitor = new Monitor("3inch", "Acer", 20, "333x333");
        Motherboard motherboard = new Motherboard("S", "Dell", 3, 5, "v1");

        PersonalComp personalComp = new PersonalComp("333", "Dell", theCase, monitor, motherboard);
        // personalComp.getMotherboard().loadProgram("Windows");
        // personalComp.getMonitor().drawPixelAt(3, 3, "green");
        // personalComp.getComputerCase().pressPowerButton();

        personalComp.powerUp();

    }
}
