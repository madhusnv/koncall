package b00;

import c00.C0840g;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.d */
/* loaded from: classes3.dex */
public final class C0519d implements h0 {

    /* renamed from: a */
    public final /* synthetic */ int f3598a;

    /* renamed from: b */
    public final Object f3599b;

    /* renamed from: c */
    public final Object f3600c;

    public /* synthetic */ C0519d(int i10, Object obj, Object obj2) {
        this.f3598a = i10;
        this.f3599b = obj;
        this.f3600c = obj2;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        switch (this.f3598a) {
            case 0:
                C0840g c0840g = (C0840g) this.f3599b;
                C0519d c0519d = (C0519d) this.f3600c;
                c0840g.m1556h();
                try {
                    c0519d.close();
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
                ((OutputStream) this.f3599b).close();
                return;
        }
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        switch (this.f3598a) {
            case 0:
                return (C0840g) this.f3599b;
            default:
                return (k0) this.f3600c;
        }
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f3598a) {
            case 0:
                C0840g c0840g = (C0840g) this.f3599b;
                C0519d c0519d = (C0519d) this.f3600c;
                c0840g.m1556h();
                try {
                    c0519d.flush();
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
                ((OutputStream) this.f3599b).flush();
                return;
        }
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) throws IOException {
        switch (this.f3598a) {
            case 0:
                AbstractC4154l.m8923f(source, "source");
                AbstractC0517b.m1526e(source.f3638b, 0L, j6);
                long j10 = j6;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    e0 e0Var = source.f3637a;
                    AbstractC4154l.m8920c(e0Var);
                    while (true) {
                        if (j11 < 65536) {
                            j11 += e0Var.f3609c - e0Var.f3608b;
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                e0Var = e0Var.f3612f;
                                AbstractC4154l.m8920c(e0Var);
                            }
                        }
                    }
                    C0840g c0840g = (C0840g) this.f3599b;
                    C0519d c0519d = (C0519d) this.f3600c;
                    c0840g.m1556h();
                    try {
                        try {
                            c0519d.h0(source, j11);
                            if (c0840g.m1557i()) {
                                throw c0840g.m2261k(null);
                            }
                            j10 -= j11;
                        } catch (IOException e2) {
                            if (!c0840g.m1557i()) {
                                throw e2;
                            }
                            throw c0840g.m2261k(e2);
                        }
                    } catch (Throwable th2) {
                        c0840g.m1557i();
                        throw th2;
                    }
                }
            default:
                AbstractC4154l.m8923f(source, "source");
                AbstractC0517b.m1526e(source.f3638b, 0L, j6);
                while (j6 > 0) {
                    ((k0) this.f3600c).mo1584f();
                    e0 e0Var2 = source.f3637a;
                    AbstractC4154l.m8920c(e0Var2);
                    int iMin = (int) Math.min(j6, e0Var2.f3609c - e0Var2.f3608b);
                    ((OutputStream) this.f3599b).write(e0Var2.f3607a, e0Var2.f3608b, iMin);
                    int i10 = e0Var2.f3608b + iMin;
                    e0Var2.f3608b = i10;
                    long j12 = iMin;
                    j6 -= j12;
                    source.f3638b -= j12;
                    if (i10 == e0Var2.f3609c) {
                        source.f3637a = e0Var2.m1552a();
                        f0.m1559a(e0Var2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f3598a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0519d) this.f3600c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f3599b) + ')';
        }
    }
}
