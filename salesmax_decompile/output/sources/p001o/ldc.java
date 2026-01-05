package p001o;

/* loaded from: classes6.dex */
public final class ldc {

    /* renamed from: a */
    public final float f33654a;

    /* renamed from: b */
    public int f33655b;

    /* renamed from: c */
    public int f33656c;

    /* renamed from: d */
    public int f33657d;

    /* renamed from: e */
    public Object[] f33658e;

    public ldc() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    public static int m36980c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean m36981a(Object obj) {
        Object obj2;
        Object[] objArr = this.f33658e;
        int i = this.f33655b;
        int iM36980c = m36980c(obj.hashCode()) & i;
        Object obj3 = objArr[iM36980c];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iM36980c = (iM36980c + 1) & i;
                obj2 = objArr[iM36980c];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iM36980c] = obj;
        int i2 = this.f33656c + 1;
        this.f33656c = i2;
        if (i2 >= this.f33657d) {
            m36983d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m36982b() {
        return this.f33658e;
    }

    /* renamed from: d */
    public void m36983d() {
        Object obj;
        Object[] objArr = this.f33658e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f33656c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f33655b = i2;
                this.f33657d = (int) (i * this.f33654a);
                this.f33658e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iM36980c = m36980c(obj.hashCode()) & i2;
            if (objArr2[iM36980c] != null) {
                do {
                    iM36980c = (iM36980c + 1) & i2;
                } while (objArr2[iM36980c] != null);
            }
            objArr2[iM36980c] = objArr[length];
            i3 = i4;
        }
    }

    /* renamed from: e */
    public boolean m36984e(Object obj) {
        Object obj2;
        Object[] objArr = this.f33658e;
        int i = this.f33655b;
        int iM36980c = m36980c(obj.hashCode()) & i;
        Object obj3 = objArr[iM36980c];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return m36985f(iM36980c, objArr, i);
        }
        do {
            iM36980c = (iM36980c + 1) & i;
            obj2 = objArr[iM36980c];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return m36985f(iM36980c, objArr, i);
    }

    /* renamed from: f */
    public boolean m36985f(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f33656c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int iM36980c = m36980c(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iM36980c || iM36980c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < iM36980c || iM36980c <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public ldc(int i, float f) {
        this.f33654a = f;
        int iM43590a = pfd.m43590a(i);
        this.f33655b = iM43590a - 1;
        this.f33657d = (int) (f * iM43590a);
        this.f33658e = new Object[iM43590a];
    }
}
