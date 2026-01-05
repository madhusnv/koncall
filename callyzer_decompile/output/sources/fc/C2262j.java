package fc;

import ex.InterfaceC2139c;
import fx.InterfaceC2400f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4145c;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import og.df;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.j */
/* loaded from: classes.dex */
public final class C2262j extends C2253a implements InterfaceC2400f, Set {

    /* renamed from: f */
    public final Set f10274f;

    /* renamed from: g */
    public final AbstractC4145c f10275g;

    /* renamed from: h */
    public final AbstractC4152j f10276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2262j(Set src, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        super(src, interfaceC2139c, interfaceC2139c2);
        AbstractC4154l.m8923f(src, "src");
        this.f10274f = src;
        this.f10275g = (AbstractC4145c) interfaceC2139c;
        this.f10276h = (AbstractC4152j) interfaceC2139c2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // fc.C2253a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f10274f.add(this.f10276h.invoke(obj));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ex.c, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, kotlin.jvm.internal.c] */
    @Override // fc.C2253a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10274f.addAll(df.m10611a(elements, this.f10276h, this.f10275g));
    }

    @Override // fc.C2253a, java.util.Collection
    public final void clear() {
        this.f10274f.clear();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ex.c, java.lang.Object, kotlin.jvm.internal.c] */
    @Override // fc.C2253a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f10274f.iterator();
        AbstractC4154l.m8923f(it, "<this>");
        ?? src2Dest = this.f10275g;
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        return new C2257e(it, src2Dest);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // fc.C2253a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10274f.remove(this.f10276h.invoke(obj));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ex.c, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, kotlin.jvm.internal.c] */
    @Override // fc.C2253a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10274f.removeAll(df.m10611a(elements, this.f10276h, this.f10275g));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ex.c, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, kotlin.jvm.internal.c] */
    @Override // fc.C2253a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f10274f.retainAll(df.m10611a(elements, this.f10276h, this.f10275g));
    }
}
