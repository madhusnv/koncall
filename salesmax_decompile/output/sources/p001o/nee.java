package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nee {

    /* renamed from: o.nee$a */
    public /* synthetic */ class C15558a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C15558a f36756a = new C15558a();

        public C15558a() {
            super(2, cd8.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
        }

        /* renamed from: b */
        public final void m40429b(tff tffVar, fc8 fc8Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(fc8Var, "p1");
            cd8.m20959a(tffVar, fc8Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m40429b((tff) obj, (fc8) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m40428b(jl6 jl6Var, oee oeeVar) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("Image"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        fc8 fc8VarM42140a = oeeVar.m42140a();
        if (fc8VarM42140a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, fc8VarM42140a, C15558a.f36756a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
