package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.rl1;

/* loaded from: classes6.dex */
public final class e6j {

    /* renamed from: a */
    public static final e6j f21070a = new e6j();

    /* renamed from: a */
    public final String m24421a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if (!(1004 <= i && i < 1007)) {
            if (!(1015 <= i && i < 3000)) {
                return null;
            }
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* renamed from: b */
    public final void m24422b(rl1.C16621b c16621b, byte[] bArr) {
        sq8.m48649h(c16621b, "cursor");
        sq8.m48649h(bArr, TransferTable.COLUMN_KEY);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c16621b.f43764e;
            int i2 = c16621b.f43765f;
            int i3 = c16621b.f43766g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (c16621b.m46922c() != -1);
    }

    /* renamed from: c */
    public final void m24423c(int i) {
        String strM24421a = m24421a(i);
        if (strM24421a == null) {
            return;
        }
        sq8.m48646e(strM24421a);
        throw new IllegalArgumentException(strM24421a.toString());
    }
}
