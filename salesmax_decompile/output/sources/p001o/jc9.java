package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;
import p001o.hzi;

/* loaded from: classes2.dex */
public class jc9 extends hc9 {

    /* renamed from: g */
    public String f30136g;

    /* renamed from: h */
    public int f30137h = -1;

    /* renamed from: i */
    public boolean f30138i = false;

    /* renamed from: j */
    public float f30139j = Float.NaN;

    /* renamed from: k */
    public float f30140k = Float.NaN;

    /* renamed from: l */
    public float f30141l = Float.NaN;

    /* renamed from: m */
    public float f30142m = Float.NaN;

    /* renamed from: n */
    public float f30143n = Float.NaN;

    /* renamed from: o */
    public float f30144o = Float.NaN;

    /* renamed from: p */
    public float f30145p = Float.NaN;

    /* renamed from: q */
    public float f30146q = Float.NaN;

    /* renamed from: r */
    public float f30147r = Float.NaN;

    /* renamed from: s */
    public float f30148s = Float.NaN;

    /* renamed from: t */
    public float f30149t = Float.NaN;

    /* renamed from: u */
    public float f30150u = Float.NaN;

    /* renamed from: v */
    public float f30151v = Float.NaN;

    /* renamed from: w */
    public float f30152w = Float.NaN;

    /* renamed from: o.jc9$a */
    public static class C14501a {

        /* renamed from: a */
        public static SparseIntArray f30153a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f30153a = sparseIntArray;
            sparseIntArray.append(mbe.KeyAttribute_android_alpha, 1);
            f30153a.append(mbe.KeyAttribute_android_elevation, 2);
            f30153a.append(mbe.KeyAttribute_android_rotation, 4);
            f30153a.append(mbe.KeyAttribute_android_rotationX, 5);
            f30153a.append(mbe.KeyAttribute_android_rotationY, 6);
            f30153a.append(mbe.KeyAttribute_android_transformPivotX, 19);
            f30153a.append(mbe.KeyAttribute_android_transformPivotY, 20);
            f30153a.append(mbe.KeyAttribute_android_scaleX, 7);
            f30153a.append(mbe.KeyAttribute_transitionPathRotate, 8);
            f30153a.append(mbe.KeyAttribute_transitionEasing, 9);
            f30153a.append(mbe.KeyAttribute_motionTarget, 10);
            f30153a.append(mbe.KeyAttribute_framePosition, 12);
            f30153a.append(mbe.KeyAttribute_curveFit, 13);
            f30153a.append(mbe.KeyAttribute_android_scaleY, 14);
            f30153a.append(mbe.KeyAttribute_android_translationX, 15);
            f30153a.append(mbe.KeyAttribute_android_translationY, 16);
            f30153a.append(mbe.KeyAttribute_android_translationZ, 17);
            f30153a.append(mbe.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m33531a(jc9 jc9Var, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f30153a.get(index)) {
                    case 1:
                        jc9Var.f30139j = typedArray.getFloat(index, jc9Var.f30139j);
                        break;
                    case 2:
                        jc9Var.f30140k = typedArray.getDimension(index, jc9Var.f30140k);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f30153a.get(index));
                        break;
                    case 4:
                        jc9Var.f30141l = typedArray.getFloat(index, jc9Var.f30141l);
                        break;
                    case 5:
                        jc9Var.f30142m = typedArray.getFloat(index, jc9Var.f30142m);
                        break;
                    case 6:
                        jc9Var.f30143n = typedArray.getFloat(index, jc9Var.f30143n);
                        break;
                    case 7:
                        jc9Var.f30147r = typedArray.getFloat(index, jc9Var.f30147r);
                        break;
                    case 8:
                        jc9Var.f30146q = typedArray.getFloat(index, jc9Var.f30146q);
                        break;
                    case 9:
                        jc9Var.f30136g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.R1) {
                            int resourceId = typedArray.getResourceId(index, jc9Var.f26656b);
                            jc9Var.f26656b = resourceId;
                            if (resourceId == -1) {
                                jc9Var.f26657c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jc9Var.f26657c = typedArray.getString(index);
                            break;
                        } else {
                            jc9Var.f26656b = typedArray.getResourceId(index, jc9Var.f26656b);
                            break;
                        }
                    case 12:
                        jc9Var.f26655a = typedArray.getInt(index, jc9Var.f26655a);
                        break;
                    case 13:
                        jc9Var.f30137h = typedArray.getInteger(index, jc9Var.f30137h);
                        break;
                    case 14:
                        jc9Var.f30148s = typedArray.getFloat(index, jc9Var.f30148s);
                        break;
                    case 15:
                        jc9Var.f30149t = typedArray.getDimension(index, jc9Var.f30149t);
                        break;
                    case 16:
                        jc9Var.f30150u = typedArray.getDimension(index, jc9Var.f30150u);
                        break;
                    case 17:
                        jc9Var.f30151v = typedArray.getDimension(index, jc9Var.f30151v);
                        break;
                    case 18:
                        jc9Var.f30152w = typedArray.getFloat(index, jc9Var.f30152w);
                        break;
                    case 19:
                        jc9Var.f30144o = typedArray.getDimension(index, jc9Var.f30144o);
                        break;
                    case 20:
                        jc9Var.f30145p = typedArray.getDimension(index, jc9Var.f30145p);
                        break;
                }
            }
        }
    }

    public jc9() {
        this.f26658d = 1;
        this.f26659e = new HashMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: R */
    public void m33530R(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f30152w = m30228k(obj);
                break;
            case 1:
                this.f30136g = obj.toString();
                break;
            case 2:
                this.f30142m = m30228k(obj);
                break;
            case 3:
                this.f30143n = m30228k(obj);
                break;
            case 4:
                this.f30149t = m30228k(obj);
                break;
            case 5:
                this.f30150u = m30228k(obj);
                break;
            case 6:
                this.f30151v = m30228k(obj);
                break;
            case 7:
                this.f30147r = m30228k(obj);
                break;
            case '\b':
                this.f30148s = m30228k(obj);
                break;
            case '\t':
                this.f30144o = m30228k(obj);
                break;
            case '\n':
                this.f30145p = m30228k(obj);
                break;
            case 11:
                this.f30141l = m30228k(obj);
                break;
            case '\f':
                this.f30140k = m30228k(obj);
                break;
            case '\r':
                this.f30146q = m30228k(obj);
                break;
            case 14:
                this.f30139j = m30228k(obj);
                break;
            case 15:
                this.f30137h = m30229l(obj);
                break;
            case 16:
                this.f30138i = m30227j(obj);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // p001o.hc9
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24787a(HashMap map) {
        for (String str : map.keySet()) {
            v0g v0gVar = (v0g) map.get(str);
            if (v0gVar != null) {
                char c = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c = 0;
                                break;
                            } else {
                                c = 65535;
                                break;
                            }
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -908189617:
                            if (!str.equals("scaleY")) {
                            }
                            break;
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = TokenParser.CR;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (Float.isNaN(this.f30142m)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30142m);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f30143n)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30143n);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f30149t)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30149t);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f30150u)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30150u);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f30151v)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30151v);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f30152w)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30152w);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f30147r)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30147r);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f30148s)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30148s);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.f30142m)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30144o);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.f30143n)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30145p);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.f30141l)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30141l);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f30140k)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30140k);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.f30146q)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30146q);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.f30139j)) {
                                break;
                            } else {
                                v0gVar.mo31331c(this.f26655a, this.f30139j);
                                break;
                            }
                    }
                } else {
                    C2004a c2004a = (C2004a) this.f26659e.get(str.substring(7));
                    if (c2004a != null) {
                        ((hzi.C14132b) v0gVar).m31333i(this.f26655a, c2004a);
                    }
                }
            }
        }
    }

    @Override // p001o.hc9
    /* renamed from: b */
    public hc9 clone() {
        return new jc9().mo24789c(this);
    }

    @Override // p001o.hc9
    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        super.mo24789c(hc9Var);
        jc9 jc9Var = (jc9) hc9Var;
        this.f30137h = jc9Var.f30137h;
        this.f30138i = jc9Var.f30138i;
        this.f30139j = jc9Var.f30139j;
        this.f30140k = jc9Var.f30140k;
        this.f30141l = jc9Var.f30141l;
        this.f30142m = jc9Var.f30142m;
        this.f30143n = jc9Var.f30143n;
        this.f30144o = jc9Var.f30144o;
        this.f30145p = jc9Var.f30145p;
        this.f30146q = jc9Var.f30146q;
        this.f30147r = jc9Var.f30147r;
        this.f30148s = jc9Var.f30148s;
        this.f30149t = jc9Var.f30149t;
        this.f30150u = jc9Var.f30150u;
        this.f30151v = jc9Var.f30151v;
        this.f30152w = jc9Var.f30152w;
        this.f30136g = jc9Var.f30136g;
        return this;
    }

    @Override // p001o.hc9
    /* renamed from: d */
    public void mo26461d(HashSet hashSet) {
        if (!Float.isNaN(this.f30139j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f30140k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f30141l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f30142m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f30143n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f30144o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f30145p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f30149t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f30150u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f30151v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f30146q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f30147r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f30148s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f30152w)) {
            hashSet.add("progress");
        }
        if (this.f26659e.size() > 0) {
            Iterator it = this.f26659e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p001o.hc9
    /* renamed from: e */
    public void mo24790e(Context context, AttributeSet attributeSet) {
        C14501a.m33531a(this, context.obtainStyledAttributes(attributeSet, mbe.KeyAttribute));
    }

    @Override // p001o.hc9
    /* renamed from: h */
    public void mo30225h(HashMap map) {
        if (this.f30137h == -1) {
            return;
        }
        if (!Float.isNaN(this.f30139j)) {
            map.put("alpha", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30140k)) {
            map.put("elevation", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30141l)) {
            map.put("rotation", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30142m)) {
            map.put("rotationX", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30143n)) {
            map.put("rotationY", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30144o)) {
            map.put("transformPivotX", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30145p)) {
            map.put("transformPivotY", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30149t)) {
            map.put("translationX", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30150u)) {
            map.put("translationY", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30151v)) {
            map.put("translationZ", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30146q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30147r)) {
            map.put("scaleX", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30148s)) {
            map.put("scaleY", Integer.valueOf(this.f30137h));
        }
        if (!Float.isNaN(this.f30152w)) {
            map.put("progress", Integer.valueOf(this.f30137h));
        }
        if (this.f26659e.size() > 0) {
            Iterator it = this.f26659e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f30137h));
            }
        }
    }
}
