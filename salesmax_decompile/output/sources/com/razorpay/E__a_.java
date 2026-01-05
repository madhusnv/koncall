package com.razorpay;

import android.content.DialogInterface;
import com.razorpay.CheckoutUtils;

/* loaded from: classes6.dex */
final class E__a_ implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ CheckoutUtils.BackButtonDialogCallback f13609a;

    public E__a_(CheckoutUtils.BackButtonDialogCallback backButtonDialogCallback) {
        this.f13609a = backButtonDialogCallback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13609a.onNegativeButtonClick();
    }
}
