package com.amplifyframework.auth.cognito.helpers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.dh3;
import p001o.fi4;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class BrowserHelper {
    public static final BrowserHelper INSTANCE = new BrowserHelper();

    private BrowserHelper() {
    }

    private final List<String> getSupportedCustomTabsPackages(Context context) {
        PackageManager packageManager = context.getPackageManager();
        sq8.m48648g(packageManager, "getPackageManager(...)");
        Intent action = new Intent().setAction("android.support.customtabs.action.CustomTabsService");
        sq8.m48648g(action, "setAction(...)");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(action, 0);
        sq8.m48648g(listQueryIntentServices, "queryIntentServices(...)");
        ArrayList arrayList = new ArrayList(dh3.m23088v(listQueryIntentServices, 10));
        Iterator<T> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return arrayList;
    }

    public final String getDefaultCustomTabPackage(Context context) {
        sq8.m48649h(context, "context");
        List<String> supportedCustomTabsPackages = getSupportedCustomTabsPackages(context);
        if (!supportedCustomTabsPackages.isEmpty()) {
            return fi4.m26735d(context, supportedCustomTabsPackages);
        }
        return null;
    }

    public final boolean isBrowserInstalled(Context context) {
        sq8.m48649h(context, "context");
        return new Intent("android.intent.action.VIEW", Uri.parse("https://docs.amplify.aws/")).resolveActivity(context.getPackageManager()) != null;
    }
}
