package p001o;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public abstract class xs5 {
    /* renamed from: c */
    public static final void m56757c(Activity activity, String str, final js5 js5Var) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(js5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        new nta(activity).setTitle("Confirmation").mo3873f(str).mo3878k(activity.getResources().getString(hae.yes), new DialogInterface.OnClickListener() { // from class: o.vs5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                xs5.m56758d(js5Var, dialogInterface, i);
            }
        }).mo3874g(activity.getResources().getString(hae.no), new DialogInterface.OnClickListener() { // from class: o.ws5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                xs5.m56759e(dialogInterface, i);
            }
        }).m3880m();
    }

    /* renamed from: d */
    public static final void m56758d(js5 js5Var, DialogInterface dialogInterface, int i) {
        sq8.m48649h(js5Var, "$listener");
        js5Var.mo2903a("");
    }

    /* renamed from: e */
    public static final void m56759e(DialogInterface dialogInterface, int i) {
    }
}
