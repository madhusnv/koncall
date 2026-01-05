package p001o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class n0g {

    /* renamed from: b */
    public static final C15456a f36171b = new C15456a(null);

    /* renamed from: a */
    public final C15458c f36172a;

    /* renamed from: o.n0g$a */
    public static final class C15456a {
        public C15456a() {
        }

        public /* synthetic */ C15456a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final n0g m39952a(Activity activity) {
            sq8.m48649h(activity, "<this>");
            n0g n0gVar = new n0g(activity, null);
            n0gVar.m39951b();
            return n0gVar;
        }
    }

    /* renamed from: o.n0g$b */
    public static final class C15457b extends C15458c {

        /* renamed from: h */
        public boolean f36173h;

        /* renamed from: i */
        public final ViewGroup.OnHierarchyChangeListener f36174i;

        /* renamed from: o.n0g$b$a */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: b */
            public final /* synthetic */ Activity f36176b;

            public a(Activity activity) {
                this.f36176b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (s0g.m47439a(view2)) {
                    C15457b c15457b = C15457b.this;
                    c15457b.m39955e(c15457b.m39954d(t0g.m49112a(view2)));
                    ((ViewGroup) this.f36176b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15457b(Activity activity) {
            super(activity);
            sq8.m48649h(activity, "activity");
            this.f36173h = true;
            this.f36174i = new a(activity);
        }

        @Override // p001o.n0g.C15458c
        /* renamed from: b */
        public void mo39953b() {
            Resources.Theme theme = m39956a().getTheme();
            sq8.m48648g(theme, "activity.theme");
            m39957c(theme, new TypedValue());
            ((ViewGroup) m39956a().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f36174i);
        }

        /* renamed from: d */
        public final boolean m39954d(SplashScreenView splashScreenView) {
            sq8.m48649h(splashScreenView, "child");
            WindowInsets windowInsetsBuild = p0g.m42839a().build();
            sq8.m48648g(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        /* renamed from: e */
        public final void m39955e(boolean z) {
            this.f36173h = z;
        }
    }

    /* renamed from: o.n0g$c */
    public static class C15458c {

        /* renamed from: a */
        public final Activity f36177a;

        /* renamed from: b */
        public int f36178b;

        /* renamed from: c */
        public Integer f36179c;

        /* renamed from: d */
        public Integer f36180d;

        /* renamed from: e */
        public Drawable f36181e;

        /* renamed from: f */
        public boolean f36182f;

        /* renamed from: g */
        public InterfaceC15459d f36183g;

        public C15458c(Activity activity) {
            sq8.m48649h(activity, "activity");
            this.f36177a = activity;
            this.f36183g = new InterfaceC15459d() { // from class: o.o0g
            };
        }

        /* renamed from: a */
        public final Activity m39956a() {
            return this.f36177a;
        }

        /* renamed from: b */
        public void mo39953b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f36177a.getTheme();
            if (theme.resolveAttribute(d6e.windowSplashScreenBackground, typedValue, true)) {
                this.f36179c = Integer.valueOf(typedValue.resourceId);
                this.f36180d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(d6e.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f36181e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(d6e.splashScreenIconSize, typedValue, true)) {
                this.f36182f = typedValue.resourceId == e7e.splashscreen_icon_size_with_background;
            }
            sq8.m48648g(theme, "currentTheme");
            m39957c(theme, typedValue);
        }

        /* renamed from: c */
        public final void m39957c(Resources.Theme theme, TypedValue typedValue) {
            sq8.m48649h(theme, "currentTheme");
            sq8.m48649h(typedValue, "typedValue");
            if (theme.resolveAttribute(d6e.postSplashScreenTheme, typedValue, true)) {
                int i = typedValue.resourceId;
                this.f36178b = i;
                if (i != 0) {
                    this.f36177a.setTheme(i);
                }
            }
        }
    }

    /* renamed from: o.n0g$d */
    public interface InterfaceC15459d {
    }

    public /* synthetic */ n0g(Activity activity, id5 id5Var) {
        this(activity);
    }

    /* renamed from: b */
    public final void m39951b() {
        this.f36172a.mo39953b();
    }

    public n0g(Activity activity) {
        this.f36172a = Build.VERSION.SDK_INT >= 31 ? new C15457b(activity) : new C15458c(activity);
    }
}
