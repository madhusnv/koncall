package er;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import l7.a0;
import mm.C4798i;
import op.AbstractC5432a;
import tq.EnumC7204p;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.q */
/* loaded from: classes3.dex */
public final class C2117q extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f9890a = 0;

    /* renamed from: b */
    public final /* synthetic */ List f9891b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f9892c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2141e f9893d;

    /* renamed from: e */
    public final /* synthetic */ Object f9894e;

    /* renamed from: f */
    public final /* synthetic */ Object f9895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2117q(List list, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, InterfaceC2139c interfaceC2139c, a0 a0Var) {
        super(4);
        this.f9891b = list;
        this.f9893d = interfaceC2141e;
        this.f9894e = interfaceC2142f;
        this.f9892c = interfaceC2139c;
        this.f9895f = a0Var;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f9890a) {
            case 0:
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
                    C4798i c4798i = (C4798i) this.f9891b.get(iIntValue);
                    c3966o.m8607Y(1580741659);
                    AbstractC2101a.m5810d(c4798i, this.f9893d, (InterfaceC2142f) this.f9894e, this.f9892c, (a0) this.f9895f, c3966o, 0);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC0246a interfaceC0246a2 = (InterfaceC0246a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i11 = (((C3966o) interfaceC3962k2).m8614g(interfaceC0246a2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= ((C3966o) interfaceC3962k2).m8612e(iIntValue3) ? 32 : 16;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
                    C9008h c9008h = (C9008h) this.f9891b.get(iIntValue3);
                    c3966o2.m8607Y(1538271268);
                    AbstractC5432a.m11139d((EnumC7204p) this.f9894e, c9008h, this.f9892c, this.f9893d, (InterfaceC2139c) this.f9895f, c3966o2, 0);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2117q(List list, EnumC7204p enumC7204p, InterfaceC2139c interfaceC2139c, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c2) {
        super(4);
        this.f9891b = list;
        this.f9894e = enumC7204p;
        this.f9892c = interfaceC2139c;
        this.f9893d = interfaceC2141e;
        this.f9895f = interfaceC2139c2;
    }
}
