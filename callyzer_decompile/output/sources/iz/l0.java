package iz;

import b00.InterfaceC0528m;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends Reader {

    /* renamed from: a */
    public final InterfaceC0528m f17939a;

    /* renamed from: b */
    public final Charset f17940b;

    /* renamed from: c */
    public boolean f17941c;

    /* renamed from: d */
    public InputStreamReader f17942d;

    public l0(InterfaceC0528m source, Charset charset) {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(charset, "charset");
        this.f17939a = source;
        this.f17940b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17941c = true;
        InputStreamReader inputStreamReader = this.f17942d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f17939a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i10, int i11) throws IOException {
        AbstractC4154l.m8923f(cbuf, "cbuf");
        if (this.f17941c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f17942d;
        if (inputStreamReader == null) {
            InterfaceC0528m interfaceC0528m = this.f17939a;
            inputStreamReader = new InputStreamReader(interfaceC0528m.z0(), AbstractC4299e.m9017f(interfaceC0528m, this.f17940b));
            this.f17942d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i10, i11);
    }
}
