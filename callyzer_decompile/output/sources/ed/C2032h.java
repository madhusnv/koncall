package ed;

import ac.C0088a;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import e1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import mx.C4914j;
import qw.C6363m;
import qw.C6364n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ed.h */
/* loaded from: classes.dex */
public class C2032h implements InterfaceC2031g {

    /* renamed from: b */
    public static final C2032h f9587b = new C2032h();

    /* renamed from: a */
    public final C4914j f9588a;

    public C2032h() {
        int i10 = 0;
        int i11 = 1;
        this.f9588a = new C4914j(3, new C2025a[]{new C2025a(a0.m8901a(Throwable.class), new C0088a(1, this, C2032h.class, "evaluateSpecificExceptions", "evaluateSpecificExceptions(Ljava/lang/Throwable;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0, 18)), new C2025a(a0.m8901a(ServiceException.class), new C0088a(i11, this, C2032h.class, "evaluateServiceException", "evaluateServiceException(Laws/smithy/kotlin/runtime/ServiceException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i10, 19)), new C2025a(a0.m8901a(ClientException.class), new C0088a(i11, this, C2032h.class, "evaluateClientException", "evaluateClientException(Laws/smithy/kotlin/runtime/ClientException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i10, 20)), new C2025a(a0.m8901a(SdkBaseException.class), new C0088a(i11, this, C2032h.class, "evaluateBaseException", "evaluateBaseException(Laws/smithy/kotlin/runtime/SdkBaseException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i10, 21))});
    }

    /* renamed from: a */
    public AbstractC2029e mo5751a(Throwable ex2) {
        AbstractC4154l.m8923f(ex2, "ex");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ed.InterfaceC2031g
    public final AbstractC2029e evaluate(Object obj) {
        AbstractC2029e abstractC2029e;
        if (!(obj instanceof C6363m)) {
            return C2028d.f9586a;
        }
        Throwable thM12363a = C6364n.m12363a(obj);
        AbstractC4154l.m8920c(thM12363a);
        x0 x0VarM8925h = AbstractC4154l.m8925h((Object[]) this.f9588a.f24454b);
        do {
            abstractC2029e = null;
            if (!x0VarM8925h.hasNext()) {
                break;
            }
            C2025a c2025a = (C2025a) x0VarM8925h.next();
            c2025a.getClass();
            Throwable th2 = c2025a.f9582a.m8915d(thM12363a) ? thM12363a : null;
            if (th2 != null) {
                abstractC2029e = (AbstractC2029e) c2025a.f9583b.invoke(th2);
            }
        } while (abstractC2029e == null);
        return abstractC2029e == null ? C2027c.f9585a : abstractC2029e;
    }
}
