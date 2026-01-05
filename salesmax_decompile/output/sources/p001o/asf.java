package p001o;

/* loaded from: classes3.dex */
public abstract class asf {
    /* renamed from: b */
    public static final String m17767b(gk8 gk8Var) {
        byte[] bArr = new byte[15];
        byte[] bArrM24603u = e9g.m24603u(":date");
        bArr[0] = (byte) bArrM24603u.length;
        fp0.m27261j(bArrM24603u, bArr, 1, 0, 0, 12, null);
        int length = 1 + bArrM24603u.length;
        bArr[length] = 8;
        m17768c(bArr, length + 1, jk8.m33904b(gk8Var));
        return gy7.m29642b(qkf.m45587a(bArr));
    }

    /* renamed from: c */
    public static final void m17768c(byte[] bArr, int i, long j) {
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) ((j >>> (i2 * 8)) & 255);
            i2--;
            i++;
        }
    }
}
