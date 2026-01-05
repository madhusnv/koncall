package p001o;

/* loaded from: classes2.dex */
public abstract class vba {
    /* renamed from: a */
    public static int m52507a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i + " can not be recognized.");
    }
}
