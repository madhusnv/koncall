package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.InterfaceC11004c;
import p001o.oza;

/* renamed from: com.google.android.material.circularreveal.b */
/* loaded from: classes3.dex */
public class C11003b {

    /* renamed from: a */
    public final a f12363a;

    /* renamed from: b */
    public final View f12364b;

    /* renamed from: c */
    public final Path f12365c;

    /* renamed from: d */
    public final Paint f12366d;

    /* renamed from: e */
    public final Paint f12367e;

    /* renamed from: f */
    public InterfaceC11004c.e f12368f;

    /* renamed from: g */
    public Drawable f12369g;

    /* renamed from: h */
    public boolean f12370h;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface a {
        /* renamed from: c */
        void mo14418c(Canvas canvas);

        /* renamed from: d */
        boolean mo14419d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11003b(a aVar) {
        this.f12363a = aVar;
        View view = (View) aVar;
        this.f12364b = view;
        view.setWillNotDraw(false);
        this.f12365c = new Path();
        this.f12366d = new Paint(7);
        Paint paint = new Paint(1);
        this.f12367e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public void m14422a() {
    }

    /* renamed from: b */
    public void m14423b() {
    }

    /* renamed from: c */
    public void m14424c(Canvas canvas) {
        if (m14435n()) {
            this.f12363a.mo14418c(canvas);
            if (m14437p()) {
                canvas.drawRect(0.0f, 0.0f, this.f12364b.getWidth(), this.f12364b.getHeight(), this.f12367e);
            }
        } else {
            this.f12363a.mo14418c(canvas);
            if (m14437p()) {
                canvas.drawRect(0.0f, 0.0f, this.f12364b.getWidth(), this.f12364b.getHeight(), this.f12367e);
            }
        }
        m14425d(canvas);
    }

    /* renamed from: d */
    public final void m14425d(Canvas canvas) {
        if (m14436o()) {
            Rect bounds = this.f12369g.getBounds();
            float fWidth = this.f12368f.f12375a - (bounds.width() / 2.0f);
            float fHeight = this.f12368f.f12376b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f12369g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    /* renamed from: e */
    public Drawable m14426e() {
        return this.f12369g;
    }

    /* renamed from: f */
    public int m14427f() {
        return this.f12367e.getColor();
    }

    /* renamed from: g */
    public final float m14428g(InterfaceC11004c.e eVar) {
        return oza.m42804c(eVar.f12375a, eVar.f12376b, 0.0f, 0.0f, this.f12364b.getWidth(), this.f12364b.getHeight());
    }

    /* renamed from: h */
    public InterfaceC11004c.e m14429h() {
        InterfaceC11004c.e eVar = this.f12368f;
        if (eVar == null) {
            return null;
        }
        InterfaceC11004c.e eVar2 = new InterfaceC11004c.e(eVar);
        if (eVar2.m14443a()) {
            eVar2.f12377c = m14428g(eVar2);
        }
        return eVar2;
    }

    /* renamed from: i */
    public final void m14430i() {
        this.f12364b.invalidate();
    }

    /* renamed from: j */
    public boolean m14431j() {
        return this.f12363a.mo14419d() && !m14435n();
    }

    /* renamed from: k */
    public void m14432k(Drawable drawable) {
        this.f12369g = drawable;
        this.f12364b.invalidate();
    }

    /* renamed from: l */
    public void m14433l(int i) {
        this.f12367e.setColor(i);
        this.f12364b.invalidate();
    }

    /* renamed from: m */
    public void m14434m(InterfaceC11004c.e eVar) {
        if (eVar == null) {
            this.f12368f = null;
        } else {
            InterfaceC11004c.e eVar2 = this.f12368f;
            if (eVar2 == null) {
                this.f12368f = new InterfaceC11004c.e(eVar);
            } else {
                eVar2.m14445c(eVar);
            }
            if (oza.m42806e(eVar.f12377c, m14428g(eVar), 1.0E-4f)) {
                this.f12368f.f12377c = Float.MAX_VALUE;
            }
        }
        m14430i();
    }

    /* renamed from: n */
    public final boolean m14435n() {
        InterfaceC11004c.e eVar = this.f12368f;
        return !(eVar == null || eVar.m14443a());
    }

    /* renamed from: o */
    public final boolean m14436o() {
        return (this.f12370h || this.f12369g == null || this.f12368f == null) ? false : true;
    }

    /* renamed from: p */
    public final boolean m14437p() {
        return (this.f12370h || Color.alpha(this.f12367e.getColor()) == 0) ? false : true;
    }
}
