package p001o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class bh3 {
    /* renamed from: a */
    public static final List m18959a(List list) {
        sq8.m48649h(list, "builder");
        return ((dea) list).m22870L();
    }

    /* renamed from: b */
    public static final Object[] m18960b(Object[] objArr, boolean z) {
        sq8.m48649h(objArr, "<this>");
        if (z && sq8.m48644c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        sq8.m48648g(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: c */
    public static final List m18961c() {
        return new dea(0, 1, null);
    }

    /* renamed from: d */
    public static final List m18962d(int i) {
        return new dea(i);
    }

    /* renamed from: e */
    public static final List m18963e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        sq8.m48648g(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: f */
    public static final Object[] m18964f(int i, Object[] objArr) {
        sq8.m48649h(objArr, "array");
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }
}
