package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class kd9 extends hc9 {

    /* renamed from: A */
    public boolean f31944A;

    /* renamed from: g */
    public float f31945g = 0.1f;

    /* renamed from: h */
    public int f31946h;

    /* renamed from: i */
    public int f31947i;

    /* renamed from: j */
    public int f31948j;

    /* renamed from: k */
    public RectF f31949k;

    /* renamed from: l */
    public RectF f31950l;

    /* renamed from: m */
    public HashMap f31951m;

    /* renamed from: n */
    public int f31952n;

    /* renamed from: o */
    public String f31953o;

    /* renamed from: p */
    public int f31954p;

    /* renamed from: q */
    public String f31955q;

    /* renamed from: r */
    public String f31956r;

    /* renamed from: s */
    public int f31957s;

    /* renamed from: t */
    public int f31958t;

    /* renamed from: u */
    public View f31959u;

    /* renamed from: v */
    public boolean f31960v;

    /* renamed from: w */
    public boolean f31961w;

    /* renamed from: x */
    public boolean f31962x;

    /* renamed from: y */
    public float f31963y;

    /* renamed from: z */
    public float f31964z;

    /* renamed from: o.kd9$a */
    public static class C14784a {

        /* renamed from: a */
        public static SparseIntArray f31965a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f31965a = sparseIntArray;
            sparseIntArray.append(mbe.KeyTrigger_framePosition, 8);
            f31965a.append(mbe.KeyTrigger_onCross, 4);
            f31965a.append(mbe.KeyTrigger_onNegativeCross, 1);
            f31965a.append(mbe.KeyTrigger_onPositiveCross, 2);
            f31965a.append(mbe.KeyTrigger_motionTarget, 7);
            f31965a.append(mbe.KeyTrigger_triggerId, 6);
            f31965a.append(mbe.KeyTrigger_triggerSlack, 5);
            f31965a.append(mbe.KeyTrigger_motion_triggerOnCollision, 9);
            f31965a.append(mbe.KeyTrigger_motion_postLayoutCollision, 10);
            f31965a.append(mbe.KeyTrigger_triggerReceiver, 11);
            f31965a.append(mbe.KeyTrigger_viewTransitionOnCross, 12);
            f31965a.append(mbe.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f31965a.append(mbe.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m35442a(kd9 kd9Var, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f31965a.get(index)) {
                    case 1:
                        kd9Var.f31955q = typedArray.getString(index);
                        break;
                    case 2:
                        kd9Var.f31956r = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f31965a.get(index));
                        break;
                    case 4:
                        kd9Var.f31953o = typedArray.getString(index);
                        break;
                    case 5:
                        kd9Var.f31945g = typedArray.getFloat(index, kd9Var.f31945g);
                        break;
                    case 6:
                        kd9Var.f31957s = typedArray.getResourceId(index, kd9Var.f31957s);
                        break;
                    case 7:
                        if (MotionLayout.R1) {
                            int resourceId = typedArray.getResourceId(index, kd9Var.f26656b);
                            kd9Var.f26656b = resourceId;
                            if (resourceId == -1) {
                                kd9Var.f26657c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            kd9Var.f26657c = typedArray.getString(index);
                            break;
                        } else {
                            kd9Var.f26656b = typedArray.getResourceId(index, kd9Var.f26656b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, kd9Var.f26655a);
                        kd9Var.f26655a = integer;
                        kd9Var.f31963y = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        kd9Var.f31958t = typedArray.getResourceId(index, kd9Var.f31958t);
                        break;
                    case 10:
                        kd9Var.f31944A = typedArray.getBoolean(index, kd9Var.f31944A);
                        break;
                    case 11:
                        kd9Var.f31954p = typedArray.getResourceId(index, kd9Var.f31954p);
                        break;
                    case 12:
                        kd9Var.f31948j = typedArray.getResourceId(index, kd9Var.f31948j);
                        break;
                    case 13:
                        kd9Var.f31946h = typedArray.getResourceId(index, kd9Var.f31946h);
                        break;
                    case 14:
                        kd9Var.f31947i = typedArray.getResourceId(index, kd9Var.f31947i);
                        break;
                }
            }
        }
    }

    public kd9() {
        int i = hc9.f26654f;
        this.f31946h = i;
        this.f31947i = i;
        this.f31948j = i;
        this.f31949k = new RectF();
        this.f31950l = new RectF();
        this.f31951m = new HashMap();
        this.f31952n = -1;
        this.f31953o = null;
        int i2 = hc9.f26654f;
        this.f31954p = i2;
        this.f31955q = null;
        this.f31956r = null;
        this.f31957s = i2;
        this.f31958t = i2;
        this.f31959u = null;
        this.f31960v = true;
        this.f31961w = true;
        this.f31962x = true;
        this.f31963y = Float.NaN;
        this.f31944A = false;
        this.f26658d = 5;
        this.f26659e = new HashMap();
    }

    /* renamed from: A */
    public final void m35438A(String str, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f26659e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                C2004a c2004a = (C2004a) this.f26659e.get(str2);
                if (c2004a != null) {
                    c2004a.m5639a(view);
                }
            }
        }
    }

    /* renamed from: B */
    public final void m35439B(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p001o.hc9
    /* renamed from: a */
    public void mo24787a(HashMap map) {
    }

    @Override // p001o.hc9
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hc9 clone() {
        return new kd9().mo24789c(this);
    }

    @Override // p001o.hc9
    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        super.mo24789c(hc9Var);
        kd9 kd9Var = (kd9) hc9Var;
        this.f31952n = kd9Var.f31952n;
        this.f31953o = kd9Var.f31953o;
        this.f31954p = kd9Var.f31954p;
        this.f31955q = kd9Var.f31955q;
        this.f31956r = kd9Var.f31956r;
        this.f31957s = kd9Var.f31957s;
        this.f31958t = kd9Var.f31958t;
        this.f31959u = kd9Var.f31959u;
        this.f31945g = kd9Var.f31945g;
        this.f31960v = kd9Var.f31960v;
        this.f31961w = kd9Var.f31961w;
        this.f31962x = kd9Var.f31962x;
        this.f31963y = kd9Var.f31963y;
        this.f31964z = kd9Var.f31964z;
        this.f31944A = kd9Var.f31944A;
        this.f31949k = kd9Var.f31949k;
        this.f31950l = kd9Var.f31950l;
        this.f31951m = kd9Var.f31951m;
        return this;
    }

    @Override // p001o.hc9
    /* renamed from: d */
    public void mo26461d(HashSet hashSet) {
    }

    @Override // p001o.hc9
    /* renamed from: e */
    public void mo24790e(Context context, AttributeSet attributeSet) {
        C14784a.m35442a(this, context.obtainStyledAttributes(attributeSet, mbe.KeyTrigger), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m35440y(float f, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.f31958t != hc9.f26654f) {
            if (this.f31959u == null) {
                this.f31959u = ((ViewGroup) view.getParent()).findViewById(this.f31958t);
            }
            m35439B(this.f31949k, this.f31959u, this.f31944A);
            m35439B(this.f31950l, view, this.f31944A);
            if (this.f31949k.intersect(this.f31950l)) {
                if (this.f31960v) {
                    this.f31960v = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f31962x) {
                    this.f31962x = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f31961w = true;
                z5 = z6;
                z3 = false;
            } else {
                if (this.f31960v) {
                    z = false;
                } else {
                    this.f31960v = true;
                    z = true;
                }
                if (this.f31961w) {
                    this.f31961w = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f31962x = true;
                z5 = false;
            }
        } else {
            if (this.f31960v) {
                float f2 = this.f31963y;
                if ((f - f2) * (this.f31964z - f2) < 0.0f) {
                    this.f31960v = false;
                    z = true;
                }
                if (!this.f31961w) {
                    float f3 = this.f31963y;
                    float f4 = f - f3;
                    if ((this.f31964z - f3) * f4 < 0.0f && f4 < 0.0f) {
                        this.f31961w = false;
                        z2 = true;
                    }
                    if (this.f31962x) {
                        float f5 = this.f31963y;
                        float f6 = f - f5;
                        if ((this.f31964z - f5) * f6 >= 0.0f || f6 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f31962x = false;
                            z4 = true;
                        }
                        boolean z7 = z2;
                        z5 = z4;
                        z3 = z7;
                    } else {
                        if (Math.abs(f - this.f31963y) > this.f31945g) {
                            this.f31962x = true;
                        }
                        z3 = z2;
                        z5 = false;
                    }
                } else if (Math.abs(f - this.f31963y) > this.f31945g) {
                    this.f31961w = true;
                }
                z2 = false;
                if (this.f31962x) {
                }
            } else if (Math.abs(f - this.f31963y) > this.f31945g) {
                this.f31960v = true;
            }
            z = false;
            if (!this.f31961w) {
            }
            z2 = false;
            if (this.f31962x) {
            }
        }
        this.f31964z = f;
        if (z3 || z || z5) {
            ((MotionLayout) view.getParent()).m0(this.f31957s, z5, f);
        }
        View viewFindViewById = this.f31954p == hc9.f26654f ? view : ((MotionLayout) view.getParent()).findViewById(this.f31954p);
        if (z3) {
            String str = this.f31955q;
            if (str != null) {
                m35441z(str, viewFindViewById);
            }
            if (this.f31946h != hc9.f26654f) {
                ((MotionLayout) view.getParent()).K0(this.f31946h, viewFindViewById);
            }
        }
        if (z5) {
            String str2 = this.f31956r;
            if (str2 != null) {
                m35441z(str2, viewFindViewById);
            }
            if (this.f31947i != hc9.f26654f) {
                ((MotionLayout) view.getParent()).K0(this.f31947i, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f31953o;
            if (str3 != null) {
                m35441z(str3, viewFindViewById);
            }
            if (this.f31948j != hc9.f26654f) {
                ((MotionLayout) view.getParent()).K0(this.f31948j, viewFindViewById);
            }
        }
    }

    /* renamed from: z */
    public final void m35441z(String str, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            m35438A(str, view);
            return;
        }
        if (this.f31951m.containsKey(str)) {
            method = (Method) this.f31951m.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f31951m.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f31951m.put(str, null);
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find method \"");
                sb.append(str);
                sb.append("\"on class ");
                sb.append(view.getClass().getSimpleName());
                sb.append(" ");
                sb.append(k75.m35105d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception in call \"");
            sb2.append(this.f31953o);
            sb2.append("\"on class ");
            sb2.append(view.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(k75.m35105d(view));
        }
    }
}
