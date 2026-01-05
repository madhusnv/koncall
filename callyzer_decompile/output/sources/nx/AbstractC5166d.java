package nx;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import og.oe;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5166d {

    /* renamed from: a */
    public static final int[] f25260a;

    /* renamed from: b */
    public static final long[] f25261b;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f25260a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f25261b = jArr;
    }

    /* renamed from: a */
    public static final void m10076a(int i10, int i11, String str) {
        int i12 = i11 - i10;
        if (i12 < 1) {
            String strSubstring = str.substring(i10, i11);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            StringBuilder sbM14337q = a1.m14337q(i10, "Expected at least 1 hexadecimal digits at index ", ", but was \"", strSubstring, "\" of length ");
            sbM14337q.append(i12);
            throw new NumberFormatException(sbM14337q.toString());
        }
        if (i12 > 16) {
            int i13 = (i12 + i10) - 16;
            while (i10 < i13) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM4567n.append(str.charAt(i10));
                    sbM4567n.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM4567n.toString());
                }
                i10++;
            }
        }
    }

    /* renamed from: b */
    public static long m10077b(int i10, int i11, String str) {
        C5169g format = C5169g.f25265d;
        AbstractC4154l.m8923f(format, "format");
        oe.m10799a(i10, i11, str.length());
        if (format.f25268c.f25264a) {
            m10076a(i10, i11, str);
            return m10078c(i10, i11, str);
        }
        if (i11 - i10 > 0) {
            m10076a(i10, i11, str);
            return m10078c(i10, i11, str);
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    /* renamed from: c */
    public static final long m10078c(int i10, int i11, String str) {
        long j6 = 0;
        while (i10 < i11) {
            long j10 = j6 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = f25261b[cCharAt];
                if (j11 >= 0) {
                    j6 = j10 | j11;
                    i10++;
                }
            }
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Expected a hexadecimal digit at index ", ", but was ");
            sbM4567n.append(str.charAt(i10));
            throw new NumberFormatException(sbM4567n.toString());
        }
        return j6;
    }
}
