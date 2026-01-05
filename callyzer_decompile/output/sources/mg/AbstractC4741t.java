package mg;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.t */
/* loaded from: classes.dex */
public abstract class AbstractC4741t extends AbstractC4737p implements NavigableSet, d0 {

    /* renamed from: d */
    public final transient Comparator f23696d;

    /* renamed from: e */
    public transient AbstractC4741t f23697e;

    public AbstractC4741t(Comparator comparator) {
        this.f23696d = comparator;
    }

    /* renamed from: s */
    public static a0 m9641s(Comparator comparator) {
        if (C4744w.f23706b.equals(comparator)) {
            return a0.f23624g;
        }
        C4731j c4731j = AbstractC4735n.f23678b;
        return new a0(C4746y.f23712e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f23696d;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.m9596v(0, a0Var.m9594t(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC4741t descendingSet() {
        AbstractC4741t abstractC4741tM9641s = this.f23697e;
        if (abstractC4741tM9641s == null) {
            a0 a0Var = (a0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(a0Var.f23696d);
            abstractC4741tM9641s = a0Var.isEmpty() ? m9641s(comparatorReverseOrder) : new a0(a0Var.f23625f.mo9623h(), comparatorReverseOrder);
            this.f23697e = abstractC4741tM9641s;
            abstractC4741tM9641s.f23697e = this;
        }
        return abstractC4741tM9641s;
    }

    @Override // java.util.NavigableSet
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final a0 subSet(Object obj, boolean z6, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f23696d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        a0 a0Var = (a0) this;
        a0 a0VarM9596v = a0Var.m9596v(a0Var.m9595u(obj, z6), a0Var.f23625f.size());
        return a0VarM9596v.m9596v(0, a0VarM9596v.m9594t(obj2, z10));
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.m9596v(a0Var.m9595u(obj, true), a0Var.f23625f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.m9596v(0, a0Var.m9594t(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.m9596v(a0Var.m9595u(obj, z6), a0Var.f23625f.size());
    }
}
