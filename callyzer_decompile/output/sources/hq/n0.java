package hq;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import gv.C2735f;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import lq.C4508c;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f16259a;

    /* renamed from: b */
    public final /* synthetic */ C4508c f16260b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f16261c;

    /* renamed from: d */
    public final /* synthetic */ boolean f16262d;

    /* renamed from: e */
    public final /* synthetic */ boolean f16263e;

    /* renamed from: f */
    public final /* synthetic */ w0 f16264f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2139c f16265g;

    /* renamed from: h */
    public final /* synthetic */ w0 f16266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(List list, C4508c c4508c, InterfaceC2139c interfaceC2139c, boolean z6, boolean z10, w0 w0Var, InterfaceC2139c interfaceC2139c2, w0 w0Var2) {
        super(4);
        this.f16259a = list;
        this.f16260b = c4508c;
        this.f16261c = interfaceC2139c;
        this.f16262d = z6;
        this.f16263e = z10;
        this.f16264f = w0Var;
        this.f16265g = interfaceC2139c2;
        this.f16266h = w0Var2;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
            C9008h c9008h = (C9008h) this.f16259a.get(iIntValue);
            c3966o.m8607Y(-819747653);
            C4508c c4508c = this.f16260b;
            if (!c4508c.f22429b && !c4508c.f22430c && iIntValue >= c4508c.f22428a.size() - 5) {
                this.f16261c.invoke(mq.n0.f24305a);
            }
            w0 w0Var = this.f16264f;
            boolean zM8614g = c3966o.m8614g(w0Var);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C2735f(3, w0Var, this.f16266h);
                c3966o.j0(objM8596M);
            }
            a0.m7264j(c9008h, this.f16262d, this.f16263e, (InterfaceC2139c) objM8596M, this.f16265g, this.f16261c, c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
