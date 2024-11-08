package com.green.day27.noneioc;

import com.green.day27.*;


public class SamsungTv implements Tv {
    private Speaker speaker ;

    public SamsungTv() {
        //this.speaker = new HarmanSpeaker();
        this.speaker = new JBLSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv: 소리가 난다."); // 얘는 나오는데
        speaker.speakerSound(); // 얘는 speaker 에 주소값을 안넣으면 안나옴.
    }
}
