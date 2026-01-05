package p001o;

import p001o.gjb;

/* loaded from: classes.dex */
public class md8 implements gjb {

    /* renamed from: a */
    public final ihb f35202a;

    /* renamed from: o.md8$a */
    public static class C15283a implements hjb {

        /* renamed from: a */
        public final ihb f35203a = new ihb(500);

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new md8(this.f35203a);
        }
    }

    public md8(ihb ihbVar) {
        this.f35202a = ihbVar;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(od8 od8Var, int i, int i2, rec recVar) {
        od8 od8Var2;
        ihb ihbVar = this.f35202a;
        if (ihbVar == null) {
            od8Var2 = od8Var;
        } else {
            od8Var2 = (od8) ihbVar.m32142a(od8Var, 0, 0);
            if (od8Var2 == null) {
                this.f35202a.m32143b(od8Var, 0, 0, od8Var);
                od8Var2 = od8Var;
            }
        }
        return new gjb.C13758a(new l6c(od8Var), new hd8(od8Var2));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(od8 od8Var) {
        return true;
    }
}
