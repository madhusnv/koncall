package p001o;

import java.util.Comparator;

/* loaded from: classes6.dex */
public abstract class uk3 {
    /* renamed from: b */
    public static final Comparator m51672b(final xk7... xk7VarArr) {
        sq8.m48649h(xk7VarArr, "selectors");
        if (xk7VarArr.length > 0) {
            return new Comparator() { // from class: o.tk3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return uk3.m51673c(xk7VarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final int m51673c(xk7[] xk7VarArr, Object obj, Object obj2) {
        return m51676f(obj, obj2, xk7VarArr);
    }

    /* renamed from: d */
    public static final int m51674d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: e */
    public static final int m51675e(Object obj, Object obj2, xk7... xk7VarArr) {
        sq8.m48649h(xk7VarArr, "selectors");
        if (xk7VarArr.length > 0) {
            return m51676f(obj, obj2, xk7VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: f */
    public static final int m51676f(Object obj, Object obj2, xk7[] xk7VarArr) {
        for (xk7 xk7Var : xk7VarArr) {
            int iM51674d = m51674d((Comparable) xk7Var.invoke(obj), (Comparable) xk7Var.invoke(obj2));
            if (iM51674d != 0) {
                return iM51674d;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static final Comparator m51677g() {
        trb trbVar = trb.f47659a;
        sq8.m48647f(trbVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return trbVar;
    }

    /* renamed from: h */
    public static final Comparator m51678h() {
        hte hteVar = hte.f27538a;
        sq8.m48647f(hteVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return hteVar;
    }
}
