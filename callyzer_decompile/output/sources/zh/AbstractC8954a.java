package zh;

import android.content.Context;
import android.content.res.Resources;
import h6.C2856l;
import hq.d0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import mx.AbstractC4913i;
import mx.InterfaceC4911g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zh.a */
/* loaded from: classes.dex */
public abstract class AbstractC8954a {
    /* renamed from: a */
    public static String m16435a(C2856l context, int i10) {
        AbstractC4154l.m8923f(context, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            Context context2 = context.f15864a;
            AbstractC4154l.m8920c(context2);
            String resourceName = context2.getResources().getResourceName(i10);
            AbstractC4154l.m8920c(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }

    /* renamed from: b */
    public static InterfaceC4911g m16436b(AbstractC4422v abstractC4422v) {
        AbstractC4154l.m8923f(abstractC4422v, "<this>");
        return AbstractC4913i.m9809e(new d0(10), abstractC4422v);
    }
}
