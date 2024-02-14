package structural.facade;

import structural.facade.system.CPU;
import structural.facade.system.HardDrive;
import structural.facade.system.Memory;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }

    public ComputerFacade() {

    }

    public void start(int position, int iba, int size) {
        processor = new CPU();
        ram = new Memory();
        hd = new HardDrive();

        processor.freeze();
        ram.load(position, hd.read(iba, size));
        processor.jump(123);
        processor.execute();
    }
}
