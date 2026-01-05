package p001o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.AbstractC2145n;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import p001o.f32;
import p001o.h8c;
import p001o.i8c;
import p001o.w6c;

/* loaded from: classes2.dex */
public abstract class ewi extends ge1 {

    /* renamed from: X */
    public static final int f22257X = 8;

    /* renamed from: H */
    public xca f22260H;

    /* renamed from: L */
    public boolean f22261L;

    /* renamed from: M */
    public boolean f22262M;

    /* renamed from: b */
    public final Runnable f22263b;

    /* renamed from: c */
    public boolean f22264c;

    /* renamed from: d */
    public boolean f22265d;

    /* renamed from: e */
    public i4j[] f22266e;

    /* renamed from: f */
    public final View f22267f;

    /* renamed from: g */
    public f32 f22268g;

    /* renamed from: h */
    public boolean f22269h;

    /* renamed from: q */
    public Choreographer f22270q;

    /* renamed from: s */
    public final Choreographer.FrameCallback f22271s;

    /* renamed from: x */
    public Handler f22272x;

    /* renamed from: y */
    public ewi f22273y;

    /* renamed from: Q */
    public static int f22256Q = Build.VERSION.SDK_INT;

    /* renamed from: Y */
    public static final boolean f22258Y = true;

    /* renamed from: Z */
    public static final ua4 f22259Z = new C13266a();
    public static final ua4 h0 = new C13267b();
    public static final ua4 i0 = new C13268c();
    public static final ua4 j0 = new C13269d();
    public static final f32.AbstractC13318a k0 = new C13270e();
    public static final ReferenceQueue l0 = new ReferenceQueue();
    public static final View.OnAttachStateChangeListener m0 = new ViewOnAttachStateChangeListenerC13271f();

    /* renamed from: o.ewi$a */
    public class C13266a implements ua4 {
        @Override // p001o.ua4
        /* renamed from: a */
        public i4j mo25696a(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            return new C13278m(ewiVar, i, referenceQueue).m25715f();
        }
    }

    /* renamed from: o.ewi$b */
    public class C13267b implements ua4 {
        @Override // p001o.ua4
        /* renamed from: a */
        public i4j mo25696a(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            return new C13276k(ewiVar, i, referenceQueue).m25708e();
        }
    }

    /* renamed from: o.ewi$c */
    public class C13268c implements ua4 {
        @Override // p001o.ua4
        /* renamed from: a */
        public i4j mo25696a(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            return new C13277l(ewiVar, i, referenceQueue).m25711e();
        }
    }

    /* renamed from: o.ewi$d */
    public class C13269d implements ua4 {
        @Override // p001o.ua4
        /* renamed from: a */
        public i4j mo25696a(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            return new C13275j(ewiVar, i, referenceQueue).m25705f();
        }
    }

    /* renamed from: o.ewi$e */
    public class C13270e extends f32.AbstractC13318a {
        @Override // p001o.f32.AbstractC13318a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo25697a(Object obj, Object obj2, int i, Object obj3) {
            tq.m50332a(obj);
            m25698b(null, (ewi) obj2, i, (Void) obj3);
        }

        /* renamed from: b */
        public void m25698b(bcc bccVar, ewi ewiVar, int i, Void r4) {
            if (i == 1 || i == 2 || i == 3) {
                throw null;
            }
        }
    }

    /* renamed from: o.ewi$f */
    public class ViewOnAttachStateChangeListenerC13271f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ewi.m25686x(view).f22263b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: o.ewi$g */
    public class RunnableC13272g implements Runnable {
        public RunnableC13272g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ewi.this.f22264c = false;
            }
            ewi.m25673P();
            if (ewi.this.f22267f.isAttachedToWindow()) {
                ewi.this.m25695s();
            } else {
                ewi.this.f22267f.removeOnAttachStateChangeListener(ewi.m0);
                ewi.this.f22267f.addOnAttachStateChangeListener(ewi.m0);
            }
        }
    }

    /* renamed from: o.ewi$h */
    public class ChoreographerFrameCallbackC13273h implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC13273h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            ewi.this.f22263b.run();
        }
    }

    /* renamed from: o.ewi$i */
    public static class C13274i {

        /* renamed from: a */
        public final String[][] f22276a;

        /* renamed from: b */
        public final int[][] f22277b;

        /* renamed from: c */
        public final int[][] f22278c;

        public C13274i(int i) {
            this.f22276a = new String[i][];
            this.f22277b = new int[i][];
            this.f22278c = new int[i][];
        }

        /* renamed from: a */
        public void m25699a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f22276a[i] = strArr;
            this.f22277b[i] = iArr;
            this.f22278c[i] = iArr2;
        }
    }

    /* renamed from: o.ewi$j */
    public static class C13275j implements n9c, q8c {

        /* renamed from: a */
        public final i4j f22279a;

        /* renamed from: b */
        public WeakReference f22280b = null;

        public C13275j(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            this.f22279a = new i4j(ewiVar, i, this, referenceQueue);
        }

        @Override // p001o.q8c
        /* renamed from: c */
        public void mo25702c(xca xcaVar) {
            xca xcaVarM25704e = m25704e();
            AbstractC2145n abstractC2145n = (AbstractC2145n) this.f22279a.m31569b();
            if (abstractC2145n != null) {
                if (xcaVarM25704e != null) {
                    abstractC2145n.removeObserver(this);
                }
                if (xcaVar != null) {
                    abstractC2145n.observe(xcaVar, this);
                }
            }
            if (xcaVar != null) {
                this.f22280b = new WeakReference(xcaVar);
            }
        }

        @Override // p001o.q8c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25701b(AbstractC2145n abstractC2145n) {
            xca xcaVarM25704e = m25704e();
            if (xcaVarM25704e != null) {
                abstractC2145n.observe(xcaVarM25704e, this);
            }
        }

        /* renamed from: e */
        public final xca m25704e() {
            WeakReference weakReference = this.f22280b;
            if (weakReference == null) {
                return null;
            }
            return (xca) weakReference.get();
        }

        /* renamed from: f */
        public i4j m25705f() {
            return this.f22279a;
        }

        @Override // p001o.q8c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25700a(AbstractC2145n abstractC2145n) {
            abstractC2145n.removeObserver(this);
        }

        @Override // p001o.n9c
        public void onChanged(Object obj) {
            ewi ewiVarM31568a = this.f22279a.m31568a();
            if (ewiVarM31568a != null) {
                i4j i4jVar = this.f22279a;
                ewiVarM31568a.m25690C(i4jVar.f28085b, i4jVar.m31569b(), 0);
            }
        }
    }

    /* renamed from: o.ewi$k */
    public static class C13276k extends h8c.AbstractC13895a implements q8c {

        /* renamed from: a */
        public final i4j f22281a;

        public C13276k(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            this.f22281a = new i4j(ewiVar, i, this, referenceQueue);
        }

        @Override // p001o.q8c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo25700a(Object obj) {
            tq.m50332a(obj);
            m25709f(null);
        }

        @Override // p001o.q8c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo25701b(Object obj) {
            tq.m50332a(obj);
            m25707d(null);
        }

        @Override // p001o.q8c
        /* renamed from: c */
        public void mo25702c(xca xcaVar) {
        }

        /* renamed from: d */
        public void m25707d(h8c h8cVar) {
            h8cVar.H2(this);
        }

        /* renamed from: e */
        public i4j m25708e() {
            return this.f22281a;
        }

        /* renamed from: f */
        public void m25709f(h8c h8cVar) {
            h8cVar.p1(this);
        }
    }

    /* renamed from: o.ewi$l */
    public static class C13277l extends i8c.AbstractC14213a implements q8c {

        /* renamed from: a */
        public final i4j f22282a;

        public C13277l(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            this.f22282a = new i4j(ewiVar, i, this, referenceQueue);
        }

        @Override // p001o.q8c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo25700a(Object obj) {
            tq.m50332a(obj);
            m25712f(null);
        }

        @Override // p001o.q8c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo25701b(Object obj) {
            tq.m50332a(obj);
            m25710d(null);
        }

        @Override // p001o.q8c
        /* renamed from: c */
        public void mo25702c(xca xcaVar) {
        }

        /* renamed from: d */
        public void m25710d(i8c i8cVar) {
            i8cVar.m31737p(this);
        }

        /* renamed from: e */
        public i4j m25711e() {
            return this.f22282a;
        }

        /* renamed from: f */
        public void m25712f(i8c i8cVar) {
            i8cVar.m31736j(this);
        }
    }

    /* renamed from: o.ewi$m */
    public static class C13278m extends w6c.AbstractC17784a implements q8c {

        /* renamed from: a */
        public final i4j f22283a;

        public C13278m(ewi ewiVar, int i, ReferenceQueue referenceQueue) {
            this.f22283a = new i4j(ewiVar, i, this, referenceQueue);
        }

        @Override // p001o.q8c
        /* renamed from: c */
        public void mo25702c(xca xcaVar) {
        }

        @Override // p001o.w6c.AbstractC17784a
        /* renamed from: d */
        public void mo25713d(w6c w6cVar, int i) {
            ewi ewiVarM31568a = this.f22283a.m31568a();
            if (ewiVarM31568a != null && ((w6c) this.f22283a.m31569b()) == w6cVar) {
                ewiVarM31568a.m25690C(this.f22283a.f28085b, w6cVar, i);
            }
        }

        @Override // p001o.q8c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo25701b(w6c w6cVar) {
            w6cVar.mo28506b(this);
        }

        /* renamed from: f */
        public i4j m25715f() {
            return this.f22283a;
        }

        @Override // p001o.q8c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25700a(w6c w6cVar) {
            w6cVar.mo28507e(this);
        }
    }

    public ewi(yt4 yt4Var, View view, int i) {
        this.f22263b = new RunnableC13272g();
        this.f22264c = false;
        this.f22265d = false;
        this.f22266e = new i4j[i];
        this.f22267f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f22258Y) {
            this.f22270q = Choreographer.getInstance();
            this.f22271s = new ChoreographerFrameCallbackC13273h();
        } else {
            this.f22271s = null;
            this.f22272x = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: A */
    public static Object m25667A(List list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: F */
    public static ewi m25668F(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        m25682o(obj);
        return zt4.m59875i(layoutInflater, i, viewGroup, z, null);
    }

    /* renamed from: H */
    public static boolean m25669H(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m25670I(yt4 yt4Var, View view, Object[] objArr, C13274i c13274i, SparseIntArray sparseIntArray, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int iM25684t;
        int id;
        int i5;
        int iM25672N;
        if (m25686x(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        int i6 = 1;
        if (z && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i7 = iLastIndexOf + 1;
                if (m25669H(str, i7)) {
                    iM25672N = m25672N(str, i7);
                    if (objArr[iM25672N] == null) {
                        objArr[iM25672N] = view;
                    }
                    if (c13274i == null) {
                        iM25672N = -1;
                    }
                    z2 = true;
                } else {
                    iM25672N = -1;
                    z2 = false;
                }
                i = iM25672N;
            }
        } else if (str == null || !str.startsWith("binding_")) {
            i = -1;
            z2 = false;
        } else {
            int iM25672N2 = m25672N(str, f22257X);
            if (objArr[iM25672N2] == null) {
                objArr[iM25672N2] = view;
            }
            if (c13274i == null) {
                iM25672N2 = -1;
            }
            i = iM25672N2;
            z2 = true;
        }
        if (!z2 && (id = view.getId()) > 0 && sparseIntArray != null && (i5 = sparseIntArray.get(id, -1)) >= 0 && objArr[i5] == null) {
            objArr[i5] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i8 = 0;
            int i9 = 0;
            while (i8 < childCount) {
                View childAt = viewGroup.getChildAt(i8);
                if (i < 0 || !(childAt.getTag() instanceof String)) {
                    i2 = i8;
                    i3 = i9;
                    i4 = 0;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (str2.endsWith("_0") && str2.startsWith("layout") && str2.indexOf(47) > 0 && (iM25684t = m25684t(str2, i9, c13274i, i)) >= 0) {
                        int i10 = iM25684t + 1;
                        int i11 = c13274i.f22277b[i][iM25684t];
                        int i12 = c13274i.f22278c[i][iM25684t];
                        int iM25685u = m25685u(viewGroup, i8);
                        if (iM25685u == i8) {
                            objArr[i11] = zt4.m59869c(yt4Var, childAt, i12);
                            i2 = i8;
                            i4 = i6;
                            i3 = i10;
                        } else {
                            int i13 = (iM25685u - i8) + i6;
                            View[] viewArr = new View[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                viewArr[i14] = viewGroup.getChildAt(i8 + i14);
                            }
                            objArr[i11] = zt4.m59870d(yt4Var, viewArr, i12);
                            i2 = i8 + (i13 - 1);
                            i3 = i10;
                            i4 = 1;
                        }
                    }
                }
                if (i4 == 0) {
                    m25670I(yt4Var, childAt, objArr, c13274i, sparseIntArray, false);
                }
                int i15 = i3;
                i6 = 1;
                i8 = i2 + 1;
                i9 = i15;
            }
        }
    }

    /* renamed from: L */
    public static Object[] m25671L(yt4 yt4Var, View view, int i, C13274i c13274i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m25670I(yt4Var, view, objArr, c13274i, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: N */
    public static int m25672N(String str, int i) {
        int iCharAt = 0;
        while (i < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        return iCharAt;
    }

    /* renamed from: P */
    public static void m25673P() {
        while (true) {
            Reference referencePoll = l0.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof i4j) {
                ((i4j) referencePoll).m31572e();
            }
        }
    }

    /* renamed from: U */
    public static int m25674U(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: V */
    public static long m25675V(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* renamed from: W */
    public static boolean m25676W(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: o */
    public static yt4 m25682o(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: r */
    public static void m25683r(ewi ewiVar) {
        ewiVar.m25694q();
    }

    /* renamed from: t */
    public static int m25684t(String str, int i, C13274i c13274i, int i2) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = c13274i.f22276a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: u */
    public static int m25685u(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m25669H(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: x */
    public static ewi m25686x(View view) {
        if (view != null) {
            return (ewi) view.getTag(w8e.dataBinding);
        }
        return null;
    }

    /* renamed from: y */
    public static int m25687y() {
        return f22256Q;
    }

    /* renamed from: z */
    public static int m25688z(View view, int i) {
        return view.getContext().getColor(i);
    }

    /* renamed from: B */
    public View m25689B() {
        return this.f22267f;
    }

    /* renamed from: C */
    public void m25690C(int i, Object obj, int i2) {
        if (this.f22261L || this.f22262M || !mo16292M(i, obj, i2)) {
            return;
        }
        m25692R();
    }

    /* renamed from: E */
    public abstract boolean mo16290E();

    /* renamed from: G */
    public abstract void mo16291G();

    /* renamed from: M */
    public abstract boolean mo16292M(int i, Object obj, int i2);

    /* renamed from: Q */
    public void m25691Q(int i, Object obj, ua4 ua4Var) {
        if (obj == null) {
            return;
        }
        i4j i4jVarMo25696a = this.f22266e[i];
        if (i4jVarMo25696a == null) {
            i4jVarMo25696a = ua4Var.mo25696a(this, i, l0);
            this.f22266e[i] = i4jVarMo25696a;
            xca xcaVar = this.f22260H;
            if (xcaVar != null) {
                i4jVarMo25696a.m31570c(xcaVar);
            }
        }
        i4jVarMo25696a.m31571d(obj);
    }

    /* renamed from: R */
    public void m25692R() {
        ewi ewiVar = this.f22273y;
        if (ewiVar != null) {
            ewiVar.m25692R();
            return;
        }
        xca xcaVar = this.f22260H;
        if (xcaVar == null || xcaVar.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
            synchronized (this) {
                if (this.f22264c) {
                    return;
                }
                this.f22264c = true;
                if (f22258Y) {
                    this.f22270q.postFrameCallback(this.f22271s);
                } else {
                    this.f22272x.post(this.f22263b);
                }
            }
        }
    }

    /* renamed from: Z */
    public void m25693Z(ewi ewiVar) {
        if (ewiVar != null) {
            ewiVar.f22273y = this;
        }
    }

    public void a0(View view) {
        view.setTag(w8e.dataBinding, this);
    }

    public abstract boolean b0(int i, Object obj);

    public void c0() {
        for (i4j i4jVar : this.f22266e) {
            if (i4jVar != null) {
                i4jVar.m31572e();
            }
        }
    }

    public boolean d0(int i) {
        i4j i4jVar = this.f22266e[i];
        if (i4jVar != null) {
            return i4jVar.m31572e();
        }
        return false;
    }

    public boolean e0(int i, Object obj, ua4 ua4Var) {
        if (obj == null) {
            return d0(i);
        }
        i4j i4jVar = this.f22266e[i];
        if (i4jVar == null) {
            m25691Q(i, obj, ua4Var);
            return true;
        }
        if (i4jVar.m31569b() == obj) {
            return false;
        }
        d0(i);
        m25691Q(i, obj, ua4Var);
        return true;
    }

    public boolean g0(int i, w6c w6cVar) {
        return e0(i, w6cVar, f22259Z);
    }

    /* renamed from: p */
    public abstract void mo16295p();

    /* renamed from: q */
    public final void m25694q() {
        if (this.f22269h) {
            m25692R();
            return;
        }
        if (mo16290E()) {
            this.f22269h = true;
            this.f22265d = false;
            f32 f32Var = this.f22268g;
            if (f32Var != null) {
                f32Var.m26016f(this, 1, null);
                if (this.f22265d) {
                    this.f22268g.m26016f(this, 2, null);
                }
            }
            if (!this.f22265d) {
                mo16295p();
                f32 f32Var2 = this.f22268g;
                if (f32Var2 != null) {
                    f32Var2.m26016f(this, 3, null);
                }
            }
            this.f22269h = false;
        }
    }

    /* renamed from: s */
    public void m25695s() {
        ewi ewiVar = this.f22273y;
        if (ewiVar == null) {
            m25694q();
        } else {
            ewiVar.m25695s();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ewi(Object obj, View view, int i) {
        this((yt4) null, view, i);
        m25682o(obj);
    }
}
