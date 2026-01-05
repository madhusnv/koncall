package og;

import java.util.Iterator;
import java.util.Map;
import ug.C7448s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f26344a = 0;

    /* renamed from: b */
    public final Iterator f26345b;

    public c0(C7448s c7448s) {
        this.f26345b = c7448s.f35811a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26344a) {
        }
        return this.f26345b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26344a) {
            case 0:
                return ((Map.Entry) this.f26345b.next()).getValue();
            default:
                return (String) this.f26345b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26344a) {
            case 0:
                this.f26345b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public c0(Iterator it) {
        it.getClass();
        this.f26345b = it;
    }
}
