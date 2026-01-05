package p001o;

import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.WebInitiatedCallEvent;

/* loaded from: classes.dex */
public final class bv1 {

    /* renamed from: b */
    public static final C12506a f16849b = new C12506a(null);

    /* renamed from: c */
    public static final int f16850c = 8;

    /* renamed from: d */
    public static final bv1 f16851d = new bv1();

    /* renamed from: a */
    public final bt9 f16852a = bt9.f16783b.m19757a();

    /* renamed from: o.bv1$a */
    public static final class C12506a {
        public C12506a() {
        }

        public /* synthetic */ C12506a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final bv1 m19851a() {
            return bv1.f16851d;
        }
    }

    /* renamed from: b */
    public final void m19850b(WebInitiatedCallEvent webInitiatedCallEvent) {
        sq8.m48649h(webInitiatedCallEvent, "webInitiatedCallEvent");
        LeadsSummary leadsSummaryM19752p = this.f16852a.m19752p(webInitiatedCallEvent.getPhoneNumber(), webInitiatedCallEvent.getContactId());
        jm7.m34050j(webInitiatedCallEvent.getPhoneNumber(), webInitiatedCallEvent.getContext(), leadsSummaryM19752p != null ? leadsSummaryM19752p.toLeads() : null);
    }
}
