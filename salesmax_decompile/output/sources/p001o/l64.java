package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes3.dex */
public abstract class l64 {
    /* renamed from: a */
    public static Activity m36609a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
