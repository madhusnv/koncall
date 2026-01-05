package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class ns7 implements xuh {

    /* renamed from: b */
    public final xuh f37233b;

    public ns7(xuh xuhVar) {
        this.f37233b = (xuh) bgd.m18886d(xuhVar);
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        this.f37233b.mo19806a(messageDigest);
    }

    @Override // p001o.xuh
    /* renamed from: b */
    public zne mo26072b(Context context, zne zneVar, int i, int i2) {
        js7 js7Var = (js7) zneVar.get();
        zne oi1Var = new oi1(js7Var.m34459e(), ComponentCallbacks2C10724a.m12647c(context).m12656f());
        zne zneVarMo26072b = this.f37233b.mo26072b(context, oi1Var, i, i2);
        if (!oi1Var.equals(zneVarMo26072b)) {
            oi1Var.mo19618b();
        }
        js7Var.m34467m(this.f37233b, (Bitmap) zneVarMo26072b.get());
        return zneVar;
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (obj instanceof ns7) {
            return this.f37233b.equals(((ns7) obj).f37233b);
        }
        return false;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return this.f37233b.hashCode();
    }
}
