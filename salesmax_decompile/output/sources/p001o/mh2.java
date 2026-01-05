package p001o;

import com.google.firebase.perf.util.Constants;
import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public abstract class mh2 {

    /* renamed from: a */
    public static final char[] f35456a;

    /* renamed from: b */
    public static final byte[] f35457b;

    /* renamed from: c */
    public static final int[] f35458c;

    /* renamed from: d */
    public static final int[] f35459d;

    /* renamed from: e */
    public static final int[] f35460e;

    /* renamed from: f */
    public static final int[] f35461f;

    /* renamed from: g */
    public static final int[] f35462g;

    /* renamed from: h */
    public static final int[] f35463h;

    /* renamed from: i */
    public static final int[] f35464i;

    /* renamed from: j */
    public static final int[] f35465j;

    /* renamed from: o.mh2$a */
    public static class C15322a {

        /* renamed from: b */
        public static final C15322a f35466b = new C15322a();

        /* renamed from: a */
        public int[][] f35467a = new int[128][];

        /* renamed from: a */
        public int[] m39056a(int i) {
            int[] iArrCopyOf = this.f35467a[i];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(mh2.f35464i, 128);
                if (iArrCopyOf[i] == 0) {
                    iArrCopyOf[i] = -1;
                }
                this.f35467a[i] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f35456a = charArray;
        int length = charArray.length;
        f35457b = new byte[length];
        for (int i = 0; i < length; i++) {
            f35457b[i] = (byte) f35456a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f35458c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        f35459d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f35460e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f35461f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f35459d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f35462g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f35463h = iArr7;
        int[] iArr8 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr8[i5] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f35464i = iArr8;
        int[] iArr9 = new int[256];
        f35465j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            f35465j[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr10 = f35465j;
            int i8 = i7 + 10;
            iArr10[i7 + 97] = i8;
            iArr10[i7 + 65] = i8;
        }
    }

    /* renamed from: b */
    public static void m39045b(StringBuilder sb, String str) {
        int[] iArr = f35464i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append(TokenParser.ESCAPE);
                int i2 = iArr[cCharAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = f35456a;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m39046c(int i) {
        return f35465j[i & Constants.MAX_HOST_LENGTH];
    }

    /* renamed from: d */
    public static byte[] m39047d() {
        return (byte[]) f35457b.clone();
    }

    /* renamed from: e */
    public static char[] m39048e() {
        return (char[]) f35456a.clone();
    }

    /* renamed from: f */
    public static int[] m39049f() {
        return f35464i;
    }

    /* renamed from: g */
    public static int[] m39050g(int i) {
        return i == 34 ? f35464i : C15322a.f35466b.m39056a(i);
    }

    /* renamed from: h */
    public static int[] m39051h() {
        return f35462g;
    }

    /* renamed from: i */
    public static int[] m39052i() {
        return f35458c;
    }

    /* renamed from: j */
    public static int[] m39053j() {
        return f35460e;
    }

    /* renamed from: k */
    public static int[] m39054k() {
        return f35459d;
    }

    /* renamed from: l */
    public static int[] m39055l() {
        return f35461f;
    }
}
