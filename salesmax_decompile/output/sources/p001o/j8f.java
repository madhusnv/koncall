package p001o;

import p001o.rl1;

/* loaded from: classes3.dex */
public abstract class j8f implements h8f {

    /* renamed from: a */
    public final h8f f29966a;

    /* renamed from: b */
    public final rl1.C16621b f29967b;

    public j8f(h8f h8fVar) {
        sq8.m48649h(h8fVar, "delegate");
        this.f29966a = h8fVar;
        this.f29967b = new rl1.C16621b();
    }

    /* renamed from: a */
    public abstract void mo32880a(byte[] bArr, int i, int i2);

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29966a.close();
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        rl1 rl1VarM16536a = a74.m16536a(t6fVar);
        long j2 = this.f29966a.read(t6fVar, j);
        if (j2 <= 0) {
            return j2;
        }
        rl1VarM16536a.m46908S(this.f29967b);
        try {
            int iM46924f = this.f29967b.m46924f(t6fVar.m49489c() - j2);
            long j3 = j2;
            while (j3 > 0 && iM46924f > 0) {
                int iMin = Math.min(iM46924f, (int) j3);
                rl1.C16621b c16621b = this.f29967b;
                byte[] bArr = c16621b.f43764e;
                if (bArr == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                mo32880a(bArr, c16621b.f43765f, iMin);
                j3 -= iMin;
                iM46924f = this.f29967b.m46922c();
            }
            return j2;
        } finally {
            this.f29967b.close();
        }
    }
}
