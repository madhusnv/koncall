package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class b9f {

    /* renamed from: o.b9f$a */
    public /* synthetic */ class C12333a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12333a f15809a = new C12333a();

        public C12333a() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m18465b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18465b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m18464b(jl6 jl6Var, c9f c9fVar) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("CollectionId"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("FaceMatchThreshold"));
        h7f h7fVar3 = new h7f(aff.C12164k.f14623a, new na9("Image"));
        h7f h7fVar4 = new h7f(aff.C12159f.f14618a, new na9("MaxFaces"));
        h7f h7fVar5 = new h7f(aff.C12157d.f14616a, new na9("QualityFilter"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM20514a = c9fVar.m20514a();
        if (strM20514a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM20514a);
        }
        Float fM20515b = c9fVar.m20515b();
        if (fM20515b != null) {
            l9gVarMo41871h.mo26545p(h7fVar2, fM20515b.floatValue());
        }
        fc8 fc8VarM20516c = c9fVar.m20516c();
        if (fc8VarM20516c != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar3, fc8VarM20516c, C12333a.f15809a);
        }
        Integer numM20517d = c9fVar.m20517d();
        if (numM20517d != null) {
            l9gVarMo41871h.mo26546q(h7fVar4, numM20517d.intValue());
        }
        c9fVar.m20518e();
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
