package p001o;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public interface gm1 extends dvf, WritableByteChannel {
    gm1 E1(int i);

    /* renamed from: G */
    gm1 mo29022G(int i);

    /* renamed from: I */
    gm1 mo29023I(int i);

    gm1 M2(zq1 zq1Var);

    gm1 T1(int i);

    gm1 a0();

    /* renamed from: b */
    gm1 mo29024b();

    @Override // p001o.dvf, java.io.Flushable
    void flush();

    rl1 getBuffer();

    /* renamed from: i */
    gm1 mo29025i(String str, int i, int i2);

    gm1 n0(String str);

    long p0(lzf lzfVar);

    gm1 t2(long j);

    gm1 write(byte[] bArr);

    gm1 write(byte[] bArr, int i, int i2);
}
