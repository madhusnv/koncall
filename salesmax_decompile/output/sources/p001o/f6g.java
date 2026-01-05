package p001o;

/* loaded from: classes2.dex */
public class f6g implements d6g {

    /* renamed from: a */
    public float f22802a;

    /* renamed from: b */
    public float f22803b;

    /* renamed from: c */
    public float f22804c;

    /* renamed from: d */
    public float f22805d;

    /* renamed from: e */
    public float f22806e;

    /* renamed from: f */
    public float f22807f;

    /* renamed from: g */
    public float f22808g;

    /* renamed from: h */
    public float f22809h;

    /* renamed from: i */
    public float f22810i;

    /* renamed from: j */
    public int f22811j;

    /* renamed from: k */
    public String f22812k;

    /* renamed from: m */
    public float f22814m;

    /* renamed from: n */
    public float f22815n;

    /* renamed from: o */
    public float f22816o;

    /* renamed from: l */
    public boolean f22813l = false;

    /* renamed from: p */
    public boolean f22817p = false;

    @Override // p001o.d6g
    /* renamed from: a */
    public float mo16328a() {
        return this.f22813l ? -m26213e(this.f22816o) : m26213e(this.f22816o);
    }

    @Override // p001o.d6g
    /* renamed from: b */
    public boolean mo16329b() {
        return mo16328a() < 1.0E-5f && Math.abs(this.f22810i - this.f22815n) < 1.0E-5f;
    }

    /* renamed from: c */
    public final float m26211c(float f) {
        this.f22817p = false;
        float f2 = this.f22805d;
        if (f <= f2) {
            float f3 = this.f22802a;
            return (f3 * f) + ((((this.f22803b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f22811j;
        if (i == 1) {
            return this.f22808g;
        }
        float f4 = f - f2;
        float f5 = this.f22806e;
        if (f4 < f5) {
            float f6 = this.f22808g;
            float f7 = this.f22803b;
            return f6 + (f7 * f4) + ((((this.f22804c - f7) * f4) * f4) / (f5 * 2.0f));
        }
        if (i == 2) {
            return this.f22809h;
        }
        float f8 = f4 - f5;
        float f9 = this.f22807f;
        if (f8 > f9) {
            this.f22817p = true;
            return this.f22810i;
        }
        float f10 = this.f22809h;
        float f11 = this.f22804c;
        return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
    }

    /* renamed from: d */
    public void m26212d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f22817p = false;
        this.f22814m = f;
        boolean z = f > f2;
        this.f22813l = z;
        if (z) {
            m26214f(-f3, f - f2, f5, f6, f4);
        } else {
            m26214f(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: e */
    public float m26213e(float f) {
        float f2 = this.f22805d;
        if (f <= f2) {
            float f3 = this.f22802a;
            return f3 + (((this.f22803b - f3) * f) / f2);
        }
        int i = this.f22811j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f22806e;
        if (f4 < f5) {
            float f6 = this.f22803b;
            return f6 + (((this.f22804c - f6) * f4) / f5);
        }
        if (i == 2) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.f22807f;
        if (f7 >= f8) {
            return 0.0f;
        }
        float f9 = this.f22804c;
        return f9 - ((f7 * f9) / f8);
    }

    /* renamed from: f */
    public final void m26214f(float f, float f2, float f3, float f4, float f5) {
        this.f22817p = false;
        this.f22810i = f2;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f22812k = "backward accelerate, decelerate";
                this.f22811j = 2;
                this.f22802a = f;
                this.f22803b = fSqrt;
                this.f22804c = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f22805d = f8;
                this.f22806e = fSqrt / f3;
                this.f22808g = ((f + fSqrt) * f8) / 2.0f;
                this.f22809h = f2;
                this.f22810i = f2;
                return;
            }
            this.f22812k = "backward accelerate cruse decelerate";
            this.f22811j = 3;
            this.f22802a = f;
            this.f22803b = f4;
            this.f22804c = f4;
            float f9 = (f4 - f) / f3;
            this.f22805d = f9;
            float f10 = f4 / f3;
            this.f22807f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f22806e = ((f2 - f11) - f12) / f4;
            this.f22808g = f11;
            this.f22809h = f2 - f12;
            this.f22810i = f2;
            return;
        }
        if (f7 >= f2) {
            this.f22812k = "hard stop";
            this.f22811j = 1;
            this.f22802a = f;
            this.f22803b = 0.0f;
            this.f22808g = f2;
            this.f22805d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f22812k = "cruse decelerate";
            this.f22811j = 2;
            this.f22802a = f;
            this.f22803b = f;
            this.f22804c = 0.0f;
            this.f22808g = f13;
            this.f22809h = f2;
            this.f22805d = f14;
            this.f22806e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (fSqrt2 - f) / f3;
        this.f22805d = f15;
        float f16 = fSqrt2 / f3;
        this.f22806e = f16;
        if (fSqrt2 < f4) {
            this.f22812k = "accelerate decelerate";
            this.f22811j = 2;
            this.f22802a = f;
            this.f22803b = fSqrt2;
            this.f22804c = 0.0f;
            this.f22805d = f15;
            this.f22806e = f16;
            this.f22808g = ((f + fSqrt2) * f15) / 2.0f;
            this.f22809h = f2;
            return;
        }
        this.f22812k = "accelerate cruse decelerate";
        this.f22811j = 3;
        this.f22802a = f;
        this.f22803b = f4;
        this.f22804c = f4;
        float f17 = (f4 - f) / f3;
        this.f22805d = f17;
        float f18 = f4 / f3;
        this.f22807f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f22806e = ((f2 - f19) - f20) / f4;
        this.f22808g = f19;
        this.f22809h = f2 - f20;
        this.f22810i = f2;
    }

    @Override // p001o.d6g
    public float getInterpolation(float f) {
        float fM26211c = m26211c(f);
        this.f22815n = fM26211c;
        this.f22816o = f;
        return this.f22813l ? this.f22814m - fM26211c : this.f22814m + fM26211c;
    }
}
