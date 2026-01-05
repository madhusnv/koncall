package p001o;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes2.dex */
public abstract class gn1 {
    /* renamed from: a */
    public static IBinder m29145a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* renamed from: b */
    public static void m29146b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
