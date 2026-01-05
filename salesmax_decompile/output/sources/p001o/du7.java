package p001o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public abstract class du7 {
    /* renamed from: a */
    public static final void m23833a(Context context, Fragment fragment, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(str, "meetUrl");
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.google.android.apps.meet");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                fragment.startActivity(intent);
            } else {
                fragment.startActivity(intent2);
            }
        } catch (Exception unused) {
        }
    }
}
