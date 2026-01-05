package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public interface i3e {

    /* renamed from: a */
    public static final C14152a f27998a = C14152a.f28000a;

    /* renamed from: b */
    public static final i3e f27999b = new C14152a.a();

    /* renamed from: o.i3e$a */
    public static final class C14152a {

        /* renamed from: a */
        public static final /* synthetic */ C14152a f28000a = new C14152a();

        /* renamed from: o.i3e$a$a */
        public static final class a implements i3e {
            @Override // p001o.i3e
            /* renamed from: a */
            public boolean mo31469a(int i, im1 im1Var, int i2, boolean z) {
                sq8.m48649h(im1Var, "source");
                im1Var.skip(i2);
                return true;
            }

            @Override // p001o.i3e
            /* renamed from: b */
            public void mo31470b(int i, fj6 fj6Var) {
                sq8.m48649h(fj6Var, "errorCode");
            }

            @Override // p001o.i3e
            /* renamed from: c */
            public boolean mo31471c(int i, List list) {
                sq8.m48649h(list, "requestHeaders");
                return true;
            }

            @Override // p001o.i3e
            /* renamed from: d */
            public boolean mo31472d(int i, List list, boolean z) {
                sq8.m48649h(list, "responseHeaders");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo31469a(int i, im1 im1Var, int i2, boolean z);

    /* renamed from: b */
    void mo31470b(int i, fj6 fj6Var);

    /* renamed from: c */
    boolean mo31471c(int i, List list);

    /* renamed from: d */
    boolean mo31472d(int i, List list, boolean z);
}
