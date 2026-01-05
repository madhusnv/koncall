package b00;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.v */
/* loaded from: classes3.dex */
public final class C0537v implements i0 {

    /* renamed from: a */
    public final d0 f3672a;

    /* renamed from: b */
    public final Inflater f3673b;

    /* renamed from: c */
    public int f3674c;

    /* renamed from: d */
    public boolean f3675d;

    public C0537v(d0 d0Var, Inflater inflater) {
        this.f3672a = d0Var;
        this.f3673b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3675d) {
            return;
        }
        this.f3673b.end();
        this.f3675d = true;
        this.f3672a.close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f3672a.f3601a.mo1532f();
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws DataFormatException, IOException {
        long j10;
        AbstractC4154l.m8923f(sink, "sink");
        while (j6 >= 0) {
            if (this.f3675d) {
                throw new IllegalStateException("closed");
            }
            d0 d0Var = this.f3672a;
            Inflater inflater = this.f3673b;
            if (j6 == 0) {
                j10 = 0;
            } else {
                try {
                    e0 e0VarW0 = sink.w0(1);
                    int iMin = (int) Math.min(j6, 8192 - e0VarW0.f3609c);
                    if (inflater.needsInput() && !d0Var.mo1545e()) {
                        e0 e0Var = d0Var.f3602b.f3637a;
                        AbstractC4154l.m8920c(e0Var);
                        int i10 = e0Var.f3609c;
                        int i11 = e0Var.f3608b;
                        int i12 = i10 - i11;
                        this.f3674c = i12;
                        inflater.setInput(e0Var.f3607a, i11, i12);
                    }
                    int iInflate = inflater.inflate(e0VarW0.f3607a, e0VarW0.f3609c, iMin);
                    int i13 = this.f3674c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f3674c -= remaining;
                        d0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        e0VarW0.f3609c += iInflate;
                        j10 = iInflate;
                        sink.f3638b += j10;
                    } else {
                        if (e0VarW0.f3608b == e0VarW0.f3609c) {
                            sink.f3637a = e0VarW0.m1552a();
                            f0.m1559a(e0VarW0);
                        }
                        j10 = 0;
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            if (j10 > 0) {
                return j10;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (d0Var.mo1545e()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
    }
}
