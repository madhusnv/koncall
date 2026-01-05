package w6;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.a */
/* loaded from: classes.dex */
public final class C7934a extends MediaDataSource {

    /* renamed from: a */
    public long f38151a;

    /* renamed from: b */
    public final /* synthetic */ C7939f f38152b;

    public C7934a(C7939f c7939f) {
        this.f38152b = c7939f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j10 = this.f38151a;
            C7939f c7939f = this.f38152b;
            if (j10 != j6) {
                if (j10 >= 0 && j6 >= j10 + c7939f.f38153a.available()) {
                    return -1;
                }
                c7939f.m15068j(j6);
                this.f38151a = j6;
            }
            if (i11 > c7939f.f38153a.available()) {
                i11 = c7939f.f38153a.available();
            }
            int i12 = c7939f.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f38151a += i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f38151a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
