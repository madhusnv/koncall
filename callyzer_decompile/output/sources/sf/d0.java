package sf;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import pf.C5902b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends AbstractC6834t {

    /* renamed from: g */
    public final IBinder f32377g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC6819e f32378h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(AbstractC6819e abstractC6819e, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC6819e, i10, bundle);
        this.f32378h = abstractC6819e;
        this.f32377g = iBinder;
    }

    @Override // sf.AbstractC6834t
    /* renamed from: a */
    public final void mo12993a(C5902b c5902b) {
        InterfaceC6817c interfaceC6817c = this.f32378h.f32395r;
        if (interfaceC6817c != null) {
            interfaceC6817c.mo12992d(c5902b);
        }
        System.currentTimeMillis();
    }

    @Override // sf.AbstractC6834t
    /* renamed from: b */
    public final boolean mo12994b() throws RemoteException {
        IInterface iInterfaceMo7589o;
        IBinder iBinder = this.f32377g;
        try {
            AbstractC6840z.m13036g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC6819e abstractC6819e = this.f32378h;
            if (!abstractC6819e.mo7592u().equals(interfaceDescriptor) || (iInterfaceMo7589o = abstractC6819e.mo7589o(iBinder)) == null) {
                return false;
            }
            if (!AbstractC6819e.m12995y(abstractC6819e, 2, 4, iInterfaceMo7589o) && !AbstractC6819e.m12995y(abstractC6819e, 3, 4, iInterfaceMo7589o)) {
                return false;
            }
            abstractC6819e.f32399w = null;
            InterfaceC6816b interfaceC6816b = abstractC6819e.f32394q;
            if (interfaceC6816b == null) {
                return true;
            }
            interfaceC6816b.mo12991g();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
