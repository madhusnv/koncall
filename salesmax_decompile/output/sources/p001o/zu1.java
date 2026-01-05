package p001o;

import ai.salesmax.model.CallEvent;

/* loaded from: classes.dex */
public final class zu1 implements bk6 {

    /* renamed from: b */
    public static final C18709a f57710b = new C18709a(null);

    /* renamed from: c */
    public static final int f57711c = 8;

    /* renamed from: d */
    public static final zu1 f57712d = new zu1();

    /* renamed from: a */
    public final tu1 f57713a = tu1.f47778e.m50641a();

    /* renamed from: o.zu1$a */
    public static final class C18709a {
        public C18709a() {
        }

        public /* synthetic */ C18709a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final zu1 m59939a() {
            return m59940b();
        }

        /* renamed from: b */
        public final zu1 m59940b() {
            return zu1.f57712d;
        }
    }

    @Override // p001o.av1
    /* renamed from: a */
    public void mo17862a(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        uia.m51627b(uia.f48971a, "call-event-lifecycle-listener", "Event received for preprocessing: " + callEvent, null, null, 12, null);
    }

    @Override // p001o.bk6
    /* renamed from: c */
    public void mo19285c(CallEvent callEvent, boolean z) {
        sq8.m48649h(callEvent, "callEvent");
        uia.m51627b(uia.f48971a, "call-event-lifecycle-listener", "Event received for failed completion for event: " + callEvent, null, null, 12, null);
        this.f57713a.k0(callEvent, z ^ true);
    }

    @Override // p001o.bk6
    /* renamed from: d */
    public void mo19286d(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        this.f57713a.k0(callEvent, true);
    }

    @Override // p001o.av1
    /* renamed from: f */
    public void mo17863f(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        uia.m51627b(uia.f48971a, "call-event-lifecycle-listener", "Event received for processing: " + callEvent, null, null, 12, null);
    }

    @Override // p001o.bk6
    /* renamed from: g */
    public void mo19287g(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        uia.m51627b(uia.f48971a, "call-event-lifecycle-listener", "Open event received: " + callEvent, null, null, 12, null);
    }

    @Override // p001o.bk6
    /* renamed from: h */
    public void mo19288h(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        uia.m51627b(uia.f48971a, "call-event-lifecycle-listener", "Stale event received: " + callEvent, null, null, 12, null);
    }
}
