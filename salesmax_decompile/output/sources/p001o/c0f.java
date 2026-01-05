package p001o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class c0f implements Iterable {

    /* renamed from: a */
    public C12526c f17068a;

    /* renamed from: b */
    public C12526c f17069b;

    /* renamed from: c */
    public final WeakHashMap f17070c = new WeakHashMap();

    /* renamed from: d */
    public int f17071d = 0;

    /* renamed from: o.c0f$a */
    public static class C12524a extends AbstractC12528e {
        public C12524a(C12526c c12526c, C12526c c12526c2) {
            super(c12526c, c12526c2);
        }

        @Override // p001o.c0f.AbstractC12528e
        /* renamed from: b */
        public C12526c mo20021b(C12526c c12526c) {
            return c12526c.f17075d;
        }

        @Override // p001o.c0f.AbstractC12528e
        /* renamed from: e */
        public C12526c mo20022e(C12526c c12526c) {
            return c12526c.f17074c;
        }
    }

    /* renamed from: o.c0f$b */
    public static class C12525b extends AbstractC12528e {
        public C12525b(C12526c c12526c, C12526c c12526c2) {
            super(c12526c, c12526c2);
        }

        @Override // p001o.c0f.AbstractC12528e
        /* renamed from: b */
        public C12526c mo20021b(C12526c c12526c) {
            return c12526c.f17074c;
        }

        @Override // p001o.c0f.AbstractC12528e
        /* renamed from: e */
        public C12526c mo20022e(C12526c c12526c) {
            return c12526c.f17075d;
        }
    }

    /* renamed from: o.c0f$c */
    public static class C12526c implements Map.Entry {

        /* renamed from: a */
        public final Object f17072a;

        /* renamed from: b */
        public final Object f17073b;

        /* renamed from: c */
        public C12526c f17074c;

        /* renamed from: d */
        public C12526c f17075d;

        public C12526c(Object obj, Object obj2) {
            this.f17072a = obj;
            this.f17073b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C12526c)) {
                return false;
            }
            C12526c c12526c = (C12526c) obj;
            return this.f17072a.equals(c12526c.f17072a) && this.f17073b.equals(c12526c.f17073b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f17072a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f17073b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f17072a.hashCode() ^ this.f17073b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f17072a + "=" + this.f17073b;
        }
    }

    /* renamed from: o.c0f$d */
    public class C12527d extends AbstractC12529f implements Iterator {

        /* renamed from: a */
        public C12526c f17076a;

        /* renamed from: b */
        public boolean f17077b = true;

        public C12527d() {
        }

        @Override // p001o.c0f.AbstractC12529f
        /* renamed from: a */
        public void mo20023a(C12526c c12526c) {
            C12526c c12526c2 = this.f17076a;
            if (c12526c == c12526c2) {
                C12526c c12526c3 = c12526c2.f17075d;
                this.f17076a = c12526c3;
                this.f17077b = c12526c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f17077b) {
                this.f17077b = false;
                this.f17076a = c0f.this.f17068a;
            } else {
                C12526c c12526c = this.f17076a;
                this.f17076a = c12526c != null ? c12526c.f17074c : null;
            }
            return this.f17076a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f17077b) {
                return c0f.this.f17068a != null;
            }
            C12526c c12526c = this.f17076a;
            return (c12526c == null || c12526c.f17074c == null) ? false : true;
        }
    }

    /* renamed from: o.c0f$e */
    public static abstract class AbstractC12528e extends AbstractC12529f implements Iterator {

        /* renamed from: a */
        public C12526c f17079a;

        /* renamed from: b */
        public C12526c f17080b;

        public AbstractC12528e(C12526c c12526c, C12526c c12526c2) {
            this.f17079a = c12526c2;
            this.f17080b = c12526c;
        }

        @Override // p001o.c0f.AbstractC12529f
        /* renamed from: a */
        public void mo20023a(C12526c c12526c) {
            if (this.f17079a == c12526c && c12526c == this.f17080b) {
                this.f17080b = null;
                this.f17079a = null;
            }
            C12526c c12526c2 = this.f17079a;
            if (c12526c2 == c12526c) {
                this.f17079a = mo20021b(c12526c2);
            }
            if (this.f17080b == c12526c) {
                this.f17080b = m20026g();
            }
        }

        /* renamed from: b */
        public abstract C12526c mo20021b(C12526c c12526c);

        /* renamed from: e */
        public abstract C12526c mo20022e(C12526c c12526c);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            C12526c c12526c = this.f17080b;
            this.f17080b = m20026g();
            return c12526c;
        }

        /* renamed from: g */
        public final C12526c m20026g() {
            C12526c c12526c = this.f17080b;
            C12526c c12526c2 = this.f17079a;
            if (c12526c == c12526c2 || c12526c2 == null) {
                return null;
            }
            return mo20022e(c12526c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17080b != null;
        }
    }

    /* renamed from: o.c0f$f */
    public static abstract class AbstractC12529f {
        /* renamed from: a */
        public abstract void mo20023a(C12526c c12526c);
    }

    /* renamed from: b */
    public Map.Entry m20017b() {
        return this.f17068a;
    }

    /* renamed from: d */
    public C12526c mo19711d(Object obj) {
        C12526c c12526c = this.f17068a;
        while (c12526c != null && !c12526c.f17072a.equals(obj)) {
            c12526c = c12526c.f17074c;
        }
        return c12526c;
    }

    public Iterator descendingIterator() {
        C12525b c12525b = new C12525b(this.f17069b, this.f17068a);
        this.f17070c.put(c12525b, Boolean.FALSE);
        return c12525b;
    }

    /* renamed from: e */
    public C12527d m20018e() {
        C12527d c12527d = new C12527d();
        this.f17070c.put(c12527d, Boolean.FALSE);
        return c12527d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0f)) {
            return false;
        }
        c0f c0fVar = (c0f) obj;
        if (size() != c0fVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0fVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* renamed from: i */
    public Map.Entry m20019i() {
        return this.f17069b;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C12524a c12524a = new C12524a(this.f17068a, this.f17069b);
        this.f17070c.put(c12524a, Boolean.FALSE);
        return c12524a;
    }

    /* renamed from: j */
    public C12526c m20020j(Object obj, Object obj2) {
        C12526c c12526c = new C12526c(obj, obj2);
        this.f17071d++;
        C12526c c12526c2 = this.f17069b;
        if (c12526c2 == null) {
            this.f17068a = c12526c;
            this.f17069b = c12526c;
            return c12526c;
        }
        c12526c2.f17074c = c12526c;
        c12526c.f17075d = c12526c2;
        this.f17069b = c12526c;
        return c12526c;
    }

    /* renamed from: l */
    public Object mo19712l(Object obj, Object obj2) {
        C12526c c12526cMo19711d = mo19711d(obj);
        if (c12526cMo19711d != null) {
            return c12526cMo19711d.f17073b;
        }
        m20020j(obj, obj2);
        return null;
    }

    /* renamed from: m */
    public Object mo19713m(Object obj) {
        C12526c c12526cMo19711d = mo19711d(obj);
        if (c12526cMo19711d == null) {
            return null;
        }
        this.f17071d--;
        if (!this.f17070c.isEmpty()) {
            Iterator it = this.f17070c.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC12529f) it.next()).mo20023a(c12526cMo19711d);
            }
        }
        C12526c c12526c = c12526cMo19711d.f17075d;
        if (c12526c != null) {
            c12526c.f17074c = c12526cMo19711d.f17074c;
        } else {
            this.f17068a = c12526cMo19711d.f17074c;
        }
        C12526c c12526c2 = c12526cMo19711d.f17074c;
        if (c12526c2 != null) {
            c12526c2.f17075d = c12526c;
        } else {
            this.f17069b = c12526c;
        }
        c12526cMo19711d.f17074c = null;
        c12526cMo19711d.f17075d = null;
        return c12526cMo19711d.f17073b;
    }

    public int size() {
        return this.f17071d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
