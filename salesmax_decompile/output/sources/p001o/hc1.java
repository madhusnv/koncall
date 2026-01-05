package p001o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.gc1;
import p001o.gh9;
import p001o.usa;

/* loaded from: classes3.dex */
public abstract class hc1 implements dz5, gc1.InterfaceC13670b, zc9 {

    /* renamed from: A */
    public BlurMaskFilter f26606A;

    /* renamed from: a */
    public final Path f26607a = new Path();

    /* renamed from: b */
    public final Matrix f26608b = new Matrix();

    /* renamed from: c */
    public final Paint f26609c = new we9(1);

    /* renamed from: d */
    public final Paint f26610d = new we9(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    public final Paint f26611e = new we9(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    public final Paint f26612f;

    /* renamed from: g */
    public final Paint f26613g;

    /* renamed from: h */
    public final RectF f26614h;

    /* renamed from: i */
    public final RectF f26615i;

    /* renamed from: j */
    public final RectF f26616j;

    /* renamed from: k */
    public final RectF f26617k;

    /* renamed from: l */
    public final String f26618l;

    /* renamed from: m */
    public final Matrix f26619m;

    /* renamed from: n */
    public final ema f26620n;

    /* renamed from: o */
    public final gh9 f26621o;

    /* renamed from: p */
    public vsa f26622p;

    /* renamed from: q */
    public g37 f26623q;

    /* renamed from: r */
    public hc1 f26624r;

    /* renamed from: s */
    public hc1 f26625s;

    /* renamed from: t */
    public List f26626t;

    /* renamed from: u */
    public final List f26627u;

    /* renamed from: v */
    public final tuh f26628v;

    /* renamed from: w */
    public boolean f26629w;

    /* renamed from: x */
    public boolean f26630x;

    /* renamed from: y */
    public Paint f26631y;

    /* renamed from: z */
    public float f26632z;

    /* renamed from: o.hc1$a */
    public class C13910a implements gc1.InterfaceC13670b {
        public C13910a() {
        }

        @Override // p001o.gc1.InterfaceC13670b
        /* renamed from: a */
        public void mo19333a() {
            hc1 hc1Var = hc1.this;
            hc1Var.m30182L(hc1Var.f26623q.m28012p() == 1.0f);
        }
    }

    /* renamed from: o.hc1$b */
    public static /* synthetic */ class C13911b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26634a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26635b;

        static {
            int[] iArr = new int[usa.EnumC17443a.values().length];
            f26635b = iArr;
            try {
                iArr[usa.EnumC17443a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26635b[usa.EnumC17443a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26635b[usa.EnumC17443a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26635b[usa.EnumC17443a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[gh9.EnumC13715a.values().length];
            f26634a = iArr2;
            try {
                iArr2[gh9.EnumC13715a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26634a[gh9.EnumC13715a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26634a[gh9.EnumC13715a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26634a[gh9.EnumC13715a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26634a[gh9.EnumC13715a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26634a[gh9.EnumC13715a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26634a[gh9.EnumC13715a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public hc1(ema emaVar, gh9 gh9Var) {
        we9 we9Var = new we9(1);
        this.f26612f = we9Var;
        this.f26613g = new we9(PorterDuff.Mode.CLEAR);
        this.f26614h = new RectF();
        this.f26615i = new RectF();
        this.f26616j = new RectF();
        this.f26617k = new RectF();
        this.f26619m = new Matrix();
        this.f26627u = new ArrayList();
        this.f26629w = true;
        this.f26632z = 0.0f;
        this.f26620n = emaVar;
        this.f26621o = gh9Var;
        this.f26618l = gh9Var.m28683i() + "#draw";
        if (gh9Var.m28682h() == gh9.EnumC13716b.INVERT) {
            we9Var.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            we9Var.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        tuh tuhVarM46677b = gh9Var.m28697w().m46677b();
        this.f26628v = tuhVarM46677b;
        tuhVarM46677b.m50695b(this);
        if (gh9Var.m28681g() != null && !gh9Var.m28681g().isEmpty()) {
            vsa vsaVar = new vsa(gh9Var.m28681g());
            this.f26622p = vsaVar;
            Iterator it = vsaVar.m53381a().iterator();
            while (it.hasNext()) {
                ((gc1) it.next()).m28369a(this);
            }
            for (gc1 gc1Var : this.f26622p.m53383c()) {
                m30184i(gc1Var);
                gc1Var.m28369a(this);
            }
        }
        m30183M();
    }

    /* renamed from: u */
    public static hc1 m30170u(hp3 hp3Var, gh9 gh9Var, ema emaVar, ama amaVar) {
        switch (C13911b.f26634a[gh9Var.m28680f().ordinal()]) {
            case 1:
                return new jlf(emaVar, gh9Var, hp3Var);
            case 2:
                return new hp3(emaVar, gh9Var, amaVar.m17451o(gh9Var.m28687m()), amaVar);
            case 3:
                return new ezf(emaVar, gh9Var);
            case 4:
                return new ld8(emaVar, gh9Var);
            case 5:
                return new w4c(emaVar, gh9Var);
            case 6:
                return new dih(emaVar, gh9Var);
            default:
                rja.m46866c("Unknown layer type " + gh9Var.m28680f());
                return null;
        }
    }

    /* renamed from: A */
    public boolean m30171A() {
        return this.f26624r != null;
    }

    /* renamed from: B */
    public final void m30172B(RectF rectF, Matrix matrix) {
        this.f26615i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m30199z()) {
            int size = this.f26622p.m53382b().size();
            for (int i = 0; i < size; i++) {
                usa usaVar = (usa) this.f26622p.m53382b().get(i);
                this.f26607a.set((Path) ((gc1) this.f26622p.m53381a().get(i)).mo28376h());
                this.f26607a.transform(matrix);
                int i2 = C13911b.f26635b[usaVar.m52007a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && usaVar.m52010d()) {
                    return;
                }
                this.f26607a.computeBounds(this.f26617k, false);
                if (i == 0) {
                    this.f26615i.set(this.f26617k);
                } else {
                    RectF rectF2 = this.f26615i;
                    rectF2.set(Math.min(rectF2.left, this.f26617k.left), Math.min(this.f26615i.top, this.f26617k.top), Math.max(this.f26615i.right, this.f26617k.right), Math.max(this.f26615i.bottom, this.f26617k.bottom));
                }
            }
            if (rectF.intersect(this.f26615i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: C */
    public final void m30173C(RectF rectF, Matrix matrix) {
        if (m30171A() && this.f26621o.m28682h() != gh9.EnumC13716b.INVERT) {
            this.f26616j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f26624r.mo20001e(this.f26616j, matrix, true);
            if (rectF.intersect(this.f26616j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: D */
    public final void m30174D() {
        this.f26620n.invalidateSelf();
    }

    /* renamed from: E */
    public final void m30175E(float f) {
        this.f26620n.m25327p().m17450n().m26039a(this.f26621o.m28683i(), f);
    }

    /* renamed from: F */
    public void m30176F(gc1 gc1Var) {
        this.f26627u.remove(gc1Var);
    }

    /* renamed from: G */
    public void mo30177G(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
    }

    /* renamed from: H */
    public void m30178H(hc1 hc1Var) {
        this.f26624r = hc1Var;
    }

    /* renamed from: I */
    public void mo30179I(boolean z) {
        if (z && this.f26631y == null) {
            this.f26631y = new we9();
        }
        this.f26630x = z;
    }

    /* renamed from: J */
    public void m30180J(hc1 hc1Var) {
        this.f26625s = hc1Var;
    }

    /* renamed from: K */
    public void mo30181K(float f) {
        this.f26628v.m50703j(f);
        if (this.f26622p != null) {
            for (int i = 0; i < this.f26622p.m53381a().size(); i++) {
                ((gc1) this.f26622p.m53381a().get(i)).mo28379m(f);
            }
        }
        g37 g37Var = this.f26623q;
        if (g37Var != null) {
            g37Var.mo28379m(f);
        }
        hc1 hc1Var = this.f26624r;
        if (hc1Var != null) {
            hc1Var.mo30181K(f);
        }
        for (int i2 = 0; i2 < this.f26627u.size(); i2++) {
            ((gc1) this.f26627u.get(i2)).mo28379m(f);
        }
    }

    /* renamed from: L */
    public final void m30182L(boolean z) {
        if (z != this.f26629w) {
            this.f26629w = z;
            m30174D();
        }
    }

    /* renamed from: M */
    public final void m30183M() {
        if (this.f26621o.m28679e().isEmpty()) {
            m30182L(true);
            return;
        }
        g37 g37Var = new g37(this.f26621o.m28679e());
        this.f26623q = g37Var;
        g37Var.m28378l();
        this.f26623q.m28369a(new C13910a());
        m30182L(((Float) this.f26623q.mo28376h()).floatValue() == 1.0f);
        m30184i(this.f26623q);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        m30174D();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        hc1 hc1Var = this.f26624r;
        if (hc1Var != null) {
            yc9 yc9VarM57512a = yc9Var2.m57512a(hc1Var.getName());
            if (yc9Var.m57514c(this.f26624r.getName(), i)) {
                list.add(yc9VarM57512a.m57520i(this.f26624r));
            }
            if (yc9Var.m57519h(getName(), i)) {
                this.f26624r.mo30177G(yc9Var, yc9Var.m57516e(this.f26624r.getName(), i) + i, list, yc9VarM57512a);
            }
        }
        if (yc9Var.m57518g(getName(), i)) {
            if (!"__container".equals(getName())) {
                yc9Var2 = yc9Var2.m57512a(getName());
                if (yc9Var.m57514c(getName(), i)) {
                    list.add(yc9Var2.m57520i(this));
                }
            }
            if (yc9Var.m57519h(getName(), i)) {
                mo30177G(yc9Var, i + yc9Var.m57516e(getName(), i), list, yc9Var2);
            }
        }
    }

    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        this.f26628v.m50696c(obj, qmaVar);
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        this.f26614h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m30193r();
        this.f26619m.set(matrix);
        if (z) {
            List list = this.f26626t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f26619m.preConcat(((hc1) this.f26626t.get(size)).f26628v.m50699f());
                }
            } else {
                hc1 hc1Var = this.f26625s;
                if (hc1Var != null) {
                    this.f26619m.preConcat(hc1Var.f26628v.m50699f());
                }
            }
        }
        this.f26619m.preConcat(this.f26628v.m50699f());
    }

    @Override // p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        ve9.m52656a(this.f26618l);
        if (!this.f26629w || this.f26621o.m28698x()) {
            ve9.m52657b(this.f26618l);
            return;
        }
        m30193r();
        ve9.m52656a("Layer#parentMatrix");
        this.f26608b.reset();
        this.f26608b.set(matrix);
        for (int size = this.f26626t.size() - 1; size >= 0; size--) {
            this.f26608b.preConcat(((hc1) this.f26626t.get(size)).f26628v.m50699f());
        }
        ve9.m52657b("Layer#parentMatrix");
        int iIntValue = (int) ((((i / 255.0f) * (this.f26628v.m50701h() == null ? 100 : ((Integer) this.f26628v.m50701h().mo28376h()).intValue())) / 100.0f) * 255.0f);
        if (!m30171A() && !m30199z()) {
            this.f26608b.preConcat(this.f26628v.m50699f());
            ve9.m52656a("Layer#drawLayer");
            mo23320t(canvas, this.f26608b, iIntValue);
            ve9.m52657b("Layer#drawLayer");
            m30175E(ve9.m52657b(this.f26618l));
            return;
        }
        ve9.m52656a("Layer#computeBounds");
        mo20001e(this.f26614h, this.f26608b, false);
        m30173C(this.f26614h, matrix);
        this.f26608b.preConcat(this.f26628v.m50699f());
        m30172B(this.f26614h, this.f26608b);
        if (!this.f26614h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.f26614h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        ve9.m52657b("Layer#computeBounds");
        if (this.f26614h.width() >= 1.0f && this.f26614h.height() >= 1.0f) {
            ve9.m52656a("Layer#saveLayer");
            this.f26609c.setAlpha(Constants.MAX_HOST_LENGTH);
            hri.m31033m(canvas, this.f26614h, this.f26609c);
            ve9.m52657b("Layer#saveLayer");
            m30194s(canvas);
            ve9.m52656a("Layer#drawLayer");
            mo23320t(canvas, this.f26608b, iIntValue);
            ve9.m52657b("Layer#drawLayer");
            if (m30199z()) {
                m30190o(canvas, this.f26608b);
            }
            if (m30171A()) {
                ve9.m52656a("Layer#drawMatte");
                ve9.m52656a("Layer#saveLayer");
                hri.m31034n(canvas, this.f26614h, this.f26612f, 19);
                ve9.m52657b("Layer#saveLayer");
                m30194s(canvas);
                this.f26624r.mo20002g(canvas, matrix, iIntValue);
                ve9.m52656a("Layer#restoreLayer");
                canvas.restore();
                ve9.m52657b("Layer#restoreLayer");
                ve9.m52657b("Layer#drawMatte");
            }
            ve9.m52656a("Layer#restoreLayer");
            canvas.restore();
            ve9.m52657b("Layer#restoreLayer");
        }
        if (this.f26630x && (paint = this.f26631y) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f26631y.setColor(-251901);
            this.f26631y.setStrokeWidth(4.0f);
            canvas.drawRect(this.f26614h, this.f26631y);
            this.f26631y.setStyle(Paint.Style.FILL);
            this.f26631y.setColor(1357638635);
            canvas.drawRect(this.f26614h, this.f26631y);
        }
        m30175E(ve9.m52657b(this.f26618l));
    }

    @Override // p001o.j14
    public String getName() {
        return this.f26621o.m28683i();
    }

    /* renamed from: i */
    public void m30184i(gc1 gc1Var) {
        if (gc1Var == null) {
            return;
        }
        this.f26627u.add(gc1Var);
    }

    /* renamed from: j */
    public final void m30185j(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        this.f26609c.setAlpha((int) (((Integer) gc1Var2.mo28376h()).intValue() * 2.55f));
        canvas.drawPath(this.f26607a, this.f26609c);
    }

    /* renamed from: k */
    public final void m30186k(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        hri.m31033m(canvas, this.f26614h, this.f26610d);
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        this.f26609c.setAlpha((int) (((Integer) gc1Var2.mo28376h()).intValue() * 2.55f));
        canvas.drawPath(this.f26607a, this.f26609c);
        canvas.restore();
    }

    /* renamed from: l */
    public final void m30187l(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        hri.m31033m(canvas, this.f26614h, this.f26609c);
        canvas.drawRect(this.f26614h, this.f26609c);
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        this.f26609c.setAlpha((int) (((Integer) gc1Var2.mo28376h()).intValue() * 2.55f));
        canvas.drawPath(this.f26607a, this.f26611e);
        canvas.restore();
    }

    /* renamed from: m */
    public final void m30188m(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        hri.m31033m(canvas, this.f26614h, this.f26610d);
        canvas.drawRect(this.f26614h, this.f26609c);
        this.f26611e.setAlpha((int) (((Integer) gc1Var2.mo28376h()).intValue() * 2.55f));
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        canvas.drawPath(this.f26607a, this.f26611e);
        canvas.restore();
    }

    /* renamed from: n */
    public final void m30189n(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        hri.m31033m(canvas, this.f26614h, this.f26611e);
        canvas.drawRect(this.f26614h, this.f26609c);
        this.f26611e.setAlpha((int) (((Integer) gc1Var2.mo28376h()).intValue() * 2.55f));
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        canvas.drawPath(this.f26607a, this.f26611e);
        canvas.restore();
    }

    /* renamed from: o */
    public final void m30190o(Canvas canvas, Matrix matrix) {
        ve9.m52656a("Layer#saveLayer");
        hri.m31034n(canvas, this.f26614h, this.f26610d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m30194s(canvas);
        }
        ve9.m52657b("Layer#saveLayer");
        for (int i = 0; i < this.f26622p.m53382b().size(); i++) {
            usa usaVar = (usa) this.f26622p.m53382b().get(i);
            gc1 gc1Var = (gc1) this.f26622p.m53381a().get(i);
            gc1 gc1Var2 = (gc1) this.f26622p.m53383c().get(i);
            int i2 = C13911b.f26635b[usaVar.m52007a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f26609c.setColor(-16777216);
                        this.f26609c.setAlpha(Constants.MAX_HOST_LENGTH);
                        canvas.drawRect(this.f26614h, this.f26609c);
                    }
                    if (usaVar.m52010d()) {
                        m30189n(canvas, matrix, usaVar, gc1Var, gc1Var2);
                    } else {
                        m30191p(canvas, matrix, usaVar, gc1Var, gc1Var2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (usaVar.m52010d()) {
                            m30187l(canvas, matrix, usaVar, gc1Var, gc1Var2);
                        } else {
                            m30185j(canvas, matrix, usaVar, gc1Var, gc1Var2);
                        }
                    }
                } else if (usaVar.m52010d()) {
                    m30188m(canvas, matrix, usaVar, gc1Var, gc1Var2);
                } else {
                    m30186k(canvas, matrix, usaVar, gc1Var, gc1Var2);
                }
            } else if (m30192q()) {
                this.f26609c.setAlpha(Constants.MAX_HOST_LENGTH);
                canvas.drawRect(this.f26614h, this.f26609c);
            }
        }
        ve9.m52656a("Layer#restoreLayer");
        canvas.restore();
        ve9.m52657b("Layer#restoreLayer");
    }

    /* renamed from: p */
    public final void m30191p(Canvas canvas, Matrix matrix, usa usaVar, gc1 gc1Var, gc1 gc1Var2) {
        this.f26607a.set((Path) gc1Var.mo28376h());
        this.f26607a.transform(matrix);
        canvas.drawPath(this.f26607a, this.f26611e);
    }

    /* renamed from: q */
    public final boolean m30192q() {
        if (this.f26622p.m53381a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f26622p.m53382b().size(); i++) {
            if (((usa) this.f26622p.m53382b().get(i)).m52007a() != usa.EnumC17443a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final void m30193r() {
        if (this.f26626t != null) {
            return;
        }
        if (this.f26625s == null) {
            this.f26626t = Collections.emptyList();
            return;
        }
        this.f26626t = new ArrayList();
        for (hc1 hc1Var = this.f26625s; hc1Var != null; hc1Var = hc1Var.f26625s) {
            this.f26626t.add(hc1Var);
        }
    }

    /* renamed from: s */
    public final void m30194s(Canvas canvas) {
        ve9.m52656a("Layer#clearLayer");
        RectF rectF = this.f26614h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f26613g);
        ve9.m52657b("Layer#clearLayer");
    }

    /* renamed from: t */
    public abstract void mo23320t(Canvas canvas, Matrix matrix, int i);

    /* renamed from: v */
    public yj1 mo30195v() {
        return this.f26621o.m28675a();
    }

    /* renamed from: w */
    public BlurMaskFilter m30196w(float f) {
        if (this.f26632z == f) {
            return this.f26606A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f26606A = blurMaskFilter;
        this.f26632z = f;
        return blurMaskFilter;
    }

    /* renamed from: x */
    public tz5 mo30197x() {
        return this.f26621o.m28677c();
    }

    /* renamed from: y */
    public gh9 m30198y() {
        return this.f26621o;
    }

    /* renamed from: z */
    public boolean m30199z() {
        vsa vsaVar = this.f26622p;
        return (vsaVar == null || vsaVar.m53381a().isEmpty()) ? false : true;
    }
}
