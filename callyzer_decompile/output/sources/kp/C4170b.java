package kp;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import aw.C0471k;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import mp.AbstractC4832a;
import og.uf;
import qp.C6268e;
import qp.C6269f;
import qw.a0;
import rt.C6619c;
import v3.g0;
import x2.C8279c;
import zp.C9011k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kp.b */
/* loaded from: classes3.dex */
public final class C4170b extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f21172a;

    /* renamed from: b */
    public final /* synthetic */ Object f21173b;

    /* renamed from: c */
    public final /* synthetic */ Object f21174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4170b(int i10, Object obj, Object obj2) {
        super(4);
        this.f21172a = i10;
        this.f21173b = obj;
        this.f21174c = obj2;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        switch (this.f21172a) {
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
                    C9011k c9011k = (C9011k) ((List) this.f21173b).get(iIntValue);
                    c3966o.m8607Y(1758243292);
                    AbstractC4169a.m8931b(iIntValue, (C6268e) this.f21174c, c9011k, c3966o, ((i10 & 126) >> 3) & 14);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
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
                    C9011k c9011k2 = (C9011k) ((List) this.f21173b).get(iIntValue3);
                    c3966o2.m8607Y(-177021411);
                    AbstractC4832a.m9786b(iIntValue3, (C6269f) this.f21174c, c9011k2, c3966o2, ((i11 & 126) >> 3) & 14);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f21174c;
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((C3966o) interfaceC3962k3).m8614g(interfaceC0246a3) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue5) ? 32 : 16;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
                    C6619c c6619c = (C6619c) ((List) this.f21173b).get(iIntValue5);
                    c3966o3.m8607Y(609631642);
                    boolean zM8614g = c3966o3.m8614g(interfaceC2141e) | c3966o3.m8614g(c6619c);
                    Object objM8596M = c3966o3.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C0471k(12, interfaceC2141e, c6619c);
                        c3966o3.j0(objM8596M);
                    }
                    uf.m10989c(c6619c, (InterfaceC2137a) objM8596M, c3966o3, 0);
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            default:
                int iIntValue7 = ((Number) obj).intValue();
                int iIntValue8 = ((Number) obj2).intValue();
                int iIntValue9 = ((Number) obj3).intValue();
                int iIntValue10 = ((Number) obj4).intValue();
                C8279c c8279c = (C8279c) this.f21173b;
                c8279c.f39808f.set(iIntValue7, iIntValue8, iIntValue9, iIntValue10);
                c8279c.f39803a.m1926i(c8279c.f39805c, ((g0) this.f21174c).f36843b, c8279c.f39808f);
                break;
        }
        return a0.f30746a;
    }
}
