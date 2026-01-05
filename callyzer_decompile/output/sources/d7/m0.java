package d7;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class m0 extends Fragment {

    /* renamed from: a */
    public static final /* synthetic */ int f8117a = 0;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: d7.m0$a */
    public static final class C1641a implements Application.ActivityLifecycleCallbacks {
        public static final l0 Companion = new l0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            l0.m5325a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC4154l.m8923f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
            int i10 = m0.f8117a;
            k0.m5323a(activity, EnumC1644p.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC4154l.m8923f(activity, "activity");
            AbstractC4154l.m8923f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC4154l.m8923f(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m5326a(EnumC1644p enumC1644p) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC4154l.m8922e(activity, "getActivity(...)");
            k0.m5323a(activity, enumC1644p);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5326a(EnumC1644p.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m5326a(EnumC1644p.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m5326a(EnumC1644p.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m5326a(EnumC1644p.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m5326a(EnumC1644p.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m5326a(EnumC1644p.ON_STOP);
    }
}
