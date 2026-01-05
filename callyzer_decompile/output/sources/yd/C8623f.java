package yd;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.f */
/* loaded from: classes.dex */
public final class C8623f {

    /* renamed from: a */
    public final BitmapDrawable f41895a;

    /* renamed from: b */
    public final boolean f41896b;

    public C8623f(BitmapDrawable bitmapDrawable, boolean z6) {
        this.f41895a = bitmapDrawable;
        this.f41896b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8623f)) {
            return false;
        }
        C8623f c8623f = (C8623f) obj;
        return this.f41895a.equals(c8623f.f41895a) && this.f41896b == c8623f.f41896b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41896b) + (this.f41895a.hashCode() * 31);
    }
}
