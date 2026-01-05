package p001o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public interface la8 extends IInterface {

    /* renamed from: o.la8$a */
    public static abstract class AbstractBinderC15047a extends Binder implements la8 {

        /* renamed from: o.la8$a$a */
        public static class a implements la8 {

            /* renamed from: a */
            public IBinder f33530a;

            public a(IBinder iBinder) {
                this.f33530a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33530a;
            }
        }

        public static la8 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof la8)) ? new a(iBinder) : (la8) iInterfaceQueryLocalInterface;
        }
    }
}
