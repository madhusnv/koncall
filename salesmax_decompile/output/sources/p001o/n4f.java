package p001o;

/* loaded from: classes3.dex */
public class n4f {

    /* renamed from: a */
    public float f36369a;

    /* renamed from: b */
    public float f36370b;

    public n4f(float f, float f2) {
        this.f36369a = f;
        this.f36370b = f2;
    }

    /* renamed from: a */
    public boolean m40074a(float f, float f2) {
        return this.f36369a == f && this.f36370b == f2;
    }

    /* renamed from: b */
    public float m40075b() {
        return this.f36369a;
    }

    /* renamed from: c */
    public float m40076c() {
        return this.f36370b;
    }

    /* renamed from: d */
    public void m40077d(float f, float f2) {
        this.f36369a = f;
        this.f36370b = f2;
    }

    public String toString() {
        return m40075b() + "x" + m40076c();
    }

    public n4f() {
        this(1.0f, 1.0f);
    }
}
