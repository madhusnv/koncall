package p001o;

import java.util.Map;
import org.apache.http.HttpStatus;
import p001o.ese;

/* loaded from: classes2.dex */
public class m81 extends l3g {

    /* renamed from: d */
    public static final C15246a f34943d = new C15246a(null);

    /* renamed from: e */
    public static final m81 f34944e = new m81();

    /* renamed from: f */
    public static final Map f34945f;

    /* renamed from: g */
    public static final Map f34946g;

    /* renamed from: o.m81$a */
    public static final class C15246a {
        public C15246a() {
        }

        public /* synthetic */ C15246a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final m81 m38527a() {
            return m81.f34944e;
        }
    }

    static {
        fse fseVar = fse.Throttling;
        hwc hwcVarM53620a = vyh.m53620a("BandwidthLimitExceeded", fseVar);
        hwc hwcVarM53620a2 = vyh.m53620a("EC2ThrottledException", fseVar);
        fse fseVar2 = fse.Transient;
        f34945f = isa.m32684k(hwcVarM53620a, hwcVarM53620a2, vyh.m53620a("IDPCommunicationError", fseVar2), vyh.m53620a("LimitExceededException", fseVar), vyh.m53620a("PriorRequestNotComplete", fseVar), vyh.m53620a("ProvisionedThroughputExceededException", fseVar), vyh.m53620a("RequestLimitExceeded", fseVar), vyh.m53620a("RequestThrottled", fseVar), vyh.m53620a("RequestThrottledException", fseVar), vyh.m53620a("RequestTimeout", fseVar2), vyh.m53620a("RequestTimeoutException", fseVar2), vyh.m53620a("SlowDown", fseVar), vyh.m53620a("ThrottledException", fseVar), vyh.m53620a("Throttling", fseVar), vyh.m53620a("ThrottlingException", fseVar), vyh.m53620a("TooManyRequestsException", fseVar), vyh.m53620a("TransactionInProgressException", fseVar));
        f34946g = isa.m32684k(vyh.m53620a(500, fseVar2), vyh.m53620a(502, fseVar2), vyh.m53620a(503, fseVar2), vyh.m53620a(Integer.valueOf(HttpStatus.SC_GATEWAY_TIMEOUT), fseVar2));
    }

    /* renamed from: h */
    private final ese m38524h(hgf hgfVar) {
        ggf ggfVarMo34658a = hgfVar.mo34658a();
        fse fseVar = (fse) f34945f.get(ggfVarMo34658a.m28584k());
        if (fseVar == null) {
            fseVar = (fse) f34946g.get(m38526k(ggfVarMo34658a));
        }
        if (fseVar != null) {
            return new ese.C13254a(fseVar);
        }
        return null;
    }

    @Override // p001o.l3g
    /* renamed from: i */
    public ese mo36541i(Throwable th) {
        sq8.m48649h(th, "ex");
        if (th instanceof hgf) {
            return m38524h((hgf) th);
        }
        return null;
    }

    /* renamed from: k */
    public final Integer m38526k(ggf ggfVar) {
        s48 status;
        d2e d2eVarM28587n = ggfVar.m28587n();
        g48 g48Var = d2eVarM28587n instanceof g48 ? (g48) d2eVarM28587n : null;
        if (g48Var == null || (status = g48Var.getStatus()) == null) {
            return null;
        }
        return Integer.valueOf(status.h0());
    }
}
