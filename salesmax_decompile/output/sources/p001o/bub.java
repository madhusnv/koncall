package p001o;

import ai.salesmax.AbstractC0059a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class bub {
    /* renamed from: a */
    public static final void m19822a() {
        try {
            AbstractC0059a.m132a().s1(new ArrayList());
            AbstractC0059a.m132a().v1(new ArrayList());
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final boolean m19823b(Context context) {
        sq8.m48649h(context, "<this>");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
        }
        return false;
    }
}
