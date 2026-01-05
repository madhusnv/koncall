package sw;

import e1.e0;
import fx.InterfaceC2395a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import u2.AbstractC7321r;
import u2.C7320q;
import v3.C7647s;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.a */
/* loaded from: classes3.dex */
public final class C6957a implements ListIterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f33689a;

    /* renamed from: b */
    public int f33690b;

    /* renamed from: c */
    public int f33691c;

    /* renamed from: d */
    public int f33692d;

    /* renamed from: e */
    public final Object f33693e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6957a(C7647s c7647s, int i10, int i11) {
        this(c7647s, (i11 & 1) != 0 ? 0 : i10, 0, c7647s.f36988a.f8957b);
        this.f33689a = 3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f33689a) {
            case 0:
                m13209b();
                C6958b c6958b = (C6958b) this.f33693e;
                int i10 = this.f33690b;
                this.f33690b = i10 + 1;
                c6958b.add(i10, obj);
                this.f33691c = -1;
                this.f33692d = ((AbstractList) c6958b).modCount;
                return;
            case 1:
                m13210d();
                C6959c c6959c = (C6959c) this.f33693e;
                int i11 = this.f33690b;
                this.f33690b = i11 + 1;
                c6959c.add(i11, obj);
                this.f33691c = -1;
                this.f33692d = ((AbstractList) c6959c).modCount;
                return;
            case 2:
                m13211f();
                C7320q c7320q = (C7320q) this.f33693e;
                c7320q.add(this.f33690b + 1, obj);
                this.f33691c = -1;
                this.f33690b++;
                this.f33692d = c7320q.m13702s();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: b */
    public void m13209b() {
        if (((AbstractList) ((C6958b) this.f33693e).f33698e).modCount != this.f33692d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public void m13210d() {
        if (((AbstractList) ((C6959c) this.f33693e)).modCount != this.f33692d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: f */
    public void m13211f() {
        if (((C7320q) this.f33693e).m13702s() != this.f33692d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33689a) {
            case 0:
                return this.f33690b < ((C6958b) this.f33693e).f33696c;
            case 1:
                return this.f33690b < ((C6959c) this.f33693e).f33701b;
            case 2:
                return this.f33690b < ((C7320q) this.f33693e).size() - 1;
            default:
                return this.f33690b < this.f33692d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f33689a) {
            case 0:
                if (this.f33690b > 0) {
                }
                break;
            case 1:
                if (this.f33690b > 0) {
                }
                break;
            case 2:
                if (this.f33690b >= 0) {
                }
                break;
            default:
                if (this.f33690b > this.f33691c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f33689a) {
            case 0:
                m13209b();
                int i10 = this.f33690b;
                C6958b c6958b = (C6958b) this.f33693e;
                if (i10 >= c6958b.f33696c) {
                    throw new NoSuchElementException();
                }
                this.f33690b = i10 + 1;
                this.f33691c = i10;
                return c6958b.f33694a[c6958b.f33695b + i10];
            case 1:
                m13210d();
                int i11 = this.f33690b;
                C6959c c6959c = (C6959c) this.f33693e;
                if (i11 >= c6959c.f33701b) {
                    throw new NoSuchElementException();
                }
                this.f33690b = i11 + 1;
                this.f33691c = i11;
                return c6959c.f33700a[i11];
            case 2:
                m13211f();
                int i12 = this.f33690b + 1;
                this.f33691c = i12;
                C7320q c7320q = (C7320q) this.f33693e;
                AbstractC7321r.m13704a(i12, c7320q.size());
                Object obj = c7320q.get(i12);
                this.f33690b = i12;
                return obj;
            default:
                e0 e0Var = ((C7647s) this.f33693e).f36988a;
                int i13 = this.f33690b;
                this.f33690b = i13 + 1;
                Object objM5547e = e0Var.m5547e(i13);
                AbstractC4154l.m8921d(objM5547e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC7878q) objM5547e;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f33689a) {
            case 0:
                return this.f33690b;
            case 1:
                return this.f33690b;
            case 2:
                return this.f33690b + 1;
            default:
                return this.f33690b - this.f33691c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f33689a) {
            case 0:
                m13209b();
                int i10 = this.f33690b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f33690b = i11;
                this.f33691c = i11;
                C6958b c6958b = (C6958b) this.f33693e;
                return c6958b.f33694a[c6958b.f33695b + i11];
            case 1:
                m13210d();
                int i12 = this.f33690b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f33690b = i13;
                this.f33691c = i13;
                return ((C6959c) this.f33693e).f33700a[i13];
            case 2:
                m13211f();
                int i14 = this.f33690b;
                C7320q c7320q = (C7320q) this.f33693e;
                AbstractC7321r.m13704a(i14, c7320q.size());
                int i15 = this.f33690b;
                this.f33691c = i15;
                this.f33690b--;
                return c7320q.get(i15);
            default:
                e0 e0Var = ((C7647s) this.f33693e).f36988a;
                int i16 = this.f33690b - 1;
                this.f33690b = i16;
                Object objM5547e = e0Var.m5547e(i16);
                AbstractC4154l.m8921d(objM5547e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC7878q) objM5547e;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f33689a) {
            case 0:
                i10 = this.f33690b;
                break;
            case 1:
                i10 = this.f33690b;
                break;
            case 2:
                return this.f33690b;
            default:
                i10 = this.f33690b - this.f33691c;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f33689a) {
            case 0:
                C6958b c6958b = (C6958b) this.f33693e;
                m13209b();
                int i10 = this.f33691c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c6958b.mo10412h(i10);
                this.f33690b = this.f33691c;
                this.f33691c = -1;
                this.f33692d = ((AbstractList) c6958b).modCount;
                return;
            case 1:
                C6959c c6959c = (C6959c) this.f33693e;
                m13210d();
                int i11 = this.f33691c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c6959c.mo10412h(i11);
                this.f33690b = this.f33691c;
                this.f33691c = -1;
                this.f33692d = ((AbstractList) c6959c).modCount;
                return;
            case 2:
                m13211f();
                C7320q c7320q = (C7320q) this.f33693e;
                c7320q.remove(this.f33690b);
                this.f33690b--;
                this.f33691c = -1;
                this.f33692d = c7320q.m13702s();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f33689a) {
            case 0:
                m13209b();
                int i10 = this.f33691c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6958b) this.f33693e).set(i10, obj);
                return;
            case 1:
                m13210d();
                int i11 = this.f33691c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6959c) this.f33693e).set(i11, obj);
                return;
            case 2:
                C7320q c7320q = (C7320q) this.f33693e;
                m13211f();
                int i12 = this.f33691c;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                c7320q.set(i12, obj);
                this.f33692d = c7320q.m13702s();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6957a(C6959c c6959c, int i10) {
        this.f33689a = 1;
        this.f33693e = c6959c;
        this.f33690b = i10;
        this.f33691c = -1;
        this.f33692d = ((AbstractList) c6959c).modCount;
    }

    public C6957a(C7647s c7647s, int i10, int i11, int i12) {
        this.f33689a = 3;
        this.f33693e = c7647s;
        this.f33690b = i10;
        this.f33691c = i11;
        this.f33692d = i12;
    }

    public C6957a(C7320q c7320q, int i10) {
        this.f33689a = 2;
        this.f33693e = c7320q;
        this.f33690b = i10 - 1;
        this.f33691c = -1;
        this.f33692d = c7320q.m13702s();
    }

    public C6957a(C6958b c6958b, int i10) {
        this.f33689a = 0;
        this.f33693e = c6958b;
        this.f33690b = i10;
        this.f33691c = -1;
        this.f33692d = ((AbstractList) c6958b).modCount;
    }
}
