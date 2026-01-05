package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC1783b;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p001o.ap0;
import p001o.mm;
import p001o.nm0;
import p001o.pha;
import p001o.pj0;
import p001o.vm;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1783b {

    /* renamed from: a */
    public static c f5441a = new c(new d());

    /* renamed from: b */
    public static int f5442b = -100;

    /* renamed from: c */
    public static pha f5443c = null;

    /* renamed from: d */
    public static pha f5444d = null;

    /* renamed from: e */
    public static Boolean f5445e = null;

    /* renamed from: f */
    public static boolean f5446f = false;

    /* renamed from: g */
    public static final ap0 f5447g = new ap0();

    /* renamed from: h */
    public static final Object f5448h = new Object();

    /* renamed from: q */
    public static final Object f5449q = new Object();

    /* renamed from: androidx.appcompat.app.b$a */
    public static class a {
        /* renamed from: a */
        public static LocaleList m3898a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    public static class b {
        /* renamed from: a */
        public static LocaleList m3899a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        public static void m3900b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.app.b$c */
    public static class c implements Executor {

        /* renamed from: a */
        public final Object f5450a = new Object();

        /* renamed from: b */
        public final Queue f5451b = new ArrayDeque();

        /* renamed from: c */
        public final Executor f5452c;

        /* renamed from: d */
        public Runnable f5453d;

        public c(Executor executor) {
            this.f5452c = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m3902b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                m3903c();
            }
        }

        /* renamed from: c */
        public void m3903c() {
            synchronized (this.f5450a) {
                Runnable runnable = (Runnable) this.f5451b.poll();
                this.f5453d = runnable;
                if (runnable != null) {
                    this.f5452c.execute(runnable);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f5450a) {
                this.f5451b.add(new Runnable() { // from class: o.tj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47222a.m3902b(runnable);
                    }
                });
                if (this.f5453d == null) {
                    m3903c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$d */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: H */
    public static void m3881H(AbstractC1783b abstractC1783b) {
        synchronized (f5448h) {
            m3882I(abstractC1783b);
        }
    }

    /* renamed from: I */
    public static void m3882I(AbstractC1783b abstractC1783b) {
        synchronized (f5448h) {
            Iterator it = f5447g.iterator();
            while (it.hasNext()) {
                AbstractC1783b abstractC1783b2 = (AbstractC1783b) ((WeakReference) it.next()).get();
                if (abstractC1783b2 == abstractC1783b || abstractC1783b2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: N */
    public static void m3883N(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f5442b != i) {
            f5442b = i;
            m3888g();
        }
    }

    /* renamed from: T */
    public static void m3884T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m3891m().m43686e()) {
                    String strM40780b = nm0.m40780b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.m3900b(systemService, a.m3898a(strM40780b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* renamed from: U */
    public static void m3885U(final Context context) {
        if (m3895x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f5446f) {
                    return;
                }
                f5441a.execute(new Runnable() { // from class: o.sj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1783b.m3896y(context);
                    }
                });
                return;
            }
            synchronized (f5449q) {
                pha phaVar = f5443c;
                if (phaVar == null) {
                    if (f5444d == null) {
                        f5444d = pha.m43682b(nm0.m40780b(context));
                    }
                    if (f5444d.m43686e()) {
                    } else {
                        f5443c = f5444d;
                    }
                } else if (!phaVar.equals(f5444d)) {
                    pha phaVar2 = f5443c;
                    f5444d = phaVar2;
                    nm0.m40779a(context, phaVar2.m43688g());
                }
            }
        }
    }

    /* renamed from: d */
    public static void m3887d(AbstractC1783b abstractC1783b) {
        synchronized (f5448h) {
            m3882I(abstractC1783b);
            f5447g.add(new WeakReference(abstractC1783b));
        }
    }

    /* renamed from: g */
    public static void m3888g() {
        synchronized (f5448h) {
            Iterator it = f5447g.iterator();
            while (it.hasNext()) {
                AbstractC1783b abstractC1783b = (AbstractC1783b) ((WeakReference) it.next()).get();
                if (abstractC1783b != null) {
                    abstractC1783b.mo3811f();
                }
            }
        }
    }

    /* renamed from: j */
    public static AbstractC1783b m3889j(Activity activity, pj0 pj0Var) {
        return new AppCompatDelegateImpl(activity, pj0Var);
    }

    /* renamed from: k */
    public static AbstractC1783b m3890k(Dialog dialog, pj0 pj0Var) {
        return new AppCompatDelegateImpl(dialog, pj0Var);
    }

    /* renamed from: m */
    public static pha m3891m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM3893r = m3893r();
            if (objM3893r != null) {
                return pha.m43684i(b.m3899a(objM3893r));
            }
        } else {
            pha phaVar = f5443c;
            if (phaVar != null) {
                return phaVar;
            }
        }
        return pha.m43683d();
    }

    /* renamed from: o */
    public static int m3892o() {
        return f5442b;
    }

    /* renamed from: r */
    public static Object m3893r() {
        Context contextMo3814n;
        Iterator it = f5447g.iterator();
        while (it.hasNext()) {
            AbstractC1783b abstractC1783b = (AbstractC1783b) ((WeakReference) it.next()).get();
            if (abstractC1783b != null && (contextMo3814n = abstractC1783b.mo3814n()) != null) {
                return contextMo3814n.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: t */
    public static pha m3894t() {
        return f5443c;
    }

    /* renamed from: x */
    public static boolean m3895x(Context context) {
        if (f5445e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.m3862a(context).metaData;
                if (bundle != null) {
                    f5445e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f5445e = Boolean.FALSE;
            }
        }
        return f5445e.booleanValue();
    }

    /* renamed from: y */
    public static /* synthetic */ void m3896y(Context context) {
        m3884T(context);
        f5446f = true;
    }

    /* renamed from: A */
    public abstract void mo3787A(Bundle bundle);

    /* renamed from: B */
    public abstract void mo3788B();

    /* renamed from: C */
    public abstract void mo3789C(Bundle bundle);

    /* renamed from: D */
    public abstract void mo3790D();

    /* renamed from: E */
    public abstract void mo3791E(Bundle bundle);

    /* renamed from: F */
    public abstract void mo3792F();

    /* renamed from: G */
    public abstract void mo3793G();

    /* renamed from: J */
    public abstract boolean mo3794J(int i);

    /* renamed from: K */
    public abstract void mo3795K(int i);

    /* renamed from: L */
    public abstract void mo3796L(View view);

    /* renamed from: M */
    public abstract void mo3797M(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: O */
    public void mo3798O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: P */
    public abstract void mo3799P(Toolbar toolbar);

    /* renamed from: Q */
    public abstract void mo3800Q(int i);

    /* renamed from: R */
    public abstract void mo3801R(CharSequence charSequence);

    /* renamed from: S */
    public abstract vm mo3802S(vm.InterfaceC17615a interfaceC17615a);

    /* renamed from: e */
    public abstract void mo3810e(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: f */
    public abstract boolean mo3811f();

    /* renamed from: h */
    public void m3897h(Context context) {
    }

    /* renamed from: i */
    public Context mo3812i(Context context) {
        m3897h(context);
        return context;
    }

    /* renamed from: l */
    public abstract View mo3813l(int i);

    /* renamed from: n */
    public abstract Context mo3814n();

    /* renamed from: p */
    public abstract mm mo3815p();

    /* renamed from: q */
    public abstract int mo3816q();

    /* renamed from: s */
    public abstract MenuInflater mo3817s();

    /* renamed from: u */
    public abstract ActionBar mo3818u();

    /* renamed from: v */
    public abstract void mo3819v();

    /* renamed from: w */
    public abstract void mo3820w();

    /* renamed from: z */
    public abstract void mo3821z(Configuration configuration);
}
