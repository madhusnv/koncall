package p001o;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public interface im1 extends lzf, ReadableByteChannel {
    int C2();

    /* renamed from: N */
    void mo32307N(rl1 rl1Var, long j);

    String Q0();

    byte[] T0(long j);

    long T2(dvf dvfVar);

    /* renamed from: W */
    long mo32308W(zq1 zq1Var);

    short X0();

    String c0(long j);

    long c1();

    /* renamed from: e */
    rl1 mo32309e();

    rl1 getBuffer();

    void k1(long j);

    /* renamed from: m */
    byte[] mo32310m();

    long m3();

    /* renamed from: n */
    boolean mo32311n();

    String n2(Charset charset);

    int n3(qec qecVar);

    InputStream o3();

    im1 peek();

    long r2(zq1 zq1Var);

    int read(byte[] bArr, int i, int i2);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    String t1(long j);

    zq1 y1(long j);
}
