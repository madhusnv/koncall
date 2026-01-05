package pg;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;
import uw.C7565i;
import uw.InterfaceC7559c;
import vx.C7812n;
import vx.C7813o;
import vx.InterfaceC7821w;
import vx.InterfaceC7822x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p6 {
    /* renamed from: a */
    public static final void m11814a(InterfaceC7821w interfaceC7821w, Throwable th2) {
        CancellationException cancellationExceptionM13478a = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationExceptionM13478a == null) {
            cancellationExceptionM13478a = tx.c0.m13478a("Channel was consumed, consumer had failed", th2);
        }
        interfaceC7821w.mo14777j(cancellationExceptionM13478a);
    }

    /* renamed from: b */
    public static byte[] m11815b(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: c */
    public static final boolean m11816c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    /* renamed from: d */
    public static final void m11817d(InterfaceC7822x interfaceC7822x, Object obj) {
        Object objMo14776i = interfaceC7822x.mo14776i(obj);
        if (!(objMo14776i instanceof C7812n)) {
            return;
        }
        Object obj2 = ((C7813o) tx.c0.m13468D(C7565i.f36440a, new o6.s0(16, (Object) interfaceC7822x, obj, (InterfaceC7559c) null, false))).f37520a;
    }

    /* renamed from: e */
    public static final void m11818e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: f */
    public static final byte[] m11819f(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    /* renamed from: g */
    public static final byte[] m11820g(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m11819f(0, bArr, 0, bArr2, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
