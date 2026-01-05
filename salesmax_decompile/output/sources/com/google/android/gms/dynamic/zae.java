package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* loaded from: classes5.dex */
final class zae implements View.OnClickListener {
    final /* synthetic */ Context zaa;
    final /* synthetic */ Intent zab;

    public zae(Context context, Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.zaa.startActivity(this.zab);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
