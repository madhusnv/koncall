package uh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import eb.g2;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.l */
/* loaded from: classes.dex */
public final class C7467l extends AbstractRunnableC7464i {

    /* renamed from: b */
    public final /* synthetic */ IBinder f36057b;

    /* renamed from: c */
    public final /* synthetic */ ServiceConnectionC7468m f36058c;

    public C7467l(ServiceConnectionC7468m serviceConnectionC7468m, IBinder iBinder) {
        this.f36058c = serviceConnectionC7468m;
        this.f36057b = iBinder;
    }

    @Override // uh.AbstractRunnableC7464i
    /* renamed from: a */
    public final void mo13417a() throws RemoteException {
        InterfaceC7462g c7460e;
        C7469n c7469n = this.f36058c.f36059a;
        int i10 = AbstractBinderC7461f.f36051f;
        IBinder iBinder = this.f36057b;
        if (iBinder == null) {
            c7460e = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            c7460e = iInterfaceQueryLocalInterface instanceof InterfaceC7462g ? (InterfaceC7462g) iInterfaceQueryLocalInterface : new C7460e(iBinder);
        }
        c7469n.f36073m = c7460e;
        int i11 = 0;
        c7469n.f36062b.m5720e("linkToDeath", new Object[0]);
        try {
            c7469n.f36073m.asBinder().linkToDeath(c7469n.f36070j, 0);
        } catch (RemoteException unused) {
            g2 g2Var = c7469n.f36062b;
            Object[] objArr = new Object[0];
            g2Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                g2.m5718f(g2Var.f9320a, "linkToDeath failed", objArr);
            }
        }
        c7469n.f36067g = false;
        ArrayList arrayList = c7469n.f36064d;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
        c7469n.f36064d.clear();
    }
}
