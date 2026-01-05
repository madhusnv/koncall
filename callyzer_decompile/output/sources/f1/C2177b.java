package f1;

import ex.InterfaceC2139c;
import fw.C2389c;
import g7.C2540e;
import i0.C3082m;
import i0.f2;
import i0.g2;
import i0.t2;
import i0.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f1.b */
/* loaded from: classes.dex */
public final class C2177b {

    /* renamed from: a */
    public final LinkedHashMap f10051a;

    public C2177b(int i10) {
        switch (i10) {
            case 1:
                this.f10051a = new LinkedHashMap();
                break;
            default:
                this.f10051a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    /* renamed from: a */
    public void m5865a(C4147e c4147e, InterfaceC2139c initializer) {
        AbstractC4154l.m8923f(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f10051a;
        if (!linkedHashMap.containsKey(c4147e)) {
            linkedHashMap.put(c4147e, new C2540e(c4147e, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + c4147e.m8913b() + '.').toString());
    }

    /* renamed from: b */
    public C2389c m5866b() {
        Collection initializers = this.f10051a.values();
        AbstractC4154l.m8923f(initializers, "initializers");
        C2540e[] c2540eArr = (C2540e[]) initializers.toArray(new C2540e[0]);
        return new C2389c((C2540e[]) Arrays.copyOf(c2540eArr, c2540eArr.length));
    }

    /* renamed from: c */
    public f2 m5867c() {
        f2 f2Var = new f2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f10051a.entrySet()) {
            t2 t2Var = (t2) entry.getValue();
            if (t2Var.f16590f && t2Var.f16589e) {
                String str = (String) entry.getKey();
                f2Var.m7336a(t2Var.f16585a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        u1.m10942a("UseCaseAttachState");
        return f2Var;
    }

    /* renamed from: d */
    public f2 m5868d() {
        f2 f2Var = new f2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f10051a.entrySet()) {
            t2 t2Var = (t2) entry.getValue();
            if (t2Var.f16589e) {
                f2Var.m7336a(t2Var.f16585a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        u1.m10942a("UseCaseAttachState");
        return f2Var;
    }

    /* renamed from: e */
    public Collection m5869e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f10051a.entrySet()) {
            if (((t2) entry.getValue()).f16589e) {
                arrayList.add(((t2) entry.getValue()).f16585a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: f */
    public Collection m5870f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f10051a.entrySet()) {
            if (((t2) entry.getValue()).f16589e) {
                arrayList.add(((t2) entry.getValue()).f16586b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: g */
    public boolean m5871g(String str) {
        LinkedHashMap linkedHashMap = this.f10051a;
        if (linkedHashMap.containsKey(str)) {
            return ((t2) linkedHashMap.get(str)).f16589e;
        }
        return false;
    }

    /* renamed from: h */
    public void m5872h(String str, g2 g2Var, w2 w2Var, C3082m c3082m, List list) {
        LinkedHashMap linkedHashMap = this.f10051a;
        if (linkedHashMap.containsKey(str)) {
            t2 t2Var = new t2(g2Var, w2Var, c3082m, list);
            t2 t2Var2 = (t2) linkedHashMap.get(str);
            t2Var.f16589e = t2Var2.f16589e;
            t2Var.f16590f = t2Var2.f16590f;
            linkedHashMap.put(str, t2Var);
        }
    }

    public C2177b(String str) {
        this.f10051a = new LinkedHashMap();
    }
}
