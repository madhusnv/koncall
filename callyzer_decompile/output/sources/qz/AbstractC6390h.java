package qz;

import b00.C0529n;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nx.AbstractC5185w;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6390h {

    /* renamed from: a */
    public static final C0529n f30820a;

    /* renamed from: b */
    public static final String[] f30821b;

    /* renamed from: c */
    public static final String[] f30822c;

    /* renamed from: d */
    public static final String[] f30823d;

    static {
        C0529n c0529n = C0529n.f3647d;
        f30820a = C5950e.m11977h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f30821b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f30822c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC4154l.m8922e(binaryString, "toBinaryString(...)");
            strArr[i10] = AbstractC5185w.m10135q(AbstractC4299e.m9015d("%8s", binaryString), ' ', '0');
        }
        f30823d = strArr;
        String[] strArr2 = f30822c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = AbstractC1452a.m4564k(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f30822c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = AbstractC1452a.m4564k(sb2, strArr3[i13], "|PADDED");
        }
        int length = f30822c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f30822c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f30823d[i16];
            }
        }
    }

    /* renamed from: a */
    public static String m12383a(int i10) {
        String[] strArr = f30821b;
        return i10 < strArr.length ? strArr[i10] : AbstractC4299e.m9015d("0x%02x", Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m12384b(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r0 = m12383a(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L57
        L9:
            r1 = 2
            java.lang.String[] r2 = qz.AbstractC6390h.f30823d
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4c
            r1 = 6
            if (r7 == r1) goto L4c
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = qz.AbstractC6390h.f30822c
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r1)
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            if (r7 != r2) goto L3b
            r2 = r8 & 4
            if (r2 == 0) goto L3b
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = nx.AbstractC5185w.m10136r(r1, r7, r8)
            goto L57
        L3b:
            if (r7 != 0) goto L4a
            r7 = r8 & 32
            if (r7 == 0) goto L4a
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = nx.AbstractC5185w.m10136r(r1, r7, r8)
            goto L57
        L4a:
            r7 = r1
            goto L57
        L4c:
            r7 = 1
            if (r8 != r7) goto L52
            java.lang.String r7 = "ACK"
            goto L57
        L52:
            r7 = r2[r8]
            goto L57
        L55:
            r7 = r2[r8]
        L57:
            if (r4 == 0) goto L5c
            java.lang.String r4 = "<<"
            goto L5e
        L5c:
            java.lang.String r4 = ">>"
        L5e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = kz.AbstractC4299e.m9015d(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.AbstractC6390h.m12384b(boolean, int, int, int, int):java.lang.String");
    }

    /* renamed from: c */
    public static String m12385c(boolean z6, int i10, int i11, long j6) {
        return AbstractC4299e.m9015d("%s 0x%08x %5d %-13s %d", z6 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m12383a(8), Long.valueOf(j6));
    }
}
