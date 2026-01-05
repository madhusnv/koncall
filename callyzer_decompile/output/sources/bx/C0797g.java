package bx;

import fx.InterfaceC2395a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import mx.C4910f;
import mx.C4915k;
import mx.InterfaceC4911g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bx.g */
/* loaded from: classes3.dex */
public final class C0797g implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f5016a;

    /* renamed from: b */
    public int f5017b;

    /* renamed from: c */
    public Object f5018c;

    /* renamed from: d */
    public Object f5019d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC4911g f5020e;

    public C0797g(C0799i c0799i) {
        this.f5016a = 0;
        this.f5020e = c0799i;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5019d = arrayDeque;
        File file = (File) c0799i.f5023b;
        if (file.isDirectory()) {
            arrayDeque.push(m2126f(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C0794d(file));
        } else {
            this.f5017b = 2;
        }
    }

    /* renamed from: b */
    public void m2124b() {
        C4910f c4910f = (C4910f) this.f5020e;
        Iterator it = (Iterator) this.f5018c;
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) c4910f.f24449c.invoke(next)).booleanValue() == c4910f.f24448b) {
                this.f5019d = next;
                this.f5017b = 1;
                return;
            }
        }
        this.f5017b = 0;
    }

    /* renamed from: d */
    public void m2125d() {
        Iterator it = (Iterator) this.f5018c;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((C4915k) this.f5020e).f24457c.invoke(next)).booleanValue()) {
                this.f5017b = 1;
                this.f5019d = next;
                return;
            }
        }
        this.f5017b = 0;
    }

    /* renamed from: f */
    public AbstractC0792b m2126f(File file) {
        int i10 = AbstractC0796f.f5015a[((EnumC0800j) ((C0799i) this.f5020e).f5024c).ordinal()];
        if (i10 == 1) {
            return new C0795e(file);
        }
        if (i10 == 2) {
            return new C0793c(file);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public boolean m2127h() {
        File file;
        File fileMo2123a;
        this.f5017b = 3;
        ArrayDeque arrayDeque = (ArrayDeque) this.f5019d;
        while (true) {
            AbstractC0798h abstractC0798h = (AbstractC0798h) arrayDeque.peek();
            if (abstractC0798h == null) {
                file = null;
                break;
            }
            fileMo2123a = abstractC0798h.mo2123a();
            if (fileMo2123a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo2123a.equals(abstractC0798h.f5021a) || !fileMo2123a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(m2126f(fileMo2123a));
            }
        }
        file = fileMo2123a;
        if (file != null) {
            this.f5018c = file;
            this.f5017b = 1;
        } else {
            this.f5017b = 2;
        }
        return this.f5017b == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5016a) {
            case 0:
                int i10 = this.f5017b;
                if (i10 == 0) {
                    return m2127h();
                }
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            case 1:
                if (this.f5017b == -1) {
                    m2124b();
                }
                return this.f5017b == 1;
            default:
                if (this.f5017b == -1) {
                    m2125d();
                }
                return this.f5017b == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5016a) {
            case 0:
                int i10 = this.f5017b;
                if (i10 == 1) {
                    this.f5017b = 0;
                    return (File) this.f5018c;
                }
                if (i10 == 2 || !m2127h()) {
                    throw new NoSuchElementException();
                }
                this.f5017b = 0;
                return (File) this.f5018c;
            case 1:
                if (this.f5017b == -1) {
                    m2124b();
                }
                if (this.f5017b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f5019d;
                this.f5019d = null;
                this.f5017b = -1;
                return obj;
            default:
                if (this.f5017b == -1) {
                    m2125d();
                }
                if (this.f5017b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f5019d;
                this.f5019d = null;
                this.f5017b = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5016a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0797g(C4910f c4910f) {
        this.f5016a = 1;
        this.f5020e = c4910f;
        this.f5018c = c4910f.f24447a.iterator();
        this.f5017b = -1;
    }

    public C0797g(C4915k c4915k) {
        this.f5016a = 2;
        this.f5020e = c4915k;
        this.f5018c = c4915k.f24456b.iterator();
        this.f5017b = -1;
    }
}
