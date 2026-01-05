package ai.salesmax.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class PhoneStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C1668a f4890a = new C1668a(null);

    /* renamed from: b */
    public static boolean f4891b;

    /* renamed from: c */
    public static String f4892c;

    /* renamed from: ai.salesmax.util.PhoneStateReceiver$a */
    public static final class C1668a {
        public C1668a() {
        }

        public /* synthetic */ C1668a(id5 id5Var) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        if (sq8.m48644c(intent.getAction(), "android.intent.action.NEW_OUTGOING_CALL")) {
            f4891b = false;
            String stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
            StringBuilder sb = new StringBuilder();
            sb.append("call OUT:");
            sb.append(stringExtra);
            return;
        }
        Object systemService = context.getSystemService("phone");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        int callState = ((TelephonyManager) systemService).getCallState();
        if (callState != 0) {
            if (callState == 1) {
                f4891b = true;
                String stringExtra2 = intent.getStringExtra("incoming_number");
                f4892c = stringExtra2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("RINGING :");
                sb2.append(stringExtra2);
                return;
            }
            if (callState == 2 && f4891b) {
                String str = f4892c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("incoming ACCEPT :");
                sb3.append(str);
            }
        }
    }
}
