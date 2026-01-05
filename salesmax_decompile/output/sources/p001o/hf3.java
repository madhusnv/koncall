package p001o;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hf3 {

    /* renamed from: a */
    public static final byte[] f26756a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f26757b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m30318a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public static List m30319b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m30320c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f26757b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(sqi.m48702G("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m30321d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f26756a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    public static int m30322e(byte[] bArr, int i) {
        int length = bArr.length - f26756a.length;
        while (i <= length) {
            if (m30323f(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m30323f(byte[] bArr, int i) {
        if (bArr.length - i <= f26756a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f26756a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public static Pair m30324g(byte[] bArr) {
        zwc zwcVar = new zwc(bArr);
        zwcVar.m60017U(9);
        int iM60004H = zwcVar.m60004H();
        zwcVar.m60017U(20);
        return Pair.create(Integer.valueOf(zwcVar.m60008L()), Integer.valueOf(iM60004H));
    }

    /* renamed from: h */
    public static boolean m30325h(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    /* renamed from: i */
    public static byte[][] m30326i(byte[] bArr) {
        if (!m30323f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM30322e = 0;
        do {
            arrayList.add(Integer.valueOf(iM30322e));
            iM30322e = m30322e(bArr, iM30322e + f26756a.length);
        } while (iM30322e != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }
}
