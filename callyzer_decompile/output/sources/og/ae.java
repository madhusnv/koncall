package og;

import bd.C0645a;
import ec.C2003a;
import ec.C2005c;
import kotlin.jvm.internal.AbstractC4154l;
import od.C5338b;
import ra.C6487a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ae {

    /* renamed from: a */
    public static final /* synthetic */ int f26322a = 0;

    /* renamed from: a */
    public static final C6487a m10531a(C0645a c0645a) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        C2003a key = C6487a.f31162c;
        C5338b c5338b = new C5338b(12);
        AbstractC4154l.m8923f(key, "key");
        C2005c c2005c = c0645a.f4116a;
        c2005c.getClass();
        Object objMo1864e = c2005c.mo1864e(key);
        if (objMo1864e == null) {
            objMo1864e = c5338b.invoke();
            c2005c.f9534a.put(key, objMo1864e);
        }
        return (C6487a) objMo1864e;
    }
}
