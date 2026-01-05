package p001o;

import ai.salesmax.model.LeadsTeam;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class daa {

    /* renamed from: a */
    public static int f19491a = 100;

    /* renamed from: b */
    public static Map f19492b = new HashMap();

    /* renamed from: f */
    public static void m22689f(final String str, String str2) {
        uni.kC().TB().s5(str2).d0(new rl7() { // from class: o.y9a
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return new LeadsTeam((Team) obj);
            }
        }).v0(new gu3() { // from class: o.z9a
            @Override // p001o.gu3
            public final void accept(Object obj) {
                daa.m22696m(str, (LeadsTeam) obj);
            }
        }, new gu3() { // from class: o.aaa
            @Override // p001o.gu3
            public final void accept(Object obj) {
                daa.m22697n((Throwable) obj);
            }
        });
    }

    /* renamed from: g */
    public static void m22690g() {
        f19492b.clear();
    }

    /* renamed from: h */
    public static void m22691h(String str, final String str2) {
        f19492b.put(str, (List) ((List) f19492b.getOrDefault(str, Collections.emptyList())).stream().filter(new Predicate() { // from class: o.x9a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return daa.m22698o(str2, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList()));
    }

    /* renamed from: i */
    public static List m22692i(String str) {
        l1 l1VarTB = uni.kC().TB();
        if (f19492b.containsKey(str)) {
            return (List) f19492b.get(str);
        }
        try {
            List list = (List) ((List) l1VarTB.Ko(str, f19491a).m55729h()).stream().map(new caa()).collect(Collectors.toList());
            f19492b.put(str, list);
            return list;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: j */
    public static List m22693j() {
        return m22692i(uni.kC().TB().on());
    }

    /* renamed from: k */
    public static Optional m22694k(final String str) {
        return m22693j().stream().filter(new Predicate() { // from class: o.w9a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return daa.m22699p(str, (LeadsTeam) obj);
            }
        }).findFirst();
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m22695l(LeadsTeam leadsTeam, LeadsTeam leadsTeam2) {
        return !Objects.equals(leadsTeam2.getId(), leadsTeam.getId());
    }

    /* renamed from: m */
    public static /* synthetic */ void m22696m(String str, final LeadsTeam leadsTeam) {
        List list = (List) m22692i(str).stream().filter(new Predicate() { // from class: o.baa
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return daa.m22695l(leadsTeam, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList());
        list.add(leadsTeam);
        f19492b.put(str, list);
    }

    /* renamed from: n */
    public static /* synthetic */ void m22697n(Throwable th) {
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m22698o(String str, LeadsTeam leadsTeam) {
        return !Objects.equals(leadsTeam.getId(), str);
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m22699p(String str, LeadsTeam leadsTeam) {
        return Objects.equals(leadsTeam.getId(), str);
    }

    /* renamed from: q */
    public static void m22700q(String str, String str2) {
        m22689f(str, str2);
    }
}
