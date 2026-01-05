package p001o;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes2.dex */
public abstract class shi {

    /* renamed from: o.shi$a */
    public static class C16847a {
        /* renamed from: a */
        public static boolean m48358a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m48357a(Context context) {
        return C16847a.m48358a(context);
    }
}
