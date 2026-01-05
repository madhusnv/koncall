package p001o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.List;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class uh8 extends yy5 {

    /* renamed from: Y */
    public ez5 f48938Y;

    /* renamed from: Z */
    public th8 f48939Z;
    public Drawable h0;

    public uh8(Context context, je1 je1Var, ez5 ez5Var, th8 th8Var) {
        super(context, je1Var);
        m51574B(ez5Var);
        m51573A(th8Var);
    }

    /* renamed from: v */
    public static uh8 m51571v(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, w93 w93Var) {
        uh8 uh8Var = new uh8(context, circularProgressIndicatorSpec, w93Var, circularProgressIndicatorSpec.f12815o == 1 ? new y93(context, circularProgressIndicatorSpec) : new x93(circularProgressIndicatorSpec));
        uh8Var.m51575C(hsi.m31061b(context.getResources(), u7e.indeterminate_static, null));
        return uh8Var;
    }

    /* renamed from: w */
    public static uh8 m51572w(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, oda odaVar) {
        return new uh8(context, linearProgressIndicatorSpec, odaVar, linearProgressIndicatorSpec.f12821o == 0 ? new pda(linearProgressIndicatorSpec) : new qda(context, linearProgressIndicatorSpec));
    }

    /* renamed from: A */
    public void m51573A(th8 th8Var) {
        this.f48939Z = th8Var;
        th8Var.m49882e(this);
    }

    /* renamed from: B */
    public void m51574B(ez5 ez5Var) {
        this.f48938Y = ez5Var;
    }

    /* renamed from: C */
    public void m51575C(Drawable drawable) {
        this.h0 = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f56257Q)) {
            if (m51585z() && (drawable = this.h0) != null) {
                drawable.setBounds(getBounds());
                this.h0.setTint(this.f56259b.f30237e[0]);
                this.h0.draw(canvas);
                return;
            }
            canvas.save();
            this.f48938Y.m25869h(canvas, getBounds(), m58475h(), mo51578m(), mo51577l());
            int i = this.f56259b.f30241i;
            int alpha = getAlpha();
            je1 je1Var = this.f56259b;
            boolean z = (je1Var instanceof LinearProgressIndicatorSpec) || ((je1Var instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) je1Var).f12819s);
            boolean z2 = z && i == 0 && !je1Var.m33608b(false);
            if (z2) {
                this.f48938Y.mo25865d(canvas, this.f56255L, 0.0f, 1.0f, this.f56259b.f30238f, alpha, 0);
            } else if (z) {
                ez5.C13289a c13289a = (ez5.C13289a) this.f48939Z.f47132b.get(0);
                List list = this.f48939Z.f47132b;
                ez5.C13289a c13289a2 = (ez5.C13289a) list.get(list.size() - 1);
                ez5 ez5Var = this.f48938Y;
                if (ez5Var instanceof oda) {
                    ez5Var.mo25865d(canvas, this.f56255L, 0.0f, c13289a.f22432a, this.f56259b.f30238f, alpha, i);
                    this.f48938Y.mo25865d(canvas, this.f56255L, c13289a2.f22433b, 1.0f, this.f56259b.f30238f, alpha, i);
                } else {
                    canvas.save();
                    canvas.rotate(c13289a2.f22438g);
                    this.f48938Y.mo25865d(canvas, this.f56255L, c13289a2.f22433b, 1.0f + c13289a.f22432a, this.f56259b.f30238f, alpha, i);
                    canvas.restore();
                }
            }
            for (int i2 = 0; i2 < this.f48939Z.f47132b.size(); i2++) {
                ez5.C13289a c13289a3 = (ez5.C13289a) this.f48939Z.f47132b.get(i2);
                c13289a3.f22437f = m58476i();
                this.f48938Y.mo25864c(canvas, this.f56255L, c13289a3, getAlpha());
                if (i2 > 0 && !z2 && z) {
                    this.f48938Y.mo25865d(canvas, this.f56255L, ((ez5.C13289a) this.f48939Z.f47132b.get(i2 - 1)).f22433b, c13289a3.f22432a, this.f56259b.f30238f, alpha, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f48938Y.mo25866e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f48938Y.mo25867f();
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p001o.yy5
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo51576j() {
        return super.mo51576j();
    }

    @Override // p001o.yy5
    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo51577l() {
        return super.mo51577l();
    }

    @Override // p001o.yy5
    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo51578m() {
        return super.mo51578m();
    }

    @Override // p001o.yy5
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo51579o(dg0 dg0Var) {
        super.mo51579o(dg0Var);
    }

    @Override // p001o.yy5
    /* renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo51580s(boolean z, boolean z2, boolean z3) {
        return super.mo51580s(z, z2, z3);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p001o.yy5
    /* renamed from: t */
    public boolean mo51581t(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zMo51581t = super.mo51581t(z, z2, z3);
        if (m51585z() && (drawable = this.h0) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.f48939Z.mo43471a();
        }
        if (z && z3) {
            this.f48939Z.mo43475g();
        }
        return zMo51581t;
    }

    @Override // p001o.yy5
    /* renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo51582u(dg0 dg0Var) {
        return super.mo51582u(dg0Var);
    }

    /* renamed from: x */
    public th8 m51583x() {
        return this.f48939Z;
    }

    /* renamed from: y */
    public ez5 m51584y() {
        return this.f48938Y;
    }

    /* renamed from: z */
    public final boolean m51585z() {
        jh0 jh0Var = this.f56260c;
        return jh0Var != null && jh0Var.m33830a(this.f56258a.getContentResolver()) == 0.0f;
    }
}
