package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes2.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f7780a;

    /* renamed from: b */
    public int f7781b;

    public AudioAttributesImplApi21() {
        this.f7781b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f7780a.equals(((AudioAttributesImplApi21) obj).f7780a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7780a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f7780a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f7780a = audioAttributes;
        this.f7781b = i;
    }
}
