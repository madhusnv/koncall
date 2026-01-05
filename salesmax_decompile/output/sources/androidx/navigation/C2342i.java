package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.AbstractC2341h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001o.ch3;
import p001o.d0g;
import p001o.e9g;
import p001o.f0g;
import p001o.f9g;
import p001o.id5;
import p001o.ief;
import p001o.kf9;
import p001o.kh3;
import p001o.oef;
import p001o.qef;
import p001o.sb9;
import p001o.sq8;
import p001o.tae;
import p001o.xk7;
import p001o.y3i;
import p001o.yrb;

/* renamed from: androidx.navigation.i */
/* loaded from: classes2.dex */
public class C2342i extends AbstractC2341h implements Iterable, sb9 {

    /* renamed from: X */
    public static final a f9625X = new a(null);

    /* renamed from: H */
    public final d0g f9626H;

    /* renamed from: L */
    public int f9627L;

    /* renamed from: M */
    public String f9628M;

    /* renamed from: Q */
    public String f9629Q;

    /* renamed from: androidx.navigation.i$a */
    public static final class a {

        /* renamed from: androidx.navigation.i$a$a, reason: collision with other inner class name */
        public static final class C19575a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C19575a f9630a = new C19575a();

            public C19575a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2341h invoke(AbstractC2341h abstractC2341h) {
                sq8.m48649h(abstractC2341h, "it");
                if (!(abstractC2341h instanceof C2342i)) {
                    return null;
                }
                C2342i c2342i = (C2342i) abstractC2341h;
                return c2342i.m8784W(c2342i.e0());
            }
        }

        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ief m8787a(C2342i c2342i) {
            sq8.m48649h(c2342i, "<this>");
            return oef.m42147f(c2342i, C19575a.f9630a);
        }

        /* renamed from: b */
        public final AbstractC2341h m8788b(C2342i c2342i) {
            sq8.m48649h(c2342i, "<this>");
            return (AbstractC2341h) qef.m45318u(m8787a(c2342i));
        }
    }

    /* renamed from: androidx.navigation.i$b */
    public static final class b implements Iterator, sb9 {

        /* renamed from: a */
        public int f9631a = -1;

        /* renamed from: b */
        public boolean f9632b;

        public b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2341h next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f9632b = true;
            d0g d0gVarC0 = C2342i.this.c0();
            int i = this.f9631a + 1;
            this.f9631a = i;
            return (AbstractC2341h) d0gVarC0.m22194q(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9631a + 1 < C2342i.this.c0().m22193p();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9632b) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            d0g d0gVarC0 = C2342i.this.c0();
            ((AbstractC2341h) d0gVarC0.m22194q(this.f9631a)).m8764S(null);
            d0gVarC0.m22191m(this.f9631a);
            this.f9631a--;
            this.f9632b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342i(AbstractC2348o abstractC2348o) {
        super(abstractC2348o);
        sq8.m48649h(abstractC2348o, "navGraphNavigator");
        this.f9626H = new d0g(0, 1, null);
    }

    public static /* synthetic */ AbstractC2341h b0(C2342i c2342i, int i, AbstractC2341h abstractC2341h, boolean z, AbstractC2341h abstractC2341h2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i2 & 8) != 0) {
            abstractC2341h2 = null;
        }
        return c2342i.a0(i, abstractC2341h, z, abstractC2341h2);
    }

    @Override // androidx.navigation.AbstractC2341h
    /* renamed from: M */
    public AbstractC2341h.b mo8760M(yrb yrbVar) {
        sq8.m48649h(yrbVar, "navDeepLinkRequest");
        return g0(yrbVar, true, false, this);
    }

    @Override // androidx.navigation.AbstractC2341h
    /* renamed from: O */
    public void mo8532O(Context context, AttributeSet attributeSet) {
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        super.mo8532O(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, tae.NavGraphNavigator);
        sq8.m48648g(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        h0(typedArrayObtainAttributes.getResourceId(tae.NavGraphNavigator_startDestination, 0));
        this.f9628M = AbstractC2341h.f9602x.m8775b(context, this.f9627L);
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: V */
    public final void m8783V(AbstractC2341h abstractC2341h) {
        sq8.m48649h(abstractC2341h, "node");
        int iM8753A = abstractC2341h.m8753A();
        if (!((iM8753A == 0 && abstractC2341h.m8757I() == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (m8757I() != null && !(!sq8.m48644c(r1, m8757I()))) {
            throw new IllegalArgumentException(("Destination " + abstractC2341h + " cannot have the same route as graph " + this).toString());
        }
        if (!(iM8753A != m8753A())) {
            throw new IllegalArgumentException(("Destination " + abstractC2341h + " cannot have the same id as graph " + this).toString());
        }
        AbstractC2341h abstractC2341h2 = (AbstractC2341h) this.f9626H.m22184f(iM8753A);
        if (abstractC2341h2 == abstractC2341h) {
            return;
        }
        if (!(abstractC2341h.m8756G() == null)) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (abstractC2341h2 != null) {
            abstractC2341h2.m8764S(null);
        }
        abstractC2341h.m8764S(this);
        this.f9626H.m22190l(abstractC2341h.m8753A(), abstractC2341h);
    }

    /* renamed from: W */
    public final AbstractC2341h m8784W(int i) {
        return b0(this, i, this, false, null, 8, null);
    }

    /* renamed from: Y */
    public final AbstractC2341h m8785Y(String str) {
        if (str == null || f9g.d0(str)) {
            return null;
        }
        return m8786Z(str, true);
    }

    /* renamed from: Z */
    public final AbstractC2341h m8786Z(String str, boolean z) {
        Object next;
        sq8.m48649h(str, "route");
        Iterator it = oef.m42144c(f0g.m25922b(this.f9626H)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC2341h abstractC2341h = (AbstractC2341h) next;
            boolean z2 = false;
            if (e9g.m24607y(abstractC2341h.m8757I(), str, false, 2, null) || abstractC2341h.m8761N(str) != null) {
                z2 = true;
            }
            if (z2) {
                break;
            }
        }
        AbstractC2341h abstractC2341h2 = (AbstractC2341h) next;
        if (abstractC2341h2 != null) {
            return abstractC2341h2;
        }
        if (!z || m8756G() == null) {
            return null;
        }
        C2342i c2342iM8756G = m8756G();
        sq8.m48646e(c2342iM8756G);
        return c2342iM8756G.m8785Y(str);
    }

    public final AbstractC2341h a0(int i, AbstractC2341h abstractC2341h, boolean z, AbstractC2341h abstractC2341h2) {
        AbstractC2341h abstractC2341h3 = (AbstractC2341h) this.f9626H.m22184f(i);
        if (abstractC2341h2 != null) {
            if (sq8.m48644c(abstractC2341h3, abstractC2341h2) && sq8.m48644c(abstractC2341h3.m8756G(), abstractC2341h2.m8756G())) {
                return abstractC2341h3;
            }
            abstractC2341h3 = null;
        } else if (abstractC2341h3 != null) {
            return abstractC2341h3;
        }
        if (z) {
            Iterator it = oef.m42144c(f0g.m25922b(this.f9626H)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC2341h3 = null;
                    break;
                }
                AbstractC2341h abstractC2341h4 = (AbstractC2341h) it.next();
                AbstractC2341h abstractC2341hA0 = (!(abstractC2341h4 instanceof C2342i) || sq8.m48644c(abstractC2341h4, abstractC2341h)) ? null : ((C2342i) abstractC2341h4).a0(i, this, true, abstractC2341h2);
                if (abstractC2341hA0 != null) {
                    abstractC2341h3 = abstractC2341hA0;
                    break;
                }
            }
        }
        if (abstractC2341h3 != null) {
            return abstractC2341h3;
        }
        if (m8756G() == null || sq8.m48644c(m8756G(), abstractC2341h)) {
            return null;
        }
        C2342i c2342iM8756G = m8756G();
        sq8.m48646e(c2342iM8756G);
        return c2342iM8756G.a0(i, this, z, abstractC2341h2);
    }

    public final d0g c0() {
        return this.f9626H;
    }

    public final String d0() {
        if (this.f9628M == null) {
            String strValueOf = this.f9629Q;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f9627L);
            }
            this.f9628M = strValueOf;
        }
        String str = this.f9628M;
        sq8.m48646e(str);
        return str;
    }

    public final int e0() {
        return this.f9627L;
    }

    @Override // androidx.navigation.AbstractC2341h
    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2342i)) {
            return false;
        }
        if (super.equals(obj)) {
            C2342i c2342i = (C2342i) obj;
            if (this.f9626H.m22193p() == c2342i.f9626H.m22193p() && e0() == c2342i.e0()) {
                Iterator it = oef.m42144c(f0g.m25922b(this.f9626H)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    AbstractC2341h abstractC2341h = (AbstractC2341h) it.next();
                    if (!sq8.m48644c(abstractC2341h, c2342i.f9626H.m22184f(abstractC2341h.m8753A()))) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f0() {
        return this.f9629Q;
    }

    public final AbstractC2341h.b g0(yrb yrbVar, boolean z, boolean z2, AbstractC2341h abstractC2341h) {
        AbstractC2341h.b bVar;
        sq8.m48649h(yrbVar, "navDeepLinkRequest");
        sq8.m48649h(abstractC2341h, "lastVisited");
        AbstractC2341h.b bVarMo8760M = super.mo8760M(yrbVar);
        AbstractC2341h.b bVarG0 = null;
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                AbstractC2341h abstractC2341h2 = (AbstractC2341h) it.next();
                AbstractC2341h.b bVarMo8760M2 = !sq8.m48644c(abstractC2341h2, abstractC2341h) ? abstractC2341h2.mo8760M(yrbVar) : null;
                if (bVarMo8760M2 != null) {
                    arrayList.add(bVarMo8760M2);
                }
            }
            bVar = (AbstractC2341h.b) kh3.t0(arrayList);
        } else {
            bVar = null;
        }
        C2342i c2342iM8756G = m8756G();
        if (c2342iM8756G != null && z2 && !sq8.m48644c(c2342iM8756G, abstractC2341h)) {
            bVarG0 = c2342iM8756G.g0(yrbVar, z, true, this);
        }
        return (AbstractC2341h.b) kh3.t0(ch3.m21251p(bVarMo8760M, bVar, bVarG0));
    }

    public final void h0(int i) {
        if (i != m8753A()) {
            if (this.f9629Q != null) {
                i0(null);
            }
            this.f9627L = i;
            this.f9628M = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    @Override // androidx.navigation.AbstractC2341h
    public int hashCode() {
        int iE0 = e0();
        d0g d0gVar = this.f9626H;
        int iM22193p = d0gVar.m22193p();
        for (int i = 0; i < iM22193p; i++) {
            iE0 = (((iE0 * 31) + d0gVar.m22189k(i)) * 31) + ((AbstractC2341h) d0gVar.m22194q(i)).hashCode();
        }
        return iE0;
    }

    public final void i0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!sq8.m48644c(str, m8757I()))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!f9g.d0(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = AbstractC2341h.f9602x.m8774a(str).hashCode();
        }
        this.f9627L = iHashCode;
        this.f9629Q = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b();
    }

    @Override // androidx.navigation.AbstractC2341h
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        AbstractC2341h abstractC2341hM8785Y = m8785Y(this.f9629Q);
        if (abstractC2341hM8785Y == null) {
            abstractC2341hM8785Y = m8784W(e0());
        }
        sb.append(" startDestination=");
        if (abstractC2341hM8785Y == null) {
            String str = this.f9629Q;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f9628M;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f9627L));
                }
            }
        } else {
            sb.append("{");
            sb.append(abstractC2341hM8785Y.toString());
            sb.append("}");
        }
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    @Override // androidx.navigation.AbstractC2341h
    /* renamed from: y */
    public String mo8773y() {
        return m8753A() != 0 ? super.mo8773y() : "the root navigation";
    }
}
