package p001o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p001o.ms6;

/* loaded from: classes5.dex */
public class d0f {

    /* renamed from: a */
    public final wma f18931a = new wma(1000);

    /* renamed from: b */
    public final ged f18932b = ms6.m39603d(10, new C12777a());

    /* renamed from: o.d0f$a */
    public class C12777a implements ms6.InterfaceC15416d {
        public C12777a() {
        }

        @Override // p001o.ms6.InterfaceC15416d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C12778b create() {
            try {
                return new C12778b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.d0f$b */
    public static final class C12778b implements ms6.InterfaceC15418f {

        /* renamed from: a */
        public final MessageDigest f18934a;

        /* renamed from: b */
        public final h5g f18935b = h5g.m29827a();

        public C12778b(MessageDigest messageDigest) {
            this.f18934a = messageDigest;
        }

        @Override // p001o.ms6.InterfaceC15418f
        /* renamed from: d */
        public h5g mo18850d() {
            return this.f18935b;
        }
    }

    /* renamed from: a */
    public final String m22178a(ic9 ic9Var) {
        C12778b c12778b = (C12778b) bgd.m18886d(this.f18932b.mo28526b());
        try {
            ic9Var.mo19806a(c12778b.f18934a);
            return uqi.m51941v(c12778b.f18934a.digest());
        } finally {
            this.f18932b.mo28525a(c12778b);
        }
    }

    /* renamed from: b */
    public String m22179b(ic9 ic9Var) {
        String strM22178a;
        synchronized (this.f18931a) {
            strM22178a = (String) this.f18931a.m54708g(ic9Var);
        }
        if (strM22178a == null) {
            strM22178a = m22178a(ic9Var);
        }
        synchronized (this.f18931a) {
            this.f18931a.m54710k(ic9Var, strM22178a);
        }
        return strM22178a;
    }
}
