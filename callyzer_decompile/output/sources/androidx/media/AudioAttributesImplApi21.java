package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f2765a;

    /* renamed from: b */
    public int f2766b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2765a.equals(((AudioAttributesImplApi21) obj).f2765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2765a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2765a;
    }
}
