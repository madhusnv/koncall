package zq;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import br.C0739b;
import bt.r0;
import cr.C1480b;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import fp.C2364d;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zq.d */
/* loaded from: classes3.dex */
public final class C9021d extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f43449a;

    /* renamed from: b */
    public final /* synthetic */ C0739b f43450b;

    /* renamed from: c */
    public final /* synthetic */ EnumC7204p f43451c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f43452d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f43453e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f43454f;

    /* renamed from: g */
    public final /* synthetic */ w0 f43455g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9021d(List list, C0739b c0739b, EnumC7204p enumC7204p, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, w0 w0Var) {
        super(4);
        this.f43449a = list;
        this.f43450b = c0739b;
        this.f43451c = enumC7204p;
        this.f43452d = interfaceC2139c;
        this.f43453e = interfaceC2139c2;
        this.f43454f = interfaceC2139c3;
        this.f43455g = w0Var;
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
            C1480b c1480b = (C1480b) this.f43449a.get(iIntValue);
            c3966o.m8607Y(1643239574);
            List list = this.f43450b.f4666i;
            Object objM8596M = c3966o.m8596M();
            Object obj5 = C3961j.f20408a;
            if (objM8596M == obj5) {
                objM8596M = new r0(this.f43455g, 3);
                c3966o.j0(objM8596M);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
            InterfaceC2139c interfaceC2139c = this.f43454f;
            boolean zM8614g = c3966o.m8614g(interfaceC2139c);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj5) {
                objM8596M2 = new C2364d(interfaceC2139c, 2);
                c3966o.j0(objM8596M2);
            }
            AbstractC9018a.m16483c(c1480b, this.f43451c, list, interfaceC2137a, this.f43452d, this.f43453e, (InterfaceC2141e) objM8596M2, c3966o, 3072);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return a0.f30746a;
    }
}
