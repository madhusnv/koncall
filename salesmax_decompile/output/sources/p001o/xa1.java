package p001o;

/* loaded from: classes6.dex */
public final class xa1 {

    /* renamed from: a */
    public final byte[] f53412a;

    /* renamed from: b */
    public int f53413b = 0;

    public xa1(int i) {
        this.f53412a = new byte[i];
    }

    /* renamed from: a */
    public void m55884a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f53413b;
            this.f53413b = i3 + 1;
            m55886c(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] m55885b(int i) {
        int length = this.f53412a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f53412a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public final void m55886c(int i, boolean z) {
        this.f53412a[i] = z ? (byte) 1 : (byte) 0;
    }
}
