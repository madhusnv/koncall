package p001o;

import java.util.Arrays;
import p001o.a7g;
import p001o.j27;

/* loaded from: classes2.dex */
public final class h27 extends a7g {

    /* renamed from: n */
    public j27 f26118n;

    /* renamed from: o */
    public C13842a f26119o;

    /* renamed from: o.h27$a */
    public static final class C13842a implements bac {

        /* renamed from: a */
        public j27 f26120a;

        /* renamed from: b */
        public j27.C14432a f26121b;

        /* renamed from: c */
        public long f26122c = -1;

        /* renamed from: d */
        public long f26123d = -1;

        public C13842a(j27 j27Var, j27.C14432a c14432a) {
            this.f26120a = j27Var;
            this.f26121b = c14432a;
        }

        @Override // p001o.bac
        /* renamed from: a */
        public long mo16576a(uq6 uq6Var) {
            long j = this.f26123d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f26123d = -1L;
            return j2;
        }

        @Override // p001o.bac
        /* renamed from: b */
        public zaf mo16577b() {
            op0.m42517g(this.f26122c != -1);
            return new i27(this.f26120a, this.f26122c);
        }

        @Override // p001o.bac
        /* renamed from: c */
        public void mo16578c(long j) {
            long[] jArr = this.f26121b.f29626a;
            this.f26123d = jArr[sqi.m48728g(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void m29757d(long j) {
            this.f26122c = j;
        }
    }

    /* renamed from: o */
    public static boolean m29754o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m29755p(zwc zwcVar) {
        return zwcVar.m60020a() >= 5 && zwcVar.m60004H() == 127 && zwcVar.m60006J() == 1179402563;
    }

    @Override // p001o.a7g
    /* renamed from: f */
    public long mo16568f(zwc zwcVar) {
        if (m29754o(zwcVar.m60024e())) {
            return m29756n(zwcVar);
        }
        return -1L;
    }

    @Override // p001o.a7g
    /* renamed from: i */
    public boolean mo16571i(zwc zwcVar, long j, a7g.C12107b c12107b) {
        byte[] bArrM60024e = zwcVar.m60024e();
        j27 j27Var = this.f26118n;
        if (j27Var == null) {
            j27 j27Var2 = new j27(bArrM60024e, 17);
            this.f26118n = j27Var2;
            c12107b.f14257a = j27Var2.m33094g(Arrays.copyOfRange(bArrM60024e, 9, zwcVar.m60026g()), null);
            return true;
        }
        if ((bArrM60024e[0] & 127) == 3) {
            j27.C14432a c14432aM27995g = g27.m27995g(zwcVar);
            j27 j27VarM33090b = j27Var.m33090b(c14432aM27995g);
            this.f26118n = j27VarM33090b;
            this.f26119o = new C13842a(j27VarM33090b, c14432aM27995g);
            return true;
        }
        if (!m29754o(bArrM60024e)) {
            return true;
        }
        C13842a c13842a = this.f26119o;
        if (c13842a != null) {
            c13842a.m29757d(j);
            c12107b.f14258b = this.f26119o;
        }
        op0.m42515e(c12107b.f14257a);
        return false;
    }

    @Override // p001o.a7g
    /* renamed from: l */
    public void mo16574l(boolean z) {
        super.mo16574l(z);
        if (z) {
            this.f26118n = null;
            this.f26119o = null;
        }
    }

    /* renamed from: n */
    public final int m29756n(zwc zwcVar) {
        int i = (zwcVar.m60024e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            zwcVar.m60018V(4);
            zwcVar.m60011O();
        }
        int iM25968j = f27.m25968j(zwcVar, i);
        zwcVar.m60017U(0);
        return iM25968j;
    }
}
