package p001o;

import android.os.Messenger;

/* loaded from: classes2.dex */
public abstract class g7b {
    /* renamed from: a */
    public static boolean m28138a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
