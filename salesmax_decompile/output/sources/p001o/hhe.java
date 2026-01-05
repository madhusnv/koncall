package p001o;

/* loaded from: classes3.dex */
public final class hhe extends pf8 {

    /* renamed from: h */
    public static final Object[] f26988h;

    /* renamed from: q */
    public static final hhe f26989q;

    /* renamed from: c */
    public final transient Object[] f26990c;

    /* renamed from: d */
    public final transient int f26991d;

    /* renamed from: e */
    public final transient Object[] f26992e;

    /* renamed from: f */
    public final transient int f26993f;

    /* renamed from: g */
    public final transient int f26994g;

    static {
        Object[] objArr = new Object[0];
        f26988h = objArr;
        f26989q = new hhe(objArr, 0, objArr, 0, 0);
    }

    public hhe(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f26990c = objArr;
        this.f26991d = i;
        this.f26992e = objArr2;
        this.f26993f = i2;
        this.f26994g = i3;
    }

    @Override // p001o.pf8
    /* renamed from: A */
    public boolean mo30588A() {
        return true;
    }

    @Override // p001o.if8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f26992e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iM27711c = fx7.m27711c(obj);
        while (true) {
            int i = iM27711c & this.f26993f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM27711c = i + 1;
        }
    }

    @Override // p001o.if8
    /* renamed from: d */
    public int mo21882d(Object[] objArr, int i) {
        System.arraycopy(this.f26990c, 0, objArr, i, this.f26994g);
        return i + this.f26994g;
    }

    @Override // p001o.if8
    /* renamed from: e */
    public Object[] mo26704e() {
        return this.f26990c;
    }

    @Override // p001o.pf8, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f26991d;
    }

    @Override // p001o.if8
    /* renamed from: i */
    public int mo26705i() {
        return this.f26994g;
    }

    @Override // p001o.if8
    /* renamed from: j */
    public int mo26706j() {
        return 0;
    }

    @Override // p001o.if8
    /* renamed from: l */
    public boolean mo21883l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public q4i iterator() {
        return mo21881b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26994g;
    }

    @Override // p001o.pf8, p001o.if8
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // p001o.pf8
    /* renamed from: z */
    public nf8 mo28716z() {
        return nf8.m40507p(this.f26990c, this.f26994g);
    }
}
