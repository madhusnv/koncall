package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class zhg {

    /* renamed from: o.zhg$a */
    public static final class C18646a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ aig f57229a;

        public C18646a(aig aigVar) {
            this.f57229a = aigVar;
        }

        /* renamed from: a */
        public final void m59465a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f57229a.m17167c().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d((String) it.next());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m59465a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.zhg$b */
    public static final class C18647b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ aig f57230a;

        public C18647b(aig aigVar) {
            this.f57230a = aigVar;
        }

        /* renamed from: a */
        public final void m59466a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f57230a.m17170f().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d(((k0g) it.next()).mo34846a());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m59466a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m59464b(jl6 jl6Var, aig aigVar) {
        oa9 oa9Var = new oa9();
        aff.C12157d c12157d = aff.C12157d.f14616a;
        h7f h7fVar = new h7f(c12157d, new na9("Engine"));
        h7f h7fVar2 = new h7f(c12157d, new na9("LanguageCode"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar3 = new h7f(c12160g, new na9("LexiconNames"));
        h7f h7fVar4 = new h7f(c12157d, new na9("OutputFormat"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar5 = new h7f(c12163j, new na9("SampleRate"));
        h7f h7fVar6 = new h7f(c12160g, new na9("SpeechMarkTypes"));
        h7f h7fVar7 = new h7f(c12163j, new na9("Text"));
        h7f h7fVar8 = new h7f(c12157d, new na9("TextType"));
        h7f h7fVar9 = new h7f(c12157d, new na9("VoiceId"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        c17016a.m49539b(h7fVar8);
        c17016a.m49539b(h7fVar9);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        xf6 xf6VarM17165a = aigVar.m17165a();
        if (xf6VarM17165a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, xf6VarM17165a.mo56209a());
        }
        tg9 tg9VarM17166b = aigVar.m17166b();
        if (tg9VarM17166b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, tg9VarM17166b.mo49828a());
        }
        if (aigVar.m17167c() != null) {
            l9gVarMo41871h.mo26540c(h7fVar3, new C18646a(aigVar));
        }
        jgc jgcVarM17168d = aigVar.m17168d();
        if (jgcVarM17168d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, jgcVarM17168d.mo33800a());
        }
        String strM17169e = aigVar.m17169e();
        if (strM17169e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM17169e);
        }
        if (aigVar.m17170f() != null) {
            l9gVarMo41871h.mo26540c(h7fVar6, new C18647b(aigVar));
        }
        String strM17171g = aigVar.m17171g();
        if (strM17171g != null) {
            l9gVarMo41871h.mo26541g(h7fVar7, strM17171g);
        }
        yih yihVarM17172h = aigVar.m17172h();
        if (yihVarM17172h != null) {
            l9gVarMo41871h.mo26541g(h7fVar8, yihVarM17172h.mo57856a());
        }
        l2j l2jVarM17173i = aigVar.m17173i();
        if (l2jVarM17173i != null) {
            l9gVarMo41871h.mo26541g(h7fVar9, l2jVarM17173i.mo36461a());
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
