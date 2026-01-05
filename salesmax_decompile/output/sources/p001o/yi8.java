package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class yi8 extends ubd {

    /* renamed from: m */
    public final boolean f55554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi8(String str, yn7 yn7Var) {
        super(str, yn7Var, 1);
        sq8.m48649h(str, "name");
        sq8.m48649h(yn7Var, "generatedSerializer");
        this.f55554m = true;
    }

    @Override // p001o.ubd
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi8) {
            uef uefVar = (uef) obj;
            if (sq8.m48644c(mo16766h(), uefVar.mo16766h())) {
                yi8 yi8Var = (yi8) obj;
                if ((yi8Var.isInline() && Arrays.equals(m51341o(), yi8Var.m51341o())) && mo16762d() == uefVar.mo16762d()) {
                    int iMo16762d = mo16762d();
                    for (int i = 0; i < iMo16762d; i++) {
                        if (sq8.m48644c(mo16765g(i).mo16766h(), uefVar.mo16765g(i).mo16766h()) && sq8.m48644c(mo16765g(i).getKind(), uefVar.mo16765g(i).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p001o.ubd
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p001o.ubd, p001o.uef
    public boolean isInline() {
        return this.f55554m;
    }
}
