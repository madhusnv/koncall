package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001o.ozi;

/* loaded from: classes2.dex */
public class jd9 extends hc9 {

    /* renamed from: g */
    public String f30206g;

    /* renamed from: h */
    public int f30207h = -1;

    /* renamed from: i */
    public float f30208i = Float.NaN;

    /* renamed from: j */
    public float f30209j = Float.NaN;

    /* renamed from: k */
    public float f30210k = Float.NaN;

    /* renamed from: l */
    public float f30211l = Float.NaN;

    /* renamed from: m */
    public float f30212m = Float.NaN;

    /* renamed from: n */
    public float f30213n = Float.NaN;

    /* renamed from: o */
    public float f30214o = Float.NaN;

    /* renamed from: p */
    public float f30215p = Float.NaN;

    /* renamed from: q */
    public float f30216q = Float.NaN;

    /* renamed from: r */
    public float f30217r = Float.NaN;

    /* renamed from: s */
    public float f30218s = Float.NaN;

    /* renamed from: t */
    public float f30219t = Float.NaN;

    /* renamed from: u */
    public int f30220u = 0;

    /* renamed from: v */
    public String f30221v = null;

    /* renamed from: w */
    public float f30222w = Float.NaN;

    /* renamed from: x */
    public float f30223x = 0.0f;

    /* renamed from: o.jd9$a */
    public static class C14504a {

        /* renamed from: a */
        public static SparseIntArray f30224a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f30224a = sparseIntArray;
            sparseIntArray.append(mbe.KeyTimeCycle_android_alpha, 1);
            f30224a.append(mbe.KeyTimeCycle_android_elevation, 2);
            f30224a.append(mbe.KeyTimeCycle_android_rotation, 4);
            f30224a.append(mbe.KeyTimeCycle_android_rotationX, 5);
            f30224a.append(mbe.KeyTimeCycle_android_rotationY, 6);
            f30224a.append(mbe.KeyTimeCycle_android_scaleX, 7);
            f30224a.append(mbe.KeyTimeCycle_transitionPathRotate, 8);
            f30224a.append(mbe.KeyTimeCycle_transitionEasing, 9);
            f30224a.append(mbe.KeyTimeCycle_motionTarget, 10);
            f30224a.append(mbe.KeyTimeCycle_framePosition, 12);
            f30224a.append(mbe.KeyTimeCycle_curveFit, 13);
            f30224a.append(mbe.KeyTimeCycle_android_scaleY, 14);
            f30224a.append(mbe.KeyTimeCycle_android_translationX, 15);
            f30224a.append(mbe.KeyTimeCycle_android_translationY, 16);
            f30224a.append(mbe.KeyTimeCycle_android_translationZ, 17);
            f30224a.append(mbe.KeyTimeCycle_motionProgress, 18);
            f30224a.append(mbe.KeyTimeCycle_wavePeriod, 20);
            f30224a.append(mbe.KeyTimeCycle_waveOffset, 21);
            f30224a.append(mbe.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m33600a(jd9 jd9Var, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f30224a.get(index)) {
                    case 1:
                        jd9Var.f30208i = typedArray.getFloat(index, jd9Var.f30208i);
                        break;
                    case 2:
                        jd9Var.f30209j = typedArray.getDimension(index, jd9Var.f30209j);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f30224a.get(index));
                        break;
                    case 4:
                        jd9Var.f30210k = typedArray.getFloat(index, jd9Var.f30210k);
                        break;
                    case 5:
                        jd9Var.f30211l = typedArray.getFloat(index, jd9Var.f30211l);
                        break;
                    case 6:
                        jd9Var.f30212m = typedArray.getFloat(index, jd9Var.f30212m);
                        break;
                    case 7:
                        jd9Var.f30214o = typedArray.getFloat(index, jd9Var.f30214o);
                        break;
                    case 8:
                        jd9Var.f30213n = typedArray.getFloat(index, jd9Var.f30213n);
                        break;
                    case 9:
                        jd9Var.f30206g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.R1) {
                            int resourceId = typedArray.getResourceId(index, jd9Var.f26656b);
                            jd9Var.f26656b = resourceId;
                            if (resourceId == -1) {
                                jd9Var.f26657c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jd9Var.f26657c = typedArray.getString(index);
                            break;
                        } else {
                            jd9Var.f26656b = typedArray.getResourceId(index, jd9Var.f26656b);
                            break;
                        }
                    case 12:
                        jd9Var.f26655a = typedArray.getInt(index, jd9Var.f26655a);
                        break;
                    case 13:
                        jd9Var.f30207h = typedArray.getInteger(index, jd9Var.f30207h);
                        break;
                    case 14:
                        jd9Var.f30215p = typedArray.getFloat(index, jd9Var.f30215p);
                        break;
                    case 15:
                        jd9Var.f30216q = typedArray.getDimension(index, jd9Var.f30216q);
                        break;
                    case 16:
                        jd9Var.f30217r = typedArray.getDimension(index, jd9Var.f30217r);
                        break;
                    case 17:
                        jd9Var.f30218s = typedArray.getDimension(index, jd9Var.f30218s);
                        break;
                    case 18:
                        jd9Var.f30219t = typedArray.getFloat(index, jd9Var.f30219t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            jd9Var.f30221v = typedArray.getString(index);
                            jd9Var.f30220u = 7;
                            break;
                        } else {
                            jd9Var.f30220u = typedArray.getInt(index, jd9Var.f30220u);
                            break;
                        }
                    case 20:
                        jd9Var.f30222w = typedArray.getFloat(index, jd9Var.f30222w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            jd9Var.f30223x = typedArray.getDimension(index, jd9Var.f30223x);
                            break;
                        } else {
                            jd9Var.f30223x = typedArray.getFloat(index, jd9Var.f30223x);
                            break;
                        }
                }
            }
        }
    }

    public jd9() {
        this.f26658d = 3;
        this.f26659e = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m33599U(HashMap map) {
        for (String str : map.keySet()) {
            ozi oziVar = (ozi) map.get(str);
            if (oziVar != null) {
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
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = 11;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (Float.isNaN(this.f30211l)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30211l, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f30212m)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30212m, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f30216q)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30216q, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f30217r)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30217r, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f30218s)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30218s, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f30219t)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30219t, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f30214o)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30214o, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f30215p)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30215p, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.f30210k)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30210k, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.f30209j)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30209j, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.f30213n)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30213n, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f30208i)) {
                                break;
                            } else {
                                oziVar.mo42827b(this.f26655a, this.f30208i, this.f30222w, this.f30220u, this.f30223x);
                                break;
                            }
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("UNKNOWN addValues \"");
                            sb.append(str);
                            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                            break;
                    }
                } else {
                    C2004a c2004a = (C2004a) this.f26659e.get(str.substring(7));
                    if (c2004a != null) {
                        ((ozi.C15922b) oziVar).m42829j(this.f26655a, c2004a, this.f30222w, this.f30220u, this.f30223x);
                    }
                }
            }
        }
    }

    @Override // p001o.hc9
    /* renamed from: a */
    public void mo24787a(HashMap map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p001o.hc9
    /* renamed from: b */
    public hc9 clone() {
        return new jd9().mo24789c(this);
    }

    @Override // p001o.hc9
    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        super.mo24789c(hc9Var);
        jd9 jd9Var = (jd9) hc9Var;
        this.f30206g = jd9Var.f30206g;
        this.f30207h = jd9Var.f30207h;
        this.f30220u = jd9Var.f30220u;
        this.f30222w = jd9Var.f30222w;
        this.f30223x = jd9Var.f30223x;
        this.f30219t = jd9Var.f30219t;
        this.f30208i = jd9Var.f30208i;
        this.f30209j = jd9Var.f30209j;
        this.f30210k = jd9Var.f30210k;
        this.f30213n = jd9Var.f30213n;
        this.f30211l = jd9Var.f30211l;
        this.f30212m = jd9Var.f30212m;
        this.f30214o = jd9Var.f30214o;
        this.f30215p = jd9Var.f30215p;
        this.f30216q = jd9Var.f30216q;
        this.f30217r = jd9Var.f30217r;
        this.f30218s = jd9Var.f30218s;
        this.f30221v = jd9Var.f30221v;
        return this;
    }

    @Override // p001o.hc9
    /* renamed from: d */
    public void mo26461d(HashSet hashSet) {
        if (!Float.isNaN(this.f30208i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f30209j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f30210k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f30211l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f30212m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f30216q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f30217r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f30218s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f30213n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f30214o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f30215p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f30219t)) {
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
        C14504a.m33600a(this, context.obtainStyledAttributes(attributeSet, mbe.KeyTimeCycle));
    }

    @Override // p001o.hc9
    /* renamed from: h */
    public void mo30225h(HashMap map) {
        if (this.f30207h == -1) {
            return;
        }
        if (!Float.isNaN(this.f30208i)) {
            map.put("alpha", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30209j)) {
            map.put("elevation", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30210k)) {
            map.put("rotation", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30211l)) {
            map.put("rotationX", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30212m)) {
            map.put("rotationY", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30216q)) {
            map.put("translationX", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30217r)) {
            map.put("translationY", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30218s)) {
            map.put("translationZ", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30213n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30214o)) {
            map.put("scaleX", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30214o)) {
            map.put("scaleY", Integer.valueOf(this.f30207h));
        }
        if (!Float.isNaN(this.f30219t)) {
            map.put("progress", Integer.valueOf(this.f30207h));
        }
        if (this.f26659e.size() > 0) {
            Iterator it = this.f26659e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f30207h));
            }
        }
    }
}
