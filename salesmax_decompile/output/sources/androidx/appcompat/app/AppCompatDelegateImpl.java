package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.C1790c;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC2139h;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import p001o.anh;
import p001o.azi;
import p001o.bbe;
import p001o.c64;
import p001o.cbc;
import p001o.d85;
import p001o.dk0;
import p001o.dsb;
import p001o.ek0;
import p001o.g9e;
import p001o.i64;
import p001o.iae;
import p001o.isi;
import p001o.ktf;
import p001o.l6e;
import p001o.lk0;
import p001o.mm;
import p001o.mn;
import p001o.ndg;
import p001o.oed;
import p001o.pc9;
import p001o.pha;
import p001o.pj0;
import p001o.ppe;
import p001o.r8e;
import p001o.r9j;
import p001o.rh9;
import p001o.sh9;
import p001o.sk0;
import p001o.spe;
import p001o.uha;
import p001o.v8j;
import p001o.vm;
import p001o.wvi;
import p001o.xca;
import p001o.xj0;
import p001o.xyh;
import p001o.xyi;
import p001o.y2g;
import p001o.yj0;
import p001o.yzi;
import p001o.z5e;
import p001o.zdg;

/* loaded from: classes2.dex */
public class AppCompatDelegateImpl extends AbstractC1783b implements C1792e.a, LayoutInflater.Factory2 {
    public static final ktf X0 = new ktf();
    public static final boolean Y0 = false;
    public static final int[] Z0 = {R.attr.windowBackground};
    public static final boolean a1 = !"robolectric".equals(Build.FINGERPRINT);
    public PanelFeatureState[] A0;
    public PanelFeatureState B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public Configuration G0;

    /* renamed from: H */
    public C1775n f5381H;
    public int H0;
    public int I0;
    public int J0;
    public boolean K0;

    /* renamed from: L */
    public final pj0 f5382L;
    public AbstractC1777p L0;

    /* renamed from: M */
    public ActionBar f5383M;
    public AbstractC1777p M0;
    public boolean N0;
    public int O0;
    public final Runnable P0;

    /* renamed from: Q */
    public MenuInflater f5384Q;
    public boolean Q0;
    public Rect R0;
    public Rect S0;
    public sk0 T0;
    public rh9 U0;
    public OnBackInvokedDispatcher V0;
    public OnBackInvokedCallback W0;

    /* renamed from: X */
    public CharSequence f5385X;

    /* renamed from: Y */
    public d85 f5386Y;

    /* renamed from: Z */
    public C1769h f5387Z;
    public C1780s h0;
    public vm i0;
    public ActionBarContextView j0;
    public PopupWindow k0;
    public Runnable l0;
    public xyi m0;
    public boolean n0;
    public boolean o0;
    public ViewGroup p0;
    public TextView q0;
    public View r0;

    /* renamed from: s */
    public final Object f5388s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    /* renamed from: x */
    public final Context f5389x;
    public boolean x0;

    /* renamed from: y */
    public Window f5390y;
    public boolean y0;
    public boolean z0;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f5391a;

        /* renamed from: b */
        public int f5392b;

        /* renamed from: c */
        public int f5393c;

        /* renamed from: d */
        public int f5394d;

        /* renamed from: e */
        public int f5395e;

        /* renamed from: f */
        public int f5396f;

        /* renamed from: g */
        public ViewGroup f5397g;

        /* renamed from: h */
        public View f5398h;

        /* renamed from: i */
        public View f5399i;

        /* renamed from: j */
        public C1792e f5400j;

        /* renamed from: k */
        public C1790c f5401k;

        /* renamed from: l */
        public Context f5402l;

        /* renamed from: m */
        public boolean f5403m;

        /* renamed from: n */
        public boolean f5404n;

        /* renamed from: o */
        public boolean f5405o;

        /* renamed from: p */
        public boolean f5406p;

        /* renamed from: q */
        public boolean f5407q = false;

        /* renamed from: r */
        public boolean f5408r;

        /* renamed from: s */
        public Bundle f5409s;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C1761a();

            /* renamed from: a */
            public int f5410a;

            /* renamed from: b */
            public boolean f5411b;

            /* renamed from: c */
            public Bundle f5412c;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public class C1761a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m3826a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m3826a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            /* renamed from: a */
            public static SavedState m3826a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f5410a = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f5411b = z;
                if (z) {
                    savedState.f5412c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5410a);
                parcel.writeInt(this.f5411b ? 1 : 0);
                if (this.f5411b) {
                    parcel.writeBundle(this.f5412c);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f5391a = i;
        }

        /* renamed from: a */
        public InterfaceC1797j m3822a(InterfaceC1796i.a aVar) {
            if (this.f5400j == null) {
                return null;
            }
            if (this.f5401k == null) {
                C1790c c1790c = new C1790c(this.f5402l, g9e.abc_list_menu_item_layout);
                this.f5401k = c1790c;
                c1790c.mo3965d(aVar);
                this.f5400j.m4041b(this.f5401k);
            }
            return this.f5401k.m4004l(this.f5397g);
        }

        /* renamed from: b */
        public boolean m3823b() {
            if (this.f5398h == null) {
                return false;
            }
            return this.f5399i != null || this.f5401k.m4003a().getCount() > 0;
        }

        /* renamed from: c */
        public void m3824c(C1792e c1792e) {
            C1790c c1790c;
            C1792e c1792e2 = this.f5400j;
            if (c1792e == c1792e2) {
                return;
            }
            if (c1792e2 != null) {
                c1792e2.m4031R(this.f5401k);
            }
            this.f5400j = c1792e;
            if (c1792e == null || (c1790c = this.f5401k) == null) {
                return;
            }
            c1792e.m4041b(c1790c);
        }

        /* renamed from: d */
        public void m3825d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(z5e.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(z5e.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(iae.Theme_AppCompat_CompactMenu, true);
            }
            i64 i64Var = new i64(context, 0);
            i64Var.getTheme().setTo(themeNewTheme);
            this.f5402l = i64Var;
            TypedArray typedArrayObtainStyledAttributes = i64Var.obtainStyledAttributes(bbe.AppCompatTheme);
            this.f5392b = typedArrayObtainStyledAttributes.getResourceId(bbe.AppCompatTheme_panelBackground, 0);
            this.f5396f = typedArrayObtainStyledAttributes.getResourceId(bbe.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class RunnableC1762a implements Runnable {
        public RunnableC1762a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.O0 & 1) != 0) {
                appCompatDelegateImpl.l0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.O0 & 4096) != 0) {
                appCompatDelegateImpl2.l0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.N0 = false;
            appCompatDelegateImpl3.O0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C1763b implements cbc {
        public C1763b() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iM46397l = r9jVar.m46397l();
            int iH1 = AppCompatDelegateImpl.this.h1(r9jVar, null);
            if (iM46397l != iH1) {
                r9jVar = r9jVar.m46401q(r9jVar.m46395j(), iH1, r9jVar.m46396k(), r9jVar.m46394i());
            }
            return wvi.m55112Y(view, r9jVar);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C1764c implements ContentFrameLayout.InterfaceC1838a {
        public C1764c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1838a
        /* renamed from: a */
        public void mo3831a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1838a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.j0();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class RunnableC1765d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        public class a extends azi {
            public a() {
            }

            @Override // p001o.zyi
            /* renamed from: b */
            public void mo3832b(View view) {
                AppCompatDelegateImpl.this.j0.setAlpha(1.0f);
                AppCompatDelegateImpl.this.m0.m56978h(null);
                AppCompatDelegateImpl.this.m0 = null;
            }

            @Override // p001o.azi, p001o.zyi
            /* renamed from: c */
            public void mo3833c(View view) {
                AppCompatDelegateImpl.this.j0.setVisibility(0);
            }
        }

        public RunnableC1765d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.k0.showAtLocation(appCompatDelegateImpl.j0, 55, 0, 0);
            AppCompatDelegateImpl.this.m0();
            if (!AppCompatDelegateImpl.this.X0()) {
                AppCompatDelegateImpl.this.j0.setAlpha(1.0f);
                AppCompatDelegateImpl.this.j0.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.j0.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.m0 = wvi.m55118e(appCompatDelegateImpl2.j0).m56973b(1.0f);
                AppCompatDelegateImpl.this.m0.m56978h(new a());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C1766e extends azi {
        public C1766e() {
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            AppCompatDelegateImpl.this.j0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.m0.m56978h(null);
            AppCompatDelegateImpl.this.m0 = null;
        }

        @Override // p001o.azi, p001o.zyi
        /* renamed from: c */
        public void mo3833c(View view) {
            AppCompatDelegateImpl.this.j0.setVisibility(0);
            if (AppCompatDelegateImpl.this.j0.getParent() instanceof View) {
                wvi.j0((View) AppCompatDelegateImpl.this.j0.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C1767f implements mm {
        public C1767f() {
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public interface InterfaceC1768g {
        /* renamed from: a */
        boolean mo3834a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public final class C1769h implements InterfaceC1796i.a {
        public C1769h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: b */
        public void mo3835b(C1792e c1792e, boolean z) {
            AppCompatDelegateImpl.this.c0(c1792e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: c */
        public boolean mo3836c(C1792e c1792e) {
            Window.Callback callbackY0 = AppCompatDelegateImpl.this.y0();
            if (callbackY0 == null) {
                return true;
            }
            callbackY0.onMenuOpened(108, c1792e);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C1770i implements vm.InterfaceC17615a {

        /* renamed from: a */
        public vm.InterfaceC17615a f5421a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        public class a extends azi {
            public a() {
            }

            @Override // p001o.zyi
            /* renamed from: b */
            public void mo3832b(View view) {
                AppCompatDelegateImpl.this.j0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.k0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.j0.getParent() instanceof View) {
                    wvi.j0((View) AppCompatDelegateImpl.this.j0.getParent());
                }
                AppCompatDelegateImpl.this.j0.m4118k();
                AppCompatDelegateImpl.this.m0.m56978h(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.m0 = null;
                wvi.j0(appCompatDelegateImpl2.p0);
            }
        }

        public C1770i(vm.InterfaceC17615a interfaceC17615a) {
            this.f5421a = interfaceC17615a;
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: a */
        public boolean mo3837a(vm vmVar, Menu menu) {
            return this.f5421a.mo3837a(vmVar, menu);
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: b */
        public void mo3838b(vm vmVar) {
            this.f5421a.mo3838b(vmVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.k0 != null) {
                appCompatDelegateImpl.f5390y.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.l0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.j0 != null) {
                appCompatDelegateImpl2.m0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.m0 = wvi.m55118e(appCompatDelegateImpl3.j0).m56973b(0.0f);
                AppCompatDelegateImpl.this.m0.m56978h(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            pj0 pj0Var = appCompatDelegateImpl4.f5382L;
            if (pj0Var != null) {
                pj0Var.onSupportActionModeFinished(appCompatDelegateImpl4.i0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.i0 = null;
            wvi.j0(appCompatDelegateImpl5.p0);
            AppCompatDelegateImpl.this.f1();
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: c */
        public boolean mo3839c(vm vmVar, MenuItem menuItem) {
            return this.f5421a.mo3839c(vmVar, menuItem);
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: d */
        public boolean mo3840d(vm vmVar, Menu menu) {
            wvi.j0(AppCompatDelegateImpl.this.p0);
            return this.f5421a.mo3840d(vmVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public static class C1771j {
        /* renamed from: a */
        public static boolean m3841a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        public static String m3842b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public static class C1772k {
        /* renamed from: a */
        public static void m3843a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* renamed from: b */
        public static pha m3844b(Configuration configuration) {
            return pha.m43682b(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m3845c(pha phaVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(phaVar.m43688g()));
        }

        /* renamed from: d */
        public static void m3846d(Configuration configuration, pha phaVar) {
            configuration.setLocales(LocaleList.forLanguageTags(phaVar.m43688g()));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public static class C1773l {
        /* renamed from: a */
        public static void m3847a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public static class C1774m {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m3848a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m3849b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: o.bk0
                public final void onBackInvoked() {
                    appCompatDelegateImpl.G0();
                }
            };
            yj0.m57858a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* renamed from: c */
        public static void m3850c(Object obj, Object obj2) {
            yj0.m57858a(obj).unregisterOnBackInvokedCallback(xj0.m56367a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    public class C1775n extends v8j {

        /* renamed from: b */
        public InterfaceC1768g f5424b;

        /* renamed from: c */
        public boolean f5425c;

        /* renamed from: d */
        public boolean f5426d;

        /* renamed from: e */
        public boolean f5427e;

        public C1775n(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m3851b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f5426d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f5426d = false;
            }
        }

        /* renamed from: c */
        public void m3852c(Window.Callback callback) {
            try {
                this.f5425c = true;
                callback.onContentChanged();
            } finally {
                this.f5425c = false;
            }
        }

        /* renamed from: d */
        public void m3853d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f5427e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f5427e = false;
            }
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f5426d ? m52460a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.J0(keyEvent.getKeyCode(), keyEvent);
        }

        /* renamed from: e */
        public void m3854e(InterfaceC1768g interfaceC1768g) {
            this.f5424b = interfaceC1768g;
        }

        /* renamed from: f */
        public final ActionMode m3855f(ActionMode.Callback callback) {
            ndg.C15549a c15549a = new ndg.C15549a(AppCompatDelegateImpl.this.f5389x, callback);
            vm vmVarMo3802S = AppCompatDelegateImpl.this.mo3802S(c15549a);
            if (vmVarMo3802S != null) {
                return c15549a.m40392e(vmVarMo3802S);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f5425c) {
                m52460a().onContentChanged();
            }
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1792e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            InterfaceC1768g interfaceC1768g = this.f5424b;
            return (interfaceC1768g == null || (viewOnCreatePanelView = interfaceC1768g.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.M0(i);
            return true;
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f5427e) {
                m52460a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                AppCompatDelegateImpl.this.N0(i);
            }
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1792e c1792e = menu instanceof C1792e ? (C1792e) menu : null;
            if (i == 0 && c1792e == null) {
                return false;
            }
            if (c1792e != null) {
                c1792e.f0(true);
            }
            InterfaceC1768g interfaceC1768g = this.f5424b;
            boolean zOnPreparePanel = interfaceC1768g != null && interfaceC1768g.mo3834a(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (c1792e != null) {
                c1792e.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            C1792e c1792e;
            PanelFeatureState panelFeatureStateW0 = AppCompatDelegateImpl.this.w0(0, true);
            if (panelFeatureStateW0 == null || (c1792e = panelFeatureStateW0.f5400j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c1792e, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // p001o.v8j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.E0() && i == 0) ? m3855f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    public class C1776o extends AbstractC1777p {

        /* renamed from: c */
        public final PowerManager f5429c;

        public C1776o(Context context) {
            super();
            this.f5429c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: b */
        public IntentFilter mo3856b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: c */
        public int mo3857c() {
            return C1771j.m3841a(this.f5429c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: d */
        public void mo3858d() {
            AppCompatDelegateImpl.this.mo3811f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    public abstract class AbstractC1777p {

        /* renamed from: a */
        public BroadcastReceiver f5431a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC1777p.this.mo3858d();
            }
        }

        public AbstractC1777p() {
        }

        /* renamed from: a */
        public void m3859a() {
            BroadcastReceiver broadcastReceiver = this.f5431a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f5389x.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f5431a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo3856b();

        /* renamed from: c */
        public abstract int mo3857c();

        /* renamed from: d */
        public abstract void mo3858d();

        /* renamed from: e */
        public void m3860e() {
            m3859a();
            IntentFilter intentFilterMo3856b = mo3856b();
            if (intentFilterMo3856b == null || intentFilterMo3856b.countActions() == 0) {
                return;
            }
            if (this.f5431a == null) {
                this.f5431a = new a();
            }
            AppCompatDelegateImpl.this.f5389x.registerReceiver(this.f5431a, intentFilterMo3856b);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    public class C1778q extends AbstractC1777p {

        /* renamed from: c */
        public final xyh f5434c;

        public C1778q(xyh xyhVar) {
            super();
            this.f5434c = xyhVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: b */
        public IntentFilter mo3856b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: c */
        public int mo3857c() {
            return this.f5434c.m56968d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1777p
        /* renamed from: d */
        public void mo3858d() {
            AppCompatDelegateImpl.this.mo3811f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    public class C1779r extends ContentFrameLayout {
        public C1779r(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final boolean m3861a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m3861a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.e0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(lk0.m37353b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    public final class C1780s implements InterfaceC1796i.a {
        public C1780s() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: b */
        public void mo3835b(C1792e c1792e, boolean z) {
            C1792e c1792eMo4019F = c1792e.mo4019F();
            boolean z2 = c1792eMo4019F != c1792e;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                c1792e = c1792eMo4019F;
            }
            PanelFeatureState panelFeatureStateP0 = appCompatDelegateImpl.p0(c1792e);
            if (panelFeatureStateP0 != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.f0(panelFeatureStateP0, z);
                } else {
                    AppCompatDelegateImpl.this.b0(panelFeatureStateP0.f5391a, panelFeatureStateP0, c1792eMo4019F);
                    AppCompatDelegateImpl.this.f0(panelFeatureStateP0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: c */
        public boolean mo3836c(C1792e c1792e) {
            Window.Callback callbackY0;
            if (c1792e != c1792e.mo4019F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.u0 || (callbackY0 = appCompatDelegateImpl.y0()) == null || AppCompatDelegateImpl.this.F0) {
                return true;
            }
            callbackY0.onMenuOpened(108, c1792e);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, pj0 pj0Var) {
        this(activity, null, pj0Var, activity);
    }

    public static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            C1772k.m3843a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & Opcodes.CHECKCAST;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & Opcodes.CHECKCAST)) {
                configuration3.screenLayout |= i21 & Opcodes.CHECKCAST;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C1773l.m3847a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            int i36 = configuration.densityDpi;
            int i37 = configuration2.densityDpi;
            if (i36 != i37) {
                configuration3.densityDpi = i37;
            }
        }
        return configuration3;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: A */
    public void mo3787A(Bundle bundle) {
        String strM23765c;
        this.D0 = true;
        m3803V(false);
        o0();
        Object obj = this.f5388s;
        if (obj instanceof Activity) {
            try {
                strM23765c = dsb.m23765c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM23765c = null;
            }
            if (strM23765c != null) {
                ActionBar actionBarQ0 = Q0();
                if (actionBarQ0 == null) {
                    this.Q0 = true;
                } else {
                    actionBarQ0.mo3749r(true);
                }
            }
            AbstractC1783b.m3887d(this);
        }
        this.G0 = new Configuration(this.f5389x.getResources().getConfiguration());
        this.E0 = true;
    }

    public final boolean A0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f5399i;
        if (view != null) {
            panelFeatureState.f5398h = view;
            return true;
        }
        if (panelFeatureState.f5400j == null) {
            return false;
        }
        if (this.h0 == null) {
            this.h0 = new C1780s();
        }
        View view2 = (View) panelFeatureState.m3822a(this.h0);
        panelFeatureState.f5398h = view2;
        return view2 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3788B() {
        if (this.f5388s instanceof Activity) {
            AbstractC1783b.m3881H(this);
        }
        if (this.N0) {
            this.f5390y.getDecorView().removeCallbacks(this.P0);
        }
        this.F0 = true;
        if (this.H0 != -100) {
            Object obj = this.f5388s;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                X0.put(this.f5388s.getClass().getName(), Integer.valueOf(this.H0));
            } else {
                X0.remove(this.f5388s.getClass().getName());
            }
        }
        ActionBar actionBar = this.f5383M;
        if (actionBar != null) {
            actionBar.mo3745n();
        }
        d0();
    }

    public final boolean B0(PanelFeatureState panelFeatureState) {
        panelFeatureState.m3825d(r0());
        panelFeatureState.f5397g = new C1779r(panelFeatureState.f5402l);
        panelFeatureState.f5393c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: C */
    public void mo3789C(Bundle bundle) {
        n0();
    }

    public final boolean C0(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f5389x;
        int i = panelFeatureState.f5391a;
        if ((i == 0 || i == 108) && this.f5386Y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(z5e.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(z5e.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(z5e.actionBarWidgetTheme, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                i64 i64Var = new i64(context, 0);
                i64Var.getTheme().setTo(themeNewTheme);
                context = i64Var;
            }
        }
        C1792e c1792e = new C1792e(context);
        c1792e.mo4036W(this);
        panelFeatureState.m3824c(c1792e);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: D */
    public void mo3790D() {
        ActionBar actionBarMo3818u = mo3818u();
        if (actionBarMo3818u != null) {
            actionBarMo3818u.mo3752u(true);
        }
    }

    public final void D0(int i) {
        this.O0 = (1 << i) | this.O0;
        if (this.N0) {
            return;
        }
        wvi.e0(this.f5390y.getDecorView(), this.P0);
        this.N0 = true;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: E */
    public void mo3791E(Bundle bundle) {
    }

    public boolean E0() {
        return this.n0;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: F */
    public void mo3792F() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        m3804W(true, false);
    }

    public int F0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return u0(context).mo3857c();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return t0(context).mo3857c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: G */
    public void mo3793G() {
        ActionBar actionBarMo3818u = mo3818u();
        if (actionBarMo3818u != null) {
            actionBarMo3818u.mo3752u(false);
        }
    }

    public boolean G0() {
        boolean z = this.C0;
        this.C0 = false;
        PanelFeatureState panelFeatureStateW0 = w0(0, false);
        if (panelFeatureStateW0 != null && panelFeatureStateW0.f5405o) {
            if (!z) {
                f0(panelFeatureStateW0, true);
            }
            return true;
        }
        vm vmVar = this.i0;
        if (vmVar != null) {
            vmVar.mo3931c();
            return true;
        }
        ActionBar actionBarMo3818u = mo3818u();
        return actionBarMo3818u != null && actionBarMo3818u.mo3739h();
    }

    public boolean H0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.C0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean I0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateW0 = w0(i, true);
        if (panelFeatureStateW0.f5405o) {
            return false;
        }
        return S0(panelFeatureStateW0, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: J */
    public boolean mo3794J(int i) {
        int iU0 = U0(i);
        if (this.y0 && iU0 == 108) {
            return false;
        }
        if (this.u0 && iU0 == 1) {
            this.u0 = false;
        }
        if (iU0 == 1) {
            b1();
            this.y0 = true;
            return true;
        }
        if (iU0 == 2) {
            b1();
            this.s0 = true;
            return true;
        }
        if (iU0 == 5) {
            b1();
            this.t0 = true;
            return true;
        }
        if (iU0 == 10) {
            b1();
            this.w0 = true;
            return true;
        }
        if (iU0 == 108) {
            b1();
            this.u0 = true;
            return true;
        }
        if (iU0 != 109) {
            return this.f5390y.requestFeature(iU0);
        }
        b1();
        this.v0 = true;
        return true;
    }

    public boolean J0(int i, KeyEvent keyEvent) {
        ActionBar actionBarMo3818u = mo3818u();
        if (actionBarMo3818u != null && actionBarMo3818u.mo3746o(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.B0;
        if (panelFeatureState != null && R0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.B0;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f5404n = true;
            }
            return true;
        }
        if (this.B0 == null) {
            PanelFeatureState panelFeatureStateW0 = w0(0, true);
            S0(panelFeatureStateW0, keyEvent);
            boolean zR0 = R0(panelFeatureStateW0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateW0.f5403m = false;
            if (zR0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: K */
    public void mo3795K(int i) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.p0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5389x).inflate(i, viewGroup);
        this.f5381H.m3852c(this.f5390y.getCallback());
    }

    public boolean K0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: L */
    public void mo3796L(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.p0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5381H.m3852c(this.f5390y.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L0(int i, KeyEvent keyEvent) {
        boolean zS0;
        AudioManager audioManager;
        d85 d85Var;
        if (this.i0 != null) {
            return false;
        }
        boolean zMo4122b = true;
        PanelFeatureState panelFeatureStateW0 = w0(i, true);
        if (i != 0 || (d85Var = this.f5386Y) == null || !d85Var.mo4121a() || ViewConfiguration.get(this.f5389x).hasPermanentMenuKey()) {
            boolean z = panelFeatureStateW0.f5405o;
            if (z || panelFeatureStateW0.f5404n) {
                f0(panelFeatureStateW0, true);
                zMo4122b = z;
            } else if (panelFeatureStateW0.f5403m) {
                if (panelFeatureStateW0.f5408r) {
                    panelFeatureStateW0.f5403m = false;
                    zS0 = S0(panelFeatureStateW0, keyEvent);
                } else {
                    zS0 = true;
                }
                if (zS0) {
                    P0(panelFeatureStateW0, keyEvent);
                }
            } else {
                zMo4122b = false;
            }
        } else if (this.f5386Y.mo4124d()) {
            zMo4122b = this.f5386Y.mo4122b();
        } else if (!this.F0 && S0(panelFeatureStateW0, keyEvent)) {
            zMo4122b = this.f5386Y.mo4123c();
        }
        if (zMo4122b && (audioManager = (AudioManager) this.f5389x.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zMo4122b;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: M */
    public void mo3797M(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.p0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5381H.m3852c(this.f5390y.getCallback());
    }

    public void M0(int i) {
        ActionBar actionBarMo3818u;
        if (i != 108 || (actionBarMo3818u = mo3818u()) == null) {
            return;
        }
        actionBarMo3818u.mo3740i(true);
    }

    public void N0(int i) {
        if (i == 108) {
            ActionBar actionBarMo3818u = mo3818u();
            if (actionBarMo3818u != null) {
                actionBarMo3818u.mo3740i(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState panelFeatureStateW0 = w0(i, true);
            if (panelFeatureStateW0.f5405o) {
                f0(panelFeatureStateW0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3798O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo3798O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.V0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.W0) != null) {
            C1774m.m3850c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.W0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f5388s;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.V0 = onBackInvokedDispatcher;
            } else {
                this.V0 = C1774m.m3848a((Activity) this.f5388s);
            }
        }
        f1();
    }

    public void O0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: P */
    public void mo3799P(Toolbar toolbar) {
        if (this.f5388s instanceof Activity) {
            ActionBar actionBarMo3818u = mo3818u();
            if (actionBarMo3818u instanceof C1785d) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f5384Q = null;
            if (actionBarMo3818u != null) {
                actionBarMo3818u.mo3745n();
            }
            this.f5383M = null;
            if (toolbar != null) {
                C1784c c1784c = new C1784c(toolbar, x0(), this.f5381H);
                this.f5383M = c1784c;
                this.f5381H.m3854e(c1784c.f5456c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f5381H.m3854e(null);
            }
            mo3820w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f5405o || this.F0) {
            return;
        }
        if (panelFeatureState.f5391a == 0) {
            if ((this.f5389x.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null && !callbackY0.onMenuOpened(panelFeatureState.f5391a, panelFeatureState.f5400j)) {
            f0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5389x.getSystemService("window");
        if (windowManager == null || !S0(panelFeatureState, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = panelFeatureState.f5397g;
        if (viewGroup != null && !panelFeatureState.f5407q) {
            View view = panelFeatureState.f5399i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            panelFeatureState.f5404n = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f5394d, panelFeatureState.f5395e, 1002, 8519680, -3);
            layoutParams2.gravity = panelFeatureState.f5393c;
            layoutParams2.windowAnimations = panelFeatureState.f5396f;
            windowManager.addView(panelFeatureState.f5397g, layoutParams2);
            panelFeatureState.f5405o = true;
            if (panelFeatureState.f5391a != 0) {
                f1();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (!B0(panelFeatureState) || panelFeatureState.f5397g == null) {
                return;
            }
        } else if (panelFeatureState.f5407q && viewGroup.getChildCount() > 0) {
            panelFeatureState.f5397g.removeAllViews();
        }
        if (!A0(panelFeatureState) || !panelFeatureState.m3823b()) {
            panelFeatureState.f5407q = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f5398h.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        }
        panelFeatureState.f5397g.setBackgroundResource(panelFeatureState.f5392b);
        ViewParent parent = panelFeatureState.f5398h.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(panelFeatureState.f5398h);
        }
        panelFeatureState.f5397g.addView(panelFeatureState.f5398h, layoutParams3);
        if (!panelFeatureState.f5398h.hasFocus()) {
            panelFeatureState.f5398h.requestFocus();
        }
        i = -2;
        panelFeatureState.f5404n = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f5394d, panelFeatureState.f5395e, 1002, 8519680, -3);
        layoutParams22.gravity = panelFeatureState.f5393c;
        layoutParams22.windowAnimations = panelFeatureState.f5396f;
        windowManager.addView(panelFeatureState.f5397g, layoutParams22);
        panelFeatureState.f5405o = true;
        if (panelFeatureState.f5391a != 0) {
        }
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: Q */
    public void mo3800Q(int i) {
        this.I0 = i;
    }

    public final ActionBar Q0() {
        return this.f5383M;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: R */
    public final void mo3801R(CharSequence charSequence) {
        this.f5385X = charSequence;
        d85 d85Var = this.f5386Y;
        if (d85Var != null) {
            d85Var.setWindowTitle(charSequence);
            return;
        }
        if (Q0() != null) {
            Q0().mo3755x(charSequence);
            return;
        }
        TextView textView = this.q0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean R0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C1792e c1792e;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f5403m || S0(panelFeatureState, keyEvent)) && (c1792e = panelFeatureState.f5400j) != null) {
            zPerformShortcut = c1792e.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.f5386Y == null) {
            f0(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: S */
    public vm mo3802S(vm.InterfaceC17615a interfaceC17615a) {
        pj0 pj0Var;
        if (interfaceC17615a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        vm vmVar = this.i0;
        if (vmVar != null) {
            vmVar.mo3931c();
        }
        C1770i c1770i = new C1770i(interfaceC17615a);
        ActionBar actionBarMo3818u = mo3818u();
        if (actionBarMo3818u != null) {
            vm vmVarMo3756y = actionBarMo3818u.mo3756y(c1770i);
            this.i0 = vmVarMo3756y;
            if (vmVarMo3756y != null && (pj0Var = this.f5382L) != null) {
                pj0Var.onSupportActionModeStarted(vmVarMo3756y);
            }
        }
        if (this.i0 == null) {
            this.i0 = a1(c1770i);
        }
        f1();
        return this.i0;
    }

    public final boolean S0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        d85 d85Var;
        d85 d85Var2;
        d85 d85Var3;
        if (this.F0) {
            return false;
        }
        if (panelFeatureState.f5403m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.B0;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            f0(panelFeatureState2, false);
        }
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null) {
            panelFeatureState.f5399i = callbackY0.onCreatePanelView(panelFeatureState.f5391a);
        }
        int i = panelFeatureState.f5391a;
        boolean z = i == 0 || i == 108;
        if (z && (d85Var3 = this.f5386Y) != null) {
            d85Var3.setMenuPrepared();
        }
        if (panelFeatureState.f5399i == null && (!z || !(Q0() instanceof C1784c))) {
            C1792e c1792e = panelFeatureState.f5400j;
            if (c1792e == null || panelFeatureState.f5408r) {
                if (c1792e == null && (!C0(panelFeatureState) || panelFeatureState.f5400j == null)) {
                    return false;
                }
                if (z && this.f5386Y != null) {
                    if (this.f5387Z == null) {
                        this.f5387Z = new C1769h();
                    }
                    this.f5386Y.setMenu(panelFeatureState.f5400j, this.f5387Z);
                }
                panelFeatureState.f5400j.i0();
                if (!callbackY0.onCreatePanelMenu(panelFeatureState.f5391a, panelFeatureState.f5400j)) {
                    panelFeatureState.m3824c(null);
                    if (z && (d85Var = this.f5386Y) != null) {
                        d85Var.setMenu(null, this.f5387Z);
                    }
                    return false;
                }
                panelFeatureState.f5408r = false;
            }
            panelFeatureState.f5400j.i0();
            Bundle bundle = panelFeatureState.f5409s;
            if (bundle != null) {
                panelFeatureState.f5400j.m4032S(bundle);
                panelFeatureState.f5409s = null;
            }
            if (!callbackY0.onPreparePanel(0, panelFeatureState.f5399i, panelFeatureState.f5400j)) {
                if (z && (d85Var2 = this.f5386Y) != null) {
                    d85Var2.setMenu(null, this.f5387Z);
                }
                panelFeatureState.f5400j.h0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f5406p = z2;
            panelFeatureState.f5400j.setQwertyMode(z2);
            panelFeatureState.f5400j.h0();
        }
        panelFeatureState.f5403m = true;
        panelFeatureState.f5404n = false;
        this.B0 = panelFeatureState;
        return true;
    }

    public final void T0(boolean z) {
        d85 d85Var = this.f5386Y;
        if (d85Var == null || !d85Var.mo4121a() || (ViewConfiguration.get(this.f5389x).hasPermanentMenuKey() && !this.f5386Y.mo4125e())) {
            PanelFeatureState panelFeatureStateW0 = w0(0, true);
            panelFeatureStateW0.f5407q = true;
            f0(panelFeatureStateW0, false);
            P0(panelFeatureStateW0, null);
            return;
        }
        Window.Callback callbackY0 = y0();
        if (this.f5386Y.mo4124d() && z) {
            this.f5386Y.mo4122b();
            if (this.F0) {
                return;
            }
            callbackY0.onPanelClosed(108, w0(0, true).f5400j);
            return;
        }
        if (callbackY0 == null || this.F0) {
            return;
        }
        if (this.N0 && (this.O0 & 1) != 0) {
            this.f5390y.getDecorView().removeCallbacks(this.P0);
            this.P0.run();
        }
        PanelFeatureState panelFeatureStateW02 = w0(0, true);
        C1792e c1792e = panelFeatureStateW02.f5400j;
        if (c1792e == null || panelFeatureStateW02.f5408r || !callbackY0.onPreparePanel(0, panelFeatureStateW02.f5399i, c1792e)) {
            return;
        }
        callbackY0.onMenuOpened(108, panelFeatureStateW02.f5400j);
        this.f5386Y.mo4123c();
    }

    public final int U0(int i) {
        if (i == 8) {
            return 108;
        }
        return i == 9 ? Opcodes.LDIV : i;
    }

    /* renamed from: V */
    public final boolean m3803V(boolean z) {
        return m3804W(z, true);
    }

    public void V0(Configuration configuration, pha phaVar) {
        C1772k.m3846d(configuration, phaVar);
    }

    /* renamed from: W */
    public final boolean m3804W(boolean z, boolean z2) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        if (this.F0) {
            return false;
        }
        int iA0 = a0();
        int iF0 = F0(this.f5389x, iA0);
        pha phaVarM3807Z = Build.VERSION.SDK_INT < 33 ? m3807Z(this.f5389x) : null;
        if (!z2 && phaVarM3807Z != null) {
            phaVarM3807Z = v0(this.f5389x.getResources().getConfiguration());
        }
        boolean zE1 = e1(iF0, phaVarM3807Z, z);
        if (iA0 == 0) {
            u0(this.f5389x).m3860e();
        } else {
            AbstractC1777p abstractC1777p = this.L0;
            if (abstractC1777p != null) {
                abstractC1777p.m3859a();
            }
        }
        if (iA0 == 3) {
            t0(this.f5389x).m3860e();
        } else {
            AbstractC1777p abstractC1777p2 = this.M0;
            if (abstractC1777p2 != null) {
                abstractC1777p2.m3859a();
            }
        }
        return zE1;
    }

    public void W0(pha phaVar) {
        C1772k.m3845c(phaVar);
    }

    /* renamed from: X */
    public final void m3805X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.p0.findViewById(R.id.content);
        View decorView = this.f5390y.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f5389x.obtainStyledAttributes(bbe.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(bbe.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean X0() {
        ViewGroup viewGroup;
        return this.o0 && (viewGroup = this.p0) != null && viewGroup.isLaidOut();
    }

    /* renamed from: Y */
    public final void m3806Y(Window window) {
        if (this.f5390y != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C1775n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C1775n c1775n = new C1775n(callback);
        this.f5381H = c1775n;
        window.setCallback(c1775n);
        anh anhVarM17524u = anh.m17524u(this.f5389x, null, Z0);
        Drawable drawableM17533h = anhVarM17524u.m17533h(0);
        if (drawableM17533h != null) {
            window.setBackgroundDrawable(drawableM17533h);
        }
        anhVarM17524u.m17546x();
        this.f5390y = window;
        if (Build.VERSION.SDK_INT < 33 || this.V0 != null) {
            return;
        }
        mo3798O(null);
    }

    public final boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f5390y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: Z */
    public pha m3807Z(Context context) {
        pha phaVarM3894t;
        if (Build.VERSION.SDK_INT >= 33 || (phaVarM3894t = AbstractC1783b.m3894t()) == null) {
            return null;
        }
        pha phaVarV0 = v0(context.getApplicationContext().getResources().getConfiguration());
        pha phaVarM51587b = uha.m51587b(phaVarM3894t, phaVarV0);
        return phaVarM51587b.m43686e() ? phaVarV0 : phaVarM51587b;
    }

    public boolean Z0() {
        if (this.V0 == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateW0 = w0(0, false);
        return (panelFeatureStateW0 != null && panelFeatureStateW0.f5405o) || this.i0 != null;
    }

    @Override // androidx.appcompat.view.menu.C1792e.a
    /* renamed from: a */
    public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateP0;
        Window.Callback callbackY0 = y0();
        if (callbackY0 == null || this.F0 || (panelFeatureStateP0 = p0(c1792e.mo4019F())) == null) {
            return false;
        }
        return callbackY0.onMenuItemSelected(panelFeatureStateP0.f5391a, menuItem);
    }

    public final int a0() {
        int i = this.H0;
        return i != -100 ? i : AbstractC1783b.m3892o();
    }

    public vm a1(vm.InterfaceC17615a interfaceC17615a) {
        vm vmVarOnWindowStartingSupportActionMode;
        Context i64Var;
        pj0 pj0Var;
        m0();
        vm vmVar = this.i0;
        if (vmVar != null) {
            vmVar.mo3931c();
        }
        if (!(interfaceC17615a instanceof C1770i)) {
            interfaceC17615a = new C1770i(interfaceC17615a);
        }
        pj0 pj0Var2 = this.f5382L;
        if (pj0Var2 == null || this.F0) {
            vmVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                vmVarOnWindowStartingSupportActionMode = pj0Var2.onWindowStartingSupportActionMode(interfaceC17615a);
            } catch (AbstractMethodError unused) {
            }
        }
        if (vmVarOnWindowStartingSupportActionMode != null) {
            this.i0 = vmVarOnWindowStartingSupportActionMode;
        } else {
            if (this.j0 == null) {
                if (this.x0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f5389x.getTheme();
                    theme.resolveAttribute(z5e.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f5389x.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        i64Var = new i64(this.f5389x, 0);
                        i64Var.getTheme().setTo(themeNewTheme);
                    } else {
                        i64Var = this.f5389x;
                    }
                    this.j0 = new ActionBarContextView(i64Var);
                    PopupWindow popupWindow = new PopupWindow(i64Var, (AttributeSet) null, z5e.actionModePopupWindowStyle);
                    this.k0 = popupWindow;
                    oed.m42134b(popupWindow, 2);
                    this.k0.setContentView(this.j0);
                    this.k0.setWidth(-1);
                    i64Var.getTheme().resolveAttribute(z5e.actionBarSize, typedValue, true);
                    this.j0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, i64Var.getResources().getDisplayMetrics()));
                    this.k0.setHeight(-2);
                    this.l0 = new RunnableC1765d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.p0.findViewById(r8e.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(r0()));
                        this.j0 = (ActionBarContextView) viewStubCompat.m4444a();
                    }
                }
            }
            if (this.j0 != null) {
                m0();
                this.j0.m4118k();
                y2g y2gVar = new y2g(this.j0.getContext(), this.j0, interfaceC17615a, this.k0 == null);
                if (interfaceC17615a.mo3837a(y2gVar, y2gVar.mo3933e())) {
                    y2gVar.mo3937k();
                    this.j0.m4115h(y2gVar);
                    this.i0 = y2gVar;
                    if (X0()) {
                        this.j0.setAlpha(0.0f);
                        xyi xyiVarM56973b = wvi.m55118e(this.j0).m56973b(1.0f);
                        this.m0 = xyiVarM56973b;
                        xyiVarM56973b.m56978h(new C1766e());
                    } else {
                        this.j0.setAlpha(1.0f);
                        this.j0.setVisibility(0);
                        if (this.j0.getParent() instanceof View) {
                            wvi.j0((View) this.j0.getParent());
                        }
                    }
                    if (this.k0 != null) {
                        this.f5390y.getDecorView().post(this.l0);
                    }
                } else {
                    this.i0 = null;
                }
            }
        }
        vm vmVar2 = this.i0;
        if (vmVar2 != null && (pj0Var = this.f5382L) != null) {
            pj0Var.onSupportActionModeStarted(vmVar2);
        }
        f1();
        return this.i0;
    }

    @Override // androidx.appcompat.view.menu.C1792e.a
    /* renamed from: b */
    public void mo3809b(C1792e c1792e) {
        T0(true);
    }

    public void b0(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.A0;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f5400j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f5405o) && !this.F0) {
            this.f5381H.m3853d(this.f5390y.getCallback(), i, menu);
        }
    }

    public final void b1() {
        if (this.o0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void c0(C1792e c1792e) {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        this.f5386Y.mo4130j();
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null && !this.F0) {
            callbackY0.onPanelClosed(108, c1792e);
        }
        this.z0 = false;
    }

    public final AppCompatActivity c1() {
        for (Context baseContext = this.f5389x; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void d0() {
        AbstractC1777p abstractC1777p = this.L0;
        if (abstractC1777p != null) {
            abstractC1777p.m3859a();
        }
        AbstractC1777p abstractC1777p2 = this.M0;
        if (abstractC1777p2 != null) {
            abstractC1777p2.m3859a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(Configuration configuration) {
        Activity activity = (Activity) this.f5388s;
        if (activity instanceof xca) {
            if (((xca) activity).getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.E0 || this.F0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: e */
    public void mo3810e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.p0.findViewById(R.id.content)).addView(view, layoutParams);
        this.f5381H.m3852c(this.f5390y.getCallback());
    }

    public void e0(int i) {
        f0(w0(i, true), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e1(int i, pha phaVar, boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        boolean z2;
        Configuration configurationG0 = g0(this.f5389x, i, phaVar, null, false);
        int iS0 = s0(this.f5389x);
        Configuration configuration = this.G0;
        if (configuration == null) {
            configuration = this.f5389x.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = configurationG0.uiMode & 48;
        pha phaVarV0 = v0(configuration);
        pha phaVarV02 = phaVar == null ? null : v0(configurationG0);
        int i4 = i2 != i3 ? 512 : 0;
        if (phaVarV02 != null && !phaVarV0.equals(phaVarV02)) {
            i4 = i4 | 4 | 8192;
        }
        boolean z3 = true;
        if (((~iS0) & i4) != 0 && z && this.D0 && (a1 || this.E0)) {
            Object obj = this.f5388s;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i4 & 8192) != 0) {
                    ((Activity) this.f5388s).getWindow().getDecorView().setLayoutDirection(configurationG0.getLayoutDirection());
                }
                mn.m39366f((Activity) this.f5388s);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 || i4 == 0) {
            z3 = z2;
        } else {
            g1(i3, phaVarV02, (i4 & iS0) == i4, null);
        }
        if (z3) {
            Object obj2 = this.f5388s;
            if (obj2 instanceof AppCompatActivity) {
                if ((i4 & 512) != 0) {
                    ((AppCompatActivity) obj2).onNightModeChanged(i);
                }
                if ((i4 & 4) != 0) {
                    ((AppCompatActivity) this.f5388s).onLocalesChanged(phaVar);
                }
            }
        }
        if (phaVarV02 != null) {
            W0(v0(this.f5389x.getResources().getConfiguration()));
        }
        return z3;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: f */
    public boolean mo3811f() {
        return m3803V(true);
    }

    public void f0(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        d85 d85Var;
        if (z && panelFeatureState.f5391a == 0 && (d85Var = this.f5386Y) != null && d85Var.mo4124d()) {
            c0(panelFeatureState.f5400j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5389x.getSystemService("window");
        if (windowManager != null && panelFeatureState.f5405o && (viewGroup = panelFeatureState.f5397g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                b0(panelFeatureState.f5391a, panelFeatureState, null);
            }
        }
        panelFeatureState.f5403m = false;
        panelFeatureState.f5404n = false;
        panelFeatureState.f5405o = false;
        panelFeatureState.f5398h = null;
        panelFeatureState.f5407q = true;
        if (this.B0 == panelFeatureState) {
            this.B0 = null;
        }
        if (panelFeatureState.f5391a == 0) {
            f1();
        }
    }

    public void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zZ0 = Z0();
            if (zZ0 && this.W0 == null) {
                this.W0 = C1774m.m3849b(this.V0, this);
            } else {
                if (zZ0 || (onBackInvokedCallback = this.W0) == null) {
                    return;
                }
                C1774m.m3850c(this.V0, onBackInvokedCallback);
                this.W0 = null;
            }
        }
    }

    public final Configuration g0(Context context, int i, pha phaVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (phaVar != null) {
            V0(configuration2, phaVar);
        }
        return configuration2;
    }

    public final void g1(int i, pha phaVar, boolean z, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Resources resources = this.f5389x.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (phaVar != null) {
            V0(configuration2, phaVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            spe.m48615a(resources);
        }
        int i2 = this.I0;
        if (i2 != 0) {
            this.f5389x.setTheme(i2);
            this.f5389x.getTheme().applyStyle(this.I0, true);
        }
        if (z && (this.f5388s instanceof Activity)) {
            d1(configuration2);
        }
    }

    public final ViewGroup h0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f5389x.obtainStyledAttributes(bbe.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTheme_windowNoTitle, false)) {
            mo3794J(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTheme_windowActionBar, false)) {
            mo3794J(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTheme_windowActionBarOverlay, false)) {
            mo3794J(Opcodes.LDIV);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTheme_windowActionModeOverlay, false)) {
            mo3794J(10);
        }
        this.x0 = typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        o0();
        this.f5390y.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5389x);
        if (this.y0) {
            viewGroup = this.w0 ? (ViewGroup) layoutInflaterFrom.inflate(g9e.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(g9e.abc_screen_simple, (ViewGroup) null);
        } else if (this.x0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(g9e.abc_dialog_title_material, (ViewGroup) null);
            this.v0 = false;
            this.u0 = false;
        } else if (this.u0) {
            TypedValue typedValue = new TypedValue();
            this.f5389x.getTheme().resolveAttribute(z5e.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i64(this.f5389x, typedValue.resourceId) : this.f5389x).inflate(g9e.abc_screen_toolbar, (ViewGroup) null);
            d85 d85Var = (d85) viewGroup.findViewById(r8e.decor_content_parent);
            this.f5386Y = d85Var;
            d85Var.setWindowCallback(y0());
            if (this.v0) {
                this.f5386Y.mo4126f(Opcodes.LDIV);
            }
            if (this.s0) {
                this.f5386Y.mo4126f(2);
            }
            if (this.t0) {
                this.f5386Y.mo4126f(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.u0 + ", windowActionBarOverlay: " + this.v0 + ", android:windowIsFloating: " + this.x0 + ", windowActionModeOverlay: " + this.w0 + ", windowNoTitle: " + this.y0 + " }");
        }
        wvi.x0(viewGroup, new C1763b());
        if (this.f5386Y == null) {
            this.q0 = (TextView) viewGroup.findViewById(r8e.title);
        }
        yzi.m58586c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(r8e.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f5390y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f5390y.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1764c());
        return viewGroup;
    }

    public final int h1(r9j r9jVar, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        int iM46397l = r9jVar != null ? r9jVar.m46397l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.j0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j0.getLayoutParams();
            if (this.j0.isShown()) {
                if (this.R0 == null) {
                    this.R0 = new Rect();
                    this.S0 = new Rect();
                }
                Rect rect2 = this.R0;
                Rect rect3 = this.S0;
                if (r9jVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(r9jVar.m46395j(), r9jVar.m46397l(), r9jVar.m46396k(), r9jVar.m46394i());
                }
                yzi.m58584a(this.p0, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                r9j r9jVarM55094G = wvi.m55094G(this.p0);
                int iM46395j = r9jVarM55094G == null ? 0 : r9jVarM55094G.m46395j();
                int iM46396k = r9jVarM55094G == null ? 0 : r9jVarM55094G.m46396k();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.r0 != null) {
                    View view = this.r0;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM46395j || marginLayoutParams2.rightMargin != iM46396k) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM46395j;
                            marginLayoutParams2.rightMargin = iM46396k;
                            this.r0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f5389x);
                    this.r0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM46395j;
                    layoutParams.rightMargin = iM46396k;
                    this.p0.addView(this.r0, -1, layoutParams);
                }
                View view3 = this.r0;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    i1(this.r0);
                }
                if (!this.w0 && z) {
                    iM46397l = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.j0.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.r0;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iM46397l;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: i */
    public Context mo3812i(Context context) {
        this.D0 = true;
        int iF0 = F0(context, a0());
        if (AbstractC1783b.m3895x(context)) {
            AbstractC1783b.m3885U(context);
        }
        pha phaVarM3807Z = m3807Z(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g0(context, iF0, phaVarM3807Z, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i64) {
            try {
                ((i64) context).m31608a(g0(context, iF0, phaVarM3807Z, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!a1) {
            return super.mo3812i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationG0 = g0(context, iF0, phaVarM3807Z, !configuration2.equals(configuration3) ? q0(configuration2, configuration3) : null, true);
        i64 i64Var = new i64(context, iae.Theme_AppCompat_Empty);
        i64Var.m31608a(configurationG0);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            ppe.C16162f.m44055a(i64Var.getTheme());
        }
        return super.mo3812i(i64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zY0 = false;
        if (this.T0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f5389x.obtainStyledAttributes(bbe.AppCompatTheme);
            String string = typedArrayObtainStyledAttributes.getString(bbe.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.T0 = new sk0();
            } else {
                try {
                    this.T0 = (sk0) this.f5389x.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.T0 = new sk0();
                }
            }
        }
        boolean z2 = Y0;
        if (z2) {
            if (this.U0 == null) {
                this.U0 = new rh9();
            }
            if (this.U0.m46774a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zY0 = Y0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zY0 = true;
                }
                z = zY0;
            }
        } else {
            z = zY0;
        }
        return this.T0.m48413r(view, str, context, attributeSet, z, z2, true, isi.m32706c());
    }

    public final void i1(View view) {
        view.setBackgroundColor((wvi.m55099L(view) & 8192) != 0 ? c64.getColor(this.f5389x, l6e.abc_decor_view_status_guard_light) : c64.getColor(this.f5389x, l6e.abc_decor_view_status_guard));
    }

    public void j0() {
        C1792e c1792e;
        d85 d85Var = this.f5386Y;
        if (d85Var != null) {
            d85Var.mo4130j();
        }
        if (this.k0 != null) {
            this.f5390y.getDecorView().removeCallbacks(this.l0);
            if (this.k0.isShowing()) {
                try {
                    this.k0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.k0 = null;
        }
        m0();
        PanelFeatureState panelFeatureStateW0 = w0(0, false);
        if (panelFeatureStateW0 == null || (c1792e = panelFeatureStateW0.f5400j) == null) {
            return;
        }
        c1792e.close();
    }

    public boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f5388s;
        if (((obj instanceof pc9.InterfaceC16053a) || (obj instanceof dk0)) && (decorView = this.f5390y.getDecorView()) != null && pc9.m43339d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f5381H.m3851b(this.f5390y.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? H0(keyCode, keyEvent) : K0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: l */
    public View mo3813l(int i) {
        n0();
        return this.f5390y.findViewById(i);
    }

    public void l0(int i) {
        PanelFeatureState panelFeatureStateW0;
        PanelFeatureState panelFeatureStateW02 = w0(i, true);
        if (panelFeatureStateW02.f5400j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateW02.f5400j.m4034U(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateW02.f5409s = bundle;
            }
            panelFeatureStateW02.f5400j.i0();
            panelFeatureStateW02.f5400j.clear();
        }
        panelFeatureStateW02.f5408r = true;
        panelFeatureStateW02.f5407q = true;
        if ((i != 108 && i != 0) || this.f5386Y == null || (panelFeatureStateW0 = w0(0, false)) == null) {
            return;
        }
        panelFeatureStateW0.f5403m = false;
        S0(panelFeatureStateW0, null);
    }

    public void m0() {
        xyi xyiVar = this.m0;
        if (xyiVar != null) {
            xyiVar.m56974c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: n */
    public Context mo3814n() {
        return this.f5389x;
    }

    public final void n0() {
        if (this.o0) {
            return;
        }
        this.p0 = h0();
        CharSequence charSequenceX0 = x0();
        if (!TextUtils.isEmpty(charSequenceX0)) {
            d85 d85Var = this.f5386Y;
            if (d85Var != null) {
                d85Var.setWindowTitle(charSequenceX0);
            } else if (Q0() != null) {
                Q0().mo3755x(charSequenceX0);
            } else {
                TextView textView = this.q0;
                if (textView != null) {
                    textView.setText(charSequenceX0);
                }
            }
        }
        m3805X();
        O0(this.p0);
        this.o0 = true;
        PanelFeatureState panelFeatureStateW0 = w0(0, false);
        if (this.F0) {
            return;
        }
        if (panelFeatureStateW0 == null || panelFeatureStateW0.f5400j == null) {
            D0(108);
        }
    }

    public final void o0() {
        if (this.f5390y == null) {
            Object obj = this.f5388s;
            if (obj instanceof Activity) {
                m3806Y(((Activity) obj).getWindow());
            }
        }
        if (this.f5390y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: p */
    public final mm mo3815p() {
        return new C1767f();
    }

    public PanelFeatureState p0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.A0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f5400j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: q */
    public int mo3816q() {
        return this.H0;
    }

    public final Context r0() {
        ActionBar actionBarMo3818u = mo3818u();
        Context contextMo3742k = actionBarMo3818u != null ? actionBarMo3818u.mo3742k() : null;
        return contextMo3742k == null ? this.f5389x : contextMo3742k;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: s */
    public MenuInflater mo3817s() {
        if (this.f5384Q == null) {
            z0();
            ActionBar actionBar = this.f5383M;
            this.f5384Q = new zdg(actionBar != null ? actionBar.mo3742k() : this.f5389x);
        }
        return this.f5384Q;
    }

    public final int s0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.K0 && (this.f5388s instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f5388s.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.J0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.J0 = 0;
            }
        }
        this.K0 = true;
        return this.J0;
    }

    public final AbstractC1777p t0(Context context) {
        if (this.M0 == null) {
            this.M0 = new C1776o(context);
        }
        return this.M0;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: u */
    public ActionBar mo3818u() {
        z0();
        return this.f5383M;
    }

    public final AbstractC1777p u0(Context context) {
        if (this.L0 == null) {
            this.L0 = new C1778q(xyh.m56965a(context));
        }
        return this.L0;
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: v */
    public void mo3819v() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5389x);
        if (layoutInflaterFrom.getFactory() == null) {
            sh9.m48351a(layoutInflaterFrom, this);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    public pha v0(Configuration configuration) {
        return C1772k.m3844b(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: w */
    public void mo3820w() {
        if (Q0() == null || mo3818u().mo3743l()) {
            return;
        }
        D0(0);
    }

    public PanelFeatureState w0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.A0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.A0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final CharSequence x0() {
        Object obj = this.f5388s;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5385X;
    }

    public final Window.Callback y0() {
        return this.f5390y.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC1783b
    /* renamed from: z */
    public void mo3821z(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        ActionBar actionBarMo3818u;
        if (this.u0 && this.o0 && (actionBarMo3818u = mo3818u()) != null) {
            actionBarMo3818u.mo3744m(configuration);
        }
        ek0.m25163b().m25170g(this.f5389x);
        this.G0 = new Configuration(this.f5389x.getResources().getConfiguration());
        m3804W(false, false);
    }

    public final void z0() {
        n0();
        if (this.u0 && this.f5383M == null) {
            Object obj = this.f5388s;
            if (obj instanceof Activity) {
                this.f5383M = new C1785d((Activity) this.f5388s, this.v0);
            } else if (obj instanceof Dialog) {
                this.f5383M = new C1785d((Dialog) this.f5388s);
            }
            ActionBar actionBar = this.f5383M;
            if (actionBar != null) {
                actionBar.mo3749r(this.Q0);
            }
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, pj0 pj0Var) {
        this(dialog.getContext(), dialog.getWindow(), pj0Var, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, pj0 pj0Var, Object obj) {
        AppCompatActivity appCompatActivityC1;
        this.m0 = null;
        this.n0 = true;
        this.H0 = -100;
        this.P0 = new RunnableC1762a();
        this.f5389x = context;
        this.f5382L = pj0Var;
        this.f5388s = obj;
        if (this.H0 == -100 && (obj instanceof Dialog) && (appCompatActivityC1 = c1()) != null) {
            this.H0 = appCompatActivityC1.getDelegate().mo3816q();
        }
        if (this.H0 == -100) {
            ktf ktfVar = X0;
            Integer num = (Integer) ktfVar.get(obj.getClass().getName());
            if (num != null) {
                this.H0 = num.intValue();
                ktfVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m3806Y(window);
        }
        ek0.m25165h();
    }
}
