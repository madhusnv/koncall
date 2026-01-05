package qc;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import og.yc;
import wc.C7985s;
import wc.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.z */
/* loaded from: classes.dex */
public final class C6180z implements e0 {

    /* renamed from: a */
    public final e0 f30138a;

    /* renamed from: b */
    public final long f30139b;

    /* renamed from: c */
    public long f30140c;

    public C6180z(e0 source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        this.f30138a = source;
        this.f30139b = j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30138a.close();
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) throws EOFException {
        AbstractC4154l.m8923f(sink, "sink");
        long j10 = this.f30138a.read(sink, j6);
        long j11 = this.f30139b;
        if (j10 != -1) {
            long j12 = this.f30140c;
            if (j12 <= j11) {
                this.f30140c = j12 + j10;
                return j10;
            }
        }
        yc.m11066b(j11, Long.valueOf(this.f30140c));
        return j10;
    }
}
