package p001o;

/* loaded from: classes3.dex */
public class lu7 {

    /* renamed from: a */
    public final float[] f34374a;

    /* renamed from: b */
    public final int[] f34375b;

    public lu7(float[] fArr, int[] iArr) {
        this.f34374a = fArr;
        this.f34375b = iArr;
    }

    /* renamed from: a */
    public int[] m37893a() {
        return this.f34375b;
    }

    /* renamed from: b */
    public float[] m37894b() {
        return this.f34374a;
    }

    /* renamed from: c */
    public int m37895c() {
        return this.f34375b.length;
    }

    /* renamed from: d */
    public void m37896d(lu7 lu7Var, lu7 lu7Var2, float f) {
        if (lu7Var.f34375b.length == lu7Var2.f34375b.length) {
            for (int i = 0; i < lu7Var.f34375b.length; i++) {
                this.f34374a[i] = zeb.m59356k(lu7Var.f34374a[i], lu7Var2.f34374a[i], f);
                this.f34375b[i] = fn7.m27125c(f, lu7Var.f34375b[i], lu7Var2.f34375b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + lu7Var.f34375b.length + " vs " + lu7Var2.f34375b.length + ")");
    }
}
