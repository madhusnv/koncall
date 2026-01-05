package p001o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class mn extends c64 {

    /* renamed from: o.mn$a */
    public static class C15363a {
        /* renamed from: a */
        public static void m39375a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        public static void m39376b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        public static void m39377c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        public static void m39378d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        public static void m39379e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: o.mn$b */
    public static class C15364b {
        /* renamed from: a */
        public static void m39380a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m39381b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        public static boolean m39382c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: o.mn$c */
    public static class C15365c {
        /* renamed from: a */
        public static <T> T m39383a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* renamed from: o.mn$d */
    public static class C15366d {
        /* renamed from: a */
        public static boolean m39384a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static boolean m39385b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: o.mn$e */
    public static class C15367e {
        /* renamed from: a */
        public static boolean m39386a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: o.mn$f */
    public interface InterfaceC15368f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: b */
    public static void m39362b(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: c */
    public static void m39363c(Activity activity) {
        C15363a.m39375a(activity);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39364d(Activity activity) {
        if (activity.isFinishing() || ms.m39595i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: e */
    public static void m39365e(Activity activity) {
        C15363a.m39376b(activity);
    }

    /* renamed from: f */
    public static void m39366f(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: o.ln
                @Override // java.lang.Runnable
                public final void run() {
                    mn.m39364d(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m39367g(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC15368f) {
            ((InterfaceC15368f) activity).validateRequestPermissionsRequestCode(i);
        }
        C15364b.m39381b(activity, strArr, i);
    }

    /* renamed from: h */
    public static View m39368h(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C15365c.m39383a(activity, i);
        }
        View viewFindViewById = activity.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: i */
    public static void m39369i(Activity activity, ylf ylfVar) {
        C15363a.m39377c(activity, null);
    }

    /* renamed from: j */
    public static void m39370j(Activity activity, ylf ylfVar) {
        C15363a.m39378d(activity, null);
    }

    /* renamed from: k */
    public static boolean m39371k(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? C15367e.m39386a(activity, str) : i == 31 ? C15366d.m39385b(activity, str) : C15364b.m39382c(activity, str);
        }
        return false;
    }

    /* renamed from: l */
    public static void m39372l(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: m */
    public static void m39373m(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: n */
    public static void m39374n(Activity activity) {
        C15363a.m39379e(activity);
    }
}
