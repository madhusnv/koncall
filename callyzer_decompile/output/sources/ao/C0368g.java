package ao;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.g */
/* loaded from: classes3.dex */
public final class C0368g extends Exception {

    /* renamed from: a */
    public final C4802m f2946a;

    /* renamed from: b */
    public final String f2947b;

    public C0368g(C4802m c4802m, String phoneAccountId) {
        AbstractC4154l.m8923f(phoneAccountId, "phoneAccountId");
        this.f2946a = c4802m;
        this.f2947b = phoneAccountId;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "ConnectedSIM has the iccId still callLog not matched with any of the condition, May callLog is from the different SIM >>> simDetails:= " + this.f2946a + " >>> phoneAccountId:=" + this.f2947b;
    }
}
