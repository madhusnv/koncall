package p001o;

import java.io.IOException;
import java.net.ProtocolException;
import p001o.dee;
import p001o.el6;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class dl6 {

    /* renamed from: a */
    public final yce f20164a;

    /* renamed from: b */
    public final dk6 f20165b;

    /* renamed from: c */
    public final fl6 f20166c;

    /* renamed from: d */
    public final el6 f20167d;

    /* renamed from: e */
    public boolean f20168e;

    /* renamed from: f */
    public boolean f20169f;

    /* renamed from: o.dl6$a */
    public final class C12983a extends sf7 {

        /* renamed from: b */
        public final long f20170b;

        /* renamed from: c */
        public boolean f20171c;

        /* renamed from: d */
        public long f20172d;

        /* renamed from: e */
        public boolean f20173e;

        /* renamed from: f */
        public final /* synthetic */ dl6 f20174f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12983a(dl6 dl6Var, dvf dvfVar, long j) {
            super(dvfVar);
            sq8.m48649h(dvfVar, "delegate");
            this.f20174f = dl6Var;
            this.f20170b = j;
        }

        @Override // p001o.sf7, p001o.dvf
        public void M0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "source");
            if (!(!this.f20173e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f20170b;
            if (j2 == -1 || this.f20172d + j <= j2) {
                try {
                    super.M0(rl1Var, j);
                    this.f20172d += j;
                    return;
                } catch (IOException e) {
                    throw m23410a(e);
                }
            }
            throw new ProtocolException("expected " + this.f20170b + " bytes but received " + (this.f20172d + j));
        }

        /* renamed from: a */
        public final IOException m23410a(IOException iOException) {
            if (this.f20171c) {
                return iOException;
            }
            this.f20171c = true;
            return this.f20174f.m23386a(this.f20172d, false, true, iOException);
        }

        @Override // p001o.sf7, p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f20173e) {
                return;
            }
            this.f20173e = true;
            long j = this.f20170b;
            if (j != -1 && this.f20172d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m23410a(null);
            } catch (IOException e) {
                throw m23410a(e);
            }
        }

        @Override // p001o.sf7, p001o.dvf, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m23410a(e);
            }
        }
    }

    /* renamed from: o.dl6$b */
    public final class C12984b extends tf7 {

        /* renamed from: b */
        public final long f20175b;

        /* renamed from: c */
        public long f20176c;

        /* renamed from: d */
        public boolean f20177d;

        /* renamed from: e */
        public boolean f20178e;

        /* renamed from: f */
        public boolean f20179f;

        /* renamed from: g */
        public final /* synthetic */ dl6 f20180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12984b(dl6 dl6Var, lzf lzfVar, long j) {
            super(lzfVar);
            sq8.m48649h(lzfVar, "delegate");
            this.f20180g = dl6Var;
            this.f20175b = j;
            this.f20177d = true;
            if (j == 0) {
                m23411c(null);
            }
        }

        @Override // p001o.tf7, p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            if (!(!this.f20179f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jN0 = m49807a().N0(rl1Var, j);
                if (this.f20177d) {
                    this.f20177d = false;
                    this.f20180g.m23394i().responseBodyStart(this.f20180g.m23392g());
                }
                if (jN0 == -1) {
                    m23411c(null);
                    return -1L;
                }
                long j2 = this.f20176c + jN0;
                long j3 = this.f20175b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f20175b + " bytes but received " + j2);
                }
                this.f20176c = j2;
                if (j2 == j3) {
                    m23411c(null);
                }
                return jN0;
            } catch (IOException e) {
                throw m23411c(e);
            }
        }

        /* renamed from: c */
        public final IOException m23411c(IOException iOException) {
            if (this.f20178e) {
                return iOException;
            }
            this.f20178e = true;
            if (iOException == null && this.f20177d) {
                this.f20177d = false;
                this.f20180g.m23394i().responseBodyStart(this.f20180g.m23392g());
            }
            return this.f20180g.m23386a(this.f20176c, true, false, iOException);
        }

        @Override // p001o.tf7, p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f20179f) {
                return;
            }
            this.f20179f = true;
            try {
                super.close();
                m23411c(null);
            } catch (IOException e) {
                throw m23411c(e);
            }
        }
    }

    public dl6(yce yceVar, dk6 dk6Var, fl6 fl6Var, el6 el6Var) {
        sq8.m48649h(yceVar, "call");
        sq8.m48649h(dk6Var, "eventListener");
        sq8.m48649h(fl6Var, "finder");
        sq8.m48649h(el6Var, "codec");
        this.f20164a = yceVar;
        this.f20165b = dk6Var;
        this.f20166c = fl6Var;
        this.f20167d = el6Var;
    }

    /* renamed from: a */
    public final IOException m23386a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m23406u(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f20165b.requestFailed(this.f20164a, iOException);
            } else {
                this.f20165b.requestBodyEnd(this.f20164a, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f20165b.responseFailed(this.f20164a, iOException);
            } else {
                this.f20165b.responseBodyEnd(this.f20164a, j);
            }
        }
        return this.f20164a.m57594v(this, z2, z, iOException);
    }

    /* renamed from: b */
    public final void m23387b() {
        this.f20167d.cancel();
    }

    /* renamed from: c */
    public final dvf m23388c(ule uleVar, boolean z) {
        sq8.m48649h(uleVar, "request");
        this.f20168e = z;
        xle xleVarM51730a = uleVar.m51730a();
        sq8.m48646e(xleVarM51730a);
        long jMo18953a = xleVarM51730a.mo18953a();
        this.f20165b.requestBodyStart(this.f20164a);
        return new C12983a(this, this.f20167d.mo24072b(uleVar, jMo18953a), jMo18953a);
    }

    /* renamed from: d */
    public final void m23389d() {
        this.f20167d.cancel();
        this.f20164a.m57594v(this, true, true, null);
    }

    /* renamed from: e */
    public final void m23390e() throws IOException {
        try {
            this.f20167d.mo24071a();
        } catch (IOException e) {
            this.f20165b.requestFailed(this.f20164a, e);
            m23406u(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void m23391f() throws IOException {
        try {
            this.f20167d.mo24075e();
        } catch (IOException e) {
            this.f20165b.requestFailed(this.f20164a, e);
            m23406u(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final yce m23392g() {
        return this.f20164a;
    }

    /* renamed from: h */
    public final zce m23393h() {
        el6.InterfaceC13212a interfaceC13212aMo24076f = this.f20167d.mo24076f();
        zce zceVar = interfaceC13212aMo24076f instanceof zce ? (zce) interfaceC13212aMo24076f : null;
        if (zceVar != null) {
            return zceVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels".toString());
    }

    /* renamed from: i */
    public final dk6 m23394i() {
        return this.f20165b;
    }

    /* renamed from: j */
    public final fl6 m23395j() {
        return this.f20166c;
    }

    /* renamed from: k */
    public final boolean m23396k() {
        return this.f20169f;
    }

    /* renamed from: l */
    public final boolean m23397l() {
        return !sq8.m48644c(this.f20166c.mo27016b().getAddress().m22357l().m53877h(), this.f20167d.mo24076f().getRoute().m19864a().m22357l().m53877h());
    }

    /* renamed from: m */
    public final boolean m23398m() {
        return this.f20168e;
    }

    /* renamed from: n */
    public final dee.AbstractC12890d m23399n() {
        this.f20164a.m57576A();
        el6.InterfaceC13212a interfaceC13212aMo24076f = this.f20167d.mo24076f();
        sq8.m48647f(interfaceC13212aMo24076f, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        return ((zce) interfaceC13212aMo24076f).m59206t(this);
    }

    /* renamed from: o */
    public final void m23400o() {
        this.f20167d.mo24076f().mo25204c();
    }

    /* renamed from: p */
    public final void m23401p() {
        this.f20164a.m57594v(this, true, false, null);
    }

    /* renamed from: q */
    public final cre m23402q(zqe zqeVar) throws IOException {
        sq8.m48649h(zqeVar, "response");
        try {
            String strM59725t = zqe.m59725t(zqeVar, "Content-Type", null, 2, null);
            long jMo24079i = this.f20167d.mo24079i(zqeVar);
            return new dde(strM59725t, jMo24079i, uac.m51310c(new C12984b(this, this.f20167d.mo24073c(zqeVar), jMo24079i)));
        } catch (IOException e) {
            this.f20165b.responseFailed(this.f20164a, e);
            m23406u(e);
            throw e;
        }
    }

    /* renamed from: r */
    public final zqe.C18696a m23403r(boolean z) throws IOException {
        try {
            zqe.C18696a c18696aMo24074d = this.f20167d.mo24074d(z);
            if (c18696aMo24074d != null) {
                c18696aMo24074d.m59758k(this);
            }
            return c18696aMo24074d;
        } catch (IOException e) {
            this.f20165b.responseFailed(this.f20164a, e);
            m23406u(e);
            throw e;
        }
    }

    /* renamed from: s */
    public final void m23404s(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        this.f20165b.responseHeadersEnd(this.f20164a, zqeVar);
    }

    /* renamed from: t */
    public final void m23405t() {
        this.f20165b.responseHeadersStart(this.f20164a);
    }

    /* renamed from: u */
    public final void m23406u(IOException iOException) {
        this.f20169f = true;
        this.f20167d.mo24076f().mo25203b(this.f20164a, iOException);
    }

    /* renamed from: v */
    public final wx7 m23407v() {
        return this.f20167d.mo24077g();
    }

    /* renamed from: w */
    public final void m23408w() {
        m23386a(-1L, true, true, null);
    }

    /* renamed from: x */
    public final void m23409x(ule uleVar) throws IOException {
        sq8.m48649h(uleVar, "request");
        try {
            this.f20165b.requestHeadersStart(this.f20164a);
            this.f20167d.mo24078h(uleVar);
            this.f20165b.requestHeadersEnd(this.f20164a, uleVar);
        } catch (IOException e) {
            this.f20165b.requestFailed(this.f20164a, e);
            m23406u(e);
            throw e;
        }
    }
}
