package cr;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5407i;
import yv.C8789d;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cr.b */
/* loaded from: classes3.dex */
public final class C1480b {

    /* renamed from: a */
    public final C5407i f7551a;

    /* renamed from: b */
    public final String f7552b;

    /* renamed from: c */
    public final String f7553c;

    /* renamed from: d */
    public final String f7554d;

    /* renamed from: e */
    public final String f7555e;

    public C1480b(C5407i callSummary) {
        AbstractC4154l.m8923f(callSummary, "callSummary");
        this.f7551a = callSummary;
        this.f7552b = C8789d.m16160g(false, callSummary.f27149g);
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTime = callSummary.f27148f;
        this.f7553c = C8800o.m16186J(localDateTime);
        this.f7554d = C8800o.m16205n(localDateTime);
        this.f7555e = C8800o.m16216y(localDateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1480b) && AbstractC4154l.m8918a(this.f7551a, ((C1480b) obj).f7551a);
    }

    public final int hashCode() {
        return this.f7551a.hashCode();
    }

    public final String toString() {
        return "ContactDetailHistoryUiModel(callSummary=" + this.f7551a + ")";
    }
}
