package com.razorpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class SmsReceiver extends BroadcastReceiver {
    private C11908m smsAgent;

    public SmsReceiver() {
        this.smsAgent = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                Object[] objArr = (Object[]) extras.get("pdus");
                if (objArr.length > 0) {
                    SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) objArr[0]);
                    String displayOriginatingAddress = smsMessageCreateFromPdu.getDisplayOriginatingAddress();
                    String displayMessageBody = smsMessageCreateFromPdu.getDisplayMessageBody();
                    C11908m c11908m = this.smsAgent;
                    if (c11908m != null) {
                        Iterator<SmsAgentInterface> it = c11908m.f13784a.iterator();
                        while (it.hasNext()) {
                            it.next().postSms(displayOriginatingAddress, displayMessageBody);
                        }
                    } else {
                        Intent intent2 = new Intent("com.razorpay.events.SMS_PROCESSED");
                        intent2.putExtra("extra_sender", displayOriginatingAddress);
                        intent2.putExtra("extra_message", displayMessageBody);
                        context.sendBroadcast(intent2);
                    }
                    StringBuilder sb = new StringBuilder("SmsReceiver senderNum: ");
                    sb.append(displayOriginatingAddress);
                    sb.append("; message: ");
                    sb.append(displayMessageBody);
                }
            } catch (Exception e) {
                AnalyticsUtil.reportError("SmsReceiver", "S0", e.getMessage());
                new StringBuilder("SmsReceiver Exception smsReceiver").append(e);
            }
        }
    }

    public SmsReceiver(C11908m c11908m) {
        this.smsAgent = c11908m;
    }
}
