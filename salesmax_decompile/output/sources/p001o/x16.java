package p001o;

/* loaded from: classes2.dex */
public final class x16 extends g2e {

    /* renamed from: b */
    public final pxf f53056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x16(pxf pxfVar, uk7 uk7Var) {
        super(uk7Var);
        sq8.m48649h(pxfVar, "policy");
        sq8.m48649h(uk7Var, "defaultFactory");
        this.f53056b = pxfVar;
    }

    @Override // p001o.ip3
    /* renamed from: b */
    public p4g mo32530b(Object obj, un3 un3Var, int i) {
        un3Var.mo27207i(-84026900);
        if (go3.m29189I()) {
            go3.m29200T(-84026900, i, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        un3Var.mo27207i(-492369756);
        Object objMo27208j = un3Var.mo27208j();
        if (objMo27208j == un3.f49155a.m51802a()) {
            objMo27208j = qxf.m45953d(obj, this.f53056b);
            un3Var.mo27204f(objMo27208j);
        }
        un3Var.mo27214p();
        bqb bqbVar = (bqb) objMo27208j;
        bqbVar.setValue(obj);
        if (go3.m29189I()) {
            go3.m29199S();
        }
        un3Var.mo27214p();
        return bqbVar;
    }
}
