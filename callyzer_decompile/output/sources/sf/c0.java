package sf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {

    /* renamed from: a */
    public final int f32375a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6819e f32376b;

    public c0(AbstractC6819e abstractC6819e, int i10) {
        this.f32376b = abstractC6819e;
        this.f32375a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        AbstractC6819e abstractC6819e = this.f32376b;
        if (iBinder == null) {
            synchronized (abstractC6819e.f32386g) {
                i10 = abstractC6819e.f32393p;
            }
            if (i10 == 3) {
                abstractC6819e.f32400x = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            a0 a0Var = abstractC6819e.f32385f;
            a0Var.sendMessage(a0Var.obtainMessage(i11, abstractC6819e.f32402z.get(), 16));
            return;
        }
        synchronized (abstractC6819e.f32387h) {
            try {
                AbstractC6819e abstractC6819e2 = this.f32376b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC6819e2.f32388j = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C6836v)) ? new C6836v(iBinder) : (C6836v) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC6819e abstractC6819e3 = this.f32376b;
        int i12 = this.f32375a;
        e0 e0Var = new e0(abstractC6819e3, 0, null);
        a0 a0Var2 = abstractC6819e3.f32385f;
        a0Var2.sendMessage(a0Var2.obtainMessage(7, i12, -1, e0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC6819e abstractC6819e;
        synchronized (this.f32376b.f32387h) {
            abstractC6819e = this.f32376b;
            abstractC6819e.f32388j = null;
        }
        int i10 = this.f32375a;
        a0 a0Var = abstractC6819e.f32385f;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
