package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import p001o.id5;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes2.dex */
public class FragmentC2150s extends Fragment {

    /* renamed from: b */
    public static final b f7747b = new b(null);

    /* renamed from: a */
    public a f7748a;

    /* renamed from: androidx.lifecycle.s$a */
    public interface a {
        /* renamed from: a */
        void mo6567a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.s$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m6576a(Activity activity, AbstractC2139h.a aVar) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(aVar, "event");
            if (activity instanceof xca) {
                AbstractC2139h lifecycle = ((xca) activity).getLifecycle();
                if (lifecycle instanceof C2144m) {
                    ((C2144m) lifecycle).m6538i(aVar);
                }
            }
        }

        /* renamed from: b */
        public final FragmentC2150s m6577b(Activity activity) {
            sq8.m48649h(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            sq8.m48647f(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC2150s) fragmentFindFragmentByTag;
        }

        /* renamed from: c */
        public final void m6578c(Activity activity) {
            sq8.m48649h(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m6579a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC2150s(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.s$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* renamed from: androidx.lifecycle.s$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final void m6579a(Activity activity) {
                sq8.m48649h(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m6579a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6576a(activity, AbstractC2139h.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
        }
    }

    /* renamed from: e */
    public static final void m6570e(Activity activity) {
        f7747b.m6578c(activity);
    }

    /* renamed from: a */
    public final void m6571a(AbstractC2139h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f7747b;
            Activity activity = getActivity();
            sq8.m48648g(activity, "activity");
            bVar.m6576a(activity, aVar);
        }
    }

    /* renamed from: b */
    public final void m6572b(a aVar) {
        if (aVar != null) {
            aVar.mo6567a();
        }
    }

    /* renamed from: c */
    public final void m6573c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: d */
    public final void m6574d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    public final void m6575f(a aVar) {
        this.f7748a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m6572b(this.f7748a);
        m6571a(AbstractC2139h.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m6571a(AbstractC2139h.a.ON_DESTROY);
        this.f7748a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m6571a(AbstractC2139h.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m6573c(this.f7748a);
        m6571a(AbstractC2139h.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m6574d(this.f7748a);
        m6571a(AbstractC2139h.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m6571a(AbstractC2139h.a.ON_STOP);
    }
}
