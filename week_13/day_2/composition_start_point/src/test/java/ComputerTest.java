import behaviours.IOutput;
import device_management.Computer;
import device_management.Monitor;
import device_management.Printer;
import device_management.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    Computer computer;
    IOutput outputDevice;

    @Before
    public void before() {
        outputDevice = new Monitor(22, 1231231231);
        computer = new Computer(8, 512, outputDevice);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput device = computer.getOutputDevice();
        System.out.println("Type" + outputDevice.getClass());
        System.out.println(device instanceof Monitor);
        assertNotNull(device);
        assertTrue(device instanceof Monitor);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Andy", "stylus", 120, 3);
        computer = new Computer(8, 512, printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice() {
        Printer printer = new Printer("cat", "catcat", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: catcatcat", computer.outputData("catcatcat"));
    }
}
