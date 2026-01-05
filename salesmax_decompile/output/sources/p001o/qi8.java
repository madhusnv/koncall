package p001o;

import androidx.lifecycle.b0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qi8 implements b0.InterfaceC2131c {

    /* renamed from: b */
    public final fxi[] f42030b;

    public qi8(fxi... fxiVarArr) {
        sq8.m48649h(fxiVarArr, "initializers");
        this.f42030b = fxiVarArr;
    }

    @Override // androidx.lifecycle.b0.InterfaceC2131c
    /* renamed from: b */
    public dxi mo6492b(Class cls, ya4 ya4Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(ya4Var, "extras");
        ixi ixiVar = ixi.f29351a;
        ob9 ob9VarM30152c = hb9.m30152c(cls);
        fxi[] fxiVarArr = this.f42030b;
        return ixiVar.m32899b(ob9VarM30152c, ya4Var, (fxi[]) Arrays.copyOf(fxiVarArr, fxiVarArr.length));
    }
}
