package p001o;

import p001o.rl1;

/* loaded from: classes3.dex */
public abstract class g8f implements f8f {

    /* renamed from: a */
    public final f8f f24736a;

    /* renamed from: b */
    public final rl1.C16621b f24737b;

    public g8f(f8f f8fVar) {
        sq8.m48649h(f8fVar, "delegate");
        this.f24736a = f8fVar;
        this.f24737b = new rl1.C16621b();
    }

    @Override // p001o.f8f
    public void N1(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "source");
        a74.m16536a(t6fVar).m46908S(this.f24737b);
        try {
            int iM46924f = this.f24737b.m46924f(0L);
            long j2 = j;
            while (iM46924f > 0 && j2 > 0) {
                int iMin = Math.min(iM46924f, (int) j2);
                rl1.C16621b c16621b = this.f24737b;
                byte[] bArr = c16621b.f43764e;
                if (bArr == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                mo28209a(bArr, c16621b.f43765f, iMin);
                j2 -= iMin;
                iM46924f = this.f24737b.m46922c();
            }
            this.f24737b.close();
            this.f24736a.N1(t6fVar, j);
        } catch (Throwable th) {
            this.f24737b.close();
            throw th;
        }
    }

    /* renamed from: a */
    public abstract void mo28209a(byte[] bArr, int i, int i2);

    @Override // p001o.f8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24736a.close();
    }

    @Override // p001o.f8f
    public void flush() {
        this.f24736a.flush();
    }
}
