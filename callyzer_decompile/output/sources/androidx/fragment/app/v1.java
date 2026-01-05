package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import p8.C5854o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a */
    public static final a2 f2724a = new a2();

    /* renamed from: b */
    public static final c2 f2725b;

    static {
        c2 c2Var = null;
        try {
            c2Var = (c2) C5854o.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2725b = c2Var;
    }

    /* renamed from: a */
    public static final void m1269a(int i10, ArrayList views) {
        AbstractC4154l.m8923f(views, "views");
        int size = views.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = views.get(i11);
            i11++;
            ((View) obj).setVisibility(i10);
        }
    }
}
