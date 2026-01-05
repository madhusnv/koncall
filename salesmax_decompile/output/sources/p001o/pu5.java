package p001o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import com.google.android.material.chip.Chip;
import com.ortiz.touchview.TouchImageView;

/* loaded from: classes.dex */
public class pu5 {

    /* renamed from: a */
    public static pu5 f40590a = new pu5();

    /* renamed from: o.pu5$a */
    public class C16195a extends li4 {

        /* renamed from: d */
        public final /* synthetic */ Chip f40591d;

        /* renamed from: e */
        public final /* synthetic */ String f40592e;

        public C16195a(Chip chip, String str) {
            this.f40591d = chip;
            this.f40592e = str;
        }

        @Override // p001o.pjg
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo40415i(Drawable drawable, mvh mvhVar) {
            if (this.f40591d.getTag() == null || !this.f40591d.getTag().equals(this.f40592e)) {
                return;
            }
            this.f40591d.setChipIcon(drawable);
        }

        @Override // p001o.pjg
        /* renamed from: h */
        public void mo36385h(Drawable drawable) {
            if (this.f40591d.getTag() == null || !this.f40591d.getTag().equals(this.f40592e)) {
                return;
            }
            this.f40591d.setChipIcon(null);
        }
    }

    /* renamed from: b */
    public static pu5 m44193b() {
        return f40590a;
    }

    /* renamed from: a */
    public final qme m44194a() {
        return (qme) ((qme) new qme().mo17819i(qt5.f42386e)).mo17813V(100, 100);
    }

    /* renamed from: c */
    public void m44195c(Chip chip, String str) {
        od8 od8Var = new od8();
        od8Var.m42073b(str);
        chip.setTag(str);
        ((yle) ComponentCallbacks2C10724a.m12653t(chip.getContext()).mo21762k().mo19715f()).n0(m44194a()).F0(od8Var).w0(new C16195a(chip, str));
    }

    /* renamed from: d */
    public void m44196d(ImageView imageView, String str) {
        od8 od8Var = new od8();
        od8Var.m42073b(str);
        ((yle) ComponentCallbacks2C10724a.m12653t(imageView.getContext()).mo21761f().mo19715f()).F0(od8Var).A0(imageView);
    }

    /* renamed from: e */
    public void m44197e(ImageView imageView, String str) {
        od8 od8Var = new od8();
        od8Var.m42073b(str);
        ComponentCallbacks2C10724a.m12653t(imageView.getContext()).mo21761f().F0(od8Var).A0(imageView);
    }

    /* renamed from: f */
    public void m44198f(TouchImageView touchImageView, String str) {
        od8 od8Var = new od8();
        od8Var.m42073b(str);
        ComponentCallbacks2C10724a.m12653t(touchImageView.getContext()).mo21761f().F0(od8Var).A0(touchImageView);
    }
}
