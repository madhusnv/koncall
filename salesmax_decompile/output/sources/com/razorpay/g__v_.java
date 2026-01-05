package com.razorpay;

import android.app.Activity;
import com.razorpay.OpinionatedSoln;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class g__v_ implements OpinionatedSoln.DismissCallback {

    /* renamed from: a */
    private /* synthetic */ Activity f13767a;

    /* renamed from: b */
    private /* synthetic */ JSONObject f13768b;

    /* renamed from: c */
    private /* synthetic */ Checkout f13769c;

    public g__v_(Checkout checkout, Activity activity, JSONObject jSONObject) {
        this.f13769c = checkout;
        this.f13767a = activity;
        this.f13768b = jSONObject;
    }

    @Override // com.razorpay.OpinionatedSoln.DismissCallback
    public final void alertDismissed() throws JSONException {
        this.f13769c.openInternal(this.f13767a, this.f13768b);
    }
}
