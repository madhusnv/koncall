package p001o;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class cij {

    /* renamed from: a */
    public static qhj f18230a;

    /* renamed from: a */
    public static synchronized qhj m21314a(Context context) {
        if (f18230a == null) {
            uhj uhjVar = new uhj(null);
            uhjVar.m51601b(new hjj(vkj.m52903a(context)));
            f18230a = uhjVar.m51600a();
        }
        return f18230a;
    }
}
