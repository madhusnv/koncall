package c00;

import b00.AbstractC0534s;
import b00.C0526k;
import b00.i0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.e */
/* loaded from: classes3.dex */
public final class C0838e extends AbstractC0534s {

    /* renamed from: b */
    public final long f5306b;

    /* renamed from: c */
    public final boolean f5307c;

    /* renamed from: d */
    public long f5308d;

    public C0838e(i0 i0Var, long j6, boolean z6) {
        super(i0Var);
        this.f5306b = j6;
        this.f5307c = z6;
    }

    @Override // b00.AbstractC0534s, b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        AbstractC4154l.m8923f(sink, "sink");
        long j10 = this.f5308d;
        long j11 = this.f5306b;
        if (j10 > j11) {
            j6 = 0;
        } else if (this.f5307c) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j6 = Math.min(j6, j12);
        }
        long jG0 = super.g0(sink, j6);
        if (jG0 != -1) {
            this.f5308d += jG0;
        }
        long j13 = this.f5308d;
        if ((j13 >= j11 || jG0 != -1) && j13 <= j11) {
            return jG0;
        }
        if (jG0 > 0 && j13 > j11) {
            long j14 = sink.f3638b - (j13 - j11);
            C0526k c0526k = new C0526k();
            c0526k.j0(sink);
            sink.h0(c0526k, j14);
            c0526k.m1593n();
        }
        throw new IOException("expected " + j11 + " bytes but got " + this.f5308d);
    }
}
