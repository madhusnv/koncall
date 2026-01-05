package p001o;

import p001o.sse;

/* loaded from: classes2.dex */
public final class smh implements sse {

    /* renamed from: d */
    public final long f45656d;

    /* renamed from: e */
    public final sse f45657e;

    public smh(long j, sse sseVar) {
        fgd.m26658b(j >= 0, "Timeout must be non-negative.");
        this.f45656d = j;
        this.f45657e = sseVar;
    }

    @Override // p001o.sse
    /* renamed from: a */
    public long mo33435a() {
        return this.f45656d;
    }

    @Override // p001o.sse
    /* renamed from: e */
    public sse.C16912c mo33437e(sse.InterfaceC16911b interfaceC16911b) {
        sse.C16912c c16912cMo33437e = this.f45657e.mo33437e(interfaceC16911b);
        return (mo33435a() <= 0 || interfaceC16911b.mo31785a() < mo33435a() - c16912cMo33437e.m48885b()) ? c16912cMo33437e : sse.C16912c.f45882d;
    }
}
