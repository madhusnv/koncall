package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import p001o.dsb;
import p001o.f1f;
import p001o.isi;
import p001o.kyg;
import p001o.lbc;
import p001o.mm;
import p001o.mn;
import p001o.pha;
import p001o.pj0;
import p001o.rzi;
import p001o.szi;
import p001o.tzi;
import p001o.uzi;
import p001o.vm;

/* loaded from: classes2.dex */
public class AppCompatActivity extends FragmentActivity implements pj0, kyg.InterfaceC14934a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC1783b mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    public class C1759a implements f1f.InterfaceC13312c {
        public C1759a() {
        }

        @Override // p001o.f1f.InterfaceC13312c
        /* renamed from: a */
        public Bundle mo3785a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo3791E(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    public class C1760b implements lbc {
        public C1760b() {
        }

        @Override // p001o.lbc
        /* renamed from: a */
        public void mo3786a(Context context) {
            AbstractC1783b delegate = AppCompatActivity.this.getDelegate();
            delegate.mo3819v();
            delegate.mo3787A(AppCompatActivity.this.getSavedStateRegistry().m25941b(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        I0();
    }

    private void J0() {
        rzi.m47366b(getWindow().getDecorView(), this);
        uzi.m52200a(getWindow().getDecorView(), this);
        tzi.m50817b(getWindow().getDecorView(), this);
        szi.m49110a(getWindow().getDecorView(), this);
    }

    public final void I0() {
        getSavedStateRegistry().m25946h(DELEGATE_TAG, new C1759a());
        addOnContextAvailableListener(new C1760b());
    }

    public final boolean K0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        getDelegate().mo3810e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo3812i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo3738g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo3747p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo3813l(i);
    }

    public AbstractC1783b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC1783b.m3889j(this, this);
        }
        return this.mDelegate;
    }

    public mm getDrawerToggleDelegate() {
        return getDelegate().mo3815p();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo3817s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && isi.m32706c()) {
            this.mResources = new isi(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo3818u();
    }

    @Override // p001o.kyg.InterfaceC14934a
    public Intent getSupportParentActivityIntent() {
        return dsb.m23763a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo3820w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo3821z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(kyg kygVar) {
        kygVar.m36332e(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo3788B();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (K0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(pha phaVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo3741j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo3789C(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo3790D();
    }

    public void onPrepareSupportNavigateUpTaskStack(kyg kygVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo3792F();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo3793G();
    }

    @Override // p001o.pj0
    public void onSupportActionModeFinished(vm vmVar) {
    }

    @Override // p001o.pj0
    public void onSupportActionModeStarted(vm vmVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        kyg kygVarM36329j = kyg.m36329j(this);
        onCreateSupportNavigateUpTaskStack(kygVarM36329j);
        onPrepareSupportNavigateUpTaskStack(kygVarM36329j);
        kygVarM36329j.m36338p();
        try {
            mn.m39362b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo3801R(charSequence);
    }

    @Override // p001o.pj0
    public vm onWindowStartingSupportActionMode(vm.InterfaceC17615a interfaceC17615a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo3748q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        J0();
        getDelegate().mo3795K(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo3799P(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo3800Q(i);
    }

    public vm startSupportActionMode(vm.InterfaceC17615a interfaceC17615a) {
        return getDelegate().mo3802S(interfaceC17615a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo3820w();
    }

    public void supportNavigateUpTo(Intent intent) {
        dsb.m23767e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo3794J(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return dsb.m23768f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        J0();
        getDelegate().mo3796L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        getDelegate().mo3797M(view, layoutParams);
    }
}
