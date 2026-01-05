package p001o;

import android.content.Context;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p001o.se0;

/* loaded from: classes4.dex */
public final class qe0 {

    /* renamed from: d */
    public static final String f41741d = "qe0";

    /* renamed from: a */
    public final ce9 f41742a;

    /* renamed from: b */
    public final p70 f41743b;

    /* renamed from: c */
    public ae9 f41744c;

    /* renamed from: o.qe0$b */
    public static final class C16353b {

        /* renamed from: a */
        public be9 f41745a = null;

        /* renamed from: b */
        public ce9 f41746b = null;

        /* renamed from: c */
        public String f41747c = null;

        /* renamed from: d */
        public p70 f41748d = null;

        /* renamed from: e */
        public boolean f41749e = true;

        /* renamed from: f */
        public hd9 f41750f = null;

        /* renamed from: g */
        public KeyStore f41751g = null;

        /* renamed from: h */
        public ae9 f41752h;

        /* renamed from: d */
        public synchronized qe0 m45218d() {
            if (this.f41747c != null) {
                this.f41748d = m45221g();
            }
            this.f41752h = m45220f();
            return new qe0(this);
        }

        /* renamed from: e */
        public final ae9 m45219e() {
            p70 p70Var = this.f41748d;
            if (p70Var != null) {
                try {
                    return ae9.m16946j(yd9.m57634j(this.f41745a, p70Var));
                } catch (GeneralSecurityException | bt8 unused) {
                    String unused2 = qe0.f41741d;
                }
            }
            return ae9.m16946j(sa3.m48068a(this.f41745a));
        }

        /* renamed from: f */
        public final ae9 m45220f() throws GeneralSecurityException {
            try {
                return m45219e();
            } catch (FileNotFoundException unused) {
                String unused2 = qe0.f41741d;
                if (this.f41750f == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                ae9 ae9VarM16947a = ae9.m16945i().m16947a(this.f41750f);
                ae9 ae9VarM16953h = ae9VarM16947a.m16953h(ae9VarM16947a.m16949c().m57636g().m59226K(0).m59236K());
                if (this.f41748d != null) {
                    ae9VarM16953h.m16949c().m57639k(this.f41746b, this.f41748d);
                } else {
                    sa3.m48069b(ae9VarM16953h.m16949c(), this.f41746b);
                }
                return ae9VarM16953h;
            }
        }

        /* renamed from: g */
        public final p70 m45221g() throws KeyStoreException {
            if (!qe0.m45213d()) {
                String unused = qe0.f41741d;
                return null;
            }
            se0 se0VarM48271a = this.f41751g != null ? new se0.C16816b().m48272b(this.f41751g).m48271a() : new se0();
            boolean zM48270e = se0VarM48271a.m48270e(this.f41747c);
            if (!zM48270e) {
                try {
                    se0.m48267d(this.f41747c);
                } catch (GeneralSecurityException | ProviderException unused2) {
                    String unused3 = qe0.f41741d;
                    return null;
                }
            }
            try {
                return se0VarM48271a.mo28512b(this.f41747c);
            } catch (GeneralSecurityException | ProviderException e) {
                if (zM48270e) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f41747c), e);
                }
                String unused4 = qe0.f41741d;
                return null;
            }
        }

        /* renamed from: h */
        public C16353b m45222h(hd9 hd9Var) {
            this.f41750f = hd9Var;
            return this;
        }

        /* renamed from: i */
        public C16353b m45223i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f41749e) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f41747c = str;
            return this;
        }

        /* renamed from: j */
        public C16353b m45224j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f41745a = new dmf(context, str, str2);
            this.f41746b = new emf(context, str, str2);
            return this;
        }
    }

    /* renamed from: d */
    public static boolean m45213d() {
        return true;
    }

    /* renamed from: c */
    public synchronized yd9 m45214c() {
        return this.f41744c.m16949c();
    }

    public qe0(C16353b c16353b) {
        this.f41742a = c16353b.f41746b;
        this.f41743b = c16353b.f41748d;
        this.f41744c = c16353b.f41752h;
    }
}
