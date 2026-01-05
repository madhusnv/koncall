package p001o;

/* loaded from: classes2.dex */
public abstract class tza {
    /* renamed from: a */
    public static final boolean m50807a(float[] fArr) {
        sq8.m48649h(fArr, "$this$isIdentity");
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (!(fArr[(i * 4) + i2] == (i == i2 ? 1.0f : 0.0f))) {
                    return false;
                }
                i2++;
            }
            i++;
        }
        return true;
    }
}
