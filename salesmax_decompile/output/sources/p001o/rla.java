package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class rla implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f43775a;

    /* renamed from: b */
    public /* synthetic */ long[] f43776b;

    /* renamed from: c */
    public /* synthetic */ Object[] f43777c;

    /* renamed from: d */
    public /* synthetic */ int f43778d;

    public rla() {
        this(0, 1, null);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rla clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        sq8.m48647f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        rla rlaVar = (rla) objClone;
        rlaVar.f43776b = (long[]) this.f43776b.clone();
        rlaVar.f43777c = (Object[]) this.f43777c.clone();
        return rlaVar;
    }

    /* renamed from: b */
    public boolean m46931b(long j) {
        return m46933f(j) >= 0;
    }

    /* renamed from: c */
    public Object m46932c(long j) {
        int iM29728b = h14.m29728b(this.f43776b, this.f43778d, j);
        if (iM29728b < 0 || this.f43777c[iM29728b] == sla.f45580a) {
            return null;
        }
        return this.f43777c[iM29728b];
    }

    public void clear() {
        int i = this.f43778d;
        Object[] objArr = this.f43777c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f43778d = 0;
        this.f43775a = false;
    }

    /* renamed from: f */
    public int m46933f(long j) {
        if (this.f43775a) {
            int i = this.f43778d;
            long[] jArr = this.f43776b;
            Object[] objArr = this.f43777c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != sla.f45580a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f43775a = false;
            this.f43778d = i2;
        }
        return h14.m29728b(this.f43776b, this.f43778d, j);
    }

    /* renamed from: g */
    public boolean m46934g() {
        return m46940m() == 0;
    }

    /* renamed from: h */
    public long m46935h(int i) {
        if (!(i >= 0 && i < this.f43778d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.f43775a) {
            int i2 = this.f43778d;
            long[] jArr = this.f43776b;
            Object[] objArr = this.f43777c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != sla.f45580a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f43775a = false;
            this.f43778d = i3;
        }
        return this.f43776b[i];
    }

    /* renamed from: i */
    public void m46936i(long j, Object obj) {
        int iM29728b = h14.m29728b(this.f43776b, this.f43778d, j);
        if (iM29728b >= 0) {
            this.f43777c[iM29728b] = obj;
            return;
        }
        int i = ~iM29728b;
        if (i < this.f43778d && this.f43777c[i] == sla.f45580a) {
            this.f43776b[i] = j;
            this.f43777c[i] = obj;
            return;
        }
        if (this.f43775a) {
            int i2 = this.f43778d;
            long[] jArr = this.f43776b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.f43777c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr[i4];
                    if (obj2 != sla.f45580a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj2;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f43775a = false;
                this.f43778d = i3;
                i = ~h14.m29728b(this.f43776b, i3, j);
            }
        }
        int i5 = this.f43778d;
        if (i5 >= this.f43776b.length) {
            int iM29732f = h14.m29732f(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f43776b, iM29732f);
            sq8.m48648g(jArrCopyOf, "copyOf(this, newSize)");
            this.f43776b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f43777c, iM29732f);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f43777c = objArrCopyOf;
        }
        int i6 = this.f43778d;
        if (i6 - i != 0) {
            long[] jArr2 = this.f43776b;
            int i7 = i + 1;
            fp0.m27259h(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.f43777c;
            fp0.m27260i(objArr2, objArr2, i7, i, this.f43778d);
        }
        this.f43776b[i] = j;
        this.f43777c[i] = obj;
        this.f43778d++;
    }

    /* renamed from: j */
    public void m46937j(rla rlaVar) {
        sq8.m48649h(rlaVar, "other");
        int iM46940m = rlaVar.m46940m();
        for (int i = 0; i < iM46940m; i++) {
            m46936i(rlaVar.m46935h(i), rlaVar.m46941n(i));
        }
    }

    /* renamed from: k */
    public void m46938k(long j) {
        int iM29728b = h14.m29728b(this.f43776b, this.f43778d, j);
        if (iM29728b < 0 || this.f43777c[iM29728b] == sla.f45580a) {
            return;
        }
        this.f43777c[iM29728b] = sla.f45580a;
        this.f43775a = true;
    }

    /* renamed from: l */
    public void m46939l(int i) {
        if (this.f43777c[i] != sla.f45580a) {
            this.f43777c[i] = sla.f45580a;
            this.f43775a = true;
        }
    }

    /* renamed from: m */
    public int m46940m() {
        if (this.f43775a) {
            int i = this.f43778d;
            long[] jArr = this.f43776b;
            Object[] objArr = this.f43777c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != sla.f45580a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f43775a = false;
            this.f43778d = i2;
        }
        return this.f43778d;
    }

    /* renamed from: n */
    public Object m46941n(int i) {
        if (!(i >= 0 && i < this.f43778d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.f43775a) {
            int i2 = this.f43778d;
            long[] jArr = this.f43776b;
            Object[] objArr = this.f43777c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != sla.f45580a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f43775a = false;
            this.f43778d = i3;
        }
        return this.f43777c[i];
    }

    public String toString() {
        if (m46940m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f43778d * 28);
        sb.append('{');
        int i = this.f43778d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m46935h(i2));
            sb.append('=');
            Object objM46941n = m46941n(i2);
            if (objM46941n != sb) {
                sb.append(objM46941n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public rla(int i) {
        if (i == 0) {
            this.f43776b = h14.f26080b;
            this.f43777c = h14.f26081c;
        } else {
            int iM29732f = h14.m29732f(i);
            this.f43776b = new long[iM29732f];
            this.f43777c = new Object[iM29732f];
        }
    }

    public /* synthetic */ rla(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
