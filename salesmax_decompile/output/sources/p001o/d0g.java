package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class d0g implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f18936a;

    /* renamed from: b */
    public /* synthetic */ int[] f18937b;

    /* renamed from: c */
    public /* synthetic */ Object[] f18938c;

    /* renamed from: d */
    public /* synthetic */ int f18939d;

    public d0g() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public void m22181a(int i, Object obj) {
        int i2 = this.f18939d;
        if (i2 != 0 && i <= this.f18937b[i2 - 1]) {
            m22190l(i, obj);
            return;
        }
        if (this.f18936a && i2 >= this.f18937b.length) {
            e0g.m24058d(this);
        }
        int i3 = this.f18939d;
        if (i3 >= this.f18937b.length) {
            int iM29731e = h14.m29731e(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f18937b, iM29731e);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f18937b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f18938c, iM29731e);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f18938c = objArrCopyOf;
        }
        this.f18937b[i3] = i;
        this.f18938c[i3] = obj;
        this.f18939d = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0g clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        sq8.m48647f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        d0g d0gVar = (d0g) objClone;
        d0gVar.f18937b = (int[]) this.f18937b.clone();
        d0gVar.f18938c = (Object[]) this.f18938c.clone();
        return d0gVar;
    }

    /* renamed from: c */
    public boolean m22183c(int i) {
        return m22186h(i) >= 0;
    }

    public void clear() {
        int i = this.f18939d;
        Object[] objArr = this.f18938c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f18939d = 0;
        this.f18936a = false;
    }

    /* renamed from: f */
    public Object m22184f(int i) {
        return e0g.m24057c(this, i);
    }

    /* renamed from: g */
    public final boolean m22185g() {
        return m22188j();
    }

    /* renamed from: h */
    public int m22186h(int i) {
        if (this.f18936a) {
            e0g.m24058d(this);
        }
        return h14.m29727a(this.f18937b, this.f18939d, i);
    }

    /* renamed from: i */
    public int m22187i(Object obj) {
        if (this.f18936a) {
            e0g.m24058d(this);
        }
        int i = this.f18939d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18938c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean m22188j() {
        return m22193p() == 0;
    }

    /* renamed from: k */
    public int m22189k(int i) {
        if (this.f18936a) {
            e0g.m24058d(this);
        }
        return this.f18937b[i];
    }

    /* renamed from: l */
    public void m22190l(int i, Object obj) {
        int iM29727a = h14.m29727a(this.f18937b, this.f18939d, i);
        if (iM29727a >= 0) {
            this.f18938c[iM29727a] = obj;
            return;
        }
        int i2 = ~iM29727a;
        if (i2 < this.f18939d && this.f18938c[i2] == e0g.f20717a) {
            this.f18937b[i2] = i;
            this.f18938c[i2] = obj;
            return;
        }
        if (this.f18936a && this.f18939d >= this.f18937b.length) {
            e0g.m24058d(this);
            i2 = ~h14.m29727a(this.f18937b, this.f18939d, i);
        }
        int i3 = this.f18939d;
        if (i3 >= this.f18937b.length) {
            int iM29731e = h14.m29731e(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f18937b, iM29731e);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f18937b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f18938c, iM29731e);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f18938c = objArrCopyOf;
        }
        int i4 = this.f18939d;
        if (i4 - i2 != 0) {
            int[] iArr = this.f18937b;
            int i5 = i2 + 1;
            fp0.m27258g(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.f18938c;
            fp0.m27260i(objArr, objArr, i5, i2, this.f18939d);
        }
        this.f18937b[i2] = i;
        this.f18938c[i2] = obj;
        this.f18939d++;
    }

    /* renamed from: m */
    public void m22191m(int i) {
        if (this.f18938c[i] != e0g.f20717a) {
            this.f18938c[i] = e0g.f20717a;
            this.f18936a = true;
        }
    }

    /* renamed from: n */
    public Object m22192n(int i, Object obj) {
        int iM22186h = m22186h(i);
        if (iM22186h < 0) {
            return null;
        }
        Object[] objArr = this.f18938c;
        Object obj2 = objArr[iM22186h];
        objArr[iM22186h] = obj;
        return obj2;
    }

    /* renamed from: p */
    public int m22193p() {
        if (this.f18936a) {
            e0g.m24058d(this);
        }
        return this.f18939d;
    }

    /* renamed from: q */
    public Object m22194q(int i) {
        if (this.f18936a) {
            e0g.m24058d(this);
        }
        return this.f18938c[i];
    }

    public String toString() {
        if (m22193p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f18939d * 28);
        sb.append('{');
        int i = this.f18939d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m22189k(i2));
            sb.append('=');
            Object objM22194q = m22194q(i2);
            if (objM22194q != this) {
                sb.append(objM22194q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "buffer.toString()");
        return string;
    }

    public d0g(int i) {
        if (i == 0) {
            this.f18937b = h14.f26079a;
            this.f18938c = h14.f26081c;
        } else {
            int iM29731e = h14.m29731e(i);
            this.f18937b = new int[iM29731e];
            this.f18938c = new Object[iM29731e];
        }
    }

    public /* synthetic */ d0g(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
