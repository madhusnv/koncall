package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C1988a;
import androidx.constraintlayout.widget.C2004a;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001o.gmb;
import p001o.hc9;
import p001o.k75;
import p001o.kc9;
import p001o.mbe;
import p001o.q26;
import p001o.sc9;
import p001o.t8e;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* loaded from: classes2.dex */
public class C1990c {

    /* renamed from: a */
    public int f6719a;

    /* renamed from: e */
    public int f6723e;

    /* renamed from: f */
    public sc9 f6724f;

    /* renamed from: g */
    public C2005b.a f6725g;

    /* renamed from: j */
    public int f6728j;

    /* renamed from: k */
    public String f6729k;

    /* renamed from: o */
    public Context f6733o;

    /* renamed from: b */
    public int f6720b = -1;

    /* renamed from: c */
    public boolean f6721c = false;

    /* renamed from: d */
    public int f6722d = 0;

    /* renamed from: h */
    public int f6726h = -1;

    /* renamed from: i */
    public int f6727i = -1;

    /* renamed from: l */
    public int f6730l = 0;

    /* renamed from: m */
    public String f6731m = null;

    /* renamed from: n */
    public int f6732n = -1;

    /* renamed from: p */
    public int f6734p = -1;

    /* renamed from: q */
    public int f6735q = -1;

    /* renamed from: r */
    public int f6736r = -1;

    /* renamed from: s */
    public int f6737s = -1;

    /* renamed from: t */
    public int f6738t = -1;

    /* renamed from: u */
    public int f6739u = -1;

    /* renamed from: v */
    public int f6740v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.c$a */
    public class a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ q26 f6741a;

        public a(q26 q26Var) {
            this.f6741a = q26Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f6741a.mo20345a(f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.c$b */
    public static class b {

        /* renamed from: a */
        public final int f6743a;

        /* renamed from: b */
        public final int f6744b;

        /* renamed from: c */
        public long f6745c;

        /* renamed from: d */
        public gmb f6746d;

        /* renamed from: e */
        public int f6747e;

        /* renamed from: f */
        public int f6748f;

        /* renamed from: h */
        public C1991d f6750h;

        /* renamed from: i */
        public Interpolator f6751i;

        /* renamed from: k */
        public float f6753k;

        /* renamed from: l */
        public float f6754l;

        /* renamed from: m */
        public long f6755m;

        /* renamed from: o */
        public boolean f6757o;

        /* renamed from: g */
        public kc9 f6749g = new kc9();

        /* renamed from: j */
        public boolean f6752j = false;

        /* renamed from: n */
        public Rect f6756n = new Rect();

        public b(C1991d c1991d, gmb gmbVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f6757o = false;
            this.f6750h = c1991d;
            this.f6746d = gmbVar;
            this.f6747e = i;
            this.f6748f = i2;
            long jNanoTime = System.nanoTime();
            this.f6745c = jNanoTime;
            this.f6755m = jNanoTime;
            this.f6750h.m5550b(this);
            this.f6751i = interpolator;
            this.f6743a = i4;
            this.f6744b = i5;
            if (i3 == 3) {
                this.f6757o = true;
            }
            this.f6754l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            m5544a();
        }

        /* renamed from: a */
        public void m5544a() {
            if (this.f6752j) {
                m5546c();
            } else {
                m5545b();
            }
        }

        /* renamed from: b */
        public void m5545b() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f6755m;
            this.f6755m = jNanoTime;
            float f = this.f6753k + (((float) (j * 1.0E-6d)) * this.f6754l);
            this.f6753k = f;
            if (f >= 1.0f) {
                this.f6753k = 1.0f;
            }
            Interpolator interpolator = this.f6751i;
            float interpolation = interpolator == null ? this.f6753k : interpolator.getInterpolation(this.f6753k);
            gmb gmbVar = this.f6746d;
            boolean zM29086x = gmbVar.m29086x(gmbVar.f25477b, interpolation, jNanoTime, this.f6749g);
            if (this.f6753k >= 1.0f) {
                if (this.f6743a != -1) {
                    this.f6746d.m29084v().setTag(this.f6743a, Long.valueOf(System.nanoTime()));
                }
                if (this.f6744b != -1) {
                    this.f6746d.m29084v().setTag(this.f6744b, null);
                }
                if (!this.f6757o) {
                    this.f6750h.m5555g(this);
                }
            }
            if (this.f6753k < 1.0f || zM29086x) {
                this.f6750h.m5553e();
            }
        }

        /* renamed from: c */
        public void m5546c() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f6755m;
            this.f6755m = jNanoTime;
            float f = this.f6753k - (((float) (j * 1.0E-6d)) * this.f6754l);
            this.f6753k = f;
            if (f < 0.0f) {
                this.f6753k = 0.0f;
            }
            Interpolator interpolator = this.f6751i;
            float interpolation = interpolator == null ? this.f6753k : interpolator.getInterpolation(this.f6753k);
            gmb gmbVar = this.f6746d;
            boolean zM29086x = gmbVar.m29086x(gmbVar.f25477b, interpolation, jNanoTime, this.f6749g);
            if (this.f6753k <= 0.0f) {
                if (this.f6743a != -1) {
                    this.f6746d.m29084v().setTag(this.f6743a, Long.valueOf(System.nanoTime()));
                }
                if (this.f6744b != -1) {
                    this.f6746d.m29084v().setTag(this.f6744b, null);
                }
                this.f6750h.m5555g(this);
            }
            if (this.f6753k > 0.0f || zM29086x) {
                this.f6750h.m5553e();
            }
        }

        /* renamed from: d */
        public void m5547d(int i, float f, float f2) {
            if (i == 1) {
                if (this.f6752j) {
                    return;
                }
                m5548e(true);
            } else {
                if (i != 2) {
                    return;
                }
                this.f6746d.m29084v().getHitRect(this.f6756n);
                if (this.f6756n.contains((int) f, (int) f2) || this.f6752j) {
                    return;
                }
                m5548e(true);
            }
        }

        /* renamed from: e */
        public void m5548e(boolean z) {
            int i;
            this.f6752j = z;
            if (z && (i = this.f6748f) != -1) {
                this.f6754l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f6750h.m5553e();
            this.f6755m = System.nanoTime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1990c(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c;
        this.f6733o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                c = 65535;
                                break;
                            } else {
                                c = 2;
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c = 3;
                                break;
                            }
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        m5541l(context, xmlPullParser);
                    } else if (c == 1) {
                        this.f6724f = new sc9(context, xmlPullParser);
                    } else if (c == 2) {
                        this.f6725g = C2005b.m5662m(context, xmlPullParser);
                    } else if (c == 3 || c == 4) {
                        C2004a.m5637i(context, xmlPullParser, this.f6725g.f6973g);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(k75.m35102a());
                        sb.append(" unknown tag ");
                        sb.append(name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlPullParser.getLineNumber());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5531j(View[] viewArr) {
        if (this.f6734p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f6734p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f6735q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f6735q, null);
            }
        }
    }

    /* renamed from: b */
    public void m5532b(C1991d c1991d, MotionLayout motionLayout, View view) {
        gmb gmbVar = new gmb(view);
        gmbVar.m29055B(view);
        this.f6724f.m48185a(gmbVar);
        gmbVar.m29062I(motionLayout.getWidth(), motionLayout.getHeight(), this.f6726h, System.nanoTime());
        new b(c1991d, gmbVar, this.f6726h, this.f6727i, this.f6720b, m5536f(motionLayout.getContext()), this.f6734p, this.f6735q);
    }

    /* renamed from: c */
    public void m5533c(C1991d c1991d, MotionLayout motionLayout, int i, C2005b c2005b, final View... viewArr) {
        if (this.f6721c) {
            return;
        }
        int i2 = this.f6723e;
        if (i2 == 2) {
            m5532b(c1991d, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    C2005b c2005bO0 = motionLayout.o0(i3);
                    for (View view : viewArr) {
                        C2005b.a aVarM5690w = c2005bO0.m5690w(view.getId());
                        C2005b.a aVar = this.f6725g;
                        if (aVar != null) {
                            aVar.m5697d(aVarM5690w);
                            aVarM5690w.f6973g.putAll(this.f6725g.f6973g);
                        }
                    }
                }
            }
        }
        C2005b c2005b2 = new C2005b();
        c2005b2.m5683p(c2005b);
        for (View view2 : viewArr) {
            C2005b.a aVarM5690w2 = c2005b2.m5690w(view2.getId());
            C2005b.a aVar2 = this.f6725g;
            if (aVar2 != null) {
                aVar2.m5697d(aVarM5690w2);
                aVarM5690w2.f6973g.putAll(this.f6725g.f6973g);
            }
        }
        motionLayout.J0(i, c2005b2);
        motionLayout.J0(t8e.view_transition, c2005b);
        motionLayout.setState(t8e.view_transition, -1, -1);
        C1988a.b bVar = new C1988a.b(-1, motionLayout.q0, t8e.view_transition, i);
        for (View view3 : viewArr) {
            m5543n(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.D0(new Runnable() { // from class: o.pzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f41012a.m5531j(viewArr);
            }
        });
    }

    /* renamed from: d */
    public boolean m5534d(View view) {
        int i = this.f6736r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f6737s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    /* renamed from: e */
    public int m5535e() {
        return this.f6719a;
    }

    /* renamed from: f */
    public Interpolator m5536f(Context context) {
        int i = this.f6730l;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f6732n);
        }
        if (i == -1) {
            return new a(q26.m44740c(this.f6731m));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: g */
    public int m5537g() {
        return this.f6738t;
    }

    /* renamed from: h */
    public int m5538h() {
        return this.f6739u;
    }

    /* renamed from: i */
    public int m5539i() {
        return this.f6720b;
    }

    /* renamed from: k */
    public boolean m5540k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f6728j == -1 && this.f6729k == null) || !m5534d(view)) {
            return false;
        }
        if (view.getId() == this.f6728j) {
            return true;
        }
        return this.f6729k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).c0) != null && str.matches(this.f6729k);
    }

    /* renamed from: l */
    public final void m5541l(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == mbe.ViewTransition_android_id) {
                this.f6719a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6719a);
            } else if (index == mbe.ViewTransition_motionTarget) {
                if (MotionLayout.R1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6728j);
                    this.f6728j = resourceId;
                    if (resourceId == -1) {
                        this.f6729k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f6729k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f6728j = typedArrayObtainStyledAttributes.getResourceId(index, this.f6728j);
                }
            } else if (index == mbe.ViewTransition_onStateTransition) {
                this.f6720b = typedArrayObtainStyledAttributes.getInt(index, this.f6720b);
            } else if (index == mbe.ViewTransition_transitionDisable) {
                this.f6721c = typedArrayObtainStyledAttributes.getBoolean(index, this.f6721c);
            } else if (index == mbe.ViewTransition_pathMotionArc) {
                this.f6722d = typedArrayObtainStyledAttributes.getInt(index, this.f6722d);
            } else if (index == mbe.ViewTransition_duration) {
                this.f6726h = typedArrayObtainStyledAttributes.getInt(index, this.f6726h);
            } else if (index == mbe.ViewTransition_upDuration) {
                this.f6727i = typedArrayObtainStyledAttributes.getInt(index, this.f6727i);
            } else if (index == mbe.ViewTransition_viewTransitionMode) {
                this.f6723e = typedArrayObtainStyledAttributes.getInt(index, this.f6723e);
            } else if (index == mbe.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f6732n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f6730l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6731m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f6730l = -1;
                    } else {
                        this.f6732n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f6730l = -2;
                    }
                } else {
                    this.f6730l = typedArrayObtainStyledAttributes.getInteger(index, this.f6730l);
                }
            } else if (index == mbe.ViewTransition_setsTag) {
                this.f6734p = typedArrayObtainStyledAttributes.getResourceId(index, this.f6734p);
            } else if (index == mbe.ViewTransition_clearsTag) {
                this.f6735q = typedArrayObtainStyledAttributes.getResourceId(index, this.f6735q);
            } else if (index == mbe.ViewTransition_ifTagSet) {
                this.f6736r = typedArrayObtainStyledAttributes.getResourceId(index, this.f6736r);
            } else if (index == mbe.ViewTransition_ifTagNotSet) {
                this.f6737s = typedArrayObtainStyledAttributes.getResourceId(index, this.f6737s);
            } else if (index == mbe.ViewTransition_SharedValueId) {
                this.f6739u = typedArrayObtainStyledAttributes.getResourceId(index, this.f6739u);
            } else if (index == mbe.ViewTransition_SharedValue) {
                this.f6738t = typedArrayObtainStyledAttributes.getInteger(index, this.f6738t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public boolean m5542m(int i) {
        int i2 = this.f6720b;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* renamed from: n */
    public final void m5543n(C1988a.b bVar, View view) {
        int i = this.f6726h;
        if (i != -1) {
            bVar.m5488E(i);
        }
        bVar.m5491H(this.f6722d);
        bVar.m5489F(this.f6730l, this.f6731m, this.f6732n);
        int id = view.getId();
        sc9 sc9Var = this.f6724f;
        if (sc9Var != null) {
            ArrayList arrayListM48188d = sc9Var.m48188d(-1);
            sc9 sc9Var2 = new sc9();
            Iterator it = arrayListM48188d.iterator();
            while (it.hasNext()) {
                sc9Var2.m48187c(((hc9) it.next()).clone().m30226i(id));
            }
            bVar.m5492t(sc9Var2);
        }
    }

    public String toString() {
        return "ViewTransition(" + k75.m35104c(this.f6733o, this.f6719a) + ")";
    }
}
