package og;

import c3.C0849d;
import jakarta.mail.C3696x;
import java.security.AccessController;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c2 {
    /* renamed from: a */
    public static final C0849d m10570a(float f6, float f10, float f11, float f12, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new C0849d(f6, f10, f11, f12, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* renamed from: b */
    public static ClassLoader m10571b() {
        return (ClassLoader) AccessController.doPrivileged(new C3696x(4));
    }

    /* renamed from: c */
    public static final boolean m10572c(C0849d c0849d) {
        long j6 = c0849d.f5362e;
        return (j6 >>> 32) == (4294967295L & j6) && j6 == c0849d.f5363f && j6 == c0849d.f5364g && j6 == c0849d.f5365h;
    }
}
