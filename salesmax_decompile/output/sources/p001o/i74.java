package p001o;

/* loaded from: classes6.dex */
public interface i74 {

    /* renamed from: o.i74$a */
    public static final class C14203a {
        /* renamed from: a */
        public static boolean m31629a(i74 i74Var, int i, int i2) {
            float f = i;
            if (f >= i74Var.mo31624c() && f <= i74Var.mo31624c() + i74Var.getWidth()) {
                float f2 = i2;
                if (f2 >= i74Var.mo31625d() && f2 <= i74Var.mo31625d() + i74Var.getHeight()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m31630b(i74 i74Var, float f, float f2, float f3, float f4) {
            i74Var.mo31623b(f);
            i74Var.mo31622a(f2);
            i74Var.mo31628g(f3);
            i74Var.mo31627f(f4);
        }
    }

    /* renamed from: a */
    void mo31622a(float f);

    /* renamed from: b */
    void mo31623b(float f);

    /* renamed from: c */
    float mo31624c();

    /* renamed from: d */
    float mo31625d();

    /* renamed from: e */
    boolean mo31626e(int i, int i2);

    /* renamed from: f */
    void mo31627f(float f);

    /* renamed from: g */
    void mo31628g(float f);

    float getHeight();

    float getWidth();
}
