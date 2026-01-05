package p7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p7.h */
/* loaded from: classes.dex */
public final class C5837h extends AbstractC4422v {

    /* renamed from: g */
    public String f28538g;

    @Override // l7.AbstractC4422v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C5837h) && super.equals(obj) && AbstractC4154l.m8918a(this.f28538g, ((C5837h) obj).f28538g);
    }

    @Override // l7.AbstractC4422v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f28538g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l7.AbstractC4422v
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.f28538g;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    @Override // l7.AbstractC4422v
    /* renamed from: u */
    public final void mo9180u(Context context, AttributeSet attributeSet) {
        AbstractC4154l.m8923f(context, "context");
        super.mo9180u(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC5839j.f28542b);
        AbstractC4154l.m8922e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f28538g = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
