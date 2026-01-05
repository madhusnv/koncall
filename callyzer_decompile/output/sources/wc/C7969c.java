package wc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.c */
/* loaded from: classes.dex */
public final class C7969c implements e0 {

    /* renamed from: a */
    public final byte[] f38339a;

    /* renamed from: b */
    public int f38340b;

    public C7969c(byte[] data) {
        AbstractC4154l.m8923f(data, "data");
        this.f38339a = data;
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        int i10 = this.f38340b;
        byte[] bArr = this.f38339a;
        if (i10 >= bArr.length) {
            return -1L;
        }
        long jMin = Math.min(j6, bArr.length - i10);
        int i11 = (int) jMin;
        sink.write(bArr, this.f38340b, i11);
        this.f38340b += i11;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
