package bm;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import aw.C0467g;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1559m;
import d3.C1565s;
import d3.n0;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.v1;
import g2.y1;
import j3.C3551e;
import j3.C3552f;
import j3.C3553g;
import j3.C3559m;
import j3.h0;
import java.util.ArrayList;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import og.qb;
import pg.i0;
import qw.a0;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0701l implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4416a;

    /* renamed from: b */
    public final /* synthetic */ w0 f4417b;

    /* renamed from: c */
    public final /* synthetic */ w0 f4418c;

    /* renamed from: d */
    public final /* synthetic */ w0 f4419d;

    public /* synthetic */ C0701l(w0 w0Var, w0 w0Var2, w0 w0Var3, int i10) {
        this.f4416a = i10;
        this.f4417b = w0Var;
        this.f4418c = w0Var2;
        this.f4419d = w0Var3;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4416a;
        a0 a0Var = a0.f30746a;
        w0 w0Var = this.f4419d;
        w0 w0Var2 = this.f4418c;
        w0 w0Var3 = this.f4417b;
        switch (i10) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                    break;
                } else {
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(C7876o.f37669a, 7, DefinitionKt.NO_Float_VALUE, 16, DefinitionKt.NO_Float_VALUE, 10);
                    Object objM8596M = c3966o.m8596M();
                    if (objM8596M == C3961j.f20408a) {
                        objM8596M = new C0467g(1, w0Var3, w0Var2, w0Var);
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC7879r interfaceC7879rM637e = AbstractC0237a.m637e(interfaceC7879rM660n, false, null, null, (InterfaceC2137a) objM8596M, 7);
                    C3552f c3552fM8091b = qb.f26767a;
                    if (c3552fM8091b == null) {
                        C3551e c3551e = new C3551e("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = h0.f19025a;
                        n0 n0Var = new n0(C1565s.f7809b);
                        C3553g c3553g = new C3553g();
                        c3553g.m8100h(20.0f, 11.0f);
                        C3559m c3559m = new C3559m(7.83f);
                        ArrayList arrayList = c3553g.f19011a;
                        arrayList.add(c3559m);
                        c3553g.m8099g(5.59f, -5.59f);
                        c3553g.m8098f(12.0f, 4.0f);
                        c3553g.m8099g(-8.0f, 8.0f);
                        c3553g.m8099g(8.0f, 8.0f);
                        c3553g.m8099g(1.41f, -1.41f);
                        c3553g.m8098f(7.83f, 13.0f);
                        arrayList.add(new C3559m(20.0f));
                        c3553g.m8104l(-2.0f);
                        c3553g.m8094b();
                        C3551e.m8090a(c3551e, arrayList, n0Var);
                        c3552fM8091b = c3551e.m8091b();
                        qb.f26767a = c3552fM8091b;
                    }
                    i0.m11694b(c3552fM8091b, "App bar navigation icon", interfaceC7879rM637e, new C1559m(5, ((v1) c3966o.m8618k(y1.f13286a)).f12970q), c3966o, 27696, 32);
                    break;
                }
            case 1:
                String countryCodeStr = (String) obj;
                String phoneNumberStr = (String) obj2;
                AbstractC4154l.m8923f(countryCodeStr, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr, "phoneNumberStr");
                w0Var3.setValue(phoneNumberStr);
                w0Var2.setValue(countryCodeStr);
                w0Var.setValue(Boolean.TRUE);
                break;
            case 2:
                String countryCodeStr2 = (String) obj;
                String phoneNumberStr2 = (String) obj2;
                AbstractC4154l.m8923f(countryCodeStr2, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr2, "phoneNumberStr");
                w0Var3.setValue(phoneNumberStr2);
                w0Var2.setValue(countryCodeStr2);
                w0Var.setValue(Boolean.TRUE);
                break;
            case 3:
                String countryCodeStr3 = (String) obj;
                String phoneNumberStr3 = (String) obj2;
                AbstractC4154l.m8923f(countryCodeStr3, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr3, "phoneNumberStr");
                w0Var3.setValue(phoneNumberStr3);
                w0Var2.setValue(countryCodeStr3);
                w0Var.setValue(Boolean.TRUE);
                break;
            default:
                String countryCodeStr4 = (String) obj;
                String phoneNumberStr4 = (String) obj2;
                AbstractC4154l.m8923f(countryCodeStr4, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr4, "phoneNumberStr");
                w0Var3.setValue(phoneNumberStr4);
                w0Var2.setValue(countryCodeStr4);
                w0Var.setValue(Boolean.TRUE);
                break;
        }
        return a0Var;
    }
}
