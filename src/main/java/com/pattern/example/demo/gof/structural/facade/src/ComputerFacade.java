package com.pattern.example.demo.gof.structural.facade.src;

public class ComputerFacade {

    private static final int BOOT_SECTOR = 5;
    private static final int SECTOR_SIZE = 50;
    private static final int BOOT_ADDRESS = 561282326;

    private Cpu cpu = null;
    private Memory memory = null;
    private HardDrive hardDrive = null;

    public ComputerFacade(Cpu cpu,
                          Memory memory,
                          HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        cpu.start();
        String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
        memory.load(BOOT_ADDRESS, hdBootInfo);
        cpu.execute();
        memory.free(BOOT_ADDRESS, hdBootInfo);
    }
}
