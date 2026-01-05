package fc;

import ex.InterfaceC2139c;
import fx.InterfaceC2397c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC4154l;
import og.df;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.g */
/* loaded from: classes.dex */
public final class C2259g extends C2253a implements InterfaceC2397c, List {

    /* renamed from: f */
    public final List f10259f;

    /* renamed from: g */
    public final InterfaceC2139c f10260g;

    /* renamed from: h */
    public final InterfaceC2139c f10261h;

    /* renamed from: j */
    public final List f10262j;

    /* renamed from: k */
    public final InterfaceC2139c f10263k;

    /* renamed from: l */
    public final InterfaceC2139c f10264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259g(List src, InterfaceC2139c src2Dest, InterfaceC2139c dest2Src) {
        super(src, src2Dest, dest2Src);
        AbstractC4154l.m8923f(src, "src");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        this.f10259f = src;
        this.f10260g = src2Dest;
        this.f10261h = dest2Src;
        this.f10262j = src;
        this.f10263k = src2Dest;
        this.f10264l = dest2Src;
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f10262j.add(this.f10264l.invoke(obj));
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10262j.addAll(i10, df.m10611a(elements, this.f10264l, this.f10263k));
    }

    @Override // fc.C2253a, java.util.Collection
    public final void clear() {
        this.f10262j.clear();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f10260g.invoke(this.f10259f.get(i10));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f10259f.indexOf(this.f10261h.invoke(obj));
    }

    @Override // fc.C2253a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f10262j.iterator();
        AbstractC4154l.m8923f(it, "<this>");
        InterfaceC2139c src2Dest = this.f10263k;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        return new C2257e(it, src2Dest);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f10259f.lastIndexOf(this.f10261h.invoke(obj));
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        ListIterator listIterator = this.f10262j.listIterator();
        AbstractC4154l.m8923f(listIterator, "<this>");
        InterfaceC2139c src2Dest = this.f10263k;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        InterfaceC2139c dest2Src = this.f10264l;
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        return new C2258f(listIterator, src2Dest, dest2Src);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        return this.f10263k.invoke(this.f10262j.remove(i10));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10262j.removeAll(df.m10611a(elements, this.f10264l, this.f10263k));
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10262j.retainAll(df.m10611a(elements, this.f10264l, this.f10263k));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        return this.f10263k.invoke(this.f10262j.set(i10, this.f10264l.invoke(obj)));
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return df.m10612b(this.f10262j.subList(i10, i11), this.f10263k, this.f10264l);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f10262j.add(i10, this.f10264l.invoke(obj));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10262j.addAll(df.m10611a(elements, this.f10264l, this.f10263k));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10262j.remove(this.f10264l.invoke(obj));
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        ListIterator listIterator = this.f10262j.listIterator(i10);
        AbstractC4154l.m8923f(listIterator, "<this>");
        InterfaceC2139c src2Dest = this.f10263k;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        InterfaceC2139c dest2Src = this.f10264l;
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        return new C2258f(listIterator, src2Dest, dest2Src);
    }
}
