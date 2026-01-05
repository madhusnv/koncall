package o2;

import androidx.fragment.app.C0351p;
import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n2.C4942a;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.b */
/* loaded from: classes.dex */
public abstract class AbstractC5269b extends AbstractC6654d implements List, Collection, InterfaceC2395a {
    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public abstract AbstractC5269b mo10376h(int i10, Object obj);

    @Override // rw.AbstractC6654d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public abstract AbstractC5269b mo10377j(Object obj);

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public AbstractC5269b mo10378q(Collection collection) {
        C5273f c5273fMo10379r = mo10379r();
        c5273fMo10379r.addAll(collection);
        return c5273fMo10379r.m10413j();
    }

    /* renamed from: r */
    public abstract C5273f mo10379r();

    /* renamed from: s */
    public abstract AbstractC5269b mo10380s(C0351p c0351p);

    @Override // rw.AbstractC6654d, java.util.List
    public final List subList(int i10, int i11) {
        return new C4942a(this, i10, i11);
    }

    /* renamed from: t */
    public abstract AbstractC5269b mo10381t(int i10);

    /* renamed from: u */
    public abstract AbstractC5269b mo10382u(int i10, Object obj);
}
