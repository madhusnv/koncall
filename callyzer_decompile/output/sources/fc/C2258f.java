package fc;

import ex.InterfaceC2139c;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.f */
/* loaded from: classes.dex */
public final class C2258f extends C2254b implements ListIterator {

    /* renamed from: d */
    public final ListIterator f10255d;

    /* renamed from: e */
    public final InterfaceC2139c f10256e;

    /* renamed from: f */
    public final ListIterator f10257f;

    /* renamed from: g */
    public final InterfaceC2139c f10258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258f(ListIterator src, InterfaceC2139c src2Dest, InterfaceC2139c dest2Src) {
        super(src, src2Dest);
        AbstractC4154l.m8923f(src, "src");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        this.f10255d = src;
        this.f10256e = src2Dest;
        this.f10257f = src;
        this.f10258g = dest2Src;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f10257f.add(this.f10258g.invoke(obj));
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10255d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10255d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f10256e.invoke(this.f10255d.previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10255d.previousIndex();
    }

    @Override // fc.C2254b, java.util.Iterator
    public final void remove() {
        this.f10257f.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f10257f.set(this.f10258g.invoke(obj));
    }
}
