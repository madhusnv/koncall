package v3;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import m2.C4640e;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.e */
/* loaded from: classes.dex */
public final class C7633e extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7633e f36795b;

    /* renamed from: c */
    public static final C7633e f36796c;

    /* renamed from: d */
    public static final C7633e f36797d;

    /* renamed from: e */
    public static final C7633e f36798e;

    /* renamed from: f */
    public static final C7633e f36799f;

    /* renamed from: g */
    public static final C7633e f36800g;

    /* renamed from: h */
    public static final C7633e f36801h;

    /* renamed from: j */
    public static final C7633e f36802j;

    /* renamed from: k */
    public static final C7633e f36803k;

    /* renamed from: l */
    public static final C7633e f36804l;

    /* renamed from: m */
    public static final C7633e f36805m;

    /* renamed from: n */
    public static final C7633e f36806n;

    /* renamed from: a */
    public final /* synthetic */ int f36807a;

    static {
        int i10 = 1;
        f36795b = new C7633e(i10, 0);
        f36796c = new C7633e(i10, 1);
        f36797d = new C7633e(i10, 2);
        f36798e = new C7633e(i10, 3);
        f36799f = new C7633e(i10, 4);
        f36800g = new C7633e(i10, 5);
        f36801h = new C7633e(i10, 6);
        f36802j = new C7633e(i10, 7);
        f36803k = new C7633e(i10, 8);
        f36804l = new C7633e(i10, 9);
        f36805m = new C7633e(i10, 10);
        f36806n = new C7633e(i10, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7633e(int i10, int i11) {
        super(i10);
        this.f36807a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f36807a) {
            case 0:
                ((C7631c) obj).N0();
                break;
            case 1:
                t1 t1Var = (t1) obj;
                if (t1Var.mo14534n()) {
                    t1Var.f37014b.u0(t1Var);
                }
                break;
            case 2:
                o1 o1Var = ((h1) obj).f36901K;
                if (o1Var != null) {
                    o1Var.invalidate();
                }
                break;
            case 3:
                h1 h1Var = (h1) obj;
                if (h1Var.mo14534n() && h1Var.q1(true)) {
                    g0 g0Var = h1Var.f36902m;
                    k0 k0Var = g0Var.f36833L;
                    if (k0Var.f36939l > 0) {
                        if (k0Var.f36938k || k0Var.f36937j) {
                            g0Var.m14590V(false);
                        }
                        k0Var.f36943p.z0();
                    }
                    C7904v c7904v = (C7904v) j0.m14636a(g0Var);
                    c7904v.getRectManager().m5698e(g0Var);
                    ((C4640e) c7904v.f44844h0.f37032e.f5668b).m9506b(g0Var);
                    g0Var.f36841Z = true;
                    c7904v.m15025G(null);
                }
                break;
            case 4:
                m1 m1Var = (m1) obj;
                if (m1Var.mo14534n()) {
                    m1Var.f36951a.c0();
                }
                break;
            case 5:
                g0 g0Var2 = (g0) obj;
                if (g0Var2.m14578H()) {
                    g0Var2.m14590V(false);
                }
                break;
            case 6:
                g0 g0Var3 = (g0) obj;
                if (g0Var3.m14578H()) {
                    g0Var3.m14590V(false);
                }
                break;
            case 7:
                g0 g0Var4 = (g0) obj;
                if (g0Var4.m14578H()) {
                    g0Var4.m14589T(false);
                }
                break;
            case 8:
                g0 g0Var5 = (g0) obj;
                if (g0Var5.m14578H()) {
                    g0Var5.m14589T(false);
                }
                break;
            case 9:
                g0 g0Var6 = (g0) obj;
                if (g0Var6.m14578H()) {
                    g0.m14567U(g0Var6, false, 7);
                }
                break;
            case 10:
                g0 g0Var7 = (g0) obj;
                if (g0Var7.m14578H()) {
                    g0.m14568W(g0Var7, false, 7);
                }
                break;
            default:
                g0 g0Var8 = (g0) obj;
                if (g0Var8.m14578H()) {
                    g0Var8.m14576F();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
