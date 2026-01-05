package td;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4152j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C7135l extends AbstractC4152j implements InterfaceC2139c {

    /* renamed from: a */
    public static final C7135l f34369a = new C7135l(1, AbstractC7136m.class, "isDigit", "isDigit(C)Z", 1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        boolean z6 = false;
        if ('0' <= cCharValue && cCharValue < ':') {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
