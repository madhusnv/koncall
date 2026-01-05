package p011m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C4603a extends ContextWrapper {

    /* renamed from: a */
    public int f22771a;

    /* renamed from: b */
    public Resources.Theme f22772b;

    /* renamed from: c */
    public LayoutInflater f22773c;

    /* renamed from: d */
    public Resources f22774d;

    /* renamed from: a */
    public final void m9476a() {
        if (this.f22772b == null) {
            this.f22772b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f22772b.setTo(theme);
            }
        }
        this.f22772b.applyStyle(this.f22771a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f22774d == null) {
            this.f22774d = super.getResources();
        }
        return this.f22774d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f22773c == null) {
            this.f22773c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f22773c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f22772b;
        if (theme != null) {
            return theme;
        }
        if (this.f22771a == 0) {
            this.f22771a = R.style.Theme_AppCompat_Light;
        }
        m9476a();
        return this.f22772b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f22771a != i10) {
            this.f22771a = i10;
            m9476a();
        }
    }
}
