package ig;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mm.AbstractC4801l;
import th.BinderC7157g;
import th.C7151a;
import th.C7159i;
import uh.AbstractC7459d;
import uh.C7469n;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.h */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3252h extends Binder implements IInterface {

    /* renamed from: e */
    public final /* synthetic */ int f17431e;

    public /* synthetic */ AbstractBinderC3252h() {
        this.f17431e = 4;
    }

    /* renamed from: O */
    public abstract boolean mo7586O(int i10, Parcel parcel, Parcel parcel2);

    /* renamed from: P */
    public abstract boolean mo7583P(int i10, Parcel parcel, Parcel parcel2);

    /* renamed from: Q */
    public boolean mo7597Q(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i10 = this.f17431e;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f17431e) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo7583P(i10, parcel, parcel2);
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo7586O(i10, parcel, parcel2);
            case 2:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo7597Q(i10, parcel, parcel2);
            case 3:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 4:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                BinderC7157g binderC7157g = (BinderC7157g) this;
                if (i10 == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i12 = AbstractC7459d.f36049a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    C7469n c7469n = binderC7157g.f34400h.f34404a;
                    C8650g c8650g = binderC7157g.f34399g;
                    c7469n.m14274c(c8650g);
                    binderC7157g.f34398f.m5720e("onRequestInfo", new Object[0]);
                    if (bundle.getInt("error.code", -2) != 0) {
                        c8650g.m15970c(new InstallException(bundle.getInt("error.code", -2)));
                    } else {
                        int i13 = bundle.getInt("version.code", -1);
                        int i14 = bundle.getInt("update.availability");
                        bundle.getInt("install.status", 0);
                        if (bundle.getInt("client.version.staleness", -1) != -1) {
                            bundle.getInt("client.version.staleness");
                        }
                        int i15 = bundle.getInt("in.app.update.priority", 0);
                        bundle.getLong("bytes.downloaded");
                        bundle.getLong("total.bytes.to.download");
                        long j6 = bundle.getLong("additional.size.required");
                        C7159i c7159i = binderC7157g.f34401i.f34407d;
                        c7159i.getClass();
                        long jM13419a = C7159i.m13419a(new File(c7159i.f34408a.getFilesDir(), "assetpacks"));
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
                        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
                        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
                        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
                        HashMap map = new HashMap();
                        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                        HashSet hashSet = new HashSet();
                        if (integerArrayList != null) {
                            hashSet.addAll(integerArrayList);
                        }
                        map.put("blocking.destructive.intent", hashSet);
                        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                        HashSet hashSet2 = new HashSet();
                        if (integerArrayList2 != null) {
                            hashSet2.addAll(integerArrayList2);
                        }
                        map.put("nonblocking.destructive.intent", hashSet2);
                        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                        HashSet hashSet3 = new HashSet();
                        if (integerArrayList3 != null) {
                            hashSet3.addAll(integerArrayList3);
                        }
                        map.put("blocking.intent", hashSet3);
                        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                        HashSet hashSet4 = new HashSet();
                        if (integerArrayList4 != null) {
                            hashSet4.addAll(integerArrayList4);
                        }
                        map.put("nonblocking.intent", hashSet4);
                        c8650g.m15971d(new C7151a(i13, i14, i15, j6, jM13419a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
                    }
                } else {
                    if (i10 != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i16 = AbstractC7459d.f36049a;
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    binderC7157g.f34400h.f34404a.m14274c(binderC7157g.f34399g);
                    binderC7157g.f34398f.m5720e("onCompleteUpdate", new Object[0]);
                }
                return true;
        }
    }

    public AbstractBinderC3252h(String str, int i10) {
        this.f17431e = i10;
        switch (i10) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
