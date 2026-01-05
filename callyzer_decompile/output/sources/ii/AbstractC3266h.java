package ii;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.h */
/* loaded from: classes.dex */
public abstract class AbstractC3266h implements InterfaceC3271m {

    /* renamed from: c */
    public static final int[] f17455c = m7615k(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public final int[] f17456a;

    /* renamed from: b */
    public final int f17457b;

    public AbstractC3266h(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f17456a = m7615k(bArr);
        this.f17457b = i10;
    }

    /* renamed from: i */
    public static void m7613i(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        int i16 = (i15 >>> (-16)) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        int i19 = (i18 >>> (-12)) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        int i22 = (i21 >>> (-8)) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = (i24 >>> (-7)) | (i24 << 7);
    }

    /* renamed from: j */
    public static void m7614j(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            m7613i(iArr, 0, 4, 8, 12);
            m7613i(iArr, 1, 5, 9, 13);
            m7613i(iArr, 2, 6, 10, 14);
            m7613i(iArr, 3, 7, 11, 15);
            m7613i(iArr, 0, 5, 10, 15);
            m7613i(iArr, 1, 6, 11, 12);
            m7613i(iArr, 2, 7, 8, 13);
            m7613i(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: k */
    public static int[] m7615k(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // ii.InterfaceC3271m
    /* renamed from: a */
    public final byte[] mo7601a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - mo7612g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mo7612g() + bArr.length);
        m7618f(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    @Override // ii.InterfaceC3271m
    /* renamed from: b */
    public final byte[] mo7602b(byte[] bArr) {
        return m7617e(ByteBuffer.wrap(bArr));
    }

    /* renamed from: c */
    public final ByteBuffer m7616c(int i10, byte[] bArr) {
        int[] iArrMo7611d = mo7611d(i10, m7615k(bArr));
        int[] iArr = (int[]) iArrMo7611d.clone();
        m7614j(iArr);
        for (int i11 = 0; i11 < iArrMo7611d.length; i11++) {
            iArrMo7611d[i11] = iArrMo7611d[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo7611d, 0, 16);
        return byteBufferOrder;
    }

    /* renamed from: d */
    public abstract int[] mo7611d(int i10, int[] iArr);

    /* renamed from: e */
    public final byte[] m7617e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < mo7612g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[mo7612g()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        m7619h(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    /* renamed from: f */
    public final void m7618f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo7612g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM7624a = AbstractC3274p.m7624a(mo7612g());
        byteBuffer.put(bArrM7624a);
        m7619h(bArrM7624a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    /* renamed from: g */
    public abstract int mo7612g();

    /* renamed from: h */
    public final void m7619h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferM7616c = m7616c(this.f17457b + i12, bArr);
            if (i12 == i10) {
                p6.m11818e(byteBuffer, byteBuffer2, byteBufferM7616c, iRemaining % 64);
            } else {
                p6.m11818e(byteBuffer, byteBuffer2, byteBufferM7616c, 64);
            }
        }
    }
}
