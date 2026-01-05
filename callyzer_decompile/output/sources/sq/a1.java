package sq;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import aw.C0471k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g2.x9;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import or.AbstractC5453p;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a1 extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f32730a;

    /* renamed from: b */
    public final /* synthetic */ x9 f32731b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f32732c;

    /* renamed from: d */
    public final /* synthetic */ Object f32733d;

    /* renamed from: e */
    public final /* synthetic */ String f32734e;

    /* renamed from: f */
    public final /* synthetic */ int f32735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(List list, x9 x9Var, InterfaceC2139c interfaceC2139c, Object obj, String str, int i10) {
        super(4);
        this.f32730a = list;
        this.f32731b = x9Var;
        this.f32732c = interfaceC2139c;
        this.f32733d = obj;
        this.f32734e = str;
        this.f32735f = i10;
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
            AbstractC5453p abstractC5453p = (AbstractC5453p) this.f32730a.get(iIntValue);
            c3966o.m8607Y(1630607699);
            String strMo11152d = abstractC5453p.mo11152d();
            boolean zMo11155g = abstractC5453p.mo11155g();
            InterfaceC2139c interfaceC2139c = this.f32732c;
            boolean zM8614g = c3966o.m8614g(interfaceC2139c) | c3966o.m8616i(abstractC5453p);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C0471k(11, interfaceC2139c, abstractC5453p);
                c3966o.j0(objM8596M);
            }
            b1.m13075E(strMo11152d, zMo11155g, this.f32731b, (InterfaceC2137a) objM8596M, "", AbstractC6740i.m12902d(-1558690047, new z0(this.f32733d, this.f32734e, abstractC5453p, this.f32732c, this.f32735f), c3966o), c3966o, 221184, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
