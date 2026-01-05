package yh;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.o */
/* loaded from: classes.dex */
public final class C8671o extends AbstractC8662f {

    /* renamed from: d */
    public final transient Object f41996d;

    public C8671o(Object obj) {
        this.f41996d = obj;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: a */
    public final int mo15993a(Object[] objArr) {
        objArr[0] = this.f41996d;
        return 1;
    }

    @Override // yh.AbstractC8657a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41996d.equals(obj);
    }

    @Override // yh.AbstractC8657a
    /* renamed from: g */
    public final boolean mo15997g() {
        return false;
    }

    @Override // yh.AbstractC8662f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41996d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8663g(this.f41996d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f41996d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
