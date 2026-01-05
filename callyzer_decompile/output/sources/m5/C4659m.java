package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.m */
/* loaded from: classes.dex */
public final class C4659m {

    /* renamed from: a */
    public int f23032a;

    /* renamed from: b */
    public int f23033b;

    /* renamed from: c */
    public float f23034c;

    /* renamed from: d */
    public float f23035d;

    /* renamed from: a */
    public final void m9538a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23059f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f23034c = typedArrayObtainStyledAttributes.getFloat(index, this.f23034c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f23032a);
                this.f23032a = i11;
                this.f23032a = C4661o.f23049d[i11];
            } else if (index == 4) {
                this.f23033b = typedArrayObtainStyledAttributes.getInt(index, this.f23033b);
            } else if (index == 3) {
                this.f23035d = typedArrayObtainStyledAttributes.getFloat(index, this.f23035d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
