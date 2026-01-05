package p001o;

import p001o.m18;
import p001o.oq1;

/* loaded from: classes3.dex */
public abstract class n18 {

    /* renamed from: o.n18$a */
    public static final class C15462a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f36216a;

        /* renamed from: b */
        public int f36217b;

        public C15462a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36216a = obj;
            this.f36217b |= Integer.MIN_VALUE;
            return n18.m39980a(null, this);
        }
    }

    /* renamed from: o.n18$b */
    public static final class C15463b extends oq1.AbstractC15863a {

        /* renamed from: c */
        public final Long f36218c;

        /* renamed from: d */
        public final /* synthetic */ m18 f36219d;

        public C15463b(m18 m18Var) {
            this.f36219d = m18Var;
            this.f36218c = m18Var.getContentLength();
        }

        @Override // p001o.oq1
        /* renamed from: a */
        public Long mo39989a() {
            return this.f36218c;
        }

        @Override // p001o.oq1.AbstractC15863a
        /* renamed from: c */
        public byte[] mo39990c() {
            return ((m18.AbstractC15193a) this.f36219d).mo38177a();
        }
    }

    /* renamed from: o.n18$c */
    public static final class C15464c extends oq1.AbstractC15864b {

        /* renamed from: c */
        public final Long f36220c;

        /* renamed from: d */
        public final boolean f36221d;

        /* renamed from: e */
        public final /* synthetic */ m18 f36222e;

        public C15464c(m18 m18Var) {
            this.f36222e = m18Var;
            this.f36220c = m18Var.getContentLength();
            this.f36221d = m18Var.isOneShot();
        }

        @Override // p001o.oq1
        /* renamed from: a */
        public Long mo39989a() {
            return this.f36220c;
        }

        @Override // p001o.oq1
        /* renamed from: b */
        public boolean mo39991b() {
            return this.f36221d;
        }

        @Override // p001o.oq1.AbstractC15864b
        /* renamed from: c */
        public y6f mo39992c() {
            return ((m18.AbstractC15194b) this.f36222e).readFrom();
        }
    }

    /* renamed from: o.n18$d */
    public static final class C15465d extends oq1.AbstractC15866d {

        /* renamed from: c */
        public final Long f36223c;

        /* renamed from: d */
        public final boolean f36224d;

        /* renamed from: e */
        public final /* synthetic */ m18 f36225e;

        public C15465d(m18 m18Var) {
            this.f36225e = m18Var;
            this.f36223c = m18Var.getContentLength();
            this.f36224d = m18Var.isOneShot();
        }

        @Override // p001o.oq1
        /* renamed from: a */
        public Long mo39989a() {
            return this.f36223c;
        }

        @Override // p001o.oq1
        /* renamed from: b */
        public boolean mo39991b() {
            return this.f36224d;
        }

        @Override // p001o.oq1.AbstractC15866d
        /* renamed from: c */
        public h8f mo39993c() {
            return ((m18.AbstractC15197e) this.f36225e).readFrom();
        }
    }

    /* renamed from: o.n18$e */
    public static final class C15466e extends m18.AbstractC15194b {

        /* renamed from: a */
        public final Long f36226a;

        /* renamed from: b */
        public final boolean f36227b = true;

        /* renamed from: c */
        public final /* synthetic */ y6f f36228c;

        public C15466e(Long l, y6f y6fVar) {
            this.f36228c = y6fVar;
            this.f36226a = l;
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.f36226a;
        }

        @Override // p001o.m18
        public boolean isOneShot() {
            return this.f36227b;
        }

        @Override // p001o.m18.AbstractC15194b
        public y6f readFrom() {
            return this.f36228c;
        }
    }

    /* renamed from: o.n18$f */
    public static final class C15467f extends m18.AbstractC15197e {

        /* renamed from: a */
        public final Long f36229a;

        /* renamed from: b */
        public final boolean f36230b = true;

        /* renamed from: c */
        public final /* synthetic */ h8f f36231c;

        public C15467f(Long l, h8f h8fVar) {
            this.f36231c = h8fVar;
            this.f36229a = l;
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.f36229a;
        }

        @Override // p001o.m18
        public boolean isOneShot() {
            return this.f36230b;
        }

        @Override // p001o.m18.AbstractC15197e
        public h8f readFrom() {
            return this.f36231c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m39980a(m18 m18Var, n64 n64Var) {
        C15462a c15462a;
        if (n64Var instanceof C15462a) {
            c15462a = (C15462a) n64Var;
            int i = c15462a.f36217b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15462a.f36217b = i - Integer.MIN_VALUE;
            } else {
                c15462a = new C15462a(n64Var);
            }
        }
        Object objM31738a = c15462a.f36216a;
        Object objM51918f = uq8.m51918f();
        int i2 = c15462a.f36217b;
        if (i2 != 0) {
            if (i2 == 1) {
                wre.m54934b(objM31738a);
                return ((t6f) objM31738a).mo49492m();
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objM31738a);
            return (byte[]) objM31738a;
        }
        wre.m54934b(objM31738a);
        if (m18Var instanceof m18.C15196d) {
            return null;
        }
        if (m18Var instanceof m18.AbstractC15193a) {
            return ((m18.AbstractC15193a) m18Var).mo38177a();
        }
        if (m18Var instanceof m18.AbstractC15194b) {
            y6f from = ((m18.AbstractC15194b) m18Var).readFrom();
            c15462a.f36217b = 1;
            objM31738a = z6f.m58853c(from, c15462a);
            if (objM31738a == objM51918f) {
                return objM51918f;
            }
            return ((t6f) objM31738a).mo49492m();
        }
        if (!(m18Var instanceof m18.AbstractC15197e)) {
            throw new szb();
        }
        h8f from2 = ((m18.AbstractC15197e) m18Var).readFrom();
        c15462a.f36217b = 2;
        objM31738a = i8f.m31738a(from2, c15462a);
        if (objM31738a == objM51918f) {
            return objM51918f;
        }
        return (byte[]) objM31738a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final oq1 m39981b(m18 m18Var) {
        oq1 c15465d;
        sq8.m48649h(m18Var, "<this>");
        if (m18Var instanceof rq1) {
            return ((rq1) m18Var).getStream();
        }
        if (m18Var instanceof m18.C15196d) {
            return null;
        }
        if (m18Var instanceof m18.AbstractC15193a) {
            c15465d = new C15463b(m18Var);
        } else if (m18Var instanceof m18.AbstractC15194b) {
            c15465d = new C15464c(m18Var);
        } else {
            if (!(m18Var instanceof m18.AbstractC15197e)) {
                throw new szb();
            }
            c15465d = new C15465d(m18Var);
        }
        return c15465d;
    }

    /* renamed from: c */
    public static final m18 m39982c(m18 m18Var, ax7 ax7Var, Long l) {
        sq8.m48649h(m18Var, "<this>");
        sq8.m48649h(ax7Var, "hashFunction");
        if (m18Var instanceof m18.AbstractC15197e) {
            return m39985f(new ix7(ax7Var, ((m18.AbstractC15197e) m18Var).readFrom()), l);
        }
        if (m18Var instanceof m18.AbstractC15194b) {
            return m39984e(new gx7(ax7Var, ((m18.AbstractC15194b) m18Var).readFrom()), l);
        }
        throw new xa3("HttpBody type is not supported");
    }

    /* renamed from: d */
    public static final m18 m39983d(oq1 oq1Var) {
        sq8.m48649h(oq1Var, "<this>");
        if (oq1Var instanceof oq1.AbstractC15863a) {
            return new pq1((oq1.AbstractC15863a) oq1Var);
        }
        if (oq1Var instanceof oq1.AbstractC15864b) {
            return new qq1((oq1.AbstractC15864b) oq1Var);
        }
        if (oq1Var instanceof oq1.AbstractC15866d) {
            return new uq1((oq1.AbstractC15866d) oq1Var);
        }
        throw new szb();
    }

    /* renamed from: e */
    public static final m18 m39984e(y6f y6fVar, Long l) {
        sq8.m48649h(y6fVar, "<this>");
        return new C15466e(l, y6fVar);
    }

    /* renamed from: f */
    public static final m18 m39985f(h8f h8fVar, Long l) {
        sq8.m48649h(h8fVar, "<this>");
        return new C15467f(l, h8fVar);
    }

    /* renamed from: g */
    public static final m18 m39986g(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return m18.Companion.m38178a(bArr);
    }

    /* renamed from: h */
    public static final y6f m39987h(m18 m18Var, h84 h84Var) {
        sq8.m48649h(m18Var, "<this>");
        if (m18Var instanceof m18.C15196d) {
            return null;
        }
        if (m18Var instanceof m18.AbstractC15193a) {
            return x6f.m55746d(((m18.AbstractC15193a) m18Var).mo38177a(), 0, 0, 6, null);
        }
        if (m18Var instanceof m18.AbstractC15194b) {
            return ((m18.AbstractC15194b) m18Var).readFrom();
        }
        if (m18Var instanceof m18.AbstractC15197e) {
            return i8f.m31739b(((m18.AbstractC15197e) m18Var).readFrom(), h84Var);
        }
        throw new szb();
    }

    /* renamed from: i */
    public static /* synthetic */ y6f m39988i(m18 m18Var, h84 h84Var, int i, Object obj) {
        if ((i & 1) != 0) {
            h84Var = null;
        }
        return m39987h(m18Var, h84Var);
    }
}
