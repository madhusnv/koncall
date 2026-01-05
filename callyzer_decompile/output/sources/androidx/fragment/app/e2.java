package androidx.fragment.app;

import java.io.Writer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 extends Writer {

    /* renamed from: a */
    public final StringBuilder f2505a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1132h();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1132h();
    }

    /* renamed from: h */
    public final void m1132h() {
        StringBuilder sb2 = this.f2505a;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c2 = cArr[i10 + i12];
            if (c2 == '\n') {
                m1132h();
            } else {
                this.f2505a.append(c2);
            }
        }
    }
}
