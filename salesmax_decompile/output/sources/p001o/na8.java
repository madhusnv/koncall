package p001o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public interface na8 extends IInterface {

    /* renamed from: d */
    public static final String f36625d = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* renamed from: o.na8$a */
    public static abstract class AbstractBinderC15533a extends Binder implements na8 {

        /* renamed from: o.na8$a$a */
        public static class a implements na8 {

            /* renamed from: a */
            public IBinder f36626a;

            public a(IBinder iBinder) {
                this.f36626a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36626a;
            }
        }

        public static na8 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(na8.f36625d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof na8)) ? new a(iBinder) : (na8) iInterfaceQueryLocalInterface;
        }
    }
}
