package p001o;

import p001o.b7f;

/* loaded from: classes3.dex */
public abstract class m9 implements d7f {
    /* renamed from: a */
    public void mo20103a(b7f.InterfaceC12296a interfaceC12296a) {
        sq8.m48649h(interfaceC12296a, "builder");
    }

    /* renamed from: c */
    public b7f m38580c(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        b7f.InterfaceC12296a interfaceC12296aMo20104b = mo20104b();
        xk7Var.invoke(interfaceC12296aMo20104b.getConfig());
        mo20103a(interfaceC12296aMo20104b);
        return (b7f) interfaceC12296aMo20104b.build();
    }
}
