package p001o;

import com.google.firebase.perf.util.Constants;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class gj6 {

    /* renamed from: a */
    public static final int[] f25320a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    public static final int[][] f25321b = {new int[]{228, 48, 15, Opcodes.DDIV, 62}, new int[]{23, 68, Opcodes.D2F, Opcodes.I2F, 240, 92, 254}, new int[]{28, 24, Opcodes.INVOKEINTERFACE, Opcodes.IF_ACMPNE, 223, 248, 116, Constants.MAX_HOST_LENGTH, 110, 61}, new int[]{Opcodes.DRETURN, Opcodes.L2D, HttpStatus.SC_RESET_CONTENT, 12, Opcodes.MONITORENTER, Opcodes.JSR, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, Opcodes.D2I, 213, 97, Opcodes.GETSTATIC, 100, 242}, new int[]{156, 97, Opcodes.CHECKCAST, 252, 95, 9, 157, Opcodes.DNEG, Opcodes.L2D, 45, 18, Opcodes.INVOKEDYNAMIC, 83, Opcodes.INVOKEINTERFACE}, new int[]{83, Opcodes.MONITOREXIT, 100, 39, Opcodes.NEWARRAY, 75, 66, 61, 241, 213, Opcodes.LDIV, Opcodes.LOR, 94, 254, 225, 48, 90, Opcodes.NEWARRAY}, new int[]{15, Opcodes.MONITOREXIT, 244, 9, 233, 71, Opcodes.JSR, 2, Opcodes.NEWARRAY, Opcodes.IF_ICMPNE, 153, Opcodes.I2B, 253, 79, 108, 82, 27, Opcodes.FRETURN, Opcodes.INVOKEDYNAMIC, Opcodes.IRETURN}, new int[]{52, Opcodes.ARRAYLENGTH, 88, HttpStatus.SC_RESET_CONTENT, Opcodes.LDIV, 39, Opcodes.ARETURN, 21, 155, Opcodes.MULTIANEWARRAY, 251, 223, 155, 21, 5, Opcodes.IRETURN, 254, 124, 12, Opcodes.PUTFIELD, Opcodes.INVOKESTATIC, 96, 50, Opcodes.INSTANCEOF}, new int[]{211, 231, 43, 97, 71, 96, 103, Opcodes.FRETURN, 37, Opcodes.DCMPL, Opcodes.TABLESWITCH, 53, 75, 34, 249, Opcodes.LSHL, 17, Opcodes.L2D, 110, 213, Opcodes.F2D, Opcodes.L2I, 120, Opcodes.DCMPL, 233, Opcodes.JSR, 93, Constants.MAX_HOST_LENGTH}, new int[]{245, Opcodes.LAND, 242, 218, 130, 250, Opcodes.IF_ICMPGE, Opcodes.PUTFIELD, 102, 120, 84, Opcodes.PUTSTATIC, 220, 251, 80, Opcodes.INVOKEVIRTUAL, 229, 18, 2, 4, 68, 33, 101, Opcodes.L2F, 95, Opcodes.DNEG, Opcodes.DREM, 44, Opcodes.DRETURN, Opcodes.INVOKESTATIC, 59, 25, 225, 98, 81, 112}, new int[]{77, Opcodes.INSTANCEOF, Opcodes.L2F, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, Opcodes.I2L, 242, 8, Opcodes.DRETURN, 95, 100, 9, Opcodes.GOTO, 105, 214, Opcodes.DDIV, 57, Opcodes.LSHL, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, Opcodes.FCMPG, Opcodes.RETURN, 226, 5, 9, 5}, new int[]{245, Opcodes.IINC, Opcodes.IRETURN, 223, 96, 32, Opcodes.LNEG, 22, 238, Opcodes.I2L, 238, 231, HttpStatus.SC_RESET_CONTENT, Opcodes.NEWARRAY, 237, 87, Opcodes.ATHROW, Opcodes.FMUL, 16, Opcodes.I2S, Opcodes.FNEG, 23, 37, 90, Opcodes.TABLESWITCH, HttpStatus.SC_RESET_CONTENT, Opcodes.LXOR, 88, 120, 100, 66, Opcodes.L2D, Opcodes.INVOKEDYNAMIC, 240, 82, 44, Opcodes.ARETURN, 87, Opcodes.NEW, Opcodes.I2S, Opcodes.IF_ICMPNE, Opcodes.DRETURN, 69, 213, 92, 253, 225, 19}, new int[]{Opcodes.DRETURN, 9, 223, 238, 12, 17, 220, 208, 100, 29, Opcodes.DRETURN, Opcodes.TABLESWITCH, 230, Opcodes.CHECKCAST, 215, 235, Opcodes.FCMPG, Opcodes.IF_ICMPEQ, 36, 223, 38, 200, Opcodes.IINC, 54, 228, Opcodes.I2C, 218, 234, Opcodes.LNEG, 203, 29, 232, Opcodes.D2F, 238, 22, Opcodes.FCMPG, 201, Opcodes.LNEG, 62, HttpStatus.SC_MULTI_STATUS, Opcodes.IF_ICMPLE, 13, Opcodes.L2F, 245, Opcodes.LAND, 67, 247, 28, 155, 43, 203, Opcodes.DMUL, 233, 53, Opcodes.D2L, 46}, new int[]{242, 93, Opcodes.RET, 50, Opcodes.D2F, 210, 39, Opcodes.FNEG, 202, Opcodes.NEWARRAY, 201, Opcodes.ANEWARRAY, Opcodes.D2L, 108, 196, 37, Opcodes.INVOKEINTERFACE, 112, Opcodes.I2F, 230, 245, 63, Opcodes.MULTIANEWARRAY, Opcodes.ARRAYLENGTH, 250, Opcodes.FMUL, Opcodes.INVOKEINTERFACE, 221, Opcodes.DRETURN, 64, Opcodes.FREM, 71, Opcodes.IF_ICMPLT, 44, Opcodes.I2S, 6, 27, 218, 51, 63, 87, 10, 40, 130, Opcodes.NEWARRAY, 17, Opcodes.IF_ICMPGT, 31, Opcodes.ARETURN, Opcodes.TABLESWITCH, 4, Opcodes.DMUL, 232, 7, 94, Opcodes.IF_ACMPNE, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, Opcodes.LRETURN, 89, 251, Opcodes.FCMPL, Opcodes.IF_ICMPEQ, 56, 89, 33, Opcodes.I2S, 244, 154, 36, 73, Opcodes.LAND, 213, Opcodes.L2I, 248, Opcodes.GETFIELD, 234, Opcodes.MULTIANEWARRAY, 158, Opcodes.RETURN, 68, 122, 93, 213, 15, Opcodes.IF_ICMPNE, 227, 236, 66, Opcodes.F2I, 153, Opcodes.INVOKEINTERFACE, 202, Opcodes.GOTO, Opcodes.PUTSTATIC, 25, 220, 232, 96, 210, 231, Opcodes.L2I, 223, 239, Opcodes.PUTFIELD, 241, 59, 52, Opcodes.IRETURN, 25, 49, 232, 211, Opcodes.ANEWARRAY, 64, 54, 108, 153, Opcodes.IINC, 63, 96, 103, 82, Opcodes.INVOKEDYNAMIC}};

    /* renamed from: c */
    public static final int[] f25322c = new int[256];

    /* renamed from: d */
    public static final int[] f25323d = new int[Constants.MAX_HOST_LENGTH];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            f25323d[i2] = i;
            f25322c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    /* renamed from: a */
    public static String m28849a(CharSequence charSequence, int i) {
        return m28850b(charSequence, 0, charSequence.length(), i);
    }

    /* renamed from: b */
    public static String m28850b(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int[] iArr = f25320a;
            if (i6 >= iArr.length) {
                i6 = -1;
                break;
            }
            if (iArr[i6] == i3) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
        }
        int[] iArr2 = f25321b[i6];
        char[] cArr = new char[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            cArr[i7] = 0;
        }
        for (int i8 = i; i8 < i + i2; i8++) {
            int i9 = i3 - 1;
            int iCharAt = cArr[i9] ^ charSequence.charAt(i8);
            while (i9 > 0) {
                if (iCharAt == 0 || (i5 = iArr2[i9]) == 0) {
                    cArr[i9] = cArr[i9 - 1];
                } else {
                    char c = cArr[i9 - 1];
                    int[] iArr3 = f25323d;
                    int[] iArr4 = f25322c;
                    cArr[i9] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i5]) % Constants.MAX_HOST_LENGTH] ^ c);
                }
                i9--;
            }
            if (iCharAt == 0 || (i4 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f25323d;
                int[] iArr6 = f25322c;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i4]) % Constants.MAX_HOST_LENGTH];
            }
        }
        char[] cArr2 = new char[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            cArr2[i10] = cArr[(i3 - i10) - 1];
        }
        return String.valueOf(cArr2);
    }

    /* renamed from: c */
    public static String m28851c(String str, mgg mggVar) {
        if (str.length() != mggVar.m39007a()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(mggVar.m39007a() + mggVar.m39009c());
        sb.append(str);
        int iMo39012f = mggVar.mo39012f();
        if (iMo39012f == 1) {
            sb.append(m28849a(str, mggVar.m39009c()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[iMo39012f];
            int[] iArr2 = new int[iMo39012f];
            int[] iArr3 = new int[iMo39012f];
            int i = 0;
            while (i < iMo39012f) {
                int i2 = i + 1;
                iArr[i] = mggVar.mo39008b(i2);
                iArr2[i] = mggVar.m39010d(i2);
                iArr3[i] = 0;
                if (i > 0) {
                    iArr3[i] = iArr3[i - 1] + iArr[i];
                }
                i = i2;
            }
            for (int i3 = 0; i3 < iMo39012f; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < mggVar.m39007a(); i4 += iMo39012f) {
                    sb2.append(str.charAt(i4));
                }
                String strM28849a = m28849a(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * iMo39012f) {
                    sb.setCharAt(mggVar.m39007a() + i5, strM28849a.charAt(i6));
                    i5 += iMo39012f;
                    i6++;
                }
            }
        }
        return sb.toString();
    }
}
