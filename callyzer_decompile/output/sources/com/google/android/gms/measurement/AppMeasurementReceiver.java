package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import c7.AbstractC0897a;
import ug.g1;
import ug.n1;
import ug.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0897a {

    /* renamed from: c */
    public g1 f6712c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f6712c == null) {
            this.f6712c = new g1(this);
        }
        g1 g1Var = this.f6712c;
        g1Var.getClass();
        v0 v0Var = n1.m14086s(context, null, null).f35669f;
        n1.m14085m(v0Var);
        if (intent == null) {
            v0Var.f35865j.m14140a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        v0Var.f35870p.m14141b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                v0Var.f35865j.m14140a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        v0Var.f35870p.m14140a("Starting wakeful intent.");
        ((AppMeasurementReceiver) g1Var.f35448a).getClass();
        SparseArray sparseArray = AbstractC0897a.f5549a;
        synchronized (sparseArray) {
            try {
                int i10 = AbstractC0897a.f5550b;
                int i11 = i10 + 1;
                AbstractC0897a.f5550b = i11;
                if (i11 <= 0) {
                    AbstractC0897a.f5550b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
