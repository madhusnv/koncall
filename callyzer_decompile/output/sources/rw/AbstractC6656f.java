package rw;

import fx.InterfaceC2397c;
import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6656f extends AbstractList implements List, InterfaceC2397c {
    /* renamed from: b */
    public abstract int mo10411b();

    /* renamed from: h */
    public abstract Object mo10412h(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return mo10412h(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo10411b();
    }
}
