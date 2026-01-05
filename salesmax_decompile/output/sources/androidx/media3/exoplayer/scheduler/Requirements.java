package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import p001o.op0;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C2223a();

    /* renamed from: a */
    public final int f8520a;

    /* renamed from: androidx.media3.exoplayer.scheduler.Requirements$a */
    public class C2223a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f8520a = (i & 2) != 0 ? i | 1 : i;
    }

    /* renamed from: g */
    public static boolean m7462g(ConnectivityManager connectivityManager) {
        if (sqi.f45790a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final int m7463a(Context context) {
        if (!m7469h()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) op0.m42515e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m7462g(connectivityManager)) ? (m7472k() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f8520a & 3;
    }

    /* renamed from: b */
    public int m7464b(Context context) {
        int iM7463a = m7463a(context);
        if (m7465c() && !m7466d(context)) {
            iM7463a |= 8;
        }
        if (m7468f() && !m7467e(context)) {
            iM7463a |= 4;
        }
        return (!m7471j() || m7470i(context)) ? iM7463a : iM7463a | 16;
    }

    /* renamed from: c */
    public boolean m7465c() {
        return (this.f8520a & 8) != 0;
    }

    /* renamed from: d */
    public final boolean m7466d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m7467e(Context context) {
        PowerManager powerManager = (PowerManager) op0.m42515e(context.getSystemService("power"));
        int i = sqi.f45790a;
        return i >= 23 ? powerManager.isDeviceIdleMode() : i < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f8520a == ((Requirements) obj).f8520a;
    }

    /* renamed from: f */
    public boolean m7468f() {
        return (this.f8520a & 4) != 0;
    }

    /* renamed from: h */
    public boolean m7469h() {
        return (this.f8520a & 1) != 0;
    }

    public int hashCode() {
        return this.f8520a;
    }

    /* renamed from: i */
    public final boolean m7470i(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    /* renamed from: j */
    public boolean m7471j() {
        return (this.f8520a & 16) != 0;
    }

    /* renamed from: k */
    public boolean m7472k() {
        return (this.f8520a & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8520a);
    }
}
