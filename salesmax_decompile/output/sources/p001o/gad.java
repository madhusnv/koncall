package p001o;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class gad {
    /* renamed from: a */
    public static final cad m28291a() {
        return Build.VERSION.SDK_INT >= 28 ? new ead() : new fad();
    }
}
