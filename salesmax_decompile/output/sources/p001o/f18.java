package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class f18 {

    /* renamed from: a */
    public static final f18 f22532a = new f18();

    /* renamed from: b */
    public static final zq1 f22533b = zq1.f57497d.m59707c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f22534c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f22535d = new String[64];

    /* renamed from: e */
    public static final String[] f22536e;

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            sq8.m48648g(binaryString, "toBinaryString(...)");
            strArr[i] = e9g.m24592F(jgj.m33815i("%8s", binaryString), TokenParser.SP, '0', false, 4, null);
        }
        f22536e = strArr;
        String[] strArr2 = f22535d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = strArr2[i2] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f22535d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = f22535d.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f22535d;
            if (strArr4[i7] == null) {
                strArr4[i7] = f22536e[i7];
            }
        }
    }

    /* renamed from: a */
    public final String m25934a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f22536e[i2];
            }
            if (i != 7 && i != 8) {
                String[] strArr = f22535d;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    sq8.m48646e(str);
                } else {
                    str = f22536e[i2];
                }
                String str2 = str;
                return (i != 5 || (i2 & 4) == 0) ? (i != 0 || (i2 & 32) == 0) ? str2 : e9g.m24593G(str2, "PRIORITY", "COMPRESSED", false, 4, null) : e9g.m24593G(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f22536e[i2];
    }

    /* renamed from: b */
    public final String m25935b(int i) {
        String[] strArr = f22534c;
        return i < strArr.length ? strArr[i] : jgj.m33815i("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String m25936c(boolean z, int i, int i2, int i3, int i4) {
        return jgj.m33815i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m25935b(i3), m25934a(i3, i4));
    }

    /* renamed from: d */
    public final String m25937d(boolean z, int i, int i2, long j) {
        return jgj.m33815i("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m25935b(8), Long.valueOf(j));
    }
}
