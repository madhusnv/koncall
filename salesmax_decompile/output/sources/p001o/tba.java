package p001o;

import java.io.EOFException;

/* loaded from: classes3.dex */
public final class tba implements h8f {

    /* renamed from: a */
    public final h8f f46774a;

    /* renamed from: b */
    public final long f46775b;

    /* renamed from: c */
    public long f46776c;

    public tba(h8f h8fVar, long j) {
        sq8.m48649h(h8fVar, "source");
        this.f46774a = h8fVar;
        this.f46775b = j;
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46774a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // p001o.h8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(t6f t6fVar, long j) throws EOFException {
        sq8.m48649h(t6fVar, "sink");
        long j2 = this.f46774a.read(t6fVar, j);
        if (j2 != -1) {
            long j3 = this.f46776c;
            if (j3 > this.f46775b) {
                gre.m29408d(this.f46775b, Long.valueOf(this.f46776c));
            } else {
                this.f46776c = j3 + j2;
            }
        }
        return j2;
    }
}
