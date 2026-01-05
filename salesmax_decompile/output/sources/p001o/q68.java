package p001o;

/* loaded from: classes5.dex */
public class q68 {

    /* renamed from: a */
    public final Object f41364a;

    /* renamed from: b */
    public s89 f41365b;

    /* renamed from: c */
    public final boolean f41366c;

    /* renamed from: d */
    public final xl1 f41367d;

    /* renamed from: e */
    public byte[] f41368e;

    /* renamed from: f */
    public byte[] f41369f;

    /* renamed from: g */
    public char[] f41370g;

    /* renamed from: h */
    public char[] f41371h;

    /* renamed from: i */
    public char[] f41372i;

    public q68(xl1 xl1Var, Object obj, boolean z) {
        this.f41367d = xl1Var;
        this.f41364a = obj;
        this.f41366c = z;
    }

    /* renamed from: a */
    public final void m44845a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* renamed from: b */
    public final void m44846b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw m44863s();
        }
    }

    /* renamed from: c */
    public final void m44847c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw m44863s();
        }
    }

    /* renamed from: d */
    public char[] m44848d() {
        m44845a(this.f41371h);
        char[] cArrM56438c = this.f41367d.m56438c(1);
        this.f41371h = cArrM56438c;
        return cArrM56438c;
    }

    /* renamed from: e */
    public byte[] m44849e() {
        m44845a(this.f41368e);
        byte[] bArrM56436a = this.f41367d.m56436a(0);
        this.f41368e = bArrM56436a;
        return bArrM56436a;
    }

    /* renamed from: f */
    public char[] m44850f() {
        m44845a(this.f41370g);
        char[] cArrM56438c = this.f41367d.m56438c(0);
        this.f41370g = cArrM56438c;
        return cArrM56438c;
    }

    /* renamed from: g */
    public char[] m44851g(int i) {
        m44845a(this.f41370g);
        char[] cArrM56439d = this.f41367d.m56439d(0, i);
        this.f41370g = cArrM56439d;
        return cArrM56439d;
    }

    /* renamed from: h */
    public byte[] m44852h() {
        m44845a(this.f41369f);
        byte[] bArrM56436a = this.f41367d.m56436a(1);
        this.f41369f = bArrM56436a;
        return bArrM56436a;
    }

    /* renamed from: i */
    public pgh m44853i() {
        return new pgh(this.f41367d);
    }

    /* renamed from: j */
    public s89 m44854j() {
        return this.f41365b;
    }

    /* renamed from: k */
    public Object m44855k() {
        return this.f41364a;
    }

    /* renamed from: l */
    public boolean m44856l() {
        return this.f41366c;
    }

    /* renamed from: m */
    public void m44857m(char[] cArr) {
        if (cArr != null) {
            m44847c(cArr, this.f41371h);
            this.f41371h = null;
            this.f41367d.m56445j(1, cArr);
        }
    }

    /* renamed from: n */
    public void m44858n(char[] cArr) {
        if (cArr != null) {
            m44847c(cArr, this.f41372i);
            this.f41372i = null;
            this.f41367d.m56445j(3, cArr);
        }
    }

    /* renamed from: o */
    public void m44859o(byte[] bArr) {
        if (bArr != null) {
            m44846b(bArr, this.f41368e);
            this.f41368e = null;
            this.f41367d.m56444i(0, bArr);
        }
    }

    /* renamed from: p */
    public void m44860p(char[] cArr) {
        if (cArr != null) {
            m44847c(cArr, this.f41370g);
            this.f41370g = null;
            this.f41367d.m56445j(0, cArr);
        }
    }

    /* renamed from: q */
    public void m44861q(byte[] bArr) {
        if (bArr != null) {
            m44846b(bArr, this.f41369f);
            this.f41369f = null;
            this.f41367d.m56444i(1, bArr);
        }
    }

    /* renamed from: r */
    public void m44862r(s89 s89Var) {
        this.f41365b = s89Var;
    }

    /* renamed from: s */
    public final IllegalArgumentException m44863s() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
