package p001o;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class k8j {
    /* renamed from: a */
    public static final boolean m35178a(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final void m35179b(Context context, Tasks tasks, Leads leads, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(tasks, "obj");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        String str2 = null;
        if ((leads != null ? leads.getPhoneNumbers() : null) != null) {
            ArrayList<String> phoneNumbers = leads != null ? leads.getPhoneNumbers() : null;
            sq8.m48646e(phoneNumbers);
            if (phoneNumbers.size() > 0) {
                sq8.m48646e(leads);
                str2 = leads.getPhoneNumbers().get(0);
            }
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        String str3 = "Please join with the following meeting link \n *" + tasks.getVideoCallLink() + "*";
        boolean zM3262x = AbstractC0059a.m132a().m3262x();
        String str4 = "http://api.whatsapp.com/send?phone=" + str2 + "&text=" + str3;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str4));
        if (zM3262x) {
            intent.setPackage("com.whatsapp.w4b");
        } else {
            intent.setPackage("com.whatsapp");
        }
        if (!m35178a(context, String.valueOf(intent.getPackage()))) {
            jm7.v0(ih0.m32119a(context), "Whats app not installed on your device", 0, 0, 12, null);
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            jm7.v0(ih0.m32119a(context), "Whats app not installed on your device", 0, 0, 12, null);
        }
    }
}
