package p001o;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C10773c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.apache.http.cookie.ClientCookie;
import p001o.rf3;
import p001o.tbe;
import p001o.yzc;

/* loaded from: classes5.dex */
public final class wf3 {

    /* renamed from: f */
    public static final C17836a f51880f = new C17836a(null);

    /* renamed from: g */
    public static final String f51881g = wf3.class.getCanonicalName();

    /* renamed from: h */
    public static wf3 f51882h;

    /* renamed from: a */
    public final Handler f51883a;

    /* renamed from: b */
    public final Set f51884b;

    /* renamed from: c */
    public final Set f51885c;

    /* renamed from: d */
    public HashSet f51886d;

    /* renamed from: e */
    public final HashMap f51887e;

    /* renamed from: o.wf3$a */
    public static final class C17836a {
        public C17836a() {
        }

        public /* synthetic */ C17836a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final synchronized wf3 m54305a() {
            wf3 wf3VarM54296b;
            if (wf3.m54296b() == null) {
                wf3.m54298d(new wf3(null));
            }
            wf3VarM54296b = wf3.m54296b();
            sq8.m48647f(wf3VarM54296b, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            return wf3VarM54296b;
        }

        /* renamed from: b */
        public final Bundle m54306b(yj6 yj6Var, View view, View view2) {
            List<pwc> listM57881c;
            List listM54315a;
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            Bundle bundle = new Bundle();
            if (yj6Var != null && (listM57881c = yj6Var.m57881c()) != null) {
                for (pwc pwcVar : listM57881c) {
                    if (pwcVar.m44260d() != null) {
                        if (pwcVar.m44260d().length() > 0) {
                            bundle.putString(pwcVar.m44257a(), pwcVar.m44260d());
                        }
                    }
                    if (pwcVar.m44258b().size() > 0) {
                        if (sq8.m48644c(pwcVar.m44259c(), "relative")) {
                            ViewTreeObserverOnGlobalLayoutListenerC17838c.a aVar = ViewTreeObserverOnGlobalLayoutListenerC17838c.f51890f;
                            List listM44258b = pwcVar.m44258b();
                            String simpleName = view2.getClass().getSimpleName();
                            sq8.m48648g(simpleName, "hostView.javaClass.simpleName");
                            listM54315a = aVar.m54315a(yj6Var, view2, listM44258b, 0, -1, simpleName);
                        } else {
                            ViewTreeObserverOnGlobalLayoutListenerC17838c.a aVar2 = ViewTreeObserverOnGlobalLayoutListenerC17838c.f51890f;
                            List listM44258b2 = pwcVar.m44258b();
                            String simpleName2 = view.getClass().getSimpleName();
                            sq8.m48648g(simpleName2, "rootView.javaClass.simpleName");
                            listM54315a = aVar2.m54315a(yj6Var, view, listM44258b2, 0, -1, simpleName2);
                        }
                        Iterator it = listM54315a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C17837b c17837b = (C17837b) it.next();
                                if (c17837b.m54307a() != null) {
                                    String strM42740k = owi.m42740k(c17837b.m54307a());
                                    if (strM42740k.length() > 0) {
                                        bundle.putString(pwcVar.m44257a(), strM42740k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* renamed from: o.wf3$b */
    public static final class C17837b {

        /* renamed from: a */
        public final WeakReference f51888a;

        /* renamed from: b */
        public final String f51889b;

        public C17837b(View view, String str) {
            sq8.m48649h(view, "view");
            sq8.m48649h(str, "viewMapKey");
            this.f51888a = new WeakReference(view);
            this.f51889b = str;
        }

        /* renamed from: a */
        public final View m54307a() {
            WeakReference weakReference = this.f51888a;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public final String m54308b() {
            return this.f51889b;
        }
    }

    /* renamed from: o.wf3$c */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC17838c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        public static final a f51890f = new a(null);

        /* renamed from: a */
        public final WeakReference f51891a;

        /* renamed from: b */
        public List f51892b;

        /* renamed from: c */
        public final Handler f51893c;

        /* renamed from: d */
        public final HashSet f51894d;

        /* renamed from: e */
        public final String f51895e;

        /* renamed from: o.wf3$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final List m54315a(yj6 yj6Var, View view, List list, int i, int i2, String str) {
                sq8.m48649h(list, ClientCookie.PATH_ATTR);
                sq8.m48649h(str, "mapKey");
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i >= list.size()) {
                    arrayList.add(new C17837b(view, str2));
                } else {
                    yzc yzcVar = (yzc) list.get(i);
                    if (sq8.m48644c(yzcVar.m58562a(), "..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List listM54316b = m54316b((ViewGroup) parent);
                            int size = listM54316b.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.addAll(m54315a(yj6Var, (View) listM54316b.get(i3), list, i + 1, i3, str2));
                            }
                        }
                        return arrayList;
                    }
                    if (sq8.m48644c(yzcVar.m58562a(), ".")) {
                        arrayList.add(new C17837b(view, str2));
                        return arrayList;
                    }
                    if (!m54317c(view, yzcVar, i2)) {
                        return arrayList;
                    }
                    if (i == list.size() - 1) {
                        arrayList.add(new C17837b(view, str2));
                    }
                }
                if (view instanceof ViewGroup) {
                    List listM54316b2 = m54316b((ViewGroup) view);
                    int size2 = listM54316b2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.addAll(m54315a(yj6Var, (View) listM54316b2.get(i4), list, i + 1, i4, str2));
                    }
                }
                return arrayList;
            }

            /* renamed from: b */
            public final List m54316b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        sq8.m48648g(childAt, "child");
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (p001o.sq8.m48644c(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean m54317c(View view, yzc yzcVar, int i) {
                if (yzcVar.m58566e() != -1 && i != yzcVar.m58566e()) {
                    return false;
                }
                if (!sq8.m48644c(view.getClass().getCanonicalName(), yzcVar.m58562a())) {
                    if (new mge(".*android\\..*").m38995g(yzcVar.m58562a())) {
                        List listD0 = f9g.D0(yzcVar.m58562a(), new String[]{"."}, false, 0, 6, null);
                        if (!listD0.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((yzcVar.m58567f() & yzc.EnumC18534b.ID.getValue()) > 0 && yzcVar.m58565d() != view.getId()) {
                    return false;
                }
                if ((yzcVar.m58567f() & yzc.EnumC18534b.TEXT.getValue()) > 0) {
                    String strM58569h = yzcVar.m58569h();
                    String strM42740k = owi.m42740k(view);
                    String strM21665k = cri.m21665k(cri.G0(strM42740k), "");
                    if (!sq8.m48644c(strM58569h, strM42740k) && !sq8.m48644c(strM58569h, strM21665k)) {
                        return false;
                    }
                }
                if ((yzcVar.m58567f() & yzc.EnumC18534b.DESCRIPTION.getValue()) > 0) {
                    String strM58563b = yzcVar.m58563b();
                    String string = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                    String strM21665k2 = cri.m21665k(cri.G0(string), "");
                    if (!sq8.m48644c(strM58563b, string) && !sq8.m48644c(strM58563b, strM21665k2)) {
                        return false;
                    }
                }
                if ((yzcVar.m58567f() & yzc.EnumC18534b.HINT.getValue()) > 0) {
                    String strM58564c = yzcVar.m58564c();
                    String strM42738i = owi.m42738i(view);
                    String strM21665k3 = cri.m21665k(cri.G0(strM42738i), "");
                    if (!sq8.m48644c(strM58564c, strM42738i) && !sq8.m48644c(strM58564c, strM21665k3)) {
                        return false;
                    }
                }
                if ((yzcVar.m58567f() & yzc.EnumC18534b.TAG.getValue()) > 0) {
                    String strM58568g = yzcVar.m58568g();
                    String string2 = view.getTag() == null ? "" : view.getTag().toString();
                    String strM21665k4 = cri.m21665k(cri.G0(string2), "");
                    if (!sq8.m48644c(strM58568g, string2) && !sq8.m48644c(strM58568g, strM21665k4)) {
                        return false;
                    }
                }
                return true;
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC17838c(View view, Handler handler, HashSet hashSet, String str) {
            sq8.m48649h(handler, "handler");
            sq8.m48649h(hashSet, "listenerSet");
            sq8.m48649h(str, "activityName");
            this.f51891a = new WeakReference(view);
            this.f51893c = handler;
            this.f51894d = hashSet;
            this.f51895e = str;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: a */
        public final void m54309a(C17837b c17837b, View view, yj6 yj6Var) {
            if (yj6Var == null) {
                return;
            }
            try {
                View viewM54307a = c17837b.m54307a();
                if (viewM54307a == null) {
                    return;
                }
                View viewM42732a = owi.m42732a(viewM54307a);
                if (viewM42732a != null && owi.f39014a.m42749p(viewM54307a, viewM42732a)) {
                    m54312d(c17837b, view, yj6Var);
                    return;
                }
                String name = viewM54307a.getClass().getName();
                sq8.m48648g(name, "view.javaClass.name");
                if (e9g.m24597K(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewM54307a instanceof AdapterView)) {
                    m54310b(c17837b, view, yj6Var);
                } else if (viewM54307a instanceof ListView) {
                    m54311c(c17837b, view, yj6Var);
                }
            } catch (Exception e) {
                cri.j0(wf3.m54297c(), e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m54310b(C17837b c17837b, View view, yj6 yj6Var) {
            boolean z;
            View viewM54307a = c17837b.m54307a();
            if (viewM54307a == null) {
                return;
            }
            String strM54308b = c17837b.m54308b();
            View.OnClickListener onClickListenerM42736g = owi.m42736g(viewM54307a);
            if (onClickListenerM42736g instanceof rf3.ViewOnClickListenerC16600a) {
                sq8.m48647f(onClickListenerM42736g, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                z = ((rf3.ViewOnClickListenerC16600a) onClickListenerM42736g).m46652a();
            }
            if (this.f51894d.contains(strM54308b) || z) {
                return;
            }
            viewM54307a.setOnClickListener(rf3.m46647b(yj6Var, view, viewM54307a));
            this.f51894d.add(strM54308b);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m54311c(C17837b c17837b, View view, yj6 yj6Var) {
            boolean z;
            AdapterView adapterView = (AdapterView) c17837b.m54307a();
            if (adapterView == null) {
                return;
            }
            String strM54308b = c17837b.m54308b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof rf3.C16601b) {
                sq8.m48647f(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                z = ((rf3.C16601b) onItemClickListener).m46653a();
            }
            if (this.f51894d.contains(strM54308b) || z) {
                return;
            }
            adapterView.setOnItemClickListener(rf3.m46648c(yj6Var, view, adapterView));
            this.f51894d.add(strM54308b);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m54312d(C17837b c17837b, View view, yj6 yj6Var) {
            boolean z;
            View viewM54307a = c17837b.m54307a();
            if (viewM54307a == null) {
                return;
            }
            String strM54308b = c17837b.m54308b();
            View.OnTouchListener onTouchListenerM42737h = owi.m42737h(viewM54307a);
            if (onTouchListenerM42737h instanceof tbe.ViewOnTouchListenerC17052a) {
                sq8.m48647f(onTouchListenerM42737h, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                z = ((tbe.ViewOnTouchListenerC17052a) onTouchListenerM42737h).m49694a();
            }
            if (this.f51894d.contains(strM54308b) || z) {
                return;
            }
            viewM54307a.setOnTouchListener(tbe.m49693a(yj6Var, view, viewM54307a));
            this.f51894d.add(strM54308b);
        }

        /* renamed from: e */
        public final void m54313e(yj6 yj6Var, View view) {
            if (yj6Var == null || view == null) {
                return;
            }
            String strM57879a = yj6Var.m57879a();
            if ((strM57879a == null || strM57879a.length() == 0) || sq8.m48644c(yj6Var.m57879a(), this.f51895e)) {
                List listM57882d = yj6Var.m57882d();
                if (listM57882d.size() > 25) {
                    return;
                }
                Iterator it = f51890f.m54315a(yj6Var, view, listM57882d, 0, -1, this.f51895e).iterator();
                while (it.hasNext()) {
                    m54309a((C17837b) it.next(), view, yj6Var);
                }
            }
        }

        /* renamed from: f */
        public final void m54314f() {
            List list = this.f51892b;
            if (list == null || this.f51891a.get() == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m54313e((yj6) list.get(i), (View) this.f51891a.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m54314f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m54314f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (a94.m16694d(this)) {
                return;
            }
            try {
                tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
                if (tt6VarM56796f != null && tt6VarM56796f.m50537d()) {
                    List listM57884b = yj6.f55592j.m57884b(tt6VarM56796f.m50541h());
                    this.f51892b = listM57884b;
                    if (listM57884b == null || (view = (View) this.f51891a.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    m54314f();
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    public /* synthetic */ wf3(id5 id5Var) {
        this();
    }

    /* renamed from: b */
    public static final /* synthetic */ wf3 m54296b() {
        if (a94.m16694d(wf3.class)) {
            return null;
        }
        try {
            return f51882h;
        } catch (Throwable th) {
            a94.m16692b(th, wf3.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m54297c() {
        if (a94.m16694d(wf3.class)) {
            return null;
        }
        try {
            return f51881g;
        } catch (Throwable th) {
            a94.m16692b(th, wf3.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m54298d(wf3 wf3Var) {
        if (a94.m16694d(wf3.class)) {
            return;
        }
        try {
            f51882h = wf3Var;
        } catch (Throwable th) {
            a94.m16692b(th, wf3.class);
        }
    }

    /* renamed from: j */
    public static final void m54299j(wf3 wf3Var) {
        if (a94.m16694d(wf3.class)) {
            return;
        }
        try {
            sq8.m48649h(wf3Var, "this$0");
            wf3Var.m54302g();
        } catch (Throwable th) {
            a94.m16692b(th, wf3.class);
        }
    }

    /* renamed from: e */
    public final void m54300e(Activity activity) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            if (lq8.m37758b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new ur6("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f51884b.add(activity);
            this.f51886d.clear();
            HashSet hashSet = (HashSet) this.f51887e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f51886d = hashSet;
            }
            m54304i();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final void m54301f(Activity activity) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            this.f51887e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m54302g() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f51884b) {
                if (activity != null) {
                    View viewM28970d = gl0.m28970d(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    Handler handler = this.f51883a;
                    HashSet hashSet = this.f51886d;
                    sq8.m48648g(simpleName, "activityName");
                    this.f51885c.add(new ViewTreeObserverOnGlobalLayoutListenerC17838c(viewM28970d, handler, hashSet, simpleName));
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m54303h(Activity activity) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            if (lq8.m37758b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new ur6("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f51884b.remove(activity);
            this.f51885c.clear();
            HashMap map = this.f51887e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.f51886d.clone();
            sq8.m48647f(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
            map.put(numValueOf, (HashSet) objClone);
            this.f51886d.clear();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m54304i() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m54302g();
            } else {
                this.f51883a.post(new Runnable() { // from class: o.vf3
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf3.m54299j(this.f50269a);
                    }
                });
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public wf3() {
        this.f51883a = new Handler(Looper.getMainLooper());
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        sq8.m48648g(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f51884b = setNewSetFromMap;
        this.f51885c = new LinkedHashSet();
        this.f51886d = new HashSet();
        this.f51887e = new HashMap();
    }
}
