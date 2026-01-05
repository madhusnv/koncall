package hr;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import d3.h0;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import mm.C4792c;
import o1.AbstractC5251j;
import o1.m1;
import o1.n1;
import qw.a0;
import sq.g3;
import t1.C6994s;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3023b implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f16321a;

    /* renamed from: b */
    public final /* synthetic */ List f16322b;

    public /* synthetic */ C3023b(List list, int i10) {
        this.f16321a = i10;
        this.f16322b = list;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16321a) {
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
                    C4791b c4791b = (C4791b) this.f16322b.get(iIntValue);
                    InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(C7876o.f37669a, C1565s.f7811d, h0.f7748a);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.m10351g(4), C7864c.f37651k, c3966o, 6);
                    int i10 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    int i11 = c4791b.f23832a;
                    C4792c c4792c = c4791b.f23833b;
                    AbstractC3024c.m7274b("id: " + i11, c3966o, 0);
                    AbstractC3024c.m7274b("name: " + c4792c.f23844a, c3966o, 0);
                    AbstractC3024c.m7274b("time: " + c4792c.f23849f, c3966o, 0);
                    AbstractC3024c.m7274b("Duration: " + c4792c.f23851h, c3966o, 0);
                    AbstractC3024c.m7274b("contact Name: " + c4792c.f23845b, c3966o, 0);
                    AbstractC3024c.m7274b("call syn: " + c4791b.f23835d, c3966o, 0);
                    AbstractC3024c.m7274b("Note: " + c4791b.f23841j, c3966o, 0);
                    AbstractC3024c.m7274b("Recording source: " + c4791b.f23837f, c3966o, 0);
                    AbstractC3024c.m7274b("is Lead: " + c4791b.f23842k, c3966o, 0);
                    AbstractC3024c.m7274b("recording: " + c4791b.f23836e, c3966o, 0);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                C6994s HorizontalPager = (C6994s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(HorizontalPager, "$this$HorizontalPager");
                ((g3) this.f16322b.get(iIntValue3)).f32922b.invoke((InterfaceC3962k) obj3, 0);
                break;
        }
        return a0.f30746a;
    }
}
