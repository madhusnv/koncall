package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class zzw extends zzx {
    private final WeakReference<Activity> zza;
    private final int zzb;

    public zzw(Activity activity, int i) {
        this.zza = new WeakReference<>(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzb(int i, FullWallet fullWallet, Bundle bundle) throws PendingIntent.CanceledException {
        int i2;
        Activity activity = this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i2 = i3;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzd(int i, MaskedWallet maskedWallet, Bundle bundle) throws PendingIntent.CanceledException {
        int i2;
        Activity activity = this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i2 = i3;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzf(int i, boolean z, Bundle bundle) throws PendingIntent.CanceledException {
        Activity activity = this.zza.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(-1);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzg(int i, Bundle bundle) throws PendingIntent.CanceledException {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 75);
        sb.append("Create Wallet Objects confirmation UI will not be shown connection result: ");
        sb.append(strValueOf);
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, 413);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
