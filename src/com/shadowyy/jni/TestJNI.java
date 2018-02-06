package com.shadowyy.jni;

public class TestJNI {
    public static native void beep(int frequency, int duration);
    public static native void sleep(int duration);

    public static void main(String[] args) {
        System.loadLibrary("libhello");
        refrenSolo();
        coupleSolo();
        refrenSolo();
    }

    private static final int C3  = 130;
    private static final int Db3  =138;
    private static final int D3  = 146;
    private static final int Eb3  =155;
    private static final int E3  = 164;
    private static final int F3  = 174;
    private static final int Gb3  =185;
    private static final int G3  = 196;
    private static final int Ab3  =207;
    private static final int A3  = 220;
    private static final int Bb3  =233;
    private static final int B3  = 246;

    private static final int C4  = 261;
    private static final int Db4  =277;
    private static final int D4  = 293;
    private static final int Eb4  =311;
    private static final int E4  = 329;
    private static final int F4  = 349;
    private static final int Gb4  =369;
    private static final int G4  = 392;
    private static final int Ab4  =415;
    private static final int A4  = 440;
    private static final int Bb4  =466;
    private static final int B4  = 493;

    private static final int C5  = 523;
    private static final int Db5  =544;
    private static final int D5  = 587;
    private static final int Eb5  =622;
    private static final int E5  = 659;
    private static final int F5  = 698;
    private static final int Gb5  =739;
    private static final int G5  = 783;
    private static final int Ab5  =830;
    private static final int A5  = 880;
    private static final int Bb5  =932;
    private static final int B5  = 987;

    private static final int C6  = 1046;
    private static final int Db6  =1108;
    private static final int D6  = 1174;
    private static final int Eb6  =1244;
    private static final int E6  = 1318;
    private static final int F6  = 1396;
    private static final int Gb6  =1479;
    private static final int G6  = 1567;
    private static final int Ab6  =1661;
    private static final int A6  = 1760;
    private static final int Bb6  =1864;
    private static final int B6  = 1975;

    private static final int C7  = 2093;
    private static final int Db7  =2217;
    private static final int D7  = 2349;
    private static final int Eb7  =2489;
    private static final int E7  = 2637;
    private static final int F7  = 2794;
    private static final int Gb7  =2960;
    private static final int G7  = 3136;
    private static final int Ab7  =3322;
    private static final int A7  = 3520;
    private static final int Bb7  =3729;
    private static final int B7  = 3951;

    private static final int full  =600;
    private static final int half  =full / 2;


    private static void refrenSolo()
    {
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

    private static void coupleSolo()
    {
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

}