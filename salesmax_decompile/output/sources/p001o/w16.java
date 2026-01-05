package p001o;

import android.app.Activity;
import android.graphics.Bitmap;
import p001o.v16;

/* loaded from: classes3.dex */
public class w16 {

    /* renamed from: e */
    public static final v16.InterfaceC17497f f51263e = new C17737a();

    /* renamed from: f */
    public static final v16.InterfaceC17496e f51264f = new C17738b();

    /* renamed from: a */
    public final int f51265a;

    /* renamed from: b */
    public final v16.InterfaceC17497f f51266b;

    /* renamed from: c */
    public final v16.InterfaceC17496e f51267c;

    /* renamed from: d */
    public Integer f51268d;

    /* renamed from: o.w16$a */
    public class C17737a implements v16.InterfaceC17497f {
        @Override // p001o.v16.InterfaceC17497f
        /* renamed from: a */
        public boolean mo52225a(Activity activity, int i) {
            return true;
        }
    }

    /* renamed from: o.w16$b */
    public class C17738b implements v16.InterfaceC17496e {
        @Override // p001o.v16.InterfaceC17496e
        /* renamed from: a */
        public void mo52224a(Activity activity) {
        }
    }

    /* renamed from: o.w16$c */
    public static class C17739c {

        /* renamed from: a */
        public int f51269a;

        /* renamed from: b */
        public v16.InterfaceC17497f f51270b = w16.f51263e;

        /* renamed from: c */
        public v16.InterfaceC17496e f51271c = w16.f51264f;

        /* renamed from: d */
        public Bitmap f51272d;

        /* renamed from: e */
        public Integer f51273e;

        /* renamed from: f */
        public w16 m53778f() {
            return new w16(this, null);
        }
    }

    public /* synthetic */ w16(C17739c c17739c, C17737a c17737a) {
        this(c17739c);
    }

    /* renamed from: c */
    public static int m53768c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return ((Integer) h6f.m29841a(b4e.m18147a(iArr, 128)).get(0)).intValue();
    }

    /* renamed from: d */
    public Integer m53769d() {
        return this.f51268d;
    }

    /* renamed from: e */
    public v16.InterfaceC17496e m53770e() {
        return this.f51267c;
    }

    /* renamed from: f */
    public v16.InterfaceC17497f m53771f() {
        return this.f51266b;
    }

    /* renamed from: g */
    public int m53772g() {
        return this.f51265a;
    }

    public w16(C17739c c17739c) {
        this.f51265a = c17739c.f51269a;
        this.f51266b = c17739c.f51270b;
        this.f51267c = c17739c.f51271c;
        if (c17739c.f51273e != null) {
            this.f51268d = c17739c.f51273e;
        } else if (c17739c.f51272d != null) {
            this.f51268d = Integer.valueOf(m53768c(c17739c.f51272d));
        }
    }
}
