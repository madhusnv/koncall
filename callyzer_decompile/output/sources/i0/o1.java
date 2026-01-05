package i0;

import a1.C0004c;
import android.util.ArrayMap;
import b0.C0515g;
import cj.C0975a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class o1 implements s0 {

    /* renamed from: b */
    public static final C0975a f16548b;

    /* renamed from: c */
    public static final o1 f16549c;

    /* renamed from: a */
    public final TreeMap f16550a;

    static {
        C0975a c0975a = new C0975a(5);
        f16548b = c0975a;
        f16549c = new o1(new TreeMap(c0975a));
    }

    public o1(TreeMap treeMap) {
        this.f16550a = treeMap;
    }

    /* renamed from: a */
    public static o1 m7399a(s0 s0Var) {
        if (o1.class.equals(s0Var.getClass())) {
            return (o1) s0Var;
        }
        TreeMap treeMap = new TreeMap(f16548b);
        for (C3076g c3076g : s0Var.mo7403h()) {
            Set<r0> setMo7400c = s0Var.mo7400c(c3076g);
            ArrayMap arrayMap = new ArrayMap();
            for (r0 r0Var : setMo7400c) {
                arrayMap.put(r0Var, s0Var.mo7405j(c3076g, r0Var));
            }
            treeMap.put(c3076g, arrayMap);
        }
        return new o1(treeMap);
    }

    @Override // i0.s0
    /* renamed from: c */
    public final Set mo7400c(C3076g c3076g) {
        Map map = (Map) this.f16550a.get(c3076g);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // i0.s0
    /* renamed from: e */
    public final Object mo7401e(C3076g c3076g, Object obj) {
        try {
            return mo7406k(c3076g);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // i0.s0
    /* renamed from: f */
    public final void mo7402f(C0004c c0004c) {
        for (Map.Entry entry : this.f16550a.tailMap(new C3076g("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C3076g) entry.getKey()).f16460a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            C3076g c3076g = (C3076g) entry.getKey();
            C0515g c0515g = (C0515g) c0004c.f19b;
            s0 s0Var = (s0) c0004c.f20c;
            c0515g.f3583b.m7351m(c3076g, s0Var.mo7407l(c3076g), s0Var.mo7406k(c3076g));
        }
    }

    @Override // i0.s0
    /* renamed from: h */
    public final Set mo7403h() {
        return Collections.unmodifiableSet(this.f16550a.keySet());
    }

    @Override // i0.s0
    /* renamed from: i */
    public final boolean mo7404i(C3076g c3076g) {
        return this.f16550a.containsKey(c3076g);
    }

    @Override // i0.s0
    /* renamed from: j */
    public final Object mo7405j(C3076g c3076g, r0 r0Var) {
        Map map = (Map) this.f16550a.get(c3076g);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + c3076g);
        }
        if (map.containsKey(r0Var)) {
            return map.get(r0Var);
        }
        throw new IllegalArgumentException("Option does not exist: " + c3076g + " with priority=" + r0Var);
    }

    @Override // i0.s0
    /* renamed from: k */
    public final Object mo7406k(C3076g c3076g) {
        Map map = (Map) this.f16550a.get(c3076g);
        if (map != null) {
            return map.get((r0) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c3076g);
    }

    @Override // i0.s0
    /* renamed from: l */
    public final r0 mo7407l(C3076g c3076g) {
        Map map = (Map) this.f16550a.get(c3076g);
        if (map != null) {
            return (r0) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c3076g);
    }
}
