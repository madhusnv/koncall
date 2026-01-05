package o6;

import android.os.FileObserver;
import ex.InterfaceC2139c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends FileObserver {

    /* renamed from: b */
    public static final Object f26159b = new Object();

    /* renamed from: c */
    public static final LinkedHashMap f26160c = new LinkedHashMap();

    /* renamed from: a */
    public final CopyOnWriteArrayList f26161a;

    public t0(String str) {
        super(str, 128);
        this.f26161a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        Iterator it = this.f26161a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2139c) it.next()).invoke(str);
        }
    }
}
