package s0;

import android.opengl.EGLSurface;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.c */
/* loaded from: classes.dex */
public final class C6699c {

    /* renamed from: a */
    public final EGLSurface f32016a;

    /* renamed from: b */
    public final int f32017b;

    /* renamed from: c */
    public final int f32018c;

    public C6699c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f32016a = eGLSurface;
        this.f32017b = i10;
        this.f32018c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6699c) {
            C6699c c6699c = (C6699c) obj;
            if (this.f32016a.equals(c6699c.f32016a) && this.f32017b == c6699c.f32017b && this.f32018c == c6699c.f32018c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f32016a.hashCode() ^ 1000003) * 1000003) ^ this.f32017b) * 1000003) ^ this.f32018c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f32016a);
        sb2.append(", width=");
        sb2.append(this.f32017b);
        sb2.append(", height=");
        return AbstractC5601a.m11233d(this.f32018c, "}", sb2);
    }
}
