package p001o;

import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.UserAuthorization;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class lyi {

    /* renamed from: a */
    public AuthorizationLevel f34541a;

    /* renamed from: b */
    public List f34542b;

    /* renamed from: c */
    public List f34543c;

    public lyi(UserAuthorization userAuthorization) {
        this(userAuthorization.getAuthorizationLevel());
    }

    /* renamed from: d */
    public static void m38109d() {
        vx9.m53576x();
        vqh.m53280y();
        lv.m37965v();
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m38110j(Team team, Team team2) {
        return Objects.equals(team.getId(), team2.getId());
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m38111k(Team team, Team team2) {
        return Objects.equals(team.getId(), team2.getId());
    }

    /* renamed from: c */
    public void m38112c(final Team team, boolean z) {
        String.format("Adding team to teamAsLead or Reportee for teams : %s: %s", team.getId(), Boolean.valueOf(z));
        if (z) {
            if (this.f34542b.stream().noneMatch(new Predicate() { // from class: o.hyi
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return lyi.m38110j(team, (Team) obj);
                }
            })) {
                this.f34542b.add(team);
            }
        } else if (this.f34543c.stream().noneMatch(new Predicate() { // from class: o.iyi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lyi.m38111k(team, (Team) obj);
            }
        })) {
            this.f34543c.add(team);
        }
    }

    /* renamed from: e */
    public lv m38113e(String str) {
        return (lv) Optional.ofNullable(str).map(new Function() { // from class: o.gyi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37945W((String) obj);
            }
        }).orElse(lv.m37946X(mv.ME));
    }

    /* renamed from: f */
    public vx9 m38114f(String str) {
        return (vx9) Optional.ofNullable(str).map(new Function() { // from class: o.jyi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.a0((String) obj);
            }
        }).orElse(vx9.b0(wx9.ME));
    }

    /* renamed from: g */
    public List m38115g() {
        return this.f34542b;
    }

    /* renamed from: h */
    public List m38116h() {
        return this.f34543c;
    }

    /* renamed from: i */
    public vqh m38117i(String str) {
        return (vqh) Optional.ofNullable(str).map(new Function() { // from class: o.kyi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.b0((String) obj);
            }
        }).orElse(vqh.c0(wqh.ME));
    }

    public lyi(AuthorizationLevel authorizationLevel) {
        this.f34541a = authorizationLevel;
        this.f34542b = new ArrayList();
        this.f34543c = new ArrayList();
    }
}
