package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class kk3 {

    /* renamed from: o.kk3$a */
    public /* synthetic */ class C14851a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C14851a f32323a = new C14851a();

        public C14851a() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m35798b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m35798b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.kk3$b */
    public /* synthetic */ class C14852b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C14852b f32324a = new C14852b();

        public C14852b() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m35799b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m35799b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m35797b(jl6 jl6Var, lk3 lk3Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12157d.f14616a, new na9("QualityFilter"));
        h7f h7fVar2 = new h7f(aff.C12158e.f14617a, new na9("SimilarityThreshold"));
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar3 = new h7f(c12164k, new na9("SourceImage"));
        h7f h7fVar4 = new h7f(c12164k, new na9("TargetImage"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        lk3Var.m37354a();
        Float fM37355b = lk3Var.m37355b();
        if (fM37355b != null) {
            l9gVarMo41871h.mo26545p(h7fVar2, fM37355b.floatValue());
        }
        fc8 fc8VarM37356c = lk3Var.m37356c();
        if (fc8VarM37356c != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar3, fc8VarM37356c, C14851a.f32323a);
        }
        fc8 fc8VarM37357d = lk3Var.m37357d();
        if (fc8VarM37357d != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar4, fc8VarM37357d, C14852b.f32324a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
