package ii;

import ai.InterfaceC0144a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import pg.p6;
import pg.r6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.i */
/* loaded from: classes.dex */
public final class C3267i implements InterfaceC0144a {

    /* renamed from: a */
    public final AbstractC3266h f17458a;

    /* renamed from: b */
    public final AbstractC3266h f17459b;

    /* renamed from: c */
    public final /* synthetic */ int f17460c;

    public C3267i(byte[] bArr, int i10) {
        this.f17460c = i10;
        this.f17458a = m7621d(1, bArr);
        this.f17459b = m7621d(0, bArr);
    }

    /* renamed from: c */
    public static byte[] m7620c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        AbstractC3266h abstractC3266h = this.f17458a;
        if (length > 2147483631 - abstractC3266h.mo7612g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(abstractC3266h.mo7612g() + bArr.length + 16);
        if (byteBufferAllocate.remaining() < abstractC3266h.mo7612g() + bArr.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        abstractC3266h.m7618f(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[abstractC3266h.mo7612g()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f17459b.m7616c(0, bArr3).get(bArr4);
        byte[] bArrM11847c = r6.m11847c(bArr4, m7620c(byteBufferAllocate, bArr2));
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrM11847c);
        return byteBufferAllocate.array();
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        AbstractC3266h abstractC3266h = this.f17458a;
        if (iRemaining < abstractC3266h.mo7612g() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBufferWrap.position();
        byte[] bArr3 = new byte[16];
        byteBufferWrap.position(byteBufferWrap.limit() - 16);
        byteBufferWrap.get(bArr3);
        byteBufferWrap.position(iPosition);
        byteBufferWrap.limit(byteBufferWrap.limit() - 16);
        byte[] bArr4 = new byte[abstractC3266h.mo7612g()];
        byteBufferWrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.f17459b.m7616c(0, bArr4).get(bArr5);
            if (!p6.m11816c(r6.m11847c(bArr5, m7620c(byteBufferWrap, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBufferWrap.position(iPosition);
            return abstractC3266h.m7617e(byteBufferWrap);
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }

    /* renamed from: d */
    public final AbstractC3266h m7621d(int i10, byte[] bArr) {
        switch (this.f17460c) {
            case 0:
                return new C3265g(bArr, i10);
            default:
                return new C3276r(bArr, i10);
        }
    }
}
