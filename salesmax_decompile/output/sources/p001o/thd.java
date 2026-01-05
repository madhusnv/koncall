package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class thd extends ug3 {

    /* renamed from: b */
    public final uef f47133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thd(dc9 dc9Var) {
        super(dc9Var, null);
        sq8.m48649h(dc9Var, "primitiveSerializer");
        this.f47133b = new shd(dc9Var.getDescriptor());
    }

    @Override // p001o.c7
    /* renamed from: d */
    public final Iterator mo20353d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // p001o.c7, p001o.bn5
    public final Object deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return m20354f(w75Var, null);
    }

    @Override // p001o.ug3, p001o.dc9, p001o.iff, p001o.bn5
    public final uef getDescriptor() {
        return this.f47133b;
    }

    @Override // p001o.c7
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final rhd mo18791a() {
        return (rhd) mo18794k(mo19322r());
    }

    @Override // p001o.c7
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int mo18792b(rhd rhdVar) {
        sq8.m48649h(rhdVar, "<this>");
        return rhdVar.mo17043d();
    }

    @Override // p001o.c7
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void mo18793c(rhd rhdVar, int i) {
        sq8.m48649h(rhdVar, "<this>");
        rhdVar.mo17042b(i);
    }

    /* renamed from: r */
    public abstract Object mo19322r();

    @Override // p001o.ug3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void mo18796n(rhd rhdVar, int i, Object obj) {
        sq8.m48649h(rhdVar, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // p001o.ug3, p001o.iff
    public final void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        int iMo19320e = mo19320e(obj);
        uef uefVar = this.f47133b;
        lo3 lo3VarMo29874D = h76Var.mo29874D(uefVar, iMo19320e);
        mo19323u(lo3VarMo29874D, obj, iMo19320e);
        lo3VarMo29874D.mo37560c(uefVar);
    }

    @Override // p001o.c7
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object mo18795l(rhd rhdVar) {
        sq8.m48649h(rhdVar, "<this>");
        return rhdVar.mo17041a();
    }

    /* renamed from: u */
    public abstract void mo19323u(lo3 lo3Var, Object obj, int i);
}
