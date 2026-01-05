package wj;

import a9.C0073l;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.s */
/* loaded from: classes.dex */
public final class C8093s {

    /* renamed from: b */
    public static WeakReference f38736b;

    /* renamed from: a */
    public C0073l f38737a;

    /* renamed from: a */
    public final synchronized C8092r m15271a() {
        String str;
        C8092r c8092r;
        C0073l c0073l = this.f38737a;
        synchronized (((ArrayDeque) c0073l.f267d)) {
            str = (String) ((ArrayDeque) c0073l.f267d).peek();
        }
        Pattern pattern = C8092r.f38732d;
        c8092r = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                c8092r = new C8092r(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c8092r;
    }
}
