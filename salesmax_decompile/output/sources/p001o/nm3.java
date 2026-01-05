package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nm3 {

    /* renamed from: o.nm3$a */
    public static final class C15612a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ mm3 f37032a;

        /* renamed from: o.nm3$a$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f37033a = new a();

            public a() {
                super(2, pm3.class, "serializeCompletedPartDocument", "serializeCompletedPartDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/s3/model/CompletedPart;)V", 1);
            }

            /* renamed from: b */
            public final void m40784b(tff tffVar, om3 om3Var) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(om3Var, "p1");
                pm3.m43868a(tffVar, om3Var);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m40784b((tff) obj, (om3) obj2);
                return y3i.f54824a;
            }
        }

        public C15612a(mm3 mm3Var) {
            this.f37032a = mm3Var;
        }

        /* renamed from: a */
        public final void m40783a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f37032a.m39342a().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((om3) it.next(), a.f37033a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m40783a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final byte[] m40782a(mm3 mm3Var) {
        sq8.m48649h(mm3Var, "input");
        oej oejVar = new oej(null, 1, null);
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new mej("Part"), m27.f34665a);
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49542e(new mej("CompleteMultipartUpload"));
        c17016a.m49542e(new kej("http://s3.amazonaws.com/doc/2006-03-01/", null, 2, null));
        c17016a.m49539b(h7fVar);
        l9g l9gVarMo41871h = oejVar.mo41871h(c17016a.m49538a());
        if (mm3Var.m39342a() != null) {
            l9gVarMo41871h.mo26540c(h7fVar, new C15612a(mm3Var));
        }
        l9gVarMo41871h.mo26543j();
        return oejVar.mo41870a();
    }
}
