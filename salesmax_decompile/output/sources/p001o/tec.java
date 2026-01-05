package p001o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p001o.mq3;

/* loaded from: classes2.dex */
public class tec implements mq3 {

    /* renamed from: I */
    public static final Comparator f46960I;

    /* renamed from: J */
    public static final tec f46961J;

    /* renamed from: H */
    public final TreeMap f46962H;

    static {
        Comparator comparator = new Comparator() { // from class: o.sec
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tec.m49793Z((mq3.AbstractC15402a) obj, (mq3.AbstractC15402a) obj2);
            }
        };
        f46960I = comparator;
        f46961J = new tec(new TreeMap(comparator));
    }

    public tec(TreeMap treeMap) {
        this.f46962H = treeMap;
    }

    /* renamed from: X */
    public static tec m49791X() {
        return f46961J;
    }

    /* renamed from: Y */
    public static tec m49792Y(mq3 mq3Var) {
        if (tec.class.equals(mq3Var.getClass())) {
            return (tec) mq3Var;
        }
        TreeMap treeMap = new TreeMap(f46960I);
        for (mq3.AbstractC15402a abstractC15402a : mq3Var.mo36956b()) {
            Set<mq3.EnumC15404c> setMo36955a = mq3Var.mo36955a(abstractC15402a);
            ArrayMap arrayMap = new ArrayMap();
            for (mq3.EnumC15404c enumC15404c : setMo36955a) {
                arrayMap.put(enumC15404c, mq3Var.mo36962h(abstractC15402a, enumC15404c));
            }
            treeMap.put(abstractC15402a, arrayMap);
        }
        return new tec(treeMap);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m49793Z(mq3.AbstractC15402a abstractC15402a, mq3.AbstractC15402a abstractC15402a2) {
        return abstractC15402a.mo28031c().compareTo(abstractC15402a2.mo28031c());
    }

    @Override // p001o.mq3
    /* renamed from: a */
    public Set mo36955a(mq3.AbstractC15402a abstractC15402a) {
        Map map = (Map) this.f46962H.get(abstractC15402a);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // p001o.mq3
    /* renamed from: b */
    public Set mo36956b() {
        return Collections.unmodifiableSet(this.f46962H.keySet());
    }

    @Override // p001o.mq3
    /* renamed from: c */
    public boolean mo36957c(mq3.AbstractC15402a abstractC15402a) {
        return this.f46962H.containsKey(abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: d */
    public Object mo36958d(mq3.AbstractC15402a abstractC15402a, Object obj) {
        try {
            return mo36960f(abstractC15402a);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // p001o.mq3
    /* renamed from: e */
    public mq3.EnumC15404c mo36959e(mq3.AbstractC15402a abstractC15402a) {
        Map map = (Map) this.f46962H.get(abstractC15402a);
        if (map != null) {
            return (mq3.EnumC15404c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: f */
    public Object mo36960f(mq3.AbstractC15402a abstractC15402a) {
        Map map = (Map) this.f46962H.get(abstractC15402a);
        if (map != null) {
            return map.get((mq3.EnumC15404c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: g */
    public void mo36961g(String str, mq3.InterfaceC15403b interfaceC15403b) {
        for (Map.Entry entry : this.f46962H.tailMap(mq3.AbstractC15402a.m39507a(str, Void.class)).entrySet()) {
            if (!((mq3.AbstractC15402a) entry.getKey()).mo28031c().startsWith(str) || !interfaceC15403b.mo39509a((mq3.AbstractC15402a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // p001o.mq3
    /* renamed from: h */
    public Object mo36962h(mq3.AbstractC15402a abstractC15402a, mq3.EnumC15404c enumC15404c) {
        Map map = (Map) this.f46962H.get(abstractC15402a);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + abstractC15402a);
        }
        if (map.containsKey(enumC15404c)) {
            return map.get(enumC15404c);
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC15402a + " with priority=" + enumC15404c);
    }
}
