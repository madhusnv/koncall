package androidx.media;

import java.lang.reflect.InvocationTargetException;
import r8.AbstractC6484a;
import r8.InterfaceC6486c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC6484a abstractC6484a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC6486c interfaceC6486cM12492h = audioAttributesCompat.f2764a;
        if (abstractC6484a.mo12489e(1)) {
            interfaceC6486cM12492h = abstractC6484a.m12492h();
        }
        audioAttributesCompat.f2764a = (AudioAttributesImpl) interfaceC6486cM12492h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC6484a abstractC6484a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC6484a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2764a;
        abstractC6484a.mo12493i(1);
        abstractC6484a.m12495k(audioAttributesImpl);
    }
}
