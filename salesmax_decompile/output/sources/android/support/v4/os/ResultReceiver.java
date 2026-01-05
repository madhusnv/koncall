package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.InterfaceC1738a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C1735a();

    /* renamed from: a */
    public final boolean f5238a = false;

    /* renamed from: b */
    public final Handler f5239b = null;

    /* renamed from: c */
    public InterfaceC1738a f5240c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    public class C1735a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    public class BinderC1736b extends InterfaceC1738a.a {
        public BinderC1736b() {
        }

        @Override // android.support.v4.os.InterfaceC1738a
        /* renamed from: Z */
        public void mo3706Z(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f5239b;
            if (handler != null) {
                handler.post(resultReceiver.new RunnableC1737c(i, bundle));
            } else {
                resultReceiver.mo3433a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    public class RunnableC1737c implements Runnable {

        /* renamed from: a */
        public final int f5242a;

        /* renamed from: b */
        public final Bundle f5243b;

        public RunnableC1737c(int i, Bundle bundle) {
            this.f5242a = i;
            this.f5243b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo3433a(this.f5242a, this.f5243b);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f5240c = InterfaceC1738a.a.L0(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo3433a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void m3703b(int i, Bundle bundle) {
        if (this.f5238a) {
            Handler handler = this.f5239b;
            if (handler != null) {
                handler.post(new RunnableC1737c(i, bundle));
                return;
            } else {
                mo3433a(i, bundle);
                return;
            }
        }
        InterfaceC1738a interfaceC1738a = this.f5240c;
        if (interfaceC1738a != null) {
            try {
                interfaceC1738a.mo3706Z(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f5240c == null) {
                this.f5240c = new BinderC1736b();
            }
            parcel.writeStrongBinder(this.f5240c.asBinder());
        }
    }
}
