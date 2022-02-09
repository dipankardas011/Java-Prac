package lib;


public class Process extends AddrSpace{
    private int pid;
    private String name;
    private int ppid;

    // the address space
    public Process(String nn) {
        super();
        this.ppid = counter;
        this.pid = ++counter;
        this.name = nn;
    }

    public Process(){}

    public void getInfo() {
        System.out.printf("PID: %d\nPPID: %d\nName: %s\n",pid, ppid, name);
        System.out.println(super.getData());
    }

    static int counter;
}
