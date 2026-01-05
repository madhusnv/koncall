package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k72 {

    /* renamed from: o.k72$a */
    public static final class C14722a extends j72 {

        /* renamed from: a */
        public final List f31566a = new ArrayList();

        public C14722a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j72 j72Var = (j72) it.next();
                if (!(j72Var instanceof C14723b)) {
                    this.f31566a.add(j72Var);
                }
            }
        }

        @Override // p001o.j72
        /* renamed from: a */
        public void mo18247a(int i) {
            Iterator it = this.f31566a.iterator();
            while (it.hasNext()) {
                ((j72) it.next()).mo18247a(i);
            }
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            Iterator it = this.f31566a.iterator();
            while (it.hasNext()) {
                ((j72) it.next()).mo4682b(i, u72Var);
            }
        }

        @Override // p001o.j72
        /* renamed from: c */
        public void mo18248c(int i, l72 l72Var) {
            Iterator it = this.f31566a.iterator();
            while (it.hasNext()) {
                ((j72) it.next()).mo18248c(i, l72Var);
            }
        }

        @Override // p001o.j72
        /* renamed from: d */
        public void mo33322d(int i) {
            Iterator it = this.f31566a.iterator();
            while (it.hasNext()) {
                ((j72) it.next()).mo33322d(i);
            }
        }

        /* renamed from: e */
        public List m35093e() {
            return this.f31566a;
        }
    }

    /* renamed from: o.k72$b */
    public static final class C14723b extends j72 {
        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
        }

        @Override // p001o.j72
        /* renamed from: c */
        public void mo18248c(int i, l72 l72Var) {
        }

        @Override // p001o.j72
        /* renamed from: d */
        public void mo33322d(int i) {
        }
    }

    /* renamed from: a */
    public static j72 m35090a(List list) {
        return list.isEmpty() ? m35092c() : list.size() == 1 ? (j72) list.get(0) : new C14722a(list);
    }

    /* renamed from: b */
    public static j72 m35091b(j72... j72VarArr) {
        return m35090a(Arrays.asList(j72VarArr));
    }

    /* renamed from: c */
    public static j72 m35092c() {
        return new C14723b();
    }
}
