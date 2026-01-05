package p001o;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class bea extends xg3 {

    /* renamed from: b */
    public final uef f16049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bea(dc9 dc9Var) {
        super(dc9Var);
        sq8.m48649h(dc9Var, "eSerializer");
        this.f16049b = new aea(dc9Var.getDescriptor());
    }

    @Override // p001o.ug3, p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return this.f16049b;
    }

    @Override // p001o.c7
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo18791a() {
        return new LinkedHashSet();
    }

    @Override // p001o.c7
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18792b(LinkedHashSet linkedHashSet) {
        sq8.m48649h(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // p001o.c7
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18793c(LinkedHashSet linkedHashSet, int i) {
        sq8.m48649h(linkedHashSet, "<this>");
    }

    @Override // p001o.ug3
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18796n(LinkedHashSet linkedHashSet, int i, Object obj) {
        sq8.m48649h(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // p001o.c7
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo18794k(Set set) {
        sq8.m48649h(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo18795l(LinkedHashSet linkedHashSet) {
        sq8.m48649h(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
