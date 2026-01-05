package p001o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class qpb extends tec implements vob {

    /* renamed from: K */
    public static final mq3.EnumC15404c f42275K = mq3.EnumC15404c.OPTIONAL;

    public qpb(TreeMap treeMap) {
        super(treeMap);
    }

    public static qpb a0() {
        return new qpb(new TreeMap(tec.f46960I));
    }

    public static qpb b0(mq3 mq3Var) {
        TreeMap treeMap = new TreeMap(tec.f46960I);
        for (mq3.AbstractC15402a abstractC15402a : mq3Var.mo36956b()) {
            Set<mq3.EnumC15404c> setMo36955a = mq3Var.mo36955a(abstractC15402a);
            ArrayMap arrayMap = new ArrayMap();
            for (mq3.EnumC15404c enumC15404c : setMo36955a) {
                arrayMap.put(enumC15404c, mq3Var.mo36962h(abstractC15402a, enumC15404c));
            }
            treeMap.put(abstractC15402a, arrayMap);
        }
        return new qpb(treeMap);
    }

    @Override // p001o.vob
    /* renamed from: C */
    public void mo45759C(mq3.AbstractC15402a abstractC15402a, mq3.EnumC15404c enumC15404c, Object obj) {
        Map map = (Map) this.f46962H.get(abstractC15402a);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f46962H.put(abstractC15402a, arrayMap);
            arrayMap.put(enumC15404c, obj);
            return;
        }
        mq3.EnumC15404c enumC15404c2 = (mq3.EnumC15404c) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC15404c2), obj) || !mq3.m39505S(enumC15404c2, enumC15404c)) {
            map.put(enumC15404c, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + abstractC15402a.mo28031c() + ", existing value (" + enumC15404c2 + ")=" + map.get(enumC15404c2) + ", conflicting (" + enumC15404c + ")=" + obj);
    }

    @Override // p001o.vob
    /* renamed from: N */
    public void mo45760N(mq3.AbstractC15402a abstractC15402a, Object obj) {
        mo45759C(abstractC15402a, f42275K, obj);
    }

    public Object c0(mq3.AbstractC15402a abstractC15402a) {
        return this.f46962H.remove(abstractC15402a);
    }
}
