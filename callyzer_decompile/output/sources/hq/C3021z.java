package hq;

import android.content.Context;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import ap.C0388a;
import au.C0448l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import kq.C4181k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.z */
/* loaded from: classes3.dex */
public final class C3021z extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f16308a;

    /* renamed from: b */
    public final /* synthetic */ w0 f16309b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f16310c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f16311d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f16312e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f16313f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2139c f16314g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f16315h;

    /* renamed from: j */
    public final /* synthetic */ Context f16316j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2139c f16317k;

    /* renamed from: l */
    public final /* synthetic */ w0 f16318l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3021z(List list, w0 w0Var, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2139c interfaceC2139c4, InterfaceC2139c interfaceC2139c5, InterfaceC2139c interfaceC2139c6, Context context, InterfaceC2139c interfaceC2139c7, w0 w0Var2) {
        super(4);
        this.f16308a = list;
        this.f16309b = w0Var;
        this.f16310c = interfaceC2139c;
        this.f16311d = interfaceC2139c2;
        this.f16312e = interfaceC2139c3;
        this.f16313f = interfaceC2139c4;
        this.f16314g = interfaceC2139c5;
        this.f16315h = interfaceC2139c6;
        this.f16316j = context;
        this.f16317k = interfaceC2139c7;
        this.f16318l = w0Var2;
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
            C4181k c4181k = (C4181k) this.f16308a.get(iIntValue);
            c3966o.m8607Y(94649957);
            List list = c4181k.f21206s;
            w0 w0Var = this.f16309b;
            boolean zM8614g = c3966o.m8614g(w0Var) | c3966o.m8616i(c4181k);
            Object objM8596M = c3966o.m8596M();
            Object obj5 = C3961j.f20408a;
            if (zM8614g || objM8596M == obj5) {
                objM8596M = new C0388a(w0Var, c4181k, null, 21);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, list, c3966o);
            InterfaceC2139c interfaceC2139c = this.f16310c;
            boolean zM8614g2 = c3966o.m8614g(interfaceC2139c) | c3966o.m8616i(c4181k) | c3966o.m8614g(this.f16311d) | c3966o.m8614g(this.f16312e) | c3966o.m8614g(this.f16313f) | c3966o.m8614g(this.f16314g) | c3966o.m8614g(this.f16315h) | c3966o.m8616i(this.f16316j);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g2 || objM8596M2 == obj5) {
                Object c3019x = new C3019x(this.f16310c, c4181k, this.f16311d, this.f16312e, this.f16314g, this.f16315h, this.f16313f, this.f16316j);
                c3966o.j0(c3019x);
                objM8596M2 = c3019x;
            }
            InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M2;
            boolean zM8616i = c3966o.m8616i(c4181k);
            InterfaceC2139c interfaceC2139c3 = this.f16317k;
            boolean zM8614g3 = zM8616i | c3966o.m8614g(interfaceC2139c3);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8614g3 || objM8596M3 == obj5) {
                objM8596M3 = new C3020y(c4181k, interfaceC2139c3);
                c3966o.j0(objM8596M3);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M3;
            boolean zM8614g4 = c3966o.m8614g(w0Var) | c3966o.m8616i(c4181k);
            Object obj6 = this.f16318l;
            boolean zM8614g5 = zM8614g4 | c3966o.m8614g(obj6);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g5 || objM8596M4 == obj5) {
                objM8596M4 = new C0448l(1, (Object) c4181k, obj6, w0Var);
                c3966o.j0(objM8596M4);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M4;
            boolean zM8614g6 = c3966o.m8614g(interfaceC2139c) | c3966o.m8616i(c4181k);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8614g6 || objM8596M5 == obj5) {
                objM8596M5 = new C3020y(interfaceC2139c, c4181k);
                c3966o.j0(objM8596M5);
            }
            a0.m7265k(c4181k, interfaceC2139c2, interfaceC2137a, interfaceC2137a2, (InterfaceC2137a) objM8596M5, c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
