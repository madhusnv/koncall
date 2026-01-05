package p001o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p001o.zq1;

/* loaded from: classes6.dex */
public final class pf2 {

    /* renamed from: c */
    public static final C16098b f39983c = new C16098b(null);

    /* renamed from: d */
    public static final pf2 f39984d = new C16097a().m43556a();

    /* renamed from: a */
    public final Set f39985a;

    /* renamed from: b */
    public final of2 f39986b;

    /* renamed from: o.pf2$a */
    public static final class C16097a {

        /* renamed from: a */
        public final List f39987a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final pf2 m43556a() {
            return new pf2(kh3.V0(this.f39987a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: o.pf2$b */
    public static final class C16098b {
        public C16098b() {
        }

        public /* synthetic */ C16098b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m43557a(Certificate certificate) {
            sq8.m48649h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + m43558b((X509Certificate) certificate).mo38694a();
        }

        /* renamed from: b */
        public final zq1 m43558b(X509Certificate x509Certificate) {
            sq8.m48649h(x509Certificate, "<this>");
            zq1.C18692a c18692a = zq1.f57497d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            sq8.m48648g(encoded, "getEncoded(...)");
            return zq1.C18692a.m59704f(c18692a, encoded, 0, 0, 3, null).m59693J();
        }
    }

    /* renamed from: o.pf2$c */
    public static final class C16099c extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ List f39989b;

        /* renamed from: c */
        public final /* synthetic */ String f39990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16099c(List list, String str) {
            super(0);
            this.f39989b = list;
            this.f39990c = str;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listMo33679a;
            of2 of2VarM43554d = pf2.this.m43554d();
            if (of2VarM43554d == null || (listMo33679a = of2VarM43554d.mo33679a(this.f39989b, this.f39990c)) == null) {
                listMo33679a = this.f39989b;
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listMo33679a, 10));
            for (Certificate certificate : listMo33679a) {
                sq8.m48647f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public pf2(Set set, of2 of2Var) {
        sq8.m48649h(set, "pins");
        this.f39985a = set;
        this.f39986b = of2Var;
    }

    /* renamed from: a */
    public final void m43551a(String str, List list) throws SSLPeerUnverifiedException {
        sq8.m48649h(str, "hostname");
        sq8.m48649h(list, "peerCertificates");
        m43552b(str, new C16099c(list, str));
    }

    /* renamed from: b */
    public final void m43552b(String str, uk7 uk7Var) throws SSLPeerUnverifiedException {
        sq8.m48649h(str, "hostname");
        sq8.m48649h(uk7Var, "cleanedPeerCertificatesFn");
        List listM43553c = m43553c(str);
        if (listM43553c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) uk7Var.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM43553c.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f39983c.m43557a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        Iterator it2 = listM43553c.iterator();
        while (it2.hasNext()) {
            tq.m50332a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        throw new SSLPeerUnverifiedException(string);
    }

    /* renamed from: c */
    public final List m43553c(String str) {
        sq8.m48649h(str, "hostname");
        Set set = this.f39985a;
        List listM21246k = ch3.m21246k();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listM21246k;
        }
        tq.m50332a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final of2 m43554d() {
        return this.f39986b;
    }

    /* renamed from: e */
    public final pf2 m43555e(of2 of2Var) {
        sq8.m48649h(of2Var, "certificateChainCleaner");
        return sq8.m48644c(this.f39986b, of2Var) ? this : new pf2(this.f39985a, of2Var);
    }

    public boolean equals(Object obj) {
        if (obj instanceof pf2) {
            pf2 pf2Var = (pf2) obj;
            if (sq8.m48644c(pf2Var.f39985a, this.f39985a) && sq8.m48644c(pf2Var.f39986b, this.f39986b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f39985a.hashCode()) * 41;
        of2 of2Var = this.f39986b;
        return iHashCode + (of2Var != null ? of2Var.hashCode() : 0);
    }

    public /* synthetic */ pf2(Set set, of2 of2Var, int i, id5 id5Var) {
        this(set, (i & 2) != 0 ? null : of2Var);
    }
}
