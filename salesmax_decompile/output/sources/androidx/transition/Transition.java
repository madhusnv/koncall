package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.transition.Transition;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import p001o.dzh;
import p001o.hu3;
import p001o.kag;
import p001o.msi;
import p001o.p37;
import p001o.pvh;
import p001o.qvh;
import p001o.rla;
import p001o.svh;
import p001o.t16;
import p001o.tvh;
import p001o.vo0;
import p001o.wvi;
import p001o.y0g;
import p001o.z0g;

/* loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] A0 = new Animator[0];
    public static final int[] B0 = {2, 1, 3, 4};
    public static final PathMotion C0 = new C2506a();
    public static ThreadLocal D0 = new ThreadLocal();
    public ArrayList h0;
    public ArrayList i0;
    public InterfaceC2514i[] j0;
    public pvh t0;
    public AbstractC2511f u0;
    public vo0 v0;
    public long x0;
    public C2513h y0;
    public long z0;

    /* renamed from: a */
    public String f10352a = getClass().getName();

    /* renamed from: b */
    public long f10353b = -1;

    /* renamed from: c */
    public long f10354c = -1;

    /* renamed from: d */
    public TimeInterpolator f10355d = null;

    /* renamed from: e */
    public ArrayList f10356e = new ArrayList();

    /* renamed from: f */
    public ArrayList f10357f = new ArrayList();

    /* renamed from: g */
    public ArrayList f10358g = null;

    /* renamed from: h */
    public ArrayList f10359h = null;

    /* renamed from: q */
    public ArrayList f10360q = null;

    /* renamed from: s */
    public ArrayList f10361s = null;

    /* renamed from: x */
    public ArrayList f10362x = null;

    /* renamed from: y */
    public ArrayList f10363y = null;

    /* renamed from: H */
    public ArrayList f10345H = null;

    /* renamed from: L */
    public ArrayList f10346L = null;

    /* renamed from: M */
    public ArrayList f10347M = null;

    /* renamed from: Q */
    public tvh f10348Q = new tvh();

    /* renamed from: X */
    public tvh f10349X = new tvh();

    /* renamed from: Y */
    public TransitionSet f10350Y = null;

    /* renamed from: Z */
    public int[] f10351Z = B0;
    public boolean k0 = false;
    public ArrayList l0 = new ArrayList();
    public Animator[] m0 = A0;
    public int n0 = 0;
    public boolean o0 = false;
    public boolean p0 = false;
    public Transition q0 = null;
    public ArrayList r0 = null;
    public ArrayList s0 = new ArrayList();
    public PathMotion w0 = C0;

    /* renamed from: androidx.transition.Transition$a */
    public class C2506a extends PathMotion {
        @Override // androidx.transition.PathMotion
        /* renamed from: a */
        public Path mo9801a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    public class C2507b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ vo0 f10364a;

        public C2507b(vo0 vo0Var) {
            this.f10364a = vo0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10364a.remove(animator);
            Transition.this.l0.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.l0.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    public class C2508c extends AnimatorListenerAdapter {
        public C2508c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.m9887w();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    public static class C2509d {

        /* renamed from: a */
        public View f10367a;

        /* renamed from: b */
        public String f10368b;

        /* renamed from: c */
        public svh f10369c;

        /* renamed from: d */
        public WindowId f10370d;

        /* renamed from: e */
        public Transition f10371e;

        /* renamed from: f */
        public Animator f10372f;

        public C2509d(View view, String str, Transition transition, WindowId windowId, svh svhVar, Animator animator) {
            this.f10367a = view;
            this.f10368b = str;
            this.f10369c = svhVar;
            this.f10370d = windowId;
            this.f10371e = transition;
            this.f10372f = animator;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static class C2510e {
        /* renamed from: a */
        public static ArrayList m9891a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        /* renamed from: b */
        public static ArrayList m9892b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.Transition$f */
    public static abstract class AbstractC2511f {
        /* renamed from: a */
        public abstract Rect mo9893a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$g */
    public static class C2512g {
        /* renamed from: a */
        public static long m9894a(Animator animator) {
            return animator.getTotalDuration();
        }

        /* renamed from: b */
        public static void m9895b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* renamed from: androidx.transition.Transition$h */
    public class C2513h extends AbstractC2523b implements qvh, t16.InterfaceC16976r {

        /* renamed from: d */
        public boolean f10376d;

        /* renamed from: e */
        public boolean f10377e;

        /* renamed from: f */
        public y0g f10378f;

        /* renamed from: i */
        public Runnable f10381i;

        /* renamed from: a */
        public long f10373a = -1;

        /* renamed from: b */
        public ArrayList f10374b = null;

        /* renamed from: c */
        public ArrayList f10375c = null;

        /* renamed from: g */
        public hu3[] f10379g = null;

        /* renamed from: h */
        public final msi f10380h = new msi();

        public C2513h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m9897q(t16 t16Var, boolean z, float f, float f2) {
            if (z) {
                return;
            }
            if (!(f < 1.0f)) {
                Transition.this.g0(InterfaceC2515j.f10384b, false);
                return;
            }
            long jMo9899c = mo9899c();
            Transition transitionN0 = ((TransitionSet) Transition.this).N0(0);
            Transition transition = transitionN0.q0;
            transitionN0.q0 = null;
            Transition.this.t0(-1L, this.f10373a);
            Transition.this.t0(jMo9899c, -1L);
            this.f10373a = jMo9899c;
            Runnable runnable = this.f10381i;
            if (runnable != null) {
                runnable.run();
            }
            Transition.this.s0.clear();
            if (transition != null) {
                transition.g0(InterfaceC2515j.f10384b, true);
            }
        }

        @Override // p001o.qvh
        /* renamed from: a */
        public void mo9898a() {
            m9904o();
            this.f10378f.m57089s(mo9899c() + 1);
        }

        @Override // p001o.qvh
        /* renamed from: c */
        public long mo9899c() {
            return Transition.this.m9870Q();
        }

        @Override // p001o.qvh
        /* renamed from: f */
        public void mo9900f(long j) {
            if (this.f10378f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j == this.f10373a || !isReady()) {
                return;
            }
            if (!this.f10377e) {
                if (j != 0 || this.f10373a <= 0) {
                    long jMo9899c = mo9899c();
                    if (j == jMo9899c && this.f10373a < jMo9899c) {
                        j = jMo9899c + 1;
                    }
                } else {
                    j = -1;
                }
                long j2 = this.f10373a;
                if (j != j2) {
                    Transition.this.t0(j, j2);
                    this.f10373a = j;
                }
            }
            m9903n();
            this.f10380h.m39627a(AnimationUtils.currentAnimationTimeMillis(), j);
        }

        @Override // p001o.qvh
        /* renamed from: i */
        public void mo9901i(Runnable runnable) {
            this.f10381i = runnable;
            m9904o();
            this.f10378f.m57089s(0.0f);
        }

        @Override // p001o.qvh
        public boolean isReady() {
            return this.f10376d;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            this.f10377e = true;
        }

        @Override // p001o.t16.InterfaceC16976r
        /* renamed from: k */
        public void mo9902k(t16 t16Var, float f, float f2) {
            long jMax = Math.max(-1L, Math.min(mo9899c() + 1, Math.round(f)));
            Transition.this.t0(jMax, this.f10373a);
            this.f10373a = jMax;
            m9903n();
        }

        /* renamed from: n */
        public final void m9903n() {
            ArrayList arrayList = this.f10375c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f10375c.size();
            if (this.f10379g == null) {
                this.f10379g = new hu3[size];
            }
            hu3[] hu3VarArr = (hu3[]) this.f10375c.toArray(this.f10379g);
            this.f10379g = null;
            for (int i = 0; i < size; i++) {
                hu3VarArr[i].accept(this);
                hu3VarArr[i] = null;
            }
            this.f10379g = hu3VarArr;
        }

        /* renamed from: o */
        public final void m9904o() {
            if (this.f10378f != null) {
                return;
            }
            this.f10380h.m39627a(AnimationUtils.currentAnimationTimeMillis(), this.f10373a);
            this.f10378f = new y0g(new p37());
            z0g z0gVar = new z0g();
            z0gVar.m58630f(1.0f);
            z0gVar.m58632h(200.0f);
            this.f10378f.m57093w(z0gVar);
            this.f10378f.m49139m(this.f10373a);
            this.f10378f.m49130c(this);
            this.f10378f.m49140n(this.f10380h.m39628b());
            this.f10378f.m49135i(mo9899c() + 1);
            this.f10378f.m49136j(-1.0f);
            this.f10378f.m49137k(4.0f);
            this.f10378f.m49129b(new t16.InterfaceC16975q() { // from class: o.gvh
                @Override // p001o.t16.InterfaceC16975q
                /* renamed from: a */
                public final void mo29548a(t16 t16Var, boolean z, float f, float f2) {
                    this.f25843a.m9897q(t16Var, z, f, f2);
                }
            });
        }

        /* renamed from: p */
        public void m9905p() {
            long j = mo9899c() == 0 ? 1L : 0L;
            Transition.this.t0(j, this.f10373a);
            this.f10373a = j;
        }

        /* renamed from: r */
        public void m9906r() {
            this.f10376d = true;
            ArrayList arrayList = this.f10374b;
            if (arrayList != null) {
                this.f10374b = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((hu3) arrayList.get(i)).accept(this);
                }
            }
            m9903n();
        }
    }

    /* renamed from: androidx.transition.Transition$i */
    public interface InterfaceC2514i {
        /* renamed from: b */
        void mo9820b(Transition transition);

        /* renamed from: d */
        void mo9821d(Transition transition);

        /* renamed from: e */
        void mo9822e(Transition transition);

        /* renamed from: g */
        default void mo9907g(Transition transition, boolean z) {
            mo9823h(transition);
        }

        /* renamed from: h */
        void mo9823h(Transition transition);

        /* renamed from: j */
        void mo9824j(Transition transition);

        /* renamed from: l */
        default void mo9843l(Transition transition, boolean z) {
            mo9821d(transition);
        }
    }

    /* renamed from: androidx.transition.Transition$j */
    public interface InterfaceC2515j {

        /* renamed from: a */
        public static final InterfaceC2515j f10383a = new InterfaceC2515j() { // from class: o.hvh
            @Override // androidx.transition.Transition.InterfaceC2515j
            /* renamed from: e */
            public final void mo9914e(Transition.InterfaceC2514i interfaceC2514i, Transition transition, boolean z) {
                interfaceC2514i.mo9843l(transition, z);
            }
        };

        /* renamed from: b */
        public static final InterfaceC2515j f10384b = new InterfaceC2515j() { // from class: o.ivh
            @Override // androidx.transition.Transition.InterfaceC2515j
            /* renamed from: e */
            public final void mo9914e(Transition.InterfaceC2514i interfaceC2514i, Transition transition, boolean z) {
                interfaceC2514i.mo9907g(transition, z);
            }
        };

        /* renamed from: c */
        public static final InterfaceC2515j f10385c = new InterfaceC2515j() { // from class: o.jvh
            @Override // androidx.transition.Transition.InterfaceC2515j
            /* renamed from: e */
            public final void mo9914e(Transition.InterfaceC2514i interfaceC2514i, Transition transition, boolean z) {
                interfaceC2514i.mo9824j(transition);
            }
        };

        /* renamed from: d */
        public static final InterfaceC2515j f10386d = new InterfaceC2515j() { // from class: o.kvh
            @Override // androidx.transition.Transition.InterfaceC2515j
            /* renamed from: e */
            public final void mo9914e(Transition.InterfaceC2514i interfaceC2514i, Transition transition, boolean z) {
                interfaceC2514i.mo9822e(transition);
            }
        };

        /* renamed from: e */
        public static final InterfaceC2515j f10387e = new InterfaceC2515j() { // from class: o.lvh
            @Override // androidx.transition.Transition.InterfaceC2515j
            /* renamed from: e */
            public final void mo9914e(Transition.InterfaceC2514i interfaceC2514i, Transition transition, boolean z) {
                interfaceC2514i.mo9820b(transition);
            }
        };

        /* renamed from: e */
        void mo9914e(InterfaceC2514i interfaceC2514i, Transition transition, boolean z);
    }

    public Transition() {
    }

    /* renamed from: K */
    public static vo0 m9848K() {
        vo0 vo0Var = (vo0) D0.get();
        if (vo0Var != null) {
            return vo0Var;
        }
        vo0 vo0Var2 = new vo0();
        D0.set(vo0Var2);
        return vo0Var2;
    }

    /* renamed from: W */
    public static boolean m9849W(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: Y */
    public static boolean m9850Y(svh svhVar, svh svhVar2, String str) {
        Object obj = svhVar.f46008a.get(str);
        Object obj2 = svhVar2.f46008a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: h */
    public static void m9853h(tvh tvhVar, View view, svh svhVar) {
        tvhVar.f47966a.put(view, svhVar);
        int id = view.getId();
        if (id >= 0) {
            if (tvhVar.f47967b.indexOfKey(id) >= 0) {
                tvhVar.f47967b.put(id, null);
            } else {
                tvhVar.f47967b.put(id, view);
            }
        }
        String strM55096I = wvi.m55096I(view);
        if (strM55096I != null) {
            if (tvhVar.f47969d.containsKey(strM55096I)) {
                tvhVar.f47969d.put(strM55096I, null);
            } else {
                tvhVar.f47969d.put(strM55096I, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tvhVar.f47968c.m46933f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    tvhVar.f47968c.m46936i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tvhVar.f47968c.m46932c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    tvhVar.f47968c.m46936i(itemIdAtPosition, null);
                }
            }
        }
    }

    public static int[] h0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (OutcomeConstants.OUTCOME_ID.equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: i */
    public static boolean m9854i(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final ArrayList m9855A(ArrayList arrayList, View view, boolean z) {
        return view != null ? z ? C2510e.m9891a(arrayList, view) : C2510e.m9892b(arrayList, view) : arrayList;
    }

    public void A0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f10351Z = B0;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m9849W(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m9854i(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f10351Z = (int[]) iArr.clone();
    }

    /* renamed from: B */
    public long m9856B() {
        return this.f10354c;
    }

    public void B0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.w0 = C0;
        } else {
            this.w0 = pathMotion;
        }
    }

    /* renamed from: C */
    public Rect m9857C() {
        AbstractC2511f abstractC2511f = this.u0;
        if (abstractC2511f == null) {
            return null;
        }
        return abstractC2511f.mo9893a(this);
    }

    public void C0(pvh pvhVar) {
        this.t0 = pvhVar;
    }

    /* renamed from: D */
    public AbstractC2511f m9858D() {
        return this.u0;
    }

    public Transition D0(long j) {
        this.f10353b = j;
        return this;
    }

    /* renamed from: E */
    public TimeInterpolator m9859E() {
        return this.f10355d;
    }

    public void E0() {
        if (this.n0 == 0) {
            g0(InterfaceC2515j.f10383a, false);
            this.p0 = false;
        }
        this.n0++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.i0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.h0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (p001o.svh) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public svh m9860F(View view, boolean z) {
        TransitionSet transitionSet = this.f10350Y;
        if (transitionSet != null) {
            return transitionSet.m9860F(view, z);
        }
        ArrayList arrayList = z ? this.h0 : this.i0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            svh svhVar = (svh) arrayList.get(i);
            if (svhVar == null) {
                return null;
            }
            if (svhVar.f46009b == view) {
                break;
            }
            i++;
        }
    }

    public String F0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f10354c != -1) {
            sb.append("dur(");
            sb.append(this.f10354c);
            sb.append(") ");
        }
        if (this.f10353b != -1) {
            sb.append("dly(");
            sb.append(this.f10353b);
            sb.append(") ");
        }
        if (this.f10355d != null) {
            sb.append("interp(");
            sb.append(this.f10355d);
            sb.append(") ");
        }
        if (this.f10356e.size() > 0 || this.f10357f.size() > 0) {
            sb.append("tgts(");
            if (this.f10356e.size() > 0) {
                for (int i = 0; i < this.f10356e.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f10356e.get(i));
                }
            }
            if (this.f10357f.size() > 0) {
                for (int i2 = 0; i2 < this.f10357f.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f10357f.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: G */
    public String m9861G() {
        return this.f10352a;
    }

    /* renamed from: H */
    public PathMotion m9862H() {
        return this.w0;
    }

    /* renamed from: I */
    public pvh m9863I() {
        return this.t0;
    }

    /* renamed from: J */
    public final Transition m9864J() {
        TransitionSet transitionSet = this.f10350Y;
        return transitionSet != null ? transitionSet.m9864J() : this;
    }

    /* renamed from: L */
    public long m9865L() {
        return this.f10353b;
    }

    /* renamed from: M */
    public List m9866M() {
        return this.f10356e;
    }

    /* renamed from: N */
    public List m9867N() {
        return this.f10358g;
    }

    /* renamed from: O */
    public List m9868O() {
        return this.f10359h;
    }

    /* renamed from: P */
    public List m9869P() {
        return this.f10357f;
    }

    /* renamed from: Q */
    public final long m9870Q() {
        return this.x0;
    }

    /* renamed from: R */
    public String[] mo9805R() {
        return null;
    }

    /* renamed from: S */
    public svh m9871S(View view, boolean z) {
        TransitionSet transitionSet = this.f10350Y;
        if (transitionSet != null) {
            return transitionSet.m9871S(view, z);
        }
        return (svh) (z ? this.f10348Q : this.f10349X).f47966a.get(view);
    }

    /* renamed from: T */
    public boolean mo9872T() {
        return !this.l0.isEmpty();
    }

    /* renamed from: U */
    public boolean mo9806U() {
        return false;
    }

    /* renamed from: V */
    public boolean mo9873V(svh svhVar, svh svhVar2) {
        if (svhVar == null || svhVar2 == null) {
            return false;
        }
        String[] strArrMo9805R = mo9805R();
        if (strArrMo9805R == null) {
            Iterator it = svhVar.f46008a.keySet().iterator();
            while (it.hasNext()) {
                if (m9850Y(svhVar, svhVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo9805R) {
            if (!m9850Y(svhVar, svhVar2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: X */
    public boolean m9874X(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f10360q;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f10361s;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f10362x;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f10362x.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f10363y != null && wvi.m55096I(view) != null && this.f10363y.contains(wvi.m55096I(view))) {
            return false;
        }
        if ((this.f10356e.size() == 0 && this.f10357f.size() == 0 && (((arrayList = this.f10359h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f10358g) == null || arrayList2.isEmpty()))) || this.f10356e.contains(Integer.valueOf(id)) || this.f10357f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f10358g;
        if (arrayList6 != null && arrayList6.contains(wvi.m55096I(view))) {
            return true;
        }
        if (this.f10359h != null) {
            for (int i2 = 0; i2 < this.f10359h.size(); i2++) {
                if (((Class) this.f10359h.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Z */
    public final void m9875Z(vo0 vo0Var, vo0 vo0Var2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && m9874X(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && m9874X(view)) {
                svh svhVar = (svh) vo0Var.get(view2);
                svh svhVar2 = (svh) vo0Var2.get(view);
                if (svhVar != null && svhVar2 != null) {
                    this.h0.add(svhVar);
                    this.i0.add(svhVar2);
                    vo0Var.remove(view2);
                    vo0Var2.remove(view);
                }
            }
        }
    }

    public final void a0(vo0 vo0Var, vo0 vo0Var2) {
        svh svhVar;
        for (int size = vo0Var.size() - 1; size >= 0; size--) {
            View view = (View) vo0Var.m36227g(size);
            if (view != null && m9874X(view) && (svhVar = (svh) vo0Var2.remove(view)) != null && m9874X(svhVar.f46009b)) {
                this.h0.add((svh) vo0Var.mo32670k(size));
                this.i0.add(svhVar);
            }
        }
    }

    public final void b0(vo0 vo0Var, vo0 vo0Var2, rla rlaVar, rla rlaVar2) {
        View view;
        int iM46940m = rlaVar.m46940m();
        for (int i = 0; i < iM46940m; i++) {
            View view2 = (View) rlaVar.m46941n(i);
            if (view2 != null && m9874X(view2) && (view = (View) rlaVar2.m46932c(rlaVar.m46935h(i))) != null && m9874X(view)) {
                svh svhVar = (svh) vo0Var.get(view2);
                svh svhVar2 = (svh) vo0Var2.get(view);
                if (svhVar != null && svhVar2 != null) {
                    this.h0.add(svhVar);
                    this.i0.add(svhVar2);
                    vo0Var.remove(view2);
                    vo0Var2.remove(view);
                }
            }
        }
    }

    /* renamed from: c */
    public Transition mo9876c(InterfaceC2514i interfaceC2514i) {
        if (this.r0 == null) {
            this.r0 = new ArrayList();
        }
        this.r0.add(interfaceC2514i);
        return this;
    }

    public final void c0(vo0 vo0Var, vo0 vo0Var2, vo0 vo0Var3, vo0 vo0Var4) {
        View view;
        int size = vo0Var3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) vo0Var3.m36228o(i);
            if (view2 != null && m9874X(view2) && (view = (View) vo0Var4.get(vo0Var3.m36227g(i))) != null && m9874X(view)) {
                svh svhVar = (svh) vo0Var.get(view2);
                svh svhVar2 = (svh) vo0Var2.get(view);
                if (svhVar != null && svhVar2 != null) {
                    this.h0.add(svhVar);
                    this.i0.add(svhVar2);
                    vo0Var.remove(view2);
                    vo0Var2.remove(view);
                }
            }
        }
    }

    public void cancel() {
        int size = this.l0.size();
        Animator[] animatorArr = (Animator[]) this.l0.toArray(this.m0);
        this.m0 = A0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.m0 = animatorArr;
        g0(InterfaceC2515j.f10385c, false);
    }

    public final void e0(tvh tvhVar, tvh tvhVar2) {
        vo0 vo0Var = new vo0(tvhVar.f47966a);
        vo0 vo0Var2 = new vo0(tvhVar2.f47966a);
        int i = 0;
        while (true) {
            int[] iArr = this.f10351Z;
            if (i >= iArr.length) {
                m9878g(vo0Var, vo0Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                a0(vo0Var, vo0Var2);
            } else if (i2 == 2) {
                c0(vo0Var, vo0Var2, tvhVar.f47969d, tvhVar2.f47969d);
            } else if (i2 == 3) {
                m9875Z(vo0Var, vo0Var2, tvhVar.f47967b, tvhVar2.f47967b);
            } else if (i2 == 4) {
                b0(vo0Var, vo0Var2, tvhVar.f47968c, tvhVar2.f47968c);
            }
            i++;
        }
    }

    /* renamed from: f */
    public Transition mo9877f(View view) {
        this.f10357f.add(view);
        return this;
    }

    public final void f0(Transition transition, InterfaceC2515j interfaceC2515j, boolean z) {
        Transition transition2 = this.q0;
        if (transition2 != null) {
            transition2.f0(transition, interfaceC2515j, z);
        }
        ArrayList arrayList = this.r0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.r0.size();
        InterfaceC2514i[] interfaceC2514iArr = this.j0;
        if (interfaceC2514iArr == null) {
            interfaceC2514iArr = new InterfaceC2514i[size];
        }
        this.j0 = null;
        InterfaceC2514i[] interfaceC2514iArr2 = (InterfaceC2514i[]) this.r0.toArray(interfaceC2514iArr);
        for (int i = 0; i < size; i++) {
            interfaceC2515j.mo9914e(interfaceC2514iArr2[i], transition, z);
            interfaceC2514iArr2[i] = null;
        }
        this.j0 = interfaceC2514iArr2;
    }

    /* renamed from: g */
    public final void m9878g(vo0 vo0Var, vo0 vo0Var2) {
        for (int i = 0; i < vo0Var.size(); i++) {
            svh svhVar = (svh) vo0Var.m36228o(i);
            if (m9874X(svhVar.f46009b)) {
                this.h0.add(svhVar);
                this.i0.add(null);
            }
        }
        for (int i2 = 0; i2 < vo0Var2.size(); i2++) {
            svh svhVar2 = (svh) vo0Var2.m36228o(i2);
            if (m9874X(svhVar2.f46009b)) {
                this.i0.add(svhVar2);
                this.h0.add(null);
            }
        }
    }

    public void g0(InterfaceC2515j interfaceC2515j, boolean z) {
        f0(this, interfaceC2515j, z);
    }

    public void i0(View view) {
        if (this.p0) {
            return;
        }
        int size = this.l0.size();
        Animator[] animatorArr = (Animator[]) this.l0.toArray(this.m0);
        this.m0 = A0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.m0 = animatorArr;
        g0(InterfaceC2515j.f10386d, false);
        this.o0 = true;
    }

    /* renamed from: j */
    public void m9879j(Animator animator) {
        if (animator == null) {
            m9887w();
            return;
        }
        if (m9856B() >= 0) {
            animator.setDuration(m9856B());
        }
        if (m9865L() >= 0) {
            animator.setStartDelay(m9865L() + animator.getStartDelay());
        }
        if (m9859E() != null) {
            animator.setInterpolator(m9859E());
        }
        animator.addListener(new C2508c());
        animator.start();
    }

    /* renamed from: k */
    public abstract void mo9807k(svh svhVar);

    /* renamed from: l */
    public final void m9880l(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f10360q;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f10361s;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f10362x;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.f10362x.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    svh svhVar = new svh(view);
                    if (z) {
                        mo9808n(svhVar);
                    } else {
                        mo9807k(svhVar);
                    }
                    svhVar.f46010c.add(this);
                    mo9881m(svhVar);
                    if (z) {
                        m9853h(this.f10348Q, view, svhVar);
                    } else {
                        m9853h(this.f10349X, view, svhVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f10345H;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f10346L;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f10347M;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.f10347M.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m9880l(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void l0(ViewGroup viewGroup) {
        C2509d c2509d;
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        e0(this.f10348Q, this.f10349X);
        vo0 vo0VarM9848K = m9848K();
        int size = vo0VarM9848K.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) vo0VarM9848K.m36227g(i);
            if (animator != null && (c2509d = (C2509d) vo0VarM9848K.get(animator)) != null && c2509d.f10367a != null && windowId.equals(c2509d.f10370d)) {
                svh svhVar = c2509d.f10369c;
                View view = c2509d.f10367a;
                svh svhVarM9871S = m9871S(view, true);
                svh svhVarM9860F = m9860F(view, true);
                if (svhVarM9871S == null && svhVarM9860F == null) {
                    svhVarM9860F = (svh) this.f10349X.f47966a.get(view);
                }
                if (!(svhVarM9871S == null && svhVarM9860F == null) && c2509d.f10371e.mo9873V(svhVar, svhVarM9860F)) {
                    Transition transition = c2509d.f10371e;
                    if (transition.m9864J().y0 != null) {
                        animator.cancel();
                        transition.l0.remove(animator);
                        vo0VarM9848K.remove(animator);
                        if (transition.l0.size() == 0) {
                            transition.g0(InterfaceC2515j.f10385c, false);
                            if (!transition.p0) {
                                transition.p0 = true;
                                transition.g0(InterfaceC2515j.f10384b, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        vo0VarM9848K.remove(animator);
                    }
                }
            }
        }
        mo9885u(viewGroup, this.f10348Q, this.f10349X, this.h0, this.i0);
        if (this.y0 == null) {
            r0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            m0();
            this.y0.m9905p();
            this.y0.m9906r();
        }
    }

    /* renamed from: m */
    public void mo9881m(svh svhVar) {
        String[] strArrMo16336b;
        if (this.t0 == null || svhVar.f46008a.isEmpty() || (strArrMo16336b = this.t0.mo16336b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= strArrMo16336b.length) {
                z = true;
                break;
            } else if (!svhVar.f46008a.containsKey(strArrMo16336b[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.t0.mo16335a(svhVar);
    }

    public void m0() {
        vo0 vo0VarM9848K = m9848K();
        this.x0 = 0L;
        for (int i = 0; i < this.s0.size(); i++) {
            Animator animator = (Animator) this.s0.get(i);
            C2509d c2509d = (C2509d) vo0VarM9848K.get(animator);
            if (animator != null && c2509d != null) {
                if (m9856B() >= 0) {
                    c2509d.f10372f.setDuration(m9856B());
                }
                if (m9865L() >= 0) {
                    c2509d.f10372f.setStartDelay(m9865L() + c2509d.f10372f.getStartDelay());
                }
                if (m9859E() != null) {
                    c2509d.f10372f.setInterpolator(m9859E());
                }
                this.l0.add(animator);
                this.x0 = Math.max(this.x0, C2512g.m9894a(animator));
            }
        }
        this.s0.clear();
    }

    /* renamed from: n */
    public abstract void mo9808n(svh svhVar);

    public Transition n0(InterfaceC2514i interfaceC2514i) {
        Transition transition;
        ArrayList arrayList = this.r0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC2514i) && (transition = this.q0) != null) {
            transition.n0(interfaceC2514i);
        }
        if (this.r0.size() == 0) {
            this.r0 = null;
        }
        return this;
    }

    public Transition o0(View view) {
        this.f10357f.remove(view);
        return this;
    }

    /* renamed from: p */
    public void m9882p(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        vo0 vo0Var;
        m9883q(z);
        if ((this.f10356e.size() > 0 || this.f10357f.size() > 0) && (((arrayList = this.f10358g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f10359h) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f10356e.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f10356e.get(i)).intValue());
                if (viewFindViewById != null) {
                    svh svhVar = new svh(viewFindViewById);
                    if (z) {
                        mo9808n(svhVar);
                    } else {
                        mo9807k(svhVar);
                    }
                    svhVar.f46010c.add(this);
                    mo9881m(svhVar);
                    if (z) {
                        m9853h(this.f10348Q, viewFindViewById, svhVar);
                    } else {
                        m9853h(this.f10349X, viewFindViewById, svhVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f10357f.size(); i2++) {
                View view = (View) this.f10357f.get(i2);
                svh svhVar2 = new svh(view);
                if (z) {
                    mo9808n(svhVar2);
                } else {
                    mo9807k(svhVar2);
                }
                svhVar2.f46010c.add(this);
                mo9881m(svhVar2);
                if (z) {
                    m9853h(this.f10348Q, view, svhVar2);
                } else {
                    m9853h(this.f10349X, view, svhVar2);
                }
            }
        } else {
            m9880l(viewGroup, z);
        }
        if (z || (vo0Var = this.v0) == null) {
            return;
        }
        int size = vo0Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.f10348Q.f47969d.remove((String) this.v0.m36227g(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f10348Q.f47969d.put((String) this.v0.m36228o(i4), view2);
            }
        }
    }

    public void p0(View view) {
        if (this.o0) {
            if (!this.p0) {
                int size = this.l0.size();
                Animator[] animatorArr = (Animator[]) this.l0.toArray(this.m0);
                this.m0 = A0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.m0 = animatorArr;
                g0(InterfaceC2515j.f10387e, false);
            }
            this.o0 = false;
        }
    }

    /* renamed from: q */
    public void m9883q(boolean z) {
        if (z) {
            this.f10348Q.f47966a.clear();
            this.f10348Q.f47967b.clear();
            this.f10348Q.f47968c.clear();
        } else {
            this.f10349X.f47966a.clear();
            this.f10349X.f47967b.clear();
            this.f10349X.f47968c.clear();
        }
    }

    public final void q0(Animator animator, vo0 vo0Var) {
        if (animator != null) {
            animator.addListener(new C2507b(vo0Var));
            m9879j(animator);
        }
    }

    public void r0() {
        E0();
        vo0 vo0VarM9848K = m9848K();
        Iterator it = this.s0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (vo0VarM9848K.containsKey(animator)) {
                E0();
                q0(animator, vo0VarM9848K);
            }
        }
        this.s0.clear();
        m9887w();
    }

    @Override // 
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.s0 = new ArrayList();
            transition.f10348Q = new tvh();
            transition.f10349X = new tvh();
            transition.h0 = null;
            transition.i0 = null;
            transition.y0 = null;
            transition.q0 = this;
            transition.r0 = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void s0(boolean z) {
        this.k0 = z;
    }

    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        return null;
    }

    public void t0(long j, long j2) {
        long jM9870Q = m9870Q();
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > jM9870Q && j <= jM9870Q)) {
            this.p0 = false;
            g0(InterfaceC2515j.f10383a, z);
        }
        int size = this.l0.size();
        Animator[] animatorArr = (Animator[]) this.l0.toArray(this.m0);
        this.m0 = A0;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C2512g.m9895b(animator, Math.min(Math.max(0L, j), C2512g.m9894a(animator)));
        }
        this.m0 = animatorArr;
        if ((j <= jM9870Q || j2 > jM9870Q) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > jM9870Q) {
            this.p0 = true;
        }
        g0(InterfaceC2515j.f10384b, z);
    }

    public String toString() {
        return F0("");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9885u(ViewGroup viewGroup, tvh tvhVar, tvh tvhVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo9809t;
        int i;
        int i2;
        View view;
        Animator animator;
        svh svhVar;
        Animator animator2;
        vo0 vo0VarM9848K = m9848K();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = m9864J().y0 != null;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            svh svhVar2 = (svh) arrayList.get(i3);
            svh svhVar3 = (svh) arrayList2.get(i3);
            if (svhVar2 != null && !svhVar2.f46010c.contains(this)) {
                svhVar2 = null;
            }
            if (svhVar3 != null && !svhVar3.f46010c.contains(this)) {
                svhVar3 = null;
            }
            if (svhVar2 != null || svhVar3 != null) {
                if (!(svhVar2 == null || svhVar3 == null || mo9873V(svhVar2, svhVar3)) || (animatorMo9809t = mo9809t(viewGroup, svhVar2, svhVar3)) == null) {
                    i = size;
                    i2 = i3;
                } else {
                    if (svhVar3 != null) {
                        view = svhVar3.f46009b;
                        String[] strArrMo9805R = mo9805R();
                        if (strArrMo9805R != null && strArrMo9805R.length > 0) {
                            svh svhVar4 = new svh(view);
                            i = size;
                            svh svhVar5 = (svh) tvhVar2.f47966a.get(view);
                            if (svhVar5 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo9805R.length) {
                                    Map map = svhVar4.f46008a;
                                    int i5 = i3;
                                    String str = strArrMo9805R[i4];
                                    map.put(str, svhVar5.f46008a.get(str));
                                    i4++;
                                    i3 = i5;
                                    strArrMo9805R = strArrMo9805R;
                                }
                            }
                            i2 = i3;
                            int size2 = vo0VarM9848K.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    svhVar = svhVar4;
                                    animator2 = animatorMo9809t;
                                    break;
                                }
                                C2509d c2509d = (C2509d) vo0VarM9848K.get((Animator) vo0VarM9848K.m36227g(i6));
                                if (c2509d.f10369c != null && c2509d.f10367a == view && c2509d.f10368b.equals(m9861G()) && c2509d.f10369c.equals(svhVar4)) {
                                    svhVar = svhVar4;
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = animatorMo9809t;
                            svhVar = null;
                        }
                        animator = animator2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = svhVar2.f46009b;
                        animator = animatorMo9809t;
                        svhVar = null;
                    }
                    if (animator != null) {
                        pvh pvhVar = this.t0;
                        if (pvhVar != null) {
                            long jMo18502c = pvhVar.mo18502c(viewGroup, this, svhVar2, svhVar3);
                            sparseIntArray.put(this.s0.size(), (int) jMo18502c);
                            jMin = Math.min(jMo18502c, jMin);
                        }
                        long j = jMin;
                        C2509d c2509d2 = new C2509d(view, m9861G(), this, viewGroup.getWindowId(), svhVar, animator);
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            animator = animatorSet;
                        }
                        vo0VarM9848K.put(animator, c2509d2);
                        this.s0.add(animator);
                        jMin = j;
                    }
                }
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C2509d c2509d3 = (C2509d) vo0VarM9848K.get((Animator) this.s0.get(sparseIntArray.keyAt(i7)));
                c2509d3.f10372f.setStartDelay((sparseIntArray.valueAt(i7) - jMin) + c2509d3.f10372f.getStartDelay());
            }
        }
    }

    /* renamed from: v */
    public qvh m9886v() {
        C2513h c2513h = new C2513h();
        this.y0 = c2513h;
        mo9876c(c2513h);
        return this.y0;
    }

    /* renamed from: w */
    public void m9887w() {
        int i = this.n0 - 1;
        this.n0 = i;
        if (i == 0) {
            g0(InterfaceC2515j.f10384b, false);
            for (int i2 = 0; i2 < this.f10348Q.f47968c.m46940m(); i2++) {
                View view = (View) this.f10348Q.f47968c.m46941n(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.f10349X.f47968c.m46940m(); i3++) {
                View view2 = (View) this.f10349X.f47968c.m46941n(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.p0 = true;
        }
    }

    public Transition w0(long j) {
        this.f10354c = j;
        return this;
    }

    /* renamed from: x */
    public Transition mo9888x(View view, boolean z) {
        this.f10361s = m9855A(this.f10361s, view, z);
        return this;
    }

    public void x0(AbstractC2511f abstractC2511f) {
        this.u0 = abstractC2511f;
    }

    /* renamed from: y */
    public Transition mo9889y(Class cls, boolean z) {
        this.f10362x = m9890z(this.f10362x, cls, z);
        return this;
    }

    /* renamed from: z */
    public final ArrayList m9890z(ArrayList arrayList, Class cls, boolean z) {
        return cls != null ? z ? C2510e.m9891a(arrayList, cls) : C2510e.m9892b(arrayList, cls) : arrayList;
    }

    public Transition z0(TimeInterpolator timeInterpolator) {
        this.f10355d = timeInterpolator;
        return this;
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31773c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM23978g = dzh.m23978g(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM23978g >= 0) {
            w0(jM23978g);
        }
        long jM23978g2 = dzh.m23978g(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM23978g2 > 0) {
            D0(jM23978g2);
        }
        int iM23979h = dzh.m23979h(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM23979h > 0) {
            z0(AnimationUtils.loadInterpolator(context, iM23979h));
        }
        String strM23980i = dzh.m23980i(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM23980i != null) {
            A0(h0(strM23980i));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
