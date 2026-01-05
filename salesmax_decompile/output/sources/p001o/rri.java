package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.C10773c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class rri {

    /* renamed from: a */
    public static final rri f43991a = new rri();

    /* renamed from: b */
    public static final String f43992b = rri.class.getName();

    /* renamed from: a */
    public static final void m47106a(Collection collection, String str) {
        sq8.m48649h(collection, "container");
        sq8.m48649h(str, "name");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: b */
    public static final String m47107b() {
        String strM13020m = C10773c.m13020m();
        if (strM13020m != null) {
            return strM13020m;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    /* renamed from: c */
    public static final String m47108c() {
        String strM13026s = C10773c.m13026s();
        if (strM13026s != null) {
            return strM13026s;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    /* renamed from: d */
    public static final boolean m47109d(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.getElementName();
            intent.getElementName();
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!sq8.m48644c(activityInfo.name, "com.facebook.CustomTabActivity") || !sq8.m48644c(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public static final void m47110e(Context context, boolean z) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        sq8.m48649h(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null && !(!z)) {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString());
        }
    }

    /* renamed from: f */
    public static final void m47111f(Context context, boolean z) {
        sq8.m48649h(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && !(!z)) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
        }
    }

    /* renamed from: g */
    public static final void m47112g(String str, String str2) {
        sq8.m48649h(str, "arg");
        sq8.m48649h(str2, "name");
        if (str.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    /* renamed from: h */
    public static final void m47113h(Collection collection, String str) {
        sq8.m48649h(collection, "container");
        sq8.m48649h(str, "name");
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
    }

    /* renamed from: i */
    public static final void m47114i(Collection collection, String str) {
        sq8.m48649h(collection, "container");
        sq8.m48649h(str, "name");
        m47106a(collection, str);
        m47113h(collection, str);
    }

    /* renamed from: j */
    public static final void m47115j(Object obj, String str) {
        sq8.m48649h(str, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    /* renamed from: k */
    public static final String m47116k(String str, String str2) {
        sq8.m48649h(str2, "name");
        boolean z = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
        }
        if (z) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    /* renamed from: l */
    public static final void m47117l() {
        if (!C10773c.m12993G()) {
            throw new hs6("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
