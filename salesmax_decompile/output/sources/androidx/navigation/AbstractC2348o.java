package androidx.navigation;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001o.csb;
import p001o.kf9;
import p001o.kh3;
import p001o.qef;
import p001o.sq8;
import p001o.xk7;
import p001o.xsb;
import p001o.y3i;

/* renamed from: androidx.navigation.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2348o {

    /* renamed from: a */
    public xsb f9697a;

    /* renamed from: b */
    public boolean f9698b;

    /* renamed from: androidx.navigation.o$a */
    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.o$b */
    public @interface b {
        String value();
    }

    /* renamed from: androidx.navigation.o$c */
    public static final class c extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ C2345l f9700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2345l c2345l, a aVar) {
            super(1);
            this.f9700b = c2345l;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2332c invoke(C2332c c2332c) {
            AbstractC2341h abstractC2341hMo8528d;
            sq8.m48649h(c2332c, "backStackEntry");
            AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
            if (!(abstractC2341hM8553e instanceof AbstractC2341h)) {
                abstractC2341hM8553e = null;
            }
            if (abstractC2341hM8553e != null && (abstractC2341hMo8528d = AbstractC2348o.this.mo8528d(abstractC2341hM8553e, c2332c.m8551c(), this.f9700b, null)) != null) {
                return sq8.m48644c(abstractC2341hMo8528d, abstractC2341hM8553e) ? c2332c : AbstractC2348o.this.m8949b().mo8620a(abstractC2341hMo8528d, abstractC2341hMo8528d.m8768n(c2332c.m8551c()));
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.o$d */
    public static final class d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final d f9701a = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final void m8952a(C2346m c2346m) {
            sq8.m48649h(c2346m, "$this$navOptions");
            c2346m.m8828d(true);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8952a((C2346m) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public abstract AbstractC2341h mo8527a();

    /* renamed from: b */
    public final xsb m8949b() {
        xsb xsbVar = this.f9697a;
        if (xsbVar != null) {
            return xsbVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: c */
    public final boolean m8950c() {
        return this.f9698b;
    }

    /* renamed from: d */
    public AbstractC2341h mo8528d(AbstractC2341h abstractC2341h, Bundle bundle, C2345l c2345l, a aVar) {
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        return abstractC2341h;
    }

    /* renamed from: e */
    public void mo8714e(List list, C2345l c2345l, a aVar) {
        sq8.m48649h(list, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Iterator it = qef.m45312o(qef.m45319v(kh3.m35706V(list), new c(c2345l, aVar))).iterator();
        while (it.hasNext()) {
            m8949b().mo8625k((C2332c) it.next());
        }
    }

    /* renamed from: f */
    public void mo8715f(xsb xsbVar) {
        sq8.m48649h(xsbVar, "state");
        this.f9697a = xsbVar;
        this.f9698b = true;
    }

    /* renamed from: g */
    public void mo8716g(C2332c c2332c) {
        sq8.m48649h(c2332c, "backStackEntry");
        AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
        if (!(abstractC2341hM8553e instanceof AbstractC2341h)) {
            abstractC2341hM8553e = null;
        }
        if (abstractC2341hM8553e == null) {
            return;
        }
        mo8528d(abstractC2341hM8553e, null, csb.m21707a(d.f9701a), null);
        m8949b().m56786f(c2332c);
    }

    /* renamed from: h */
    public void mo8717h(Bundle bundle) {
        sq8.m48649h(bundle, "savedState");
    }

    /* renamed from: i */
    public Bundle mo8718i() {
        return null;
    }

    /* renamed from: j */
    public void mo8719j(C2332c c2332c, boolean z) {
        sq8.m48649h(c2332c, "popUpTo");
        List list = (List) m8949b().m56783b().getValue();
        if (!list.contains(c2332c)) {
            throw new IllegalStateException(("popBackStack was called with " + c2332c + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C2332c c2332c2 = null;
        while (mo8529k()) {
            c2332c2 = (C2332c) listIterator.previous();
            if (sq8.m48644c(c2332c2, c2332c)) {
                break;
            }
        }
        if (c2332c2 != null) {
            m8949b().mo8622h(c2332c2, z);
        }
    }

    /* renamed from: k */
    public boolean mo8529k() {
        return true;
    }
}
