package p001o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zda extends xra {

    /* renamed from: c */
    public final uef f56976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zda(dc9 dc9Var, dc9 dc9Var2) {
        super(dc9Var, dc9Var2, null);
        sq8.m48649h(dc9Var, "kSerializer");
        sq8.m48649h(dc9Var2, "vSerializer");
        this.f56976c = new yda(dc9Var.getDescriptor(), dc9Var2.getDescriptor());
    }

    @Override // p001o.xra, p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return this.f56976c;
    }

    @Override // p001o.c7
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo18791a() {
        return new LinkedHashMap();
    }

    @Override // p001o.c7
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18792b(LinkedHashMap linkedHashMap) {
        sq8.m48649h(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // p001o.c7
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18793c(LinkedHashMap linkedHashMap, int i) {
        sq8.m48649h(linkedHashMap, "<this>");
    }

    @Override // p001o.c7
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator mo20353d(Map map) {
        sq8.m48649h(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // p001o.c7
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int mo19320e(Map map) {
        sq8.m48649h(map, "<this>");
        return map.size();
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo18794k(Map map) {
        sq8.m48649h(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p001o.c7
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo18795l(LinkedHashMap linkedHashMap) {
        sq8.m48649h(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
