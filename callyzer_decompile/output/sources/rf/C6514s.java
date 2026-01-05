package rf;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import c9.C0917l;
import com.google.android.gms.internal.measurement.h0;
import com.google.firebase.messaging.FirebaseMessaging;
import ug.a3;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.s */
/* loaded from: classes.dex */
public final class C6514s extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f31271a = 1;

    /* renamed from: b */
    public Context f31272b;

    /* renamed from: c */
    public Object f31273c;

    public /* synthetic */ C6514s() {
    }

    /* renamed from: a */
    public void m12544a() {
        Log.isLoggable("FirebaseMessaging", 3);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        a3 a3Var = (a3) this.f31273c;
        if (a3Var != null) {
            Context context = ((FirebaseMessaging) a3Var.f35263d).f7162b;
            this.f31272b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f31271a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    C0917l c0917l = (C0917l) this.f31273c;
                    DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m = (DialogInterfaceOnCancelListenerC6508m) ((RunnableC8956c) c0917l.f5595c).f42967c;
                    dialogInterfaceOnCancelListenerC6508m.f31247c.set(null);
                    h0 h0Var = dialogInterfaceOnCancelListenerC6508m.f31251g.f31236p;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) c0917l.f5594b;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = this.f31272b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f31272b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            default:
                a3 a3Var = (a3) this.f31273c;
                if (a3Var != null && a3Var.m13829a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    a3 a3Var2 = (a3) this.f31273c;
                    ((FirebaseMessaging) a3Var2.f35263d).getClass();
                    FirebaseMessaging.m4478b(0L, a3Var2);
                    Context context3 = this.f31272b;
                    if (context3 != null) {
                        context3.unregisterReceiver(this);
                    }
                    this.f31273c = null;
                    return;
                }
                return;
        }
    }

    public C6514s(C0917l c0917l) {
        this.f31273c = c0917l;
    }
}
