package hm;

import android.content.Context;
import android.content.Intent;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import om.C5415q;
import wm.C8114j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2966b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16031a;

    /* renamed from: b */
    public final /* synthetic */ Context f16032b;

    /* renamed from: c */
    public final /* synthetic */ Intent f16033c;

    /* renamed from: d */
    public final /* synthetic */ C5415q f16034d;

    /* renamed from: e */
    public final /* synthetic */ boolean f16035e;

    /* renamed from: f */
    public final /* synthetic */ Object f16036f;

    public /* synthetic */ RunnableC2966b(Context context, Intent intent, C5415q c5415q, boolean z6, Object obj, int i10) {
        this.f16031a = i10;
        this.f16032b = context;
        this.f16033c = intent;
        this.f16034d = c5415q;
        this.f16035e = z6;
        this.f16036f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16031a) {
            case 0:
                PhoneStateReceiver.m4592b(this.f16032b, this.f16033c, this.f16034d, this.f16035e, (PhoneStateReceiver) this.f16036f);
                break;
            default:
                C8114j.m15286a(this.f16032b, this.f16033c, this.f16034d, this.f16035e, (C8114j) this.f16036f);
                break;
        }
    }
}
