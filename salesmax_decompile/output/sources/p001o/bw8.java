package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class bw8 {
    /* renamed from: b */
    public static final byte[] m19904b(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8) {
        int i = s & 65535;
        int i2 = s2 & 65535;
        int i3 = s3 & 65535;
        int i4 = s4 & 65535;
        int i5 = s5 & 65535;
        int i6 = s6 & 65535;
        int i7 = s7 & 65535;
        int i8 = s8 & 65535;
        return new byte[]{(byte) ((i >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i & Constants.MAX_HOST_LENGTH), (byte) ((i2 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i2 & Constants.MAX_HOST_LENGTH), (byte) ((i3 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i3 & Constants.MAX_HOST_LENGTH), (byte) ((i4 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i4 & Constants.MAX_HOST_LENGTH), (byte) ((i5 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i5 & Constants.MAX_HOST_LENGTH), (byte) ((i6 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i6 & Constants.MAX_HOST_LENGTH), (byte) ((i7 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i7 & Constants.MAX_HOST_LENGTH), (byte) ((i8 >>> 8) & Constants.MAX_HOST_LENGTH), (byte) (i8 & Constants.MAX_HOST_LENGTH)};
    }
}
