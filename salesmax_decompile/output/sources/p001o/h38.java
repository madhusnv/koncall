package p001o;

import p001o.gjb;

/* loaded from: classes5.dex */
public class h38 implements gjb {

    /* renamed from: b */
    public static final mec f26169b = mec.m38833f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final ihb f26170a;

    /* renamed from: o.h38$a */
    public static class C13845a implements hjb {

        /* renamed from: a */
        public final ihb f26171a = new ihb(500);

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new h38(this.f26171a);
        }
    }

    public h38(ihb ihbVar) {
        this.f26170a = ihbVar;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(ft7 ft7Var, int i, int i2, rec recVar) {
        ihb ihbVar = this.f26170a;
        if (ihbVar != null) {
            ft7 ft7Var2 = (ft7) ihbVar.m32142a(ft7Var, 0, 0);
            if (ft7Var2 == null) {
                this.f26170a.m32143b(ft7Var, 0, 0, ft7Var);
            } else {
                ft7Var = ft7Var2;
            }
        }
        return new gjb.C13758a(ft7Var, new x48(ft7Var, ((Integer) recVar.m46585c(f26169b)).intValue()));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(ft7 ft7Var) {
        return true;
    }
}
