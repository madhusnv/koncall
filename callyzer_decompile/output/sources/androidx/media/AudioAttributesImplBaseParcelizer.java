package androidx.media;

import r8.AbstractC6484a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC6484a abstractC6484a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2767a = abstractC6484a.m12490f(audioAttributesImplBase.f2767a, 1);
        audioAttributesImplBase.f2768b = abstractC6484a.m12490f(audioAttributesImplBase.f2768b, 2);
        audioAttributesImplBase.f2769c = abstractC6484a.m12490f(audioAttributesImplBase.f2769c, 3);
        audioAttributesImplBase.f2770d = abstractC6484a.m12490f(audioAttributesImplBase.f2770d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC6484a abstractC6484a) {
        abstractC6484a.getClass();
        abstractC6484a.m12494j(audioAttributesImplBase.f2767a, 1);
        abstractC6484a.m12494j(audioAttributesImplBase.f2768b, 2);
        abstractC6484a.m12494j(audioAttributesImplBase.f2769c, 3);
        abstractC6484a.m12494j(audioAttributesImplBase.f2770d, 4);
    }
}
