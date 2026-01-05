package c0;

import android.util.Size;
import b0.C0515g;
import i0.C3076g;
import i0.w2;
import p0.AbstractC5787a;
import t0.C6973a;
import t0.C6974b;
import t0.C6975c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public static final i0.y0 f5104a;

    static {
        Object size = new Size(640, 480);
        Size size2 = AbstractC5787a.f28369b;
        C6975c c6975c = new C6975c();
        c6975c.f33751a = size2;
        c6975c.f33752b = 1;
        Object c6974b = new C6974b(C6973a.f33747a, c6975c);
        C0515g c0515g = new C0515g(1);
        C3076g c3076g = i0.b1.f44337m0;
        i0.j1 j1Var = c0515g.f3583b;
        j1Var.m7352n(c3076g, size);
        j1Var.m7352n(w2.f44347w0, 1);
        j1Var.m7352n(i0.b1.f44332g0, 0);
        j1Var.m7352n(i0.b1.f44340p0, c6974b);
        a0 a0Var = a0.f5035d;
        if (!a0Var.equals(a0Var)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        j1Var.m7352n(i0.a1.f44331f0, a0Var);
        f5104a = new i0.y0(i0.o1.m7399a(j1Var));
    }
}
