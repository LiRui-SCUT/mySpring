package com.stringinaction.knights;

/**
 * Created by lirui on 16-5-16.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    @Override
    public void embarkQuest() {
        quest.embark();
    }
}
