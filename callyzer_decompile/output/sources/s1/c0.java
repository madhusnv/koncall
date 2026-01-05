package s1;

import k2.e1;
import k2.h2;
import kx.C4266h;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements h2 {

    /* renamed from: a */
    public final int f32050a;

    /* renamed from: b */
    public final int f32051b;

    /* renamed from: c */
    public final e1 f32052c;

    /* renamed from: d */
    public int f32053d;

    public c0(int i10, int i11, int i12) {
        this.f32050a = i11;
        this.f32051b = i12;
        int i13 = (i10 / i11) * i11;
        this.f32052c = new e1(w9.m11919j(Math.max(i13 - i12, 0), i13 + i11 + i12), k2.s0.f20547f);
        this.f32053d = i10;
    }

    /* renamed from: b */
    public final void m12843b(int i10) {
        if (i10 != this.f32053d) {
            this.f32053d = i10;
            int i11 = this.f32050a;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f32051b;
            this.f32052c.setValue(w9.m11919j(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    @Override // k2.h2
    public final Object getValue() {
        return (C4266h) this.f32052c.getValue();
    }
}
