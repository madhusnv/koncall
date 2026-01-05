package p001o;

import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsTeam;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AddedSourceType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserRegistrationStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class o4h {

    /* renamed from: a */
    public static User f37769a = User.builder().addedSourceType(AddedSourceType.ADMIN_ADDED).name("Unknown").registeredNumber("").userRegistrationStatus(UserRegistrationStatus.CONFIRMED).build();

    /* renamed from: b */
    public static ConcurrentHashMap f37770b = new ConcurrentHashMap();

    /* renamed from: c */
    public static ConcurrentHashMap f37771c = new ConcurrentHashMap();

    /* renamed from: d */
    public static ConcurrentHashMap f37772d = new ConcurrentHashMap();

    /* renamed from: e */
    public static ConcurrentHashMap f37773e = new ConcurrentHashMap();

    /* renamed from: f */
    public static Set f37774f;

    static {
        new ConcurrentHashMap();
        f37774f = ConcurrentHashMap.newKeySet();
    }

    /* renamed from: C */
    public static s47 m41539C(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m41547K((String) it.next()).m47686M(new ki()).m47684F(km7.m35918d()));
        }
        return s47.m47671J(arrayList).m47684F(km7.m35918d());
    }

    /* renamed from: D */
    public static void m41540D(String str) {
        uni.kC().TB().m48217y(str).d0(new g3h()).v0(new gu3() { // from class: o.r3h
            @Override // p001o.gu3
            public final void accept(Object obj) {
                o4h.m41551O((LeadTeamMember) obj);
            }
        }, new gu3() { // from class: o.c4h
            @Override // p001o.gu3
            public final void accept(Object obj) {
                o4h.m41552P((Throwable) obj);
            }
        });
    }

    /* renamed from: E */
    public static void m41541E(LeadTeamMember leadTeamMember) {
        String teamId = leadTeamMember.getTeamMember().getTeamId();
        List arrayList = new ArrayList();
        if (f37773e.containsKey(teamId)) {
            arrayList = (List) f37773e.get(teamId);
            arrayList.add(leadTeamMember);
        } else {
            arrayList.add(leadTeamMember);
        }
        f37773e.put(teamId, arrayList);
    }

    /* renamed from: F */
    public static void m41542F(LeadTeamMember leadTeamMember) {
        String strM41548L = m41548L(leadTeamMember.getTeamMember().getAccount().getId(), leadTeamMember.getTeamMember().getMemberTeamId());
        List arrayList = new ArrayList();
        if (f37772d.containsKey(strM41548L)) {
            arrayList = (List) f37772d.get(strM41548L);
            arrayList.add(leadTeamMember);
        } else {
            arrayList.add(leadTeamMember);
        }
        f37772d.put(strM41548L, arrayList);
    }

    /* renamed from: G */
    public static void m41543G() {
        f37770b.clear();
        f37771c.clear();
        f37772d.clear();
        f37773e.clear();
        f37774f.clear();
    }

    /* renamed from: H */
    public static void m41544H(String str) {
        f37774f.add(str);
    }

    /* renamed from: I */
    public static List m41545I() {
        AuthorizationLevel authorizationLevelM39162l = wi0.m54444J().m39162l();
        new ArrayList();
        return (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) ? (List) wi0.m54451Q().stream().map(new Function() { // from class: o.y3h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LeadsTeam) obj).getTeamId();
            }
        }).collect(Collectors.toList()) : (List) wi0.m54453S().stream().map(new Function() { // from class: o.z3h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LeadsTeam) obj).getTeamId();
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: J */
    public static x6c m41546J(String str) {
        return m41549M(str).m47686M(new rl7() { // from class: o.n3h
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return o4h.m41555S((List) obj);
            }
        }).m47686M(new rl7() { // from class: o.o3h
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return o4h.m41556T((List) obj);
            }
        }).m47686M(new rl7() { // from class: o.p3h
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return o4h.m41539C((List) obj);
            }
        }).m47684F(km7.m35918d()).g0().m55027y();
    }

    /* renamed from: K */
    public static s47 m41547K(String str) {
        if (StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) {
            return s47.m47674O((List) m41545I().stream().filter(new Predicate() { // from class: o.k4h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return o4h.m41557U((String) obj);
                }
            }).map(new Function() { // from class: o.l4h
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return o4h.m41547K((String) obj);
                }
            }).collect(Collectors.toList())).m47706n(new rr(), new bs()).m55019p(new rl7() { // from class: o.m4h
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return o4h.m41559W((List) obj);
                }
            }).m55019p(new rl7() { // from class: o.h3h
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return o4h.m41560X((Set) obj);
                }
            }).m55026x();
        }
        l1 l1VarTB = uni.kC().TB();
        if (!f37770b.containsKey(str)) {
            String.format("get members by team id %s", str);
            final pif pifVarM43749s = pif.m43749s();
            f37770b.put(str, pifVarM43749s);
            x6c x6cVarD0 = l1VarTB.pb(str, l1VarTB.on()).d0(new rl7() { // from class: o.i3h
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return o4h.m41561Y((List) obj);
                }
            });
            Objects.requireNonNull(pifVarM43749s);
            x6cVarD0.v0(new j3h(pifVarM43749s), new gu3() { // from class: o.k3h
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    o4h.m41562Z(pifVarM43749s, (Throwable) obj);
                }
            });
        }
        s0(str);
        return s47.m47670I((Future) f37770b.get(str));
    }

    /* renamed from: L */
    public static String m41548L(String str, String str2) {
        return str2 + "##" + str;
    }

    /* renamed from: M */
    public static s47 m41549M(String str) {
        l1 l1VarTB = uni.kC().TB();
        String strM41548L = m41548L(l1VarTB.on(), str);
        if (!f37771c.containsKey(strM41548L)) {
            String.format("get members by user and account id %s", strM41548L);
            final pif pifVarM43749s = pif.m43749s();
            f37771c.put(strM41548L, pifVarM43749s);
            x6c x6cVarD0 = l1VarTB.Qp(str, l1VarTB.on()).d0(new rl7() { // from class: o.l3h
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return o4h.a0((List) obj);
                }
            });
            Objects.requireNonNull(pifVarM43749s);
            x6cVarD0.v0(new j3h(pifVarM43749s), new gu3() { // from class: o.m3h
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    o4h.b0(pifVarM43749s, (Throwable) obj);
                }
            });
        }
        t0(str, l1VarTB.on());
        return s47.m47670I((Future) f37771c.get(strM41548L));
    }

    /* renamed from: N */
    public static boolean m41550N(LeadTeamMember leadTeamMember) {
        return TeamRole.TEAM_LEADER.name().equals(leadTeamMember.getTeamRole()) || TeamRole.SUPERBOSS.name().equals(leadTeamMember.getTeamRole());
    }

    /* renamed from: O */
    public static /* synthetic */ void m41551O(LeadTeamMember leadTeamMember) {
        m41542F(leadTeamMember);
        m41541E(leadTeamMember);
    }

    /* renamed from: P */
    public static /* synthetic */ void m41552P(Throwable th) {
    }

    /* renamed from: S */
    public static /* synthetic */ List m41555S(List list) {
        return (List) list.stream().filter(new Predicate() { // from class: o.x3h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o4h.m41550N((LeadTeamMember) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: T */
    public static /* synthetic */ List m41556T(List list) {
        return (List) list.stream().map(new et9()).collect(Collectors.toList());
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m41557U(String str) {
        return (StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: W */
    public static /* synthetic */ Set m41559W(List list) {
        return (Set) list.stream().flatMap(new Function() { // from class: o.q3h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).collect(Collectors.toSet());
    }

    /* renamed from: X */
    public static /* synthetic */ List m41560X(Set set) {
        return (List) set.stream().collect(Collectors.toList());
    }

    /* renamed from: Y */
    public static /* synthetic */ List m41561Y(List list) {
        return (List) list.stream().map(new a4h()).collect(Collectors.toList());
    }

    /* renamed from: Z */
    public static /* synthetic */ void m41562Z(pif pifVar, Throwable th) {
        th.getMessage();
        pifVar.mo43750r(new ArrayList());
    }

    public static /* synthetic */ List a0(List list) {
        return (List) list.stream().map(new a4h()).collect(Collectors.toList());
    }

    public static /* synthetic */ void b0(pif pifVar, Throwable th) {
        th.getMessage();
        pifVar.mo43750r(new ArrayList());
    }

    public static /* synthetic */ void c0(LeadTeamMember leadTeamMember) {
        r0(leadTeamMember);
        q0(leadTeamMember);
    }

    public static /* synthetic */ void d0(Throwable th) {
    }

    public static /* synthetic */ boolean e0(LeadTeamMember leadTeamMember, LeadTeamMember leadTeamMember2) {
        return !Objects.equals(leadTeamMember.getId(), leadTeamMember2.getId());
    }

    public static /* synthetic */ boolean f0(LeadTeamMember leadTeamMember, LeadTeamMember leadTeamMember2) {
        return !Objects.equals(leadTeamMember.getId(), leadTeamMember2.getId());
    }

    public static /* synthetic */ boolean g0(LeadTeamMember leadTeamMember) {
        return !f37774f.contains(leadTeamMember.getId());
    }

    public static /* synthetic */ LeadTeamMember h0(LeadTeamMember leadTeamMember) {
        return leadTeamMember;
    }

    public static /* synthetic */ boolean i0(LeadTeamMember leadTeamMember) {
        return !f37774f.contains(leadTeamMember.getId());
    }

    public static /* synthetic */ LeadTeamMember j0(LeadTeamMember leadTeamMember) {
        return leadTeamMember;
    }

    public static /* synthetic */ boolean k0(LeadTeamMember leadTeamMember) {
        return !f37774f.contains(leadTeamMember.getId());
    }

    public static /* synthetic */ LeadTeamMember l0(LeadTeamMember leadTeamMember) {
        return leadTeamMember;
    }

    public static /* synthetic */ boolean m0(LeadTeamMember leadTeamMember) {
        return !f37774f.contains(leadTeamMember.getId());
    }

    public static /* synthetic */ LeadTeamMember n0(LeadTeamMember leadTeamMember) {
        return leadTeamMember;
    }

    public static List o0(Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        for (String str : hashSet) {
            LeadTeamMember leadTeamMember = (LeadTeamMember) map.getOrDefault(str, null);
            LeadTeamMember leadTeamMember2 = (LeadTeamMember) map2.getOrDefault(str, null);
            if (map.containsKey(str) && map2.containsKey(str)) {
                if (leadTeamMember.getUpdatedAt() <= leadTeamMember2.getUpdatedAt()) {
                    arrayList.add(leadTeamMember2);
                } else {
                    arrayList.add(leadTeamMember);
                }
            } else if (map.containsKey(str)) {
                arrayList.add(leadTeamMember);
            } else {
                arrayList.add(leadTeamMember2);
            }
        }
        return arrayList;
    }

    public static void p0(String str) {
        uni.kC().TB().m48217y(str).d0(new g3h()).v0(new gu3() { // from class: o.g4h
            @Override // p001o.gu3
            public final void accept(Object obj) {
                o4h.c0((LeadTeamMember) obj);
            }
        }, new gu3() { // from class: o.h4h
            @Override // p001o.gu3
            public final void accept(Object obj) {
                o4h.d0((Throwable) obj);
            }
        });
    }

    public static void q0(final LeadTeamMember leadTeamMember) {
        String teamId = leadTeamMember.getTeamMember().getTeamId();
        List arrayList = new ArrayList();
        if (f37773e.containsKey(teamId)) {
            arrayList = (List) ((List) f37773e.get(teamId)).stream().filter(new Predicate() { // from class: o.j4h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return o4h.e0(leadTeamMember, (LeadTeamMember) obj);
                }
            }).collect(Collectors.toList());
            arrayList.add(leadTeamMember);
        } else {
            arrayList.add(leadTeamMember);
        }
        f37773e.put(teamId, arrayList);
    }

    public static void r0(final LeadTeamMember leadTeamMember) {
        String strM41548L = m41548L(leadTeamMember.getTeamMember().getAccount().getId(), leadTeamMember.getTeamMember().getMemberTeamId());
        List arrayList = new ArrayList();
        if (f37772d.containsKey(strM41548L)) {
            arrayList = (List) ((List) f37772d.get(strM41548L)).stream().filter(new Predicate() { // from class: o.i4h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return o4h.f0(leadTeamMember, (LeadTeamMember) obj);
                }
            }).collect(Collectors.toList());
            arrayList.add(leadTeamMember);
        } else {
            arrayList.add(leadTeamMember);
        }
        f37772d.put(strM41548L, arrayList);
    }

    public static void s0(String str) {
        List list = (List) Optional.ofNullable((List) f37773e.remove(str)).orElse(Collections.emptyList());
        pif pifVar = (pif) f37770b.get(str);
        if (((Boolean) Optional.ofNullable(pifVar).map(new grc()).orElse(Boolean.FALSE)).booleanValue()) {
            try {
                List listO0 = o0((Map) ((List) Optional.ofNullable((List) pifVar.get()).orElse(Collections.emptyList())).stream().filter(new Predicate() { // from class: o.s3h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return o4h.g0((LeadTeamMember) obj);
                    }
                }).collect(Collectors.toMap(new t3h(), new Function() { // from class: o.u3h
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return o4h.h0((LeadTeamMember) obj);
                    }
                })), (Map) list.stream().filter(new Predicate() { // from class: o.v3h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return o4h.i0((LeadTeamMember) obj);
                    }
                }).collect(Collectors.toMap(new t3h(), new Function() { // from class: o.w3h
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return o4h.j0((LeadTeamMember) obj);
                    }
                })));
                pif pifVarM43749s = pif.m43749s();
                pifVarM43749s.mo43750r(listO0);
                f37770b.put(str, pifVarM43749s);
            } catch (Exception unused) {
            }
        }
    }

    public static void t0(String str, String str2) {
        String strM41548L = m41548L(str2, str);
        List list = (List) Optional.ofNullable((List) f37772d.remove(strM41548L)).orElse(Collections.emptyList());
        pif pifVar = (pif) f37771c.get(strM41548L);
        if (((Boolean) Optional.ofNullable(pifVar).map(new grc()).orElse(Boolean.FALSE)).booleanValue()) {
            try {
                List listO0 = o0((Map) ((List) Optional.ofNullable((List) pifVar.get()).orElse(Collections.emptyList())).stream().filter(new Predicate() { // from class: o.b4h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return o4h.k0((LeadTeamMember) obj);
                    }
                }).collect(Collectors.toMap(new t3h(), new Function() { // from class: o.d4h
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return o4h.l0((LeadTeamMember) obj);
                    }
                })), (Map) list.stream().filter(new Predicate() { // from class: o.e4h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return o4h.m0((LeadTeamMember) obj);
                    }
                }).collect(Collectors.toMap(new t3h(), new Function() { // from class: o.f4h
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return o4h.n0((LeadTeamMember) obj);
                    }
                })));
                pif pifVarM43749s = pif.m43749s();
                pifVarM43749s.mo43750r(listO0);
                f37771c.put(strM41548L, pifVarM43749s);
            } catch (Exception unused) {
            }
        }
    }
}
