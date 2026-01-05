package p001o;

/* loaded from: classes2.dex */
public class jve {

    /* renamed from: a */
    public int f31148a = 0;

    /* renamed from: b */
    public int f31149b = 0;

    /* renamed from: c */
    public int f31150c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f31151d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f31152e = 0;

    /* renamed from: f */
    public int f31153f = 0;

    /* renamed from: g */
    public boolean f31154g = false;

    /* renamed from: h */
    public boolean f31155h = false;

    /* renamed from: a */
    public int m34578a() {
        return this.f31154g ? this.f31148a : this.f31149b;
    }

    /* renamed from: b */
    public int m34579b() {
        return this.f31148a;
    }

    /* renamed from: c */
    public int m34580c() {
        return this.f31149b;
    }

    /* renamed from: d */
    public int m34581d() {
        return this.f31154g ? this.f31149b : this.f31148a;
    }

    /* renamed from: e */
    public void m34582e(int i, int i2) {
        this.f31155h = false;
        if (i != Integer.MIN_VALUE) {
            this.f31152e = i;
            this.f31148a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f31153f = i2;
            this.f31149b = i2;
        }
    }

    /* renamed from: f */
    public void m34583f(boolean z) {
        if (z == this.f31154g) {
            return;
        }
        this.f31154g = z;
        if (!this.f31155h) {
            this.f31148a = this.f31152e;
            this.f31149b = this.f31153f;
            return;
        }
        if (z) {
            int i = this.f31151d;
            if (i == Integer.MIN_VALUE) {
                i = this.f31152e;
            }
            this.f31148a = i;
            int i2 = this.f31150c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f31153f;
            }
            this.f31149b = i2;
            return;
        }
        int i3 = this.f31150c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f31152e;
        }
        this.f31148a = i3;
        int i4 = this.f31151d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f31153f;
        }
        this.f31149b = i4;
    }

    /* renamed from: g */
    public void m34584g(int i, int i2) {
        this.f31150c = i;
        this.f31151d = i2;
        this.f31155h = true;
        if (this.f31154g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f31148a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f31149b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f31148a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f31149b = i2;
        }
    }
}
