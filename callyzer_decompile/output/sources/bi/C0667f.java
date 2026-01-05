package bi;

import ai.AbstractC0151h;
import ai.AbstractC0152i;
import ai.InterfaceC0154k;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import fi.AbstractC2290a;
import hi.C2935c;
import hi.C2938f;
import hi.C2940h;
import hi.C2943k;
import hi.C2948p;
import hi.C2952t;
import hi.C2955w;
import hi.d0;
import hi.f1;
import hi.g2;
import hi.j0;
import hi.j1;
import hi.l2;
import hi.m1;
import hi.o0;
import hi.t2;
import hi.u0;
import ii.AbstractC3275q;
import ii.InterfaceC3271m;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.f */
/* loaded from: classes.dex */
public final class C0667f extends AbstractC0152i {

    /* renamed from: d */
    public final /* synthetic */ int f4220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0667f(Class cls, C0665d[] c0665dArr, int i10) {
        super(cls, c0665dArr);
        this.f4220d = i10;
    }

    /* renamed from: k */
    public static void m1937k(C2940h c2940h) {
        if (c2940h.m7116n() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c2940h.m7116n() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: l */
    public static void m1938l(j1 j1Var) {
        if (j1Var.m7132o() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = AbstractC2290a.f10329a[j1Var.m7131n().ordinal()];
        if (i10 == 1) {
            if (j1Var.m7132o() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 2) {
            if (j1Var.m7132o() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (j1Var.m7132o() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // ai.AbstractC0152i
    /* renamed from: d */
    public final String mo350d() {
        switch (this.f4220d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // ai.AbstractC0152i
    /* renamed from: f */
    public final AbstractC0151h mo352f() {
        switch (this.f4220d) {
            case 0:
                return new C0666e(this);
            case 1:
                return new C0666e(this, (byte) 0);
            case 2:
                return new C0666e(this, (char) 0);
            case 3:
                return new C0666e(this, 0);
            case 4:
                return new C0666e(this, (short) 0);
            case 5:
                return new C0666e(this, (byte) 0, false);
            case 6:
                return new C0666e(this, (byte) 0, (byte) 0);
            case 7:
                return new C0666e(this, (byte) 0, (char) 0);
            case 8:
                return new C0666e(this, (byte) 0, 0);
            case 9:
                return new C0666e(C2938f.class);
            default:
                return new C0666e(this, (byte) 0, (short) 0);
        }
    }

    @Override // ai.AbstractC0152i
    /* renamed from: g */
    public final m1 mo353g() {
        switch (this.f4220d) {
        }
        return m1.SYMMETRIC;
    }

    @Override // ai.AbstractC0152i
    /* renamed from: h */
    public final AbstractC1374a mo354h(AbstractC1382i abstractC1382i) {
        switch (this.f4220d) {
            case 0:
                return C2943k.m7137t(abstractC1382i, C1390q.m4366a());
            case 1:
                return C2955w.m7212t(abstractC1382i, C1390q.m4366a());
            case 2:
                return d0.m7086r(abstractC1382i, C1390q.m4366a());
            case 3:
                return j0.m7127r(abstractC1382i, C1390q.m4366a());
            case 4:
                return u0.m7204r(abstractC1382i, C1390q.m4366a());
            case 5:
                return g2.m7112r(abstractC1382i, C1390q.m4366a());
            case 6:
                return l2.m7146r(abstractC1382i, C1390q.m4366a());
            case 7:
                return t2.m7198r(abstractC1382i, C1390q.m4366a());
            case 8:
                return o0.m7167r(abstractC1382i, C1390q.m4366a());
            case 9:
                return C2935c.m7073t(abstractC1382i, C1390q.m4366a());
            default:
                return f1.m7101u(abstractC1382i, C1390q.m4366a());
        }
    }

    @Override // ai.AbstractC0152i
    /* renamed from: j */
    public final void mo356j(AbstractC1374a abstractC1374a) throws GeneralSecurityException {
        switch (this.f4220d) {
            case 0:
                C2943k c2943k = (C2943k) abstractC1374a;
                AbstractC3275q.m7627c(c2943k.m7140r());
                C0665d[] c0665dArr = {new C0665d(InterfaceC3271m.class, 1)};
                HashMap map = new HashMap();
                C0665d c0665d = c0665dArr[0];
                Class cls = c0665d.f4217a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, c0665d);
                Class cls2 = c0665dArr[0].f4217a;
                Collections.unmodifiableMap(map);
                C2948p c2948pM7138p = c2943k.m7138p();
                AbstractC3275q.m7627c(c2948pM7138p.m7177s());
                AbstractC3275q.m7625a(c2948pM7138p.m7175q().size());
                C2952t c2952tM7176r = c2948pM7138p.m7176r();
                if (c2952tM7176r.m7194n() < 12 || c2952tM7176r.m7194n() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C0665d[] c0665dArr2 = {new C0665d(InterfaceC0154k.class, 11)};
                HashMap map2 = new HashMap();
                C0665d c0665d2 = c0665dArr2[0];
                Class cls3 = c0665d2.f4217a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException(a1.m14329i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls3, c0665d2);
                Class cls4 = c0665dArr2[0].f4217a;
                Collections.unmodifiableMap(map2);
                f1 f1VarM7139q = c2943k.m7139q();
                AbstractC3275q.m7627c(f1VarM7139q.m7104s());
                if (f1VarM7139q.m7102q().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m1938l(f1VarM7139q.m7103r());
                return;
            case 1:
                C2955w c2955w = (C2955w) abstractC1374a;
                AbstractC3275q.m7627c(c2955w.m7215r());
                AbstractC3275q.m7625a(c2955w.m7213p().size());
                if (c2955w.m7214q().m7068n() != 12 && c2955w.m7214q().m7068n() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                d0 d0Var = (d0) abstractC1374a;
                AbstractC3275q.m7627c(d0Var.m7088p());
                AbstractC3275q.m7625a(d0Var.m7087o().size());
                return;
            case 3:
                j0 j0Var = (j0) abstractC1374a;
                AbstractC3275q.m7627c(j0Var.m7129p());
                AbstractC3275q.m7625a(j0Var.m7128o().size());
                return;
            case 4:
                u0 u0Var = (u0) abstractC1374a;
                AbstractC3275q.m7627c(u0Var.m7206p());
                if (u0Var.m7205o().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                AbstractC3275q.m7627c(((g2) abstractC1374a).m7114p());
                return;
            case 6:
                AbstractC3275q.m7627c(((l2) abstractC1374a).m7148p());
                return;
            case 7:
                t2 t2Var = (t2) abstractC1374a;
                AbstractC3275q.m7627c(t2Var.m7200p());
                if (t2Var.m7199o().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 8:
                o0 o0Var = (o0) abstractC1374a;
                AbstractC3275q.m7627c(o0Var.m7169p());
                if (o0Var.m7168o().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + o0Var.m7168o().size() + ". Valid keys must have 64 bytes.");
            case 9:
                C2935c c2935c = (C2935c) abstractC1374a;
                AbstractC3275q.m7627c(c2935c.m7076r());
                if (c2935c.m7074p().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                m1937k(c2935c.m7075q());
                return;
            default:
                f1 f1Var = (f1) abstractC1374a;
                AbstractC3275q.m7627c(f1Var.m7104s());
                if (f1Var.m7102q().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m1938l(f1Var.m7103r());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667f() {
        super(f1.class, new C0665d(InterfaceC0154k.class, 11));
        this.f4220d = 10;
    }
}
