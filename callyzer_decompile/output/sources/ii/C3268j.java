package ii;

import ai.InterfaceC0144a;
import ai.InterfaceC0154k;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.j */
/* loaded from: classes.dex */
public final class C3268j implements InterfaceC0144a {

    /* renamed from: a */
    public final InterfaceC3271m f17461a;

    /* renamed from: b */
    public final InterfaceC0154k f17462b;

    /* renamed from: c */
    public final int f17463c;

    public C3268j(InterfaceC3271m interfaceC3271m, InterfaceC0154k interfaceC0154k, int i10) {
        this.f17461a = interfaceC3271m;
        this.f17462b = interfaceC0154k;
        this.f17463c = i10;
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo7601a = this.f17461a.mo7601a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return p6.m11815b(bArrMo7601a, this.f17462b.mo359b(p6.m11815b(bArr2, bArrMo7601a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17463c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f17462b.mo358a(bArrCopyOfRange2, p6.m11815b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f17461a.mo7602b(bArrCopyOfRange);
    }
}
