package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class qef extends pef {

    /* renamed from: o.qef$a */
    public static final class C16368a implements Iterable, sb9 {

        /* renamed from: a */
        public final /* synthetic */ ief f41801a;

        public C16368a(ief iefVar) {
            this.f41801a = iefVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f41801a.iterator();
        }
    }

    /* renamed from: o.qef$b */
    public static final class C16369b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16369b f41802a = new C16369b();

        public C16369b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    /* renamed from: o.qef$c */
    public static final class C16370c implements ief {

        /* renamed from: a */
        public final /* synthetic */ ief f41803a;

        /* renamed from: b */
        public final /* synthetic */ Comparator f41804b;

        public C16370c(ief iefVar, Comparator comparator) {
            this.f41803a = iefVar;
            this.f41804b = comparator;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            List listM45303B = qef.m45303B(this.f41803a);
            gh3.m28657z(listM45303B, this.f41804b);
            return listM45303B.iterator();
        }
    }

    /* renamed from: A */
    public static final List m45302A(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        Iterator it = iefVar.iterator();
        if (!it.hasNext()) {
            return ch3.m21246k();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return bh3.m18963e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: B */
    public static final List m45303B(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        return (List) m45323z(iefVar, new ArrayList());
    }

    /* renamed from: C */
    public static final Set m45304C(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        Iterator it = iefVar.iterator();
        if (!it.hasNext()) {
            return nif.m40664e();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return mif.m39137d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    /* renamed from: D */
    public static final ief m45305D(ief iefVar, ief iefVar2, nl7 nl7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(iefVar2, "other");
        sq8.m48649h(nl7Var, "transform");
        return new nbb(iefVar, iefVar2, nl7Var);
    }

    /* renamed from: i */
    public static final boolean m45306i(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        return iefVar.iterator().hasNext();
    }

    /* renamed from: j */
    public static final Iterable m45307j(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        return new C16368a(iefVar);
    }

    /* renamed from: k */
    public static final boolean m45308k(ief iefVar, Object obj) {
        sq8.m48649h(iefVar, "<this>");
        return m45314q(iefVar, obj) >= 0;
    }

    /* renamed from: l */
    public static final ief m45309l(ief iefVar, int i) {
        sq8.m48649h(iefVar, "<this>");
        if (i >= 0) {
            return i == 0 ? iefVar : iefVar instanceof wz5 ? ((wz5) iefVar).mo46251a(i) : new sz5(iefVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: m */
    public static final ief m45310m(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return new h07(iefVar, true, xk7Var);
    }

    /* renamed from: n */
    public static final ief m45311n(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return new h07(iefVar, false, xk7Var);
    }

    /* renamed from: o */
    public static final ief m45312o(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        ief iefVarM45311n = m45311n(iefVar, C16369b.f41802a);
        sq8.m48647f(iefVarM45311n, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iefVarM45311n;
    }

    /* renamed from: p */
    public static final Object m45313p(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        Iterator it = iefVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: q */
    public static final int m45314q(ief iefVar, Object obj) {
        sq8.m48649h(iefVar, "<this>");
        int i = 0;
        for (Object obj2 : iefVar) {
            if (i < 0) {
                ch3.m21256u();
            }
            if (sq8.m48644c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: r */
    public static final Appendable m45315r(ief iefVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(appendable, "buffer");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iefVar) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.m54067a(appendable, obj, xk7Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: s */
    public static final String m45316s(ief iefVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) m45315r(iefVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: t */
    public static /* synthetic */ String m45317t(ief iefVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            xk7Var = null;
        }
        return m45316s(iefVar, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }

    /* renamed from: u */
    public static final Object m45318u(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        Iterator it = iefVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: v */
    public static final ief m45319v(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(xk7Var, "transform");
        return new evh(iefVar, xk7Var);
    }

    /* renamed from: w */
    public static final ief m45320w(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(xk7Var, "transform");
        return m45312o(new evh(iefVar, xk7Var));
    }

    /* renamed from: x */
    public static final ief m45321x(ief iefVar, Comparator comparator) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(comparator, "comparator");
        return new C16370c(iefVar, comparator);
    }

    /* renamed from: y */
    public static final ief m45322y(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return new ojg(iefVar, xk7Var);
    }

    /* renamed from: z */
    public static final Collection m45323z(ief iefVar, Collection collection) {
        sq8.m48649h(iefVar, "<this>");
        sq8.m48649h(collection, FirebaseAnalytics.Param.DESTINATION);
        Iterator it = iefVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }
}
