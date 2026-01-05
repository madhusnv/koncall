package p001o;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.C2004a;
import androidx.constraintlayout.widget.C2005b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.apache.http.message.TokenParser;
import p001o.hzi;

/* loaded from: classes2.dex */
public class fmb implements Comparable {
    public static String[] r0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: c */
    public int f23662c;
    public q26 h0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;

    /* renamed from: a */
    public float f23660a = 0.0f;

    /* renamed from: b */
    public int f23661b = 0;

    /* renamed from: d */
    public LinkedHashMap f23663d = new LinkedHashMap();

    /* renamed from: e */
    public int f23664e = 0;

    /* renamed from: f */
    public double[] f23665f = new double[18];

    /* renamed from: g */
    public double[] f23666g = new double[18];

    /* renamed from: h */
    public float f23667h = 1.0f;

    /* renamed from: q */
    public boolean f23668q = false;

    /* renamed from: s */
    public float f23669s = 0.0f;

    /* renamed from: x */
    public float f23670x = 0.0f;

    /* renamed from: y */
    public float f23671y = 0.0f;

    /* renamed from: H */
    public float f23653H = 1.0f;

    /* renamed from: L */
    public float f23654L = 1.0f;

    /* renamed from: M */
    public float f23655M = Float.NaN;

    /* renamed from: Q */
    public float f23656Q = Float.NaN;

    /* renamed from: X */
    public float f23657X = 0.0f;

    /* renamed from: Y */
    public float f23658Y = 0.0f;

    /* renamed from: Z */
    public float f23659Z = 0.0f;
    public int i0 = 0;
    public float o0 = Float.NaN;
    public float p0 = Float.NaN;
    public int q0 = -1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public void m27077a(HashMap map, int i) {
        for (String str : map.keySet()) {
            hzi hziVar = (hzi) map.get(str);
            if (hziVar != null) {
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
                        hziVar.mo31331c(i, Float.isNaN(this.f23671y) ? 0.0f : this.f23671y);
                        break;
                    case 1:
                        hziVar.mo31331c(i, Float.isNaN(this.f23660a) ? 0.0f : this.f23660a);
                        break;
                    case 2:
                        hziVar.mo31331c(i, Float.isNaN(this.f23657X) ? 0.0f : this.f23657X);
                        break;
                    case 3:
                        hziVar.mo31331c(i, Float.isNaN(this.f23658Y) ? 0.0f : this.f23658Y);
                        break;
                    case 4:
                        hziVar.mo31331c(i, Float.isNaN(this.f23659Z) ? 0.0f : this.f23659Z);
                        break;
                    case 5:
                        hziVar.mo31331c(i, Float.isNaN(this.p0) ? 0.0f : this.p0);
                        break;
                    case 6:
                        hziVar.mo31331c(i, Float.isNaN(this.f23653H) ? 1.0f : this.f23653H);
                        break;
                    case 7:
                        hziVar.mo31331c(i, Float.isNaN(this.f23654L) ? 1.0f : this.f23654L);
                        break;
                    case '\b':
                        hziVar.mo31331c(i, Float.isNaN(this.f23655M) ? 0.0f : this.f23655M);
                        break;
                    case '\t':
                        hziVar.mo31331c(i, Float.isNaN(this.f23656Q) ? 0.0f : this.f23656Q);
                        break;
                    case '\n':
                        hziVar.mo31331c(i, Float.isNaN(this.f23670x) ? 0.0f : this.f23670x);
                        break;
                    case 11:
                        hziVar.mo31331c(i, Float.isNaN(this.f23669s) ? 0.0f : this.f23669s);
                        break;
                    case '\f':
                        hziVar.mo31331c(i, Float.isNaN(this.o0) ? 0.0f : this.o0);
                        break;
                    case '\r':
                        hziVar.mo31331c(i, Float.isNaN(this.f23667h) ? 1.0f : this.f23667h);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.f23663d.containsKey(str2)) {
                                C2004a c2004a = (C2004a) this.f23663d.get(str2);
                                if (hziVar instanceof hzi.C14132b) {
                                    ((hzi.C14132b) hziVar).m31333i(i, c2004a);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(" ViewSpline not a CustomSet frame = ");
                                    sb.append(i);
                                    sb.append(", value");
                                    sb.append(c2004a.m5642e());
                                    sb.append(hziVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("UNKNOWN spline ");
                            sb2.append(str);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: c */
    public void m27078c(View view) {
        this.f23662c = view.getVisibility();
        this.f23667h = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f23668q = false;
        this.f23669s = view.getElevation();
        this.f23670x = view.getRotation();
        this.f23671y = view.getRotationX();
        this.f23660a = view.getRotationY();
        this.f23653H = view.getScaleX();
        this.f23654L = view.getScaleY();
        this.f23655M = view.getPivotX();
        this.f23656Q = view.getPivotY();
        this.f23657X = view.getTranslationX();
        this.f23658Y = view.getTranslationY();
        this.f23659Z = view.getTranslationZ();
    }

    /* renamed from: d */
    public void m27079d(C2005b.a aVar) {
        C2005b.d dVar = aVar.f6969c;
        int i = dVar.f7056c;
        this.f23661b = i;
        int i2 = dVar.f7055b;
        this.f23662c = i2;
        this.f23667h = (i2 == 0 || i != 0) ? dVar.f7057d : 0.0f;
        C2005b.e eVar = aVar.f6972f;
        this.f23668q = eVar.f7072m;
        this.f23669s = eVar.f7073n;
        this.f23670x = eVar.f7061b;
        this.f23671y = eVar.f7062c;
        this.f23660a = eVar.f7063d;
        this.f23653H = eVar.f7064e;
        this.f23654L = eVar.f7065f;
        this.f23655M = eVar.f7066g;
        this.f23656Q = eVar.f7067h;
        this.f23657X = eVar.f7069j;
        this.f23658Y = eVar.f7070k;
        this.f23659Z = eVar.f7071l;
        this.h0 = q26.m44740c(aVar.f6970d.f7043d);
        C2005b.c cVar = aVar.f6970d;
        this.o0 = cVar.f7048i;
        this.i0 = cVar.f7045f;
        this.q0 = cVar.f7041b;
        this.p0 = aVar.f6969c.f7058e;
        for (String str : aVar.f6973g.keySet()) {
            C2004a c2004a = (C2004a) aVar.f6973g.get(str);
            if (c2004a.m5644g()) {
                this.f23663d.put(str, c2004a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(fmb fmbVar) {
        return Float.compare(this.j0, fmbVar.j0);
    }

    /* renamed from: g */
    public final boolean m27081g(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: h */
    public void m27082h(fmb fmbVar, HashSet hashSet) {
        if (m27081g(this.f23667h, fmbVar.f23667h)) {
            hashSet.add("alpha");
        }
        if (m27081g(this.f23669s, fmbVar.f23669s)) {
            hashSet.add("elevation");
        }
        int i = this.f23662c;
        int i2 = fmbVar.f23662c;
        if (i != i2 && this.f23661b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m27081g(this.f23670x, fmbVar.f23670x)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.o0) || !Float.isNaN(fmbVar.o0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.p0) || !Float.isNaN(fmbVar.p0)) {
            hashSet.add("progress");
        }
        if (m27081g(this.f23671y, fmbVar.f23671y)) {
            hashSet.add("rotationX");
        }
        if (m27081g(this.f23660a, fmbVar.f23660a)) {
            hashSet.add("rotationY");
        }
        if (m27081g(this.f23655M, fmbVar.f23655M)) {
            hashSet.add("transformPivotX");
        }
        if (m27081g(this.f23656Q, fmbVar.f23656Q)) {
            hashSet.add("transformPivotY");
        }
        if (m27081g(this.f23653H, fmbVar.f23653H)) {
            hashSet.add("scaleX");
        }
        if (m27081g(this.f23654L, fmbVar.f23654L)) {
            hashSet.add("scaleY");
        }
        if (m27081g(this.f23657X, fmbVar.f23657X)) {
            hashSet.add("translationX");
        }
        if (m27081g(this.f23658Y, fmbVar.f23658Y)) {
            hashSet.add("translationY");
        }
        if (m27081g(this.f23659Z, fmbVar.f23659Z)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: j */
    public void m27083j(float f, float f2, float f3, float f4) {
        this.k0 = f;
        this.l0 = f2;
        this.m0 = f3;
        this.n0 = f4;
    }

    /* renamed from: m */
    public void m27084m(Rect rect, C2005b c2005b, int i, int i2) {
        m27083j(rect.left, rect.top, rect.width(), rect.height());
        m27079d(c2005b.m5693z(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f23670x + 90.0f;
            this.f23670x = f;
            if (f > 180.0f) {
                this.f23670x = f - 360.0f;
                return;
            }
            return;
        }
        this.f23670x -= 90.0f;
    }

    /* renamed from: n */
    public void m27085n(View view) {
        m27083j(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m27078c(view);
    }
}
