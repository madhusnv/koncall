package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class gr0 {

    /* renamed from: o.gr0$a */
    public static final class C13809a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ kr0 f25672a;

        /* renamed from: o.gr0$a$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f25673a = new a();

            public a() {
                super(2, yig.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/Tag;)V", 1);
            }

            /* renamed from: b */
            public final void m29335b(tff tffVar, vig vigVar) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(vigVar, "p1");
                yig.m57855a(tffVar, vigVar);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m29335b((tff) obj, (vig) obj2);
                return y3i.f54824a;
            }
        }

        public C13809a(kr0 kr0Var) {
            this.f25672a = kr0Var;
        }

        /* renamed from: a */
        public final void m29334a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f25672a.m36065j().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((vig) it.next(), a.f25673a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m29334a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gr0$b */
    public static final class C13810b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ kr0 f25674a;

        public C13810b(kr0 kr0Var) {
            this.f25674a = kr0Var;
        }

        /* renamed from: a */
        public final void m29336a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f25674a.m36067l().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d((String) it.next());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m29336a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gr0$c */
    public static final class C13811c implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ kr0 f25675a;

        /* renamed from: o.gr0$c$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f25676a = new a();

            public a() {
                super(2, gdd.class, "serializePolicyDescriptorTypeDocument", "serializePolicyDescriptorTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PolicyDescriptorType;)V", 1);
            }

            /* renamed from: b */
            public final void m29338b(tff tffVar, fdd fddVar) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(fddVar, "p1");
                gdd.m28503a(tffVar, fddVar);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m29338b((tff) obj, (fdd) obj2);
                return y3i.f54824a;
            }
        }

        public C13811c(kr0 kr0Var) {
            this.f25675a = kr0Var;
        }

        /* renamed from: a */
        public final void m29337a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f25675a.m36059d().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((fdd) it.next(), a.f25676a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m29337a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gr0$d */
    public static final class C13812d implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ kr0 f25677a;

        /* renamed from: o.gr0$d$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f25678a = new a();

            public a() {
                super(2, j2e.class, "serializeProvidedContextDocument", "serializeProvidedContextDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ProvidedContext;)V", 1);
            }

            /* renamed from: b */
            public final void m29340b(tff tffVar, i2e i2eVar) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(i2eVar, "p1");
                j2e.m33150a(tffVar, i2eVar);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                tq.m50332a(obj2);
                m29340b((tff) obj, null);
                return y3i.f54824a;
            }
        }

        public C13812d(kr0 kr0Var) {
            this.f25677a = kr0Var;
        }

        /* renamed from: a */
        public final void m29339a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f25677a.m36060e().iterator();
            while (it.hasNext()) {
                tq.m50332a(it.next());
                gfaVar.mo21109e(d8f.m22608a(null, a.f25678a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m29339a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m29333b(jl6 jl6Var, kr0 kr0Var) {
        kr0 kr0Var2;
        tff tffVarM59334a = ze7.m59334a();
        h7f h7fVar = new h7f(aff.C12159f.f14618a, new ue7("DurationSeconds"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new ue7("ExternalId"));
        h7f h7fVar3 = new h7f(c12163j, new ue7("Policy"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar4 = new h7f(c12160g, new ue7("PolicyArns"));
        h7f h7fVar5 = new h7f(c12160g, new ue7("ProvidedContexts"));
        h7f h7fVar6 = new h7f(c12163j, new ue7("RoleArn"));
        h7f h7fVar7 = new h7f(c12163j, new ue7("RoleSessionName"));
        h7f h7fVar8 = new h7f(c12163j, new ue7("SerialNumber"));
        h7f h7fVar9 = new h7f(c12163j, new ue7("SourceIdentity"));
        h7f h7fVar10 = new h7f(c12160g, new ue7("Tags"));
        h7f h7fVar11 = new h7f(c12163j, new ue7("TokenCode"));
        h7f h7fVar12 = new h7f(c12160g, new ue7("TransitiveTagKeys"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49542e(new ue7("AssumeRoleRequest"));
        c17016a.m49542e(new b5e(JsonDocumentFields.ACTION, "AssumeRole"));
        c17016a.m49542e(new b5e(JsonDocumentFields.VERSION, "2011-06-15"));
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        c17016a.m49539b(h7fVar8);
        c17016a.m49539b(h7fVar9);
        c17016a.m49539b(h7fVar10);
        c17016a.m49539b(h7fVar11);
        c17016a.m49539b(h7fVar12);
        l9g l9gVarMo41871h = tffVarM59334a.mo41871h(c17016a.m49538a());
        Integer numM36056a = kr0Var.m36056a();
        if (numM36056a != null) {
            l9gVarMo41871h.mo26546q(h7fVar, numM36056a.intValue());
        }
        String strM36057b = kr0Var.m36057b();
        if (strM36057b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM36057b);
        }
        String strM36058c = kr0Var.m36058c();
        if (strM36058c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM36058c);
        }
        if (kr0Var.m36059d() != null) {
            kr0Var2 = kr0Var;
            l9gVarMo41871h.mo26540c(h7fVar4, new C13811c(kr0Var2));
        } else {
            kr0Var2 = kr0Var;
        }
        if (kr0Var.m36060e() != null) {
            l9gVarMo41871h.mo26540c(h7fVar5, new C13812d(kr0Var2));
        }
        String strM36061f = kr0Var.m36061f();
        if (strM36061f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM36061f);
        }
        String strM36062g = kr0Var.m36062g();
        if (strM36062g != null) {
            l9gVarMo41871h.mo26541g(h7fVar7, strM36062g);
        }
        String strM36063h = kr0Var.m36063h();
        if (strM36063h != null) {
            l9gVarMo41871h.mo26541g(h7fVar8, strM36063h);
        }
        String strM36064i = kr0Var.m36064i();
        if (strM36064i != null) {
            l9gVarMo41871h.mo26541g(h7fVar9, strM36064i);
        }
        if (kr0Var.m36065j() != null) {
            l9gVarMo41871h.mo26540c(h7fVar10, new C13809a(kr0Var2));
        }
        String strM36066k = kr0Var.m36066k();
        if (strM36066k != null) {
            l9gVarMo41871h.mo26541g(h7fVar11, strM36066k);
        }
        if (kr0Var.m36067l() != null) {
            l9gVarMo41871h.mo26540c(h7fVar12, new C13810b(kr0Var2));
        }
        l9gVarMo41871h.mo26543j();
        return tffVarM59334a.mo41870a();
    }
}
