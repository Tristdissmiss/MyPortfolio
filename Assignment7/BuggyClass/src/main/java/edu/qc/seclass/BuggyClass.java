package edu.qc.seclass;

public class BuggyClass {
    public int buggyMethod1(int x) {
        if (x == 0) {
            return 1 / 1;
        }
        return 1 / 0;
    }

    public int buggyMethod2(int x) {
        if (x > 0) {
            return 1 / 1;
        } else if (x < 0) {
            return 1 / 0;
        }
        return 0;
    }

    public int buggyMethod3(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        }
        return x / 0;
    }

    public int buggyMethod4(int x) {
        if (x % 2 == 0) {
            return x / 2;
        }
        return x / 0;
    }

    public void buggyMethod5(int i) {
        if (i == 0) {
            return;
        }
        int x = i / 0;
    }
}
