package og;

import ad.C0104k;
import ad.C0109p;
import ad.C0118y;
import ad.C0119z;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import bc.C0642a;
import bd.C0645a;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import ex.InterfaceC2137a;
import fq.C2366a;
import fq.C2367b;
import java.util.ArrayList;
import jc.C3733i;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import s2.AbstractC6740i;
import sc.AbstractC6791k;
import sd.C6808b;
import sd.C6813g;
import tb.C7105p;
import tc.C7117b;
import w1.AbstractC7861e;
import w2.C7876o;
import w2.InterfaceC7879r;
import zc.AbstractC8927d;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class jf {
    /* renamed from: a */
    public static final void m10720a(InterfaceC7879r interfaceC7879r, InterfaceC2137a onLearnMoreClick, InterfaceC2137a onDisableClick, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        AbstractC4154l.m8923f(onLearnMoreClick, "onLearnMoreClick");
        AbstractC4154l.m8923f(onDisableClick, "onDisableClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-820536170);
        int i11 = i10 | 6 | (c3966o.m8616i(onDisableClick) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C7876o c7876o = C7876o.f37669a;
            g2.p9.m6240d(AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o, 1.0f), 16), AbstractC7861e.m14841b(8), g2.p9.m6253q(((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12969p, c3966o, 0), null, pg.d0.m11579a(1, C1565s.f7813f), AbstractC6740i.m12902d(1327014628, new C2366a(onLearnMoreClick, onDisableClick), c3966o), c3966o, 221184, 8);
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2367b(interfaceC7879r2, onLearnMoreClick, onDisableClick, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m10721b(C7117b req, C0645a ctx, C0642a endpoint) {
        AbstractC4154l.m8923f(req, "req");
        C3733i c3733i = req.f34312c;
        C0104k c0104k = req.f34311b;
        AbstractC4154l.m8923f(ctx, "ctx");
        AbstractC4154l.m8923f(endpoint, "endpoint");
        C0109p c0109p = endpoint.f4113a;
        String str = (String) ctx.mo1864e(AbstractC6791k.f32292a);
        if (str == null) {
            str = "";
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
        AbstractC8927d abstractC8927d = c0109p.f376b;
        C0118y c0118y = c0109p.f378d;
        sbM4568o.append(abstractC8927d);
        String string = sbM4568o.toString();
        C8935l c8935l = c0109p.f375a;
        c0104k.getClass();
        AbstractC4154l.m8923f(c8935l, "<set-?>");
        c0104k.f358a = c8935l;
        C7105p c7105p = c0104k.f363f;
        C0119z c0119z = c0109p.f380f;
        c7105p.getClass();
        c7105p.f34290b = c0119z.f396a;
        c7105p.f34291c = c0119z.f397b;
        c0104k.f359b = pg.x9.m11935c(string);
        c0104k.f360c = Integer.valueOf(c0109p.f377c);
        com.google.android.gms.internal.measurement.j4 j4Var = c0104k.f361d;
        boolean z6 = j4Var.f6251b;
        ArrayList arrayList = (ArrayList) j4Var.f6252c;
        j4Var.f6251b = z6 || (arrayList.isEmpty() && c0118y.f394b);
        arrayList.addAll(0, c0118y.f393a);
        c0104k.f362e.f349a.mo271m(c0109p.f379e);
        C6808b c6808b = c0109p.f381g;
        String str2 = c6808b != null ? c6808b.f32349b : null;
        c0104k.f364g = str2 != null ? C6813g.f32361k.mo12985b(str2) : null;
        c3733i.m318F(c0104k.m295c(), "Host");
    }
}
