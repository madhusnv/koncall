package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C10773c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class di4 {

    /* renamed from: a */
    public static final di4 f19926a = new di4();

    /* renamed from: b */
    public static final String[] f19927b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: a */
    public static final String m23197a() {
        if (a94.m16694d(di4.class)) {
            return null;
        }
        try {
            Context contextM13019l = C10773c.m13019l();
            List<ResolveInfo> listQueryIntentServices = contextM13019l.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            sq8.m48648g(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet hashSetZ0 = gp0.z0(f19927b);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSetZ0.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, di4.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m23198b() {
        if (a94.m16694d(di4.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + C10773c.m13019l().getPackageName();
        } catch (Throwable th) {
            a94.m16692b(th, di4.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m23199c(String str) {
        if (a94.m16694d(di4.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "developerDefinedRedirectURI");
            return rri.m47109d(C10773c.m13019l(), str) ? str : rri.m47109d(C10773c.m13019l(), m23198b()) ? m23198b() : "";
        } catch (Throwable th) {
            a94.m16692b(th, di4.class);
            return null;
        }
    }
}
