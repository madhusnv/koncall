package l7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.a */
/* loaded from: classes.dex */
public final class C4401a extends AbstractC4422v {

    /* renamed from: g */
    public Intent f21993g;

    /* renamed from: h */
    public String f21994h;

    /* renamed from: x */
    public static String m9179x(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        AbstractC4154l.m8922e(packageName, "getPackageName(...)");
        return AbstractC5185w.m10136r(str, "${applicationId}", packageName);
    }

    @Override // l7.AbstractC4422v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C4401a) && super.equals(obj)) {
            Intent intent = this.f21993g;
            if ((intent != null ? intent.filterEquals(((C4401a) obj).f21993g) : ((C4401a) obj).f21993g == null) && AbstractC4154l.m8918a(this.f21994h, ((C4401a) obj).f21994h)) {
                return true;
            }
        }
        return false;
    }

    @Override // l7.AbstractC4422v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f21993g;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f21994h;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l7.AbstractC4422v
    public final String toString() {
        Intent intent = this.f21993g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (component != null) {
            sb2.append(" class=");
            sb2.append(component.getClassName());
        } else {
            Intent intent2 = this.f21993g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb2.append(" action=");
                sb2.append(action);
            }
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
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, q0.f22098a);
        AbstractC4154l.m8922e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String strM9179x = m9179x(context, typedArrayObtainAttributes.getString(4));
        if (this.f21993g == null) {
            this.f21993g = new Intent();
        }
        Intent intent = this.f21993g;
        AbstractC4154l.m8920c(intent);
        intent.setPackage(strM9179x);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f21993g == null) {
                this.f21993g = new Intent();
            }
            Intent intent2 = this.f21993g;
            AbstractC4154l.m8920c(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f21993g == null) {
            this.f21993g = new Intent();
        }
        Intent intent3 = this.f21993g;
        AbstractC4154l.m8920c(intent3);
        intent3.setAction(string2);
        String strM9179x2 = m9179x(context, typedArrayObtainAttributes.getString(2));
        if (strM9179x2 != null) {
            Uri uri = Uri.parse(strM9179x2);
            if (this.f21993g == null) {
                this.f21993g = new Intent();
            }
            Intent intent4 = this.f21993g;
            AbstractC4154l.m8920c(intent4);
            intent4.setData(uri);
        }
        this.f21994h = m9179x(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }
}
