package p001o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p001o.na8;

/* loaded from: classes2.dex */
public interface oa8 extends IInterface {

    /* renamed from: e */
    public static final String f38002e = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* renamed from: o.oa8$a */
    public static abstract class AbstractBinderC15742a extends Binder implements oa8 {
        public AbstractBinderC15742a() {
            attachInterface(this, oa8.f38002e);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = oa8.f38002e;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            B0(na8.AbstractBinderC15533a.L0(parcel.readStrongBinder()));
            return true;
        }
    }

    void B0(na8 na8Var);
}
