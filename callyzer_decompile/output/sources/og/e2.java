package og;

import c4.C0860j;
import c4.C0862l;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1592t;
import d4.C1581i;
import d4.C1582j;
import d4.C1583k;
import d4.C1589q;
import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import s4.C6755k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e2 {
    /* renamed from: a */
    public static final boolean m10624a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC4154l.m8924g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public static final void m10625b(C1589q c1589q, int i10, C0860j c0860j) {
        C1589q c1589q2;
        C4640e c4640e = new C4640e(new C1589q[16]);
        List listM5213g = c1589q.m5213g(false, false);
        while (true) {
            c4640e.m9508d(listM5213g, c4640e.f22886c);
            while (true) {
                int i11 = c4640e.f22886c;
                if (i11 == 0) {
                    return;
                }
                c1589q2 = (C1589q) c4640e.m9515m(i11 - 1);
                boolean zM14988o = w3.m0.m14988o(c1589q2);
                C1583k c1583k = c1589q2.f7879d;
                e1.j0 j0Var = c1583k.f7868a;
                if (!zM14988o && !j0Var.m5570c(AbstractC1592t.f7925i)) {
                    v3.h1 h1VarM5209c = c1589q2.m5209c();
                    if (h1VarM5209c == null) {
                        throw p020v.a1.m14342v("Expected semantics node to have a coordinator.");
                    }
                    C6755k c6755kM11071c = ye.m11071c(t3.c1.m13277f(h1VarM5209c));
                    if (c6755kM11071c.f32206a < c6755kM11071c.f32208c && c6755kM11071c.f32207b < c6755kM11071c.f32209d) {
                        Object objM5574g = c1583k.f7868a.m5574g(C1582j.f7846e);
                        if (objM5574g == null) {
                            objM5574g = null;
                        }
                        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM5574g;
                        Object objM5574g2 = j0Var.m5574g(AbstractC1592t.f7936t);
                        C1581i c1581i = (C1581i) (objM5574g2 != null ? objM5574g2 : null);
                        if (interfaceC2141e == null || c1581i == null || ((Number) c1581i.f7839b.invoke()).floatValue() <= DefinitionKt.NO_Float_VALUE) {
                            break;
                        }
                        int i12 = i10 + 1;
                        c0860j.invoke(new C0862l(c1589q2, i12, c6755kM11071c, h1VarM5209c));
                        m10625b(c1589q2, i12, c0860j);
                    }
                }
            }
            listM5213g = c1589q2.m5213g(false, false);
        }
    }
}
