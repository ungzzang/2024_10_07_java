package com.green.day27.ioc;

import com.green.day27.*;

import java.util.function.DoubleFunction;

public class GenelecSpeaker implements Speaker {
    private Woofer woofer;

    public GenelecSpeaker(Woofer woofer) { //외부에서 받는 이 행위를 DI 라고 한다.
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Genelec Speaker: 소리가 엄청나다.");
        woofer.baseSound();
    }
}
