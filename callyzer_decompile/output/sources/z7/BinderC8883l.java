package z7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.l */
/* loaded from: classes.dex */
public final class BinderC8883l extends Binder implements InterfaceC8877f {

    /* renamed from: e */
    public final /* synthetic */ MultiInstanceInvalidationService f42776e;

    public BinderC8883l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f42776e = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC8877f.f42722d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = InterfaceC8877f.f42722d;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC8876e callback = null;
        InterfaceC8876e callback2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC8876e.f42721c);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8876e)) {
                    C8875d c8875d = new C8875d();
                    c8875d.f42720e = strongBinder;
                    callback = c8875d;
                } else {
                    callback = (InterfaceC8876e) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            AbstractC4154l.m8923f(callback, "callback");
            int i12 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f42776e;
                synchronized (multiInstanceInvalidationService.f2860c) {
                    try {
                        int i13 = multiInstanceInvalidationService.f2858a + 1;
                        multiInstanceInvalidationService.f2858a = i13;
                        if (multiInstanceInvalidationService.f2860c.register(callback, Integer.valueOf(i13))) {
                            multiInstanceInvalidationService.f2859b.put(Integer.valueOf(i13), string);
                            i12 = i13;
                        } else {
                            multiInstanceInvalidationService.f2858a--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC8876e.f42721c);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC8876e)) {
                    C8875d c8875d2 = new C8875d();
                    c8875d2.f42720e = strongBinder2;
                    callback2 = c8875d2;
                } else {
                    callback2 = (InterfaceC8876e) iInterfaceQueryLocalInterface2;
                }
            }
            int i14 = parcel.readInt();
            AbstractC4154l.m8923f(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f42776e;
            synchronized (multiInstanceInvalidationService2.f2860c) {
                multiInstanceInvalidationService2.f2860c.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i15 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        AbstractC4154l.m8923f(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f42776e;
        synchronized (multiInstanceInvalidationService3.f2860c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.f2859b.get(Integer.valueOf(i15));
                if (str2 != null) {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f2860c.beginBroadcast();
                    for (int i16 = 0; i16 < iBeginBroadcast; i16++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f2860c.getBroadcastCookie(i16);
                            AbstractC4154l.m8921d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f2859b.get(num);
                            if (i15 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((InterfaceC8876e) multiInstanceInvalidationService3.f2860c.getBroadcastItem(i16)).mo16375m(tables);
                                } catch (RemoteException unused) {
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f2860c.finishBroadcast();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
