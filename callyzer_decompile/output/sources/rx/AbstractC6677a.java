package rx;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import qx.C6377a;
import qx.InterfaceC6378b;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6677a extends AbstractC6654d implements InterfaceC6378b, Collection, InterfaceC2395a {
    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // rw.AbstractC6654d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final List subList(int i10, int i11) {
        return new C6377a(this, i10, i11);
    }
}
