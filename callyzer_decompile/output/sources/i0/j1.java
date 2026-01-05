package i0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends o1 implements i1 {

    /* renamed from: d */
    public static final r0 f16500d = r0.OPTIONAL;

    /* renamed from: b */
    public static j1 m7349b() {
        return new j1(new TreeMap(o1.f16548b));
    }

    /* renamed from: g */
    public static j1 m7350g(s0 s0Var) {
        TreeMap treeMap = new TreeMap(o1.f16548b);
        for (C3076g c3076g : s0Var.mo7403h()) {
            Set<r0> setMo7400c = s0Var.mo7400c(c3076g);
            ArrayMap arrayMap = new ArrayMap();
            for (r0 r0Var : setMo7400c) {
                arrayMap.put(r0Var, s0Var.mo7405j(c3076g, r0Var));
            }
            treeMap.put(c3076g, arrayMap);
        }
        return new j1(treeMap);
    }

    /* renamed from: m */
    public final void m7351m(C3076g c3076g, r0 r0Var, Object obj) {
        r0 r0Var2;
        TreeMap treeMap = this.f16550a;
        Map map = (Map) treeMap.get(c3076g);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c3076g, arrayMap);
            arrayMap.put(r0Var, obj);
            return;
        }
        r0 r0Var3 = (r0) Collections.min(map.keySet());
        if (Objects.equals(map.get(r0Var3), obj) || r0Var3 != (r0Var2 = r0.REQUIRED) || r0Var != r0Var2) {
            map.put(r0Var, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + c3076g.f16460a + ", existing value (" + r0Var3 + ")=" + map.get(r0Var3) + ", conflicting (" + r0Var + ")=" + obj);
    }

    /* renamed from: n */
    public final void m7352n(C3076g c3076g, Object obj) {
        m7351m(c3076g, f16500d, obj);
    }
}
