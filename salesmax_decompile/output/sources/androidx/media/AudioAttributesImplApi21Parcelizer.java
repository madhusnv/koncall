package androidx.media;

import android.media.AudioAttributes;
import p001o.vti;

/* loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(vti vtiVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f7780a = (AudioAttributes) vtiVar.m53443r(audioAttributesImplApi21.f7780a, 1);
        audioAttributesImplApi21.f7781b = vtiVar.m53441p(audioAttributesImplApi21.f7781b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, vti vtiVar) {
        vtiVar.m53449x(false, false);
        vtiVar.m53419H(audioAttributesImplApi21.f7780a, 1);
        vtiVar.m53417F(audioAttributesImplApi21.f7781b, 2);
    }
}
