package p001o;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class a0g {

    /* renamed from: c */
    public final fu3 f14012c;

    /* renamed from: b */
    public final SparseArray f14011b = new SparseArray();

    /* renamed from: a */
    public int f14010a = -1;

    public a0g(fu3 fu3Var) {
        this.f14012c = fu3Var;
    }

    /* renamed from: a */
    public void m16314a(int i, Object obj) {
        if (this.f14010a == -1) {
            op0.m42517g(this.f14011b.size() == 0);
            this.f14010a = 0;
        }
        if (this.f14011b.size() > 0) {
            SparseArray sparseArray = this.f14011b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            op0.m42511a(i >= iKeyAt);
            if (iKeyAt == i) {
                fu3 fu3Var = this.f14012c;
                SparseArray sparseArray2 = this.f14011b;
                fu3Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f14011b.append(i, obj);
    }

    /* renamed from: b */
    public void m16315b() {
        for (int i = 0; i < this.f14011b.size(); i++) {
            this.f14012c.accept(this.f14011b.valueAt(i));
        }
        this.f14010a = -1;
        this.f14011b.clear();
    }

    /* renamed from: c */
    public void m16316c(int i) {
        for (int size = this.f14011b.size() - 1; size >= 0 && i < this.f14011b.keyAt(size); size--) {
            this.f14012c.accept(this.f14011b.valueAt(size));
            this.f14011b.removeAt(size);
        }
        this.f14010a = this.f14011b.size() > 0 ? Math.min(this.f14010a, this.f14011b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void m16317d(int i) {
        int i2 = 0;
        while (i2 < this.f14011b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f14011b.keyAt(i3)) {
                return;
            }
            this.f14012c.accept(this.f14011b.valueAt(i2));
            this.f14011b.removeAt(i2);
            int i4 = this.f14010a;
            if (i4 > 0) {
                this.f14010a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* renamed from: e */
    public Object m16318e(int i) {
        if (this.f14010a == -1) {
            this.f14010a = 0;
        }
        while (true) {
            int i2 = this.f14010a;
            if (i2 <= 0 || i >= this.f14011b.keyAt(i2)) {
                break;
            }
            this.f14010a--;
        }
        while (this.f14010a < this.f14011b.size() - 1 && i >= this.f14011b.keyAt(this.f14010a + 1)) {
            this.f14010a++;
        }
        return this.f14011b.valueAt(this.f14010a);
    }

    /* renamed from: f */
    public Object m16319f() {
        return this.f14011b.valueAt(r0.size() - 1);
    }

    /* renamed from: g */
    public boolean m16320g() {
        return this.f14011b.size() == 0;
    }
}
