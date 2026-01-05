package mg;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.r */
/* loaded from: classes.dex */
public final class C4739r extends AbstractC4737p {

    /* renamed from: d */
    public final /* synthetic */ C4740s f23689d;

    public C4739r(C4740s c4740s) {
        this.f23689d = c4740s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f23689d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: e */
    public final e0 mo9591e() {
        return mo9593k().listIterator(0);
    }

    @Override // mg.AbstractC4737p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC4723b.m9600b(this.f23689d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo9593k().listIterator(0);
    }

    @Override // mg.AbstractC4737p
    /* renamed from: m */
    public final AbstractC4735n mo9634m() {
        return new C4738q(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23689d.f23693d.size();
    }
}
