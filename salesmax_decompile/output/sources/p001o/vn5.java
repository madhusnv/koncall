package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class vn5 {

    /* renamed from: o.vn5$a */
    public static final class C17619a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ wn5 f50575a;

        public C17619a(wn5 wn5Var) {
            this.f50575a = wn5Var;
        }

        /* renamed from: a */
        public final void m53036a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f50575a.m54722a().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d(((ix0) it.next()).mo32876a());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m53036a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vn5$b */
    public /* synthetic */ class C17620b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17620b f50576a = new C17620b();

        public C17620b() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m53037b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m53037b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m53035b(jl6 jl6Var, wn5 wn5Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("Attributes"));
        h7f h7fVar2 = new h7f(aff.C12164k.f14623a, new na9("Image"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        if (wn5Var.m54722a() != null) {
            l9gVarMo41871h.mo26540c(h7fVar, new C17619a(wn5Var));
        }
        fc8 fc8VarM54723b = wn5Var.m54723b();
        if (fc8VarM54723b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, fc8VarM54723b, C17620b.f50576a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
