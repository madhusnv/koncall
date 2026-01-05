package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p001o.vre;

/* loaded from: classes6.dex */
public final class jef extends kef implements Iterator, n64, sb9 {

    /* renamed from: a */
    public int f30294a;

    /* renamed from: b */
    public Object f30295b;

    /* renamed from: c */
    public Iterator f30296c;

    /* renamed from: d */
    public n64 f30297d;

    @Override // p001o.kef
    /* renamed from: f */
    public Object mo33661f(Object obj, n64 n64Var) {
        this.f30295b = obj;
        this.f30294a = 3;
        this.f30297d = n64Var;
        Object objM51918f = uq8.m51918f();
        if (objM51918f == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM51918f == uq8.m51918f() ? objM51918f : y3i.f54824a;
    }

    @Override // p001o.kef
    /* renamed from: g */
    public Object mo33662g(Iterator it, n64 n64Var) {
        if (!it.hasNext()) {
            return y3i.f54824a;
        }
        this.f30296c = it;
        this.f30294a = 2;
        this.f30297d = n64Var;
        Object objM51918f = uq8.m51918f();
        if (objM51918f == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM51918f == uq8.m51918f() ? objM51918f : y3i.f54824a;
    }

    @Override // p001o.n64
    public q74 getContext() {
        return e66.f21035a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.f30294a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m33663k();
                }
                Iterator it = this.f30296c;
                sq8.m48646e(it);
                if (it.hasNext()) {
                    this.f30294a = 2;
                    return true;
                }
                this.f30296c = null;
            }
            this.f30294a = 5;
            n64 n64Var = this.f30297d;
            sq8.m48646e(n64Var);
            this.f30297d = null;
            vre.C17665a c17665a = vre.f50797b;
            n64Var.resumeWith(vre.m53351b(y3i.f54824a));
        }
    }

    /* renamed from: k */
    public final Throwable m33663k() {
        int i = this.f30294a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f30294a);
    }

    /* renamed from: n */
    public final Object m33664n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i = this.f30294a;
        if (i == 0 || i == 1) {
            return m33664n();
        }
        if (i == 2) {
            this.f30294a = 1;
            Iterator it = this.f30296c;
            sq8.m48646e(it);
            return it.next();
        }
        if (i != 3) {
            throw m33663k();
        }
        this.f30294a = 0;
        Object obj = this.f30295b;
        this.f30295b = null;
        return obj;
    }

    /* renamed from: o */
    public final void m33665o(n64 n64Var) {
        this.f30297d = n64Var;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        wre.m54934b(obj);
        this.f30294a = 4;
    }
}
