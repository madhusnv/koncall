package pz;

import b00.C0526k;
import iz.C3389v;
import iz.C3391x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.d */
/* loaded from: classes3.dex */
public final class C6050d extends AbstractC6047a {

    /* renamed from: e */
    public long f29532e;

    /* renamed from: f */
    public final /* synthetic */ C6053g f29533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6050d(C6053g c6053g, C3391x url, long j6) {
        super(c6053g, url);
        AbstractC4154l.m8923f(url, "url");
        this.f29533f = c6053g;
        this.f29532e = j6;
        if (j6 == 0) {
            m12058h(C3389v.f17980b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM9018g;
        if (this.f29524c) {
            return;
        }
        if (this.f29532e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC4299e.f21707a;
            AbstractC4154l.m8923f(timeUnit, "timeUnit");
            try {
                zM9018g = AbstractC4299e.m9018g(this, 100);
            } catch (IOException unused) {
                zM9018g = false;
            }
            if (!zM9018g) {
                this.f29533f.f29540b.mo10171f();
                m12058h(C6053g.f29538g);
            }
        }
        this.f29524c = true;
    }

    @Override // pz.AbstractC6047a, b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        if (this.f29524c) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f29532e;
        if (j10 == 0) {
            return -1L;
        }
        long jG0 = super.g0(sink, Math.min(j10, j6));
        if (jG0 == -1) {
            this.f29533f.f29540b.mo10171f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12058h(C6053g.f29538g);
            throw protocolException;
        }
        long j11 = this.f29532e - jG0;
        this.f29532e = j11;
        if (j11 == 0) {
            m12058h(C3389v.f17980b);
        }
        return jG0;
    }
}
