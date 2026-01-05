package p001o;

/* loaded from: classes3.dex */
public class x0b {

    /* renamed from: a */
    public float f53014a;

    /* renamed from: b */
    public int f53015b;

    /* renamed from: a */
    public void m55524a(float f) {
        float f2 = this.f53014a + f;
        this.f53014a = f2;
        int i = this.f53015b + 1;
        this.f53015b = i;
        if (i == Integer.MAX_VALUE) {
            this.f53014a = f2 / 2.0f;
            this.f53015b = i / 2;
        }
    }
}
