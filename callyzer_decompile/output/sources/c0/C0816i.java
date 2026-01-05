package c0;

import android.view.Surface;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.i */
/* loaded from: classes.dex */
public final class C0816i {

    /* renamed from: a */
    public final int f5107a;

    /* renamed from: b */
    public final Surface f5108b;

    public C0816i(int i10, Surface surface) {
        this.f5107a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f5108b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0816i)) {
            return false;
        }
        C0816i c0816i = (C0816i) obj;
        return this.f5107a == c0816i.f5107a && this.f5108b.equals(c0816i.f5108b);
    }

    public final int hashCode() {
        return ((this.f5107a ^ 1000003) * 1000003) ^ this.f5108b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f5107a + ", surface=" + this.f5108b + "}";
    }
}
