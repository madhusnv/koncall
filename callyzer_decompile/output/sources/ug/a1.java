package ug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bk.RunnableC0683n;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends BroadcastReceiver {

    /* renamed from: a */
    public final h4 f35257a;

    /* renamed from: b */
    public boolean f35258b;

    /* renamed from: c */
    public boolean f35259c;

    public a1(h4 h4Var) {
        AbstractC6840z.m13036g(h4Var);
        this.f35257a = h4Var;
    }

    /* renamed from: a */
    public final void m13828a() {
        h4 h4Var = this.f35257a;
        h4Var.l0();
        h4Var.mo327b().mo325M();
        h4Var.mo327b().mo325M();
        if (this.f35258b) {
            h4Var.mo326a().f35870p.m14140a("Unregistering connectivity change receiver");
            this.f35258b = false;
            this.f35259c = false;
            try {
                h4Var.f35497m.f35664a.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                h4Var.mo326a().f35862f.m14141b(e2, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h4 h4Var = this.f35257a;
        h4Var.l0();
        String action = intent.getAction();
        h4Var.mo326a().f35870p.m14141b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            h4Var.mo326a().f35865j.m14141b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        y0 y0Var = h4Var.f35487b;
        h4.m13944U(y0Var);
        boolean zG0 = y0Var.g0();
        if (this.f35259c != zG0) {
            this.f35259c = zG0;
            h4Var.mo327b().m14047V(new RunnableC0683n(this, zG0));
        }
    }
}
