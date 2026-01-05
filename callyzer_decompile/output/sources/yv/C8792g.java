package yv;

import e1.x0;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.g */
/* loaded from: classes3.dex */
public final class C8792g {
    /* renamed from: a */
    public static EnumC8793h m16176a(int i10) {
        AbstractC6654d abstractC6654d = (AbstractC6654d) EnumC8793h.getEntries();
        abstractC6654d.getClass();
        x0 x0Var = new x0(7, abstractC6654d);
        while (x0Var.hasNext()) {
            EnumC8793h enumC8793h = (EnumC8793h) x0Var.next();
            if (enumC8793h.getScreenName() == i10) {
                return enumC8793h;
            }
        }
        return EnumC8793h.DEFAULT_CALL_HISTORY;
    }
}
