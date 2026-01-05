package ds;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import as.C0428a;
import as.C0429b;
import aw.C0471k;
import com.skydoves.balloon.internals.DefinitionKt;
import es.C2127d;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import gv.C2735f;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kn.C4130j;
import kotlin.jvm.internal.AbstractC4155m;
import kr.C4208w;
import o1.AbstractC5244c;
import pg.AbstractC5937r;
import ps.AbstractC6009i;
import qv.AbstractC6327b;
import qw.a0;
import r1.C6428m;
import rt.C6620d;
import sq.g2;
import tq.AbstractC7201m;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.AbstractC8154j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.d */
/* loaded from: classes3.dex */
public final class C1780d extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f8656a;

    /* renamed from: b */
    public final /* synthetic */ List f8657b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f8658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1780d(int i10, InterfaceC2139c interfaceC2139c, List list) {
        super(4);
        this.f8656a = i10;
        this.f8657b = list;
        this.f8658c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f8656a) {
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
                    C2127d c2127d = (C2127d) this.f8657b.get(iIntValue);
                    c3966o.m8607Y(577434330);
                    AbstractC1777a.m5462b(c2127d, this.f8658c, c3966o, 0);
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
                    Uri uri = (Uri) this.f8657b.get(iIntValue3);
                    c3966o2.m8607Y(173171041);
                    AbstractC5937r.m11840d(uri, this.f8658c, c3966o2, 0);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                C6428m c6428m = (C6428m) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((C3966o) interfaceC3962k3).m8614g(c6428m) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue5) ? 32 : 16;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
                    AbstractC7201m abstractC7201m = (AbstractC7201m) this.f8657b.get(iIntValue5);
                    c3966o3.m8607Y(-2010637198);
                    InterfaceC2139c interfaceC2139c = this.f8658c;
                    boolean zM8614g = c3966o3.m8614g(interfaceC2139c) | c3966o3.m8614g(abstractC7201m);
                    Object objM8596M = c3966o3.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C0471k(8, interfaceC2139c, abstractC7201m);
                        c3966o3.j0(objM8596M);
                    }
                    AbstractC6009i.m12031a(abstractC7201m, (InterfaceC2137a) objM8596M, c3966o3, 0);
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i13 = (((C3966o) interfaceC3962k4).m8614g(interfaceC0246a3) ? 4 : 2) | iIntValue8;
                } else {
                    i13 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i13 |= ((C3966o) interfaceC3962k4).m8612e(iIntValue7) ? 32 : 16;
                }
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(i13 & 1, (i13 & 147) != 146)) {
                    C4130j c4130j = (C4130j) this.f8657b.get(iIntValue7);
                    c3966o4.m8607Y(-1178242988);
                    AbstractC6327b.m12340e(c4130j, this.f8658c, c3966o4, 0);
                    AbstractC5244c.m10322f(c3966o4, AbstractC0245d.m670g(C7876o.f37669a, 15));
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                InterfaceC0246a interfaceC0246a4 = (InterfaceC0246a) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i14 = (((C3966o) interfaceC3962k5).m8614g(interfaceC0246a4) ? 4 : 2) | iIntValue10;
                } else {
                    i14 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i14 |= ((C3966o) interfaceC3962k5).m8612e(iIntValue9) ? 32 : 16;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(i14 & 1, (i14 & 147) != 146)) {
                    C6620d c6620d = (C6620d) this.f8657b.get(iIntValue9);
                    c3966o5.m8607Y(1269774251);
                    InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(C7876o.f37669a, 2, DefinitionKt.NO_Float_VALUE, 2);
                    String str = c6620d.f31805b;
                    boolean z6 = c6620d.f31804a;
                    InterfaceC2139c interfaceC2139c2 = this.f8658c;
                    boolean zM8614g2 = c3966o5.m8614g(interfaceC2139c2) | c3966o5.m8614g(c6620d);
                    Object objM8596M2 = c3966o5.m8596M();
                    if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C2735f(5, interfaceC2139c2, (Object) c6620d);
                        c3966o5.j0(objM8596M2);
                    }
                    g2.m13173y(str, z6, 0L, interfaceC7879rM658l, (InterfaceC2139c) objM8596M2, c3966o5, 3072);
                    c3966o5.m8623p(false);
                } else {
                    c3966o5.m8601S();
                }
                break;
            case 5:
                InterfaceC0246a interfaceC0246a5 = (InterfaceC0246a) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i15 = (((C3966o) interfaceC3962k6).m8614g(interfaceC0246a5) ? 4 : 2) | iIntValue12;
                } else {
                    i15 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i15 |= ((C3966o) interfaceC3962k6).m8612e(iIntValue11) ? 32 : 16;
                }
                boolean z10 = true;
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(i15 & 1, (i15 & 147) != 146)) {
                    C0428a c0428a = (C0428a) this.f8657b.get(iIntValue11);
                    c3966o6.m8607Y(183151003);
                    InterfaceC2139c interfaceC2139c3 = this.f8658c;
                    boolean zM8614g3 = c3966o6.m8614g(interfaceC2139c3);
                    if ((((i15 & 112) ^ 48) <= 32 || !c3966o6.m8612e(iIntValue11)) && (i15 & 48) != 32) {
                        z10 = false;
                    }
                    boolean z11 = zM8614g3 | z10;
                    Object objM8596M3 = c3966o6.m8596M();
                    if (z11 || objM8596M3 == C3961j.f20408a) {
                        objM8596M3 = new C4208w(interfaceC2139c3, iIntValue11, 1);
                        c3966o6.j0(objM8596M3);
                    }
                    AbstractC8154j.m15333l(c0428a, (InterfaceC2139c) objM8596M3, c3966o6, 0);
                    c3966o6.m8623p(false);
                } else {
                    c3966o6.m8601S();
                }
                break;
            default:
                InterfaceC0246a interfaceC0246a6 = (InterfaceC0246a) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i16 = (((C3966o) interfaceC3962k7).m8614g(interfaceC0246a6) ? 4 : 2) | iIntValue14;
                } else {
                    i16 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i16 |= ((C3966o) interfaceC3962k7).m8612e(iIntValue13) ? 32 : 16;
                }
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(i16 & 1, (i16 & 147) != 146)) {
                    C0429b c0429b = (C0429b) this.f8657b.get(iIntValue13);
                    c3966o7.m8607Y(-2092566176);
                    InterfaceC2139c interfaceC2139c4 = this.f8658c;
                    boolean zM8614g4 = c3966o7.m8614g(interfaceC2139c4) | c3966o7.m8614g(c0429b);
                    Object objM8596M4 = c3966o7.m8596M();
                    if (zM8614g4 || objM8596M4 == C3961j.f20408a) {
                        objM8596M4 = new C2735f(6, interfaceC2139c4, (Object) c0429b);
                        c3966o7.j0(objM8596M4);
                    }
                    AbstractC8154j.m15334m(c0429b, (InterfaceC2139c) objM8596M4, c3966o7, 0);
                    c3966o7.m8623p(false);
                } else {
                    c3966o7.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
