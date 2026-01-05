package b00;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.m */
/* loaded from: classes3.dex */
public interface InterfaceC0528m extends i0, ReadableByteChannel {
    /* renamed from: C */
    String mo1541C(long j6);

    /* renamed from: D */
    int mo1542D(C0541z c0541z);

    /* renamed from: Q */
    String mo1543Q(Charset charset);

    /* renamed from: a */
    C0526k mo1544a();

    String b0();

    /* renamed from: e */
    boolean mo1545e();

    long l0(InterfaceC0527l interfaceC0527l);

    /* renamed from: o */
    C0529n mo1549o(long j6);

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j6);

    void s0(long j6);

    void skip(long j6);

    long x0();

    InputStream z0();
}
