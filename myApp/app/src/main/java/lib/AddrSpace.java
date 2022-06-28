package lib;

import java.util.Arrays;


public class AddrSpace {

    final int MAX_SIZE = 10;

    int[] Stack;
    int[] Heap;
    int[] BSS;
    int[] DataSeg;
    int[] code;
    public AddrSpace() {
        Stack = new int[MAX_SIZE];
        int i = 2;
        Arrays.fill(Stack, (int) (Math.random() * i));

        Heap = new int[MAX_SIZE];
//        i = 100;
        Arrays.fill(Heap, (int) (Math.random() * i));

        BSS = new int[MAX_SIZE];
//        i = 150;
        Arrays.fill(BSS, (int) (Math.random() * i));

        DataSeg = new int[MAX_SIZE];
//        i = 10;
        Arrays.fill(DataSeg, (int) (Math.random() * i));

        code = new int[MAX_SIZE];
//        i = 20;
        Arrays.fill(code, (int) (Math.random() * i));
    }

    private String getFromHeap() {
        StringBuilder str = new StringBuilder();
        for (int ss : Heap) {
            str.append(Integer.toString(ss)).append(" ");
        }
        return str.toString();
    }

    private String getFromStack() {
        StringBuilder str = new StringBuilder();
        for (int ss : Stack) {
            str.append(Integer.toString(ss)).append(" ");
        }
        return str.toString();
    }

    private String getFromBSS() {
        StringBuilder str = new StringBuilder();
        for (int ss : BSS) {
            str.append(Integer.toString(ss)).append(" ");
        }
        return str.toString();
    }

    private String getFromCode() {
        StringBuilder str = new StringBuilder();
        for (int ss : code) {
            str.append(Integer.toString(ss)).append(" ");
        }
        return str.toString();
    }

    private String getFromDataseg() {
        StringBuilder str = new StringBuilder();
        for (int ss : DataSeg) {
            str.append(Integer.toString(ss)).append(" ");
        }
        return str.toString();
    }

    public String getData() {
        return String.format("Heap\n%s\n\nStack\n%s\n\nDataSeg\n%s\n\nBSS\n%s\n\nCode\n%s\n\n", getFromHeap(), getFromStack(),getFromDataseg(), getFromBSS(), getFromCode());
    }
}
