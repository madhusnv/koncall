package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import k5.C4006a;
import k5.C4013h;
import m5.AbstractC4650d;
import m5.AbstractC4664r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Barrier extends AbstractC4650d {

    /* renamed from: g */
    public int f2147g;

    /* renamed from: h */
    public int f2148h;

    /* renamed from: j */
    public C4006a f2149j;

    public Barrier(Context context) {
        super(context);
        this.f22897a = new int[32];
        this.f22902f = new HashMap();
        this.f22899c = context;
        m731e(null);
        super.setVisibility(8);
    }

    /* renamed from: e */
    public final void m731e(AttributeSet attributeSet) {
        int[] iArr = AbstractC4664r.f23055b;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f22901e = string;
                    setIds(string);
                }
            }
        }
        C4006a c4006a = new C4006a();
        c4006a.f44381d0 = new C4013h[4];
        c4006a.f44382e0 = 0;
        c4006a.f44383f0 = 0;
        c4006a.f44384g0 = true;
        c4006a.f44385h0 = 0;
        this.f2149j = c4006a;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i11 = 0; i11 < indexCount2; i11++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i11);
                if (index2 == 15) {
                    setType(typedArrayObtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 14) {
                    this.f2149j.f44384g0 = typedArrayObtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 16) {
                    this.f2149j.f44385h0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
        }
        this.f22900d = this.f2149j;
        m9532d();
    }

    public int getMargin() {
        return this.f2149j.f44385h0;
    }

    public int getType() {
        return this.f2147g;
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f2149j.f44384g0 = z6;
    }

    public void setDpMargin(int i10) {
        this.f2149j.f44385h0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f2149j.f44385h0 = i10;
    }

    public void setType(int i10) {
        this.f2147g = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22897a = new int[32];
        this.f22902f = new HashMap();
        this.f22899c = context;
        m731e(attributeSet);
        super.setVisibility(8);
    }
}
