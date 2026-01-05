package p001o;

import android.app.Application;

/* loaded from: classes2.dex */
public abstract class zf0 extends dxi {

    /* renamed from: b */
    public final Application f57118b;

    public zf0(Application application) {
        sq8.m48649h(application, "application");
        this.f57118b = application;
    }

    /* renamed from: f */
    public Application m59366f() {
        Application application = this.f57118b;
        sq8.m48647f(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
