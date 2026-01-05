package q6;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q6.a */
/* loaded from: classes.dex */
public abstract class AbstractC6129a {
    /* renamed from: a */
    public static final boolean m12161a(Context context, String name) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
