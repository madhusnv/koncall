package x1;

import androidx.compose.ui.input.key.AbstractC0261a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4381z;
import l4.InterfaceC4374s;
import lx.InterfaceC4566e;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ v0 f39535a;

    /* renamed from: b */
    public final /* synthetic */ b2.y0 f39536b;

    /* renamed from: c */
    public final /* synthetic */ C4381z f39537c;

    /* renamed from: d */
    public final /* synthetic */ boolean f39538d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39539e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC4374s f39540f;

    /* renamed from: g */
    public final /* synthetic */ u1 f39541g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f39542h;

    /* renamed from: j */
    public final /* synthetic */ int f39543j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(v0 v0Var, b2.y0 y0Var, C4381z c4381z, boolean z6, boolean z10, InterfaceC4374s interfaceC4374s, u1 u1Var, InterfaceC2139c interfaceC2139c, int i10) {
        super(3);
        this.f39535a = v0Var;
        this.f39536b = y0Var;
        this.f39537c = c4381z;
        this.f39538d = z6;
        this.f39539e = z10;
        this.f39540f = interfaceC4374s;
        this.f39541g = u1Var;
        this.f39542h = interfaceC2139c;
        this.f39543j = i10;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(851809892);
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (objM8596M == s0Var) {
            objM8596M = new b2.g1();
            c3966o.j0(objM8596M);
        }
        b2.g1 g1Var = (b2.g1) objM8596M;
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == s0Var) {
            objM8596M2 = new i0();
            c3966o.j0(objM8596M2);
        }
        InterfaceC2139c interfaceC2139c = this.f39542h;
        int i10 = this.f39543j;
        h1 h1Var = new h1(this.f39535a, this.f39536b, this.f39537c, this.f39538d, this.f39539e, g1Var, this.f39540f, this.f39541g, (i0) objM8596M2, interfaceC2139c, i10);
        boolean zM8616i = c3966o.m8616i(h1Var);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8616i || objM8596M3 == s0Var) {
            vr.b0 b0Var = new vr.b0(1, h1Var, h1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 14);
            c3966o.j0(b0Var);
            objM8596M3 = b0Var;
        }
        InterfaceC7879r interfaceC7879rM716a = AbstractC0261a.m716a(C7876o.f37669a, (InterfaceC2139c) ((InterfaceC4566e) objM8596M3));
        c3966o.m8623p(false);
        return interfaceC7879rM716a;
    }
}
