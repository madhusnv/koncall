package yv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import kotlin.jvm.internal.AbstractC4154l;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.q */
/* loaded from: classes3.dex */
public final class C8802q extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C8803r f42465a;

    public C8802q(C8803r c8803r) {
        this.f42465a = c8803r;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object value;
        boolean z6;
        Object value2;
        C8803r c8803r = this.f42465a;
        m1 m1Var = c8803r.f42470e;
        ConnectivityManager connectivityManager = c8803r.f42467b;
        AbstractC4154l.m8923f(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            boolean z10 = networkCapabilities != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3));
            do {
                value2 = m1Var.getValue();
                ((C8801p) value2).getClass();
            } while (!m1Var.m15397i(value2, new C8801p(z10)));
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        do {
            value = m1Var.getValue();
            C8801p c8801p = (C8801p) value;
            z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            c8801p.getClass();
        } while (!m1Var.m15397i(value, new C8801p(z6)));
    }
}
