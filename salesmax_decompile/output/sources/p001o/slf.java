package p001o;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import p001o.nc2;

/* loaded from: classes3.dex */
public abstract class slf {

    /* renamed from: c */
    public ykf f45622c;

    /* renamed from: a */
    public boolean f45620a = false;

    /* renamed from: b */
    public boolean f45621b = false;

    /* renamed from: d */
    public RectF f45623d = new RectF();

    /* renamed from: e */
    public final Path f45624e = new Path();

    /* renamed from: a */
    public static slf m48489a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new ulf(view) : new tlf(view);
    }

    /* renamed from: b */
    public abstract void mo48490b(View view);

    /* renamed from: c */
    public boolean m48491c() {
        return this.f45620a;
    }

    /* renamed from: d */
    public final boolean m48492d() {
        RectF rectF = this.f45623d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    /* renamed from: e */
    public void m48493e(Canvas canvas, nc2.InterfaceC15542a interfaceC15542a) {
        if (!mo48498j() || this.f45624e.isEmpty()) {
            interfaceC15542a.mo40312a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f45624e);
        interfaceC15542a.mo40312a(canvas);
        canvas.restore();
    }

    /* renamed from: f */
    public void m48494f(View view, RectF rectF) {
        this.f45623d = rectF;
        m48499k();
        mo48490b(view);
    }

    /* renamed from: g */
    public void m48495g(View view, ykf ykfVar) {
        this.f45622c = ykfVar;
        m48499k();
        mo48490b(view);
    }

    /* renamed from: h */
    public void m48496h(View view, boolean z) {
        if (z != this.f45620a) {
            this.f45620a = z;
            mo48490b(view);
        }
    }

    /* renamed from: i */
    public void m48497i(View view, boolean z) {
        this.f45621b = z;
        mo48490b(view);
    }

    /* renamed from: j */
    public abstract boolean mo48498j();

    /* renamed from: k */
    public final void m48499k() {
        if (!m48492d() || this.f45622c == null) {
            return;
        }
        zkf.m59551l().m59555d(this.f45622c, 1.0f, this.f45623d, this.f45624e);
    }
}
