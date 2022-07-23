package facade;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void run(){
        hardDrive.read();
        memory.load();
        cpu.process();
    }
}
