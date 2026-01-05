package p001o;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class mgc implements dvf {

    /* renamed from: a */
    public final OutputStream f35400a;

    /* renamed from: b */
    public final nmh f35401b;

    public mgc(OutputStream outputStream, nmh nmhVar) {
        sq8.m48649h(outputStream, "out");
        sq8.m48649h(nmhVar, "timeout");
        this.f35400a = outputStream;
        this.f35401b = nmhVar;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) throws IOException {
        sq8.m48649h(rl1Var, "source");
        AbstractC13298f.m25885b(rl1Var.f0(), 0L, j);
        while (j > 0) {
            this.f35401b.mo40795f();
            hbf hbfVar = rl1Var.f43757a;
            sq8.m48646e(hbfVar);
            int iMin = (int) Math.min(j, hbfVar.f26589c - hbfVar.f26588b);
            this.f35400a.write(hbfVar.f26587a, hbfVar.f26588b, iMin);
            hbfVar.f26588b += iMin;
            long j2 = iMin;
            j -= j2;
            rl1Var.m46911Y(rl1Var.f0() - j2);
            if (hbfVar.f26588b == hbfVar.f26589c) {
                rl1Var.f43757a = hbfVar.m30154b();
                lbf.m36864b(hbfVar);
            }
        }
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35400a.close();
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() throws IOException {
        this.f35400a.flush();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return this.f35401b;
    }

    public String toString() {
        return "sink(" + this.f35400a + ')';
    }
}
