package p001o;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class hzi extends v0g {

    /* renamed from: o.hzi$a */
    public static class C14131a extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setAlpha(m52202a(f));
        }
    }

    /* renamed from: o.hzi$b */
    public static class C14132b extends hzi {

        /* renamed from: f */
        public String f27861f;

        /* renamed from: g */
        public SparseArray f27862g;

        /* renamed from: h */
        public float[] f27863h;

        public C14132b(String str, SparseArray sparseArray) {
            this.f27861f = str.split(",")[1];
            this.f27862g = sparseArray;
        }

        @Override // p001o.v0g
        /* renamed from: c */
        public void mo31331c(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // p001o.v0g
        /* renamed from: e */
        public void mo31332e(int i) {
            int size = this.f27862g.size();
            int iM5645h = ((C2004a) this.f27862g.valueAt(0)).m5645h();
            double[] dArr = new double[size];
            this.f27863h = new float[iM5645h];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM5645h);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f27862g.keyAt(i2);
                C2004a c2004a = (C2004a) this.f27862g.valueAt(i2);
                dArr[i2] = iKeyAt * 0.01d;
                c2004a.m5643f(this.f27863h);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f27863h.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f49728a = rd4.m46542a(i, dArr, dArr2);
        }

        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f49728a.mo19475e(f, this.f27863h);
            zh4.m59402b((C2004a) this.f27862g.valueAt(0), view, this.f27863h);
        }

        /* renamed from: i */
        public void m31333i(int i, C2004a c2004a) {
            this.f27862g.append(i, c2004a);
        }
    }

    /* renamed from: o.hzi$c */
    public static class C14133c extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setElevation(m52202a(f));
        }
    }

    /* renamed from: o.hzi$d */
    public static class C14134d extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
        }

        /* renamed from: i */
        public void m31334i(View view, float f, double d, double d2) {
            view.setRotation(m52202a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: o.hzi$e */
    public static class C14135e extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setPivotX(m52202a(f));
        }
    }

    /* renamed from: o.hzi$f */
    public static class C14136f extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setPivotY(m52202a(f));
        }
    }

    /* renamed from: o.hzi$g */
    public static class C14137g extends hzi {

        /* renamed from: f */
        public boolean f27864f = false;

        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m52202a(f));
                return;
            }
            if (this.f27864f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f27864f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m52202a(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: o.hzi$h */
    public static class C14138h extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setRotation(m52202a(f));
        }
    }

    /* renamed from: o.hzi$i */
    public static class C14139i extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setRotationX(m52202a(f));
        }
    }

    /* renamed from: o.hzi$j */
    public static class C14140j extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setRotationY(m52202a(f));
        }
    }

    /* renamed from: o.hzi$k */
    public static class C14141k extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setScaleX(m52202a(f));
        }
    }

    /* renamed from: o.hzi$l */
    public static class C14142l extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setScaleY(m52202a(f));
        }
    }

    /* renamed from: o.hzi$m */
    public static class C14143m extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setTranslationX(m52202a(f));
        }
    }

    /* renamed from: o.hzi$n */
    public static class C14144n extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setTranslationY(m52202a(f));
        }
    }

    /* renamed from: o.hzi$o */
    public static class C14145o extends hzi {
        @Override // p001o.hzi
        /* renamed from: h */
        public void mo31330h(View view, float f) {
            view.setTranslationZ(m52202a(f));
        }
    }

    /* renamed from: f */
    public static hzi m31328f(String str, SparseArray sparseArray) {
        return new C14132b(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: g */
    public static hzi m31329g(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
        }
        return new C14131a();
    }

    /* renamed from: h */
    public abstract void mo31330h(View view, float f);
}
