package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class e69 {

    /* renamed from: o.e69$a */
    public class C13114a extends x7 {

        /* renamed from: c */
        public final /* synthetic */ Iterator f21042c;

        /* renamed from: d */
        public final /* synthetic */ hgd f21043d;

        public C13114a(Iterator it, hgd hgdVar) {
            this.f21042c = it;
            this.f21043d = hgdVar;
        }

        @Override // p001o.x7
        /* renamed from: a */
        public Object mo24393a() {
            while (this.f21042c.hasNext()) {
                Object next = this.f21042c.next();
                if (this.f21043d.apply(next)) {
                    return next;
                }
            }
            return m55754b();
        }
    }

    /* renamed from: o.e69$b */
    public enum EnumC13115b implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            rg3.m46691c(false);
        }
    }

    /* renamed from: o.e69$c */
    public static final class C13116c extends q4i {

        /* renamed from: b */
        public static final Object f21044b = new Object();

        /* renamed from: a */
        public Object f21045a;

        public C13116c(Object obj) {
            this.f21045a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21045a != f21044b;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f21045a;
            Object obj2 = f21044b;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.f21045a = obj2;
            return obj;
        }
    }

    /* renamed from: a */
    public static boolean m24377a(Collection collection, Iterator it) {
        dgd.m23062o(collection);
        dgd.m23062o(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* renamed from: b */
    public static boolean m24378b(Iterator it, hgd hgdVar) {
        return m24388l(it, hgdVar) != -1;
    }

    /* renamed from: c */
    public static void m24379c(Iterator it) {
        dgd.m23062o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: d */
    public static boolean m24380d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m24381e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !r6c.m46255a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: f */
    public static Iterator m24382f() {
        return EnumC13115b.INSTANCE;
    }

    /* renamed from: g */
    public static q4i m24383g(Iterator it, hgd hgdVar) {
        dgd.m23062o(it);
        dgd.m23062o(hgdVar);
        return new C13114a(it, hgdVar);
    }

    /* renamed from: h */
    public static Object m24384h(Iterator it, hgd hgdVar) {
        dgd.m23062o(it);
        dgd.m23062o(hgdVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (hgdVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: i */
    public static Object m24385i(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: j */
    public static Object m24386j(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* renamed from: k */
    public static Object m24387k(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public static int m24388l(Iterator it, hgd hgdVar) {
        dgd.m23063p(hgdVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (hgdVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: m */
    public static Object m24389m(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: n */
    public static boolean m24390n(Iterator it, Collection collection) {
        dgd.m23062o(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o */
    public static boolean m24391o(Iterator it, hgd hgdVar) {
        dgd.m23062o(hgdVar);
        boolean z = false;
        while (it.hasNext()) {
            if (hgdVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public static q4i m24392p(Object obj) {
        return new C13116c(obj);
    }
}
