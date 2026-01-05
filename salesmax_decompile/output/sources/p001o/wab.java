package p001o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class wab {

    /* renamed from: a */
    public final Runnable f51696a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f51697b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f51698c = new HashMap();

    /* renamed from: o.wab$a */
    public static class C17805a {

        /* renamed from: a */
        public final AbstractC2139h f51699a;

        /* renamed from: b */
        public InterfaceC2142k f51700b;

        public C17805a(AbstractC2139h abstractC2139h, InterfaceC2142k interfaceC2142k) {
            this.f51699a = abstractC2139h;
            this.f51700b = interfaceC2142k;
            abstractC2139h.mo6521a(interfaceC2142k);
        }

        /* renamed from: a */
        public void m54148a() {
            this.f51699a.mo6524d(this.f51700b);
            this.f51700b = null;
        }
    }

    public wab(Runnable runnable) {
        this.f51696a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m54138f(bbb bbbVar, xca xcaVar, AbstractC2139h.a aVar) {
        if (aVar == AbstractC2139h.a.ON_DESTROY) {
            m54147l(bbbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m54139g(AbstractC2139h.b bVar, bbb bbbVar, xca xcaVar, AbstractC2139h.a aVar) {
        if (aVar == AbstractC2139h.a.upTo(bVar)) {
            m54140c(bbbVar);
            return;
        }
        if (aVar == AbstractC2139h.a.ON_DESTROY) {
            m54147l(bbbVar);
        } else if (aVar == AbstractC2139h.a.downFrom(bVar)) {
            this.f51697b.remove(bbbVar);
            this.f51696a.run();
        }
    }

    /* renamed from: c */
    public void m54140c(bbb bbbVar) {
        this.f51697b.add(bbbVar);
        this.f51696a.run();
    }

    /* renamed from: d */
    public void m54141d(final bbb bbbVar, xca xcaVar) {
        m54140c(bbbVar);
        AbstractC2139h lifecycle = xcaVar.getLifecycle();
        C17805a c17805a = (C17805a) this.f51698c.remove(bbbVar);
        if (c17805a != null) {
            c17805a.m54148a();
        }
        this.f51698c.put(bbbVar, new C17805a(lifecycle, new InterfaceC2142k() { // from class: o.uab
            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public final void mo3717o(xca xcaVar2, AbstractC2139h.a aVar) {
                this.f48644a.m54138f(bbbVar, xcaVar2, aVar);
            }
        }));
    }

    /* renamed from: e */
    public void m54142e(final bbb bbbVar, xca xcaVar, final AbstractC2139h.b bVar) {
        AbstractC2139h lifecycle = xcaVar.getLifecycle();
        C17805a c17805a = (C17805a) this.f51698c.remove(bbbVar);
        if (c17805a != null) {
            c17805a.m54148a();
        }
        this.f51698c.put(bbbVar, new C17805a(lifecycle, new InterfaceC2142k() { // from class: o.vab
            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public final void mo3717o(xca xcaVar2, AbstractC2139h.a aVar) {
                this.f50076a.m54139g(bVar, bbbVar, xcaVar2, aVar);
            }
        }));
    }

    /* renamed from: h */
    public void m54143h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f51697b.iterator();
        while (it.hasNext()) {
            ((bbb) it.next()).mo6225d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void m54144i(Menu menu) {
        Iterator it = this.f51697b.iterator();
        while (it.hasNext()) {
            ((bbb) it.next()).mo6222a(menu);
        }
    }

    /* renamed from: j */
    public boolean m54145j(MenuItem menuItem) {
        Iterator it = this.f51697b.iterator();
        while (it.hasNext()) {
            if (((bbb) it.next()).mo6224c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m54146k(Menu menu) {
        Iterator it = this.f51697b.iterator();
        while (it.hasNext()) {
            ((bbb) it.next()).mo6223b(menu);
        }
    }

    /* renamed from: l */
    public void m54147l(bbb bbbVar) {
        this.f51697b.remove(bbbVar);
        C17805a c17805a = (C17805a) this.f51698c.remove(bbbVar);
        if (c17805a != null) {
            c17805a.m54148a();
        }
        this.f51696a.run();
    }
}
