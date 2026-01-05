package mg;

import java.util.AbstractMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.q */
/* loaded from: classes.dex */
public final class C4738q extends AbstractC4735n {

    /* renamed from: c */
    public final /* synthetic */ C4739r f23688c;

    public C4738q(C4739r c4739r) {
        this.f23688c = c4739r;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C4739r c4739r = this.f23688c;
        return new AbstractMap.SimpleImmutableEntry(c4739r.f23689d.f23692c.f23625f.get(i10), c4739r.f23689d.f23693d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23688c.f23689d.f23693d.size();
    }
}
