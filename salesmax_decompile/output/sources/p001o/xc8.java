package p001o;

import p001o.cd2;
import p001o.d72;

/* loaded from: classes2.dex */
public final class xc8 extends o52 {

    /* renamed from: c */
    public static final xc8 f53499c = new xc8(new zc8());

    /* renamed from: b */
    public final zc8 f53500b;

    public xc8(zc8 zc8Var) {
        this.f53500b = zc8Var;
    }

    @Override // p001o.o52, p001o.cd2.InterfaceC12639b
    /* renamed from: a */
    public void mo20914a(c9i c9iVar, cd2.C12638a c12638a) {
        super.mo20914a(c9iVar, c12638a);
        if (!(c9iVar instanceof tc8)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        tc8 tc8Var = (tc8) c9iVar;
        d72.C12801a c12801a = new d72.C12801a();
        if (tc8Var.e0()) {
            this.f53500b.m59182a(tc8Var.m49703X(), c12801a);
        }
        c12638a.m20898e(c12801a.m22392c());
    }
}
