package p004e;

import android.content.res.Resources;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public static final f0 f8881a = new f0(1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        AbstractC4154l.m8923f(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
