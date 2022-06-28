
enum Traffic {
    RED("stop"),
    YELLOW("wait"),
    GREEN("go");

    private final String action;

    Traffic(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }
}

public class EnumsAdv {
    public static void main(String[] args) {
        Traffic[] lights = Traffic.values();
        for (Traffic i : lights) {
            System.out.println(i +" name and command " + i.getAction());
        }
    }
}
