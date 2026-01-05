package androidx.media;

import android.media.AudioAttributes;
import r8.AbstractC6484a;
import r8.C6485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC6484a abstractC6484a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2765a = (AudioAttributes) abstractC6484a.m12491g(audioAttributesImplApi21.f2765a, 1);
        audioAttributesImplApi21.f2766b = abstractC6484a.m12490f(audioAttributesImplApi21.f2766b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC6484a abstractC6484a) {
        abstractC6484a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2765a;
        abstractC6484a.mo12493i(1);
        ((C6485b) abstractC6484a).f31155e.writeParcelable(audioAttributes, 0);
        abstractC6484a.m12494j(audioAttributesImplApi21.f2766b, 2);
    }
}
