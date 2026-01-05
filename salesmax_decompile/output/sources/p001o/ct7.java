package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.net.URL;

/* loaded from: classes.dex */
public class ct7 extends hme {
    public ct7(ComponentCallbacks2C10724a componentCallbacks2C10724a, qca qcaVar, kme kmeVar, Context context) {
        super(componentCallbacks2C10724a, qcaVar, kmeVar, context);
    }

    @Override // p001o.hme
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public bt7 mo21760c(Class cls) {
        return new bt7(this.f27176a, this, cls, this.f27177b);
    }

    @Override // p001o.hme
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public bt7 mo21761f() {
        return (bt7) super.mo21761f();
    }

    @Override // p001o.hme
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public bt7 mo21762k() {
        return (bt7) super.mo21762k();
    }

    /* renamed from: F */
    public bt7 m21755F(Drawable drawable) {
        return (bt7) super.m30824p(drawable);
    }

    /* renamed from: G */
    public bt7 m21756G(Uri uri) {
        return (bt7) super.m30825q(uri);
    }

    /* renamed from: H */
    public bt7 m21757H(Integer num) {
        return (bt7) super.m30826r(num);
    }

    /* renamed from: I */
    public bt7 m21758I(String str) {
        return (bt7) super.m30827s(str);
    }

    /* renamed from: J */
    public bt7 m21759J(URL url) {
        return (bt7) super.m30828t(url);
    }

    @Override // p001o.hme
    /* renamed from: y */
    public void mo21763y(qme qmeVar) {
        if (qmeVar instanceof at7) {
            super.mo21763y(qmeVar);
        } else {
            super.mo21763y(new at7().mo17815a(qmeVar));
        }
    }
}
