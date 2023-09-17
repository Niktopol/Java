package task4;

public enum Pc {
    MEGAPC3000("Intel2000", 16, "GigabyteX888", 32, "LG65GIANT", 66),
    MEGAPC2000("Intel99", 8, "GigabyteK9", 16, "LG12", 12),
    MEGAPC1000("Intel33", 2, "Gigabyte0", 4, "LG33Tiny", 3);
    private Processor proc;
    private Memory mem;
    private Monitor mon;
    private Pc(String procname, int cores, String memname, int cap, String monname, int size){
        proc = new Processor(procname, cores);
        mem = new Memory(memname, cap);
        mon = new Monitor(monname, size);
    }
    @Override
    public String toString(){
        return "Processor:\n"+proc.toString()+"\n"+"Memory:\n"+mem.toString()+"\n"+"Monitor:\n"+mon.toString();
    }
}
