package b00;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.j */
/* loaded from: classes3.dex */
public final class C0525j extends OutputStream {

    /* renamed from: a */
    public final /* synthetic */ int f3635a = 0;

    /* renamed from: b */
    public final Object f3636b;

    public C0525j(FileOutputStream fileOutputStream) {
        this.f3636b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f3635a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f3635a) {
            case 0:
                break;
            default:
                ((FileOutputStream) this.f3636b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f3635a) {
            case 0:
                return ((C0526k) this.f3636b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        switch (this.f3635a) {
            case 0:
                ((C0526k) this.f3636b).B0(i10);
                break;
            default:
                ((FileOutputStream) this.f3636b).write(i10);
                break;
        }
    }

    public C0525j(C0526k c0526k) {
        this.f3636b = c0526k;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        switch (this.f3635a) {
            case 1:
                AbstractC4154l.m8923f(b10, "b");
                ((FileOutputStream) this.f3636b).write(b10);
                break;
            default:
                super.write(b10);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i10, int i11) throws IOException {
        switch (this.f3635a) {
            case 0:
                AbstractC4154l.m8923f(data, "data");
                ((C0526k) this.f3636b).write(data, i10, i11);
                break;
            default:
                AbstractC4154l.m8923f(data, "bytes");
                ((FileOutputStream) this.f3636b).write(data, i10, i11);
                break;
        }
    }

    /* renamed from: h */
    private final void m1580h() {
    }

    /* renamed from: j */
    private final void m1581j() {
    }

    /* renamed from: n */
    private final void m1582n() {
    }
}
