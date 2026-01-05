package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.n */
/* loaded from: classes.dex */
public final class C4660n {

    /* renamed from: m */
    public static final SparseIntArray f23036m;

    /* renamed from: a */
    public float f23037a;

    /* renamed from: b */
    public float f23038b;

    /* renamed from: c */
    public float f23039c;

    /* renamed from: d */
    public float f23040d;

    /* renamed from: e */
    public float f23041e;

    /* renamed from: f */
    public float f23042f;

    /* renamed from: g */
    public float f23043g;

    /* renamed from: h */
    public float f23044h;

    /* renamed from: i */
    public float f23045i;

    /* renamed from: j */
    public float f23046j;

    /* renamed from: k */
    public boolean f23047k;

    /* renamed from: l */
    public float f23048l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23036m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    /* renamed from: a */
    public final void m9539a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23061h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f23036m.get(index)) {
                case 1:
                    this.f23037a = typedArrayObtainStyledAttributes.getFloat(index, this.f23037a);
                    break;
                case 2:
                    this.f23038b = typedArrayObtainStyledAttributes.getFloat(index, this.f23038b);
                    break;
                case 3:
                    this.f23039c = typedArrayObtainStyledAttributes.getFloat(index, this.f23039c);
                    break;
                case 4:
                    this.f23040d = typedArrayObtainStyledAttributes.getFloat(index, this.f23040d);
                    break;
                case 5:
                    this.f23041e = typedArrayObtainStyledAttributes.getFloat(index, this.f23041e);
                    break;
                case 6:
                    this.f23042f = typedArrayObtainStyledAttributes.getDimension(index, this.f23042f);
                    break;
                case 7:
                    this.f23043g = typedArrayObtainStyledAttributes.getDimension(index, this.f23043g);
                    break;
                case 8:
                    this.f23044h = typedArrayObtainStyledAttributes.getDimension(index, this.f23044h);
                    break;
                case 9:
                    this.f23045i = typedArrayObtainStyledAttributes.getDimension(index, this.f23045i);
                    break;
                case 10:
                    this.f23046j = typedArrayObtainStyledAttributes.getDimension(index, this.f23046j);
                    break;
                case 11:
                    this.f23047k = true;
                    this.f23048l = typedArrayObtainStyledAttributes.getDimension(index, this.f23048l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
