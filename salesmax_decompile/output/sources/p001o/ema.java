package p001o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ema extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: H */
    public boolean f21878H;

    /* renamed from: L */
    public hp3 f21879L;

    /* renamed from: M */
    public int f21880M;

    /* renamed from: Q */
    public boolean f21881Q;

    /* renamed from: X */
    public boolean f21882X;

    /* renamed from: Y */
    public boolean f21883Y;

    /* renamed from: Z */
    public boolean f21884Z;

    /* renamed from: a */
    public final Matrix f21885a = new Matrix();

    /* renamed from: b */
    public ama f21886b;

    /* renamed from: c */
    public final pma f21887c;

    /* renamed from: d */
    public float f21888d;

    /* renamed from: e */
    public boolean f21889e;

    /* renamed from: f */
    public boolean f21890f;

    /* renamed from: g */
    public boolean f21891g;

    /* renamed from: h */
    public final ArrayList f21892h;
    public boolean h0;

    /* renamed from: q */
    public final ValueAnimator.AnimatorUpdateListener f21893q;

    /* renamed from: s */
    public kc8 f21894s;

    /* renamed from: x */
    public String f21895x;

    /* renamed from: y */
    public ib7 f21896y;

    /* renamed from: o.ema$a */
    public class C13218a implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ String f21897a;

        public C13218a(String str) {
            this.f21897a = str;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25312Y(this.f21897a);
        }
    }

    /* renamed from: o.ema$b */
    public class C13219b implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ String f21899a;

        /* renamed from: b */
        public final /* synthetic */ String f21900b;

        /* renamed from: c */
        public final /* synthetic */ boolean f21901c;

        public C13219b(String str, String str2, boolean z) {
            this.f21899a = str;
            this.f21900b = str2;
            this.f21901c = z;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25313Z(this.f21899a, this.f21900b, this.f21901c);
        }
    }

    /* renamed from: o.ema$c */
    public class C13220c implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ int f21903a;

        /* renamed from: b */
        public final /* synthetic */ int f21904b;

        public C13220c(int i, int i2) {
            this.f21903a = i;
            this.f21904b = i2;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25311X(this.f21903a, this.f21904b);
        }
    }

    /* renamed from: o.ema$d */
    public class C13221d implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ float f21906a;

        /* renamed from: b */
        public final /* synthetic */ float f21907b;

        public C13221d(float f, float f2) {
            this.f21906a = f;
            this.f21907b = f2;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.a0(this.f21906a, this.f21907b);
        }
    }

    /* renamed from: o.ema$e */
    public class C13222e implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ int f21909a;

        public C13222e(int i) {
            this.f21909a = i;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25304Q(this.f21909a);
        }
    }

    /* renamed from: o.ema$f */
    public class C13223f implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ float f21911a;

        public C13223f(float f) {
            this.f21911a = f;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.g0(this.f21911a);
        }
    }

    /* renamed from: o.ema$g */
    public class C13224g implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ yc9 f21913a;

        /* renamed from: b */
        public final /* synthetic */ Object f21914b;

        /* renamed from: c */
        public final /* synthetic */ qma f21915c;

        public C13224g(yc9 yc9Var, Object obj, qma qmaVar) {
            this.f21913a = yc9Var;
            this.f21914b = obj;
            this.f21915c = qmaVar;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25314c(this.f21913a, this.f21914b, this.f21915c);
        }
    }

    /* renamed from: o.ema$h */
    public class C13225h implements ValueAnimator.AnimatorUpdateListener {
        public C13225h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (ema.this.f21879L != null) {
                ema.this.f21879L.mo30181K(ema.this.f21887c.m43883j());
            }
        }
    }

    /* renamed from: o.ema$i */
    public class C13226i implements InterfaceC13234q {
        public C13226i() {
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25298K();
        }
    }

    /* renamed from: o.ema$j */
    public class C13227j implements InterfaceC13234q {
        public C13227j() {
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25300M();
        }
    }

    /* renamed from: o.ema$k */
    public class C13228k implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ int f21920a;

        public C13228k(int i) {
            this.f21920a = i;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.b0(this.f21920a);
        }
    }

    /* renamed from: o.ema$l */
    public class C13229l implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ float f21922a;

        public C13229l(float f) {
            this.f21922a = f;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.d0(this.f21922a);
        }
    }

    /* renamed from: o.ema$m */
    public class C13230m implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ int f21924a;

        public C13230m(int i) {
            this.f21924a = i;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25308U(this.f21924a);
        }
    }

    /* renamed from: o.ema$n */
    public class C13231n implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ float f21926a;

        public C13231n(float f) {
            this.f21926a = f;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25310W(this.f21926a);
        }
    }

    /* renamed from: o.ema$o */
    public class C13232o implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ String f21928a;

        public C13232o(String str) {
            this.f21928a = str;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.c0(this.f21928a);
        }
    }

    /* renamed from: o.ema$p */
    public class C13233p implements InterfaceC13234q {

        /* renamed from: a */
        public final /* synthetic */ String f21930a;

        public C13233p(String str) {
            this.f21930a = str;
        }

        @Override // p001o.ema.InterfaceC13234q
        /* renamed from: a */
        public void mo25338a(ama amaVar) {
            ema.this.m25309V(this.f21930a);
        }
    }

    /* renamed from: o.ema$q */
    public interface InterfaceC13234q {
        /* renamed from: a */
        void mo25338a(ama amaVar);
    }

    public ema() {
        pma pmaVar = new pma();
        this.f21887c = pmaVar;
        this.f21888d = 1.0f;
        this.f21889e = true;
        this.f21890f = false;
        this.f21891g = false;
        this.f21892h = new ArrayList();
        C13225h c13225h = new C13225h();
        this.f21893q = c13225h;
        this.f21880M = Constants.MAX_HOST_LENGTH;
        this.f21884Z = true;
        this.h0 = false;
        pmaVar.addUpdateListener(c13225h);
    }

    /* renamed from: A */
    public float m25288A() {
        return this.f21887c.m43883j();
    }

    /* renamed from: B */
    public int m25289B() {
        return this.f21887c.getRepeatCount();
    }

    /* renamed from: C */
    public int m25290C() {
        return this.f21887c.getRepeatMode();
    }

    /* renamed from: D */
    public float m25291D() {
        return this.f21888d;
    }

    /* renamed from: E */
    public float m25292E() {
        return this.f21887c.m43888p();
    }

    /* renamed from: F */
    public rgh m25293F() {
        return null;
    }

    /* renamed from: G */
    public Typeface m25294G(String str, String str2) {
        ib7 ib7VarM25329r = m25329r();
        if (ib7VarM25329r != null) {
            return ib7VarM25329r.m31814b(str, str2);
        }
        return null;
    }

    /* renamed from: H */
    public boolean m25295H() {
        pma pmaVar = this.f21887c;
        if (pmaVar == null) {
            return false;
        }
        return pmaVar.isRunning();
    }

    /* renamed from: I */
    public boolean m25296I() {
        return this.f21883Y;
    }

    /* renamed from: J */
    public void m25297J() {
        this.f21892h.clear();
        this.f21887c.m43890s();
    }

    /* renamed from: K */
    public void m25298K() {
        if (this.f21879L == null) {
            this.f21892h.add(new C13226i());
            return;
        }
        if (m25315d() || m25289B() == 0) {
            this.f21887c.m43891t();
        }
        if (m25315d()) {
            return;
        }
        m25304Q((int) (m25292E() < 0.0f ? m25336y() : m25334w()));
        this.f21887c.m43882i();
    }

    /* renamed from: L */
    public List m25299L(yc9 yc9Var) {
        if (this.f21879L == null) {
            rja.m46866c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f21879L.mo19999c(yc9Var, 0, arrayList, new yc9(new String[0]));
        return arrayList;
    }

    /* renamed from: M */
    public void m25300M() {
        if (this.f21879L == null) {
            this.f21892h.add(new C13227j());
            return;
        }
        if (m25315d() || m25289B() == 0) {
            this.f21887c.m43895x();
        }
        if (m25315d()) {
            return;
        }
        m25304Q((int) (m25292E() < 0.0f ? m25336y() : m25334w()));
        this.f21887c.m43882i();
    }

    /* renamed from: N */
    public void m25301N(boolean z) {
        this.f21883Y = z;
    }

    /* renamed from: O */
    public boolean m25302O(ama amaVar) {
        if (this.f21886b == amaVar) {
            return false;
        }
        this.h0 = false;
        m25320i();
        this.f21886b = amaVar;
        m25318g();
        this.f21887c.m43897z(amaVar);
        g0(this.f21887c.getAnimatedFraction());
        k0(this.f21888d);
        Iterator it = new ArrayList(this.f21892h).iterator();
        while (it.hasNext()) {
            InterfaceC13234q interfaceC13234q = (InterfaceC13234q) it.next();
            if (interfaceC13234q != null) {
                interfaceC13234q.mo25338a(amaVar);
            }
            it.remove();
        }
        this.f21892h.clear();
        amaVar.m17458v(this.f21881Q);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: P */
    public void m25303P(hb7 hb7Var) {
        ib7 ib7Var = this.f21896y;
        if (ib7Var != null) {
            ib7Var.m31815c(hb7Var);
        }
    }

    /* renamed from: Q */
    public void m25304Q(int i) {
        if (this.f21886b == null) {
            this.f21892h.add(new C13222e(i));
        } else {
            this.f21887c.m43875A(i);
        }
    }

    /* renamed from: R */
    public void m25305R(boolean z) {
        this.f21890f = z;
    }

    /* renamed from: S */
    public void m25306S(jc8 jc8Var) {
        kc8 kc8Var = this.f21894s;
        if (kc8Var != null) {
            kc8Var.m35395d(jc8Var);
        }
    }

    /* renamed from: T */
    public void m25307T(String str) {
        this.f21895x = str;
    }

    /* renamed from: U */
    public void m25308U(int i) {
        if (this.f21886b == null) {
            this.f21892h.add(new C13230m(i));
        } else {
            this.f21887c.m43876B(i + 0.99f);
        }
    }

    /* renamed from: V */
    public void m25309V(String str) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13233p(str));
            return;
        }
        psa psaVarM17448l = amaVar.m17448l(str);
        if (psaVarM17448l != null) {
            m25308U((int) (psaVarM17448l.f40505b + psaVarM17448l.f40506c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: W */
    public void m25310W(float f) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13231n(f));
        } else {
            m25308U((int) zeb.m59356k(amaVar.m17452p(), this.f21886b.m17442f(), f));
        }
    }

    /* renamed from: X */
    public void m25311X(int i, int i2) {
        if (this.f21886b == null) {
            this.f21892h.add(new C13220c(i, i2));
        } else {
            this.f21887c.m43877C(i, i2 + 0.99f);
        }
    }

    /* renamed from: Y */
    public void m25312Y(String str) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13218a(str));
            return;
        }
        psa psaVarM17448l = amaVar.m17448l(str);
        if (psaVarM17448l != null) {
            int i = (int) psaVarM17448l.f40505b;
            m25311X(i, ((int) psaVarM17448l.f40506c) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    /* renamed from: Z */
    public void m25313Z(String str, String str2, boolean z) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13219b(str, str2, z));
            return;
        }
        psa psaVarM17448l = amaVar.m17448l(str);
        if (psaVarM17448l == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) psaVarM17448l.f40505b;
        psa psaVarM17448l2 = this.f21886b.m17448l(str2);
        if (psaVarM17448l2 != null) {
            m25311X(i, (int) (psaVarM17448l2.f40505b + (z ? 1.0f : 0.0f)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    public void a0(float f, float f2) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13221d(f, f2));
        } else {
            m25311X((int) zeb.m59356k(amaVar.m17452p(), this.f21886b.m17442f(), f), (int) zeb.m59356k(this.f21886b.m17452p(), this.f21886b.m17442f(), f2));
        }
    }

    public void b0(int i) {
        if (this.f21886b == null) {
            this.f21892h.add(new C13228k(i));
        } else {
            this.f21887c.m43878D(i);
        }
    }

    /* renamed from: c */
    public void m25314c(yc9 yc9Var, Object obj, qma qmaVar) {
        hp3 hp3Var = this.f21879L;
        if (hp3Var == null) {
            this.f21892h.add(new C13224g(yc9Var, obj, qmaVar));
            return;
        }
        boolean zIsEmpty = true;
        if (yc9Var == yc9.f55214c) {
            hp3Var.mo20000d(obj, qmaVar);
        } else if (yc9Var.m57515d() != null) {
            yc9Var.m57515d().mo20000d(obj, qmaVar);
        } else {
            List listM25299L = m25299L(yc9Var);
            for (int i = 0; i < listM25299L.size(); i++) {
                ((yc9) listM25299L.get(i)).m57515d().mo20000d(obj, qmaVar);
            }
            zIsEmpty = true ^ listM25299L.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == mma.f35700E) {
                g0(m25288A());
            }
        }
    }

    public void c0(String str) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13232o(str));
            return;
        }
        psa psaVarM17448l = amaVar.m17448l(str);
        if (psaVarM17448l != null) {
            b0((int) psaVarM17448l.f40505b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: d */
    public final boolean m25315d() {
        return this.f21889e || this.f21890f;
    }

    public void d0(float f) {
        ama amaVar = this.f21886b;
        if (amaVar == null) {
            this.f21892h.add(new C13229l(f));
        } else {
            b0((int) zeb.m59356k(amaVar.m17452p(), this.f21886b.m17442f(), f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.h0 = false;
        ve9.m52656a("Drawable#draw");
        if (this.f21891g) {
            try {
                m25321j(canvas);
            } catch (Throwable th) {
                rja.m46865b("Lottie crashed in draw!", th);
            }
        } else {
            m25321j(canvas);
        }
        ve9.m52657b("Drawable#draw");
    }

    /* renamed from: e */
    public final float m25316e(Rect rect) {
        return rect.width() / rect.height();
    }

    public void e0(boolean z) {
        if (this.f21882X == z) {
            return;
        }
        this.f21882X = z;
        hp3 hp3Var = this.f21879L;
        if (hp3Var != null) {
            hp3Var.mo30179I(z);
        }
    }

    /* renamed from: f */
    public final boolean m25317f() {
        ama amaVar = this.f21886b;
        return amaVar == null || getBounds().isEmpty() || m25316e(getBounds()) == m25316e(amaVar.m17438b());
    }

    public void f0(boolean z) {
        this.f21881Q = z;
        ama amaVar = this.f21886b;
        if (amaVar != null) {
            amaVar.m17458v(z);
        }
    }

    /* renamed from: g */
    public final void m25318g() {
        hp3 hp3Var = new hp3(this, ih9.m32141b(this.f21886b), this.f21886b.m17447k(), this.f21886b);
        this.f21879L = hp3Var;
        if (this.f21882X) {
            hp3Var.mo30179I(true);
        }
    }

    public void g0(float f) {
        if (this.f21886b == null) {
            this.f21892h.add(new C13223f(f));
            return;
        }
        ve9.m52656a("Drawable#setProgress");
        this.f21887c.m43875A(this.f21886b.m17444h(f));
        ve9.m52657b("Drawable#setProgress");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21880M;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f21886b == null) {
            return -1;
        }
        return (int) (r0.m17438b().height() * m25291D());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f21886b == null) {
            return -1;
        }
        return (int) (r0.m17438b().width() * m25291D());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m25319h() {
        this.f21892h.clear();
        this.f21887c.cancel();
    }

    public void h0(int i) {
        this.f21887c.setRepeatCount(i);
    }

    /* renamed from: i */
    public void m25320i() {
        if (this.f21887c.isRunning()) {
            this.f21887c.cancel();
        }
        this.f21886b = null;
        this.f21879L = null;
        this.f21894s = null;
        this.f21887c.m43881h();
        invalidateSelf();
    }

    public void i0(int i) {
        this.f21887c.setRepeatMode(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m25295H();
    }

    /* renamed from: j */
    public final void m25321j(Canvas canvas) {
        if (m25317f()) {
            m25323l(canvas);
        } else {
            m25322k(canvas);
        }
    }

    public void j0(boolean z) {
        this.f21891g = z;
    }

    /* renamed from: k */
    public final void m25322k(Canvas canvas) {
        float f;
        if (this.f21879L == null) {
            return;
        }
        Rect bounds = getBounds();
        float fWidth = bounds.width() / this.f21886b.m17438b().width();
        float fHeight = bounds.height() / this.f21886b.m17438b().height();
        int iSave = -1;
        if (this.f21884Z) {
            float fMin = Math.min(fWidth, fHeight);
            if (fMin < 1.0f) {
                f = 1.0f / fMin;
                fWidth /= f;
                fHeight /= f;
            } else {
                f = 1.0f;
            }
            if (f > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = bounds.width() / 2.0f;
                float fHeight2 = bounds.height() / 2.0f;
                float f2 = fWidth2 * fMin;
                float f3 = fMin * fHeight2;
                canvas.translate(fWidth2 - f2, fHeight2 - f3);
                canvas.scale(f, f, f2, f3);
            }
        }
        this.f21885a.reset();
        this.f21885a.preScale(fWidth, fHeight);
        this.f21879L.mo20002g(canvas, this.f21885a, this.f21880M);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    public void k0(float f) {
        this.f21888d = f;
    }

    /* renamed from: l */
    public final void m25323l(Canvas canvas) {
        float f;
        int iSave;
        if (this.f21879L == null) {
            return;
        }
        float f2 = this.f21888d;
        float fM25335x = m25335x(canvas);
        if (f2 > fM25335x) {
            f = this.f21888d / fM25335x;
        } else {
            fM25335x = f2;
            f = 1.0f;
        }
        if (f > 1.0f) {
            iSave = canvas.save();
            float fWidth = this.f21886b.m17438b().width() / 2.0f;
            float fHeight = this.f21886b.m17438b().height() / 2.0f;
            float f3 = fWidth * fM25335x;
            float f4 = fHeight * fM25335x;
            canvas.translate((m25291D() * fWidth) - f3, (m25291D() * fHeight) - f4);
            canvas.scale(f, f, f3, f4);
        } else {
            iSave = -1;
        }
        this.f21885a.reset();
        this.f21885a.preScale(fM25335x, fM25335x);
        this.f21879L.mo20002g(canvas, this.f21885a, this.f21880M);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    public void l0(float f) {
        this.f21887c.m43879E(f);
    }

    /* renamed from: m */
    public void m25324m(boolean z) {
        if (this.f21878H == z) {
            return;
        }
        this.f21878H = z;
        if (this.f21886b != null) {
            m25318g();
        }
    }

    public void m0(Boolean bool) {
        this.f21889e = bool.booleanValue();
    }

    /* renamed from: n */
    public boolean m25325n() {
        return this.f21878H;
    }

    public void n0(rgh rghVar) {
    }

    /* renamed from: o */
    public void m25326o() {
        this.f21892h.clear();
        this.f21887c.m43882i();
    }

    public boolean o0() {
        return this.f21886b.m17439c().m22193p() > 0;
    }

    /* renamed from: p */
    public ama m25327p() {
        return this.f21886b;
    }

    /* renamed from: q */
    public final Context m25328q() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: r */
    public final ib7 m25329r() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21896y == null) {
            this.f21896y = new ib7(getCallback(), null);
        }
        return this.f21896y;
    }

    /* renamed from: s */
    public int m25330s() {
        return (int) this.f21887c.m43884k();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f21880M = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        rja.m46866c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        m25298K();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m25326o();
    }

    /* renamed from: t */
    public Bitmap m25331t(String str) {
        kc8 kc8VarM25332u = m25332u();
        if (kc8VarM25332u != null) {
            return kc8VarM25332u.m35392a(str);
        }
        ama amaVar = this.f21886b;
        hma hmaVar = amaVar == null ? null : (hma) amaVar.m17446j().get(str);
        if (hmaVar != null) {
            return hmaVar.m30808a();
        }
        return null;
    }

    /* renamed from: u */
    public final kc8 m25332u() {
        if (getCallback() == null) {
            return null;
        }
        kc8 kc8Var = this.f21894s;
        if (kc8Var != null && !kc8Var.m35393b(m25328q())) {
            this.f21894s = null;
        }
        if (this.f21894s == null) {
            this.f21894s = new kc8(getCallback(), this.f21895x, null, this.f21886b.m17446j());
        }
        return this.f21894s;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public String m25333v() {
        return this.f21895x;
    }

    /* renamed from: w */
    public float m25334w() {
        return this.f21887c.m43886m();
    }

    /* renamed from: x */
    public final float m25335x(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f21886b.m17438b().width(), canvas.getHeight() / this.f21886b.m17438b().height());
    }

    /* renamed from: y */
    public float m25336y() {
        return this.f21887c.m43887n();
    }

    /* renamed from: z */
    public f3d m25337z() {
        ama amaVar = this.f21886b;
        if (amaVar != null) {
            return amaVar.m17450n();
        }
        return null;
    }
}
