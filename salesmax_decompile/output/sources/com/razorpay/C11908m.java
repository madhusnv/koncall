package com.razorpay;

import android.app.Activity;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.c64;

/* renamed from: com.razorpay.m */
/* loaded from: classes6.dex */
class C11908m {

    /* renamed from: c */
    private static C11908m f13783c;

    /* renamed from: a */
    ArrayList<SmsAgentInterface> f13784a = new ArrayList<>();

    /* renamed from: b */
    private SmsReceiver f13785b;

    /* renamed from: a */
    public static C11908m m16085a() {
        if (f13783c == null) {
            f13783c = new C11908m();
        }
        return f13783c;
    }

    /* renamed from: b */
    public final void m16091b(SmsAgentInterface smsAgentInterface) {
        try {
            this.f13784a.remove(smsAgentInterface);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void m16089b() {
        if (this.f13785b != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(1000);
        this.f13785b = new SmsReceiver(this);
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
    }

    /* renamed from: a */
    public final void m16086a(SmsAgentInterface smsAgentInterface) {
        this.f13784a.add(smsAgentInterface);
    }

    /* renamed from: a */
    public final boolean m16088a(Activity activity) {
        if (c64.checkSelfPermission(activity, "android.permission.RECEIVE_SMS") == 0) {
            m16087a(true);
            m16089b();
            AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_ALREADY_GRANTED);
            return true;
        }
        AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_ALREADY_NOT_GRANTED);
        return false;
    }

    /* renamed from: b */
    public final void m16090b(Activity activity) {
        m16087a(false);
        SmsReceiver smsReceiver = this.f13785b;
        if (smsReceiver == null) {
            return;
        }
        try {
            activity.unregisterReceiver(smsReceiver);
        } catch (Exception e) {
            AnalyticsUtil.reportError("SmsAgent", "S0", e.getMessage());
        }
        this.f13785b = null;
    }

    /* renamed from: a */
    public final void m16087a(boolean z) {
        Iterator<SmsAgentInterface> it = this.f13784a.iterator();
        while (it.hasNext()) {
            it.next().setSmsPermission(z);
        }
    }
}
