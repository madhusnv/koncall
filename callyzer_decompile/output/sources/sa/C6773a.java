package sa;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import ed.AbstractC2029e;
import ed.C2026b;
import ed.C2032h;
import ed.EnumC2030f;
import jc.h0;
import kotlin.jvm.internal.AbstractC4154l;
import qb.C6153b;
import qb.InterfaceC6154c;
import qw.C6361k;
import rw.AbstractC6674x;
import uc.C7394a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sa.a */
/* loaded from: classes.dex */
public final class C6773a extends C2032h {

    /* renamed from: c */
    public static final C6773a f32230c = new C6773a();

    /* renamed from: d */
    public static final Object f32231d;

    /* renamed from: e */
    public static final Object f32232e;

    static {
        EnumC2030f enumC2030f = EnumC2030f.Throttling;
        C6361k c6361k = new C6361k("BandwidthLimitExceeded", enumC2030f);
        C6361k c6361k2 = new C6361k("EC2ThrottledException", enumC2030f);
        EnumC2030f enumC2030f2 = EnumC2030f.Transient;
        f32231d = AbstractC6674x.m12778f(c6361k, c6361k2, new C6361k("IDPCommunicationError", enumC2030f2), new C6361k("LimitExceededException", enumC2030f), new C6361k("PriorRequestNotComplete", enumC2030f), new C6361k("ProvisionedThroughputExceededException", enumC2030f), new C6361k("RequestLimitExceeded", enumC2030f), new C6361k("RequestThrottled", enumC2030f), new C6361k("RequestThrottledException", enumC2030f), new C6361k("RequestTimeout", enumC2030f2), new C6361k("RequestTimeoutException", enumC2030f2), new C6361k("SlowDown", enumC2030f), new C6361k("ThrottledException", enumC2030f), new C6361k("Throttling", enumC2030f), new C6361k("ThrottlingException", enumC2030f), new C6361k("TooManyRequestsException", enumC2030f), new C6361k("TransactionInProgressException", enumC2030f));
        f32232e = AbstractC6674x.m12778f(new C6361k(500, enumC2030f2), new C6361k(502, enumC2030f2), new C6361k(503, enumC2030f2), new C6361k(504, enumC2030f2));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // ed.C2032h
    /* renamed from: a */
    public final AbstractC2029e mo5751a(Throwable ex2) {
        h0 h0Var;
        AbstractC4154l.m8923f(ex2, "ex");
        if (ex2 instanceof ServiceException) {
            C0489b c0489bMo1480b = ((ServiceException) ex2).mo1480b();
            EnumC2030f enumC2030f = (EnumC2030f) f32231d.get((String) c0489bMo1480b.f3503a.mo1864e(C0489b.f3504e));
            if (enumC2030f == null) {
                Object obj = (InterfaceC6154c) c0489bMo1480b.f3503a.mo1864e(C0489b.f3507h);
                if (obj == null) {
                    obj = C6153b.f29997a;
                }
                C7394a c7394a = obj instanceof C7394a ? (C7394a) obj : null;
                enumC2030f = (EnumC2030f) f32232e.get((c7394a == null || (h0Var = c7394a.f35158a) == null) ? null : Integer.valueOf(h0Var.f19575a));
            }
            if (enumC2030f != null) {
                return new C2026b(enumC2030f);
            }
        }
        return null;
    }
}
