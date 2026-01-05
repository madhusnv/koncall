package nz;

import b00.AbstractC0533r;
import b00.C0526k;
import b00.h0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.f */
/* loaded from: classes3.dex */
public final class C5195f extends AbstractC0533r {

    /* renamed from: b */
    public final long f25327b;

    /* renamed from: c */
    public boolean f25328c;

    /* renamed from: d */
    public long f25329d;

    /* renamed from: e */
    public boolean f25330e;

    /* renamed from: f */
    public final /* synthetic */ C5197h f25331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5195f(C5197h c5197h, h0 delegate, long j6) {
        super(delegate);
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f25331f = c5197h;
        this.f25327b = j6;
    }

    @Override // b00.AbstractC0533r, b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f25330e) {
            return;
        }
        this.f25330e = true;
        long j6 = this.f25327b;
        if (j6 != -1 && this.f25329d != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
        } catch (IOException e2) {
            throw m10179h(e2);
        }
    }

    @Override // b00.AbstractC0533r, b00.h0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e2) {
            throw m10179h(e2);
        }
    }

    /* renamed from: h */
    public final IOException m10179h(IOException iOException) {
        if (this.f25328c) {
            return iOException;
        }
        this.f25328c = true;
        return C5197h.m10181a(this.f25331f, this.f25329d, iOException, 2);
    }

    @Override // b00.AbstractC0533r, b00.h0
    public final void h0(C0526k source, long j6) throws IOException {
        AbstractC4154l.m8923f(source, "source");
        if (this.f25330e) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f25327b;
        if (j10 == -1 || this.f25329d + j6 <= j10) {
            try {
                super.h0(source, j6);
                this.f25329d += j6;
                return;
            } catch (IOException e2) {
                throw m10179h(e2);
            }
        }
        throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f25329d + j6));
    }
}
