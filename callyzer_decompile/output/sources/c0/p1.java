package c0;

import android.util.Size;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 extends d0 {

    /* renamed from: d */
    public final Object f5191d;

    /* renamed from: e */
    public final w0 f5192e;

    /* renamed from: f */
    public final int f5193f;

    /* renamed from: g */
    public final int f5194g;

    public p1(b1 b1Var, Size size, w0 w0Var) {
        super(b1Var);
        this.f5191d = new Object();
        if (size == null) {
            this.f5193f = this.f5064b.mo2136b();
            this.f5194g = this.f5064b.getHeight();
        } else {
            this.f5193f = size.getWidth();
            this.f5194g = size.getHeight();
        }
        this.f5192e = w0Var;
    }

    @Override // c0.d0, c0.b1
    /* renamed from: X */
    public final w0 mo2135X() {
        return this.f5192e;
    }

    @Override // c0.d0, c0.b1
    /* renamed from: b */
    public final int mo2136b() {
        return this.f5193f;
    }

    @Override // c0.d0, c0.b1
    public final int getHeight() {
        return this.f5194g;
    }
}
