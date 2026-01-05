package t3;

import ex.InterfaceC2141e;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4152j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C7014a extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public static final C7014a f33950a = new C7014a(2, AbstractC2747a.class, "min", "min(II)I", 1);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
