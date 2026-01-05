package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void zzb(int i, Bundle bundle);

    void zzc(int i, IBinder iBinder, zzk zzkVar);
}
