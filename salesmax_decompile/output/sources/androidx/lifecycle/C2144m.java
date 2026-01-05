package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p001o.bda;
import p001o.bt6;
import p001o.c0f;
import p001o.cqb;
import p001o.id5;
import p001o.s4g;
import p001o.sq8;
import p001o.wca;
import p001o.xca;
import p001o.zca;

/* renamed from: androidx.lifecycle.m */
/* loaded from: classes2.dex */
public class C2144m extends AbstractC2139h {

    /* renamed from: k */
    public static final a f7682k = new a(null);

    /* renamed from: b */
    public final boolean f7683b;

    /* renamed from: c */
    public bt6 f7684c;

    /* renamed from: d */
    public AbstractC2139h.b f7685d;

    /* renamed from: e */
    public final WeakReference f7686e;

    /* renamed from: f */
    public int f7687f;

    /* renamed from: g */
    public boolean f7688g;

    /* renamed from: h */
    public boolean f7689h;

    /* renamed from: i */
    public ArrayList f7690i;

    /* renamed from: j */
    public final cqb f7691j;

    /* renamed from: androidx.lifecycle.m$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2139h.b m6545a(AbstractC2139h.b bVar, AbstractC2139h.b bVar2) {
            sq8.m48649h(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* renamed from: androidx.lifecycle.m$b */
    public static final class b {

        /* renamed from: a */
        public AbstractC2139h.b f7692a;

        /* renamed from: b */
        public InterfaceC2142k f7693b;

        public b(wca wcaVar, AbstractC2139h.b bVar) {
            sq8.m48649h(bVar, "initialState");
            sq8.m48646e(wcaVar);
            this.f7693b = bda.m18654f(wcaVar);
            this.f7692a = bVar;
        }

        /* renamed from: a */
        public final void m6546a(xca xcaVar, AbstractC2139h.a aVar) {
            sq8.m48649h(aVar, "event");
            AbstractC2139h.b targetState = aVar.getTargetState();
            this.f7692a = C2144m.f7682k.m6545a(this.f7692a, targetState);
            InterfaceC2142k interfaceC2142k = this.f7693b;
            sq8.m48646e(xcaVar);
            interfaceC2142k.mo3717o(xcaVar, aVar);
            this.f7692a = targetState;
        }

        /* renamed from: b */
        public final AbstractC2139h.b m6547b() {
            return this.f7692a;
        }
    }

    public C2144m(xca xcaVar, boolean z) {
        this.f7683b = z;
        this.f7684c = new bt6();
        AbstractC2139h.b bVar = AbstractC2139h.b.INITIALIZED;
        this.f7685d = bVar;
        this.f7690i = new ArrayList();
        this.f7686e = new WeakReference(xcaVar);
        this.f7691j = s4g.m47838a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC2139h
    /* renamed from: a */
    public void mo6521a(wca wcaVar) {
        xca xcaVar;
        sq8.m48649h(wcaVar, "observer");
        m6536g("addObserver");
        AbstractC2139h.b bVar = this.f7685d;
        AbstractC2139h.b bVar2 = AbstractC2139h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC2139h.b.INITIALIZED;
        }
        b bVar3 = new b(wcaVar, bVar2);
        if (((b) this.f7684c.mo19712l(wcaVar, bVar3)) == null && (xcaVar = (xca) this.f7686e.get()) != null) {
            boolean z = this.f7687f != 0 || this.f7688g;
            AbstractC2139h.b bVarM6535f = m6535f(wcaVar);
            this.f7687f++;
            while (bVar3.m6547b().compareTo(bVarM6535f) < 0 && this.f7684c.contains(wcaVar)) {
                m6542m(bVar3.m6547b());
                AbstractC2139h.a aVarM6527c = AbstractC2139h.a.Companion.m6527c(bVar3.m6547b());
                if (aVarM6527c == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m6547b());
                }
                bVar3.m6546a(xcaVar, aVarM6527c);
                m6541l();
                bVarM6535f = m6535f(wcaVar);
            }
            if (!z) {
                m6544o();
            }
            this.f7687f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC2139h
    /* renamed from: b */
    public AbstractC2139h.b mo6522b() {
        return this.f7685d;
    }

    @Override // androidx.lifecycle.AbstractC2139h
    /* renamed from: d */
    public void mo6524d(wca wcaVar) {
        sq8.m48649h(wcaVar, "observer");
        m6536g("removeObserver");
        this.f7684c.mo19713m(wcaVar);
    }

    /* renamed from: e */
    public final void m6534e(xca xcaVar) {
        Iterator itDescendingIterator = this.f7684c.descendingIterator();
        sq8.m48648g(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f7689h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            sq8.m48648g(entry, "next()");
            wca wcaVar = (wca) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m6547b().compareTo(this.f7685d) > 0 && !this.f7689h && this.f7684c.contains(wcaVar)) {
                AbstractC2139h.a aVarM6525a = AbstractC2139h.a.Companion.m6525a(bVar.m6547b());
                if (aVarM6525a == null) {
                    throw new IllegalStateException("no event down from " + bVar.m6547b());
                }
                m6542m(aVarM6525a.getTargetState());
                bVar.m6546a(xcaVar, aVarM6525a);
                m6541l();
            }
        }
    }

    /* renamed from: f */
    public final AbstractC2139h.b m6535f(wca wcaVar) {
        b bVar;
        Map.Entry entryM19714n = this.f7684c.m19714n(wcaVar);
        AbstractC2139h.b bVar2 = null;
        AbstractC2139h.b bVarM6547b = (entryM19714n == null || (bVar = (b) entryM19714n.getValue()) == null) ? null : bVar.m6547b();
        if (!this.f7690i.isEmpty()) {
            bVar2 = (AbstractC2139h.b) this.f7690i.get(r0.size() - 1);
        }
        a aVar = f7682k;
        return aVar.m6545a(aVar.m6545a(this.f7685d, bVarM6547b), bVar2);
    }

    /* renamed from: g */
    public final void m6536g(String str) {
        if (!this.f7683b || zca.m59183a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* renamed from: h */
    public final void m6537h(xca xcaVar) {
        c0f.C12527d c12527dM20018e = this.f7684c.m20018e();
        sq8.m48648g(c12527dM20018e, "observerMap.iteratorWithAdditions()");
        while (c12527dM20018e.hasNext() && !this.f7689h) {
            Map.Entry entry = (Map.Entry) c12527dM20018e.next();
            wca wcaVar = (wca) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m6547b().compareTo(this.f7685d) < 0 && !this.f7689h && this.f7684c.contains(wcaVar)) {
                m6542m(bVar.m6547b());
                AbstractC2139h.a aVarM6527c = AbstractC2139h.a.Companion.m6527c(bVar.m6547b());
                if (aVarM6527c == null) {
                    throw new IllegalStateException("no event up from " + bVar.m6547b());
                }
                bVar.m6546a(xcaVar, aVarM6527c);
                m6541l();
            }
        }
    }

    /* renamed from: i */
    public void m6538i(AbstractC2139h.a aVar) {
        sq8.m48649h(aVar, "event");
        m6536g("handleLifecycleEvent");
        m6540k(aVar.getTargetState());
    }

    /* renamed from: j */
    public final boolean m6539j() {
        if (this.f7684c.size() == 0) {
            return true;
        }
        Map.Entry entryM20017b = this.f7684c.m20017b();
        sq8.m48646e(entryM20017b);
        AbstractC2139h.b bVarM6547b = ((b) entryM20017b.getValue()).m6547b();
        Map.Entry entryM20019i = this.f7684c.m20019i();
        sq8.m48646e(entryM20019i);
        AbstractC2139h.b bVarM6547b2 = ((b) entryM20019i.getValue()).m6547b();
        return bVarM6547b == bVarM6547b2 && this.f7685d == bVarM6547b2;
    }

    /* renamed from: k */
    public final void m6540k(AbstractC2139h.b bVar) {
        AbstractC2139h.b bVar2 = this.f7685d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == AbstractC2139h.b.INITIALIZED && bVar == AbstractC2139h.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f7685d + " in component " + this.f7686e.get()).toString());
        }
        this.f7685d = bVar;
        if (this.f7688g || this.f7687f != 0) {
            this.f7689h = true;
            return;
        }
        this.f7688g = true;
        m6544o();
        this.f7688g = false;
        if (this.f7685d == AbstractC2139h.b.DESTROYED) {
            this.f7684c = new bt6();
        }
    }

    /* renamed from: l */
    public final void m6541l() {
        this.f7690i.remove(r0.size() - 1);
    }

    /* renamed from: m */
    public final void m6542m(AbstractC2139h.b bVar) {
        this.f7690i.add(bVar);
    }

    /* renamed from: n */
    public void m6543n(AbstractC2139h.b bVar) {
        sq8.m48649h(bVar, "state");
        m6536g("setCurrentState");
        m6540k(bVar);
    }

    /* renamed from: o */
    public final void m6544o() {
        xca xcaVar = (xca) this.f7686e.get();
        if (xcaVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m6539j()) {
            this.f7689h = false;
            AbstractC2139h.b bVar = this.f7685d;
            Map.Entry entryM20017b = this.f7684c.m20017b();
            sq8.m48646e(entryM20017b);
            if (bVar.compareTo(((b) entryM20017b.getValue()).m6547b()) < 0) {
                m6534e(xcaVar);
            }
            Map.Entry entryM20019i = this.f7684c.m20019i();
            if (!this.f7689h && entryM20019i != null && this.f7685d.compareTo(((b) entryM20019i.getValue()).m6547b()) > 0) {
                m6537h(xcaVar);
            }
        }
        this.f7689h = false;
        this.f7691j.setValue(mo6522b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2144m(xca xcaVar) {
        this(xcaVar, true);
        sq8.m48649h(xcaVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
    }
}
