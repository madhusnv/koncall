package ge;

import d8.AbstractC1655a;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.m */
/* loaded from: classes.dex */
public final class C2581m {

    /* renamed from: a */
    public final LinkedHashMap f14060a;

    public C2581m(C2582n c2582n) {
        this.f14060a = AbstractC6674x.m12786n(c2582n.f14062a);
    }

    /* renamed from: a */
    public void m6576a(AbstractC1655a migration) {
        AbstractC4154l.m8923f(migration, "migration");
        int i10 = migration.f8164a;
        int i11 = migration.f8165b;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f14060a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i11))) {
            Objects.toString(treeMap2.get(Integer.valueOf(i11)));
            migration.toString();
        }
        treeMap2.put(Integer.valueOf(i11), migration);
    }

    public C2581m() {
        this.f14060a = new LinkedHashMap();
    }
}
