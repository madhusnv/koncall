package ai.salesmax.ui.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SmsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public InterfaceC1220a f3595a;

    /* renamed from: ai.salesmax.ui.service.SmsBroadcastReceiver$a */
    public interface InterfaceC1220a {
        /* renamed from: a */
        void mo2572a(Intent intent);

        /* renamed from: b */
        void mo2573b();
    }

    /* renamed from: a */
    public final void m2667a(InterfaceC1220a interfaceC1220a) {
        this.f3595a = interfaceC1220a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Status status;
        InterfaceC1220a interfaceC1220a;
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        if (sq8.m48644c(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            Bundle extras = intent.getExtras();
            try {
                int i = Build.VERSION.SDK_INT;
                Intent intent2 = null;
                if (i >= 33) {
                    status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) : null;
                } else {
                    status = (Status) (extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null);
                }
                Integer numValueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    if (i >= 33) {
                        if (extras != null) {
                            intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT, Intent.class);
                        }
                    } else if (extras != null) {
                        intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT);
                    }
                    InterfaceC1220a interfaceC1220a2 = this.f3595a;
                    if (interfaceC1220a2 != null) {
                        interfaceC1220a2.mo2572a(intent2);
                        return;
                    }
                    return;
                }
                if (numValueOf == null || numValueOf.intValue() != 15 || (interfaceC1220a = this.f3595a) == null) {
                    return;
                }
                interfaceC1220a.mo2573b();
            } catch (Exception unused) {
            }
        }
    }
}
