package androidx.media;

import android.util.SparseIntArray;
import r8.InterfaceC6486c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC6486c {

    /* renamed from: b */
    public static final /* synthetic */ int f2763b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f2764a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2764a;
        return audioAttributesImpl == null ? audioAttributesCompat.f2764a == null : audioAttributesImpl.equals(audioAttributesCompat.f2764a);
    }

    public final int hashCode() {
        return this.f2764a.hashCode();
    }

    public final String toString() {
        return this.f2764a.toString();
    }
}
