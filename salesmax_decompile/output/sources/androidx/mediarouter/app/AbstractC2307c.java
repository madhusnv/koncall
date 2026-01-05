package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import p001o.c64;
import p001o.f6e;
import p001o.fy5;
import p001o.lk0;
import p001o.mae;
import p001o.ni3;
import p001o.o6e;
import p001o.r7e;
import p001o.z5e;

/* renamed from: androidx.mediarouter.app.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2307c {

    /* renamed from: a */
    public static final int f9085a = o6e.mr_dynamic_dialog_icon_light;

    /* renamed from: a */
    public static Context m7996a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m8007l(context));
        int iM8011p = m8011p(contextThemeWrapper, f6e.mediaRouteTheme);
        return iM8011p != 0 ? new ContextThemeWrapper(contextThemeWrapper, iM8011p) : contextThemeWrapper;
    }

    /* renamed from: b */
    public static Context m7997b(Context context, int i, boolean z) {
        if (i == 0) {
            i = m8011p(context, !z ? z5e.dialogTheme : z5e.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return m8011p(contextThemeWrapper, f6e.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, m8007l(contextThemeWrapper)) : contextThemeWrapper;
    }

    /* renamed from: c */
    public static int m7998c(Context context) {
        int iM8011p = m8011p(context, f6e.mediaRouteTheme);
        return iM8011p == 0 ? m8007l(context) : iM8011p;
    }

    /* renamed from: d */
    public static int m7999d(Context context) {
        int iM8010o = m8010o(context, 0, z5e.colorPrimary);
        return ni3.m40613e(iM8010o, m8010o(context, 0, R.attr.colorBackground)) < 3.0d ? m8010o(context, 0, z5e.colorAccent) : iM8010o;
    }

    /* renamed from: e */
    public static Drawable m8000e(Context context) {
        return m8005j(context, r7e.mr_cast_checkbox);
    }

    /* renamed from: f */
    public static int m8001f(Context context, int i) {
        return ni3.m40613e(-1, m8010o(context, i, z5e.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    /* renamed from: g */
    public static Drawable m8002g(Context context) {
        return m8004i(context, f6e.mediaRouteDefaultIconDrawable);
    }

    /* renamed from: h */
    public static float m8003h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    /* renamed from: i */
    public static Drawable m8004i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableM27744r = fy5.m27744r(lk0.m37353b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
        if (m8013r(context)) {
            fy5.m27740n(drawableM27744r, c64.getColor(context, f9085a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableM27744r;
    }

    /* renamed from: j */
    public static Drawable m8005j(Context context, int i) {
        Drawable drawableM27744r = fy5.m27744r(lk0.m37353b(context, i));
        if (m8013r(context)) {
            fy5.m27740n(drawableM27744r, c64.getColor(context, f9085a));
        }
        return drawableM27744r;
    }

    /* renamed from: k */
    public static Drawable m8006k(Context context) {
        return m8005j(context, r7e.mr_cast_mute_button);
    }

    /* renamed from: l */
    public static int m8007l(Context context) {
        return m8013r(context) ? m8001f(context, 0) == -570425344 ? mae.Theme_MediaRouter_Light : mae.Theme_MediaRouter_Light_DarkControlPanel : m8001f(context, 0) == -570425344 ? mae.Theme_MediaRouter_LightControlPanel : mae.Theme_MediaRouter;
    }

    /* renamed from: m */
    public static Drawable m8008m(Context context) {
        return m8004i(context, f6e.mediaRouteSpeakerIconDrawable);
    }

    /* renamed from: n */
    public static Drawable m8009n(Context context) {
        return m8004i(context, f6e.mediaRouteSpeakerGroupIconDrawable);
    }

    /* renamed from: o */
    public static int m8010o(Context context, int i, int i2) throws Resources.NotFoundException {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    /* renamed from: p */
    public static int m8011p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    /* renamed from: q */
    public static Drawable m8012q(Context context) {
        return m8004i(context, f6e.mediaRouteTvIconDrawable);
    }

    /* renamed from: r */
    public static boolean m8013r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(z5e.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    /* renamed from: s */
    public static void m8014s(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(c64.getColor(context, m8013r(context) ? o6e.mr_dynamic_dialog_background_light : o6e.mr_dynamic_dialog_background_dark));
    }

    /* renamed from: t */
    public static void m8015t(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(c64.getColor(context, m8013r(context) ? o6e.mr_cast_progressbar_progress_and_thumb_light : o6e.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: u */
    public static void m8016u(Context context, View view, View view2, boolean z) {
        int iM8010o = m8010o(context, 0, z5e.colorPrimary);
        int iM8010o2 = m8010o(context, 0, z5e.colorPrimaryDark);
        if (z && m8001f(context, 0) == -570425344) {
            iM8010o2 = iM8010o;
            iM8010o = -1;
        }
        view.setBackgroundColor(iM8010o);
        view2.setBackgroundColor(iM8010o2);
        view.setTag(Integer.valueOf(iM8010o));
        view2.setTag(Integer.valueOf(iM8010o2));
    }

    /* renamed from: v */
    public static void m8017v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int color;
        int color2;
        if (m8013r(context)) {
            color = c64.getColor(context, o6e.mr_cast_progressbar_progress_and_thumb_light);
            color2 = c64.getColor(context, o6e.mr_cast_progressbar_background_light);
        } else {
            color = c64.getColor(context, o6e.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = c64.getColor(context, o6e.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.m7900b(color, color2);
    }

    /* renamed from: w */
    public static void m8018w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iM8001f = m8001f(context, 0);
        if (Color.alpha(iM8001f) != 255) {
            iM8001f = ni3.m40619k(iM8001f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.m7899a(iM8001f);
    }
}
