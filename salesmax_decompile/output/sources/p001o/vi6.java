package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p001o.a6f;
import p001o.u2e;

/* loaded from: classes3.dex */
public final class vi6 implements y2e {

    /* renamed from: b */
    public final gi9 f50407b;

    /* renamed from: c */
    public final gi9 f50408c;

    /* renamed from: d */
    public final gi9 f50409d;

    public vi6(final f9d f9dVar) {
        sq8.m48649h(f9dVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f50407b = si9.m48360a(new uk7() { // from class: o.si6
            @Override // p001o.uk7
            public final Object invoke() {
                return vi6.m52841h(f9dVar);
            }
        });
        this.f50408c = si9.m48360a(new uk7() { // from class: o.ti6
            @Override // p001o.uk7
            public final Object invoke() {
                return vi6.m52842i(f9dVar);
            }
        });
        this.f50409d = si9.m48360a(new uk7() { // from class: o.ui6
            @Override // p001o.uk7
            public final Object invoke() {
                return vi6.m52843k(f9dVar);
            }
        });
    }

    /* renamed from: h */
    public static final u2e m52841h(f9d f9dVar) {
        a6f.C12101a c12101a = a6f.f14208c;
        u2e u2eVarM54572g = wi6.m54572g(f9dVar, c12101a.m16524b());
        return u2eVarM54572g == null ? wi6.m54571f(f9dVar, c12101a.m16524b()) : u2eVarM54572g;
    }

    /* renamed from: i */
    public static final u2e m52842i(f9d f9dVar) {
        a6f.C12101a c12101a = a6f.f14208c;
        u2e u2eVarM54572g = wi6.m54572g(f9dVar, c12101a.m16525c());
        return u2eVarM54572g == null ? wi6.m54571f(f9dVar, c12101a.m16525c()) : u2eVarM54572g;
    }

    /* renamed from: k */
    public static final Set m52843k(f9d f9dVar) {
        return wi6.m54570e(f9dVar);
    }

    @Override // p001o.y2e
    /* renamed from: a */
    public u2e mo52844a(l8i l8iVar) {
        sq8.m48649h(l8iVar, ImagesContract.URL);
        if ((m52845e() == null && m52846f() == null) || m52848j(l8iVar)) {
            return u2e.C17285a.f48217a;
        }
        a6f a6fVarM36759f = l8iVar.m36759f();
        a6f.C12101a c12101a = a6f.f14208c;
        u2e u2eVarM52845e = sq8.m48644c(a6fVarM36759f, c12101a.m16524b()) ? m52845e() : sq8.m48644c(a6fVarM36759f, c12101a.m16525c()) ? m52846f() : null;
        return u2eVarM52845e == null ? u2e.C17285a.f48217a : u2eVarM52845e;
    }

    /* renamed from: e */
    public final u2e m52845e() {
        return (u2e) this.f50407b.getValue();
    }

    /* renamed from: f */
    public final u2e m52846f() {
        return (u2e) this.f50408c.getValue();
    }

    /* renamed from: g */
    public final Set m52847g() {
        return (Set) this.f50409d.getValue();
    }

    /* renamed from: j */
    public final boolean m52848j(l8i l8iVar) {
        Set setM52847g = m52847g();
        if ((setM52847g instanceof Collection) && setM52847g.isEmpty()) {
            return false;
        }
        Iterator it = setM52847g.iterator();
        while (it.hasNext()) {
            if (((g0c) it.next()).m27847a(l8iVar)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ vi6(f9d f9dVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? r9d.f43250a.m46382a() : f9dVar);
    }
}
