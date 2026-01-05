package p001o;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class arb extends RecyclerView.d0 {

    /* renamed from: u */
    public final ewi f15160u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arb(ewi ewiVar) {
        super(ewiVar.m25689B());
        sq8.m48649h(ewiVar, "binding");
        this.f15160u = ewiVar;
    }

    /* renamed from: O */
    public final void m17704O(Object obj, int i, Object obj2, String str, boolean z, Object obj3, nl7 nl7Var) {
        sq8.m48649h(obj2, "handler");
        sq8.m48649h(nl7Var, "additionalBindingCallback");
        this.f15160u.b0(67, obj);
        this.f15160u.b0(73, Integer.valueOf(i));
        this.f15160u.b0(33, obj2);
        this.f15160u.b0(7, obj3);
        this.f15160u.m25695s();
        nl7Var.invoke(this.f15160u, obj);
    }
}
