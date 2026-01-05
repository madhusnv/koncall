package hm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import gm.C2651t;
import org.slf4j.helpers.AbstractC5722k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2965a extends BroadcastReceiver {

    /* renamed from: a */
    public volatile boolean f16029a = false;

    /* renamed from: b */
    public final Object f16030b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f16029a) {
            return;
        }
        synchronized (this.f16030b) {
            try {
                if (!this.f16029a) {
                    ((C2651t) ((InterfaceC2979o) AbstractC5722k.m11277a(context))).m6621k((PhoneStateReceiver) this);
                    this.f16029a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
