package x2;

import android.graphics.Rect;
import ex.InterfaceC2143g;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x2.b */
/* loaded from: classes.dex */
public final class C8278b extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ C8279c f39801a;

    /* renamed from: b */
    public final /* synthetic */ int f39802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8278b(C8279c c8279c, int i10) {
        super(4);
        this.f39801a = c8279c;
        this.f39802b = i10;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C8279c c8279c = this.f39801a;
        c8279c.f39803a.m1923f(c8279c.f39805c, this.f39802b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return a0.f30746a;
    }
}
