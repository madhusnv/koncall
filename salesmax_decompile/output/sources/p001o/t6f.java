package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class t6f implements v6f, u6f {

    /* renamed from: a */
    public final rl1 f46544a;

    public t6f() {
        this(new rl1());
    }

    @Override // p001o.u6f
    public long B0(h8f h8fVar) {
        sq8.m48649h(h8fVar, "source");
        return m49487a().p0(a74.m16538c(h8fVar));
    }

    @Override // p001o.f8f
    public void N1(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "source");
        m49487a().M0(a74.m16536a(t6fVar), j);
    }

    /* renamed from: a */
    public final rl1 m49487a() {
        return this.f46544a;
    }

    @Override // p001o.u6f
    /* renamed from: b */
    public void mo49488b() {
        this.f46544a.mo29024b();
    }

    /* renamed from: c */
    public final long m49489c() {
        return this.f46544a.f0();
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m49487a().close();
    }

    /* renamed from: d */
    public String m49490d() {
        return m49487a().m46909T();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t6f) {
            return sq8.m48644c(this.f46544a, ((t6f) obj).f46544a);
        }
        return false;
    }

    @Override // p001o.f8f
    public void flush() {
        m49487a().flush();
    }

    @Override // p001o.u6f
    public t6f getBuffer() {
        return this;
    }

    public int hashCode() {
        return this.f46544a.hashCode();
    }

    @Override // p001o.u6f
    /* renamed from: i */
    public void mo49491i(String str, int i, int i2) {
        sq8.m48649h(str, "string");
        m49487a().mo29025i(str, i, i2);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f46544a.isOpen();
    }

    @Override // p001o.v6f
    /* renamed from: m */
    public byte[] mo49492m() {
        return m49487a().mo32310m();
    }

    @Override // p001o.v6f
    /* renamed from: n */
    public boolean mo49493n() {
        return m49487a().mo32311n();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "dst");
        return this.f46544a.read(byteBuffer);
    }

    public String toString() {
        return this.f46544a.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "src");
        return this.f46544a.write(byteBuffer);
    }

    public t6f(rl1 rl1Var) {
        sq8.m48649h(rl1Var, "buffer");
        this.f46544a = rl1Var;
    }

    @Override // p001o.v6f
    public int read(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "sink");
        return m49487a().read(bArr, i, i2);
    }

    @Override // p001o.u6f
    public void write(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "source");
        m49487a().write(bArr, i, i2);
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        return m49487a().N0(t6fVar.m49487a(), j);
    }
}
