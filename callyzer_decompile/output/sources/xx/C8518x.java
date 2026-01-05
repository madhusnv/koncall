package xx;

import kotlin.jvm.internal.AbstractC4154l;
import wx.b1;
import wx.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.x */
/* loaded from: classes3.dex */
public final class C8518x extends b1 implements k1 {
    @Override // wx.k1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f39188h;
            AbstractC4154l.m8920c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f39189j + ((int) ((m15361o() + this.f39191l) - this.f39189j))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* renamed from: v */
    public final void m15792v(int i10) {
        synchronized (this) {
            Object[] objArr = this.f39188h;
            AbstractC4154l.m8920c(objArr);
            mo15352b(Integer.valueOf(((Number) objArr[((int) ((this.f39189j + ((int) ((m15361o() + this.f39191l) - this.f39189j))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
