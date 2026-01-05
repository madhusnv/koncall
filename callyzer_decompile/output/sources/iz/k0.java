package iz;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5197h;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 implements Closeable {

    /* renamed from: a */
    public final x0 f17917a;

    /* renamed from: b */
    public final f0 f17918b;

    /* renamed from: c */
    public final String f17919c;

    /* renamed from: d */
    public final int f17920d;

    /* renamed from: e */
    public final C3388u f17921e;

    /* renamed from: f */
    public final C3389v f17922f;

    /* renamed from: g */
    public final n0 f17923g;

    /* renamed from: h */
    public final k0 f17924h;

    /* renamed from: j */
    public final k0 f17925j;

    /* renamed from: k */
    public final k0 f17926k;

    /* renamed from: l */
    public final long f17927l;

    /* renamed from: m */
    public final long f17928m;

    /* renamed from: n */
    public final C5197h f17929n;

    /* renamed from: p */
    public final r0 f17930p;

    /* renamed from: q */
    public C3370c f17931q;

    /* renamed from: r */
    public final boolean f17932r;

    public k0(x0 request, f0 protocol, String message, int i10, C3388u c3388u, C3389v c3389v, n0 body, k0 k0Var, k0 k0Var2, k0 k0Var3, long j6, long j10, C5197h c5197h, r0 trailersSource) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(protocol, "protocol");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(body, "body");
        AbstractC4154l.m8923f(trailersSource, "trailersSource");
        this.f17917a = request;
        this.f17918b = protocol;
        this.f17919c = message;
        this.f17920d = i10;
        this.f17921e = c3388u;
        this.f17922f = c3389v;
        this.f17923g = body;
        this.f17924h = k0Var;
        this.f17925j = k0Var2;
        this.f17926k = k0Var3;
        this.f17927l = j6;
        this.f17928m = j10;
        this.f17929n = c5197h;
        this.f17930p = trailersSource;
        boolean z6 = false;
        if (200 <= i10 && i10 < 300) {
            z6 = true;
        }
        this.f17932r = z6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17923g.close();
    }

    /* renamed from: h */
    public final j0 m7739h() {
        j0 j0Var = new j0();
        j0Var.f17901c = -1;
        j0Var.f17905g = n0.f17961b;
        j0Var.f17912n = r0.J0;
        j0Var.f17899a = this.f17917a;
        j0Var.f17900b = this.f17918b;
        j0Var.f17901c = this.f17920d;
        j0Var.f17902d = this.f17919c;
        j0Var.f17903e = this.f17921e;
        j0Var.f17904f = this.f17922f.m7789j();
        j0Var.f17905g = this.f17923g;
        j0Var.f17906h = this.f17924h;
        j0Var.f17907i = this.f17925j;
        j0Var.f17908j = this.f17926k;
        j0Var.f17909k = this.f17927l;
        j0Var.f17910l = this.f17928m;
        j0Var.f17911m = this.f17929n;
        j0Var.f17912n = this.f17930p;
        return j0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f17918b + ", code=" + this.f17920d + ", message=" + this.f17919c + ", url=" + ((C3391x) this.f17917a.f36754b) + '}';
    }
}
