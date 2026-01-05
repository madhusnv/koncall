package bi;

import a1.C0005d;
import ai.AbstractC0153j;
import ai.InterfaceC0154k;
import ci.C0974b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import fi.AbstractC2290a;
import hi.C2935c;
import hi.C2943k;
import hi.C2948p;
import hi.C2955w;
import hi.c1;
import hi.d0;
import hi.f1;
import hi.g2;
import hi.j0;
import hi.l2;
import hi.o0;
import hi.t2;
import hi.u0;
import ii.C3259a;
import ii.C3260b;
import ii.C3261c;
import ii.C3262d;
import ii.C3267i;
import ii.C3268j;
import ii.C3273o;
import ii.InterfaceC3271m;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import of.C5359n;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.d */
/* loaded from: classes.dex */
public final class C0665d {

    /* renamed from: a */
    public final Class f4217a;

    /* renamed from: b */
    public final /* synthetic */ int f4218b;

    public C0665d(Class cls, int i10) {
        this.f4218b = i10;
        this.f4217a = cls;
    }

    /* renamed from: a */
    public final Object m1936a(AbstractC1374a abstractC1374a) throws GeneralSecurityException {
        switch (this.f4218b) {
            case 0:
                C2943k c2943k = (C2943k) abstractC1374a;
                C0665d[] c0665dArr = {new C0665d(InterfaceC3271m.class, 1)};
                HashMap map = new HashMap();
                for (C0665d c0665d : c0665dArr) {
                    Class cls = c0665d.f4217a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, c0665d);
                }
                if (c0665dArr.length > 0) {
                    Class cls2 = c0665dArr[0].f4217a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                C2948p c2948pM7138p = c2943k.m7138p();
                C0665d c0665d2 = (C0665d) mapUnmodifiableMap.get(InterfaceC3271m.class);
                if (c0665d2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + InterfaceC3271m.class.getCanonicalName() + " not supported.");
                }
                InterfaceC3271m interfaceC3271m = (InterfaceC3271m) c0665d2.m1936a(c2948pM7138p);
                C0665d[] c0665dArr2 = {new C0665d(InterfaceC0154k.class, 11)};
                HashMap map2 = new HashMap();
                for (C0665d c0665d3 : c0665dArr2) {
                    Class cls3 = c0665d3.f4217a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.m14329i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, c0665d3);
                }
                if (c0665dArr2.length > 0) {
                    Class cls4 = c0665dArr2[0].f4217a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                f1 f1VarM7139q = c2943k.m7139q();
                C0665d c0665d4 = (C0665d) mapUnmodifiableMap2.get(InterfaceC0154k.class);
                if (c0665d4 != null) {
                    return new C3268j(interfaceC3271m, (InterfaceC0154k) c0665d4.m1936a(f1VarM7139q), c2943k.m7139q().m7103r().m7132o());
                }
                throw new IllegalArgumentException("Requested primitive class " + InterfaceC0154k.class.getCanonicalName() + " not supported.");
            case 1:
                C2948p c2948p = (C2948p) abstractC1374a;
                return new C3259a(c2948p.m7175q().m4278h(), c2948p.m7176r().m7194n());
            case 2:
                C2955w c2955w = (C2955w) abstractC1374a;
                return new C3260b(c2955w.m7213p().m4278h(), c2955w.m7214q().m7068n());
            case 3:
                return new C3261c(((d0) abstractC1374a).m7087o().m4278h());
            case 4:
                return new C0974b(((j0) abstractC1374a).m7128o().m4278h());
            case 5:
                return new C3267i(((u0) abstractC1374a).m7205o().m4278h(), 0);
            case 6:
                String strM7123n = ((g2) abstractC1374a).m7113o().m7123n();
                return AbstractC0153j.m357a(strM7123n).m5779b(strM7123n);
            case 7:
                l2 l2Var = (l2) abstractC1374a;
                String strM7163o = l2Var.m7147o().m7163o();
                return new C0668g(l2Var.m7147o().m7162n(), AbstractC0153j.m357a(strM7163o).m5779b(strM7163o));
            case 8:
                return new C3267i(((t2) abstractC1374a).m7199o().m4278h(), 1);
            case 9:
                return new C3262d(((o0) abstractC1374a).m7168o().m4278h());
            case 10:
                C2935c c2935c = (C2935c) abstractC1374a;
                return new C3273o(new C0005d(c2935c.m7074p().m4278h()), c2935c.m7075q().m7116n());
            default:
                f1 f1Var = (f1) abstractC1374a;
                c1 c1VarM7131n = f1Var.m7103r().m7131n();
                SecretKeySpec secretKeySpec = new SecretKeySpec(f1Var.m7102q().m4278h(), "HMAC");
                int iM7132o = f1Var.m7103r().m7132o();
                int i10 = AbstractC2290a.f10329a[c1VarM7131n.ordinal()];
                if (i10 == 1) {
                    return new C3273o(new C5359n("HMACSHA1", secretKeySpec), iM7132o);
                }
                if (i10 == 2) {
                    return new C3273o(new C5359n("HMACSHA256", secretKeySpec), iM7132o);
                }
                if (i10 == 3) {
                    return new C3273o(new C5359n("HMACSHA512", secretKeySpec), iM7132o);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
