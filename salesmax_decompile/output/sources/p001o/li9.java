package p001o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes5.dex */
public final class li9 implements zne, ji8 {

    /* renamed from: a */
    public final Resources f33895a;

    /* renamed from: b */
    public final zne f33896b;

    public li9(Resources resources, zne zneVar) {
        this.f33895a = (Resources) bgd.m18886d(resources);
        this.f33896b = (zne) bgd.m18886d(zneVar);
    }

    /* renamed from: d */
    public static zne m37309d(Resources resources, zne zneVar) {
        if (zneVar == null) {
            return null;
        }
        return new li9(resources, zneVar);
    }

    @Override // p001o.ji8
    /* renamed from: a */
    public void mo33860a() {
        zne zneVar = this.f33896b;
        if (zneVar instanceof ji8) {
            ((ji8) zneVar).mo33860a();
        }
    }

    @Override // p001o.zne
    /* renamed from: b */
    public void mo19618b() {
        this.f33896b.mo19618b();
    }

    @Override // p001o.zne
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f33895a, (Bitmap) this.f33896b.get());
    }

    @Override // p001o.zne
    /* renamed from: j */
    public int mo19619j() {
        return this.f33896b.mo19619j();
    }

    @Override // p001o.zne
    /* renamed from: k */
    public Class mo19620k() {
        return BitmapDrawable.class;
    }
}
