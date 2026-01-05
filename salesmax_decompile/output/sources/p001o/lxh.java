package p001o;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class lxh extends TreeSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxh(Comparator comparator) {
        super(comparator);
        sq8.m48649h(comparator, "comparator");
    }

    /* renamed from: b */
    public /* bridge */ int m38100b() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m38100b();
    }
}
