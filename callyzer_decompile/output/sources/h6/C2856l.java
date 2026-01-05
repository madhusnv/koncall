package h6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.l */
/* loaded from: classes.dex */
public final class C2856l implements InterfaceC2854j {

    /* renamed from: a */
    public final Context f15864a;

    public /* synthetic */ C2856l(Context context, boolean z6) {
        this.f15864a = context;
    }

    /* renamed from: c */
    public void m6987c() {
        Context context = this.f15864a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
            AbstractC4154l.m8922e(uriFromParts, "fromParts(...)");
            intent.setData(uriFromParts);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: d */
    public boolean m6988d() {
        Context context = this.f15864a;
        try {
            Object systemService = context.getSystemService("power");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            return ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public C2856l(Context context) {
        this.f15864a = context.getApplicationContext();
    }
}
