package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        MethodNode.C187811 c187811 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c187811.add(arrayList.get(i).freeze());
        }
        return c187811;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        MethodNode.C187811 c187811 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c187811.add(it.next().freeze());
        }
        return c187811;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        MethodNode.C187811 c187811 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c187811.add(e.freeze());
        }
        return c187811;
    }
}
