package p001o;

/* loaded from: classes2.dex */
public class e6g extends pmb {

    /* renamed from: a */
    public f6g f21065a;

    /* renamed from: b */
    public a1g f21066b;

    /* renamed from: c */
    public d6g f21067c;

    public e6g() {
        f6g f6gVar = new f6g();
        this.f21065a = f6gVar;
        this.f21067c = f6gVar;
    }

    @Override // p001o.pmb
    /* renamed from: a */
    public float mo5375a() {
        return this.f21067c.mo16328a();
    }

    /* renamed from: b */
    public void m24417b(float f, float f2, float f3, float f4, float f5, float f6) {
        f6g f6gVar = this.f21065a;
        this.f21067c = f6gVar;
        f6gVar.m26212d(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public boolean m24418c() {
        return this.f21067c.mo16329b();
    }

    /* renamed from: d */
    public void m24419d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f21066b == null) {
            this.f21066b = new a1g();
        }
        a1g a1gVar = this.f21066b;
        this.f21067c = a1gVar;
        a1gVar.m16331d(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.f21067c.getInterpolation(f);
    }
}
