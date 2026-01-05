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

/* loaded from: classes2.dex */
public class lc9 extends hc9 {

    /* renamed from: g */
    public String f33595g = null;

    /* renamed from: h */
    public int f33596h = 0;

    /* renamed from: i */
    public int f33597i = -1;

    /* renamed from: j */
    public String f33598j = null;

    /* renamed from: k */
    public float f33599k = Float.NaN;

    /* renamed from: l */
    public float f33600l = 0.0f;

    /* renamed from: m */
    public float f33601m = 0.0f;

    /* renamed from: n */
    public float f33602n = Float.NaN;

    /* renamed from: o */
    public int f33603o = -1;

    /* renamed from: p */
    public float f33604p = Float.NaN;

    /* renamed from: q */
    public float f33605q = Float.NaN;

    /* renamed from: r */
    public float f33606r = Float.NaN;

    /* renamed from: s */
    public float f33607s = Float.NaN;

    /* renamed from: t */
    public float f33608t = Float.NaN;

    /* renamed from: u */
    public float f33609u = Float.NaN;

    /* renamed from: v */
    public float f33610v = Float.NaN;

    /* renamed from: w */
    public float f33611w = Float.NaN;

    /* renamed from: x */
    public float f33612x = Float.NaN;

    /* renamed from: y */
    public float f33613y = Float.NaN;

    /* renamed from: z */
    public float f33614z = Float.NaN;

    /* renamed from: o.lc9$a */
    public static class C15057a {

        /* renamed from: a */
        public static SparseIntArray f33615a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33615a = sparseIntArray;
            sparseIntArray.append(mbe.KeyCycle_motionTarget, 1);
            f33615a.append(mbe.KeyCycle_framePosition, 2);
            f33615a.append(mbe.KeyCycle_transitionEasing, 3);
            f33615a.append(mbe.KeyCycle_curveFit, 4);
            f33615a.append(mbe.KeyCycle_waveShape, 5);
            f33615a.append(mbe.KeyCycle_wavePeriod, 6);
            f33615a.append(mbe.KeyCycle_waveOffset, 7);
            f33615a.append(mbe.KeyCycle_waveVariesBy, 8);
            f33615a.append(mbe.KeyCycle_android_alpha, 9);
            f33615a.append(mbe.KeyCycle_android_elevation, 10);
            f33615a.append(mbe.KeyCycle_android_rotation, 11);
            f33615a.append(mbe.KeyCycle_android_rotationX, 12);
            f33615a.append(mbe.KeyCycle_android_rotationY, 13);
            f33615a.append(mbe.KeyCycle_transitionPathRotate, 14);
            f33615a.append(mbe.KeyCycle_android_scaleX, 15);
            f33615a.append(mbe.KeyCycle_android_scaleY, 16);
            f33615a.append(mbe.KeyCycle_android_translationX, 17);
            f33615a.append(mbe.KeyCycle_android_translationY, 18);
            f33615a.append(mbe.KeyCycle_android_translationZ, 19);
            f33615a.append(mbe.KeyCycle_motionProgress, 20);
            f33615a.append(mbe.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m36942b(lc9 lc9Var, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f33615a.get(index)) {
                    case 1:
                        if (MotionLayout.R1) {
                            int resourceId = typedArray.getResourceId(index, lc9Var.f26656b);
                            lc9Var.f26656b = resourceId;
                            if (resourceId == -1) {
                                lc9Var.f26657c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lc9Var.f26657c = typedArray.getString(index);
                            break;
                        } else {
                            lc9Var.f26656b = typedArray.getResourceId(index, lc9Var.f26656b);
                            break;
                        }
                    case 2:
                        lc9Var.f26655a = typedArray.getInt(index, lc9Var.f26655a);
                        break;
                    case 3:
                        lc9Var.f33595g = typedArray.getString(index);
                        break;
                    case 4:
                        lc9Var.f33596h = typedArray.getInteger(index, lc9Var.f33596h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            lc9Var.f33598j = typedArray.getString(index);
                            lc9Var.f33597i = 7;
                            break;
                        } else {
                            lc9Var.f33597i = typedArray.getInt(index, lc9Var.f33597i);
                            break;
                        }
                    case 6:
                        lc9Var.f33599k = typedArray.getFloat(index, lc9Var.f33599k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            lc9Var.f33600l = typedArray.getDimension(index, lc9Var.f33600l);
                            break;
                        } else {
                            lc9Var.f33600l = typedArray.getFloat(index, lc9Var.f33600l);
                            break;
                        }
                    case 8:
                        lc9Var.f33603o = typedArray.getInt(index, lc9Var.f33603o);
                        break;
                    case 9:
                        lc9Var.f33604p = typedArray.getFloat(index, lc9Var.f33604p);
                        break;
                    case 10:
                        lc9Var.f33605q = typedArray.getDimension(index, lc9Var.f33605q);
                        break;
                    case 11:
                        lc9Var.f33606r = typedArray.getFloat(index, lc9Var.f33606r);
                        break;
                    case 12:
                        lc9Var.f33608t = typedArray.getFloat(index, lc9Var.f33608t);
                        break;
                    case 13:
                        lc9Var.f33609u = typedArray.getFloat(index, lc9Var.f33609u);
                        break;
                    case 14:
                        lc9Var.f33607s = typedArray.getFloat(index, lc9Var.f33607s);
                        break;
                    case 15:
                        lc9Var.f33610v = typedArray.getFloat(index, lc9Var.f33610v);
                        break;
                    case 16:
                        lc9Var.f33611w = typedArray.getFloat(index, lc9Var.f33611w);
                        break;
                    case 17:
                        lc9Var.f33612x = typedArray.getDimension(index, lc9Var.f33612x);
                        break;
                    case 18:
                        lc9Var.f33613y = typedArray.getDimension(index, lc9Var.f33613y);
                        break;
                    case 19:
                        lc9Var.f33614z = typedArray.getDimension(index, lc9Var.f33614z);
                        break;
                    case 20:
                        lc9Var.f33602n = typedArray.getFloat(index, lc9Var.f33602n);
                        break;
                    case 21:
                        lc9Var.f33601m = typedArray.getFloat(index, lc9Var.f33601m) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f33615a.get(index));
                        break;
                }
            }
        }
    }

    public lc9() {
        this.f26658d = 4;
        this.f26659e = new HashMap();
    }

    /* renamed from: Y */
    public void m36939Y(HashMap map) {
        uxi uxiVar;
        uxi uxiVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C2004a c2004a = (C2004a) this.f26659e.get(str.substring(7));
                if (c2004a != null && c2004a.m5641d() == C2004a.a.FLOAT_TYPE && (uxiVar = (uxi) map.get(str)) != null) {
                    uxiVar.m38731e(this.f26655a, this.f33597i, this.f33598j, this.f33603o, this.f33599k, this.f33600l, this.f33601m, c2004a.m5642e(), c2004a);
                }
            } else {
                float fM36940Z = m36940Z(str);
                if (!Float.isNaN(fM36940Z) && (uxiVar2 = (uxi) map.get(str)) != null) {
                    uxiVar2.m38730d(this.f26655a, this.f33597i, this.f33598j, this.f33603o, this.f33599k, this.f33600l, this.f33601m, fM36940Z);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: Z */
    public float m36940Z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
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
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f33608t;
            case 1:
                return this.f33609u;
            case 2:
                return this.f33612x;
            case 3:
                return this.f33613y;
            case 4:
                return this.f33614z;
            case 5:
                return this.f33602n;
            case 6:
                return this.f33610v;
            case 7:
                return this.f33611w;
            case '\b':
                return this.f33606r;
            case '\t':
                return this.f33605q;
            case '\n':
                return this.f33607s;
            case 11:
                return this.f33604p;
            case '\f':
                return this.f33600l;
            case '\r':
                return this.f33601m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(str);
                return Float.NaN;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p001o.hc9
    /* renamed from: a */
    public void mo24787a(HashMap map) {
        k75.m35108g("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            v0g v0gVar = (v0g) map.get(str);
            if (v0gVar != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
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
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = TokenParser.CR;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        v0gVar.mo31331c(this.f26655a, this.f33608t);
                        break;
                    case 1:
                        v0gVar.mo31331c(this.f26655a, this.f33609u);
                        break;
                    case 2:
                        v0gVar.mo31331c(this.f26655a, this.f33612x);
                        break;
                    case 3:
                        v0gVar.mo31331c(this.f26655a, this.f33613y);
                        break;
                    case 4:
                        v0gVar.mo31331c(this.f26655a, this.f33614z);
                        break;
                    case 5:
                        v0gVar.mo31331c(this.f26655a, this.f33602n);
                        break;
                    case 6:
                        v0gVar.mo31331c(this.f26655a, this.f33610v);
                        break;
                    case 7:
                        v0gVar.mo31331c(this.f26655a, this.f33611w);
                        break;
                    case '\b':
                        v0gVar.mo31331c(this.f26655a, this.f33606r);
                        break;
                    case '\t':
                        v0gVar.mo31331c(this.f26655a, this.f33605q);
                        break;
                    case '\n':
                        v0gVar.mo31331c(this.f26655a, this.f33607s);
                        break;
                    case 11:
                        v0gVar.mo31331c(this.f26655a, this.f33604p);
                        break;
                    case '\f':
                        v0gVar.mo31331c(this.f26655a, this.f33600l);
                        break;
                    case '\r':
                        v0gVar.mo31331c(this.f26655a, this.f33601m);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(str);
                            break;
                        }
                }
            }
        }
    }

    @Override // p001o.hc9
    /* renamed from: b */
    public hc9 clone() {
        return new lc9().mo24789c(this);
    }

    @Override // p001o.hc9
    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        super.mo24789c(hc9Var);
        lc9 lc9Var = (lc9) hc9Var;
        this.f33595g = lc9Var.f33595g;
        this.f33596h = lc9Var.f33596h;
        this.f33597i = lc9Var.f33597i;
        this.f33598j = lc9Var.f33598j;
        this.f33599k = lc9Var.f33599k;
        this.f33600l = lc9Var.f33600l;
        this.f33601m = lc9Var.f33601m;
        this.f33602n = lc9Var.f33602n;
        this.f33603o = lc9Var.f33603o;
        this.f33604p = lc9Var.f33604p;
        this.f33605q = lc9Var.f33605q;
        this.f33606r = lc9Var.f33606r;
        this.f33607s = lc9Var.f33607s;
        this.f33608t = lc9Var.f33608t;
        this.f33609u = lc9Var.f33609u;
        this.f33610v = lc9Var.f33610v;
        this.f33611w = lc9Var.f33611w;
        this.f33612x = lc9Var.f33612x;
        this.f33613y = lc9Var.f33613y;
        this.f33614z = lc9Var.f33614z;
        return this;
    }

    @Override // p001o.hc9
    /* renamed from: d */
    public void mo26461d(HashSet hashSet) {
        if (!Float.isNaN(this.f33604p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f33605q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f33606r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f33608t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f33609u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f33610v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f33611w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f33607s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f33612x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f33613y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f33614z)) {
            hashSet.add("translationZ");
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
        C15057a.m36942b(this, context.obtainStyledAttributes(attributeSet, mbe.KeyCycle));
    }
}
