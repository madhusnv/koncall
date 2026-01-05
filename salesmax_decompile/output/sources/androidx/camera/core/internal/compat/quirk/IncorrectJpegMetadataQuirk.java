package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public final class IncorrectJpegMetadataQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6129a = new HashSet(Arrays.asList("A24"));

    /* renamed from: e */
    public static boolean m4711e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f6129a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    /* renamed from: g */
    public static boolean m4712g() {
        return m4711e();
    }

    /* renamed from: c */
    public final boolean m4713c(byte[] bArr) {
        byte b;
        int i = 2;
        while (i + 4 <= bArr.length && (b = bArr[i]) == -1) {
            if (b == -1 && bArr[i + 1] == -38) {
                return true;
            }
            i += (((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255)) + 2;
        }
        return false;
    }

    /* renamed from: d */
    public final int m4714d(byte[] bArr) {
        int i = 2;
        while (true) {
            int i2 = i + 1;
            if (i2 > bArr.length) {
                return -1;
            }
            if (bArr[i] == -1 && bArr[i2] == -40) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: f */
    public byte[] m4715f(InterfaceC1893c interfaceC1893c) {
        int iM4714d = 0;
        ByteBuffer buffer = interfaceC1893c.u1()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (m4713c(bArr) || (iM4714d = m4714d(bArr)) != -1) ? Arrays.copyOfRange(bArr, iM4714d, buffer.limit()) : bArr;
    }
}
