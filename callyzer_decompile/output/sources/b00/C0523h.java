package b00;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.h */
/* loaded from: classes3.dex */
public final class C0523h implements Closeable {

    /* renamed from: a */
    public C0526k f3627a;

    /* renamed from: b */
    public e0 f3628b;

    /* renamed from: d */
    public byte[] f3630d;

    /* renamed from: c */
    public long f3629c = -1;

    /* renamed from: e */
    public int f3631e = -1;

    /* renamed from: f */
    public int f3632f = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3627a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f3627a = null;
        this.f3628b = null;
        this.f3629c = -1L;
        this.f3630d = null;
        this.f3631e = -1;
        this.f3632f = -1;
    }

    /* renamed from: h */
    public final int m1577h() {
        long j6 = this.f3629c;
        C0526k c0526k = this.f3627a;
        AbstractC4154l.m8920c(c0526k);
        if (j6 == c0526k.f3638b) {
            throw new IllegalStateException("no more bytes");
        }
        long j10 = this.f3629c;
        return m1578j(j10 == -1 ? 0L : j10 + (this.f3632f - this.f3631e));
    }

    /* renamed from: j */
    public final int m1578j(long j6) {
        e0 e0Var;
        C0526k c0526k = this.f3627a;
        if (c0526k == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j6 >= -1) {
            long j10 = c0526k.f3638b;
            if (j6 <= j10) {
                if (j6 == -1 || j6 == j10) {
                    this.f3628b = null;
                    this.f3629c = j6;
                    this.f3630d = null;
                    this.f3631e = -1;
                    this.f3632f = -1;
                    return -1;
                }
                e0 e0Var2 = c0526k.f3637a;
                e0 e0Var3 = this.f3628b;
                long j11 = 0;
                if (e0Var3 != null) {
                    long j12 = this.f3629c;
                    int i10 = this.f3631e;
                    AbstractC4154l.m8920c(e0Var3);
                    long j13 = j12 - (i10 - e0Var3.f3608b);
                    if (j13 > j6) {
                        e0Var = e0Var2;
                        e0Var2 = this.f3628b;
                        j10 = j13;
                    } else {
                        e0Var = this.f3628b;
                        j11 = j13;
                    }
                } else {
                    e0Var = e0Var2;
                }
                if (j10 - j6 > j6 - j11) {
                    while (true) {
                        AbstractC4154l.m8920c(e0Var);
                        int i11 = e0Var.f3609c;
                        int i12 = e0Var.f3608b;
                        if (j6 < (i11 - i12) + j11) {
                            break;
                        }
                        j11 += i11 - i12;
                        e0Var = e0Var.f3612f;
                    }
                } else {
                    while (j10 > j6) {
                        AbstractC4154l.m8920c(e0Var2);
                        e0Var2 = e0Var2.f3613g;
                        AbstractC4154l.m8920c(e0Var2);
                        j10 -= e0Var2.f3609c - e0Var2.f3608b;
                    }
                    e0Var = e0Var2;
                    j11 = j10;
                }
                this.f3628b = e0Var;
                this.f3629c = j6;
                AbstractC4154l.m8920c(e0Var);
                this.f3630d = e0Var.f3607a;
                int i13 = e0Var.f3608b + ((int) (j6 - j11));
                this.f3631e = i13;
                int i14 = e0Var.f3609c;
                this.f3632f = i14;
                return i14 - i13;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j6 + " > size=" + c0526k.f3638b);
    }
}
