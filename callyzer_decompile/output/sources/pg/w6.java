package pg;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w6 {

    /* renamed from: a */
    public static final /* synthetic */ int f29101a = 0;

    /* renamed from: a */
    public static SharedPreferences m11907a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
}
