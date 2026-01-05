package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class klf {

    /* renamed from: a */
    public float f32383a;

    /* renamed from: b */
    public float f32384b;

    /* renamed from: c */
    public float f32385c;

    /* renamed from: d */
    public float f32386d;

    /* renamed from: e */
    public float f32387e;

    /* renamed from: f */
    public float f32388f;

    /* renamed from: g */
    public final List f32389g = new ArrayList();

    /* renamed from: h */
    public final List f32390h = new ArrayList();

    /* renamed from: i */
    public boolean f32391i;

    /* renamed from: o.klf$a */
    public class C14860a extends AbstractC14866g {

        /* renamed from: c */
        public final /* synthetic */ List f32392c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f32393d;

        public C14860a(List list, Matrix matrix) {
            this.f32392c = list;
            this.f32393d = matrix;
        }

        @Override // p001o.klf.AbstractC14866g
        /* renamed from: a */
        public void mo35862a(Matrix matrix, ukf ukfVar, int i, Canvas canvas) {
            Iterator it = this.f32392c.iterator();
            while (it.hasNext()) {
                ((AbstractC14866g) it.next()).mo35862a(this.f32393d, ukfVar, i, canvas);
            }
        }
    }

    /* renamed from: o.klf$b */
    public static class C14861b extends AbstractC14866g {

        /* renamed from: c */
        public final C14863d f32395c;

        public C14861b(C14863d c14863d) {
            this.f32395c = c14863d;
        }

        @Override // p001o.klf.AbstractC14866g
        /* renamed from: a */
        public void mo35862a(Matrix matrix, ukf ukfVar, int i, Canvas canvas) {
            ukfVar.m51684a(canvas, matrix, new RectF(this.f32395c.m35874k(), this.f32395c.m35878o(), this.f32395c.m35875l(), this.f32395c.m35873j()), i, this.f32395c.m35876m(), this.f32395c.m35877n());
        }
    }

    /* renamed from: o.klf$c */
    public static class C14862c extends AbstractC14866g {

        /* renamed from: c */
        public final C14864e f32396c;

        /* renamed from: d */
        public final float f32397d;

        /* renamed from: e */
        public final float f32398e;

        public C14862c(C14864e c14864e, float f, float f2) {
            this.f32396c = c14864e;
            this.f32397d = f;
            this.f32398e = f2;
        }

        @Override // p001o.klf.AbstractC14866g
        /* renamed from: a */
        public void mo35862a(Matrix matrix, ukf ukfVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f32396c.f32407c - this.f32398e, this.f32396c.f32406b - this.f32397d), 0.0f);
            this.f32410a.set(matrix);
            this.f32410a.preTranslate(this.f32397d, this.f32398e);
            this.f32410a.preRotate(m35863c());
            ukfVar.m51685b(canvas, this.f32410a, rectF, i);
        }

        /* renamed from: c */
        public float m35863c() {
            return (float) Math.toDegrees(Math.atan((this.f32396c.f32407c - this.f32398e) / (this.f32396c.f32406b - this.f32397d)));
        }
    }

    /* renamed from: o.klf$d */
    public static class C14863d extends AbstractC14865f {

        /* renamed from: h */
        public static final RectF f32399h = new RectF();

        /* renamed from: b */
        public float f32400b;

        /* renamed from: c */
        public float f32401c;

        /* renamed from: d */
        public float f32402d;

        /* renamed from: e */
        public float f32403e;

        /* renamed from: f */
        public float f32404f;

        /* renamed from: g */
        public float f32405g;

        public C14863d(float f, float f2, float f3, float f4) {
            m35880q(f);
            m35884u(f2);
            m35881r(f3);
            m35879p(f4);
        }

        @Override // p001o.klf.AbstractC14865f
        /* renamed from: a */
        public void mo35872a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f32408a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f32399h;
            rectF.set(m35874k(), m35878o(), m35875l(), m35873j());
            path.arcTo(rectF, m35876m(), m35877n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float m35873j() {
            return this.f32403e;
        }

        /* renamed from: k */
        public final float m35874k() {
            return this.f32400b;
        }

        /* renamed from: l */
        public final float m35875l() {
            return this.f32402d;
        }

        /* renamed from: m */
        public final float m35876m() {
            return this.f32404f;
        }

        /* renamed from: n */
        public final float m35877n() {
            return this.f32405g;
        }

        /* renamed from: o */
        public final float m35878o() {
            return this.f32401c;
        }

        /* renamed from: p */
        public final void m35879p(float f) {
            this.f32403e = f;
        }

        /* renamed from: q */
        public final void m35880q(float f) {
            this.f32400b = f;
        }

        /* renamed from: r */
        public final void m35881r(float f) {
            this.f32402d = f;
        }

        /* renamed from: s */
        public final void m35882s(float f) {
            this.f32404f = f;
        }

        /* renamed from: t */
        public final void m35883t(float f) {
            this.f32405g = f;
        }

        /* renamed from: u */
        public final void m35884u(float f) {
            this.f32401c = f;
        }
    }

    /* renamed from: o.klf$e */
    public static class C14864e extends AbstractC14865f {

        /* renamed from: b */
        public float f32406b;

        /* renamed from: c */
        public float f32407c;

        @Override // p001o.klf.AbstractC14865f
        /* renamed from: a */
        public void mo35872a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f32408a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f32406b, this.f32407c);
            path.transform(matrix);
        }
    }

    /* renamed from: o.klf$f */
    public static abstract class AbstractC14865f {

        /* renamed from: a */
        public final Matrix f32408a = new Matrix();

        /* renamed from: a */
        public abstract void mo35872a(Matrix matrix, Path path);
    }

    /* renamed from: o.klf$g */
    public static abstract class AbstractC14866g {

        /* renamed from: b */
        public static final Matrix f32409b = new Matrix();

        /* renamed from: a */
        public final Matrix f32410a = new Matrix();

        /* renamed from: a */
        public abstract void mo35862a(Matrix matrix, ukf ukfVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void m35889b(ukf ukfVar, int i, Canvas canvas) {
            mo35862a(f32409b, ukfVar, i, canvas);
        }
    }

    public klf() {
        m35854n(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m35841a(float f, float f2, float f3, float f4, float f5, float f6) {
        C14863d c14863d = new C14863d(f, f2, f3, f4);
        c14863d.m35882s(f5);
        c14863d.m35883t(f6);
        this.f32389g.add(c14863d);
        C14861b c14861b = new C14861b(c14863d);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m35843c(c14861b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        m35858r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m35859s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void m35842b(float f) {
        if (m35847g() == f) {
            return;
        }
        float fM35847g = ((f - m35847g()) + 360.0f) % 360.0f;
        if (fM35847g > 180.0f) {
            return;
        }
        C14863d c14863d = new C14863d(m35849i(), m35850j(), m35849i(), m35850j());
        c14863d.m35882s(m35847g());
        c14863d.m35883t(fM35847g);
        this.f32390h.add(new C14861b(c14863d));
        m35856p(f);
    }

    /* renamed from: c */
    public final void m35843c(AbstractC14866g abstractC14866g, float f, float f2) {
        m35842b(f);
        this.f32390h.add(abstractC14866g);
        m35856p(f2);
    }

    /* renamed from: d */
    public void m35844d(Matrix matrix, Path path) {
        int size = this.f32389g.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC14865f) this.f32389g.get(i)).mo35872a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean m35845e() {
        return this.f32391i;
    }

    /* renamed from: f */
    public AbstractC14866g m35846f(Matrix matrix) {
        m35842b(m35848h());
        return new C14860a(new ArrayList(this.f32390h), new Matrix(matrix));
    }

    /* renamed from: g */
    public final float m35847g() {
        return this.f32387e;
    }

    /* renamed from: h */
    public final float m35848h() {
        return this.f32388f;
    }

    /* renamed from: i */
    public float m35849i() {
        return this.f32385c;
    }

    /* renamed from: j */
    public float m35850j() {
        return this.f32386d;
    }

    /* renamed from: k */
    public float m35851k() {
        return this.f32383a;
    }

    /* renamed from: l */
    public float m35852l() {
        return this.f32384b;
    }

    /* renamed from: m */
    public void m35853m(float f, float f2) {
        C14864e c14864e = new C14864e();
        c14864e.f32406b = f;
        c14864e.f32407c = f2;
        this.f32389g.add(c14864e);
        C14862c c14862c = new C14862c(c14864e, m35849i(), m35850j());
        m35843c(c14862c, c14862c.m35863c() + 270.0f, c14862c.m35863c() + 270.0f);
        m35858r(f);
        m35859s(f2);
    }

    /* renamed from: n */
    public void m35854n(float f, float f2) {
        m35855o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m35855o(float f, float f2, float f3, float f4) {
        m35860t(f);
        m35861u(f2);
        m35858r(f);
        m35859s(f2);
        m35856p(f3);
        m35857q((f3 + f4) % 360.0f);
        this.f32389g.clear();
        this.f32390h.clear();
        this.f32391i = false;
    }

    /* renamed from: p */
    public final void m35856p(float f) {
        this.f32387e = f;
    }

    /* renamed from: q */
    public final void m35857q(float f) {
        this.f32388f = f;
    }

    /* renamed from: r */
    public final void m35858r(float f) {
        this.f32385c = f;
    }

    /* renamed from: s */
    public final void m35859s(float f) {
        this.f32386d = f;
    }

    /* renamed from: t */
    public final void m35860t(float f) {
        this.f32383a = f;
    }

    /* renamed from: u */
    public final void m35861u(float f) {
        this.f32384b = f;
    }
}
