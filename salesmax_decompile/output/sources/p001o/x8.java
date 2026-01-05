package p001o;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class x8 extends AbstractList implements List, vb9 {
    /* renamed from: d */
    public abstract int mo22880d();

    /* renamed from: e */
    public abstract Object mo22881e(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo22881e(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo22880d();
    }
}
