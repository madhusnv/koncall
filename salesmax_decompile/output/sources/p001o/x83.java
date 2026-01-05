package p001o;

/* loaded from: classes3.dex */
public final class x83 implements h8f {

    /* renamed from: a */
    public final String f53336a;

    /* renamed from: b */
    public final ix7 f53337b;

    public x83(String str, ix7 ix7Var) {
        sq8.m48649h(str, "expectedChecksum");
        sq8.m48649h(ix7Var, "hashingSource");
        this.f53336a = str;
        this.f53337b = ix7Var;
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f53337b.close();
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        long j2 = this.f53337b.read(t6fVar, j);
        if (j2 == -1) {
            w27.m53812e(this.f53336a, cb1.m20635c(this.f53337b.m32881c()));
        }
        return j2;
    }
}
