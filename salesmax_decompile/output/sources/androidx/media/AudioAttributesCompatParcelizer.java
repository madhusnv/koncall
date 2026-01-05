package androidx.media;

import java.lang.reflect.InvocationTargetException;
import p001o.vti;

/* loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(vti vtiVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f7779a = (AudioAttributesImpl) vtiVar.m53447v(audioAttributesCompat.f7779a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, vti vtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vtiVar.m53449x(false, false);
        vtiVar.m53424M(audioAttributesCompat.f7779a, 1);
    }
}
