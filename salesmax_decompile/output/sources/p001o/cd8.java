package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class cd8 {

    /* renamed from: o.cd8$a */
    public /* synthetic */ class C12644a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12644a f17945a = new C12644a();

        public C12644a() {
            super(2, txe.class, "serializeS3ObjectDocument", "serializeS3ObjectDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/S3Object;)V", 1);
        }

        /* renamed from: b */
        public final void m20960b(tff tffVar, rxe rxeVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(rxeVar, "p1");
            txe.m50747a(tffVar, rxeVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m20960b((tff) obj, (rxe) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final void m20959a(tff tffVar, fc8 fc8Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(fc8Var, "input");
        h7f h7fVar = new h7f(aff.C12154a.f14613a, new na9("Bytes"));
        h7f h7fVar2 = new h7f(aff.C12164k.f14623a, new na9("S3Object"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        byte[] bArrM26443a = fc8Var.m26443a();
        if (bArrM26443a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, cb1.m20635c(bArrM26443a));
        }
        rxe rxeVarM26444b = fc8Var.m26444b();
        if (rxeVarM26444b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, rxeVarM26444b, C12644a.f17945a);
        }
        l9gVarMo41871h.mo26543j();
    }
}
