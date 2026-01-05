package p019u;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u.c */
/* loaded from: classes.dex */
public final class C7288c implements AutoCloseable {

    /* renamed from: a */
    public final OutputConfiguration f34760a;

    /* renamed from: b */
    public final ImageReader f34761b;

    public C7288c(OutputConfiguration outputConfiguration, ImageReader imageReader) {
        this.f34760a = outputConfiguration;
        this.f34761b = imageReader;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.f34761b;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7288c)) {
            return false;
        }
        C7288c c7288c = (C7288c) obj;
        return AbstractC4154l.m8918a(this.f34760a, c7288c.f34760a) && AbstractC4154l.m8918a(this.f34761b, c7288c.f34761b);
    }

    public final int hashCode() {
        int iHashCode = this.f34760a.hashCode() * 31;
        ImageReader imageReader = this.f34761b;
        return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.f34760a + ", backingImageReader=" + this.f34761b + ')';
    }
}
