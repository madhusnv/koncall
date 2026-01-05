package p001o;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p001o.ebc;

/* loaded from: classes2.dex */
public final class ebc {

    /* renamed from: a */
    public final Runnable f21302a;

    /* renamed from: b */
    public final hu3 f21303b;

    /* renamed from: c */
    public final oo0 f21304c;

    /* renamed from: d */
    public dbc f21305d;

    /* renamed from: e */
    public OnBackInvokedCallback f21306e;

    /* renamed from: f */
    public OnBackInvokedDispatcher f21307f;

    /* renamed from: g */
    public boolean f21308g;

    /* renamed from: h */
    public boolean f21309h;

    /* renamed from: o.ebc$a */
    public static final class C13143a extends kf9 implements xk7 {
        public C13143a() {
            super(1);
        }

        /* renamed from: a */
        public final void m24721a(l91 l91Var) {
            sq8.m48649h(l91Var, "backEvent");
            ebc.this.m24717n(l91Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m24721a((l91) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ebc$b */
    public static final class C13144b extends kf9 implements xk7 {
        public C13144b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24722a(l91 l91Var) {
            sq8.m48649h(l91Var, "backEvent");
            ebc.this.m24716m(l91Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m24722a((l91) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ebc$c */
    public static final class C13145c extends kf9 implements uk7 {
        public C13145c() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68999invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68999invoke() {
            ebc.this.m24715l();
        }
    }

    /* renamed from: o.ebc$d */
    public static final class C13146d extends kf9 implements uk7 {
        public C13146d() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69000invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69000invoke() {
            ebc.this.m24714k();
        }
    }

    /* renamed from: o.ebc$e */
    public static final class C13147e extends kf9 implements uk7 {
        public C13147e() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69001invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69001invoke() {
            ebc.this.m24715l();
        }
    }

    /* renamed from: o.ebc$f */
    public static final class C13148f {

        /* renamed from: a */
        public static final C13148f f21315a = new C13148f();

        /* renamed from: c */
        public static final void m24724c(uk7 uk7Var) {
            sq8.m48649h(uk7Var, "$onBackInvoked");
            uk7Var.invoke();
        }

        /* renamed from: b */
        public final OnBackInvokedCallback m24725b(final uk7 uk7Var) {
            sq8.m48649h(uk7Var, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: o.fbc
                public final void onBackInvoked() {
                    ebc.C13148f.m24724c(uk7Var);
                }
            };
        }

        /* renamed from: d */
        public final void m24726d(Object obj, int i, Object obj2) {
            sq8.m48649h(obj, "dispatcher");
            sq8.m48649h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: e */
        public final void m24727e(Object obj, Object obj2) {
            sq8.m48649h(obj, "dispatcher");
            sq8.m48649h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: o.ebc$g */
    public static final class C13149g {

        /* renamed from: a */
        public static final C13149g f21316a = new C13149g();

        /* renamed from: o.ebc$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a */
            public final /* synthetic */ xk7 f21317a;

            /* renamed from: b */
            public final /* synthetic */ xk7 f21318b;

            /* renamed from: c */
            public final /* synthetic */ uk7 f21319c;

            /* renamed from: d */
            public final /* synthetic */ uk7 f21320d;

            public a(xk7 xk7Var, xk7 xk7Var2, uk7 uk7Var, uk7 uk7Var2) {
                this.f21317a = xk7Var;
                this.f21318b = xk7Var2;
                this.f21319c = uk7Var;
                this.f21320d = uk7Var2;
            }

            public void onBackCancelled() {
                this.f21320d.invoke();
            }

            public void onBackInvoked() {
                this.f21319c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                sq8.m48649h(backEvent, "backEvent");
                this.f21318b.invoke(new l91(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                sq8.m48649h(backEvent, "backEvent");
                this.f21317a.invoke(new l91(backEvent));
            }
        }

        /* renamed from: a */
        public final OnBackInvokedCallback m24728a(xk7 xk7Var, xk7 xk7Var2, uk7 uk7Var, uk7 uk7Var2) {
            sq8.m48649h(xk7Var, "onBackStarted");
            sq8.m48649h(xk7Var2, "onBackProgressed");
            sq8.m48649h(uk7Var, "onBackInvoked");
            sq8.m48649h(uk7Var2, "onBackCancelled");
            return new a(xk7Var, xk7Var2, uk7Var, uk7Var2);
        }
    }

    /* renamed from: o.ebc$h */
    public final class C13150h implements InterfaceC2142k, wb2 {

        /* renamed from: a */
        public final AbstractC2139h f21321a;

        /* renamed from: b */
        public final dbc f21322b;

        /* renamed from: c */
        public wb2 f21323c;

        /* renamed from: d */
        public final /* synthetic */ ebc f21324d;

        public C13150h(ebc ebcVar, AbstractC2139h abstractC2139h, dbc dbcVar) {
            sq8.m48649h(abstractC2139h, "lifecycle");
            sq8.m48649h(dbcVar, "onBackPressedCallback");
            this.f21324d = ebcVar;
            this.f21321a = abstractC2139h;
            this.f21322b = dbcVar;
            abstractC2139h.mo6521a(this);
        }

        @Override // p001o.wb2
        public void cancel() {
            this.f21321a.mo6524d(this);
            this.f21322b.m22748i(this);
            wb2 wb2Var = this.f21323c;
            if (wb2Var != null) {
                wb2Var.cancel();
            }
            this.f21323c = null;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            sq8.m48649h(xcaVar, "source");
            sq8.m48649h(aVar, "event");
            if (aVar == AbstractC2139h.a.ON_START) {
                this.f21323c = this.f21324d.m24713j(this.f21322b);
                return;
            }
            if (aVar != AbstractC2139h.a.ON_STOP) {
                if (aVar == AbstractC2139h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                wb2 wb2Var = this.f21323c;
                if (wb2Var != null) {
                    wb2Var.cancel();
                }
            }
        }
    }

    /* renamed from: o.ebc$i */
    public final class C13151i implements wb2 {

        /* renamed from: a */
        public final dbc f21325a;

        /* renamed from: b */
        public final /* synthetic */ ebc f21326b;

        public C13151i(ebc ebcVar, dbc dbcVar) {
            sq8.m48649h(dbcVar, "onBackPressedCallback");
            this.f21326b = ebcVar;
            this.f21325a = dbcVar;
        }

        @Override // p001o.wb2
        public void cancel() {
            this.f21326b.f21304c.remove(this.f21325a);
            if (sq8.m48644c(this.f21326b.f21305d, this.f21325a)) {
                this.f21325a.mo6219c();
                this.f21326b.f21305d = null;
            }
            this.f21325a.m22748i(this);
            uk7 uk7VarM22745b = this.f21325a.m22745b();
            if (uk7VarM22745b != null) {
                uk7VarM22745b.invoke();
            }
            this.f21325a.m22750k(null);
        }
    }

    /* renamed from: o.ebc$j */
    public /* synthetic */ class C13152j extends dm7 implements uk7 {
        public C13152j(Object obj) {
            super(0, obj, ebc.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* renamed from: b */
        public final void m24729b() {
            ((ebc) this.receiver).m24720q();
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m24729b();
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ebc$k */
    public /* synthetic */ class C13153k extends dm7 implements uk7 {
        public C13153k(Object obj) {
            super(0, obj, ebc.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* renamed from: b */
        public final void m24730b() {
            ((ebc) this.receiver).m24720q();
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m24730b();
            return y3i.f54824a;
        }
    }

    public ebc(Runnable runnable, hu3 hu3Var) {
        this.f21302a = runnable;
        this.f21303b = hu3Var;
        this.f21304c = new oo0();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f21306e = i >= 34 ? C13149g.f21316a.m24728a(new C13143a(), new C13144b(), new C13145c(), new C13146d()) : C13148f.f21315a.m24725b(new C13147e());
        }
    }

    /* renamed from: h */
    public final void m24711h(xca xcaVar, dbc dbcVar) {
        sq8.m48649h(xcaVar, "owner");
        sq8.m48649h(dbcVar, "onBackPressedCallback");
        AbstractC2139h lifecycle = xcaVar.getLifecycle();
        if (lifecycle.mo6522b() == AbstractC2139h.b.DESTROYED) {
            return;
        }
        dbcVar.m22744a(new C13150h(this, lifecycle, dbcVar));
        m24720q();
        dbcVar.m22750k(new C13152j(this));
    }

    /* renamed from: i */
    public final void m24712i(dbc dbcVar) {
        sq8.m48649h(dbcVar, "onBackPressedCallback");
        m24713j(dbcVar);
    }

    /* renamed from: j */
    public final wb2 m24713j(dbc dbcVar) {
        sq8.m48649h(dbcVar, "onBackPressedCallback");
        this.f21304c.add(dbcVar);
        C13151i c13151i = new C13151i(this, dbcVar);
        dbcVar.m22744a(c13151i);
        m24720q();
        dbcVar.m22750k(new C13153k(this));
        return c13151i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: k */
    public final void m24714k() {
        dbc dbcVarPrevious;
        dbc dbcVar = this.f21305d;
        if (dbcVar == null) {
            oo0 oo0Var = this.f21304c;
            ListIterator listIterator = oo0Var.listIterator(oo0Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dbcVarPrevious = 0;
                    break;
                } else {
                    dbcVarPrevious = listIterator.previous();
                    if (((dbc) dbcVarPrevious).m22746g()) {
                        break;
                    }
                }
            }
            dbcVar = dbcVarPrevious;
        }
        this.f21305d = null;
        if (dbcVar != null) {
            dbcVar.mo6219c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: l */
    public final void m24715l() {
        dbc dbcVarPrevious;
        dbc dbcVar = this.f21305d;
        if (dbcVar == null) {
            oo0 oo0Var = this.f21304c;
            ListIterator listIterator = oo0Var.listIterator(oo0Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dbcVarPrevious = 0;
                    break;
                } else {
                    dbcVarPrevious = listIterator.previous();
                    if (((dbc) dbcVarPrevious).m22746g()) {
                        break;
                    }
                }
            }
            dbcVar = dbcVarPrevious;
        }
        this.f21305d = null;
        if (dbcVar != null) {
            dbcVar.mo940d();
            return;
        }
        Runnable runnable = this.f21302a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* renamed from: m */
    public final void m24716m(l91 l91Var) {
        dbc dbcVarPrevious;
        dbc dbcVar = this.f21305d;
        if (dbcVar == null) {
            oo0 oo0Var = this.f21304c;
            ListIterator listIterator = oo0Var.listIterator(oo0Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dbcVarPrevious = 0;
                    break;
                } else {
                    dbcVarPrevious = listIterator.previous();
                    if (((dbc) dbcVarPrevious).m22746g()) {
                        break;
                    }
                }
            }
            dbcVar = dbcVarPrevious;
        }
        if (dbcVar != null) {
            dbcVar.mo6220e(l91Var);
        }
    }

    /* renamed from: n */
    public final void m24717n(l91 l91Var) {
        Object objPrevious;
        oo0 oo0Var = this.f21304c;
        ListIterator<E> listIterator = oo0Var.listIterator(oo0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((dbc) objPrevious).m22746g()) {
                    break;
                }
            }
        }
        dbc dbcVar = (dbc) objPrevious;
        this.f21305d = dbcVar;
        if (dbcVar != null) {
            dbcVar.mo6221f(l91Var);
        }
    }

    /* renamed from: o */
    public final void m24718o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        sq8.m48649h(onBackInvokedDispatcher, "invoker");
        this.f21307f = onBackInvokedDispatcher;
        m24719p(this.f21309h);
    }

    /* renamed from: p */
    public final void m24719p(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f21307f;
        OnBackInvokedCallback onBackInvokedCallback = this.f21306e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f21308g) {
            C13148f.f21315a.m24726d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f21308g = true;
        } else {
            if (z || !this.f21308g) {
                return;
            }
            C13148f.f21315a.m24727e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f21308g = false;
        }
    }

    /* renamed from: q */
    public final void m24720q() {
        boolean z = this.f21309h;
        oo0 oo0Var = this.f21304c;
        boolean z2 = false;
        if (!(oo0Var instanceof Collection) || !oo0Var.isEmpty()) {
            Iterator<E> it = oo0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((dbc) it.next()).m22746g()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f21309h = z2;
        if (z2 != z) {
            hu3 hu3Var = this.f21303b;
            if (hu3Var != null) {
                hu3Var.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m24719p(z2);
            }
        }
    }

    public ebc(Runnable runnable) {
        this(runnable, null);
    }
}
