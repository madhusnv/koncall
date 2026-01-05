package b00;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.l */
/* loaded from: classes3.dex */
public interface InterfaceC0527l extends h0, WritableByteChannel {
    /* renamed from: M */
    InterfaceC0527l mo1533M(int i10, byte[] bArr);

    /* renamed from: N */
    InterfaceC0527l mo1534N(String str);

    /* renamed from: V */
    InterfaceC0527l mo1535V(long j6);

    /* renamed from: a */
    C0526k mo1536a();

    /* renamed from: c */
    InterfaceC0527l mo1537c();

    @Override // b00.h0, java.io.Flushable
    void flush();

    long j0(i0 i0Var);

    InterfaceC0527l p0(C0529n c0529n);

    InterfaceC0527l write(byte[] bArr);

    InterfaceC0527l writeByte(int i10);

    InterfaceC0527l writeInt(int i10);

    InterfaceC0527l writeShort(int i10);
}
