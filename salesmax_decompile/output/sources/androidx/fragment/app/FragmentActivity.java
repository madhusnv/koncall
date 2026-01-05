package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.C2144m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p001o.aha;
import p001o.bbb;
import p001o.bh7;
import p001o.ebc;
import p001o.f1f;
import p001o.h1f;
import p001o.hbc;
import p001o.hu3;
import p001o.kbc;
import p001o.kcc;
import p001o.kxi;
import p001o.lbc;
import p001o.lxi;
import p001o.mn;
import p001o.rg7;
import p001o.tab;
import p001o.vbc;
import p001o.wh7;
import p001o.xs;
import p001o.ylf;
import p001o.ys;
import p001o.zbc;

/* loaded from: classes2.dex */
public class FragmentActivity extends ComponentActivity implements mn.InterfaceC15368f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final rg7 mFragments = rg7.m46703b(new C2091a());
    final C2144m mFragmentLifecycleRegistry = new C2144m(this);
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C2091a extends bh7 implements kbc, kcc, vbc, zbc, lxi, hbc, ys, h1f, wh7, tab {
        public C2091a() {
            super(FragmentActivity.this);
        }

        @Override // p001o.wh7
        /* renamed from: a */
        public void mo6153a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // p001o.tab
        public void addMenuProvider(bbb bbbVar) {
            FragmentActivity.this.addMenuProvider(bbbVar);
        }

        @Override // p001o.kbc
        public void addOnConfigurationChangedListener(hu3 hu3Var) {
            FragmentActivity.this.addOnConfigurationChangedListener(hu3Var);
        }

        @Override // p001o.vbc
        public void addOnMultiWindowModeChangedListener(hu3 hu3Var) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(hu3Var);
        }

        @Override // p001o.zbc
        public void addOnPictureInPictureModeChangedListener(hu3 hu3Var) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(hu3Var);
        }

        @Override // p001o.kcc
        public void addOnTrimMemoryListener(hu3 hu3Var) {
            FragmentActivity.this.addOnTrimMemoryListener(hu3Var);
        }

        @Override // p001o.qg7
        /* renamed from: c */
        public View mo6142c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // p001o.qg7
        /* renamed from: d */
        public boolean mo6143d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p001o.ys
        public xs getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // p001o.xca
        public AbstractC2139h getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // p001o.hbc
        public ebc getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // p001o.h1f
        public f1f getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // p001o.lxi
        public kxi getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // p001o.bh7
        /* renamed from: i */
        public void mo6154i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p001o.bh7
        /* renamed from: k */
        public LayoutInflater mo6156k() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // p001o.bh7
        /* renamed from: m */
        public boolean mo6157m(String str) {
            return mn.m39371k(FragmentActivity.this, str);
        }

        @Override // p001o.bh7
        /* renamed from: p */
        public void mo6158p() {
            m6159q();
        }

        /* renamed from: q */
        public void m6159q() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // p001o.bh7
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public FragmentActivity mo6155j() {
            return FragmentActivity.this;
        }

        @Override // p001o.tab
        public void removeMenuProvider(bbb bbbVar) {
            FragmentActivity.this.removeMenuProvider(bbbVar);
        }

        @Override // p001o.kbc
        public void removeOnConfigurationChangedListener(hu3 hu3Var) {
            FragmentActivity.this.removeOnConfigurationChangedListener(hu3Var);
        }

        @Override // p001o.vbc
        public void removeOnMultiWindowModeChangedListener(hu3 hu3Var) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(hu3Var);
        }

        @Override // p001o.zbc
        public void removeOnPictureInPictureModeChangedListener(hu3 hu3Var) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(hu3Var);
        }

        @Override // p001o.kcc
        public void removeOnTrimMemoryListener(hu3 hu3Var) {
            FragmentActivity.this.removeOnTrimMemoryListener(hu3Var);
        }
    }

    public FragmentActivity() {
        C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle D0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(Configuration configuration) {
        this.mFragments.m46715m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Intent intent) {
        this.mFragments.m46715m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(Context context) {
        this.mFragments.m46704a(null);
    }

    public static boolean H0(FragmentManager fragmentManager, AbstractC2139h.b bVar) {
        boolean zH0 = false;
        for (Fragment fragment : fragmentManager.B0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zH0 |= H0(fragment.getChildFragmentManager(), bVar);
                }
                C2125k c2125k = fragment.mViewLifecycleOwner;
                if (c2125k != null && c2125k.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
                    fragment.mViewLifecycleOwner.m6436f(bVar);
                    zH0 = true;
                }
                if (fragment.mLifecycleRegistry.mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
                    fragment.mLifecycleRegistry.m6543n(bVar);
                    zH0 = true;
                }
            }
        }
        return zH0;
    }

    public final void C0() {
        getSavedStateRegistry().m25946h(LIFECYCLE_TAG, new f1f.InterfaceC13312c() { // from class: o.xf7
            @Override // p001o.f1f.InterfaceC13312c
            /* renamed from: a */
            public final Bundle mo3785a() {
                return this.f53698a.D0();
            }
        });
        addOnConfigurationChangedListener(new hu3() { // from class: o.yf7
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f55460a.E0((Configuration) obj);
            }
        });
        addOnNewIntentListener(new hu3() { // from class: o.zf7
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f57130a.F0((Intent) obj);
            }
        });
        addOnContextAvailableListener(new lbc() { // from class: o.ag7
            @Override // p001o.lbc
            /* renamed from: a */
            public final void mo3786a(Context context) {
                this.f14664a.G0(context);
            }
        });
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m46716n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                aha.m17056b(this).mo17057a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.m46714l().m6196Z(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m46714l();
    }

    @Deprecated
    public aha getSupportLoaderManager() {
        return aha.m17056b(this);
    }

    public void markFragmentsCreated() {
        while (H0(getSupportFragmentManager(), AbstractC2139h.b.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m46715m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_CREATE);
        this.mFragments.m46707e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m46708f();
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.m46706d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m46709g();
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m46715m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m46715m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m46713k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_RESUME);
        this.mFragments.m46710h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m46715m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m46705c();
        }
        this.mFragments.m46713k();
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_START);
        this.mFragments.m46711i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m46715m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m46712j();
        this.mFragmentLifecycleRegistry.m6538i(AbstractC2139h.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(ylf ylfVar) {
        mn.m39369i(this, ylfVar);
    }

    public void setExitSharedElementCallback(ylf ylfVar) {
        mn.m39370j(this, ylfVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            mn.m39373m(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        mn.m39363c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        mn.m39365e(this);
    }

    public void supportStartPostponedEnterTransition() {
        mn.m39374n(this);
    }

    @Override // p001o.mn.InterfaceC15368f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            mn.m39372l(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }
}
