package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.t16;

/* loaded from: classes2.dex */
public final class z0g {

    /* renamed from: a */
    public double f56375a;

    /* renamed from: b */
    public double f56376b;

    /* renamed from: c */
    public boolean f56377c;

    /* renamed from: d */
    public double f56378d;

    /* renamed from: e */
    public double f56379e;

    /* renamed from: f */
    public double f56380f;

    /* renamed from: g */
    public double f56381g;

    /* renamed from: h */
    public double f56382h;

    /* renamed from: i */
    public double f56383i;

    /* renamed from: j */
    public final t16.C16974p f56384j;

    public z0g() {
        this.f56375a = Math.sqrt(1500.0d);
        this.f56376b = 0.5d;
        this.f56377c = false;
        this.f56383i = Double.MAX_VALUE;
        this.f56384j = new t16.C16974p();
    }

    /* renamed from: a */
    public float m58625a() {
        return (float) this.f56376b;
    }

    /* renamed from: b */
    public float m58626b() {
        return (float) this.f56383i;
    }

    /* renamed from: c */
    public float m58627c() {
        double d = this.f56375a;
        return (float) (d * d);
    }

    /* renamed from: d */
    public final void m58628d() {
        if (this.f56377c) {
            return;
        }
        if (this.f56383i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f56376b;
        if (d > 1.0d) {
            double d2 = this.f56375a;
            this.f56380f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f56376b;
            double d4 = this.f56375a;
            this.f56381g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d) {
            this.f56382h = this.f56375a * Math.sqrt(1.0d - (d * d));
        }
        this.f56377c = true;
    }

    /* renamed from: e */
    public boolean m58629e(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f56379e && ((double) Math.abs(f - m58626b())) < this.f56378d;
    }

    /* renamed from: f */
    public z0g m58630f(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f56376b = f;
        this.f56377c = false;
        return this;
    }

    /* renamed from: g */
    public z0g m58631g(float f) {
        this.f56383i = f;
        return this;
    }

    /* renamed from: h */
    public z0g m58632h(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f56375a = Math.sqrt(f);
        this.f56377c = false;
        return this;
    }

    /* renamed from: i */
    public void m58633i(double d) {
        double dAbs = Math.abs(d);
        this.f56378d = dAbs;
        this.f56379e = dAbs * 62.5d;
    }

    /* renamed from: j */
    public t16.C16974p m58634j(double d, double d2, long j) {
        double dCos;
        double dPow;
        m58628d();
        double d3 = j / 1000.0d;
        double d4 = d - this.f56383i;
        double d5 = this.f56376b;
        if (d5 > 1.0d) {
            double d6 = this.f56381g;
            double d7 = this.f56380f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f56380f * d3) * d9);
            double d10 = this.f56381g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f56380f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f56375a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f56375a) * d3);
            double d15 = this.f56375a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f56382h;
            double d17 = this.f56375a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f56382h * d3) * d4) + (Math.sin(this.f56382h * d3) * d18));
            double d19 = this.f56375a;
            double d20 = this.f56376b;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.f56382h;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.f56382h;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        t16.C16974p c16974p = this.f56384j;
        c16974p.f46229a = (float) (dPow + this.f56383i);
        c16974p.f46230b = (float) dCos;
        return c16974p;
    }

    public z0g(float f) {
        this.f56375a = Math.sqrt(1500.0d);
        this.f56376b = 0.5d;
        this.f56377c = false;
        this.f56383i = Double.MAX_VALUE;
        this.f56384j = new t16.C16974p();
        this.f56383i = f;
    }
}
