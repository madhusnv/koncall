package p001o;

import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.CallStateEvent;

/* loaded from: classes.dex */
public final class im3 implements zz1, dfd {

    /* renamed from: b */
    public static final C14317a f28834b = new C14317a(null);

    /* renamed from: c */
    public static final int f28835c = 8;

    /* renamed from: d */
    public static final im3 f28836d = new im3();

    /* renamed from: a */
    public final tu1 f28837a = tu1.f47778e.m50641a();

    /* renamed from: o.im3$a */
    public static final class C14317a {
        public C14317a() {
        }

        public /* synthetic */ C14317a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final im3 m32317a() {
            return m32318b();
        }

        /* renamed from: b */
        public final im3 m32318b() {
            return im3.f28836d;
        }
    }

    @Override // p001o.av1
    /* renamed from: a */
    public void mo17862a(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
    }

    @Override // p001o.zz1
    /* renamed from: b */
    public void mo32313b(CallStateEvent callStateEvent) {
        sq8.m48649h(callStateEvent, "callStateEvent");
    }

    @Override // p001o.dfd
    /* renamed from: e */
    public void mo22988e(CallEvent callEvent, CallEngagement callEngagement) {
        sq8.m48649h(callEvent, "callEvent");
        sq8.m48649h(callEngagement, "engagement");
        this.f28837a.s0(callEvent, callEngagement);
    }

    @Override // p001o.av1
    /* renamed from: f */
    public void mo17863f(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        StringBuilder sb = new StringBuilder();
        sb.append("Received event: ");
        sb.append(callEvent);
        m32314j(callEvent);
    }

    /* renamed from: j */
    public final void m32314j(CallEvent callEvent) {
        if (m32316l(callEvent)) {
            m32315k(callEvent);
        }
    }

    /* renamed from: k */
    public final void m32315k(CallEvent callEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("Incoming call ended. hide popup for event: ");
        sb.append(callEvent);
        this.f28837a.m50630O(callEvent.getContext(), callEvent.getNumber());
    }

    /* renamed from: l */
    public final boolean m32316l(CallEvent callEvent) {
        return sq8.m48644c(callEvent.getCallStatus(), "COMPLETED");
    }
}
