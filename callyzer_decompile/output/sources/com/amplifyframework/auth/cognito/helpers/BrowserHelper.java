package com.amplifyframework.auth.cognito.helpers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BrowserHelper {
    public static final BrowserHelper INSTANCE = new BrowserHelper();

    private BrowserHelper() {
    }

    private final List<String> getSupportedCustomTabsPackages(Context context) {
        PackageManager packageManager = context.getPackageManager();
        AbstractC4154l.m8922e(packageManager, "getPackageManager(...)");
        Intent action = new Intent().setAction("android.support.customtabs.action.CustomTabsService");
        AbstractC4154l.m8922e(action, "setAction(...)");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(action, 0);
        AbstractC4154l.m8922e(listQueryIntentServices, "queryIntentServices(...)");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listQueryIntentServices, 10));
        Iterator<T> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return arrayList;
    }

    public final String getDefaultCustomTabPackage(Context context) {
        AbstractC4154l.m8923f(context, "context");
        List<String> supportedCustomTabsPackages = getSupportedCustomTabsPackages(context);
        if (!supportedCustomTabsPackages.isEmpty()) {
            PackageManager packageManager = context.getPackageManager();
            List<String> arrayList = supportedCustomTabsPackages == null ? new ArrayList<>() : supportedCustomTabsPackages;
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
            if (resolveInfoResolveActivity != null) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                if (supportedCustomTabsPackages != null) {
                    arrayList2.addAll(supportedCustomTabsPackages);
                }
                arrayList = arrayList2;
            }
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            for (String str2 : arrayList) {
                intent.setPackage(str2);
                if (packageManager.resolveService(intent, 0) != null) {
                    return str2;
                }
            }
        }
        return null;
    }

    public final boolean isBrowserInstalled(Context context) {
        AbstractC4154l.m8923f(context, "context");
        Uri uri = Uri.parse("https://docs.amplify.aws/");
        AbstractC4154l.m8919b(uri, "Uri.parse(this)");
        return new Intent("android.intent.action.VIEW", uri).resolveActivity(context.getPackageManager()) != null;
    }
}
