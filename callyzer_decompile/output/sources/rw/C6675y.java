package rw;

import fx.InterfaceC2395a;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C4166x;
import nx.C5172j;
import og.pe;
import u2.AbstractC7321r;
import u2.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.y */
/* loaded from: classes3.dex */
public final class C6675y implements ListIterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f31948a = 2;

    /* renamed from: b */
    public final Object f31949b;

    /* renamed from: c */
    public final /* synthetic */ Object f31950c;

    public C6675y(C5172j c5172j, int i10) {
        this.f31950c = c5172j;
        this.f31949b = ((List) c5172j.f25277b).listIterator(AbstractC6663m.m12764w(c5172j, i10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f31948a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f31949b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31948a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((C4166x) this.f31949b).f21162a < ((b0) this.f31950c).f34846d - 1) {
                }
                break;
        }
        return ((ListIterator) this.f31949b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f31948a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((C4166x) this.f31949b).f21162a >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f31949b).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f31948a) {
            case 0:
                return ((ListIterator) this.f31949b).previous();
            case 1:
                return ((ListIterator) this.f31949b).previous();
            default:
                C4166x c4166x = (C4166x) this.f31949b;
                int i10 = c4166x.f21162a + 1;
                b0 b0Var = (b0) this.f31950c;
                AbstractC7321r.m13704a(i10, b0Var.f34846d);
                c4166x.f21162a = i10;
                return b0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f31948a) {
            case 0:
                C6676z c6676z = (C6676z) this.f31950c;
                return pe.m10832g(c6676z) - ((ListIterator) this.f31949b).previousIndex();
            case 1:
                C5172j c5172j = (C5172j) this.f31950c;
                return pe.m10832g(c5172j) - ((ListIterator) this.f31949b).previousIndex();
            default:
                return ((C4166x) this.f31949b).f21162a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f31948a) {
            case 0:
                return ((ListIterator) this.f31949b).next();
            case 1:
                return ((ListIterator) this.f31949b).next();
            default:
                C4166x c4166x = (C4166x) this.f31949b;
                int i10 = c4166x.f21162a;
                b0 b0Var = (b0) this.f31950c;
                AbstractC7321r.m13704a(i10, b0Var.f34846d);
                c4166x.f21162a = i10 - 1;
                return b0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f31948a) {
            case 0:
                C6676z c6676z = (C6676z) this.f31950c;
                return pe.m10832g(c6676z) - ((ListIterator) this.f31949b).nextIndex();
            case 1:
                C5172j c5172j = (C5172j) this.f31950c;
                return pe.m10832g(c5172j) - ((ListIterator) this.f31949b).nextIndex();
            default:
                return ((C4166x) this.f31949b).f21162a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f31948a) {
            case 0:
                ((ListIterator) this.f31949b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f31948a) {
            case 0:
                ((ListIterator) this.f31949b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C6675y(C6676z c6676z, int i10) {
        this.f31950c = c6676z;
        this.f31949b = c6676z.f31951a.listIterator(AbstractC6663m.m12764w(c6676z, i10));
    }

    public C6675y(C4166x c4166x, b0 b0Var) {
        this.f31949b = c4166x;
        this.f31950c = b0Var;
    }
}
