package p001o;

import androidx.lifecycle.InterfaceC2137f;
import androidx.lifecycle.b0;
import java.util.Arrays;
import java.util.Collection;
import p001o.ya4;

/* loaded from: classes2.dex */
public final class ixi {

    /* renamed from: a */
    public static final ixi f29351a = new ixi();

    /* renamed from: o.ixi$a */
    public static final class C14401a implements ya4.InterfaceC18362b {

        /* renamed from: a */
        public static final C14401a f29352a = new C14401a();
    }

    /* renamed from: a */
    public final b0.InterfaceC2131c m32898a(Collection collection) {
        sq8.m48649h(collection, "initializers");
        fxi[] fxiVarArr = (fxi[]) collection.toArray(new fxi[0]);
        return new qi8((fxi[]) Arrays.copyOf(fxiVarArr, fxiVarArr.length));
    }

    /* renamed from: b */
    public final dxi m32899b(ob9 ob9Var, ya4 ya4Var, fxi... fxiVarArr) {
        dxi dxiVar;
        fxi fxiVar;
        xk7 xk7VarM27725b;
        sq8.m48649h(ob9Var, "modelClass");
        sq8.m48649h(ya4Var, "extras");
        sq8.m48649h(fxiVarArr, "initializers");
        int length = fxiVarArr.length;
        int i = 0;
        while (true) {
            dxiVar = null;
            if (i >= length) {
                fxiVar = null;
                break;
            }
            fxiVar = fxiVarArr[i];
            if (sq8.m48644c(fxiVar.m27724a(), ob9Var)) {
                break;
            }
            i++;
        }
        if (fxiVar != null && (xk7VarM27725b = fxiVar.m27725b()) != null) {
            dxiVar = (dxi) xk7VarM27725b.invoke(ya4Var);
        }
        if (dxiVar != null) {
            return dxiVar;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + jxi.m34667a(ob9Var)).toString());
    }

    /* renamed from: c */
    public final ya4 m32900c(lxi lxiVar) {
        sq8.m48649h(lxiVar, "owner");
        return lxiVar instanceof InterfaceC2137f ? ((InterfaceC2137f) lxiVar).getDefaultViewModelCreationExtras() : ya4.C18361a.f55136b;
    }

    /* renamed from: d */
    public final b0.InterfaceC2131c m32901d(lxi lxiVar) {
        sq8.m48649h(lxiVar, "owner");
        return lxiVar instanceof InterfaceC2137f ? ((InterfaceC2137f) lxiVar).getDefaultViewModelProviderFactory() : uj5.f48983b;
    }

    /* renamed from: e */
    public final String m32902e(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "modelClass");
        String strM34667a = jxi.m34667a(ob9Var);
        if (strM34667a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strM34667a;
    }

    /* renamed from: f */
    public final dxi m32903f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
