package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class po5 {

    /* renamed from: o.po5$a */
    public static final class C16146a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ qo5 f40330a;

        public C16146a(qo5 qo5Var) {
            this.f40330a = qo5Var;
        }

        /* renamed from: a */
        public final void m43961a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f40330a.m45708a().iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m43961a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.po5$b */
    public /* synthetic */ class C16147b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16147b f40331a = new C16147b();

        public C16147b() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m43962b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m43962b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m43960b(jl6 jl6Var, qo5 qo5Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("Features"));
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar2 = new h7f(c12164k, new na9("Image"));
        h7f h7fVar3 = new h7f(aff.C12159f.f14618a, new na9("MaxLabels"));
        h7f h7fVar4 = new h7f(aff.C12158e.f14617a, new na9("MinConfidence"));
        h7f h7fVar5 = new h7f(c12164k, new na9("Settings"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        if (qo5Var.m45708a() != null) {
            l9gVarMo41871h.mo26540c(h7fVar, new C16146a(qo5Var));
        }
        fc8 fc8VarM45709b = qo5Var.m45709b();
        if (fc8VarM45709b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, fc8VarM45709b, C16147b.f40331a);
        }
        Integer numM45710c = qo5Var.m45710c();
        if (numM45710c != null) {
            l9gVarMo41871h.mo26546q(h7fVar3, numM45710c.intValue());
        }
        Float fM45711d = qo5Var.m45711d();
        if (fM45711d != null) {
            l9gVarMo41871h.mo26545p(h7fVar4, fM45711d.floatValue());
        }
        qo5Var.m45712e();
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
