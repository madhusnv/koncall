package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C2407m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p001o.ged;
import p001o.ied;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes2.dex */
public final class C2395a implements C2407m.a {

    /* renamed from: a */
    public ged f9932a;

    /* renamed from: b */
    public final ArrayList f9933b;

    /* renamed from: c */
    public final ArrayList f9934c;

    /* renamed from: d */
    public final a f9935d;

    /* renamed from: e */
    public Runnable f9936e;

    /* renamed from: f */
    public final boolean f9937f;

    /* renamed from: g */
    public final C2407m f9938g;

    /* renamed from: h */
    public int f9939h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
        /* renamed from: a */
        void mo9174a(int i, int i2);

        /* renamed from: b */
        void mo9175b(b bVar);

        /* renamed from: c */
        void mo9176c(b bVar);

        /* renamed from: d */
        void mo9177d(int i, int i2);

        /* renamed from: e */
        void mo9178e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.d0 mo9179f(int i);

        /* renamed from: g */
        void mo9180g(int i, int i2);

        /* renamed from: h */
        void mo9181h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* renamed from: a */
        public int f9940a;

        /* renamed from: b */
        public int f9941b;

        /* renamed from: c */
        public Object f9942c;

        /* renamed from: d */
        public int f9943d;

        public b(int i, int i2, int i3, Object obj) {
            this.f9940a = i;
            this.f9941b = i2;
            this.f9943d = i3;
            this.f9942c = obj;
        }

        /* renamed from: a */
        public String m9425a() {
            int i = this.f9940a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f9940a;
            if (i != bVar.f9940a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f9943d - this.f9941b) == 1 && this.f9943d == bVar.f9941b && this.f9941b == bVar.f9943d) {
                return true;
            }
            if (this.f9943d != bVar.f9943d || this.f9941b != bVar.f9941b) {
                return false;
            }
            Object obj2 = this.f9942c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f9942c)) {
                    return false;
                }
            } else if (bVar.f9942c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f9940a * 31) + this.f9941b) * 31) + this.f9943d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m9425a() + ",s:" + this.f9941b + "c:" + this.f9943d + ",p:" + this.f9942c + "]";
        }
    }

    public C2395a(a aVar) {
        this(aVar, false);
    }

    @Override // androidx.recyclerview.widget.C2407m.a
    /* renamed from: a */
    public b mo9399a(int i, int i2, int i3, Object obj) {
        b bVar = (b) this.f9932a.mo28526b();
        if (bVar == null) {
            return new b(i, i2, i3, obj);
        }
        bVar.f9940a = i;
        bVar.f9941b = i2;
        bVar.f9943d = i3;
        bVar.f9942c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.C2407m.a
    /* renamed from: b */
    public void mo9400b(b bVar) {
        if (this.f9937f) {
            return;
        }
        bVar.f9942c = null;
        this.f9932a.mo28525a(bVar);
    }

    /* renamed from: c */
    public final void m9401c(b bVar) {
        m9420v(bVar);
    }

    /* renamed from: d */
    public final void m9402d(b bVar) {
        m9420v(bVar);
    }

    /* renamed from: e */
    public int m9403e(int i) {
        int size = this.f9933b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.f9933b.get(i2);
            int i3 = bVar.f9940a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f9941b;
                    if (i4 <= i) {
                        int i5 = bVar.f9943d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f9941b;
                    if (i6 == i) {
                        i = bVar.f9943d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f9943d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f9941b <= i) {
                i += bVar.f9943d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m9404f(b bVar) {
        boolean z;
        char c;
        int i = bVar.f9941b;
        int i2 = bVar.f9943d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f9935d.mo9179f(i3) != null || m9406h(i3)) {
                if (c2 == 0) {
                    m9409k(mo9399a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m9420v(mo9399a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f9943d) {
            mo9400b(bVar);
            bVar = mo9399a(2, i, i4, null);
        }
        if (c2 == 0) {
            m9409k(bVar);
        } else {
            m9420v(bVar);
        }
    }

    /* renamed from: g */
    public final void m9405g(b bVar) {
        int i = bVar.f9941b;
        int i2 = bVar.f9943d + i;
        int i3 = 0;
        boolean z = -1;
        int i4 = i;
        while (i < i2) {
            if (this.f9935d.mo9179f(i) != null || m9406h(i)) {
                if (!z) {
                    m9409k(mo9399a(4, i4, i3, bVar.f9942c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m9420v(mo9399a(4, i4, i3, bVar.f9942c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f9943d) {
            Object obj = bVar.f9942c;
            mo9400b(bVar);
            bVar = mo9399a(4, i4, i3, obj);
        }
        if (z) {
            m9420v(bVar);
        } else {
            m9409k(bVar);
        }
    }

    /* renamed from: h */
    public final boolean m9406h(int i) {
        int size = this.f9934c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.f9934c.get(i2);
            int i3 = bVar.f9940a;
            if (i3 == 8) {
                if (m9412n(bVar.f9943d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f9941b;
                int i5 = bVar.f9943d + i4;
                while (i4 < i5) {
                    if (m9412n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m9407i() {
        int size = this.f9934c.size();
        for (int i = 0; i < size; i++) {
            this.f9935d.mo9176c((b) this.f9934c.get(i));
        }
        m9422x(this.f9934c);
        this.f9939h = 0;
    }

    /* renamed from: j */
    public void m9408j() {
        m9407i();
        int size = this.f9933b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.f9933b.get(i);
            int i2 = bVar.f9940a;
            if (i2 == 1) {
                this.f9935d.mo9176c(bVar);
                this.f9935d.mo9180g(bVar.f9941b, bVar.f9943d);
            } else if (i2 == 2) {
                this.f9935d.mo9176c(bVar);
                this.f9935d.mo9181h(bVar.f9941b, bVar.f9943d);
            } else if (i2 == 4) {
                this.f9935d.mo9176c(bVar);
                this.f9935d.mo9178e(bVar.f9941b, bVar.f9943d, bVar.f9942c);
            } else if (i2 == 8) {
                this.f9935d.mo9176c(bVar);
                this.f9935d.mo9174a(bVar.f9941b, bVar.f9943d);
            }
            Runnable runnable = this.f9936e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m9422x(this.f9933b);
        this.f9939h = 0;
    }

    /* renamed from: k */
    public final void m9409k(b bVar) {
        int i;
        int i2 = bVar.f9940a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM9424z = m9424z(bVar.f9941b, i2);
        int i3 = bVar.f9941b;
        int i4 = bVar.f9940a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f9943d; i6++) {
            int iM9424z2 = m9424z(bVar.f9941b + (i * i6), bVar.f9940a);
            int i7 = bVar.f9940a;
            if (i7 == 2 ? iM9424z2 == iM9424z : i7 == 4 && iM9424z2 == iM9424z + 1) {
                i5++;
            } else {
                b bVarMo9399a = mo9399a(i7, iM9424z, i5, bVar.f9942c);
                m9410l(bVarMo9399a, i3);
                mo9400b(bVarMo9399a);
                if (bVar.f9940a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM9424z = iM9424z2;
            }
        }
        Object obj = bVar.f9942c;
        mo9400b(bVar);
        if (i5 > 0) {
            b bVarMo9399a2 = mo9399a(bVar.f9940a, iM9424z, i5, obj);
            m9410l(bVarMo9399a2, i3);
            mo9400b(bVarMo9399a2);
        }
    }

    /* renamed from: l */
    public void m9410l(b bVar, int i) {
        this.f9935d.mo9175b(bVar);
        int i2 = bVar.f9940a;
        if (i2 == 2) {
            this.f9935d.mo9181h(i, bVar.f9943d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f9935d.mo9178e(i, bVar.f9943d, bVar.f9942c);
        }
    }

    /* renamed from: m */
    public int m9411m(int i) {
        return m9412n(i, 0);
    }

    /* renamed from: n */
    public int m9412n(int i, int i2) {
        int size = this.f9934c.size();
        while (i2 < size) {
            b bVar = (b) this.f9934c.get(i2);
            int i3 = bVar.f9940a;
            if (i3 == 8) {
                int i4 = bVar.f9941b;
                if (i4 == i) {
                    i = bVar.f9943d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f9943d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f9941b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f9943d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f9943d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m9413o(int i) {
        return (i & this.f9939h) != 0;
    }

    /* renamed from: p */
    public boolean m9414p() {
        return this.f9933b.size() > 0;
    }

    /* renamed from: q */
    public boolean m9415q() {
        return (this.f9934c.isEmpty() || this.f9933b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public boolean m9416r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f9933b.add(mo9399a(4, i, i2, obj));
        this.f9939h |= 4;
        return this.f9933b.size() == 1;
    }

    /* renamed from: s */
    public boolean m9417s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f9933b.add(mo9399a(1, i, i2, null));
        this.f9939h |= 1;
        return this.f9933b.size() == 1;
    }

    /* renamed from: t */
    public boolean m9418t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f9933b.add(mo9399a(8, i, i2, null));
        this.f9939h |= 8;
        return this.f9933b.size() == 1;
    }

    /* renamed from: u */
    public boolean m9419u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f9933b.add(mo9399a(2, i, i2, null));
        this.f9939h |= 2;
        return this.f9933b.size() == 1;
    }

    /* renamed from: v */
    public final void m9420v(b bVar) {
        this.f9934c.add(bVar);
        int i = bVar.f9940a;
        if (i == 1) {
            this.f9935d.mo9180g(bVar.f9941b, bVar.f9943d);
            return;
        }
        if (i == 2) {
            this.f9935d.mo9177d(bVar.f9941b, bVar.f9943d);
            return;
        }
        if (i == 4) {
            this.f9935d.mo9178e(bVar.f9941b, bVar.f9943d, bVar.f9942c);
        } else {
            if (i == 8) {
                this.f9935d.mo9174a(bVar.f9941b, bVar.f9943d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: w */
    public void m9421w() {
        this.f9938g.m9619b(this.f9933b);
        int size = this.f9933b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.f9933b.get(i);
            int i2 = bVar.f9940a;
            if (i2 == 1) {
                m9401c(bVar);
            } else if (i2 == 2) {
                m9404f(bVar);
            } else if (i2 == 4) {
                m9405g(bVar);
            } else if (i2 == 8) {
                m9402d(bVar);
            }
            Runnable runnable = this.f9936e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f9933b.clear();
    }

    /* renamed from: x */
    public void m9422x(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo9400b((b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void m9423y() {
        m9422x(this.f9933b);
        m9422x(this.f9934c);
        this.f9939h = 0;
    }

    /* renamed from: z */
    public final int m9424z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f9934c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f9934c.get(size);
            int i5 = bVar.f9940a;
            if (i5 == 8) {
                int i6 = bVar.f9941b;
                int i7 = bVar.f9943d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f9941b = i6 + 1;
                            bVar.f9943d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f9941b = i6 - 1;
                            bVar.f9943d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f9943d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f9943d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f9941b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f9941b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f9941b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f9943d;
                    } else if (i5 == 2) {
                        i += bVar.f9943d;
                    }
                } else if (i2 == 1) {
                    bVar.f9941b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f9941b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f9934c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f9934c.get(size2);
            if (bVar2.f9940a == 8) {
                int i9 = bVar2.f9943d;
                if (i9 == bVar2.f9941b || i9 < 0) {
                    this.f9934c.remove(size2);
                    mo9400b(bVar2);
                }
            } else if (bVar2.f9943d <= 0) {
                this.f9934c.remove(size2);
                mo9400b(bVar2);
            }
        }
        return i;
    }

    public C2395a(a aVar, boolean z) {
        this.f9932a = new ied(30);
        this.f9933b = new ArrayList();
        this.f9934c = new ArrayList();
        this.f9939h = 0;
        this.f9935d = aVar;
        this.f9937f = z;
        this.f9938g = new C2407m(this);
    }
}
