package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pc0 {

    /* renamed from: o.pc0$a */
    public /* synthetic */ class C16048a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16048a f39784a = new C16048a();

        public C16048a() {
            super(2, yv5.class, "serializeDocumentDocument", "serializeDocumentDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/Document;)V", 1);
        }

        /* renamed from: b */
        public final void m43324b(tff tffVar, tv5 tv5Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(tv5Var, "p1");
            yv5.m58354a(tffVar, tv5Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m43324b((tff) obj, (tv5) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pc0$b */
    public static final class C16049b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ qc0 f39785a;

        public C16049b(qc0 qc0Var) {
            this.f39785a = qc0Var;
        }

        /* renamed from: a */
        public final void m43325a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f39785a.m45072c().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d(((pt6) it.next()).mo44139a());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m43325a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m43323b(jl6 jl6Var, qc0 qc0Var) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AdaptersConfig"));
        h7f h7fVar2 = new h7f(c12164k, new na9("Document"));
        h7f h7fVar3 = new h7f(aff.C12160g.f14619a, new na9("FeatureTypes"));
        h7f h7fVar4 = new h7f(c12164k, new na9("HumanLoopConfig"));
        h7f h7fVar5 = new h7f(c12164k, new na9("QueriesConfig"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        qc0Var.m45070a();
        tv5 tv5VarM45071b = qc0Var.m45071b();
        if (tv5VarM45071b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, tv5VarM45071b, C16048a.f39784a);
        }
        if (qc0Var.m45072c() != null) {
            l9gVarMo41871h.mo26540c(h7fVar3, new C16049b(qc0Var));
        }
        qc0Var.m45073d();
        qc0Var.m45074e();
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
