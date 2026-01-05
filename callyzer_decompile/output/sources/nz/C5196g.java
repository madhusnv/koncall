package nz;

import b00.AbstractC0534s;
import b00.C0526k;
import b00.i0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.g */
/* loaded from: classes3.dex */
public final class C5196g extends AbstractC0534s {

    /* renamed from: b */
    public final long f25332b;

    /* renamed from: c */
    public long f25333c;

    /* renamed from: d */
    public boolean f25334d;

    /* renamed from: e */
    public boolean f25335e;

    /* renamed from: f */
    public boolean f25336f;

    /* renamed from: g */
    public final /* synthetic */ C5197h f25337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5196g(C5197h c5197h, i0 delegate, long j6) {
        super(delegate);
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f25337g = c5197h;
        this.f25332b = j6;
        this.f25334d = true;
        if (j6 == 0) {
            m10180h(null);
        }
    }

    @Override // b00.AbstractC0534s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f25336f) {
            return;
        }
        this.f25336f = true;
        try {
            super.close();
        } catch (IOException e2) {
            throw m10180h(e2);
        }
    }

    @Override // b00.AbstractC0534s, b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        AbstractC4154l.m8923f(sink, "sink");
        if (this.f25336f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jG0 = this.f3665a.g0(sink, j6);
            boolean z6 = this.f25334d;
            C5197h c5197h = this.f25337g;
            if (z6) {
                this.f25334d = false;
                c5197h.f25339b.mo7780v(c5197h.f25338a);
            }
            if (jG0 == -1) {
                m10180h(null);
                return -1L;
            }
            long j10 = this.f25333c + jG0;
            long j11 = this.f25332b;
            if (j11 == -1 || j10 <= j11) {
                this.f25333c = j10;
                if (c5197h.f25341d.mo11315c()) {
                    m10180h(null);
                }
                return jG0;
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
        } catch (IOException e2) {
            throw m10180h(e2);
        }
    }

    /* renamed from: h */
    public final IOException m10180h(IOException iOException) {
        if (this.f25335e) {
            return iOException;
        }
        this.f25335e = true;
        C5197h c5197h = this.f25337g;
        if (iOException == null && this.f25334d) {
            this.f25334d = false;
            c5197h.f25339b.mo7780v(c5197h.f25338a);
        }
        return C5197h.m10181a(c5197h, this.f25333c, iOException, 4);
    }
}
