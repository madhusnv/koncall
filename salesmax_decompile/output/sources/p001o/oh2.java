package p001o;

/* loaded from: classes3.dex */
public abstract class oh2 {
    /* renamed from: a */
    public static char m42235a(long j) {
        char c = (char) j;
        dgd.m23056i(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    /* renamed from: b */
    public static boolean m42236b(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static char m42237c(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
