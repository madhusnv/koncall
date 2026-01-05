package yb;

import bd.C0645a;
import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2016n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.qe;
import og.ud;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yb.b */
/* loaded from: classes.dex */
public abstract class AbstractC8610b {

    /* renamed from: a */
    public static final C2003a f41873a = new C2003a("aws.smithy.kotlin#BusinessMetrics");

    /* renamed from: b */
    public static final C2003a f41874b = new C2003a("aws.smithy.kotlin#AccountIdBasedEndpointAccountId");

    /* renamed from: c */
    public static final C2003a f41875c = new C2003a("aws.smithy.kotlin#ServiceEndpointOverride");

    /* renamed from: a */
    public static final boolean m15955a(C0645a c0645a, EnumC8611c metric) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        AbstractC4154l.m8923f(metric, "metric");
        C2005c c2005c = c0645a.f4118c;
        C2003a c2003a = f41873a;
        return c2005c.mo1861a(c2003a) && ((Set) ud.m10978d(c2005c, c2003a)).contains(metric);
    }

    /* renamed from: b */
    public static final void m15956b(C0645a c0645a, InterfaceC8609a metric) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        AbstractC4154l.m8923f(metric, "metric");
        C2005c c2005c = c0645a.f4118c;
        C2003a c2003a = f41873a;
        if (c2005c.mo1861a(c2003a)) {
            ((Set) ud.m10978d(c2005c, c2003a)).add(metric);
        } else {
            c2005c.mo1862b(c2003a, qe.m10857c(metric));
        }
    }

    /* renamed from: c */
    public static final void m15957c(InterfaceC2016n interfaceC2016n, InterfaceC8609a metric) {
        AbstractC4154l.m8923f(metric, "metric");
        C2003a c2003a = f41873a;
        if (interfaceC2016n.mo1861a(c2003a)) {
            ((Set) ud.m10978d(interfaceC2016n, c2003a)).add(metric);
        } else {
            interfaceC2016n.mo1862b(c2003a, qe.m10857c(metric));
        }
    }

    /* renamed from: d */
    public static final void m15958d(C0645a c0645a, EnumC8611c metric) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        AbstractC4154l.m8923f(metric, "metric");
        C2005c c2005c = c0645a.f4118c;
        C2003a c2003a = f41873a;
        if (c2005c.mo1861a(c2003a)) {
            ((Set) ud.m10978d(c2005c, c2003a)).remove(metric);
        }
    }
}
