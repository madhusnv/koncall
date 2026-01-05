package p001o;

import com.google.android.gms.cast.MediaStatus;
import p001o.wx7;

/* loaded from: classes6.dex */
public final class zx7 {

    /* renamed from: c */
    public static final C18725a f57847c = new C18725a(null);

    /* renamed from: a */
    public final im1 f57848a;

    /* renamed from: b */
    public long f57849b;

    /* renamed from: o.zx7$a */
    public static final class C18725a {
        public C18725a() {
        }

        public /* synthetic */ C18725a(id5 id5Var) {
            this();
        }
    }

    public zx7(im1 im1Var) {
        sq8.m48649h(im1Var, "source");
        this.f57848a = im1Var;
        this.f57849b = MediaStatus.COMMAND_STREAM_TRANSFER;
    }

    /* renamed from: a */
    public final wx7 m60065a() {
        wx7.C17997a c17997a = new wx7.C17997a();
        while (true) {
            String strM60066b = m60066b();
            if (strM60066b.length() == 0) {
                return c17997a.m55340f();
            }
            c17997a.m55337c(strM60066b);
        }
    }

    /* renamed from: b */
    public final String m60066b() {
        String strC0 = this.f57848a.c0(this.f57849b);
        this.f57849b -= strC0.length();
        return strC0;
    }
}
