package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Arrays;
import java.util.HashMap;
import p001o.au3;
import p001o.by7;
import p001o.dy7;
import p001o.mbe;
import p001o.t8e;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    public int[] f6850a;

    /* renamed from: b */
    public int f6851b;

    /* renamed from: c */
    public Context f6852c;

    /* renamed from: d */
    public by7 f6853d;

    /* renamed from: e */
    public boolean f6854e;

    /* renamed from: f */
    public String f6855f;

    /* renamed from: g */
    public String f6856g;

    /* renamed from: h */
    public View[] f6857h;

    /* renamed from: q */
    public HashMap f6858q;

    public ConstraintHelper(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f6850a = new int[32];
        this.f6854e = false;
        this.f6857h = null;
        this.f6858q = new HashMap();
        this.f6852c = context;
        mo5306o(null);
    }

    /* renamed from: e */
    public final void m5590e(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f6852c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM5597m = m5597m(strTrim);
        if (iM5597m != 0) {
            this.f6858q.put(Integer.valueOf(iM5597m), strTrim);
            m5591f(iM5597m);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(strTrim);
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
    }

    /* renamed from: f */
    public final void m5591f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f6851b + 1;
        int[] iArr = this.f6850a;
        if (i2 > iArr.length) {
            this.f6850a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f6850a;
        int i3 = this.f6851b;
        iArr2[i3] = i;
        this.f6851b = i3 + 1;
    }

    /* renamed from: g */
    public final void m5592g(String str) {
        if (str == null || str.length() == 0 || this.f6852c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).c0)) {
                if (childAt.getId() == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("to use ConstraintTag view ");
                    sb.append(childAt.getClass().getSimpleName());
                    sb.append(" must have an ID");
                } else {
                    m5591f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6850a, this.f6851b);
    }

    /* renamed from: h */
    public void m5593h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m5594i((ConstraintLayout) parent);
    }

    /* renamed from: i */
    public void m5594i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f6851b; i++) {
            View viewM5613q = constraintLayout.m5613q(this.f6850a[i]);
            if (viewM5613q != null) {
                viewM5613q.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM5613q.setTranslationZ(viewM5613q.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo5333j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public final int[] m5595k(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iM5597m = m5597m(str2.trim());
            if (iM5597m != 0) {
                iArr[i] = iM5597m;
                i++;
            }
        }
        return i != strArrSplit.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    /* renamed from: l */
    public final int m5596l(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f6852c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
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
        return 0;
    }

    /* renamed from: m */
    public final int m5597m(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM5596l = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM5611o = constraintLayout.m5611o(0, str);
            if (objM5611o instanceof Integer) {
                iM5596l = ((Integer) objM5611o).intValue();
            }
        }
        if (iM5596l == 0 && constraintLayout != null) {
            iM5596l = m5596l(constraintLayout, str);
        }
        if (iM5596l == 0) {
            try {
                iM5596l = t8e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM5596l == 0 ? this.f6852c.getResources().getIdentifier(str, OutcomeConstants.OUTCOME_ID, this.f6852c.getPackageName()) : iM5596l;
    }

    /* renamed from: n */
    public View[] m5598n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f6857h;
        if (viewArr == null || viewArr.length != this.f6851b) {
            this.f6857h = new View[this.f6851b];
        }
        for (int i = 0; i < this.f6851b; i++) {
            this.f6857h[i] = constraintLayout.m5613q(this.f6850a[i]);
        }
        return this.f6857h;
    }

    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6855f = string;
                    setIds(string);
                } else if (index == mbe.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f6856g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f6855f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f6856g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f6854e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo5309p(C2005b.a aVar, dy7 dy7Var, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        C2005b.b bVar = aVar.f6971e;
        int[] iArr = bVar.k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.l0;
            if (str != null) {
                if (str.length() > 0) {
                    C2005b.b bVar2 = aVar.f6971e;
                    bVar2.k0 = m5595k(bVar2.l0);
                } else {
                    aVar.f6971e.k0 = null;
                }
            }
        }
        if (dy7Var == null) {
            return;
        }
        dy7Var.mo19920c();
        if (aVar.f6971e.k0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = aVar.f6971e.k0;
            if (i >= iArr2.length) {
                return;
            }
            zt3 zt3Var = (zt3) sparseArray.get(iArr2[i]);
            if (zt3Var != null) {
                dy7Var.mo19918a(zt3Var);
            }
            i++;
        }
    }

    /* renamed from: q */
    public void mo5310q(zt3 zt3Var, boolean z) {
    }

    /* renamed from: r */
    public void mo5334r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void m5599s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f6855f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f6851b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5590e(str.substring(i));
                return;
            } else {
                m5590e(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f6856g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f6851b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5592g(str.substring(i));
                return;
            } else {
                m5592g(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6855f = null;
        this.f6851b = 0;
        for (int i : iArr) {
            m5591f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f6855f == null) {
            m5591f(i);
        }
    }

    /* renamed from: t */
    public void mo5335t(ConstraintLayout constraintLayout) {
    }

    /* renamed from: u */
    public void m5600u(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iM5596l;
        if (isInEditMode()) {
            setIds(this.f6855f);
        }
        by7 by7Var = this.f6853d;
        if (by7Var == null) {
            return;
        }
        by7Var.mo19920c();
        for (int i = 0; i < this.f6851b; i++) {
            int i2 = this.f6850a[i];
            View viewM5613q = constraintLayout.m5613q(i2);
            if (viewM5613q == null && (iM5596l = m5596l(constraintLayout, (str = (String) this.f6858q.get(Integer.valueOf(i2))))) != 0) {
                this.f6850a[i] = iM5596l;
                this.f6858q.put(Integer.valueOf(iM5596l), str);
                viewM5613q = constraintLayout.m5613q(iM5596l);
            }
            if (viewM5613q != null) {
                this.f6853d.mo19918a(constraintLayout.m5614r(viewM5613q));
            }
        }
        this.f6853d.mo19919b(constraintLayout.f6865c);
    }

    /* renamed from: v */
    public void mo5342v(au3 au3Var, by7 by7Var, SparseArray sparseArray) {
        by7Var.mo19920c();
        for (int i = 0; i < this.f6851b; i++) {
            by7Var.mo19918a((zt3) sparseArray.get(this.f6850a[i]));
        }
    }

    /* renamed from: w */
    public void m5601w() {
        if (this.f6853d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).v0 = (zt3) this.f6853d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f6850a = new int[32];
        this.f6854e = false;
        this.f6857h = null;
        this.f6858q = new HashMap();
        this.f6852c = context;
        mo5306o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i);
        this.f6850a = new int[32];
        this.f6854e = false;
        this.f6857h = null;
        this.f6858q = new HashMap();
        this.f6852c = context;
        mo5306o(attributeSet);
    }
}
