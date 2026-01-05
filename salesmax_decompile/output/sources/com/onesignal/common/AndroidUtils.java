package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.apache.http.HttpHost;
import p001o.c64;
import p001o.ch3;
import p001o.e9g;
import p001o.f9g;
import p001o.id5;
import p001o.mge;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    public enum SchemaType {
        DATA(Constants.ScionAnalytics.MessageType.DATA_MESSAGE),
        HTTPS("https"),
        HTTP(HttpHost.DEFAULT_SCHEME_NAME);

        public static final Companion Companion = new Companion(null);
        private final String text;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final SchemaType fromString(String str) {
                for (SchemaType schemaType : SchemaType.values()) {
                    if (e9g.m24606x(schemaType.text, str, true)) {
                        return schemaType;
                    }
                }
                return null;
            }
        }

        SchemaType(String str) {
            this.text = str;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemaType.values().length];
            iArr[SchemaType.DATA.ordinal()] = 1;
            iArr[SchemaType.HTTPS.ordinal()] = 2;
            iArr[SchemaType.HTTP.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> list, IApplicationService iApplicationService) throws PackageManager.NameNotFoundException {
        sq8.m48649h(list, "permissions");
        sq8.m48649h(iApplicationService, "applicationService");
        PackageInfo packageInfo = iApplicationService.getAppContext().getPackageManager().getPackageInfo(iApplicationService.getAppContext().getPackageName(), 4096);
        sq8.m48648g(packageInfo, "applicationService.appCo…eManager.GET_PERMISSIONS)");
        String[] strArr = packageInfo.requestedPermissions;
        sq8.m48648g(strArr, "packageInfo.requestedPermissions");
        List listM21249n = ch3.m21249n(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (listM21249n.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getAppVersion(Context context) {
        Integer numValueOf;
        sq8.m48649h(context, "context");
        try {
            numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String str) throws PackageManager.NameNotFoundException {
        sq8.m48649h(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        sq8.m48649h(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) throws PackageManager.NameNotFoundException {
        sq8.m48649h(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            sq8.m48648g(applicationInfo, "context.packageManager.g…A_DATA,\n                )");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.error("Manifest application info not found", e);
            return null;
        }
    }

    public final int getRandomDelay(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    public final String getResourceString(Context context, String str, String str2) {
        sq8.m48649h(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable th) {
        sq8.m48649h(th, "throwable");
        return getRootCauseThrowable(th).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable th) {
        sq8.m48649h(th, "subjectThrowable");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
            sq8.m48646e(th);
        }
        return th;
    }

    public final int getTargetSdkVersion(Context context) throws PackageManager.NameNotFoundException {
        sq8.m48649h(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            sq8.m48648g(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i) {
        sq8.m48649h(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String str, boolean z, IApplicationService iApplicationService) throws PackageManager.NameNotFoundException {
        sq8.m48649h(str, "permission");
        sq8.m48649h(iApplicationService, "applicationService");
        try {
            PackageInfo packageInfo = iApplicationService.getAppContext().getPackageManager().getPackageInfo(iApplicationService.getAppContext().getPackageName(), 4096);
            sq8.m48648g(packageInfo, "applicationService.appCo…NS,\n                    )");
            String[] strArr = packageInfo.requestedPermissions;
            sq8.m48648g(strArr, "packageInfo.requestedPermissions");
            if (!ch3.m21249n(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                return false;
            }
            if (z) {
                if (c64.checkSelfPermission(iApplicationService.getAppContext(), str) == -1) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        sq8.m48649h(activity, "activity");
        boolean z = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        sq8.m48648g(decorView, "activity.window.decorView");
        return z && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isRunningOnMainThread() {
        return sq8.m48644c(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        return (str == null || new mge("^[0-9]").m38995g(str)) ? false : true;
    }

    @Keep
    public final boolean opaqueHasClass(Class<?> cls) {
        sq8.m48649h(cls, "_class");
        return true;
    }

    public final void openURLInBrowser(Context context, Uri uri) {
        sq8.m48649h(context, "appContext");
        sq8.m48649h(uri, "uri");
        context.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        sq8.m48649h(uri, "uri");
        SchemaType schemaTypeFromString = uri.getScheme() != null ? SchemaType.Companion.fromString(uri.getScheme()) : null;
        if (schemaTypeFromString == null) {
            schemaTypeFromString = SchemaType.HTTP;
            String string = uri.toString();
            sq8.m48648g(string, "uri.toString()");
            if (!f9g.m26306P(string, "://", false, 2, null)) {
                uri = Uri.parse("http://" + uri);
                sq8.m48648g(uri, "parse(\"http://$uri\")");
            }
        }
        int i = WhenMappings.$EnumSwitchMapping$0[schemaTypeFromString.ordinal()];
        if (i != 1) {
            intentMakeMainSelectorActivity = (i == 2 || i != 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            sq8.m48648g(intentMakeMainSelectorActivity, "makeMainSelectorActivity…ent.CATEGORY_APP_BROWSER)");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context context, String str) {
        sq8.m48649h(context, "appContext");
        sq8.m48649h(str, ImagesContract.URL);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = sq8.m48651j(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        Uri uri = Uri.parse(str.subSequence(i, length + 1).toString());
        sq8.m48648g(uri, "parse(url.trim { it <= ' ' })");
        openURLInBrowser(context, uri);
    }
}
