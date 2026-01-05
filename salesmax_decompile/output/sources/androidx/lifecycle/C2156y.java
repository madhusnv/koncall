package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC2139h;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes2.dex */
public class C2156y {

    /* renamed from: a */
    public final C2144m f7770a;

    /* renamed from: b */
    public final Handler f7771b;

    /* renamed from: c */
    public a f7772c;

    /* renamed from: androidx.lifecycle.y$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final C2144m f7773a;

        /* renamed from: b */
        public final AbstractC2139h.a f7774b;

        /* renamed from: c */
        public boolean f7775c;

        public a(C2144m c2144m, AbstractC2139h.a aVar) {
            sq8.m48649h(c2144m, "registry");
            sq8.m48649h(aVar, "event");
            this.f7773a = c2144m;
            this.f7774b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7775c) {
                return;
            }
            this.f7773a.m6538i(this.f7774b);
            this.f7775c = true;
        }
    }

    public C2156y(xca xcaVar) {
        sq8.m48649h(xcaVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f7770a = new C2144m(xcaVar);
        this.f7771b = new Handler();
    }

    /* renamed from: a */
    public AbstractC2139h m6602a() {
        return this.f7770a;
    }

    /* renamed from: b */
    public void m6603b() {
        m6607f(AbstractC2139h.a.ON_START);
    }

    /* renamed from: c */
    public void m6604c() {
        m6607f(AbstractC2139h.a.ON_CREATE);
    }

    /* renamed from: d */
    public void m6605d() {
        m6607f(AbstractC2139h.a.ON_STOP);
        m6607f(AbstractC2139h.a.ON_DESTROY);
    }

    /* renamed from: e */
    public void m6606e() {
        m6607f(AbstractC2139h.a.ON_START);
    }

    /* renamed from: f */
    public final void m6607f(AbstractC2139h.a aVar) {
        a aVar2 = this.f7772c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f7770a, aVar);
        this.f7772c = aVar3;
        Handler handler = this.f7771b;
        sq8.m48646e(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
