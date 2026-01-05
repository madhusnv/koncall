package p001o;

import androidx.lifecycle.b0;

/* loaded from: classes2.dex */
public abstract class hxi {
    /* renamed from: a */
    public static final dxi m31270a(b0.InterfaceC2131c interfaceC2131c, ob9 ob9Var, ya4 ya4Var) {
        sq8.m48649h(interfaceC2131c, "factory");
        sq8.m48649h(ob9Var, "modelClass");
        sq8.m48649h(ya4Var, "extras");
        try {
            try {
                return interfaceC2131c.mo6513a(ob9Var, ya4Var);
            } catch (AbstractMethodError unused) {
                return interfaceC2131c.mo6367c(hb9.m30150a(ob9Var));
            }
        } catch (AbstractMethodError unused2) {
            return interfaceC2131c.mo6492b(hb9.m30150a(ob9Var), ya4Var);
        }
    }
}
