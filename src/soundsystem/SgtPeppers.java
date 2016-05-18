package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by lirui on 16-5-17.
 */
@Component
public class SgtPeppers implements CD {
    private String title = "hearts club band";
    private String author = "The Beatles";
    @Override
    public void play() {
        System.out.print("playing" + title + " by " + author);
    }
}
