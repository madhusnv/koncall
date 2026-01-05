package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import i5.AbstractC3171a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.l */
/* loaded from: classes.dex */
public final class C4658l {

    /* renamed from: e */
    public static final SparseIntArray f23027e;

    /* renamed from: a */
    public int f23028a;

    /* renamed from: b */
    public int f23029b;

    /* renamed from: c */
    public float f23030c;

    /* renamed from: d */
    public float f23031d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23027e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* renamed from: a */
    public final void m9537a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23058e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f23027e.get(index)) {
                case 1:
                    this.f23031d = typedArrayObtainStyledAttributes.getFloat(index, this.f23031d);
                    break;
                case 2:
                    this.f23029b = typedArrayObtainStyledAttributes.getInt(index, this.f23029b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC3171a.f17098a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f23028a = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23028a);
                    break;
                case 6:
                    this.f23030c = typedArrayObtainStyledAttributes.getFloat(index, this.f23030c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
