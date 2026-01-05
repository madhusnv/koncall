package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class a1g implements d6g {

    /* renamed from: c */
    public double f14031c;

    /* renamed from: d */
    public double f14032d;

    /* renamed from: e */
    public double f14033e;

    /* renamed from: f */
    public float f14034f;

    /* renamed from: g */
    public float f14035g;

    /* renamed from: h */
    public float f14036h;

    /* renamed from: i */
    public float f14037i;

    /* renamed from: j */
    public float f14038j;

    /* renamed from: a */
    public double f14029a = 0.5d;

    /* renamed from: b */
    public boolean f14030b = false;

    /* renamed from: k */
    public int f14039k = 0;

    @Override // p001o.d6g
    /* renamed from: a */
    public float mo16328a() {
        return 0.0f;
    }

    @Override // p001o.d6g
    /* renamed from: b */
    public boolean mo16329b() {
        double d = this.f14035g - this.f14032d;
        double d2 = this.f14031c;
        double d3 = this.f14036h;
        return Math.sqrt((((d3 * d3) * ((double) this.f14037i)) + ((d2 * d) * d)) / d2) <= ((double) this.f14038j);
    }

    /* renamed from: c */
    public final void m16330c(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        double d2 = this.f14031c;
        double d3 = this.f14029a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.f14037i) * d) * 4.0d)) + 1.0d);
        double d4 = d / iSqrt;
        int i = 0;
        while (i < iSqrt) {
            float f = this.f14035g;
            double d5 = this.f14032d;
            float f2 = this.f14036h;
            double d6 = d2;
            double d7 = ((-d2) * (f - d5)) - (f2 * d3);
            float f3 = this.f14037i;
            double d8 = d3;
            double d9 = f2 + (((d7 / f3) * d4) / 2.0d);
            double d10 = ((((-((f + ((d4 * d9) / 2.0d)) - d5)) * d6) - (d9 * d8)) / f3) * d4;
            double d11 = f2 + (d10 / 2.0d);
            float f4 = f2 + ((float) d10);
            this.f14036h = f4;
            float f5 = f + ((float) (d11 * d4));
            this.f14035g = f5;
            int i2 = this.f14039k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f14035g = -f5;
                    this.f14036h = -f4;
                }
                float f6 = this.f14035g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f14035g = 2.0f - f6;
                    this.f14036h = -this.f14036h;
                }
            }
            i++;
            d2 = d6;
            d3 = d8;
        }
    }

    /* renamed from: d */
    public void m16331d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f14032d = f2;
        this.f14029a = f6;
        this.f14030b = false;
        this.f14035g = f;
        this.f14033e = f3;
        this.f14031c = f5;
        this.f14037i = f4;
        this.f14038j = f7;
        this.f14039k = i;
        this.f14034f = 0.0f;
    }

    @Override // p001o.d6g
    public float getInterpolation(float f) {
        m16330c(f - this.f14034f);
        this.f14034f = f;
        if (mo16329b()) {
            this.f14035g = (float) this.f14032d;
        }
        return this.f14035g;
    }
}
