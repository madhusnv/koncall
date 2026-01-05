package of;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.g */
/* loaded from: classes.dex */
public final class C5352g implements Parcelable {
    public static final Parcelable.Creator<C5352g> CREATOR = new C5348c(1);

    /* renamed from: a */
    public final Messenger f26278a;

    public C5352g(IBinder iBinder) {
        this.f26278a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f26278a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C5352g) obj).f26278a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f26278a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f26278a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
