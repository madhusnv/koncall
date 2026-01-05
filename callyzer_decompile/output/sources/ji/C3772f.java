package ji;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e1.C1902d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.f */
/* loaded from: classes.dex */
public final class C3772f extends BroadcastReceiver {

    /* renamed from: b */
    public static final AtomicReference f19658b = new AtomicReference();

    /* renamed from: a */
    public final Context f19659a;

    public C3772f(Context context) {
        this.f19659a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C3773g.f19660k) {
            try {
                Iterator it = ((C1902d) C3773g.f19661l.values()).iterator();
                while (it.hasNext()) {
                    ((C3773g) it.next()).m8296e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19659a.unregisterReceiver(this);
    }
}
