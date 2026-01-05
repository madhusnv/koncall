package p001o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p001o.mvh;

/* loaded from: classes5.dex */
public abstract class ne8 extends kzi implements mvh.InterfaceC15437a {

    /* renamed from: h */
    public Animatable f36748h;

    public ne8(ImageView imageView) {
        super(imageView);
    }

    @Override // p001o.mvh.InterfaceC15437a
    /* renamed from: c */
    public void mo39728c(Drawable drawable) {
        ((ImageView) this.f32894a).setImageDrawable(drawable);
    }

    @Override // p001o.mvh.InterfaceC15437a
    /* renamed from: f */
    public Drawable mo39729f() {
        return ((ImageView) this.f32894a).getDrawable();
    }

    @Override // p001o.kzi, p001o.qe1, p001o.pjg
    /* renamed from: g */
    public void mo36384g(Drawable drawable) {
        super.mo36384g(drawable);
        m40417q(null);
        mo39728c(drawable);
    }

    @Override // p001o.kzi, p001o.qe1, p001o.pjg
    /* renamed from: h */
    public void mo36385h(Drawable drawable) {
        super.mo36385h(drawable);
        Animatable animatable = this.f36748h;
        if (animatable != null) {
            animatable.stop();
        }
        m40417q(null);
        mo39728c(drawable);
    }

    @Override // p001o.pjg
    /* renamed from: i */
    public void mo40415i(Object obj, mvh mvhVar) {
        if (mvhVar == null || !mvhVar.mo31286a(obj, this)) {
            m40417q(obj);
        } else {
            m40416o(obj);
        }
    }

    @Override // p001o.qe1, p001o.pjg
    /* renamed from: j */
    public void mo37266j(Drawable drawable) {
        super.mo37266j(drawable);
        m40417q(null);
        mo39728c(drawable);
    }

    /* renamed from: o */
    public final void m40416o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f36748h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f36748h = animatable;
        animatable.start();
    }

    @Override // p001o.vca
    public void onStart() {
        Animatable animatable = this.f36748h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p001o.vca
    public void onStop() {
        Animatable animatable = this.f36748h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public abstract void mo34669p(Object obj);

    /* renamed from: q */
    public final void m40417q(Object obj) {
        mo34669p(obj);
        m40416o(obj);
    }
}
