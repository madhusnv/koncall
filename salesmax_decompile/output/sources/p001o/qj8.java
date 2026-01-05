package p001o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class qj8 implements lzf {

    /* renamed from: a */
    public final InputStream f42067a;

    /* renamed from: b */
    public final nmh f42068b;

    public qj8(InputStream inputStream, nmh nmhVar) {
        sq8.m48649h(inputStream, "input");
        sq8.m48649h(nmhVar, "timeout");
        this.f42067a = inputStream;
        this.f42068b = nmhVar;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) throws IOException {
        sq8.m48649h(rl1Var, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.f42068b.mo40795f();
            hbf hbfVarR0 = rl1Var.r0(1);
            int i = this.f42067a.read(hbfVarR0.f26587a, hbfVarR0.f26589c, (int) Math.min(j, 8192 - hbfVarR0.f26589c));
            if (i != -1) {
                hbfVarR0.f26589c += i;
                long j2 = i;
                rl1Var.m46911Y(rl1Var.f0() + j2);
                return j2;
            }
            if (hbfVarR0.f26588b != hbfVarR0.f26589c) {
                return -1L;
            }
            rl1Var.f43757a = hbfVarR0.m30154b();
            lbf.m36864b(hbfVarR0);
            return -1L;
        } catch (AssertionError e) {
            if (uac.m51311d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42067a.close();
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f42068b;
    }

    public String toString() {
        return "source(" + this.f42067a + ')';
    }
}
