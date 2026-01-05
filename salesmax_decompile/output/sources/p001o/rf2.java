package p001o;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes4.dex */
public abstract class rf2 implements sh8 {

    /* renamed from: c */
    public static final int[] f43480c = m46639m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public int[] f43481a;

    /* renamed from: b */
    public final int f43482b;

    public rf2(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f43481a = m46639m(bArr);
        this.f43482b = i;
    }

    /* renamed from: i */
    public static void m46635i(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iM46636j = m46636j(i5 ^ iArr[i4], 16);
        iArr[i4] = iM46636j;
        int i6 = iArr[i3] + iM46636j;
        iArr[i3] = i6;
        int iM46636j2 = m46636j(iArr[i2] ^ i6, 12);
        iArr[i2] = iM46636j2;
        int i7 = iArr[i] + iM46636j2;
        iArr[i] = i7;
        int iM46636j3 = m46636j(iArr[i4] ^ i7, 8);
        iArr[i4] = iM46636j3;
        int i8 = iArr[i3] + iM46636j3;
        iArr[i3] = i8;
        iArr[i2] = m46636j(iArr[i2] ^ i8, 7);
    }

    /* renamed from: j */
    public static int m46636j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: k */
    public static void m46637k(int[] iArr, int[] iArr2) {
        int[] iArr3 = f43480c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: l */
    public static void m46638l(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m46635i(iArr, 0, 4, 8, 12);
            m46635i(iArr, 1, 5, 9, 13);
            m46635i(iArr, 2, 6, 10, 14);
            m46635i(iArr, 3, 7, 11, 15);
            m46635i(iArr, 0, 5, 10, 15);
            m46635i(iArr, 1, 6, 11, 12);
            m46635i(iArr, 2, 7, 8, 13);
            m46635i(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: m */
    public static int[] m46639m(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // p001o.sh8
    /* renamed from: a */
    public byte[] mo46640a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Api.BaseClientBuilder.API_PRIORITY_OTHER - mo35487g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mo35487g() + bArr.length);
        m46644f(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    @Override // p001o.sh8
    /* renamed from: b */
    public byte[] mo46641b(byte[] bArr) {
        return m46643e(ByteBuffer.wrap(bArr));
    }

    /* renamed from: c */
    public ByteBuffer m46642c(byte[] bArr, int i) {
        int[] iArrMo35486d = mo35486d(m46639m(bArr), i);
        int[] iArr = (int[]) iArrMo35486d.clone();
        m46638l(iArr);
        for (int i2 = 0; i2 < iArrMo35486d.length; i2++) {
            iArrMo35486d[i2] = iArrMo35486d[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo35486d, 0, 16);
        return byteBufferOrder;
    }

    /* renamed from: d */
    public abstract int[] mo35486d(int[] iArr, int i);

    /* renamed from: e */
    public byte[] m46643e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < mo35487g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[mo35487g()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        m46645h(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    /* renamed from: f */
    public void m46644f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo35487g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM51350c = ube.m51350c(mo35487g());
        byteBuffer.put(bArrM51350c);
        m46645h(bArrM51350c, byteBuffer, ByteBuffer.wrap(bArr));
    }

    /* renamed from: g */
    public abstract int mo35487g();

    /* renamed from: h */
    public final void m46645h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i = (iRemaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferM46642c = m46642c(bArr, this.f43482b + i2);
            if (i2 == i - 1) {
                ar1.m17696c(byteBuffer, byteBuffer2, byteBufferM46642c, iRemaining % 64);
            } else {
                ar1.m17696c(byteBuffer, byteBuffer2, byteBufferM46642c, 64);
            }
        }
    }
}
