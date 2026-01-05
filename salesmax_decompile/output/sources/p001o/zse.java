package p001o;

import p001o.xse;
import p001o.zse;

/* loaded from: classes3.dex */
public final class zse implements xse {

    /* renamed from: a */
    public final vse f57603a;

    /* renamed from: o.zse$a */
    public static final class C18700a implements xse.InterfaceC18242a {

        /* renamed from: a */
        public final n06 f57604a = new n06(m3g.f34705b, new xk7() { // from class: o.yse
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return zse.C18700a.m59819c((vse) obj);
            }
        }, null, 4, null);

        /* renamed from: c */
        public static final xk7 m59819c(vse vseVar) {
            sq8.m48649h(vseVar, "$this$DslBuilderProperty");
            return vseVar.getConfig().mo38264a();
        }

        /* renamed from: b */
        public xse m59820b() {
            return new zse((vse) this.f57604a.m39946o().invoke(), null);
        }

        @Override // p001o.xse.InterfaceC18242a
        /* renamed from: k */
        public void mo20135k(vse vseVar) {
            this.f57604a.m39947p(vseVar);
        }
    }

    public /* synthetic */ zse(vse vseVar, id5 id5Var) {
        this(vseVar);
    }

    @Override // p001o.xse
    /* renamed from: a */
    public vse mo20109a() {
        return this.f57603a;
    }

    public zse(vse vseVar) {
        this.f57603a = vseVar;
    }
}
