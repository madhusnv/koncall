package p001o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes6.dex */
public final class di8 implements lzf {

    /* renamed from: a */
    public final im1 f19962a;

    /* renamed from: b */
    public final Inflater f19963b;

    /* renamed from: c */
    public int f19964c;

    /* renamed from: d */
    public boolean f19965d;

    public di8(im1 im1Var, Inflater inflater) {
        sq8.m48649h(im1Var, "source");
        sq8.m48649h(inflater, "inflater");
        this.f19962a = im1Var;
        this.f19963b = inflater;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) throws DataFormatException, IOException {
        sq8.m48649h(rl1Var, "sink");
        do {
            long jM23225a = m23225a(rl1Var, j);
            if (jM23225a > 0) {
                return jM23225a;
            }
            if (this.f19963b.finished() || this.f19963b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f19962a.mo32311n());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: a */
    public final long m23225a(rl1 rl1Var, long j) throws DataFormatException, IOException {
        sq8.m48649h(rl1Var, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f19965d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            hbf hbfVarR0 = rl1Var.r0(1);
            int iMin = (int) Math.min(j, 8192 - hbfVarR0.f26589c);
            m23226c();
            int iInflate = this.f19963b.inflate(hbfVarR0.f26587a, hbfVarR0.f26589c, iMin);
            m23227d();
            if (iInflate > 0) {
                hbfVarR0.f26589c += iInflate;
                long j2 = iInflate;
                rl1Var.m46911Y(rl1Var.f0() + j2);
                return j2;
            }
            if (hbfVarR0.f26588b == hbfVarR0.f26589c) {
                rl1Var.f43757a = hbfVarR0.m30154b();
                lbf.m36864b(hbfVarR0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: c */
    public final boolean m23226c() {
        if (!this.f19963b.needsInput()) {
            return false;
        }
        if (this.f19962a.mo32311n()) {
            return true;
        }
        hbf hbfVar = this.f19962a.getBuffer().f43757a;
        sq8.m48646e(hbfVar);
        int i = hbfVar.f26589c;
        int i2 = hbfVar.f26588b;
        int i3 = i - i2;
        this.f19964c = i3;
        this.f19963b.setInput(hbfVar.f26587a, i2, i3);
        return false;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19965d) {
            return;
        }
        this.f19963b.end();
        this.f19965d = true;
        this.f19962a.close();
    }

    /* renamed from: d */
    public final void m23227d() {
        int i = this.f19964c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f19963b.getRemaining();
        this.f19964c -= remaining;
        this.f19962a.skip(remaining);
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f19962a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public di8(lzf lzfVar, Inflater inflater) {
        this(uac.m51310c(lzfVar), inflater);
        sq8.m48649h(lzfVar, "source");
        sq8.m48649h(inflater, "inflater");
    }
}
