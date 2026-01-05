package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f32 implements Cloneable {

    /* renamed from: a */
    public List f22607a = new ArrayList();

    /* renamed from: b */
    public long f22608b = 0;

    /* renamed from: c */
    public long[] f22609c;

    /* renamed from: d */
    public int f22610d;

    /* renamed from: e */
    public final AbstractC13318a f22611e;

    /* renamed from: o.f32$a */
    public static abstract class AbstractC13318a {
        /* renamed from: a */
        public abstract void mo25697a(Object obj, Object obj2, int i, Object obj3);
    }

    public f32(AbstractC13318a abstractC13318a) {
        this.f22611e = abstractC13318a;
    }

    /* renamed from: a */
    public synchronized void m26013a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int iLastIndexOf = this.f22607a.lastIndexOf(obj);
        if (iLastIndexOf < 0 || m26015c(iLastIndexOf)) {
            this.f22607a.add(obj);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized f32 clone() {
        f32 f32Var;
        CloneNotSupportedException e;
        try {
            f32Var = (f32) super.clone();
            try {
                f32Var.f22608b = 0L;
                f32Var.f22609c = null;
                f32Var.f22610d = 0;
                f32Var.f22607a = new ArrayList();
                int size = this.f22607a.size();
                for (int i = 0; i < size; i++) {
                    if (!m26015c(i)) {
                        f32Var.f22607a.add(this.f22607a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return f32Var;
            }
        } catch (CloneNotSupportedException e3) {
            f32Var = null;
            e = e3;
        }
        return f32Var;
    }

    /* renamed from: c */
    public final boolean m26015c(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f22608b) != 0;
        }
        long[] jArr = this.f22609c;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized void m26016f(Object obj, int i, Object obj2) {
        this.f22610d++;
        m26019i(obj, i, obj2);
        int i2 = this.f22610d - 1;
        this.f22610d = i2;
        if (i2 == 0) {
            long[] jArr = this.f22609c;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.f22609c[length];
                    if (j != 0) {
                        m26022l((length + 1) * 64, j);
                        this.f22609c[length] = 0;
                    }
                }
            }
            long j2 = this.f22608b;
            if (j2 != 0) {
                m26022l(0, j2);
                this.f22608b = 0L;
            }
        }
    }

    /* renamed from: g */
    public final void m26017g(Object obj, int i, Object obj2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f22611e.mo25697a(this.f22607a.get(i2), obj, i, obj2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: h */
    public final void m26018h(Object obj, int i, Object obj2) {
        m26017g(obj, i, obj2, 0, Math.min(64, this.f22607a.size()), this.f22608b);
    }

    /* renamed from: i */
    public final void m26019i(Object obj, int i, Object obj2) {
        int size = this.f22607a.size();
        int length = this.f22609c == null ? -1 : r0.length - 1;
        m26020j(obj, i, obj2, length);
        m26017g(obj, i, obj2, (length + 2) * 64, size, 0L);
    }

    /* renamed from: j */
    public final void m26020j(Object obj, int i, Object obj2, int i2) {
        if (i2 < 0) {
            m26018h(obj, i, obj2);
            return;
        }
        long j = this.f22609c[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.f22607a.size(), i3 + 64);
        m26020j(obj, i, obj2, i2 - 1);
        m26017g(obj, i, obj2, i3, iMin, j);
    }

    /* renamed from: k */
    public synchronized void m26021k(Object obj) {
        if (this.f22610d == 0) {
            this.f22607a.remove(obj);
        } else {
            int iLastIndexOf = this.f22607a.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                m26023m(iLastIndexOf);
            }
        }
    }

    /* renamed from: l */
    public final void m26022l(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f22607a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: m */
    public final void m26023m(int i) {
        if (i < 64) {
            this.f22608b = (1 << i) | this.f22608b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f22609c;
        if (jArr == null) {
            this.f22609c = new long[this.f22607a.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f22607a.size() / 64];
            long[] jArr3 = this.f22609c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f22609c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f22609c;
        jArr4[i2] = j | jArr4[i2];
    }
}
