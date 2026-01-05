package fc;

import ex.InterfaceC2139c;
import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import og.df;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.a */
/* loaded from: classes.dex */
public class C2253a implements Collection, Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final Collection f10237a;

    /* renamed from: b */
    public final InterfaceC2139c f10238b;

    /* renamed from: c */
    public final Collection f10239c;

    /* renamed from: d */
    public final InterfaceC2139c f10240d;

    /* renamed from: e */
    public final InterfaceC2139c f10241e;

    public C2253a(Collection src, InterfaceC2139c src2Dest, InterfaceC2139c dest2Src) {
        AbstractC4154l.m8923f(src, "src");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        this.f10237a = src;
        this.f10238b = src2Dest;
        this.f10239c = src;
        this.f10240d = src2Dest;
        this.f10241e = dest2Src;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10239c.contains(this.f10241e.invoke(obj));
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10239c.containsAll(df.m10611a(elements, this.f10241e, this.f10240d));
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10239c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator it = this.f10237a.iterator();
        AbstractC4154l.m8923f(it, "<this>");
        InterfaceC2139c src2Dest = this.f10238b;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        return new C2254b(it, src2Dest);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10239c.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
