package m5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import k5.C4006a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.d */
/* loaded from: classes.dex */
public abstract class AbstractC4650d extends View {

    /* renamed from: a */
    public int[] f22897a;

    /* renamed from: b */
    public int f22898b;

    /* renamed from: c */
    public Context f22899c;

    /* renamed from: d */
    public C4006a f22900d;

    /* renamed from: e */
    public String f22901e;

    /* renamed from: f */
    public HashMap f22902f;

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9529a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            android.content.Context r0 = r5.f22899c
            if (r6 == 0) goto L8d
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L8d
        Lc:
            if (r0 != 0) goto L10
            goto L8d
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5a
            if (r1 == 0) goto L5a
            if (r6 == 0) goto L4e
            java.util.HashMap r3 = r1.f2162n
            if (r3 == 0) goto L4e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4e
            java.util.HashMap r3 = r1.f2162n
            java.lang.Object r3 = r3.get(r6)
            goto L4f
        L4e:
            r3 = r2
        L4f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 != 0) goto L63
            if (r1 == 0) goto L63
            int r3 = r5.m9531c(r1, r6)
        L63:
            if (r3 != 0) goto L6f
            java.lang.Class<m5.q> r1 = m5.AbstractC4663q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6f
        L6f:
            if (r3 != 0) goto L7f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7f:
            if (r3 == 0) goto L8d
            java.util.HashMap r0 = r5.f22902f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m9530b(r3)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.AbstractC4650d.m9529a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void m9530b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f22898b + 1;
        int[] iArr = this.f22897a;
        if (i11 > iArr.length) {
            this.f22897a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f22897a;
        int i12 = this.f22898b;
        iArr2[i12] = i10;
        this.f22898b = i12 + 1;
    }

    /* renamed from: c */
    public final int m9531c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f22899c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final void m9532d() {
        if (this.f22900d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C4653g) {
            ((C4653g) layoutParams).f44419k0 = this.f22900d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f22897a, this.f22898b);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f22901e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f22901e = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f22898b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m9529a(str.substring(i10));
                return;
            } else {
                m9529a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f22901e = null;
        this.f22898b = 0;
        for (int i10 : iArr) {
            m9530b(i10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
