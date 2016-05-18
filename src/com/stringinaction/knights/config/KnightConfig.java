package com.stringinaction.knights.config;

import com.stringinaction.knights.BraveKnight;
import com.stringinaction.knights.Knight;
import com.stringinaction.knights.Quest;
import com.stringinaction.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lirui on 16-5-16.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
