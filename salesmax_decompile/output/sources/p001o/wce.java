package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class wce implements gm1 {

    /* renamed from: a */
    public final dvf f51791a;

    /* renamed from: b */
    public final rl1 f51792b;

    /* renamed from: c */
    public boolean f51793c;

    public wce(dvf dvfVar) {
        sq8.m48649h(dvfVar, "sink");
        this.f51791a = dvfVar;
        this.f51792b = new rl1();
    }

    @Override // p001o.gm1
    public gm1 E1(int i) {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.E1(i);
        return a0();
    }

    @Override // p001o.gm1
    /* renamed from: G */
    public gm1 mo29022G(int i) {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.mo29022G(i);
        return a0();
    }

    @Override // p001o.gm1
    /* renamed from: I */
    public gm1 mo29023I(int i) {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.mo29023I(i);
        return a0();
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "source");
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.M0(rl1Var, j);
        a0();
    }

    @Override // p001o.gm1
    public gm1 M2(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "byteString");
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.M2(zq1Var);
        return a0();
    }

    @Override // p001o.gm1
    public gm1 T1(int i) {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.T1(i);
        return a0();
    }

    @Override // p001o.gm1
    public gm1 a0() {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM46913c = this.f51792b.m46913c();
        if (jM46913c > 0) {
            this.f51791a.M0(this.f51792b, jM46913c);
        }
        return this;
    }

    @Override // p001o.gm1
    /* renamed from: b */
    public gm1 mo29024b() {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jF0 = this.f51792b.f0();
        if (jF0 > 0) {
            this.f51791a.M0(this.f51792b, jF0);
        }
        return this;
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f51793c) {
            return;
        }
        try {
            if (this.f51792b.f0() > 0) {
                dvf dvfVar = this.f51791a;
                rl1 rl1Var = this.f51792b;
                dvfVar.M0(rl1Var, rl1Var.f0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f51791a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f51793c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p001o.gm1, p001o.dvf, java.io.Flushable
    public void flush() {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f51792b.f0() > 0) {
            dvf dvfVar = this.f51791a;
            rl1 rl1Var = this.f51792b;
            dvfVar.M0(rl1Var, rl1Var.f0());
        }
        this.f51791a.flush();
    }

    @Override // p001o.gm1
    public rl1 getBuffer() {
        return this.f51792b;
    }

    @Override // p001o.gm1
    /* renamed from: i */
    public gm1 mo29025i(String str, int i, int i2) {
        sq8.m48649h(str, "string");
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.mo29025i(str, i, i2);
        return a0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f51793c;
    }

    @Override // p001o.gm1
    public gm1 n0(String str) {
        sq8.m48649h(str, "string");
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.n0(str);
        return a0();
    }

    @Override // p001o.gm1
    public long p0(lzf lzfVar) {
        sq8.m48649h(lzfVar, "source");
        long j = 0;
        while (true) {
            long jN0 = lzfVar.N0(this.f51792b, MediaStatus.COMMAND_PLAYBACK_RATE);
            if (jN0 == -1) {
                return j;
            }
            j += jN0;
            a0();
        }
    }

    @Override // p001o.gm1
    public gm1 t2(long j) {
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f51792b.t2(j);
        return a0();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return this.f51791a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f51791a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "source");
        if (!(!this.f51793c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f51792b.write(byteBuffer);
        a0();
        return iWrite;
    }

    @Override // p001o.gm1
    public gm1 write(byte[] bArr) {
        sq8.m48649h(bArr, "source");
        if (!this.f51793c) {
            this.f51792b.write(bArr);
            return a0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p001o.gm1
    public gm1 write(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "source");
        if (!this.f51793c) {
            this.f51792b.write(bArr, i, i2);
            return a0();
        }
        throw new IllegalStateException("closed".toString());
    }
}
