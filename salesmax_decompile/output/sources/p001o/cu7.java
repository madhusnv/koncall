package p001o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class cu7 {
    /* renamed from: a */
    public static final void m21812a(Double d, Double d2, Context context) {
        sq8.m48649h(context, "context");
        if (d == null || d2 == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2));
        intent.setPackage("com.google.android.apps.maps");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
