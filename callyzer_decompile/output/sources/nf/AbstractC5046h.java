package nf;

import android.content.Context;
import b2.C0554l;
import java.util.Iterator;
import java.util.Set;
import qf.AbstractC6209h;
import rf.C6500e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.h */
/* loaded from: classes.dex */
public abstract class AbstractC5046h {

    /* renamed from: a */
    public static final C0554l f24820a = new C0554l("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static void m9968a(Context context) {
        C5047i.m9974Z(context).a0();
        Set set = AbstractC6209h.f30197a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC6209h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C6500e.m12513a();
    }
}
