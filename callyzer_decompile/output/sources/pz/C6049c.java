package pz;

import iz.C3391x;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.c */
/* loaded from: classes3.dex */
public final class C6049c extends AbstractC6047a {

    /* renamed from: e */
    public long f29529e;

    /* renamed from: f */
    public boolean f29530f;

    /* renamed from: g */
    public final /* synthetic */ C6053g f29531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6049c(C6053g c6053g, C3391x url) {
        super(c6053g, url);
        AbstractC4154l.m8923f(url, "url");
        this.f29531g = c6053g;
        this.f29529e = -1L;
        this.f29530f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM9018g;
        if (this.f29524c) {
            return;
        }
        if (this.f29530f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC4299e.f21707a;
            AbstractC4154l.m8923f(timeUnit, "timeUnit");
            try {
                zM9018g = AbstractC4299e.m9018g(this, 100);
            } catch (IOException unused) {
                zM9018g = false;
            }
            if (!zM9018g) {
                this.f29531g.f29540b.mo10171f();
                m12058h(C6053g.f29538g);
            }
        }
        this.f29524c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r11.f29530f == false) goto L30;
     */
    @Override // pz.AbstractC6047a, b00.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g0(b00.C0526k r12, long r13) throws java.io.IOException {
        /*
            r11 = this;
            pz.g r0 = r11.f29531g
            b00.m r1 = r0.f29541c
            java.lang.String r2 = "sink"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r12, r2)
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 < 0) goto Lc1
            boolean r4 = r11.f29524c
            if (r4 != 0) goto Lb9
            boolean r4 = r11.f29530f
            r5 = -1
            if (r4 != 0) goto L1a
            goto L6c
        L1a:
            long r7 = r11.f29529e
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L6d
        L24:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            r1.b0()
        L2d:
            long r7 = r1.x0()     // Catch: java.lang.NumberFormatException -> L55
            r11.f29529e = r7     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.b0()     // Catch: java.lang.NumberFormatException -> L55
            java.lang.CharSequence r1 = nx.AbstractC5178p.g0(r1)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L55
            long r7 = r11.f29529e     // Catch: java.lang.NumberFormatException -> L55
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L93
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> L55
            r8 = 0
            if (r7 <= 0) goto L57
            java.lang.String r7 = ";"
            boolean r7 = nx.AbstractC5185w.m10138t(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> L55
            if (r7 == 0) goto L93
            goto L57
        L55:
            r12 = move-exception
            goto Laf
        L57:
            long r9 = r11.f29529e
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L68
            r11.f29530f = r8
            k1.j2 r1 = r0.f29544f
            iz.v r1 = r1.m8461h()
            r11.m12058h(r1)
        L68:
            boolean r1 = r11.f29530f
            if (r1 != 0) goto L6d
        L6c:
            return r5
        L6d:
            long r1 = r11.f29529e
            long r13 = java.lang.Math.min(r13, r1)
            long r12 = super.g0(r12, r13)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L81
            long r0 = r11.f29529e
            long r0 = r0 - r12
            r11.f29529e = r0
            return r12
        L81:
            oz.c r12 = r0.f29540b
            r12.mo10171f()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            iz.v r13 = pz.C6053g.f29538g
            r11.m12058h(r13)
            throw r12
        L93:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L55
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> L55
            long r2 = r11.f29529e     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> L55
            r14 = 34
            r13.append(r14)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L55
            r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L55
            throw r12     // Catch: java.lang.NumberFormatException -> L55
        Laf:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r12 = r12.getMessage()
            r13.<init>(r12)
            throw r13
        Lb9:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "closed"
            r12.<init>(r13)
            throw r12
        Lc1:
            java.lang.String r12 = "byteCount < 0: "
            java.lang.String r12 = p020v.a1.m14330j(r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.C6049c.g0(b00.k, long):long");
    }
}
