package p001o;

import com.google.firebase.perf.util.Constants;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class y27 implements Comparable {

    /* renamed from: L */
    public static final float f54751L;

    /* renamed from: a */
    public static final C18302a f54752a = new C18302a(null);

    /* renamed from: b */
    public static final short f54753b = m57135c(5120);

    /* renamed from: c */
    public static final short f54754c = m57135c(-1025);

    /* renamed from: d */
    public static final short f54755d = m57135c(31743);

    /* renamed from: e */
    public static final short f54756e = m57135c(1024);

    /* renamed from: f */
    public static final short f54757f = m57135c(1);

    /* renamed from: g */
    public static final short f54758g = m57135c(32256);

    /* renamed from: h */
    public static final short f54759h = m57135c(-1024);

    /* renamed from: q */
    public static final short f54760q = m57135c(Short.MIN_VALUE);

    /* renamed from: s */
    public static final short f54761s = m57135c(31744);

    /* renamed from: x */
    public static final short f54762x = m57135c(0);

    /* renamed from: y */
    public static final short f54763y = m57134a(1.0f);

    /* renamed from: H */
    public static final short f54750H = m57134a(-1.0f);

    /* renamed from: o.y27$a */
    public static final class C18302a {
        public C18302a() {
        }

        public /* synthetic */ C18302a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final short m57138b(float f) {
            int i;
            int i2;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = iFloatToRawIntBits >>> 31;
            int i4 = (iFloatToRawIntBits >>> 23) & Constants.MAX_HOST_LENGTH;
            int i5 = iFloatToRawIntBits & 8388607;
            int i6 = 31;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i2 = 512;
                    i7 = i2;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            } else {
                int i8 = (i4 - 127) + 15;
                if (i8 >= 31) {
                    i6 = 49;
                } else if (i8 > 0) {
                    i7 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    } else {
                        i6 = i8;
                    }
                } else if (i8 >= -10) {
                    int i9 = (i5 | 8388608) >> (1 - i8);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i2 = i9 >> 13;
                    i6 = 0;
                    i7 = i2;
                } else {
                    i6 = 0;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            }
            return (short) i;
        }
    }

    static {
        e37 e37Var = e37.f20857a;
        f54751L = Float.intBitsToFloat(1056964608);
    }

    /* renamed from: a */
    public static short m57134a(float f) {
        return m57135c(f54752a.m57138b(f));
    }

    /* renamed from: c */
    public static short m57135c(short s) {
        return s;
    }

    /* renamed from: d */
    public static final float m57136d(short s) {
        int i;
        int i2;
        int i3;
        int i4 = s & 65535;
        int i5 = 32768 & i4;
        int i6 = (i4 >>> 10) & 31;
        int i7 = i4 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i = Constants.MAX_HOST_LENGTH;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i = (i6 - 15) + Opcodes.LAND;
            }
            int i9 = i;
            i2 = i8;
            i3 = i9;
        } else {
            if (i7 != 0) {
                e37 e37Var = e37.f20857a;
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - f54751L;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        int i10 = (i3 << 23) | (i5 << 16) | i2;
        e37 e37Var2 = e37.f20857a;
        return Float.intBitsToFloat(i10);
    }
}
