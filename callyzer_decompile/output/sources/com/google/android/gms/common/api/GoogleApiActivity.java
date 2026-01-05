package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.h0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pf.C5902b;
import pf.C5905e;
import rf.C6500e;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public static final /* synthetic */ int f5998b = 0;

    /* renamed from: a */
    public int f5999a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5999a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C6500e c6500eM12515g = C6500e.m12515g(this);
                if (i11 == -1) {
                    h0 h0Var = c6500eM12515g.f31236p;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                } else if (i11 == 0) {
                    c6500eM12515g.m12520h(new C5902b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f5999a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5999a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5999a = bundle.getInt("resolution");
        }
        if (this.f5999a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                AbstractC6840z.m13036g(num);
                C5905e.f28746d.m11511d(this, num.intValue(), this);
                this.f5999a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f5999a = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    C6500e.m12515g(this).m12520h(new C5902b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strM11238i = AbstractC5601a.m11238i("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strM11238i.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.f5999a = 1;
                finish();
            } catch (IntentSender.SendIntentException unused4) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5999a);
        super.onSaveInstanceState(bundle);
    }
}
