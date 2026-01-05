package com.apollographql.apollo.api.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Utils {
    private Utils() {
    }

    public static <E> boolean areDisjoint(Set<E> set, Set<E> set2) {
        if (set != null && set2 != null) {
            if (set.size() > set2.size()) {
                set2 = set;
                set = set2;
            }
            Iterator<E> it = set.iterator();
            while (it.hasNext()) {
                if (set2.contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
