package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import p001o.vti;

/* loaded from: classes2.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(vti vtiVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(vtiVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, vti vtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, vtiVar);
    }
}
