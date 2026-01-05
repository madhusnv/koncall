package o2;

import android.os.Handler;
import android.os.Looper;
import of.C5356k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.d */
/* loaded from: classes.dex */
public final class C5271d {

    /* renamed from: b */
    public static C5271d f25904b;

    /* renamed from: a */
    public Object f25905a;

    public C5271d(Object obj) {
        this.f25905a = obj;
    }

    public C5271d(int i10) {
        switch (i10) {
            case 2:
                this.f25905a = new Object();
                break;
            default:
                this.f25905a = new Object();
                new Handler(Looper.getMainLooper(), new C5356k(1, this));
                break;
        }
    }
}
