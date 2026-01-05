package wi;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.e */
/* loaded from: classes.dex */
public final class C8055e {

    /* renamed from: b */
    public static final String f38579b = AbstractC8057g.m15194h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c */
    public static final AtomicLong f38580c = new AtomicLong(0);

    /* renamed from: a */
    public final String f38581a;

    public C8055e() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b10 = bArrArray[0];
        byte b11 = bArrArray[1];
        byte b12 = bArrArray[2];
        byte b13 = bArrArray[3];
        byte[] bArrM15186a = m15186a(time % 1000);
        byte b14 = bArrM15186a[0];
        byte b15 = bArrM15186a[1];
        byte[] bArrM15186a2 = m15186a(f38580c.incrementAndGet());
        byte b16 = bArrM15186a2[0];
        byte b17 = bArrM15186a2[1];
        byte[] bArrM15186a3 = m15186a(Integer.valueOf(Process.myPid()).shortValue());
        String strM15191e = AbstractC8057g.m15191e(new byte[]{b10, b11, b12, b13, b14, b15, b16, b17, bArrM15186a3[0], bArrM15186a3[1]});
        Locale locale = Locale.US;
        this.f38581a = String.format(locale, "%s%s%s%s", strM15191e.substring(0, 12), strM15191e.substring(12, 16), strM15191e.subSequence(16, 20), f38579b.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m15186a(long j6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j6);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f38581a;
    }
}
