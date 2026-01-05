package p001o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class ceb implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e */
    public static final C12653a f18001e = new C12653a(null);

    /* renamed from: f */
    public static final Map f18002f = new HashMap();

    /* renamed from: a */
    public final Set f18003a;

    /* renamed from: b */
    public final Handler f18004b;

    /* renamed from: c */
    public final WeakReference f18005c;

    /* renamed from: d */
    public final AtomicBoolean f18006d;

    /* renamed from: o.ceb$a */
    public static final class C12653a {
        public C12653a() {
        }

        public /* synthetic */ C12653a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final String m21082c(String str, String str2) {
            return sq8.m48644c("r2", str) ? new mge("[^\\d.]").m38996h(str2, "") : str2;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21083d(Map map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (!e9g.m24597K(str2, "m", false, 2, null) && !e9g.m24597K(str2, "b", false, 2, null) && !e9g.m24597K(str2, "ge", false, 2, null)) {
                            str2 = "f";
                            break;
                        } else {
                            str2 = "m";
                            break;
                        }
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new mge("[^a-z]+").m38996h(str2, "");
                        break;
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && f9g.m26306P(str2, "-", false, 2, null)) {
                        str2 = ((String[]) new mge("-").m38998j(str2, 0).toArray(new String[0]))[0];
                        break;
                    }
                    break;
            }
            map.put(str, str2);
        }

        /* renamed from: e */
        public final void m21084e(Activity activity) {
            sq8.m48649h(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapM21073b = ceb.m21073b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object cebVar = mapM21073b.get(numValueOf);
            if (cebVar == null) {
                cebVar = new ceb(activity, null);
                mapM21073b.put(numValueOf, cebVar);
            }
            ceb.m21074c((ceb) cebVar);
        }
    }

    public /* synthetic */ ceb(Activity activity, id5 id5Var) {
        this(activity);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m21073b() {
        if (a94.m16694d(ceb.class)) {
            return null;
        }
        try {
            return f18002f;
        } catch (Throwable th) {
            a94.m16692b(th, ceb.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m21074c(ceb cebVar) {
        if (a94.m16694d(ceb.class)) {
            return;
        }
        try {
            cebVar.m21079h();
        } catch (Throwable th) {
            a94.m16692b(th, ceb.class);
        }
    }

    /* renamed from: e */
    public static final void m21075e(View view, ceb cebVar) {
        if (a94.m16694d(ceb.class)) {
            return;
        }
        try {
            sq8.m48649h(view, "$view");
            sq8.m48649h(cebVar, "this$0");
            if (view instanceof EditText) {
                cebVar.m21077f(view);
            }
        } catch (Throwable th) {
            a94.m16692b(th, ceb.class);
        }
    }

    /* renamed from: d */
    public final void m21076d(final View view) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m21078g(new Runnable() { // from class: o.beb
                @Override // java.lang.Runnable
                public final void run() {
                    ceb.m21075e(view, this);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final void m21077f(View view) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48647f(view, "null cannot be cast to non-null type android.widget.EditText");
            String lowerCase = f9g.Z0(((EditText) view).getText().toString()).toString().toLowerCase();
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.f18003a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f18003a.add(lowerCase);
                HashMap map = new HashMap();
                List listM51384b = udb.m51384b(view);
                List listM51383a = null;
                for (xdb xdbVar : xdb.f53550d.m56087c()) {
                    C12653a c12653a = f18001e;
                    String strM21082c = c12653a.m21082c(xdbVar.m56083c(), lowerCase);
                    if (!(xdbVar.m56084d().length() > 0) || udb.m51386f(strM21082c, xdbVar.m56084d())) {
                        if (udb.m51385e(listM51384b, xdbVar.m56082b())) {
                            c12653a.m21083d(map, xdbVar.m56083c(), strM21082c);
                        } else {
                            if (listM51383a == null) {
                                listM51383a = udb.m51383a(view);
                            }
                            if (udb.m51385e(listM51383a, xdbVar.m56082b())) {
                                c12653a.m21083d(map, xdbVar.m56083c(), strM21082c);
                            }
                        }
                    }
                }
                ao8.f15070b.m17573f(map);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m21078g(Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f18004b.post(runnable);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m21079h() {
        View viewM28970d;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (this.f18006d.getAndSet(true) || (viewM28970d = gl0.m28970d((Activity) this.f18005c.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewM28970d.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (a94.m16694d(this)) {
            return;
        }
        if (view != null) {
            try {
                m21076d(view);
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        }
        if (view2 != null) {
            m21076d(view2);
        }
    }

    public ceb(Activity activity) {
        this.f18003a = new LinkedHashSet();
        this.f18004b = new Handler(Looper.getMainLooper());
        this.f18005c = new WeakReference(activity);
        this.f18006d = new AtomicBoolean(false);
    }
}
