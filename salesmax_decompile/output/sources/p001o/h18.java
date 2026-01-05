package p001o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p001o.el6;
import p001o.wx7;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class h18 implements el6 {

    /* renamed from: g */
    public static final C13841a f26083g = new C13841a(null);

    /* renamed from: h */
    public static final List f26084h = jgj.m33817k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f26085i = jgj.m33817k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final el6.InterfaceC13212a f26086a;

    /* renamed from: b */
    public final cde f26087b;

    /* renamed from: c */
    public final g18 f26088c;

    /* renamed from: d */
    public volatile j18 f26089d;

    /* renamed from: e */
    public final a2e f26090e;

    /* renamed from: f */
    public volatile boolean f26091f;

    /* renamed from: o.h18$a */
    public static final class C13841a {

        /* renamed from: o.h18$a$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public static final a f26092a = new a();

            public a() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wx7 invoke() {
                throw new IllegalStateException("trailers not available".toString());
            }
        }

        public C13841a() {
        }

        public /* synthetic */ C13841a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m29747a(ule uleVar) {
            sq8.m48649h(uleVar, "request");
            wx7 wx7VarM51735f = uleVar.m51735f();
            ArrayList arrayList = new ArrayList(wx7VarM51735f.size() + 4);
            arrayList.add(new sx7(sx7.f46080g, uleVar.m51737h()));
            arrayList.add(new sx7(sx7.f46081h, fme.f23676a.m27088c(uleVar.m51741l())));
            String strM51734e = uleVar.m51734e("Host");
            if (strM51734e != null) {
                arrayList.add(new sx7(sx7.f46083j, strM51734e));
            }
            arrayList.add(new sx7(sx7.f46082i, uleVar.m51741l().m53886r()));
            int size = wx7VarM51735f.size();
            for (int i = 0; i < size; i++) {
                String strM55329j = wx7VarM51735f.m55329j(i);
                Locale locale = Locale.US;
                sq8.m48648g(locale, "US");
                String lowerCase = strM55329j.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                if (!h18.f26084h.contains(lowerCase) || (sq8.m48644c(lowerCase, "te") && sq8.m48644c(wx7VarM51735f.m55333w(i), "trailers"))) {
                    arrayList.add(new sx7(lowerCase, wx7VarM51735f.m55333w(i)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final zqe.C18696a m29748b(wx7 wx7Var, a2e a2eVar) throws ProtocolException {
            sq8.m48649h(wx7Var, "headerBlock");
            sq8.m48649h(a2eVar, "protocol");
            wx7.C17997a c17997a = new wx7.C17997a();
            int size = wx7Var.size();
            r5g r5gVarM46248a = null;
            for (int i = 0; i < size; i++) {
                String strM55329j = wx7Var.m55329j(i);
                String strM55333w = wx7Var.m55333w(i);
                if (sq8.m48644c(strM55329j, ":status")) {
                    r5gVarM46248a = r5g.f43038d.m46248a("HTTP/1.1 " + strM55333w);
                } else if (!h18.f26085i.contains(strM55329j)) {
                    c17997a.m55338d(strM55329j, strM55333w);
                }
            }
            if (r5gVarM46248a != null) {
                return new zqe.C18696a().m59762o(a2eVar).m59752e(r5gVarM46248a.f43040b).m59759l(r5gVarM46248a.f43041c).m59757j(c17997a.m55340f()).m59747C(a.f26092a);
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public h18(hac hacVar, el6.InterfaceC13212a interfaceC13212a, cde cdeVar, g18 g18Var) {
        sq8.m48649h(hacVar, "client");
        sq8.m48649h(interfaceC13212a, "carrier");
        sq8.m48649h(cdeVar, "chain");
        sq8.m48649h(g18Var, "http2Connection");
        this.f26086a = interfaceC13212a;
        this.f26087b = cdeVar;
        this.f26088c = g18Var;
        List listM30054D = hacVar.m30054D();
        a2e a2eVar = a2e.H2_PRIOR_KNOWLEDGE;
        this.f26090e = listM30054D.contains(a2eVar) ? a2eVar : a2e.HTTP_2;
    }

    @Override // p001o.el6
    /* renamed from: a */
    public void mo24071a() {
        j18 j18Var = this.f26089d;
        sq8.m48646e(j18Var);
        j18Var.m33046o().close();
    }

    @Override // p001o.el6
    /* renamed from: b */
    public dvf mo24072b(ule uleVar, long j) {
        sq8.m48649h(uleVar, "request");
        j18 j18Var = this.f26089d;
        sq8.m48646e(j18Var);
        return j18Var.m33046o();
    }

    @Override // p001o.el6
    /* renamed from: c */
    public lzf mo24073c(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        j18 j18Var = this.f26089d;
        sq8.m48646e(j18Var);
        return j18Var.m33048q();
    }

    @Override // p001o.el6
    public void cancel() {
        this.f26091f = true;
        j18 j18Var = this.f26089d;
        if (j18Var != null) {
            j18Var.m33038g(fj6.CANCEL);
        }
    }

    @Override // p001o.el6
    /* renamed from: d */
    public zqe.C18696a mo24074d(boolean z) throws IOException {
        j18 j18Var = this.f26089d;
        if (j18Var == null) {
            throw new IOException("stream wasn't created");
        }
        zqe.C18696a c18696aM29748b = f26083g.m29748b(j18Var.m33029B(z), this.f26090e);
        if (z && c18696aM29748b.m59753f() == 100) {
            return null;
        }
        return c18696aM29748b;
    }

    @Override // p001o.el6
    /* renamed from: e */
    public void mo24075e() {
        this.f26088c.flush();
    }

    @Override // p001o.el6
    /* renamed from: f */
    public el6.InterfaceC13212a mo24076f() {
        return this.f26086a;
    }

    @Override // p001o.el6
    /* renamed from: g */
    public wx7 mo24077g() {
        j18 j18Var = this.f26089d;
        sq8.m48646e(j18Var);
        return j18Var.m33030C();
    }

    @Override // p001o.el6
    /* renamed from: h */
    public void mo24078h(ule uleVar) throws IOException {
        sq8.m48649h(uleVar, "request");
        if (this.f26089d != null) {
            return;
        }
        this.f26089d = this.f26088c.A0(f26083g.m29747a(uleVar), uleVar.m51730a() != null);
        if (this.f26091f) {
            j18 j18Var = this.f26089d;
            sq8.m48646e(j18Var);
            j18Var.m33038g(fj6.CANCEL);
            throw new IOException("Canceled");
        }
        j18 j18Var2 = this.f26089d;
        sq8.m48646e(j18Var2);
        nmh nmhVarM33054w = j18Var2.m33054w();
        long jM20978h = this.f26087b.m20978h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nmhVarM33054w.mo40796g(jM20978h, timeUnit);
        j18 j18Var3 = this.f26089d;
        sq8.m48646e(j18Var3);
        j18Var3.m33032E().mo40796g(this.f26087b.m20980j(), timeUnit);
    }

    @Override // p001o.el6
    /* renamed from: i */
    public long mo24079i(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        if (k38.m34939b(zqeVar)) {
            return jgj.m33816j(zqeVar);
        }
        return 0L;
    }
}
