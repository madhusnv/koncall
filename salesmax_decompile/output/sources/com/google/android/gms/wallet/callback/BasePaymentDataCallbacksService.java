package com.google.android.gms.wallet.callback;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes3.dex */
public abstract class BasePaymentDataCallbacksService extends zzd {
    @RecentlyNonNull
    public abstract BasePaymentDataCallbacks createPaymentDataCallbacks();

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.android.gms.wallet.callback.zzd
    public final void onRunTask(@RecentlyNonNull String str, @RecentlyNonNull CallbackInput callbackInput, @RecentlyNonNull OnCompleteListener<CallbackOutput> onCompleteListener) {
        if (callbackInput.getCallbackType() == 0) {
            throw new IllegalStateException("Callback Types must be set");
        }
        BasePaymentDataCallbacks basePaymentDataCallbacksCreatePaymentDataCallbacks = createPaymentDataCallbacks();
        if (callbackInput.getCallbackType() == 1) {
            basePaymentDataCallbacksCreatePaymentDataCallbacks.onPaymentAuthorized((PaymentData) callbackInput.deserializeRequest(PaymentData.CREATOR), new zze(onCompleteListener));
        } else {
            if (callbackInput.getCallbackType() != 2) {
                throw new IllegalStateException("Unknown Callback Types");
            }
            basePaymentDataCallbacksCreatePaymentDataCallbacks.onPaymentDataChanged((IntermediatePaymentData) callbackInput.deserializeRequest(IntermediatePaymentData.CREATOR), new zzf(onCompleteListener));
        }
    }
}
