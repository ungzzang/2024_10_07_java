package com.green.day27.ioc;

import com.green.day27.*;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woofer) { // 주는대로 받아쓴다. DI, 스프링에서는 생성자로 권장
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Bose Speaker: 소리가 짱짱하다.");
        woofer.baseSound();
    }
}
