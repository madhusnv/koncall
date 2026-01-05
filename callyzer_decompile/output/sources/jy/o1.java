package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5166d;
import og.lc;
import px.C6044a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o1 implements InterfaceC2401a {

    /* renamed from: a */
    public static final o1 f19938a = new o1();

    /* renamed from: b */
    public static final t0 f19939b = new t0("kotlin.uuid.Uuid", C3053d.f16396j);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        String strConcat;
        String uuidString = interfaceC3366c.mo7705n();
        AbstractC4154l.m8923f(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            long jM10077b = AbstractC5166d.m10077b(0, 16, uuidString);
            long jM10077b2 = AbstractC5166d.m10077b(16, 32, uuidString);
            if (jM10077b != 0 || jM10077b2 != 0) {
                return new C6044a(jM10077b, jM10077b2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb2.append(strConcat);
                sb2.append("\" of length ");
                sb2.append(uuidString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long jM10077b3 = AbstractC5166d.m10077b(0, 8, uuidString);
            lc.m10747a(8, uuidString);
            long jM10077b4 = AbstractC5166d.m10077b(9, 13, uuidString);
            lc.m10747a(13, uuidString);
            long jM10077b5 = AbstractC5166d.m10077b(14, 18, uuidString);
            lc.m10747a(18, uuidString);
            long jM10077b6 = AbstractC5166d.m10077b(19, 23, uuidString);
            lc.m10747a(23, uuidString);
            long j6 = (jM10077b4 << 16) | (jM10077b3 << 32) | jM10077b5;
            long jM10077b7 = AbstractC5166d.m10077b(24, 36, uuidString) | (jM10077b6 << 48);
            if (j6 != 0 || jM10077b7 != 0) {
                return new C6044a(j6, jM10077b7);
            }
        }
        return C6044a.f29503c;
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19939b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C6044a value = (C6044a) obj;
        AbstractC4154l.m8923f(value, "value");
        interfaceC3367d.mo7724r(value.toString());
    }
}
