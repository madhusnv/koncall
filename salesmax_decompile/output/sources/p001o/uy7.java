package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p001o.alb;

/* loaded from: classes2.dex */
public final class uy7 implements List, sb9 {

    /* renamed from: a */
    public Object[] f49641a = new Object[16];

    /* renamed from: b */
    public long[] f49642b = new long[16];

    /* renamed from: c */
    public int f49643c = -1;

    /* renamed from: d */
    public int f49644d;

    /* renamed from: o.uy7$b */
    public final class C17484b implements List, sb9 {

        /* renamed from: a */
        public final int f49649a;

        /* renamed from: b */
        public final int f49650b;

        public C17484b(int i, int i2) {
            this.f49649a = i;
            this.f49650b = i2;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof alb.AbstractC12216c) {
                return m52153d((alb.AbstractC12216c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((alb.AbstractC12216c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean m52153d(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "element");
            return indexOf(abstractC12216c) != -1;
        }

        @Override // java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public alb.AbstractC12216c get(int i) {
            Object obj = uy7.this.f49641a[i + this.f49649a];
            sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (alb.AbstractC12216c) obj;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof alb.AbstractC12216c) {
                return m52156n((alb.AbstractC12216c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            uy7 uy7Var = uy7.this;
            int i = this.f49649a;
            return uy7Var.new C17483a(i, i, this.f49650b);
        }

        /* renamed from: j */
        public int m52155j() {
            return this.f49650b - this.f49649a;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof alb.AbstractC12216c) {
                return m52157o((alb.AbstractC12216c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            uy7 uy7Var = uy7.this;
            int i = this.f49649a;
            return uy7Var.new C17483a(i, i, this.f49650b);
        }

        /* renamed from: n */
        public int m52156n(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "element");
            int i = this.f49649a;
            int i2 = this.f49650b;
            if (i > i2) {
                return -1;
            }
            while (!sq8.m48644c(uy7.this.f49641a[i], abstractC12216c)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f49649a;
        }

        /* renamed from: o */
        public int m52157o(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "element");
            int i = this.f49650b;
            int i2 = this.f49649a;
            if (i2 > i) {
                return -1;
            }
            while (!sq8.m48644c(uy7.this.f49641a[i], abstractC12216c)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f49649a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m52155j();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            uy7 uy7Var = uy7.this;
            int i3 = this.f49649a;
            return uy7Var.new C17484b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return yg3.m57773a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            uy7 uy7Var = uy7.this;
            int i2 = this.f49649a;
            return uy7Var.new C17483a(i + i2, i2, this.f49650b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            sq8.m48649h(objArr, "array");
            return yg3.m57774b(this, objArr);
        }
    }

    /* renamed from: A */
    public final void m52137A(alb.AbstractC12216c abstractC12216c, boolean z, uk7 uk7Var) {
        sq8.m48649h(abstractC12216c, "node");
        sq8.m48649h(uk7Var, "childHitTest");
        m52138B(abstractC12216c, -1.0f, z, uk7Var);
    }

    /* renamed from: B */
    public final void m52138B(alb.AbstractC12216c abstractC12216c, float f, boolean z, uk7 uk7Var) {
        sq8.m48649h(abstractC12216c, "node");
        sq8.m48649h(uk7Var, "childHitTest");
        int i = this.f49643c;
        this.f49643c = i + 1;
        m52146p();
        Object[] objArr = this.f49641a;
        int i2 = this.f49643c;
        objArr[i2] = abstractC12216c;
        this.f49642b[i2] = vy7.m53602a(f, z);
        m52142J();
        uk7Var.invoke();
        this.f49643c = i;
    }

    /* renamed from: F */
    public int m52139F(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "element");
        int iM21248m = ch3.m21248m(this);
        if (iM21248m < 0) {
            return -1;
        }
        int i = 0;
        while (!sq8.m48644c(this.f49641a[i], abstractC12216c)) {
            if (i == iM21248m) {
                return -1;
            }
            i++;
        }
        return i;
    }

    /* renamed from: G */
    public final boolean m52140G(float f, boolean z) {
        if (this.f49643c == ch3.m21248m(this)) {
            return true;
        }
        return gv5.m29522a(m52147r(), vy7.m53602a(f, z)) > 0;
    }

    /* renamed from: I */
    public int m52141I(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "element");
        for (int iM21248m = ch3.m21248m(this); -1 < iM21248m; iM21248m--) {
            if (sq8.m48644c(this.f49641a[iM21248m], abstractC12216c)) {
                return iM21248m;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public final void m52142J() {
        int i = this.f49643c + 1;
        int iM21248m = ch3.m21248m(this);
        if (i <= iM21248m) {
            while (true) {
                this.f49641a[i] = null;
                if (i == iM21248m) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f49644d = this.f49643c + 1;
    }

    /* renamed from: L */
    public final void m52143L(alb.AbstractC12216c abstractC12216c, float f, boolean z, uk7 uk7Var) {
        sq8.m48649h(abstractC12216c, "node");
        sq8.m48649h(uk7Var, "childHitTest");
        if (this.f49643c == ch3.m21248m(this)) {
            m52138B(abstractC12216c, f, z, uk7Var);
            if (this.f49643c + 1 == ch3.m21248m(this)) {
                m52142J();
                return;
            }
            return;
        }
        long jM52147r = m52147r();
        int i = this.f49643c;
        this.f49643c = ch3.m21248m(this);
        m52138B(abstractC12216c, f, z, uk7Var);
        if (this.f49643c + 1 < ch3.m21248m(this) && gv5.m29522a(jM52147r, m52147r()) > 0) {
            int i2 = this.f49643c + 1;
            int i3 = i + 1;
            Object[] objArr = this.f49641a;
            fp0.m27260i(objArr, objArr, i3, i2, size());
            long[] jArr = this.f49642b;
            fp0.m27259h(jArr, jArr, i3, i2, size());
            this.f49643c = ((size() + i) - this.f49643c) - 1;
        }
        m52142J();
        this.f49643c = i;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f49643c = -1;
        m52142J();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof alb.AbstractC12216c) {
            return m52145o((alb.AbstractC12216c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((alb.AbstractC12216c) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m52144d() {
        this.f49643c = size() - 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof alb.AbstractC12216c) {
            return m52139F((alb.AbstractC12216c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C17483a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof alb.AbstractC12216c) {
            return m52141I((alb.AbstractC12216c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C17483a(this, 0, 0, 0, 7, null);
    }

    /* renamed from: o */
    public boolean m52145o(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "element");
        return indexOf(abstractC12216c) != -1;
    }

    /* renamed from: p */
    public final void m52146p() {
        int i = this.f49643c;
        Object[] objArr = this.f49641a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f49641a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f49642b, length);
            sq8.m48648g(jArrCopyOf, "copyOf(this, newSize)");
            this.f49642b = jArrCopyOf;
        }
    }

    /* renamed from: r */
    public final long m52147r() {
        long jM53602a = vy7.m53602a(Float.POSITIVE_INFINITY, false);
        int i = this.f49643c + 1;
        int iM21248m = ch3.m21248m(this);
        if (i <= iM21248m) {
            while (true) {
                long jM29523b = gv5.m29523b(this.f49642b[i]);
                if (gv5.m29522a(jM29523b, jM53602a) < 0) {
                    jM53602a = jM29523b;
                }
                if (gv5.m29524c(jM53602a) < 0.0f && gv5.m29525d(jM53602a)) {
                    return jM53602a;
                }
                if (i == iM21248m) {
                    break;
                }
                i++;
            }
        }
        return jM53602a;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m52149w();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C17484b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public alb.AbstractC12216c get(int i) {
        Object obj = this.f49641a[i];
        sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (alb.AbstractC12216c) obj;
    }

    /* renamed from: w */
    public int m52149w() {
        return this.f49644d;
    }

    /* renamed from: y */
    public final boolean m52150y() {
        long jM52147r = m52147r();
        return gv5.m29524c(jM52147r) < 0.0f && gv5.m29525d(jM52147r);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new C17483a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }

    /* renamed from: o.uy7$a */
    public final class C17483a implements ListIterator, sb9 {

        /* renamed from: a */
        public int f49645a;

        /* renamed from: b */
        public final int f49646b;

        /* renamed from: c */
        public final int f49647c;

        public C17483a(int i, int i2, int i3) {
            this.f49645a = i;
            this.f49646b = i2;
            this.f49647c = i3;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public alb.AbstractC12216c next() {
            Object[] objArr = uy7.this.f49641a;
            int i = this.f49645a;
            this.f49645a = i + 1;
            Object obj = objArr[i];
            sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (alb.AbstractC12216c) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public alb.AbstractC12216c previous() {
            Object[] objArr = uy7.this.f49641a;
            int i = this.f49645a - 1;
            this.f49645a = i;
            Object obj = objArr[i];
            sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (alb.AbstractC12216c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f49645a < this.f49647c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f49645a > this.f49646b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f49645a - this.f49646b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f49645a - this.f49646b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ C17483a(uy7 uy7Var, int i, int i2, int i3, int i4, id5 id5Var) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? uy7Var.size() : i3);
        }
    }
}
