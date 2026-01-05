package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public final class tif {

    /* renamed from: c */
    public static final C17128a f47218c = new C17128a(null);

    /* renamed from: a */
    public int f47219a;

    /* renamed from: b */
    public final int[] f47220b = new int[10];

    /* renamed from: o.tif$a */
    public static final class C17128a {
        public C17128a() {
        }

        public /* synthetic */ C17128a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public final int m49939a(int i) {
        return this.f47220b[i];
    }

    /* renamed from: b */
    public final int m49940b() {
        if ((this.f47219a & 2) != 0) {
            return this.f47220b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m49941c() {
        if ((this.f47219a & 128) != 0) {
            return this.f47220b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m49942d() {
        return (this.f47219a & 16) != 0 ? this.f47220b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: e */
    public final int m49943e(int i) {
        return (this.f47219a & 32) != 0 ? this.f47220b[5] : i;
    }

    /* renamed from: f */
    public final boolean m49944f(int i) {
        return ((1 << i) & this.f47219a) != 0;
    }

    /* renamed from: g */
    public final void m49945g(tif tifVar) {
        sq8.m48649h(tifVar, "other");
        for (int i = 0; i < 10; i++) {
            if (tifVar.m49944f(i)) {
                m49946h(i, tifVar.m49939a(i));
            }
        }
    }

    /* renamed from: h */
    public final tif m49946h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f47220b;
            if (i < iArr.length) {
                this.f47219a = (1 << i) | this.f47219a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m49947i() {
        return Integer.bitCount(this.f47219a);
    }
}
