package nx;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import rw.AbstractC6654d;
import rw.AbstractC6663m;
import rw.C6675y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.j */
/* loaded from: classes3.dex */
public final class C5172j extends AbstractC6654d {

    /* renamed from: a */
    public final /* synthetic */ int f25276a;

    /* renamed from: b */
    public final Object f25277b;

    public /* synthetic */ C5172j(int i10, Object obj) {
        this.f25276a = i10;
        this.f25277b = obj;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        switch (this.f25276a) {
            case 0:
                return ((C5174l) this.f25277b).f25280a.groupCount() + 1;
            default:
                return ((List) this.f25277b).size();
        }
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f25276a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f25276a) {
            case 0:
                String strGroup = ((C5174l) this.f25277b).f25280a.group(i10);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f25277b).get(AbstractC6663m.m12763v(this, i10));
        }
    }

    @Override // rw.AbstractC6654d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f25276a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // rw.AbstractC6654d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f25276a) {
            case 1:
                return new C6675y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // rw.AbstractC6654d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f25276a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // rw.AbstractC6654d, java.util.List
    public ListIterator listIterator() {
        switch (this.f25276a) {
            case 1:
                return new C6675y(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // rw.AbstractC6654d, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f25276a) {
            case 1:
                return new C6675y(this, i10);
            default:
                return super.listIterator(i10);
        }
    }
}
