package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class ld0 implements mc2 {

    /* renamed from: a */
    public Canvas f33632a = md0.f35188a;

    /* renamed from: b */
    public final Rect f33633b = new Rect();

    /* renamed from: c */
    public final Rect f33634c = new Rect();

    @Override // p001o.mc2
    /* renamed from: b */
    public void mo20332b(float f, float f2, float f3, float f4, int i) {
        this.f33632a.clipRect(f, f2, f3, f4, m36966o(i));
    }

    @Override // p001o.mc2
    /* renamed from: c */
    public void mo20333c(float f, float f2) {
        this.f33632a.translate(f, f2);
    }

    @Override // p001o.mc2
    /* renamed from: d */
    public void mo20334d() {
        this.f33632a.restore();
    }

    @Override // p001o.mc2
    /* renamed from: e */
    public void mo20335e() {
        sc2.f45165a.m48149a(this.f33632a, true);
    }

    @Override // p001o.mc2
    /* renamed from: g */
    public void mo20336g() {
        this.f33632a.save();
    }

    @Override // p001o.mc2
    /* renamed from: h */
    public void mo20337h() {
        sc2.f45165a.m48149a(this.f33632a, false);
    }

    @Override // p001o.mc2
    /* renamed from: i */
    public void mo20338i(float f, float f2, float f3, float f4, ewc ewcVar) {
        sq8.m48649h(ewcVar, "paint");
        this.f33632a.drawRect(f, f2, f3, f4, ewcVar.mo16979b());
    }

    @Override // p001o.mc2
    /* renamed from: j */
    public void mo20339j(float[] fArr) {
        sq8.m48649h(fArr, "matrix");
        if (tza.m50807a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        ze0.m59284a(matrix, fArr);
        this.f33632a.concat(matrix);
    }

    @Override // p001o.mc2
    /* renamed from: l */
    public void mo20340l(xzc xzcVar, int i) {
        sq8.m48649h(xzcVar, ClientCookie.PATH_ATTR);
        Canvas canvas = this.f33632a;
        if (!(xzcVar instanceof cf0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((cf0) xzcVar).m21114b(), m36966o(i));
    }

    /* renamed from: m */
    public final Canvas m36964m() {
        return this.f33632a;
    }

    /* renamed from: n */
    public final void m36965n(Canvas canvas) {
        sq8.m48649h(canvas, "<set-?>");
        this.f33632a = canvas;
    }

    /* renamed from: o */
    public final Region.Op m36966o(int i) {
        return db3.m22719d(i, db3.f19509a.m22720a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
