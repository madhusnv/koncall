package com.google.android.gms.wallet.callback;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes3.dex */
public abstract class BasePaymentDataCallbacks {
    public void onPaymentAuthorized(PaymentData paymentData, @RecentlyNonNull OnCompleteListener<PaymentAuthorizationResult> onCompleteListener) {
    }

    public void onPaymentDataChanged(IntermediatePaymentData intermediatePaymentData, @RecentlyNonNull OnCompleteListener<PaymentDataRequestUpdate> onCompleteListener) {
    }
}
