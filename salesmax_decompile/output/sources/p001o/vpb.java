package p001o;

/* loaded from: classes2.dex */
public final class vpb {

    /* renamed from: a */
    public float f50700a;

    /* renamed from: b */
    public float f50701b;

    /* renamed from: c */
    public float f50702c;

    /* renamed from: d */
    public float f50703d;

    public vpb(float f, float f2, float f3, float f4) {
        this.f50700a = f;
        this.f50701b = f2;
        this.f50702c = f3;
        this.f50703d = f4;
    }

    /* renamed from: a */
    public final float m53180a() {
        return this.f50703d;
    }

    /* renamed from: b */
    public final float m53181b() {
        return this.f50700a;
    }

    /* renamed from: c */
    public final float m53182c() {
        return this.f50702c;
    }

    /* renamed from: d */
    public final float m53183d() {
        return this.f50701b;
    }

    /* renamed from: e */
    public final void m53184e(float f, float f2, float f3, float f4) {
        this.f50700a = Math.max(f, this.f50700a);
        this.f50701b = Math.max(f2, this.f50701b);
        this.f50702c = Math.min(f3, this.f50702c);
        this.f50703d = Math.min(f4, this.f50703d);
    }

    /* renamed from: f */
    public final boolean m53185f() {
        return this.f50700a >= this.f50702c || this.f50701b >= this.f50703d;
    }

    /* renamed from: g */
    public final void m53186g(float f, float f2, float f3, float f4) {
        this.f50700a = f;
        this.f50701b = f2;
        this.f50702c = f3;
        this.f50703d = f4;
    }

    /* renamed from: h */
    public final void m53187h(float f) {
        this.f50703d = f;
    }

    /* renamed from: i */
    public final void m53188i(float f) {
        this.f50700a = f;
    }

    /* renamed from: j */
    public final void m53189j(float f) {
        this.f50702c = f;
    }

    /* renamed from: k */
    public final void m53190k(float f) {
        this.f50701b = f;
    }

    public String toString() {
        return "MutableRect(" + mo7.m39455a(this.f50700a, 1) + ", " + mo7.m39455a(this.f50701b, 1) + ", " + mo7.m39455a(this.f50702c, 1) + ", " + mo7.m39455a(this.f50703d, 1) + ')';
    }
}
