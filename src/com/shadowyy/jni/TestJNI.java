package com.shadowyy.jni;

public class TestJNI {
    public static native void beep(int frequency, int duration);

    public static void beep1(double frequency, int duration) {
        beep((int) frequency, duration);
    }

    public static native void sleep(int duration);

    public static void main(String[] args) throws Exception {
        System.loadLibrary("libhello");

        //mario1();
        //mario2();
        jingle();
        //tetris();

    }

    /**
     * Mario Bros Theme 1
     */
    private static void mario1() throws Exception {
        beep(330, 100);
        sleep(100);
        beep(330, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(330, 100);
        sleep(300);
        beep(392, 100);
        sleep(700);
        beep(196, 100);
        sleep(700);
        beep(262, 300);
        sleep(300);
        beep(196, 300);
        sleep(300);
        beep(164, 300);
        sleep(300);
        beep(220, 300);
        sleep(100);
        beep(246, 100);
        sleep(300);
        beep(233, 200);
        beep(220, 100);
        sleep(300);
        beep(196, 100);
        sleep(150);
        beep(330, 100);
        sleep(150);
        beep(392, 100);
        sleep(150);
        beep(440, 100);
        sleep(300);
        beep(349, 100);
        sleep(100);
        beep(392, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(100);
        beep(247, 100);
        sleep(500);
        beep(262, 300);
        sleep(300);
        beep(196, 300);
        sleep(300);
        beep(164, 300);
        sleep(300);
        beep(220, 300);
        sleep(100);
        beep(246, 100);
        sleep(300);
        beep(233, 200);
        beep(220, 100);
        sleep(300);
        beep(196, 100);
        sleep(150);
        beep(330, 100);
        sleep(150);
        beep(392, 100);
        sleep(150);
        beep(440, 100);
        sleep(300);
        beep(349, 100);
        sleep(100);
        beep(392, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(100);
        beep(247, 100);
        sleep(900);
        beep(392, 100);
        sleep(100);
        beep(370, 100);
        sleep(100);
        beep(349, 100);
        sleep(100);
        beep(311, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(207, 100);
        sleep(100);
        beep(220, 100);
        sleep(100);
        beep(262, 100);
        sleep(300);
        beep(220, 100);
        sleep(100);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(500);
        beep(392, 100);
        sleep(100);
        beep(370, 100);
        sleep(100);
        beep(349, 100);
        sleep(100);
        beep(311, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(523, 100);
        sleep(300);
        beep(523, 100);
        sleep(100);
        beep(523, 100);
        sleep(1100);
        beep(392, 100);
        sleep(100);
        beep(370, 100);
        sleep(100);
        beep(349, 100);
        sleep(100);
        beep(311, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(207, 100);
        sleep(100);
        beep(220, 100);
        sleep(100);
        beep(262, 100);
        sleep(300);
        beep(220, 100);
        sleep(100);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(500);
        beep(311, 300);
        sleep(300);
        beep(296, 300);
        sleep(300);
        beep(262, 300);
        sleep(1300);
        beep(262, 100);
        sleep(100);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(300);
        beep(330, 200);
        sleep(50);
        beep(262, 200);
        sleep(50);
        beep(220, 200);
        sleep(50);
        beep(196, 100);
        sleep(700);
        beep(262, 100);
        sleep(100);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(100);
        beep(330, 100);
        sleep(700);
        beep(440, 100);
        sleep(300);
        beep(392, 100);
        sleep(500);
        beep(262, 100);
        sleep(100);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(294, 100);
        sleep(300);
        beep(330, 200);
        sleep(50);
        beep(262, 200);
        sleep(50);
        beep(220, 200);
        sleep(50);
        beep(196, 100);
        sleep(700);
        //Intro
        beep(330, 100);
        sleep(100);
        beep(330, 100);
        sleep(300);
        beep(330, 100);
        sleep(300);
        beep(262, 100);
        sleep(100);
        beep(330, 100);
        sleep(300);
        beep(392, 100);
        sleep(700);
        beep(196, 100);
        sleep(700);
        beep(196, 100);
        sleep(125);
        beep(262, 100);
        sleep(125);
        beep(330, 100);
        sleep(125);
        beep(392, 100);
        sleep(125);
        beep(523, 100);
        sleep(125);
        beep(660, 100);
        sleep(125);
        beep(784, 100);
        sleep(575);
        beep(660, 100);
        sleep(575);
        beep(207, 100);
        sleep(125);
        beep(262, 100);
        sleep(125);
        beep(311, 100);
        sleep(125);
        beep(415, 100);
        sleep(125);
        beep(523, 100);
        sleep(125);
        beep(622, 100);
        sleep(125);
        beep(830, 100);
        sleep(575);
        beep(622, 100);
        sleep(575);
        beep(233, 100);
        sleep(125);
        beep(294, 100);
        sleep(125);
        beep(349, 100);
        sleep(125);
        beep(466, 100);
        sleep(125);
        beep(587, 100);
        sleep(125);
        beep(698, 100);
        sleep(125);
        beep(932, 100);
        sleep(575);
        beep(932, 100);
        sleep(125);
        beep(932, 100);
        sleep(125);
        beep(932, 100);
        sleep(125);
        beep(1046, 675);
    }

    /**
     * Mario Bros Theme 2
     */
    private static void mario2() throws Exception {

        beep1(480, 200);

        beep1(1568, 200);

        beep1(1568, 200);

        beep1(1568, 200);


        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);


        beep1(369.99, 200);

        beep1(392, 200);

        beep1(369.99, 200);

        beep1(392, 200);

        beep1(392, 400);

        beep1(196, 400);


        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(83.99, 200);

        beep1(880, 200);

        beep1(830.61, 200);

        beep1(880, 200);

        beep1(987.77, 400);


        beep1(880, 200);

        beep1(783.99, 200);

        beep1(698.46, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(880, 200);

        beep1(830.61, 200);

        beep1(880, 200);

        beep1(987.77, 400);

        sleep(200);

        beep1(1108, 10);
        beep1(1174.7, 200);
        beep1(1480, 10);
        beep1(1568, 200);


        sleep(200);
        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(783.99, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(880, 200);

        beep1(830.61, 200);

        beep1(880, 200);

        beep1(987.77, 400);


        beep1(880, 200);

        beep1(783.99, 200);

        beep1(698.46, 200);


        beep1(659.25, 200);

        beep1(698.46, 200);

        beep1(784, 200);

        beep1(880, 400);

        beep1(784, 200);

        beep1(698.46, 200);

        beep1(659.25, 200);


        beep1(587.33, 200);

        beep1(659.25, 200);

        beep1(698.46, 200);

        beep1(784, 400);

        beep1(698.46, 200);

        beep1(659.25, 200);

        beep1(587.33, 200);


        beep1(523.25, 200);

        beep1(587.33, 200);

        beep1(659.25, 200);

        beep1(698.46, 400);

        beep1(659.25, 200);

        beep1(587.33, 200);

        beep1(493.88, 200);

        beep1(523.25, 200);


        sleep(400);
        beep1(349.23, 400);

        beep1(392, 200);

        beep1(329.63, 200);

        beep1(523.25, 200);

        beep1(493.88, 200);

        beep1(466.16, 200);


        beep1(440, 200);

        beep1(493.88, 200);

        beep1(523.25, 200);

        beep1(880, 200);

        beep1(493.88, 200);

        beep1(880, 200);

        beep1(1760, 200);

        beep1(440, 200);


        beep1(392, 200);

        beep1(440, 200);

        beep1(493.88, 200);

        beep1(783.99, 200);

        beep1(440, 200);

        beep1(783.99, 200);

        beep1(1568, 200);

        beep1(392, 200);


        beep1(349.23, 200);

        beep1(392, 200);

        beep1(440, 200);

        beep1(698.46, 200);

        beep1(415.2, 200);

        beep1(698.46, 200);

        beep1(1396.92, 200);

        beep1(349.23, 200);


        beep1(329.63, 200);

        beep1(311.13, 200);

        beep1(329.63, 200);

        beep1(659.25, 200);

        beep1(698.46, 400);

        beep1(783.99, 400);


        beep1(440, 200);

        beep1(493.88, 200);

        beep1(523.25, 200);

        beep1(880, 200);

        beep1(493.88, 200);

        beep1(880, 200);

        beep1(1760, 200);

        beep1(440, 200);


        beep1(392, 200);

        beep1(440, 200);

        beep1(493.88, 200);

        beep1(783.99, 200);

        beep1(440, 200);

        beep1(783.99, 200);

        beep1(1568, 200);

        beep1(392, 200);


        beep1(349.23, 200);

        beep1(392, 200);

        beep1(440, 00);

        beep1(698.46, 200);

        beep1(659.25, 200);

        beep1(698.46, 200);

        beep1(739.99, 200);

        beep1(783.99, 200);

        beep1(392, 200);

        beep1(392, 200);

        beep1(392, 200);

        beep1(392, 200);

        beep1(196, 200);

        beep1(196, 200);

        beep1(196, 200);


        beep1(185, 200);

        beep1(196, 200);

        beep1(185, 200);

        beep1(196, 200);

        beep1(207.65, 200);

        beep1(220, 200);

        beep1(233.08, 200);

        beep1(246.94, 200);
    }

    /**
     * jingle bells
     */
    private static void jingle() throws Exception {
        refrenSolo();
        coupleSolo();
        refrenSolo();
    }


    /**
     * tetris song
     */
    private static void tetris() throws Exception {
        beep(658, 125);
        beep(1320, 500);
        beep(990, 250);
        beep(1056, 250);
        beep(1188, 250);
        beep(1320, 125);
        beep(1188, 125);
        beep(1056, 250);
        beep(990, 250);
        beep(880, 500);
        beep(880, 250);
        beep(1056, 250);
        beep(1320, 500);
        beep(1188, 250);
        beep(1056, 250);
        beep(990, 750);
        beep(1056, 250);
        beep(1188, 500);
        beep(1320, 500);
        beep(1056, 500);
        beep(880, 500);
        beep(880, 500);
        sleep(250);
        beep(1188, 500);
        beep(1408, 250);
        beep(1760, 500);
        beep(1584, 250);
        beep(1408, 250);
        beep(1320, 750);
        beep(1056, 250);
        beep(1320, 500);
        beep(1188, 250);
        beep(1056, 250);
        beep(990, 500);
        beep(990, 250);
        beep(1056, 250);
        beep(1188, 500);
        beep(1320, 500);
        beep(1056, 500);
        beep(880, 500);
        beep(880, 500);
        sleep(500);
        beep(1320, 500);
        beep(990, 250);
        beep(1056, 250);
        beep(1188, 250);
        beep(1320, 125);
        beep(1188, 125);
        beep(1056, 250);
        beep(990, 250);
        beep(880, 500);
        beep(880, 250);
        beep(1056, 250);
        beep(1320, 500);
        beep(1188, 250);
        beep(1056, 250);
        beep(990, 750);
        beep(1056, 250);
        beep(1188, 500);
        beep(1320, 500);
        beep(1056, 500);
        beep(880, 500);
        beep(880, 500);
        sleep(250);
        beep(1188, 500);
        beep(1408, 250);
        beep(1760, 500);
        beep(1584, 250);
        beep(1408, 250);
        beep(1320, 750);
        beep(1056, 250);
        beep(1320, 500);
        beep(1188, 250);
        beep(1056, 250);
        beep(990, 500);
        beep(990, 250);
        beep(1056, 250);
        beep(1188, 500);
        beep(1320, 500);
        beep(1056, 500);
        beep(880, 500);
        beep(880, 500);
        sleep(500);
        beep(660, 1000);
        beep(528, 1000);
        beep(594, 1000);
        beep(495, 1000);
        beep(528, 1000);
        beep(440, 1000);
        beep(419, 1000);
        beep(495, 1000);
        beep(660, 1000);
        beep(528, 1000);
        beep(594, 1000);
        beep(495, 1000);
        beep(528, 500);
        beep(660, 500);
        beep(880, 1000);
        beep(838, 2000);
        beep(660, 1000);
        beep(528, 1000);
        beep(594, 1000);
        beep(495, 1000);
        beep(528, 1000);
        beep(440, 1000);
        beep(419, 1000);
        beep(495, 1000);
        beep(660, 1000);
        beep(528, 1000);
        beep(594, 1000);
        beep(495, 1000);
        beep(528, 500);
        beep(660, 500);
        beep(880, 1000);
        beep(838, 2000);
    }

    private static void refrenSolo() {
        beep(E5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(E5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(E5, half);
        beep(G5, half);
        beep(C5, half);
        beep(D5, half);
        beep(E5, half);

        beep(C4, half);
        beep(D4, half);
        beep(E4, half);

        beep(F5, half);
        beep(F5, half);
        beep(F5, half);

        sleep(half);

        beep(F5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(E5, half);
        beep(D5, half);
        beep(D5, half);
        beep(E5, half);
        beep(D5, half);

        sleep(half);

        beep(G5, half);

        sleep(half);

        // -----------

        beep(E5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(E5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(E5, half);
        beep(G5, half);
        beep(C5, half);
        beep(D5, half);
        beep(E5, half);

        beep(C4, half);
        beep(D4, half);
        beep(E4, half);

        beep(F5, half);
        beep(F5, half);
        beep(F5, half);

        sleep(half);

        beep(F5, half);
        beep(E5, half);
        beep(E5, half);

        sleep(half);

        beep(G5, half);
        beep(G5, half);
        beep(F5, half);
        beep(D5, half);
        beep(C5, full);

        sleep(full);
    }

    private static void coupleSolo() {
        beep(G4, half);
        beep(E5, half);
        beep(D5, half);
        beep(C5, half);
        beep(G4, full);

        sleep(half * 2);

        beep(G4, half);
        beep(E5, half);
        beep(D5, half);
        beep(C5, half);
        beep(A4, full);

        sleep(full);

        beep(A4, half);
        beep(F5, half);
        beep(E5, half);
        beep(D5, half);
        beep(G5, full);

        sleep(full);

        beep(A5, half);
        beep(A5, half);
        beep(G5, half);
        beep(Eb5, half);
        beep(E5, full);

        sleep(full);

        // -----------

        beep(G4, half);
        beep(E5, half);
        beep(D5, half);
        beep(C5, half);
        beep(G4, full);

        sleep(full);

        beep(G4, half);
        beep(E5, half);
        beep(D5, half);
        beep(C5, half);
        beep(A4, full);

        sleep(full);

        beep(A4, half);
        beep(F5, half);
        beep(E5, half);
        beep(D5, half);
        beep(G5, full);

        sleep(full);

        beep(A5, half);
        beep(G5, half);
        beep(F5, half);
        beep(D5, half);
        beep(C5, full);

        sleep(full);
    }


    private static final int C3 = 130;
    private static final int Db3 = 138;
    private static final int D3 = 146;
    private static final int Eb3 = 155;
    private static final int E3 = 164;
    private static final int F3 = 174;
    private static final int Gb3 = 185;
    private static final int G3 = 196;
    private static final int Ab3 = 207;
    private static final int A3 = 220;
    private static final int Bb3 = 233;
    private static final int B3 = 246;

    private static final int C4 = 261;
    private static final int Db4 = 277;
    private static final int D4 = 293;
    private static final int Eb4 = 311;
    private static final int E4 = 329;
    private static final int F4 = 349;
    private static final int Gb4 = 369;
    private static final int G4 = 392;
    private static final int Ab4 = 415;
    private static final int A4 = 440;
    private static final int Bb4 = 466;
    private static final int B4 = 493;

    private static final int C5 = 523;
    private static final int Db5 = 544;
    private static final int D5 = 587;
    private static final int Eb5 = 622;
    private static final int E5 = 659;
    private static final int F5 = 698;
    private static final int Gb5 = 739;
    private static final int G5 = 783;
    private static final int Ab5 = 830;
    private static final int A5 = 880;
    private static final int Bb5 = 932;
    private static final int B5 = 987;

    private static final int C6 = 1046;
    private static final int Db6 = 1108;
    private static final int D6 = 1174;
    private static final int Eb6 = 1244;
    private static final int E6 = 1318;
    private static final int F6 = 1396;
    private static final int Gb6 = 1479;
    private static final int G6 = 1567;
    private static final int Ab6 = 1661;
    private static final int A6 = 1760;
    private static final int Bb6 = 1864;
    private static final int B6 = 1975;

    private static final int C7 = 2093;
    private static final int Db7 = 2217;
    private static final int D7 = 2349;
    private static final int Eb7 = 2489;
    private static final int E7 = 2637;
    private static final int F7 = 2794;
    private static final int Gb7 = 2960;
    private static final int G7 = 3136;
    private static final int Ab7 = 3322;
    private static final int A7 = 3520;
    private static final int Bb7 = 3729;
    private static final int B7 = 3951;

    private static final int full = 600;
    private static final int half = full / 2;

}