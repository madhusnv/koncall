package fc;

import fx.InterfaceC2396b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.df;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.c */
/* loaded from: classes.dex */
public final class C2255c extends C2253a implements InterfaceC2396b {

    /* renamed from: f */
    public final Collection f10245f;

    /* renamed from: g */
    public final C2260h f10246g;

    /* renamed from: h */
    public final C2260h f10247h;

    public C2255c(Collection collection, C2260h c2260h, C2260h c2260h2) {
        super(collection, c2260h, c2260h2);
        this.f10245f = collection;
        this.f10246g = c2260h;
        this.f10247h = c2260h2;
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f10245f.add(this.f10247h.invoke(obj));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10245f.addAll(df.m10611a(elements, this.f10247h, this.f10246g));
    }

    @Override // fc.C2253a, java.util.Collection
    public final void clear() {
        this.f10245f.clear();
    }

    @Override // fc.C2253a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f10245f.iterator();
        AbstractC4154l.m8923f(it, "<this>");
        C2260h src2Dest = this.f10246g;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        return new C2257e(it, src2Dest);
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10245f.remove(this.f10247h.invoke(obj));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10245f.removeAll(df.m10611a(elements, this.f10247h, this.f10246g));
    }

    @Override // fc.C2253a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10245f.retainAll(df.m10611a(elements, this.f10247h, this.f10246g));
    }
}
