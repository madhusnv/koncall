package p001o;

/* loaded from: classes3.dex */
public class fk4 extends o74 {

    /* renamed from: a */
    public float f23549a = -1.0f;

    @Override // p001o.o74
    /* renamed from: a */
    public void mo26957a(klf klfVar, float f, float f2, float f3) {
        float f4 = f3 * f2;
        klfVar.m35855o(0.0f, f4, 180.0f, 180.0f - f);
        double d = f4;
        klfVar.m35853m((float) (Math.sin(Math.toRadians(f)) * d), (float) (Math.sin(Math.toRadians(90.0f - f)) * d));
    }
}
