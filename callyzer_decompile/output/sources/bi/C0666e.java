package bi;

import ai.AbstractC0151h;
import ai.InterfaceC0154k;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import hi.C2934b;
import hi.C2935c;
import hi.C2938f;
import hi.C2940h;
import hi.C2942j;
import hi.C2943k;
import hi.C2945m;
import hi.C2947o;
import hi.C2948p;
import hi.C2950r;
import hi.C2952t;
import hi.C2954v;
import hi.C2955w;
import hi.C2957y;
import hi.a0;
import hi.c0;
import hi.d0;
import hi.e1;
import hi.f1;
import hi.f2;
import hi.g0;
import hi.g2;
import hi.h1;
import hi.i0;
import hi.i2;
import hi.j0;
import hi.j1;
import hi.k2;
import hi.l0;
import hi.l2;
import hi.n0;
import hi.n2;
import hi.o0;
import hi.r0;
import hi.s2;
import hi.t0;
import hi.t2;
import hi.u0;
import hi.v2;
import hi.w0;
import ii.AbstractC3274p;
import ii.AbstractC3275q;
import ii.InterfaceC3271m;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.e */
/* loaded from: classes.dex */
public final class C0666e extends AbstractC0151h {

    /* renamed from: b */
    public final /* synthetic */ int f4219b = 0;

    public /* synthetic */ C0666e(Class cls) {
        super(cls);
    }

    @Override // ai.AbstractC0151h
    /* renamed from: B */
    public final AbstractC1374a mo314B(AbstractC1382i abstractC1382i) {
        switch (this.f4219b) {
            case 0:
                return C2945m.m7149o(abstractC1382i, C1390q.m4366a());
            case 1:
                return C2957y.m7227o(abstractC1382i, C1390q.m4366a());
            case 2:
                return g0.m7107p(abstractC1382i, C1390q.m4366a());
            case 3:
                return l0.m7141n(abstractC1382i, C1390q.m4366a());
            case 4:
                return w0.m7216m(abstractC1382i, C1390q.m4366a());
            case 5:
                return i2.m7122o(abstractC1382i, C1390q.m4366a());
            case 6:
                return n2.m7161p(abstractC1382i, C1390q.m4366a());
            case 7:
                return v2.m7207m(abstractC1382i, C1390q.m4366a());
            case 8:
                return r0.m7183p(abstractC1382i, C1390q.m4366a());
            case 9:
                return C2938f.m7093o(abstractC1382i, C1390q.m4366a());
            default:
                return h1.m7118p(abstractC1382i, C1390q.m4366a());
        }
    }

    @Override // ai.AbstractC0151h
    /* renamed from: L */
    public final void mo324L(AbstractC1374a abstractC1374a) throws GeneralSecurityException {
        switch (this.f4219b) {
            case 0:
                C2945m c2945m = (C2945m) abstractC1374a;
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
                Collections.unmodifiableMap(map);
                C2950r c2950rM7150m = c2945m.m7150m();
                AbstractC3275q.m7625a(c2950rM7150m.m7179n());
                C2952t c2952tM7180o = c2950rM7150m.m7180o();
                if (c2952tM7180o.m7194n() < 12 || c2952tM7180o.m7194n() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C0665d[] c0665dArr2 = {new C0665d(InterfaceC0154k.class, 11)};
                HashMap map2 = new HashMap();
                for (C0665d c0665d2 : c0665dArr2) {
                    Class cls3 = c0665d2.f4217a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.m14329i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, c0665d2);
                }
                if (c0665dArr2.length > 0) {
                    Class cls4 = c0665dArr2[0].f4217a;
                }
                Collections.unmodifiableMap(map2);
                h1 h1VarM7151n = c2945m.m7151n();
                if (h1VarM7151n.m7119n() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0667f.m1938l(h1VarM7151n.m7120o());
                AbstractC3275q.m7625a(c2945m.m7150m().m7179n());
                return;
            case 1:
                C2957y c2957y = (C2957y) abstractC1374a;
                AbstractC3275q.m7625a(c2957y.m7228m());
                if (c2957y.m7229n().m7068n() != 12 && c2957y.m7229n().m7068n() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                AbstractC3275q.m7625a(((g0) abstractC1374a).m7108n());
                return;
            case 3:
                AbstractC3275q.m7625a(((l0) abstractC1374a).m7142m());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                r0 r0Var = (r0) abstractC1374a;
                if (r0Var.m7184n() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + r0Var.m7184n() + ". Valid keys must have 64 bytes.");
            case 9:
                C2938f c2938f = (C2938f) abstractC1374a;
                C0667f.m1937k(c2938f.m7095n());
                if (c2938f.m7094m() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                h1 h1Var = (h1) abstractC1374a;
                if (h1Var.m7119n() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0667f.m1938l(h1Var.m7120o());
                return;
        }
    }

    @Override // ai.AbstractC0151h
    /* renamed from: u */
    public final Object mo341u(AbstractC1374a abstractC1374a) {
        switch (this.f4219b) {
            case 0:
                C2945m c2945m = (C2945m) abstractC1374a;
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
                Collections.unmodifiableMap(map);
                C2950r c2950rM7150m = c2945m.m7150m();
                C2947o c2947oM7174t = C2948p.m7174t();
                C2952t c2952tM7180o = c2950rM7150m.m7180o();
                c2947oM7174t.m4460c();
                C2948p.m7171n((C2948p) c2947oM7174t.f7128b, c2952tM7180o);
                byte[] bArrM7624a = AbstractC3274p.m7624a(c2950rM7150m.m7179n());
                C1381h c1381hM4277c = AbstractC1382i.m4277c(0, bArrM7624a.length, bArrM7624a);
                c2947oM7174t.m4460c();
                C2948p.m7172o((C2948p) c2947oM7174t.f7128b, c1381hM4277c);
                c2947oM7174t.m4460c();
                C2948p.m7170m((C2948p) c2947oM7174t.f7128b);
                C2948p c2948p = (C2948p) c2947oM7174t.m4458a();
                C0665d[] c0665dArr2 = {new C0665d(InterfaceC0154k.class, 11)};
                HashMap map2 = new HashMap();
                for (C0665d c0665d2 : c0665dArr2) {
                    Class cls3 = c0665d2.f4217a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.m14329i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, c0665d2);
                }
                if (c0665dArr2.length > 0) {
                    Class cls4 = c0665dArr2[0].f4217a;
                }
                Collections.unmodifiableMap(map2);
                h1 h1VarM7151n = c2945m.m7151n();
                e1 e1VarM7100t = f1.m7100t();
                e1VarM7100t.m4460c();
                f1.m7096m((f1) e1VarM7100t.f7128b);
                j1 j1VarM7120o = h1VarM7151n.m7120o();
                e1VarM7100t.m4460c();
                f1.m7097n((f1) e1VarM7100t.f7128b, j1VarM7120o);
                byte[] bArrM7624a2 = AbstractC3274p.m7624a(h1VarM7151n.m7119n());
                C1381h c1381hM4277c2 = AbstractC1382i.m4277c(0, bArrM7624a2.length, bArrM7624a2);
                e1VarM7100t.m4460c();
                f1.m7098o((f1) e1VarM7100t.f7128b, c1381hM4277c2);
                f1 f1Var = (f1) e1VarM7100t.m4458a();
                C2942j c2942jM7136s = C2943k.m7136s();
                c2942jM7136s.m4460c();
                C2943k.m7134n((C2943k) c2942jM7136s.f7128b, c2948p);
                c2942jM7136s.m4460c();
                C2943k.m7135o((C2943k) c2942jM7136s.f7128b, f1Var);
                c2942jM7136s.m4460c();
                C2943k.m7133m((C2943k) c2942jM7136s.f7128b);
                return (C2943k) c2942jM7136s.m4458a();
            case 1:
                C2957y c2957y = (C2957y) abstractC1374a;
                C2954v c2954vM7211s = C2955w.m7211s();
                byte[] bArrM7624a3 = AbstractC3274p.m7624a(c2957y.m7228m());
                C1381h c1381hM4277c3 = AbstractC1382i.m4277c(0, bArrM7624a3.length, bArrM7624a3);
                c2954vM7211s.m4460c();
                C2955w.m7210o((C2955w) c2954vM7211s.f7128b, c1381hM4277c3);
                a0 a0VarM7229n = c2957y.m7229n();
                c2954vM7211s.m4460c();
                C2955w.m7209n((C2955w) c2954vM7211s.f7128b, a0VarM7229n);
                c2954vM7211s.m4460c();
                C2955w.m7208m((C2955w) c2954vM7211s.f7128b);
                return (C2955w) c2954vM7211s.m4458a();
            case 2:
                c0 c0VarM7085q = d0.m7085q();
                byte[] bArrM7624a4 = AbstractC3274p.m7624a(((g0) abstractC1374a).m7108n());
                C1381h c1381hM4277c4 = AbstractC1382i.m4277c(0, bArrM7624a4.length, bArrM7624a4);
                c0VarM7085q.m4460c();
                d0.m7084n((d0) c0VarM7085q.f7128b, c1381hM4277c4);
                c0VarM7085q.m4460c();
                d0.m7083m((d0) c0VarM7085q.f7128b);
                return (d0) c0VarM7085q.m4458a();
            case 3:
                i0 i0VarM7126q = j0.m7126q();
                byte[] bArrM7624a5 = AbstractC3274p.m7624a(((l0) abstractC1374a).m7142m());
                C1381h c1381hM4277c5 = AbstractC1382i.m4277c(0, bArrM7624a5.length, bArrM7624a5);
                i0VarM7126q.m4460c();
                j0.m7125n((j0) i0VarM7126q.f7128b, c1381hM4277c5);
                i0VarM7126q.m4460c();
                j0.m7124m((j0) i0VarM7126q.f7128b);
                return (j0) i0VarM7126q.m4458a();
            case 4:
                t0 t0VarM7203q = u0.m7203q();
                t0VarM7203q.m4460c();
                u0.m7201m((u0) t0VarM7203q.f7128b);
                byte[] bArrM7624a6 = AbstractC3274p.m7624a(32);
                C1381h c1381hM4277c6 = AbstractC1382i.m4277c(0, bArrM7624a6.length, bArrM7624a6);
                t0VarM7203q.m4460c();
                u0.m7202n((u0) t0VarM7203q.f7128b, c1381hM4277c6);
                return (u0) t0VarM7203q.m4458a();
            case 5:
                f2 f2VarM7111q = g2.m7111q();
                f2VarM7111q.m4460c();
                g2.m7110n((g2) f2VarM7111q.f7128b, (i2) abstractC1374a);
                f2VarM7111q.m4460c();
                g2.m7109m((g2) f2VarM7111q.f7128b);
                return (g2) f2VarM7111q.m4458a();
            case 6:
                k2 k2VarM7145q = l2.m7145q();
                k2VarM7145q.m4460c();
                l2.m7144n((l2) k2VarM7145q.f7128b, (n2) abstractC1374a);
                k2VarM7145q.m4460c();
                l2.m7143m((l2) k2VarM7145q.f7128b);
                return (l2) k2VarM7145q.m4458a();
            case 7:
                s2 s2VarM7197q = t2.m7197q();
                s2VarM7197q.m4460c();
                t2.m7195m((t2) s2VarM7197q.f7128b);
                byte[] bArrM7624a7 = AbstractC3274p.m7624a(32);
                C1381h c1381hM4277c7 = AbstractC1382i.m4277c(0, bArrM7624a7.length, bArrM7624a7);
                s2VarM7197q.m4460c();
                t2.m7196n((t2) s2VarM7197q.f7128b, c1381hM4277c7);
                return (t2) s2VarM7197q.m4458a();
            case 8:
                n0 n0VarM7166q = o0.m7166q();
                byte[] bArrM7624a8 = AbstractC3274p.m7624a(((r0) abstractC1374a).m7184n());
                C1381h c1381hM4277c8 = AbstractC1382i.m4277c(0, bArrM7624a8.length, bArrM7624a8);
                n0VarM7166q.m4460c();
                o0.m7165n((o0) n0VarM7166q.f7128b, c1381hM4277c8);
                n0VarM7166q.m4460c();
                o0.m7164m((o0) n0VarM7166q.f7128b);
                return (o0) n0VarM7166q.m4458a();
            case 9:
                C2938f c2938f = (C2938f) abstractC1374a;
                C2934b c2934bM7072s = C2935c.m7072s();
                c2934bM7072s.m4460c();
                C2935c.m7069m((C2935c) c2934bM7072s.f7128b);
                byte[] bArrM7624a9 = AbstractC3274p.m7624a(c2938f.m7094m());
                C1381h c1381hM4277c9 = AbstractC1382i.m4277c(0, bArrM7624a9.length, bArrM7624a9);
                c2934bM7072s.m4460c();
                C2935c.m7070n((C2935c) c2934bM7072s.f7128b, c1381hM4277c9);
                C2940h c2940hM7095n = c2938f.m7095n();
                c2934bM7072s.m4460c();
                C2935c.m7071o((C2935c) c2934bM7072s.f7128b, c2940hM7095n);
                return (C2935c) c2934bM7072s.m4458a();
            default:
                h1 h1Var = (h1) abstractC1374a;
                e1 e1VarM7100t2 = f1.m7100t();
                e1VarM7100t2.m4460c();
                f1.m7096m((f1) e1VarM7100t2.f7128b);
                j1 j1VarM7120o2 = h1Var.m7120o();
                e1VarM7100t2.m4460c();
                f1.m7097n((f1) e1VarM7100t2.f7128b, j1VarM7120o2);
                byte[] bArrM7624a10 = AbstractC3274p.m7624a(h1Var.m7119n());
                C1381h c1381hM4277c10 = AbstractC1382i.m4277c(0, bArrM7624a10.length, bArrM7624a10);
                e1VarM7100t2.m4460c();
                f1.m7098o((f1) e1VarM7100t2.f7128b, c1381hM4277c10);
                return (f1) e1VarM7100t2.m4458a();
        }
    }

    public C0666e(C0667f c0667f, byte b10, boolean z6) {
        super(i2.class);
    }

    public C0666e(C0667f c0667f, byte b10, byte b11) {
        super(n2.class);
    }

    public C0666e(C0667f c0667f, char c2) {
        super(g0.class);
    }

    public C0666e(C0667f c0667f, byte b10) {
        super(C2957y.class);
    }

    public C0666e(C0667f c0667f, byte b10, int i10) {
        super(r0.class);
    }

    public C0666e(C0667f c0667f, int i10) {
        super(l0.class);
    }

    public C0666e(C0667f c0667f, short s5) {
        super(w0.class);
    }

    public C0666e(C0667f c0667f, byte b10, char c2) {
        super(v2.class);
    }

    public C0666e(C0667f c0667f) {
        super(C2945m.class);
    }

    public C0666e(C0667f c0667f, byte b10, short s5) {
        super(h1.class);
    }
}
