package p001o;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2004a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class uxi extends mc9 {

    /* renamed from: o.uxi$a */
    public static class C17470a extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setAlpha(m38727a(f));
        }
    }

    /* renamed from: o.uxi$b */
    public static class C17471b extends uxi {

        /* renamed from: h */
        public float[] f49621h = new float[1];

        /* renamed from: i */
        public C2004a f49622i;

        @Override // p001o.mc9
        /* renamed from: c */
        public void mo38729c(Object obj) {
            this.f49622i = (C2004a) obj;
        }

        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f49621h[0] = m38727a(f);
            zh4.m59402b(this.f49622i, view, this.f49621h);
        }
    }

    /* renamed from: o.uxi$c */
    public static class C17472c extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setElevation(m38727a(f));
        }
    }

    /* renamed from: o.uxi$d */
    public static class C17473d extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
        }

        /* renamed from: k */
        public void m52122k(View view, float f, double d, double d2) {
            view.setRotation(m38727a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: o.uxi$e */
    public static class C17474e extends uxi {

        /* renamed from: h */
        public boolean f49623h = false;

        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m38727a(f));
                return;
            }
            if (this.f49623h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f49623h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m38727a(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: o.uxi$f */
    public static class C17475f extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setRotation(m38727a(f));
        }
    }

    /* renamed from: o.uxi$g */
    public static class C17476g extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setRotationX(m38727a(f));
        }
    }

    /* renamed from: o.uxi$h */
    public static class C17477h extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setRotationY(m38727a(f));
        }
    }

    /* renamed from: o.uxi$i */
    public static class C17478i extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setScaleX(m38727a(f));
        }
    }

    /* renamed from: o.uxi$j */
    public static class C17479j extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setScaleY(m38727a(f));
        }
    }

    /* renamed from: o.uxi$k */
    public static class C17480k extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setTranslationX(m38727a(f));
        }
    }

    /* renamed from: o.uxi$l */
    public static class C17481l extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setTranslationY(m38727a(f));
        }
    }

    /* renamed from: o.uxi$m */
    public static class C17482m extends uxi {
        @Override // p001o.uxi
        /* renamed from: j */
        public void mo52121j(View view, float f) {
            view.setTranslationZ(m38727a(f));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: i */
    public static uxi m52120i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C17471b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C17476g();
            case 1:
                return new C17477h();
            case 2:
                return new C17480k();
            case 3:
                return new C17481l();
            case 4:
                return new C17482m();
            case 5:
                return new C17474e();
            case 6:
                return new C17478i();
            case 7:
                return new C17479j();
            case '\b':
                return new C17470a();
            case '\t':
                return new C17475f();
            case '\n':
                return new C17472c();
            case 11:
                return new C17473d();
            case '\f':
                return new C17470a();
            case '\r':
                return new C17470a();
            default:
                return null;
        }
    }

    /* renamed from: j */
    public abstract void mo52121j(View view, float f);
}
