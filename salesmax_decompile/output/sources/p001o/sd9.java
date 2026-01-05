package p001o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public class sd9 {

    /* renamed from: a */
    public final ama f45242a;

    /* renamed from: b */
    public final Object f45243b;

    /* renamed from: c */
    public Object f45244c;

    /* renamed from: d */
    public final Interpolator f45245d;

    /* renamed from: e */
    public final Interpolator f45246e;

    /* renamed from: f */
    public final Interpolator f45247f;

    /* renamed from: g */
    public final float f45248g;

    /* renamed from: h */
    public Float f45249h;

    /* renamed from: i */
    public float f45250i;

    /* renamed from: j */
    public float f45251j;

    /* renamed from: k */
    public int f45252k;

    /* renamed from: l */
    public int f45253l;

    /* renamed from: m */
    public float f45254m;

    /* renamed from: n */
    public float f45255n;

    /* renamed from: o */
    public PointF f45256o;

    /* renamed from: p */
    public PointF f45257p;

    public sd9(ama amaVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f45250i = -3987645.8f;
        this.f45251j = -3987645.8f;
        this.f45252k = 784923401;
        this.f45253l = 784923401;
        this.f45254m = Float.MIN_VALUE;
        this.f45255n = Float.MIN_VALUE;
        this.f45256o = null;
        this.f45257p = null;
        this.f45242a = amaVar;
        this.f45243b = obj;
        this.f45244c = obj2;
        this.f45245d = interpolator;
        this.f45246e = null;
        this.f45247f = null;
        this.f45248g = f;
        this.f45249h = f2;
    }

    /* renamed from: a */
    public boolean m48220a(float f) {
        return f >= m48224e() && f < m48221b();
    }

    /* renamed from: b */
    public float m48221b() {
        if (this.f45242a == null) {
            return 1.0f;
        }
        if (this.f45255n == Float.MIN_VALUE) {
            if (this.f45249h == null) {
                this.f45255n = 1.0f;
            } else {
                this.f45255n = m48224e() + ((this.f45249h.floatValue() - this.f45248g) / this.f45242a.m17441e());
            }
        }
        return this.f45255n;
    }

    /* renamed from: c */
    public float m48222c() {
        if (this.f45251j == -3987645.8f) {
            this.f45251j = ((Float) this.f45244c).floatValue();
        }
        return this.f45251j;
    }

    /* renamed from: d */
    public int m48223d() {
        if (this.f45253l == 784923401) {
            this.f45253l = ((Integer) this.f45244c).intValue();
        }
        return this.f45253l;
    }

    /* renamed from: e */
    public float m48224e() {
        ama amaVar = this.f45242a;
        if (amaVar == null) {
            return 0.0f;
        }
        if (this.f45254m == Float.MIN_VALUE) {
            this.f45254m = (this.f45248g - amaVar.m17452p()) / this.f45242a.m17441e();
        }
        return this.f45254m;
    }

    /* renamed from: f */
    public float m48225f() {
        if (this.f45250i == -3987645.8f) {
            this.f45250i = ((Float) this.f45243b).floatValue();
        }
        return this.f45250i;
    }

    /* renamed from: g */
    public int m48226g() {
        if (this.f45252k == 784923401) {
            this.f45252k = ((Integer) this.f45243b).intValue();
        }
        return this.f45252k;
    }

    /* renamed from: h */
    public boolean m48227h() {
        return this.f45245d == null && this.f45246e == null && this.f45247f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f45243b + ", endValue=" + this.f45244c + ", startFrame=" + this.f45248g + ", endFrame=" + this.f45249h + ", interpolator=" + this.f45245d + '}';
    }

    public sd9(ama amaVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f45250i = -3987645.8f;
        this.f45251j = -3987645.8f;
        this.f45252k = 784923401;
        this.f45253l = 784923401;
        this.f45254m = Float.MIN_VALUE;
        this.f45255n = Float.MIN_VALUE;
        this.f45256o = null;
        this.f45257p = null;
        this.f45242a = amaVar;
        this.f45243b = obj;
        this.f45244c = obj2;
        this.f45245d = null;
        this.f45246e = interpolator;
        this.f45247f = interpolator2;
        this.f45248g = f;
        this.f45249h = f2;
    }

    public sd9(ama amaVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f45250i = -3987645.8f;
        this.f45251j = -3987645.8f;
        this.f45252k = 784923401;
        this.f45253l = 784923401;
        this.f45254m = Float.MIN_VALUE;
        this.f45255n = Float.MIN_VALUE;
        this.f45256o = null;
        this.f45257p = null;
        this.f45242a = amaVar;
        this.f45243b = obj;
        this.f45244c = obj2;
        this.f45245d = interpolator;
        this.f45246e = interpolator2;
        this.f45247f = interpolator3;
        this.f45248g = f;
        this.f45249h = f2;
    }

    public sd9(Object obj) {
        this.f45250i = -3987645.8f;
        this.f45251j = -3987645.8f;
        this.f45252k = 784923401;
        this.f45253l = 784923401;
        this.f45254m = Float.MIN_VALUE;
        this.f45255n = Float.MIN_VALUE;
        this.f45256o = null;
        this.f45257p = null;
        this.f45242a = null;
        this.f45243b = obj;
        this.f45244c = obj;
        this.f45245d = null;
        this.f45246e = null;
        this.f45247f = null;
        this.f45248g = Float.MIN_VALUE;
        this.f45249h = Float.valueOf(Float.MAX_VALUE);
    }
}
