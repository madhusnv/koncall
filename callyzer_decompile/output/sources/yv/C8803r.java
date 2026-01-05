package yv;

import a9.C0069h;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import og.nd;
import qc.C6158d;
import qw.C6366p;
import wx.c1;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.r */
/* loaded from: classes3.dex */
public final class C8803r {

    /* renamed from: a */
    public final Context f42466a;

    /* renamed from: b */
    public final ConnectivityManager f42467b;

    /* renamed from: c */
    public C0069h f42468c;

    /* renamed from: d */
    public final C6366p f42469d = nd.m10782c(new C6158d(19, this));

    /* renamed from: e */
    public final m1 f42470e;

    /* renamed from: f */
    public final w0 f42471f;

    /* renamed from: g */
    public boolean f42472g;

    public C8803r(Context context, ConnectivityManager connectivityManager) {
        this.f42466a = context;
        this.f42467b = connectivityManager;
        m1 m1VarM15372c = c1.m15372c(new C8801p(false));
        this.f42470e = m1VarM15372c;
        this.f42471f = new w0(m1VarM15372c);
    }

    /* renamed from: a */
    public final boolean m16219a() {
        return this.f42472g ? ((C8801p) this.f42471f.f39340a.getValue()).f42464a : m16221c();
    }

    /* renamed from: b */
    public final boolean m16220b() {
        return this.f42472g ? ((C8801p) this.f42471f.f39340a.getValue()).f42464a : m16221c();
    }

    /* renamed from: c */
    public final boolean m16221c() {
        Object value;
        Object value2;
        Object value3;
        int i10 = Build.VERSION.SDK_INT;
        ConnectivityManager connectivityManager = this.f42467b;
        m1 m1Var = this.f42470e;
        if (i10 < 28) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            do {
                value = m1Var.getValue();
                ((C8801p) value).getClass();
            } while (!m1Var.m15397i(value, new C8801p(z)));
            return z;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            do {
                value2 = m1Var.getValue();
                ((C8801p) value2).getClass();
            } while (!m1Var.m15397i(value2, new C8801p(false)));
            return false;
        }
        if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(3)) {
            z = false;
        }
        do {
            value3 = m1Var.getValue();
            ((C8801p) value3).getClass();
        } while (!m1Var.m15397i(value3, new C8801p(z)));
        return z;
    }
}
