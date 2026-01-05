package lw;

import java.util.Comparator;
import java.util.Map;
import pg.AbstractC5939t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.a */
/* loaded from: classes3.dex */
public final class C4536a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC5939t.m11866a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
