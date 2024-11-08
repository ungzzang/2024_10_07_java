package com.green.day27.ioc;

import com.green.day27.*;

public class LgTv implements Tv {

    private Speaker speaker;

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Lg Tv: 소리가 난다.");
        speaker.speakerSound();
    }
}
