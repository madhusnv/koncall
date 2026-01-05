package p001o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes2.dex */
public class i64 extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f28139f;

    /* renamed from: a */
    public int f28140a;

    /* renamed from: b */
    public Resources.Theme f28141b;

    /* renamed from: c */
    public LayoutInflater f28142c;

    /* renamed from: d */
    public Configuration f28143d;

    /* renamed from: e */
    public Resources f28144e;

    public i64(Context context, int i) {
        super(context);
        this.f28140a = i;
    }

    /* renamed from: e */
    public static boolean m31607e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f28139f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f28139f = configuration2;
        }
        return configuration.equals(f28139f);
    }

    /* renamed from: a */
    public void m31608a(Configuration configuration) {
        if (this.f28144e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f28143d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f28143d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources m31609b() {
        if (this.f28144e == null) {
            Configuration configuration = this.f28143d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m31607e(configuration))) {
                this.f28144e = super.getResources();
            } else {
                this.f28144e = createConfigurationContext(this.f28143d).getResources();
            }
        }
        return this.f28144e;
    }

    /* renamed from: c */
    public int m31610c() {
        return this.f28140a;
    }

    /* renamed from: d */
    public final void m31611d() {
        boolean z = this.f28141b == null;
        if (z) {
            this.f28141b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f28141b.setTo(theme);
            }
        }
        m31612f(this.f28141b, this.f28140a, z);
    }

    /* renamed from: f */
    public void m31612f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m31609b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f28142c == null) {
            this.f28142c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f28142c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f28141b;
        if (theme != null) {
            return theme;
        }
        if (this.f28140a == 0) {
            this.f28140a = iae.Theme_AppCompat_Light;
        }
        m31611d();
        return this.f28141b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f28140a != i) {
            this.f28140a = i;
            m31611d();
        }
    }

    public i64(Context context, Resources.Theme theme) {
        super(context);
        this.f28141b = theme;
    }
}
