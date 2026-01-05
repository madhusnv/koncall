package p001o;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class nif extends mif {
    /* renamed from: e */
    public static final Set m40664e() {
        return s66.f44871a;
    }

    /* renamed from: f */
    public static final HashSet m40665f(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return (HashSet) gp0.y0(objArr, new HashSet(hsa.m31055e(objArr.length)));
    }

    /* renamed from: g */
    public static final Set m40666g(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return (Set) gp0.y0(objArr, new LinkedHashSet(hsa.m31055e(objArr.length)));
    }

    /* renamed from: h */
    public static final Set m40667h(Set set) {
        sq8.m48649h(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : mif.m39137d(set.iterator().next()) : m40664e();
    }

    /* renamed from: i */
    public static final Set m40668i(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return gp0.K0(objArr);
    }
}
