package p001o;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes6.dex */
public final class lk5 implements dvf {

    /* renamed from: a */
    public final gm1 f33937a;

    /* renamed from: b */
    public final Deflater f33938b;

    /* renamed from: c */
    public boolean f33939c;

    public lk5(gm1 gm1Var, Deflater deflater) {
        sq8.m48649h(gm1Var, "sink");
        sq8.m48649h(deflater, "deflater");
        this.f33937a = gm1Var;
        this.f33938b = deflater;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) throws IOException {
        sq8.m48649h(rl1Var, "source");
        AbstractC13298f.m25885b(rl1Var.f0(), 0L, j);
        while (j > 0) {
            hbf hbfVar = rl1Var.f43757a;
            sq8.m48646e(hbfVar);
            int iMin = (int) Math.min(j, hbfVar.f26589c - hbfVar.f26588b);
            this.f33938b.setInput(hbfVar.f26587a, hbfVar.f26588b, iMin);
            m37367a(false);
            long j2 = iMin;
            rl1Var.m46911Y(rl1Var.f0() - j2);
            int i = hbfVar.f26588b + iMin;
            hbfVar.f26588b = i;
            if (i == hbfVar.f26589c) {
                rl1Var.f43757a = hbfVar.m30154b();
                lbf.m36864b(hbfVar);
            }
            j -= j2;
        }
    }

    /* renamed from: a */
    public final void m37367a(boolean z) throws IOException {
        hbf hbfVarR0;
        int iDeflate;
        rl1 buffer = this.f33937a.getBuffer();
        while (true) {
            hbfVarR0 = buffer.r0(1);
            if (z) {
                try {
                    Deflater deflater = this.f33938b;
                    byte[] bArr = hbfVarR0.f26587a;
                    int i = hbfVarR0.f26589c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.f33938b;
                byte[] bArr2 = hbfVarR0.f26587a;
                int i2 = hbfVarR0.f26589c;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                hbfVarR0.f26589c += iDeflate;
                buffer.m46911Y(buffer.f0() + iDeflate);
                this.f33937a.a0();
            } else if (this.f33938b.needsInput()) {
                break;
            }
        }
        if (hbfVarR0.f26588b == hbfVarR0.f26589c) {
            buffer.f43757a = hbfVarR0.m30154b();
            lbf.m36864b(hbfVarR0);
        }
    }

    /* renamed from: c */
    public final void m37368c() throws IOException {
        this.f33938b.finish();
        m37367a(false);
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f33939c) {
            return;
        }
        try {
            m37368c();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f33938b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f33937a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f33939c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() throws IOException {
        m37367a(true);
        this.f33937a.flush();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return this.f33937a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f33937a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk5(dvf dvfVar, Deflater deflater) {
        this(uac.m51309b(dvfVar), deflater);
        sq8.m48649h(dvfVar, "sink");
        sq8.m48649h(deflater, "deflater");
    }
}
