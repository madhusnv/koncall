package b00;

import c00.AbstractC0844k;
import c00.C0840g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.e */
/* loaded from: classes3.dex */
public final class C0520e implements i0 {

    /* renamed from: a */
    public final /* synthetic */ int f3604a = 0;

    /* renamed from: b */
    public final Object f3605b;

    /* renamed from: c */
    public final Object f3606c;

    public C0520e(InputStream input, k0 k0Var) {
        AbstractC4154l.m8923f(input, "input");
        this.f3605b = input;
        this.f3606c = k0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f3604a) {
            case 0:
                C0840g c0840g = (C0840g) this.f3605b;
                C0520e c0520e = (C0520e) this.f3606c;
                c0840g.m1556h();
                try {
                    c0520e.close();
                    if (c0840g.m1557i()) {
                        throw c0840g.m2261k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!c0840g.m1557i()) {
                        throw e2;
                    }
                    throw c0840g.m2261k(e2);
                } finally {
                    c0840g.m1557i();
                }
            default:
                ((InputStream) this.f3605b).close();
                return;
        }
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        switch (this.f3604a) {
            case 0:
                return (C0840g) this.f3605b;
            default:
                return (k0) this.f3606c;
        }
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        switch (this.f3604a) {
            case 0:
                AbstractC4154l.m8923f(sink, "sink");
                C0840g c0840g = (C0840g) this.f3605b;
                C0520e c0520e = (C0520e) this.f3606c;
                c0840g.m1556h();
                try {
                    long jG0 = c0520e.g0(sink, j6);
                    if (c0840g.m1557i()) {
                        throw c0840g.m2261k(null);
                    }
                    return jG0;
                } catch (IOException e2) {
                    if (c0840g.m1557i()) {
                        throw c0840g.m2261k(e2);
                    }
                    throw e2;
                } finally {
                    c0840g.m1557i();
                }
            default:
                AbstractC4154l.m8923f(sink, "sink");
                if (j6 == 0) {
                    return 0L;
                }
                if (j6 < 0) {
                    throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
                }
                try {
                    ((k0) this.f3606c).mo1584f();
                    e0 e0VarW0 = sink.w0(1);
                    int i10 = ((InputStream) this.f3605b).read(e0VarW0.f3607a, e0VarW0.f3609c, (int) Math.min(j6, 8192 - e0VarW0.f3609c));
                    if (i10 == -1) {
                        if (e0VarW0.f3608b == e0VarW0.f3609c) {
                            sink.f3637a = e0VarW0.m1552a();
                            f0.m1559a(e0VarW0);
                        }
                        return -1L;
                    }
                    e0VarW0.f3609c += i10;
                    long j10 = i10;
                    sink.f3638b += j10;
                    return j10;
                } catch (AssertionError e10) {
                    if (AbstractC0844k.m2262a(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    public final String toString() {
        switch (this.f3604a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0520e) this.f3606c) + ')';
            default:
                return "source(" + ((InputStream) this.f3605b) + ')';
        }
    }

    public C0520e(C0840g c0840g, C0520e c0520e) {
        this.f3605b = c0840g;
        this.f3606c = c0520e;
    }
}
