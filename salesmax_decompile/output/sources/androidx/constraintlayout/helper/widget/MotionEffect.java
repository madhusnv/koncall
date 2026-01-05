package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import p001o.ed9;
import p001o.gmb;
import p001o.jc9;
import p001o.k75;
import p001o.mbe;

/* loaded from: classes2.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: L */
    public float f6586L;

    /* renamed from: M */
    public int f6587M;

    /* renamed from: Q */
    public int f6588Q;
    public int h0;
    public int i0;
    public boolean j0;
    public int k0;
    public int l0;

    public MotionEffect(Context context) {
        super(context);
        this.f6586L = 0.1f;
        this.f6587M = 49;
        this.f6588Q = 50;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = -1;
        this.l0 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0191, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
    
        if (r15 == 0.0f) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5339D(MotionLayout motionLayout, HashMap map) {
        jc9 jc9Var;
        jc9 jc9Var2;
        jc9 jc9Var3;
        boolean z;
        HashMap map2 = map;
        View[] viewArrM5598n = m5598n((ConstraintLayout) getParent());
        if (viewArrM5598n == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(k75.m35102a());
            sb.append(" views = null");
            return;
        }
        jc9 jc9Var4 = new jc9();
        jc9 jc9Var5 = new jc9();
        jc9Var4.m33530R("alpha", Float.valueOf(this.f6586L));
        jc9Var5.m33530R("alpha", Float.valueOf(this.f6586L));
        jc9Var4.m30224g(this.f6587M);
        jc9Var5.m30224g(this.f6588Q);
        ed9 ed9Var = new ed9();
        ed9Var.m30224g(this.f6587M);
        ed9Var.m24791m(0);
        ed9Var.m24792n("percentX", 0);
        ed9Var.m24792n("percentY", 0);
        ed9 ed9Var2 = new ed9();
        ed9Var2.m30224g(this.f6588Q);
        ed9Var2.m24791m(0);
        ed9Var2.m24792n("percentX", 1);
        ed9Var2.m24792n("percentY", 1);
        jc9 jc9Var6 = null;
        if (this.h0 > 0) {
            jc9Var = new jc9();
            jc9Var2 = new jc9();
            jc9Var.m33530R("translationX", Integer.valueOf(this.h0));
            jc9Var.m30224g(this.f6588Q);
            jc9Var2.m33530R("translationX", 0);
            jc9Var2.m30224g(this.f6588Q - 1);
        } else {
            jc9Var = null;
            jc9Var2 = null;
        }
        if (this.i0 > 0) {
            jc9Var6 = new jc9();
            jc9Var3 = new jc9();
            jc9Var6.m33530R("translationY", Integer.valueOf(this.i0));
            jc9Var6.m30224g(this.f6588Q);
            jc9Var3.m33530R("translationY", 0);
            jc9Var3.m30224g(this.f6588Q - 1);
        } else {
            jc9Var3 = null;
        }
        int i = this.l0;
        if (i == -1) {
            int[] iArr = new int[4];
            for (View view : viewArrM5598n) {
                gmb gmbVar = (gmb) map2.get(view);
                if (gmbVar != null) {
                    float fM29077n = gmbVar.m29077n() - gmbVar.m29082t();
                    float fM29078o = gmbVar.m29078o() - gmbVar.m29083u();
                    if (fM29078o < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (fM29078o > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (fM29077n > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (fM29077n < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i2 = iArr[0];
            i = 0;
            for (int i3 = 1; i3 < 4; i3++) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i = i3;
                    i2 = i4;
                }
            }
        }
        int i5 = 0;
        while (i5 < viewArrM5598n.length) {
            gmb gmbVar2 = (gmb) map2.get(viewArrM5598n[i5]);
            if (gmbVar2 != null) {
                float fM29077n2 = gmbVar2.m29077n() - gmbVar2.m29082t();
                float fM29078o2 = gmbVar2.m29078o() - gmbVar2.m29083u();
                if (i == 0) {
                    if (fM29078o2 > 0.0f) {
                        if (this.j0) {
                        }
                    }
                } else if (i == 1) {
                    if (fM29078o2 < 0.0f) {
                        if (this.j0) {
                        }
                    }
                } else if (i != 2) {
                    z = i != 3 || fM29077n2 <= 0.0f || (this.j0 && fM29078o2 != 0.0f);
                } else if (fM29077n2 < 0.0f) {
                    if (this.j0) {
                    }
                }
                if (z) {
                    int i6 = this.k0;
                    if (i6 == -1) {
                        gmbVar2.m29064a(jc9Var4);
                        gmbVar2.m29064a(jc9Var5);
                        gmbVar2.m29064a(ed9Var);
                        gmbVar2.m29064a(ed9Var2);
                        if (this.h0 > 0) {
                            gmbVar2.m29064a(jc9Var);
                            gmbVar2.m29064a(jc9Var2);
                        }
                        if (this.i0 > 0) {
                            gmbVar2.m29064a(jc9Var6);
                            gmbVar2.m29064a(jc9Var3);
                        }
                    } else {
                        motionLayout.a0(i6, gmbVar2);
                    }
                }
            }
            i5++;
            map2 = map;
        }
    }

    /* renamed from: E */
    public final void m5340E(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f6587M);
                    this.f6587M = i2;
                    this.f6587M = Math.max(Math.min(i2, 99), 0);
                } else if (index == mbe.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f6588Q);
                    this.f6588Q = i3;
                    this.f6588Q = Math.max(Math.min(i3, 99), 0);
                } else if (index == mbe.MotionEffect_motionEffect_translationX) {
                    this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h0);
                } else if (index == mbe.MotionEffect_motionEffect_translationY) {
                    this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i0);
                } else if (index == mbe.MotionEffect_motionEffect_alpha) {
                    this.f6586L = typedArrayObtainStyledAttributes.getFloat(index, this.f6586L);
                } else if (index == mbe.MotionEffect_motionEffect_move) {
                    this.l0 = typedArrayObtainStyledAttributes.getInt(index, this.l0);
                } else if (index == mbe.MotionEffect_motionEffect_strict) {
                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                } else if (index == mbe.MotionEffect_motionEffect_viewTransition) {
                    this.k0 = typedArrayObtainStyledAttributes.getResourceId(index, this.k0);
                }
            }
            int i4 = this.f6587M;
            int i5 = this.f6588Q;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f6587M = i4 - 1;
                } else {
                    this.f6588Q = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: x */
    public boolean mo5341x() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6586L = 0.1f;
        this.f6587M = 49;
        this.f6588Q = 50;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = -1;
        this.l0 = -1;
        m5340E(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6586L = 0.1f;
        this.f6587M = 49;
        this.f6588Q = 50;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = -1;
        this.l0 = -1;
        m5340E(context, attributeSet);
    }
}
