package com.amplifyframework.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ForEach {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @FunctionalInterface
    public interface Mapping<I, O> {
        O apply(I i10);
    }

    private ForEach() {
    }

    public static <I, O> List<O> inArray(I[] iArr, Mapping<I, O> mapping) {
        ArrayList arrayList = new ArrayList();
        for (I i10 : iArr) {
            arrayList.add(mapping.apply(i10));
        }
        return Immutable.of(arrayList);
    }

    public static <I, O> List<O> inCollection(Collection<I> collection, Mapping<I, O> mapping) {
        ArrayList arrayList = new ArrayList();
        Iterator<I> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(mapping.apply(it.next()));
        }
        return Immutable.of(arrayList);
    }
}
