package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class my5 implements xuh {

    /* renamed from: b */
    public final xuh f36093b;

    /* renamed from: c */
    public final boolean f36094c;

    public my5(xuh xuhVar, boolean z) {
        this.f36093b = xuhVar;
        this.f36094c = z;
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        this.f36093b.mo19806a(messageDigest);
    }

    @Override // p001o.xuh
    /* renamed from: b */
    public zne mo26072b(Context context, zne zneVar, int i, int i2) {
        mi1 mi1VarM12656f = ComponentCallbacks2C10724a.m12647c(context).m12656f();
        Drawable drawable = (Drawable) zneVar.get();
        zne zneVarM38102a = ly5.m38102a(mi1VarM12656f, drawable, i, i2);
        if (zneVarM38102a != null) {
            zne zneVarMo26072b = this.f36093b.mo26072b(context, zneVarM38102a, i, i2);
            if (!zneVarMo26072b.equals(zneVarM38102a)) {
                return m39817d(context, zneVarMo26072b);
            }
            zneVarMo26072b.mo19618b();
            return zneVar;
        }
        if (!this.f36094c) {
            return zneVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* renamed from: c */
    public xuh m39816c() {
        return this;
    }

    /* renamed from: d */
    public final zne m39817d(Context context, zne zneVar) {
        return li9.m37309d(context.getResources(), zneVar);
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (obj instanceof my5) {
            return this.f36093b.equals(((my5) obj).f36093b);
        }
        return false;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return this.f36093b.hashCode();
    }
}
