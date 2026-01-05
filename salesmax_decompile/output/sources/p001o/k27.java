package p001o;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class k27 {

    /* renamed from: a */
    public final SparseBooleanArray f31390a;

    /* renamed from: o.k27$b */
    public static final class C14706b {

        /* renamed from: a */
        public final SparseBooleanArray f31391a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f31392b;

        /* renamed from: a */
        public C14706b m34926a(int i) {
            op0.m42517g(!this.f31392b);
            this.f31391a.append(i, true);
            return this;
        }

        /* renamed from: b */
        public C14706b m34927b(k27 k27Var) {
            for (int i = 0; i < k27Var.m34925d(); i++) {
                m34926a(k27Var.m34924c(i));
            }
            return this;
        }

        /* renamed from: c */
        public C14706b m34928c(int... iArr) {
            for (int i : iArr) {
                m34926a(i);
            }
            return this;
        }

        /* renamed from: d */
        public C14706b m34929d(int i, boolean z) {
            return z ? m34926a(i) : this;
        }

        /* renamed from: e */
        public k27 m34930e() {
            op0.m42517g(!this.f31392b);
            this.f31392b = true;
            return new k27(this.f31391a);
        }
    }

    /* renamed from: a */
    public boolean m34922a(int i) {
        return this.f31390a.get(i);
    }

    /* renamed from: b */
    public boolean m34923b(int... iArr) {
        for (int i : iArr) {
            if (m34922a(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int m34924c(int i) {
        op0.m42513c(i, 0, m34925d());
        return this.f31390a.keyAt(i);
    }

    /* renamed from: d */
    public int m34925d() {
        return this.f31390a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k27)) {
            return false;
        }
        k27 k27Var = (k27) obj;
        if (sqi.f45790a >= 24) {
            return this.f31390a.equals(k27Var.f31390a);
        }
        if (m34925d() != k27Var.m34925d()) {
            return false;
        }
        for (int i = 0; i < m34925d(); i++) {
            if (m34924c(i) != k27Var.m34924c(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (sqi.f45790a >= 24) {
            return this.f31390a.hashCode();
        }
        int iM34925d = m34925d();
        for (int i = 0; i < m34925d(); i++) {
            iM34925d = (iM34925d * 31) + m34924c(i);
        }
        return iM34925d;
    }

    public k27(SparseBooleanArray sparseBooleanArray) {
        this.f31390a = sparseBooleanArray;
    }
}
