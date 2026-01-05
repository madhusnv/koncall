package p001o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class pc9 {

    /* renamed from: a */
    public static boolean f39806a = false;

    /* renamed from: b */
    public static Method f39807b = null;

    /* renamed from: c */
    public static boolean f39808c = false;

    /* renamed from: d */
    public static Field f39809d;

    /* renamed from: o.pc9$a */
    public interface InterfaceC16053a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m43336a(ActionBar actionBar, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!f39806a) {
            try {
                f39807b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f39806a = true;
        }
        Method method = f39807b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m43337b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m43336a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (wvi.m55121h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m43338c(Dialog dialog, KeyEvent keyEvent) throws NoSuchFieldException, SecurityException {
        DialogInterface.OnKeyListener onKeyListenerM43341f = m43341f(dialog);
        if (onKeyListenerM43341f != null && onKeyListenerM43341f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (wvi.m55121h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m43339d(View view, KeyEvent keyEvent) {
        return wvi.m55122i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m43340e(InterfaceC16053a interfaceC16053a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC16053a == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC16053a.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m43337b((Activity) callback, keyEvent) : callback instanceof Dialog ? m43338c((Dialog) callback, keyEvent) : (view != null && wvi.m55121h(view, keyEvent)) || interfaceC16053a.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m43341f(Dialog dialog) throws NoSuchFieldException, SecurityException {
        if (!f39808c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f39809d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f39808c = true;
        }
        Field field = f39809d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
