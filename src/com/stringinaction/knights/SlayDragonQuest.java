package com.stringinaction.knights;

import java.io.PrintStream;

/**
 * Created by lirui on 16-5-16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void embark() {
        stream.println("embarking on quest to slay the dragon!");
    }
}
