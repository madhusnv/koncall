package ot;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import bg.AbstractC0656a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import nt.C5138b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ot.k */
/* loaded from: classes3.dex */
public final class C5743k extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f28295a;

    /* renamed from: b */
    public final /* synthetic */ boolean f28296b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f28297c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f28298d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f28299e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f28300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5743k(List list, boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2139c interfaceC2139c4) {
        super(4);
        this.f28295a = list;
        this.f28296b = z6;
        this.f28297c = interfaceC2139c;
        this.f28298d = interfaceC2139c2;
        this.f28299e = interfaceC2139c3;
        this.f28300f = interfaceC2139c4;
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
            C5138b c5138b = (C5138b) this.f28295a.get(iIntValue);
            c3966o.m8607Y(1490602893);
            InterfaceC2139c interfaceC2139c = this.f28297c;
            boolean zM8614g = c3966o.m8614g(interfaceC2139c) | c3966o.m8616i(c5138b);
            Object objM8596M = c3966o.m8596M();
            Object obj5 = C3961j.f20408a;
            if (zM8614g || objM8596M == obj5) {
                objM8596M = new C5742j(interfaceC2139c, c5138b, 0);
                c3966o.j0(objM8596M);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
            InterfaceC2139c interfaceC2139c2 = this.f28298d;
            boolean zM8614g2 = c3966o.m8614g(interfaceC2139c2) | c3966o.m8616i(c5138b);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g2 || objM8596M2 == obj5) {
                objM8596M2 = new C5742j(interfaceC2139c2, c5138b, 1);
                c3966o.j0(objM8596M2);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M2;
            InterfaceC2139c interfaceC2139c3 = this.f28299e;
            boolean zM8614g3 = c3966o.m8614g(interfaceC2139c3) | c3966o.m8616i(c5138b);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8614g3 || objM8596M3 == obj5) {
                objM8596M3 = new C5742j(interfaceC2139c3, c5138b, 2);
                c3966o.j0(objM8596M3);
            }
            InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) objM8596M3;
            InterfaceC2139c interfaceC2139c4 = this.f28300f;
            boolean zM8614g4 = c3966o.m8614g(interfaceC2139c4) | c3966o.m8616i(c5138b);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g4 || objM8596M4 == obj5) {
                objM8596M4 = new C5742j(interfaceC2139c4, c5138b, 3);
                c3966o.j0(objM8596M4);
            }
            AbstractC0656a.m1897f(c5138b, this.f28296b, interfaceC2137a, interfaceC2137a2, interfaceC2137a3, (InterfaceC2137a) objM8596M4, c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return a0.f30746a;
    }
}
