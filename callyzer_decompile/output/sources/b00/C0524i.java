package b00;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.i */
/* loaded from: classes3.dex */
public final class C0524i extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f3633a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0528m f3634b;

    public /* synthetic */ C0524i(InterfaceC0528m interfaceC0528m, int i10) {
        this.f3633a = i10;
        this.f3634b = interfaceC0528m;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f3633a) {
            case 0:
                jMin = Math.min(((C0526k) this.f3634b).f3638b, Integer.MAX_VALUE);
                break;
            default:
                d0 d0Var = (d0) this.f3634b;
                if (!d0Var.f3603c) {
                    jMin = Math.min(d0Var.f3602b.f3638b, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3633a) {
            case 0:
                break;
            default:
                ((d0) this.f3634b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f3633a) {
            case 0:
                C0526k c0526k = (C0526k) this.f3634b;
                if (c0526k.f3638b > 0) {
                    return c0526k.readByte() & 255;
                }
                return -1;
            default:
                d0 d0Var = (d0) this.f3634b;
                C0526k c0526k2 = d0Var.f3602b;
                if (d0Var.f3603c) {
                    throw new IOException("closed");
                }
                if (c0526k2.f3638b == 0 && d0Var.f3601a.g0(c0526k2, 8192L) == -1) {
                    return -1;
                }
                return c0526k2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f3633a) {
            case 0:
                return ((C0526k) this.f3634b) + ".inputStream()";
            default:
                return ((d0) this.f3634b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) throws IOException {
        switch (this.f3633a) {
            case 1:
                AbstractC4154l.m8923f(out, "out");
                d0 d0Var = (d0) this.f3634b;
                C0526k c0526k = d0Var.f3602b;
                if (d0Var.f3603c) {
                    throw new IOException("closed");
                }
                long j6 = 0;
                long j10 = 0;
                while (true) {
                    if (c0526k.f3638b == j6 && d0Var.f3601a.g0(c0526k, 8192L) == -1) {
                        return j10;
                    }
                    long j11 = c0526k.f3638b;
                    j10 += j11;
                    AbstractC0517b.m1526e(j11, 0L, j11);
                    e0 e0Var = c0526k.f3637a;
                    while (j11 > j6) {
                        AbstractC4154l.m8920c(e0Var);
                        int iMin = (int) Math.min(j11, e0Var.f3609c - e0Var.f3608b);
                        out.write(e0Var.f3607a, e0Var.f3608b, iMin);
                        int i10 = e0Var.f3608b + iMin;
                        e0Var.f3608b = i10;
                        long j12 = iMin;
                        c0526k.f3638b -= j12;
                        j11 -= j12;
                        if (i10 == e0Var.f3609c) {
                            e0 e0VarM1552a = e0Var.m1552a();
                            c0526k.f3637a = e0VarM1552a;
                            f0.m1559a(e0Var);
                            e0Var = e0VarM1552a;
                        }
                        j6 = 0;
                    }
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i10, int i11) throws IOException {
        switch (this.f3633a) {
            case 0:
                AbstractC4154l.m8923f(sink, "sink");
                return ((C0526k) this.f3634b).read(sink, i10, i11);
            default:
                AbstractC4154l.m8923f(sink, "data");
                d0 d0Var = (d0) this.f3634b;
                C0526k c0526k = d0Var.f3602b;
                if (!d0Var.f3603c) {
                    AbstractC0517b.m1526e(sink.length, i10, i11);
                    if (c0526k.f3638b == 0 && d0Var.f3601a.g0(c0526k, 8192L) == -1) {
                        return -1;
                    }
                    return c0526k.read(sink, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    /* renamed from: h */
    private final void m1579h() {
    }
}
