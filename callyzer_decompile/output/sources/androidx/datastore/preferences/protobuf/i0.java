package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b */
    public static final C0331v f2352b = new C0331v(1);

    /* renamed from: a */
    public final Object f2353a;

    public i0(C0318m c0318m) {
        b0.m820a(c0318m, "output");
        this.f2353a = c0318m;
        c0318m.f2370a = this;
    }

    /* renamed from: a */
    public void m922a(int i10, C0312g c0312g) {
        ((C0318m) this.f2353a).m990t(i10, c0312g);
    }

    /* renamed from: b */
    public void m923b(int i10, Object obj, a1 a1Var) {
        C0318m c0318m = (C0318m) this.f2353a;
        c0318m.m974E(i10, 3);
        a1Var.mo814e((AbstractC0306a) obj, c0318m.f2370a);
        c0318m.m974E(i10, 4);
    }

    public i0() {
        o0 o0Var;
        x0 x0Var = x0.f2424c;
        try {
            o0Var = (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f2352b;
        }
        o0[] o0VarArr = {C0331v.f2420b, o0Var};
        h0 h0Var = new h0();
        h0Var.f2337a = o0VarArr;
        Charset charset = b0.f2293a;
        this.f2353a = h0Var;
    }
}
