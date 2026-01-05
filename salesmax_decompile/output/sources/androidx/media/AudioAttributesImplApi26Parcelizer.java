package androidx.media;

import android.media.AudioAttributes;
import p001o.vti;

/* loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(vti vtiVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f7780a = (AudioAttributes) vtiVar.m53443r(audioAttributesImplApi26.f7780a, 1);
        audioAttributesImplApi26.f7781b = vtiVar.m53441p(audioAttributesImplApi26.f7781b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, vti vtiVar) {
        vtiVar.m53449x(false, false);
        vtiVar.m53419H(audioAttributesImplApi26.f7780a, 1);
        vtiVar.m53417F(audioAttributesImplApi26.f7781b, 2);
    }
}
