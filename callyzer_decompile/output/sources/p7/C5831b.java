package p7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.InterfaceC4405e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p7.b */
/* loaded from: classes.dex */
public final class C5831b extends AbstractC4422v implements InterfaceC4405e {

    /* renamed from: g */
    public String f28520g;

    @Override // l7.AbstractC4422v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C5831b) && super.equals(obj) && AbstractC4154l.m8918a(this.f28520g, ((C5831b) obj).f28520g);
    }

    @Override // l7.AbstractC4422v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f28520g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l7.AbstractC4422v
    /* renamed from: u */
    public final void mo9180u(Context context, AttributeSet attributeSet) {
        AbstractC4154l.m8923f(context, "context");
        super.mo9180u(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC5839j.f28541a);
        AbstractC4154l.m8922e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f28520g = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
