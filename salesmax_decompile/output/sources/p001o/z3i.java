package p001o;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class z3i implements ioe {

    /* renamed from: o.z3i$a */
    public static final class C18548a implements zne {

        /* renamed from: a */
        public final Bitmap f56471a;

        public C18548a(Bitmap bitmap) {
            this.f56471a = bitmap;
        }

        @Override // p001o.zne
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f56471a;
        }

        @Override // p001o.zne
        /* renamed from: b */
        public void mo19618b() {
        }

        @Override // p001o.zne
        /* renamed from: j */
        public int mo19619j() {
            return uqi.m51926g(this.f56471a);
        }

        @Override // p001o.zne
        /* renamed from: k */
        public Class mo19620k() {
            return Bitmap.class;
        }
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(Bitmap bitmap, int i, int i2, rec recVar) {
        return new C18548a(bitmap);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(Bitmap bitmap, rec recVar) {
        return true;
    }
}
