package w6;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.f */
/* loaded from: classes.dex */
public final class C7939f extends C7935b {
    public C7939f(byte[] bArr) {
        super(bArr);
        this.f38153a.mark(Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final void m15068j(long j6) throws IOException {
        int i10 = this.f38154b;
        if (i10 > j6) {
            this.f38154b = 0;
            this.f38153a.reset();
        } else {
            j6 -= i10;
        }
        m15059h((int) j6);
    }

    public C7939f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f38153a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
