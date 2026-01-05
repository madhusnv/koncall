package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fwh {

    /* renamed from: o.fwh$a */
    public /* synthetic */ class C13584a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13584a f24205a = new C13584a();

        public C13584a() {
            super(2, lwh.class, "serializeTranslationSettingsDocument", "serializeTranslationSettingsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/TranslationSettings;)V", 1);
        }

        /* renamed from: b */
        public final void m27662b(tff tffVar, jwh jwhVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(jwhVar, "p1");
            lwh.m38079a(tffVar, jwhVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m27662b((tff) obj, (jwh) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fwh$b */
    public static final class C13585b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ gwh f24206a;

        public C13585b(gwh gwhVar) {
            this.f24206a = gwhVar;
        }

        /* renamed from: a */
        public final void m27663a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f24206a.m29611d().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d((String) it.next());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27663a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m27661b(jl6 jl6Var, gwh gwhVar) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("Settings"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("SourceLanguageCode"));
        h7f h7fVar3 = new h7f(c12163j, new na9("TargetLanguageCode"));
        h7f h7fVar4 = new h7f(aff.C12160g.f14619a, new na9("TerminologyNames"));
        h7f h7fVar5 = new h7f(c12163j, new na9("Text"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        jwh jwhVarM29608a = gwhVar.m29608a();
        if (jwhVarM29608a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, jwhVarM29608a, C13584a.f24205a);
        }
        String strM29609b = gwhVar.m29609b();
        if (strM29609b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM29609b);
        }
        String strM29610c = gwhVar.m29610c();
        if (strM29610c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM29610c);
        }
        if (gwhVar.m29611d() != null) {
            l9gVarMo41871h.mo26540c(h7fVar4, new C13585b(gwhVar));
        }
        String strM29612e = gwhVar.m29612e();
        if (strM29612e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM29612e);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
