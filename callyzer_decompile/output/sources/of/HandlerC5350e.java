package of;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.h0;
import e1.u0;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.e */
/* loaded from: classes.dex */
public final class HandlerC5350e extends h0 {

    /* renamed from: b */
    public final /* synthetic */ C5347b f26277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5350e(C5347b c5347b, Looper looper) {
        super(looper, 3, false);
        this.f26277b = c5347b;
        Looper.getMainLooper();
    }

    @Override // com.google.android.gms.internal.measurement.h0, android.os.Handler
    public final void handleMessage(Message message) {
        C5347b c5347b = this.f26277b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C5351f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C5352g) {
                        c5347b.f26271g = (C5352g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c5347b.f26270f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C5347b.f26264j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c5347b.m10477b(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c5347b.f26265a) {
                        int i10 = 0;
                        while (true) {
                            try {
                                u0 u0Var = c5347b.f26265a;
                                if (i10 < u0Var.f9065c) {
                                    c5347b.m10477b((String) u0Var.m5634j(i10), intent2.getExtras());
                                    i10++;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c5347b.m10477b(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }
}
