package fq;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import androidx.datastore.preferences.protobuf.o1;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import ex.InterfaceC2143g;
import g2.v1;
import g2.y1;
import gq.C2704a;
import java.util.ArrayList;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import lw.h0;
import o1.AbstractC5256o;
import pg.b9;
import pg.i0;
import qw.a0;
import sq.n3;
import t1.C6994s;
import t3.C7022i;
import t3.j0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fq.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2368c implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f10769a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f10770b;

    public /* synthetic */ C2368c(int i10, ArrayList arrayList) {
        this.f10769a = i10;
        this.f10770b = arrayList;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        long j6;
        switch (this.f10769a) {
            case 0:
                InterfaceC0246a items = (InterfaceC0246a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(items, "$this$items");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    C7871j c7871j = C7864c.f37646e;
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0245d.m670g(C7876o.f37669a, 280), 15);
                    j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
                    int i10 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    i0.m11693a(b9.m11551a(((C2704a) this.f10770b.get(iIntValue)).f15105b, 0, c3966o), null, AbstractC0245d.f1971c, null, C7022i.f34006b, DefinitionKt.NO_Float_VALUE, null, c3966o, 25008, 104);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            case 1:
                ArrayList arrayList = this.f10770b;
                h0 PieChart = (h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(PieChart, "$this$PieChart");
                try {
                    j6 = ((C1565s) arrayList.get(iIntValue3)).f7819a;
                } catch (Exception unused) {
                    j6 = ((v1) ((C3966o) interfaceC3962k2).m8618k(y1.f13286a)).f12967n;
                }
                o1.m1023a(PieChart, j6, null, DefinitionKt.NO_Float_VALUE, null, null, interfaceC3962k2, iIntValue4 & 14);
                break;
            default:
                C6994s HorizontalPager = (C6994s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(HorizontalPager, "$this$HorizontalPager");
                ((n3) this.f10770b.get(iIntValue5)).f33090c.invoke((InterfaceC3962k) obj3, 0);
                break;
        }
        return a0.f30746a;
    }
}
