package p020v;

import be.C0655j;
import c0.h1;
import i0.C3076g;
import i0.o1;
import i0.w2;
import i0.z0;
import p019u.C7286a;
import p024z.C8832a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends C7616z {

    /* renamed from: b */
    public static final u0 f36703b = new u0();

    @Override // p020v.C7616z
    /* renamed from: a */
    public final void mo14433a(w2 w2Var, C0655j c0655j) {
        super.mo14433a(w2Var, c0655j);
        if (!(w2Var instanceof z0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        z0 z0Var = (z0) w2Var;
        h1 h1Var = new h1(1);
        C3076g c3076g = z0.f16622b;
        if (z0Var.mo7404i(c3076g)) {
            C8832a.m16288a(((Integer) z0Var.mo7406k(c3076g)).intValue(), h1Var);
        }
        c0655j.m1875e(new C7286a(3, o1.m7399a(h1Var.f5106b)));
    }
}
