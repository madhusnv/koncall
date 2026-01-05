package kr;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import or.C5454q;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.y */
/* loaded from: classes3.dex */
public final class C4210y extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f21330a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21331b;

    /* renamed from: c */
    public final /* synthetic */ C7320q f21332c;

    /* renamed from: d */
    public final /* synthetic */ w0 f21333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4210y(List list, boolean z6, C7320q c7320q, w0 w0Var) {
        super(4);
        this.f21330a = list;
        this.f21331b = z6;
        this.f21332c = c7320q;
        this.f21333d = w0Var;
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
        boolean z6 = true;
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
            C5454q c5454q = (C5454q) this.f21330a.get(iIntValue);
            c3966o.m8607Y(-942367854);
            if ((((i10 & 112) ^ 48) <= 32 || !c3966o.m8612e(iIntValue)) && (i10 & 48) != 32) {
                z6 = false;
            }
            Object objM8596M = c3966o.m8596M();
            C7320q c7320q = this.f21332c;
            s0 s0Var = C3961j.f20408a;
            if (z6 || objM8596M == s0Var) {
                objM8596M = new C4208w(c7320q, iIntValue, 0);
                c3966o.j0(objM8596M);
            }
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
            boolean z10 = this.f21331b;
            boolean zM8615h = c3966o.m8615h(z10);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8615h || objM8596M2 == s0Var) {
                objM8596M2 = new C4209x(z10, c7320q, this.f21333d);
                c3966o.j0(objM8596M2);
            }
            AbstractC4189d.m8945m(c5454q, interfaceC2139c, (InterfaceC2137a) objM8596M2, c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
