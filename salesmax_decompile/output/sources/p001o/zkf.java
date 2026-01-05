package p001o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class zkf {

    /* renamed from: a */
    public final klf[] f57335a = new klf[4];

    /* renamed from: b */
    public final Matrix[] f57336b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f57337c = new Matrix[4];

    /* renamed from: d */
    public final PointF f57338d = new PointF();

    /* renamed from: e */
    public final Path f57339e = new Path();

    /* renamed from: f */
    public final Path f57340f = new Path();

    /* renamed from: g */
    public final klf f57341g = new klf();

    /* renamed from: h */
    public final float[] f57342h = new float[2];

    /* renamed from: i */
    public final float[] f57343i = new float[2];

    /* renamed from: j */
    public final Path f57344j = new Path();

    /* renamed from: k */
    public final Path f57345k = new Path();

    /* renamed from: l */
    public boolean f57346l = true;

    /* renamed from: o.zkf$a */
    public static class C18676a {

        /* renamed from: a */
        public static final zkf f57347a = new zkf();
    }

    /* renamed from: o.zkf$b */
    public interface InterfaceC18677b {
        /* renamed from: a */
        void mo59566a(klf klfVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo59567b(klf klfVar, Matrix matrix, int i);
    }

    /* renamed from: o.zkf$c */
    public static final class C18678c {

        /* renamed from: a */
        public final ykf f57348a;

        /* renamed from: b */
        public final Path f57349b;

        /* renamed from: c */
        public final RectF f57350c;

        /* renamed from: d */
        public final InterfaceC18677b f57351d;

        /* renamed from: e */
        public final float f57352e;

        public C18678c(ykf ykfVar, float f, RectF rectF, InterfaceC18677b interfaceC18677b, Path path) {
            this.f57351d = interfaceC18677b;
            this.f57348a = ykfVar;
            this.f57352e = f;
            this.f57350c = rectF;
            this.f57349b = path;
        }
    }

    public zkf() {
        for (int i = 0; i < 4; i++) {
            this.f57335a[i] = new klf();
            this.f57336b[i] = new Matrix();
            this.f57337c[i] = new Matrix();
        }
    }

    /* renamed from: l */
    public static zkf m59551l() {
        return C18676a.f57347a;
    }

    /* renamed from: a */
    public final float m59552a(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* renamed from: b */
    public final void m59553b(C18678c c18678c, int i) {
        this.f57342h[0] = this.f57335a[i].m35851k();
        this.f57342h[1] = this.f57335a[i].m35852l();
        this.f57336b[i].mapPoints(this.f57342h);
        if (i == 0) {
            Path path = c18678c.f57349b;
            float[] fArr = this.f57342h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c18678c.f57349b;
            float[] fArr2 = this.f57342h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f57335a[i].m35844d(this.f57336b[i], c18678c.f57349b);
        InterfaceC18677b interfaceC18677b = c18678c.f57351d;
        if (interfaceC18677b != null) {
            interfaceC18677b.mo59566a(this.f57335a[i], this.f57336b[i], i);
        }
    }

    /* renamed from: c */
    public final void m59554c(C18678c c18678c, int i) {
        int i2 = (i + 1) % 4;
        this.f57342h[0] = this.f57335a[i].m35849i();
        this.f57342h[1] = this.f57335a[i].m35850j();
        this.f57336b[i].mapPoints(this.f57342h);
        this.f57343i[0] = this.f57335a[i2].m35851k();
        this.f57343i[1] = this.f57335a[i2].m35852l();
        this.f57336b[i2].mapPoints(this.f57343i);
        float f = this.f57342h[0];
        float[] fArr = this.f57343i;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fM59561j = m59561j(c18678c.f57350c, i);
        this.f57341g.m35854n(0.0f, 0.0f);
        e36 e36VarM59562k = m59562k(i, c18678c.f57348a);
        e36VarM59562k.mo24170b(fMax, fM59561j, c18678c.f57352e, this.f57341g);
        this.f57344j.reset();
        this.f57341g.m35844d(this.f57337c[i], this.f57344j);
        if (this.f57346l && (e36VarM59562k.mo24169a() || m59563m(this.f57344j, i) || m59563m(this.f57344j, i2))) {
            Path path = this.f57344j;
            path.op(path, this.f57340f, Path.Op.DIFFERENCE);
            this.f57342h[0] = this.f57341g.m35851k();
            this.f57342h[1] = this.f57341g.m35852l();
            this.f57337c[i].mapPoints(this.f57342h);
            Path path2 = this.f57339e;
            float[] fArr2 = this.f57342h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f57341g.m35844d(this.f57337c[i], this.f57339e);
        } else {
            this.f57341g.m35844d(this.f57337c[i], c18678c.f57349b);
        }
        InterfaceC18677b interfaceC18677b = c18678c.f57351d;
        if (interfaceC18677b != null) {
            interfaceC18677b.mo59567b(this.f57341g, this.f57337c[i], i);
        }
    }

    /* renamed from: d */
    public void m59555d(ykf ykfVar, float f, RectF rectF, Path path) {
        m59556e(ykfVar, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m59556e(ykf ykfVar, float f, RectF rectF, InterfaceC18677b interfaceC18677b, Path path) {
        m59557f(ykfVar, null, f, rectF, interfaceC18677b, path);
    }

    /* renamed from: f */
    public void m59557f(ykf ykfVar, float[] fArr, float f, RectF rectF, InterfaceC18677b interfaceC18677b, Path path) {
        path.rewind();
        this.f57339e.rewind();
        this.f57340f.rewind();
        this.f57340f.addRect(rectF, Path.Direction.CW);
        C18678c c18678c = new C18678c(ykfVar, f, rectF, interfaceC18677b, path);
        for (int i = 0; i < 4; i++) {
            m59564n(c18678c, i, fArr);
            m59565o(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m59553b(c18678c, i2);
            m59554c(c18678c, i2);
        }
        path.close();
        this.f57339e.close();
        if (this.f57339e.isEmpty()) {
            return;
        }
        path.op(this.f57339e, Path.Op.UNION);
    }

    /* renamed from: g */
    public final void m59558g(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: h */
    public n74 m59559h(int i, ykf ykfVar) {
        return i != 1 ? i != 2 ? i != 3 ? ykfVar.m57940t() : ykfVar.m57938r() : ykfVar.m57931j() : ykfVar.m57933l();
    }

    /* renamed from: i */
    public final o74 m59560i(int i, ykf ykfVar) {
        return i != 1 ? i != 2 ? i != 3 ? ykfVar.m57939s() : ykfVar.m57937q() : ykfVar.m57930i() : ykfVar.m57932k();
    }

    /* renamed from: j */
    public final float m59561j(RectF rectF, int i) {
        float[] fArr = this.f57342h;
        klf klfVar = this.f57335a[i];
        fArr[0] = klfVar.f32385c;
        fArr[1] = klfVar.f32386d;
        this.f57336b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.f57342h[0]) : Math.abs(rectF.centerY() - this.f57342h[1]);
    }

    /* renamed from: k */
    public final e36 m59562k(int i, ykf ykfVar) {
        return i != 1 ? i != 2 ? i != 3 ? ykfVar.m57935o() : ykfVar.m57936p() : ykfVar.m57934n() : ykfVar.m57929h();
    }

    /* renamed from: m */
    public final boolean m59563m(Path path, int i) {
        this.f57345k.reset();
        this.f57335a[i].m35844d(this.f57336b[i], this.f57345k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f57345k.computeBounds(rectF, true);
        path.op(this.f57345k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: n */
    public final void m59564n(C18678c c18678c, int i, float[] fArr) {
        m59560i(i, c18678c.f57348a).m41656b(this.f57335a[i], 90.0f, c18678c.f57352e, c18678c.f57350c, fArr == null ? m59559h(i, c18678c.f57348a) : new ca3(fArr[i]));
        float fM59552a = m59552a(i);
        this.f57336b[i].reset();
        m59558g(i, c18678c.f57350c, this.f57338d);
        Matrix matrix = this.f57336b[i];
        PointF pointF = this.f57338d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f57336b[i].preRotate(fM59552a);
    }

    /* renamed from: o */
    public final void m59565o(int i) {
        this.f57342h[0] = this.f57335a[i].m35849i();
        this.f57342h[1] = this.f57335a[i].m35850j();
        this.f57336b[i].mapPoints(this.f57342h);
        float fM59552a = m59552a(i);
        this.f57337c[i].reset();
        Matrix matrix = this.f57337c[i];
        float[] fArr = this.f57342h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f57337c[i].preRotate(fM59552a);
    }
}
