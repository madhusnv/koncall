package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;

/* loaded from: classes6.dex */
public interface f74 {

    /* renamed from: a */
    public static final C13353a f22850a = C13353a.f22852a;

    /* renamed from: b */
    public static final f74 f22851b = new C13353a.a();

    /* renamed from: o.f74$a */
    public static final class C13353a {

        /* renamed from: a */
        public static final /* synthetic */ C13353a f22852a = new C13353a();

        /* renamed from: o.f74$a$a */
        public static final class a implements f74 {
            @Override // p001o.f74
            /* renamed from: a */
            public void mo26224a(w48 w48Var, List list) {
                sq8.m48649h(w48Var, ImagesContract.URL);
                sq8.m48649h(list, "cookies");
            }

            @Override // p001o.f74
            /* renamed from: b */
            public List mo26225b(w48 w48Var) {
                sq8.m48649h(w48Var, ImagesContract.URL);
                return ch3.m21246k();
            }
        }
    }

    /* renamed from: a */
    void mo26224a(w48 w48Var, List list);

    /* renamed from: b */
    List mo26225b(w48 w48Var);
}
