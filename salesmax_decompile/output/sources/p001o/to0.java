package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class to0 extends xg3 {

    /* renamed from: b */
    public final uef f47479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(dc9 dc9Var) {
        super(dc9Var);
        sq8.m48649h(dc9Var, "element");
        this.f47479b = new so0(dc9Var.getDescriptor());
    }

    @Override // p001o.ug3, p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return this.f47479b;
    }

    @Override // p001o.c7
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18791a() {
        return new ArrayList();
    }

    @Override // p001o.c7
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18792b(ArrayList arrayList) {
        sq8.m48649h(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p001o.c7
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18793c(ArrayList arrayList, int i) {
        sq8.m48649h(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // p001o.ug3
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18796n(ArrayList arrayList, int i, Object obj) {
        sq8.m48649h(arrayList, "<this>");
        arrayList.add(i, obj);
    }

    @Override // p001o.c7
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18794k(List list) {
        sq8.m48649h(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List mo18795l(ArrayList arrayList) {
        sq8.m48649h(arrayList, "<this>");
        return arrayList;
    }
}
