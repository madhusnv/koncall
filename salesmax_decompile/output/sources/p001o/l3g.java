package p001o;

import java.util.Iterator;
import p001o.ese;
import p001o.hgf;
import p001o.wj6;

/* loaded from: classes3.dex */
public class l3g implements tse {

    /* renamed from: b */
    public static final C14990a f33232b = new C14990a(null);

    /* renamed from: c */
    public static final l3g f33233c = new l3g();

    /* renamed from: a */
    public final ief f33234a;

    /* renamed from: o.l3g$a */
    public static final class C14990a {
        public C14990a() {
        }

        public /* synthetic */ C14990a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final l3g m36542a() {
            return l3g.f33233c;
        }
    }

    /* renamed from: o.l3g$b */
    public /* synthetic */ class C14991b extends dm7 implements xk7 {
        public C14991b(Object obj) {
            super(1, obj, l3g.class, "evaluateSpecificExceptions", "evaluateSpecificExceptions(Ljava/lang/Throwable;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ese invoke(Throwable th) {
            sq8.m48649h(th, "p0");
            return ((l3g) this.receiver).mo36541i(th);
        }
    }

    /* renamed from: o.l3g$c */
    public /* synthetic */ class C14992c extends dm7 implements xk7 {
        public C14992c(Object obj) {
            super(1, obj, l3g.class, "evaluateServiceException", "evaluateServiceException(Laws/smithy/kotlin/runtime/ServiceException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ese invoke(hgf hgfVar) {
            sq8.m48649h(hgfVar, "p0");
            return ((l3g) this.receiver).m36540h(hgfVar);
        }
    }

    /* renamed from: o.l3g$d */
    public /* synthetic */ class C14993d extends dm7 implements xk7 {
        public C14993d(Object obj) {
            super(1, obj, l3g.class, "evaluateClientException", "evaluateClientException(Laws/smithy/kotlin/runtime/ClientException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ese invoke(xa3 xa3Var) {
            sq8.m48649h(xa3Var, "p0");
            return ((l3g) this.receiver).m36539g(xa3Var);
        }
    }

    /* renamed from: o.l3g$e */
    public /* synthetic */ class C14994e extends dm7 implements xk7 {
        public C14994e(Object obj) {
            super(1, obj, l3g.class, "evaluateBaseException", "evaluateBaseException(Laws/smithy/kotlin/runtime/SdkBaseException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ese invoke(s6f s6fVar) {
            sq8.m48649h(s6fVar, "p0");
            return ((l3g) this.receiver).m36538f(s6fVar);
        }
    }

    public l3g() {
        wj6.C17921a c17921a = wj6.f52226c;
        this.f33234a = oef.m42149h(new wj6(kge.m35689b(Throwable.class), new C14991b(this)), new wj6(kge.m35689b(hgf.class), new C14992c(this)), new wj6(kge.m35689b(xa3.class), new C14993d(this)), new wj6(kge.m35689b(s6f.class), new C14994e(this)));
    }

    /* renamed from: e */
    public final ese m36537e(Throwable th) {
        ese eseVarM54621a;
        Iterator it = this.f33234a.iterator();
        while (true) {
            if (!it.hasNext()) {
                eseVarM54621a = null;
                break;
            }
            eseVarM54621a = ((wj6) it.next()).m54621a(th);
            if (eseVarM54621a != null) {
                break;
            }
        }
        return eseVarM54621a == null ? ese.C13255b.f22117a : eseVarM54621a;
    }

    @Override // p001o.tse
    public ese evaluate(Object obj) {
        if (vre.m53357h(obj)) {
            return ese.C13256c.f22118a;
        }
        Throwable thM53354e = vre.m53354e(obj);
        sq8.m48646e(thM53354e);
        return m36537e(thM53354e);
    }

    /* renamed from: f */
    public final ese m36538f(s6f s6fVar) {
        kj6 kj6VarMo30426c = s6fVar.mo30426c();
        if (kj6VarMo30426c.m35774e()) {
            return new ese.C13254a(fse.Throttling);
        }
        if (kj6VarMo30426c.m35773d()) {
            return new ese.C13254a(fse.Transient);
        }
        return null;
    }

    /* renamed from: g */
    public final ese m36539g(xa3 xa3Var) {
        if (xa3Var.mo30426c().m35773d()) {
            return new ese.C13254a(fse.ClientSide);
        }
        return null;
    }

    /* renamed from: h */
    public final ese m36540h(hgf hgfVar) {
        ggf ggfVarMo30426c = hgfVar.mo34658a();
        if (ggfVarMo30426c.m35773d() && ggfVarMo30426c.m28586m() == hgf.EnumC13938a.Server) {
            return new ese.C13254a(fse.ServerSide);
        }
        if (ggfVarMo30426c.m35773d() && ggfVarMo30426c.m28586m() == hgf.EnumC13938a.Client) {
            return new ese.C13254a(fse.ClientSide);
        }
        return null;
    }

    /* renamed from: i */
    public ese mo36541i(Throwable th) {
        sq8.m48649h(th, "ex");
        return null;
    }
}
