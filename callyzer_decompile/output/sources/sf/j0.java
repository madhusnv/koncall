package sf;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ k0 f32446a;

    public /* synthetic */ j0(k0 k0Var) {
        this.f32446a = k0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f32446a.f32459a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f32446a.f32459a.get(h0Var);
                    if (i0Var != null && i0Var.f32436a.isEmpty()) {
                        if (i0Var.f32438c) {
                            i0Var.f32442g.f32461c.removeMessages(1, i0Var.f32440e);
                            k0 k0Var = i0Var.f32442g;
                            k0Var.f32462d.m15966c(k0Var.f32460b, i0Var);
                            i0Var.f32438c = false;
                            i0Var.f32437b = 2;
                        }
                        this.f32446a.f32459a.remove(h0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f32446a.f32459a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f32446a.f32459a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f32437b == 3) {
                    String.valueOf(h0Var2);
                    new Exception();
                    ComponentName componentName = i0Var2.f32441f;
                    if (componentName == null) {
                        h0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = h0Var2.f32434b;
                        AbstractC6840z.m13036g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    i0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
