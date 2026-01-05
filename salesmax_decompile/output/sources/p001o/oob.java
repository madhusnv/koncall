package p001o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p001o.y9b;

/* loaded from: classes6.dex */
public final class oob extends xle {

    /* renamed from: g */
    public static final C15855b f38665g = new C15855b(null);

    /* renamed from: h */
    public static final y9b f38666h;

    /* renamed from: i */
    public static final y9b f38667i;

    /* renamed from: j */
    public static final y9b f38668j;

    /* renamed from: k */
    public static final y9b f38669k;

    /* renamed from: l */
    public static final y9b f38670l;

    /* renamed from: m */
    public static final byte[] f38671m;

    /* renamed from: n */
    public static final byte[] f38672n;

    /* renamed from: o */
    public static final byte[] f38673o;

    /* renamed from: b */
    public final zq1 f38674b;

    /* renamed from: c */
    public final y9b f38675c;

    /* renamed from: d */
    public final List f38676d;

    /* renamed from: e */
    public final y9b f38677e;

    /* renamed from: f */
    public long f38678f;

    /* renamed from: o.oob$a */
    public static final class C15854a {

        /* renamed from: a */
        public final zq1 f38679a;

        /* renamed from: b */
        public y9b f38680b;

        /* renamed from: c */
        public final List f38681c;

        /* JADX WARN: Multi-variable type inference failed */
        public C15854a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final C15854a m42501a(wx7 wx7Var, xle xleVar) {
            sq8.m48649h(xleVar, "body");
            m42502b(C15856c.f38682c.m42507a(wx7Var, xleVar));
            return this;
        }

        /* renamed from: b */
        public final C15854a m42502b(C15856c c15856c) {
            sq8.m48649h(c15856c, "part");
            this.f38681c.add(c15856c);
            return this;
        }

        /* renamed from: c */
        public final oob m42503c() {
            if (!this.f38681c.isEmpty()) {
                return new oob(this.f38679a, this.f38680b, jgj.m33829w(this.f38681c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final C15854a m42504d(y9b y9bVar) {
            sq8.m48649h(y9bVar, "type");
            if (sq8.m48644c(y9bVar.m57402h(), "multipart")) {
                this.f38680b = y9bVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + y9bVar).toString());
        }

        public C15854a(String str) {
            sq8.m48649h(str, "boundary");
            this.f38679a = zq1.f57497d.m59707c(str);
            this.f38680b = oob.f38666h;
            this.f38681c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C15854a(String str, int i, id5 id5Var) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                sq8.m48648g(str, "toString(...)");
            }
            this(str);
        }
    }

    /* renamed from: o.oob$b */
    public static final class C15855b {
        public C15855b() {
        }

        public /* synthetic */ C15855b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.oob$c */
    public static final class C15856c {

        /* renamed from: c */
        public static final a f38682c = new a(null);

        /* renamed from: a */
        public final wx7 f38683a;

        /* renamed from: b */
        public final xle f38684b;

        /* renamed from: o.oob$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C15856c m42507a(wx7 wx7Var, xle xleVar) {
                sq8.m48649h(xleVar, "body");
                id5 id5Var = null;
                if (!((wx7Var != null ? wx7Var.m55327d("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((wx7Var != null ? wx7Var.m55327d("Content-Length") : null) == null) {
                    return new C15856c(wx7Var, xleVar, id5Var);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public /* synthetic */ C15856c(wx7 wx7Var, xle xleVar, id5 id5Var) {
            this(wx7Var, xleVar);
        }

        /* renamed from: a */
        public final xle m42505a() {
            return this.f38684b;
        }

        /* renamed from: b */
        public final wx7 m42506b() {
            return this.f38683a;
        }

        public C15856c(wx7 wx7Var, xle xleVar) {
            this.f38683a = wx7Var;
            this.f38684b = xleVar;
        }
    }

    static {
        y9b.C18360a c18360a = y9b.f55104e;
        f38666h = c18360a.m57403a("multipart/mixed");
        f38667i = c18360a.m57403a("multipart/alternative");
        f38668j = c18360a.m57403a("multipart/digest");
        f38669k = c18360a.m57403a("multipart/parallel");
        f38670l = c18360a.m57403a("multipart/form-data");
        f38671m = new byte[]{58, 32};
        f38672n = new byte[]{13, 10};
        f38673o = new byte[]{45, 45};
    }

    public oob(zq1 zq1Var, y9b y9bVar, List list) {
        sq8.m48649h(zq1Var, "boundaryByteString");
        sq8.m48649h(y9bVar, "type");
        sq8.m48649h(list, "parts");
        this.f38674b = zq1Var;
        this.f38675c = y9bVar;
        this.f38676d = list;
        this.f38677e = y9b.f55104e.m57403a(y9bVar + "; boundary=" + m42499j());
        this.f38678f = -1L;
    }

    @Override // p001o.xle
    /* renamed from: a */
    public long mo18953a() throws EOFException {
        long j = this.f38678f;
        if (j != -1) {
            return j;
        }
        long jM42500k = m42500k(null, true);
        this.f38678f = jM42500k;
        return jM42500k;
    }

    @Override // p001o.xle
    /* renamed from: b */
    public y9b mo18954b() {
        return this.f38677e;
    }

    @Override // p001o.xle
    /* renamed from: h */
    public boolean mo42498h() {
        List list = this.f38676d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C15856c) it.next()).m42505a().mo42498h()) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.xle
    /* renamed from: i */
    public void mo18955i(gm1 gm1Var) throws EOFException {
        sq8.m48649h(gm1Var, "sink");
        m42500k(gm1Var, false);
    }

    /* renamed from: j */
    public final String m42499j() {
        return this.f38674b.m59696R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final long m42500k(gm1 gm1Var, boolean z) throws EOFException {
        rl1 rl1Var;
        if (z) {
            gm1Var = new rl1();
            rl1Var = gm1Var;
        } else {
            rl1Var = 0;
        }
        int size = this.f38676d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C15856c c15856c = (C15856c) this.f38676d.get(i);
            wx7 wx7VarM42506b = c15856c.m42506b();
            xle xleVarM42505a = c15856c.m42505a();
            sq8.m48646e(gm1Var);
            gm1Var.write(f38673o);
            gm1Var.M2(this.f38674b);
            gm1Var.write(f38672n);
            if (wx7VarM42506b != null) {
                int size2 = wx7VarM42506b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    gm1Var.n0(wx7VarM42506b.m55329j(i2)).write(f38671m).n0(wx7VarM42506b.m55333w(i2)).write(f38672n);
                }
            }
            y9b y9bVarMo18954b = xleVarM42505a.mo18954b();
            if (y9bVarMo18954b != null) {
                gm1Var.n0("Content-Type: ").n0(y9bVarMo18954b.toString()).write(f38672n);
            }
            long jMo18953a = xleVarM42505a.mo18953a();
            if (jMo18953a == -1 && z) {
                sq8.m48646e(rl1Var);
                rl1Var.clear();
                return -1L;
            }
            byte[] bArr = f38672n;
            gm1Var.write(bArr);
            if (z) {
                j += jMo18953a;
            } else {
                xleVarM42505a.mo18955i(gm1Var);
            }
            gm1Var.write(bArr);
        }
        sq8.m48646e(gm1Var);
        byte[] bArr2 = f38673o;
        gm1Var.write(bArr2);
        gm1Var.M2(this.f38674b);
        gm1Var.write(bArr2);
        gm1Var.write(f38672n);
        if (!z) {
            return j;
        }
        sq8.m48646e(rl1Var);
        long jF0 = j + rl1Var.f0();
        rl1Var.clear();
        return jF0;
    }
}
