package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sb8 {

    /* renamed from: a */
    public int[] f45122a;

    /* renamed from: b */
    public Object[] f45123b;

    /* renamed from: c */
    public lb8[] f45124c;

    /* renamed from: d */
    public int f45125d;

    public sb8() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f45122a = iArr;
        this.f45123b = new Object[50];
        this.f45124c = new lb8[50];
    }

    /* renamed from: c */
    public final boolean m48121c(Object obj, Object obj2) {
        sq8.m48649h(obj, "value");
        sq8.m48649h(obj2, "scope");
        return m48126h(obj).add(obj2);
    }

    /* renamed from: d */
    public final void m48122d() {
        lb8[] lb8VarArr = this.f45124c;
        int[] iArr = this.f45122a;
        Object[] objArr = this.f45123b;
        int length = lb8VarArr.length;
        for (int i = 0; i < length; i++) {
            lb8 lb8Var = lb8VarArr[i];
            if (lb8Var != null) {
                lb8Var.clear();
            }
            iArr[i] = i;
            objArr[i] = null;
        }
        this.f45125d = 0;
    }

    /* renamed from: e */
    public final boolean m48123e(Object obj) {
        sq8.m48649h(obj, "element");
        return m48124f(obj) >= 0;
    }

    /* renamed from: f */
    public final int m48124f(Object obj) {
        int iM42710a = ov.m42710a(obj);
        int i = this.f45125d - 1;
        Object[] objArr = this.f45123b;
        int[] iArr = this.f45122a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[iArr[i3]];
            int iM42710a2 = ov.m42710a(obj2);
            if (iM42710a2 < iM42710a) {
                i2 = i3 + 1;
            } else {
                if (iM42710a2 <= iM42710a) {
                    return obj == obj2 ? i3 : m48125g(i3, obj, iM42710a);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        return -(r5 + 1);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m48125g(int i, Object obj, int i2) {
        Object[] objArr = this.f45123b;
        int[] iArr = this.f45122a;
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = objArr[iArr[i3]];
            if (obj2 == obj) {
                return i3;
            }
            if (ov.m42710a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f45125d;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f45125d;
                break;
            }
            Object obj3 = objArr[iArr[i4]];
            if (obj3 == obj) {
                return i4;
            }
            if (ov.m42710a(obj3) != i2) {
                break;
            }
            i4++;
        }
    }

    /* renamed from: h */
    public final lb8 m48126h(Object obj) {
        int iM48124f;
        int i = this.f45125d;
        int[] iArr = this.f45122a;
        Object[] objArr = this.f45123b;
        lb8[] lb8VarArr = this.f45124c;
        if (i > 0) {
            iM48124f = m48124f(obj);
            if (iM48124f >= 0) {
                return m48133o(iM48124f);
            }
        } else {
            iM48124f = -1;
        }
        int i2 = -(iM48124f + 1);
        if (i < iArr.length) {
            int i3 = iArr[i];
            objArr[i3] = obj;
            lb8 lb8Var = lb8VarArr[i3];
            if (lb8Var == null) {
                lb8Var = new lb8();
                lb8VarArr[i3] = lb8Var;
            }
            if (i2 < i) {
                fp0.m27258g(iArr, iArr, i2 + 1, i2, i);
            }
            iArr[i2] = i3;
            this.f45125d++;
            return lb8Var;
        }
        int length = iArr.length * 2;
        Object[] objArrCopyOf = Arrays.copyOf(lb8VarArr, length);
        sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
        lb8[] lb8VarArr2 = (lb8[]) objArrCopyOf;
        lb8 lb8Var2 = new lb8();
        lb8VarArr2[i] = lb8Var2;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, length);
        sq8.m48648g(objArrCopyOf2, "copyOf(this, newSize)");
        objArrCopyOf2[i] = obj;
        int[] iArr2 = new int[length];
        for (int i4 = i + 1; i4 < length; i4++) {
            iArr2[i4] = i4;
        }
        if (i2 < i) {
            fp0.m27258g(iArr, iArr2, i2 + 1, i2, i);
        }
        iArr2[i2] = i;
        if (i2 > 0) {
            fp0.m27263l(iArr, iArr2, 0, 0, i2, 6, null);
        }
        this.f45124c = lb8VarArr2;
        this.f45123b = objArrCopyOf2;
        this.f45122a = iArr2;
        this.f45125d++;
        return lb8Var2;
    }

    /* renamed from: i */
    public final lb8[] m48127i() {
        return this.f45124c;
    }

    /* renamed from: j */
    public final int m48128j() {
        return this.f45125d;
    }

    /* renamed from: k */
    public final int[] m48129k() {
        return this.f45122a;
    }

    /* renamed from: l */
    public final Object[] m48130l() {
        return this.f45123b;
    }

    /* renamed from: m */
    public final boolean m48131m(Object obj, Object obj2) {
        int i;
        lb8 lb8Var;
        sq8.m48649h(obj, "value");
        sq8.m48649h(obj2, "scope");
        int iM48124f = m48124f(obj);
        int[] iArr = this.f45122a;
        lb8[] lb8VarArr = this.f45124c;
        Object[] objArr = this.f45123b;
        int i2 = this.f45125d;
        if (iM48124f < 0 || (lb8Var = lb8VarArr[(i = iArr[iM48124f])]) == null) {
            return false;
        }
        boolean zRemove = lb8Var.remove(obj2);
        if (lb8Var.size() == 0) {
            int i3 = iM48124f + 1;
            if (i3 < i2) {
                fp0.m27258g(iArr, iArr, iM48124f, i3, i2);
            }
            int i4 = i2 - 1;
            iArr[i4] = i;
            objArr[i] = null;
            this.f45125d = i4;
        }
        return zRemove;
    }

    /* renamed from: n */
    public final void m48132n(Object obj) {
        sq8.m48649h(obj, "scope");
        int[] iArrM48129k = m48129k();
        lb8[] lb8VarArrM48127i = m48127i();
        Object[] objArrM48130l = m48130l();
        int iM48128j = m48128j();
        int i = 0;
        for (int i2 = 0; i2 < iM48128j; i2++) {
            int i3 = iArrM48129k[i2];
            lb8 lb8Var = lb8VarArrM48127i[i3];
            sq8.m48646e(lb8Var);
            lb8Var.remove(obj);
            if (lb8Var.size() > 0) {
                if (i != i2) {
                    int i4 = iArrM48129k[i];
                    iArrM48129k[i] = i3;
                    iArrM48129k[i2] = i4;
                }
                i++;
            }
        }
        int iM48128j2 = m48128j();
        for (int i5 = i; i5 < iM48128j2; i5++) {
            objArrM48130l[iArrM48129k[i5]] = null;
        }
        m48134p(i);
    }

    /* renamed from: o */
    public final lb8 m48133o(int i) {
        lb8 lb8Var = this.f45124c[this.f45122a[i]];
        sq8.m48646e(lb8Var);
        return lb8Var;
    }

    /* renamed from: p */
    public final void m48134p(int i) {
        this.f45125d = i;
    }
}
