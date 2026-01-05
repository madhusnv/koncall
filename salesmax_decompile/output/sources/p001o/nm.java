package p001o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes2.dex */
public class nm {

    /* renamed from: a */
    public Context f37027a;

    public nm(Context context) {
        this.f37027a = context;
    }

    /* renamed from: b */
    public static nm m40771b(Context context) {
        return new nm(context);
    }

    /* renamed from: a */
    public boolean m40772a() {
        return this.f37027a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m40773c() {
        return this.f37027a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m40774d() {
        Configuration configuration = this.f37027a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m40775e() {
        return this.f37027a.getResources().getDimensionPixelSize(b7e.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m40776f() {
        TypedArray typedArrayObtainStyledAttributes = this.f37027a.obtainStyledAttributes(null, bbe.ActionBar, z5e.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(bbe.ActionBar_height, 0);
        Resources resources = this.f37027a.getResources();
        if (!m40777g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(b7e.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m40777g() {
        return this.f37027a.getResources().getBoolean(k6e.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m40778h() {
        return true;
    }
}
