package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class wo5 {

    /* renamed from: o.wo5$a */
    public /* synthetic */ class C17941a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17941a f52405a = new C17941a();

        public C17941a() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m54751b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m54751b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m54750b(jl6 jl6Var, xo5 xo5Var) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("HumanLoopConfig"));
        h7f h7fVar2 = new h7f(c12164k, new na9("Image"));
        h7f h7fVar3 = new h7f(aff.C12158e.f14617a, new na9("MinConfidence"));
        h7f h7fVar4 = new h7f(aff.C12163j.f14622a, new na9("ProjectVersion"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        xo5Var.m56521a();
        fc8 fc8VarM56522b = xo5Var.m56522b();
        if (fc8VarM56522b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, fc8VarM56522b, C17941a.f52405a);
        }
        Float fM56523c = xo5Var.m56523c();
        if (fM56523c != null) {
            l9gVarMo41871h.mo26545p(h7fVar3, fM56523c.floatValue());
        }
        String strM56524d = xo5Var.m56524d();
        if (strM56524d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM56524d);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
