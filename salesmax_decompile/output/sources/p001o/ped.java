package p001o;

/* loaded from: classes6.dex */
public abstract class ped {
    /* renamed from: a */
    public static void m43532a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* renamed from: b */
    public static byte[] m43533b(String str) {
        try {
            return str.getBytes(s8g.f44982b);
        } catch (Exception unused) {
            return str.getBytes();
        }
    }
}
