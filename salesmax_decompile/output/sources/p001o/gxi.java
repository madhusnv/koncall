package p001o;

import androidx.lifecycle.b0;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.ixi;

/* loaded from: classes2.dex */
public final class gxi {

    /* renamed from: a */
    public final kxi f25928a;

    /* renamed from: b */
    public final b0.InterfaceC2131c f25929b;

    /* renamed from: c */
    public final ya4 f25930c;

    public gxi(kxi kxiVar, b0.InterfaceC2131c interfaceC2131c, ya4 ya4Var) {
        sq8.m48649h(kxiVar, "store");
        sq8.m48649h(interfaceC2131c, "factory");
        sq8.m48649h(ya4Var, "extras");
        this.f25928a = kxiVar;
        this.f25929b = interfaceC2131c;
        this.f25930c = ya4Var;
    }

    /* renamed from: b */
    public static /* synthetic */ dxi m29634b(gxi gxiVar, ob9 ob9Var, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ixi.f29351a.m32902e(ob9Var);
        }
        return gxiVar.m29635a(ob9Var, str);
    }

    /* renamed from: a */
    public final dxi m29635a(ob9 ob9Var, String str) {
        sq8.m48649h(ob9Var, "modelClass");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        dxi dxiVarM36300b = this.f25928a.m36300b(str);
        if (!ob9Var.mo26335a(dxiVarM36300b)) {
            wob wobVar = new wob(this.f25930c);
            wobVar.m54753c(ixi.C14401a.f29352a, str);
            dxi dxiVarM31270a = hxi.m31270a(this.f25929b, ob9Var, wobVar);
            this.f25928a.m36302d(str, dxiVarM31270a);
            return dxiVarM31270a;
        }
        Object obj = this.f25929b;
        if (obj instanceof b0.C2133e) {
            sq8.m48646e(dxiVarM36300b);
            ((b0.C2133e) obj).mo6493d(dxiVarM36300b);
        }
        sq8.m48647f(dxiVarM36300b, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return dxiVarM36300b;
    }
}
