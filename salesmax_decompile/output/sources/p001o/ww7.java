package p001o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes6.dex */
public final class ww7 {

    /* renamed from: e */
    public static final C17989a f52793e = new C17989a(null);

    /* renamed from: a */
    public final dnh f52794a;

    /* renamed from: b */
    public final r93 f52795b;

    /* renamed from: c */
    public final List f52796c;

    /* renamed from: d */
    public final gi9 f52797d;

    /* renamed from: o.ww7$a */
    public static final class C17989a {

        /* renamed from: o.ww7$a$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ List f52798a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(0);
                this.f52798a = list;
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f52798a;
            }
        }

        public C17989a() {
        }

        public /* synthetic */ C17989a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ww7 m55297a(SSLSession sSLSession) throws IOException {
            List listM21246k;
            sq8.m48649h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (sq8.m48644c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : sq8.m48644c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            r93 r93VarM46372b = r93.f43201b.m46372b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (sq8.m48644c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            dnh dnhVarM23634a = dnh.Companion.m23634a(protocol);
            try {
                listM21246k = m55298b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM21246k = ch3.m21246k();
            }
            return new ww7(dnhVarM23634a, r93VarM46372b, m55298b(sSLSession.getLocalCertificates()), new a(listM21246k));
        }

        /* renamed from: b */
        public final List m55298b(Certificate[] certificateArr) {
            return certificateArr != null ? jgj.m33817k(Arrays.copyOf(certificateArr, certificateArr.length)) : ch3.m21246k();
        }
    }

    /* renamed from: o.ww7$b */
    public static final class C17990b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ uk7 f52799a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17990b(uk7 uk7Var) {
            super(0);
            this.f52799a = uk7Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f52799a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return ch3.m21246k();
            }
        }
    }

    public ww7(dnh dnhVar, r93 r93Var, List list, uk7 uk7Var) {
        sq8.m48649h(dnhVar, "tlsVersion");
        sq8.m48649h(r93Var, "cipherSuite");
        sq8.m48649h(list, "localCertificates");
        sq8.m48649h(uk7Var, "peerCertificatesFn");
        this.f52794a = dnhVar;
        this.f52795b = r93Var;
        this.f52796c = list;
        this.f52797d = si9.m48360a(new C17990b(uk7Var));
    }

    /* renamed from: a */
    public final r93 m55292a() {
        return this.f52795b;
    }

    /* renamed from: b */
    public final String m55293b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type2 = certificate.getType();
        sq8.m48648g(type2, "getType(...)");
        return type2;
    }

    /* renamed from: c */
    public final List m55294c() {
        return this.f52796c;
    }

    /* renamed from: d */
    public final List m55295d() {
        return (List) this.f52797d.getValue();
    }

    /* renamed from: e */
    public final dnh m55296e() {
        return this.f52794a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ww7) {
            ww7 ww7Var = (ww7) obj;
            if (ww7Var.f52794a == this.f52794a && sq8.m48644c(ww7Var.f52795b, this.f52795b) && sq8.m48644c(ww7Var.m55295d(), m55295d()) && sq8.m48644c(ww7Var.f52796c, this.f52796c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f52794a.hashCode()) * 31) + this.f52795b.hashCode()) * 31) + m55295d().hashCode()) * 31) + this.f52796c.hashCode();
    }

    public String toString() {
        List listM55295d = m55295d();
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM55295d, 10));
        Iterator it = listM55295d.iterator();
        while (it.hasNext()) {
            arrayList.add(m55293b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f52794a);
        sb.append(" cipherSuite=");
        sb.append(this.f52795b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f52796c;
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m55293b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
