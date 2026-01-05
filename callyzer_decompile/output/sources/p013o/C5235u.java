package p013o;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p009j.AbstractC3500a;
import pg.g6;
import v0.C7622f;
import v6.C7680f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.u */
/* loaded from: classes.dex */
public final class C5235u {

    /* renamed from: a */
    public final TextView f25651a;

    /* renamed from: b */
    public final C7622f f25652b;

    public C5235u(TextView textView) {
        this.f25651a = textView;
        C7622f c7622f = new C7622f();
        c7622f.f36778a = new C7680f(textView);
        this.f25652b = c7622f;
    }

    /* renamed from: a */
    public final void m10290a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f25651a.getContext().obtainStyledAttributes(attributeSet, AbstractC3500a.f18350g, i10, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((g6) this.f25652b.f36778a).mo11655g(z6);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
