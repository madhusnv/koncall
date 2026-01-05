package p001o;

/* loaded from: classes2.dex */
public final class yxf {

    /* renamed from: a */
    public int f56236a;

    /* renamed from: b */
    public int[] f56237b = new int[16];

    /* renamed from: c */
    public j4j[] f56238c = new j4j[16];

    /* renamed from: a */
    public final boolean m58460a(Object obj) {
        int iM58461b;
        sq8.m48649h(obj, "value");
        int i = this.f56236a;
        int iM42710a = ov.m42710a(obj);
        if (i > 0) {
            iM58461b = m58461b(obj, iM42710a);
            if (iM58461b >= 0) {
                return false;
            }
        } else {
            iM58461b = -1;
        }
        int i2 = -(iM58461b + 1);
        j4j[] j4jVarArr = this.f56238c;
        int length = j4jVarArr.length;
        if (i == length) {
            int i3 = length * 2;
            j4j[] j4jVarArr2 = new j4j[i3];
            int[] iArr = new int[i3];
            int i4 = i2 + 1;
            fp0.m27260i(j4jVarArr, j4jVarArr2, i4, i2, i);
            fp0.m27264m(this.f56238c, j4jVarArr2, 0, 0, i2, 6, null);
            fp0.m27258g(this.f56237b, iArr, i4, i2, i);
            fp0.m27263l(this.f56237b, iArr, 0, 0, i2, 6, null);
            this.f56238c = j4jVarArr2;
            this.f56237b = iArr;
        } else {
            int i5 = i2 + 1;
            fp0.m27260i(j4jVarArr, j4jVarArr, i5, i2, i);
            int[] iArr2 = this.f56237b;
            fp0.m27258g(iArr2, iArr2, i5, i2, i);
        }
        this.f56238c[i2] = new j4j(obj);
        this.f56237b[i2] = iM42710a;
        this.f56236a++;
        return true;
    }

    /* renamed from: b */
    public final int m58461b(Object obj, int i) {
        int i2 = this.f56236a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f56237b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    j4j j4jVar = this.f56238c[i4];
                    return obj == (j4jVar != null ? j4jVar.get() : null) ? i4 : m58462c(i4, obj, i);
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f56236a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f56237b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f56238c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f56236a;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m58462c(int i, Object obj, int i2) {
        int i3 = i - 1;
        while (true) {
            if (-1 >= i3 || this.f56237b[i3] != i2) {
                break;
            }
            j4j j4jVar = this.f56238c[i3];
            if ((j4jVar != null ? j4jVar.get() : null) == obj) {
                return i3;
            }
            i3--;
        }
    }

    /* renamed from: d */
    public final int[] m58463d() {
        return this.f56237b;
    }

    /* renamed from: e */
    public final int m58464e() {
        return this.f56236a;
    }

    /* renamed from: f */
    public final j4j[] m58465f() {
        return this.f56238c;
    }

    /* renamed from: g */
    public final void m58466g(int i) {
        this.f56236a = i;
    }
}
