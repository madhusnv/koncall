package qz;

import b00.C0526k;
import b00.C0529n;
import b00.InterfaceC0528m;
import b00.i0;
import b00.k0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.s */
/* loaded from: classes3.dex */
public final class C6401s implements i0 {

    /* renamed from: a */
    public final InterfaceC0528m f30876a;

    /* renamed from: b */
    public int f30877b;

    /* renamed from: c */
    public int f30878c;

    /* renamed from: d */
    public int f30879d;

    /* renamed from: e */
    public int f30880e;

    /* renamed from: f */
    public int f30881f;

    public C6401s(InterfaceC0528m source) {
        AbstractC4154l.m8923f(source, "source");
        this.f30876a = source;
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f30876a.mo1532f();
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        int i10;
        int i11;
        AbstractC4154l.m8923f(sink, "sink");
        do {
            int i12 = this.f30880e;
            InterfaceC0528m interfaceC0528m = this.f30876a;
            if (i12 == 0) {
                interfaceC0528m.skip(this.f30881f);
                this.f30881f = 0;
                if ((this.f30878c & 4) == 0) {
                    i10 = this.f30879d;
                    int iM9008l = AbstractC4297c.m9008l(interfaceC0528m);
                    this.f30880e = iM9008l;
                    this.f30877b = iM9008l;
                    int i13 = interfaceC0528m.readByte() & 255;
                    this.f30878c = interfaceC0528m.readByte() & 255;
                    Logger logger = C6402t.f30882d;
                    if (logger.isLoggable(Level.FINE)) {
                        C0529n c0529n = AbstractC6390h.f30820a;
                        logger.fine(AbstractC6390h.m12384b(true, this.f30879d, this.f30877b, i13, this.f30878c));
                    }
                    i11 = interfaceC0528m.readInt() & Integer.MAX_VALUE;
                    this.f30879d = i11;
                    if (i13 != 9) {
                        throw new IOException(i13 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jG0 = interfaceC0528m.g0(sink, Math.min(j6, i12));
                if (jG0 != -1) {
                    this.f30880e -= (int) jG0;
                    return jG0;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
