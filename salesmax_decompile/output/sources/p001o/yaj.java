package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class yaj implements vaj {

    /* renamed from: a */
    public static final yaj f55163a = new yaj();

    /* renamed from: b */
    public static final String f55164b;

    static {
        String simpleName = yaj.class.getSimpleName();
        sq8.m48648g(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f55164b = simpleName;
    }

    /* renamed from: a */
    public uaj m57427a(Activity activity) {
        sq8.m48649h(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        return new uaj(i >= 30 ? qn.f42182a.m45676a(activity) : i >= 29 ? m57430d(activity) : i >= 28 ? m57429c(activity) : m57428b(activity));
    }

    /* renamed from: b */
    public final Rect m57428b(Activity activity) {
        sq8.m48649h(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!nn.f37054a.m40798a(activity)) {
            sq8.m48648g(defaultDisplay, "defaultDisplay");
            Point pointM57433g = m57433g(defaultDisplay);
            int iM57432f = m57432f(activity);
            int i = rect.bottom;
            if (i + iM57432f == pointM57433g.y) {
                rect.bottom = i + iM57432f;
            } else {
                int i2 = rect.right;
                if (i2 + iM57432f == pointM57433g.x) {
                    rect.right = i2 + iM57432f;
                }
            }
        }
        return rect;
    }

    /* renamed from: c */
    public final Rect m57429c(Activity activity) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DisplayCutout displayCutoutM57431e;
        sq8.m48649h(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (nn.f37054a.m40798a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException unused) {
            m57434h(activity, rect);
        } catch (NoSuchFieldException unused2) {
            m57434h(activity, rect);
        } catch (NoSuchMethodException unused3) {
            m57434h(activity, rect);
        } catch (InvocationTargetException unused4) {
            m57434h(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        gu5 gu5Var = gu5.f25802a;
        sq8.m48648g(defaultDisplay, "currentDisplay");
        gu5Var.m29490a(defaultDisplay, point);
        nn nnVar = nn.f37054a;
        if (!nnVar.m40798a(activity)) {
            int iM57432f = m57432f(activity);
            int i = rect.bottom;
            if (i + iM57432f == point.y) {
                rect.bottom = i + iM57432f;
            } else {
                int i2 = rect.right;
                if (i2 + iM57432f == point.x) {
                    rect.right = i2 + iM57432f;
                } else if (rect.left == iM57432f) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !nnVar.m40798a(activity) && (displayCutoutM57431e = m57431e(defaultDisplay)) != null) {
            int i3 = rect.left;
            lu5 lu5Var = lu5.f34373a;
            if (i3 == lu5Var.m37890b(displayCutoutM57431e)) {
                rect.left = 0;
            }
            if (point.x - rect.right == lu5Var.m37891c(displayCutoutM57431e)) {
                rect.right += lu5Var.m37891c(displayCutoutM57431e);
            }
            if (rect.top == lu5Var.m37892d(displayCutoutM57431e)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == lu5Var.m37889a(displayCutoutM57431e)) {
                rect.bottom += lu5Var.m37889a(displayCutoutM57431e);
            }
        }
        return rect;
    }

    /* renamed from: d */
    public final Rect m57430d(Activity activity) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException unused) {
            return m57429c(activity);
        } catch (NoSuchFieldException unused2) {
            return m57429c(activity);
        } catch (NoSuchMethodException unused3) {
            return m57429c(activity);
        } catch (InvocationTargetException unused4) {
            return m57429c(activity);
        }
    }

    /* renamed from: e */
    public final DisplayCutout m57431e(Display display) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (waj.m54150a(obj)) {
                return xaj.m55918a(obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: f */
    public final int m57432f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public final Point m57433g(Display display) {
        sq8.m48649h(display, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Point point = new Point();
        gu5.f25802a.m29490a(display, point);
        return point;
    }

    /* renamed from: h */
    public final void m57434h(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
