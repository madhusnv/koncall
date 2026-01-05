package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import b6.InterfaceC0600a;
import d7.C1651w;
import d7.EnumC1644p;
import d7.EnumC1645q;
import j7.AbstractC3594a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p004e.AbstractActivityC1878m;
import p006g.InterfaceC2410b;
import q5.AbstractC6127t;
import q5.InterfaceC6108a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o0 extends AbstractActivityC1878m implements InterfaceC6108a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final t0 mFragments = new t0(new n0(this));
    final C1651w mFragmentLifecycleRegistry = new C1651w(this);
    boolean mStopped = true;

    public o0() {
        getSavedStateRegistry().m6565c(LIFECYCLE_TAG, new k0(0, this));
        final int i10 = 0;
        addOnConfigurationChangedListener(new InterfaceC0600a(this) { // from class: androidx.fragment.app.l0

            /* renamed from: b */
            public final /* synthetic */ o0 f2613b;

            {
                this.f2613b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f2613b.mFragments.m1259a();
                        break;
                    default:
                        this.f2613b.mFragments.m1259a();
                        break;
                }
            }
        });
        final int i11 = 1;
        addOnNewIntentListener(new InterfaceC0600a(this) { // from class: androidx.fragment.app.l0

            /* renamed from: b */
            public final /* synthetic */ o0 f2613b;

            {
                this.f2613b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f2613b.mFragments.m1259a();
                        break;
                    default:
                        this.f2613b.mFragments.m1259a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC2410b() { // from class: androidx.fragment.app.m0
            @Override // p006g.InterfaceC2410b
            /* renamed from: a */
            public final void mo1206a(AbstractActivityC1878m abstractActivityC1878m) {
                n0 n0Var = this.f2626a.mFragments.f2701a;
                n0Var.f2710d.m1177b(n0Var, n0Var, null);
            }
        });
    }

    /* renamed from: e */
    public static boolean m1215e(j1 j1Var, EnumC1645q enumC1645q) {
        boolean zM1215e = false;
        for (j0 j0Var : j1Var.f2581c.m1265f()) {
            if (j0Var != null) {
                if (j0Var.getHost() != null) {
                    zM1215e |= m1215e(j0Var.getChildFragmentManager(), enumC1645q);
                }
                d2 d2Var = j0Var.mViewLifecycleOwner;
                if (d2Var != null) {
                    d2Var.m1129b();
                    if (d2Var.f2495e.f8148c.isAtLeast(EnumC1645q.STARTED)) {
                        j0Var.mViewLifecycleOwner.f2495e.m5357i(enumC1645q);
                        zM1215e = true;
                    }
                }
                if (j0Var.mLifecycleRegistry.f8148c.isAtLeast(EnumC1645q.STARTED)) {
                    j0Var.mLifecycleRegistry.m5357i(enumC1645q);
                    zM1215e = true;
                }
            }
        }
        return zM1215e;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2701a.f2710d.f2584f.onCreateView(view, str, context, attributeSet);
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
                AbstractC3594a.m8158a(this).m8160b(str2, printWriter);
            }
            this.mFragments.f2701a.f2710d.m1197v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public j1 getSupportFragmentManager() {
        return this.mFragments.f2701a.f2710d;
    }

    @Deprecated
    public AbstractC3594a getSupportLoaderManager() {
        return AbstractC3594a.m8158a(this);
    }

    public void markFragmentsCreated() {
        while (m1215e(getSupportFragmentManager(), EnumC1645q.CREATED)) {
        }
    }

    @Override // p004e.AbstractActivityC1878m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m1259a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_CREATE);
        k1 k1Var = this.mFragments.f2701a.f2710d;
        k1Var.f2570H = false;
        k1Var.f2571I = false;
        k1Var.f2577O.f2650g = false;
        k1Var.m1196u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2701a.f2710d.m1187l();
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_DESTROY);
    }

    @Override // p004e.AbstractActivityC1878m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f2701a.f2710d.m1185j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2701a.f2710d.m1196u(5);
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // p004e.AbstractActivityC1878m, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m1259a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m1259a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2701a.f2710d.m1201z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_RESUME);
        k1 k1Var = this.mFragments.f2701a.f2710d;
        k1Var.f2570H = false;
        k1Var.f2571I = false;
        k1Var.f2577O.f2650g = false;
        k1Var.m1196u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m1259a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            k1 k1Var = this.mFragments.f2701a.f2710d;
            k1Var.f2570H = false;
            k1Var.f2571I = false;
            k1Var.f2577O.f2650g = false;
            k1Var.m1196u(4);
        }
        this.mFragments.f2701a.f2710d.m1201z(true);
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_START);
        k1 k1Var2 = this.mFragments.f2701a.f2710d;
        k1Var2.f2570H = false;
        k1Var2.f2571I = false;
        k1Var2.f2577O.f2650g = false;
        k1Var2.m1196u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m1259a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        k1 k1Var = this.mFragments.f2701a.f2710d;
        k1Var.f2571I = true;
        k1Var.f2577O.f2650g = true;
        k1Var.m1196u(4);
        this.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC6127t abstractC6127t) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC6127t abstractC6127t) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(j0 j0Var, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            j0Var.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(j0 j0Var, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            j0Var.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(j0 j0Var, Intent intent, int i10) {
        startActivityFromFragment(j0Var, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void onAttachFragment(j0 j0Var) {
    }

    @Override // q5.InterfaceC6108a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
