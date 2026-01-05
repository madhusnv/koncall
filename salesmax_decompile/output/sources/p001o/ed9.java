package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ed9 extends fd9 {

    /* renamed from: h */
    public String f21420h = null;

    /* renamed from: i */
    public int f21421i = hc9.f26654f;

    /* renamed from: j */
    public int f21422j = 0;

    /* renamed from: k */
    public float f21423k = Float.NaN;

    /* renamed from: l */
    public float f21424l = Float.NaN;

    /* renamed from: m */
    public float f21425m = Float.NaN;

    /* renamed from: n */
    public float f21426n = Float.NaN;

    /* renamed from: o */
    public float f21427o = Float.NaN;

    /* renamed from: p */
    public float f21428p = Float.NaN;

    /* renamed from: q */
    public int f21429q = 0;

    /* renamed from: r */
    public float f21430r = Float.NaN;

    /* renamed from: s */
    public float f21431s = Float.NaN;

    /* renamed from: o.ed9$a */
    public static class C13160a {

        /* renamed from: a */
        public static SparseIntArray f21432a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f21432a = sparseIntArray;
            sparseIntArray.append(mbe.KeyPosition_motionTarget, 1);
            f21432a.append(mbe.KeyPosition_framePosition, 2);
            f21432a.append(mbe.KeyPosition_transitionEasing, 3);
            f21432a.append(mbe.KeyPosition_curveFit, 4);
            f21432a.append(mbe.KeyPosition_drawPath, 5);
            f21432a.append(mbe.KeyPosition_percentX, 6);
            f21432a.append(mbe.KeyPosition_percentY, 7);
            f21432a.append(mbe.KeyPosition_keyPositionType, 9);
            f21432a.append(mbe.KeyPosition_sizePercent, 8);
            f21432a.append(mbe.KeyPosition_percentWidth, 11);
            f21432a.append(mbe.KeyPosition_percentHeight, 12);
            f21432a.append(mbe.KeyPosition_pathMotionArc, 10);
        }

        /* renamed from: b */
        public static void m24794b(ed9 ed9Var, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f21432a.get(index)) {
                    case 1:
                        if (MotionLayout.R1) {
                            int resourceId = typedArray.getResourceId(index, ed9Var.f26656b);
                            ed9Var.f26656b = resourceId;
                            if (resourceId == -1) {
                                ed9Var.f26657c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            ed9Var.f26657c = typedArray.getString(index);
                            break;
                        } else {
                            ed9Var.f26656b = typedArray.getResourceId(index, ed9Var.f26656b);
                            break;
                        }
                    case 2:
                        ed9Var.f26655a = typedArray.getInt(index, ed9Var.f26655a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            ed9Var.f21420h = typedArray.getString(index);
                            break;
                        } else {
                            ed9Var.f21420h = q26.f41164c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        ed9Var.f23153g = typedArray.getInteger(index, ed9Var.f23153g);
                        break;
                    case 5:
                        ed9Var.f21422j = typedArray.getInt(index, ed9Var.f21422j);
                        break;
                    case 6:
                        ed9Var.f21425m = typedArray.getFloat(index, ed9Var.f21425m);
                        break;
                    case 7:
                        ed9Var.f21426n = typedArray.getFloat(index, ed9Var.f21426n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, ed9Var.f21424l);
                        ed9Var.f21423k = f;
                        ed9Var.f21424l = f;
                        break;
                    case 9:
                        ed9Var.f21429q = typedArray.getInt(index, ed9Var.f21429q);
                        break;
                    case 10:
                        ed9Var.f21421i = typedArray.getInt(index, ed9Var.f21421i);
                        break;
                    case 11:
                        ed9Var.f21423k = typedArray.getFloat(index, ed9Var.f21423k);
                        break;
                    case 12:
                        ed9Var.f21424l = typedArray.getFloat(index, ed9Var.f21424l);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f21432a.get(index));
                        break;
                }
            }
            int i2 = ed9Var.f26655a;
        }
    }

    public ed9() {
        this.f26658d = 2;
    }

    @Override // p001o.hc9
    /* renamed from: a */
    public void mo24787a(HashMap map) {
    }

    @Override // p001o.hc9
    /* renamed from: b */
    public hc9 clone() {
        return new ed9().mo24789c(this);
    }

    @Override // p001o.hc9
    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        super.mo24789c(hc9Var);
        ed9 ed9Var = (ed9) hc9Var;
        this.f21420h = ed9Var.f21420h;
        this.f21421i = ed9Var.f21421i;
        this.f21422j = ed9Var.f21422j;
        this.f21423k = ed9Var.f21423k;
        this.f21424l = Float.NaN;
        this.f21425m = ed9Var.f21425m;
        this.f21426n = ed9Var.f21426n;
        this.f21427o = ed9Var.f21427o;
        this.f21428p = ed9Var.f21428p;
        this.f21430r = ed9Var.f21430r;
        this.f21431s = ed9Var.f21431s;
        return this;
    }

    @Override // p001o.hc9
    /* renamed from: e */
    public void mo24790e(Context context, AttributeSet attributeSet) {
        C13160a.m24794b(this, context.obtainStyledAttributes(attributeSet, mbe.KeyPosition));
    }

    /* renamed from: m */
    public void m24791m(int i) {
        this.f21429q = i;
    }

    /* renamed from: n */
    public void m24792n(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f21420h = obj.toString();
                break;
            case "percentWidth":
                this.f21423k = m30228k(obj);
                break;
            case "percentHeight":
                this.f21424l = m30228k(obj);
                break;
            case "drawPath":
                this.f21422j = m30229l(obj);
                break;
            case "sizePercent":
                float fM30228k = m30228k(obj);
                this.f21423k = fM30228k;
                this.f21424l = fM30228k;
                break;
            case "percentX":
                this.f21425m = m30228k(obj);
                break;
            case "percentY":
                this.f21426n = m30228k(obj);
                break;
        }
    }
}
