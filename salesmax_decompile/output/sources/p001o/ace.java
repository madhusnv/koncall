package p001o;

/* loaded from: classes6.dex */
public abstract class ace {
    /* renamed from: a */
    public static final void m16884a(boolean z, Number number) {
        sq8.m48649h(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* renamed from: b */
    public static final wb3 m16885b(float f, float f2) {
        return new vb3(f, f2);
    }
}
