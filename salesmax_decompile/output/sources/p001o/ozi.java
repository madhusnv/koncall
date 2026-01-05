package p001o;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ozi extends tlh {

    /* renamed from: o.ozi$a */
    public static class C15921a extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setAlpha(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$b */
    public static class C15922b extends ozi {

        /* renamed from: l */
        public String f39119l;

        /* renamed from: m */
        public SparseArray f39120m;

        /* renamed from: n */
        public SparseArray f39121n = new SparseArray();

        /* renamed from: o */
        public float[] f39122o;

        public C15922b(String str, SparseArray sparseArray) {
            this.f39119l = str.split(",")[1];
            this.f39120m = sparseArray;
        }

        @Override // p001o.tlh
        /* renamed from: b */
        public void mo42827b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // p001o.tlh
        /* renamed from: e */
        public void mo42828e(int i) {
            int size = this.f39120m.size();
            int iM5645h = ((C2004a) this.f39120m.valueAt(0)).m5645h();
            double[] dArr = new double[size];
            int i2 = iM5645h + 2;
            this.f39122o = new float[i2];
            this.f47399g = new float[iM5645h];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f39120m.keyAt(i3);
                C2004a c2004a = (C2004a) this.f39120m.valueAt(i3);
                float[] fArr = (float[]) this.f39121n.valueAt(i3);
                dArr[i3] = iKeyAt * 0.01d;
                c2004a.m5643f(this.f39122o);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f39122o.length) {
                        dArr2[i3][i4] = r7[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iM5645h] = fArr[0];
                dArr3[iM5645h + 1] = fArr[1];
            }
            this.f47393a = rd4.m46542a(i, dArr, dArr2);
        }

        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f47393a.mo19475e(f, this.f39122o);
            float[] fArr = this.f39122o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f47401i;
            if (Float.isNaN(this.f47402j)) {
                float fM35396a = kc9Var.m35396a(view, this.f39119l, 0);
                this.f47402j = fM35396a;
                if (Float.isNaN(fM35396a)) {
                    this.f47402j = 0.0f;
                }
            }
            float f4 = (float) ((this.f47402j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.f47402j = f4;
            this.f47401i = j;
            float fM50175a = m50175a(f4);
            this.f47400h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f47399g;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f47400h;
                float f5 = this.f39122o[i];
                this.f47400h = z | (((double) f5) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                fArr2[i] = (f5 * fM50175a) + f3;
                i++;
            }
            zh4.m59402b((C2004a) this.f39120m.valueAt(0), view, this.f47399g);
            if (f2 != 0.0f) {
                this.f47400h = true;
            }
            return this.f47400h;
        }

        /* renamed from: j */
        public void m42829j(int i, C2004a c2004a, float f, int i2, float f2) {
            this.f39120m.append(i, c2004a);
            this.f39121n.append(i, new float[]{f, f2});
            this.f47394b = Math.max(this.f47394b, i2);
        }
    }

    /* renamed from: o.ozi$c */
    public static class C15923c extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setElevation(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$d */
    public static class C15924d extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            return this.f47400h;
        }

        /* renamed from: j */
        public boolean m42830j(View view, kc9 kc9Var, float f, long j, double d, double d2) {
            view.setRotation(m42825f(f, j, view, kc9Var) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$e */
    public static class C15925e extends ozi {

        /* renamed from: l */
        public boolean f39123l = false;

        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m42825f(f, j, view, kc9Var));
            } else {
                if (this.f39123l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f39123l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m42825f(f, j, view, kc9Var)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$f */
    public static class C15926f extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setRotation(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$g */
    public static class C15927g extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setRotationX(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$h */
    public static class C15928h extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setRotationY(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$i */
    public static class C15929i extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setScaleX(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$j */
    public static class C15930j extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setScaleY(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$k */
    public static class C15931k extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setTranslationX(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$l */
    public static class C15932l extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setTranslationY(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: o.ozi$m */
    public static class C15933m extends ozi {
        @Override // p001o.ozi
        /* renamed from: i */
        public boolean mo42826i(View view, float f, long j, kc9 kc9Var) {
            view.setTranslationZ(m42825f(f, j, view, kc9Var));
            return this.f47400h;
        }
    }

    /* renamed from: g */
    public static ozi m42823g(String str, SparseArray sparseArray) {
        return new C15922b(str, sparseArray);
    }

    /* renamed from: h */
    public static ozi m42824h(String str, long j) {
        ozi c15927g;
        str.hashCode();
        switch (str) {
            case "rotationX":
                c15927g = new C15927g();
                break;
            case "rotationY":
                c15927g = new C15928h();
                break;
            case "translationX":
                c15927g = new C15931k();
                break;
            case "translationY":
                c15927g = new C15932l();
                break;
            case "translationZ":
                c15927g = new C15933m();
                break;
            case "progress":
                c15927g = new C15925e();
                break;
            case "scaleX":
                c15927g = new C15929i();
                break;
            case "scaleY":
                c15927g = new C15930j();
                break;
            case "rotation":
                c15927g = new C15926f();
                break;
            case "elevation":
                c15927g = new C15923c();
                break;
            case "transitionPathRotate":
                c15927g = new C15924d();
                break;
            case "alpha":
                c15927g = new C15921a();
                break;
            default:
                return null;
        }
        c15927g.m50176c(j);
        return c15927g;
    }

    /* renamed from: f */
    public float m42825f(float f, long j, View view, kc9 kc9Var) {
        this.f47393a.mo19475e(f, this.f47399g);
        float[] fArr = this.f47399g;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f47400h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f47402j)) {
            float fM35396a = kc9Var.m35396a(view, this.f47398f, 0);
            this.f47402j = fM35396a;
            if (Float.isNaN(fM35396a)) {
                this.f47402j = 0.0f;
            }
        }
        float f3 = (float) ((this.f47402j + (((j - this.f47401i) * 1.0E-9d) * f2)) % 1.0d);
        this.f47402j = f3;
        kc9Var.m35397b(view, this.f47398f, 0, f3);
        this.f47401i = j;
        float f4 = this.f47399g[0];
        float fM50175a = (m50175a(this.f47402j) * f4) + this.f47399g[2];
        this.f47400h = (f4 == 0.0f && f2 == 0.0f) ? false : true;
        return fM50175a;
    }

    /* renamed from: i */
    public abstract boolean mo42826i(View view, float f, long j, kc9 kc9Var);
}
