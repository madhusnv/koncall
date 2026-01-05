package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class xef {

    /* renamed from: o.xef$a */
    public static final class C18130a implements Iterator, sb9 {

        /* renamed from: a */
        public int f53653a;

        /* renamed from: b */
        public final /* synthetic */ uef f53654b;

        public C18130a(uef uefVar) {
            this.f53654b = uefVar;
            this.f53653a = uefVar.mo16762d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public uef next() {
            uef uefVar = this.f53654b;
            int iMo16762d = uefVar.mo16762d();
            int i = this.f53653a;
            this.f53653a = i - 1;
            return uefVar.mo16765g(iMo16762d - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53653a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.xef$b */
    public static final class C18131b implements Iterator, sb9 {

        /* renamed from: a */
        public int f53655a;

        /* renamed from: b */
        public final /* synthetic */ uef f53656b;

        public C18131b(uef uefVar) {
            this.f53656b = uefVar;
            this.f53655a = uefVar.mo16762d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            uef uefVar = this.f53656b;
            int iMo16762d = uefVar.mo16762d();
            int i = this.f53655a;
            this.f53655a = i - 1;
            return uefVar.mo16763e(iMo16762d - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53655a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.xef$c */
    public static final class C18132c implements Iterable, sb9 {

        /* renamed from: a */
        public final /* synthetic */ uef f53657a;

        public C18132c(uef uefVar) {
            this.f53657a = uefVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C18130a(this.f53657a);
        }
    }

    /* renamed from: o.xef$d */
    public static final class C18133d implements Iterable, sb9 {

        /* renamed from: a */
        public final /* synthetic */ uef f53658a;

        public C18133d(uef uefVar) {
            this.f53658a = uefVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C18131b(this.f53658a);
        }
    }

    /* renamed from: a */
    public static final Iterable m56192a(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        return new C18132c(uefVar);
    }

    /* renamed from: b */
    public static final Iterable m56193b(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        return new C18133d(uefVar);
    }
}
