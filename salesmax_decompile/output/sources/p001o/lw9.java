package p001o;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.LeadFilter;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PaginatedTokenResultsUpdater;
import ai.salesmax.model.PhoneDetail;
import ai.salesmax.model.SubmittedFormValues;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactNumberDetail;
import com.amplifyframework.datastore.generated.model.ContactNumberType;
import com.amplifyframework.datastore.generated.model.Email;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.ContactAssignmentStatus;
import type.ContactListQueryType;
import type.ModelContactFilterInput;
import type.QueryContactListInput;

/* loaded from: classes.dex */
public abstract class lw9 {

    /* renamed from: a */
    public static String f34446a = "AppDialer";

    /* renamed from: b */
    public static String f34447b = "IncomingPhoneCall";

    /* renamed from: c */
    public static String f34448c = "OutgoingPhoneCall";

    /* renamed from: o.lw9$a */
    public static /* synthetic */ class C15162a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34449a;

        static {
            int[] iArr = new int[qq0.values().length];
            f34449a = iArr;
            try {
                iArr[qq0.assign_later.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34449a[qq0.assign_to_team.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34449a[qq0.assign_to_user.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34449a[qq0.assign_to_yourself.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ Leads A0(Contact contact) {
        String.format("Received Contact : %s", contact);
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static /* synthetic */ PaginatedTokenResults B0(x6c x6cVar, PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.addLiveDataObservable(x6cVar, true);
    }

    public static /* synthetic */ Leads C0(Contact contact) {
        String.format("Received Contact : %s", contact);
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static /* synthetic */ x8c D0(String str, l1 l1Var) {
        return l1Var.ry(str).m47686M(new ru9()).h0();
    }

    public static /* synthetic */ x8c E0(String str, l1 l1Var) {
        return l1Var.n0(str).m47686M(new ru9()).h0();
    }

    public static /* synthetic */ Throwable F0() {
        return new RuntimeException("Service not available to fetch contact.");
    }

    public static /* synthetic */ Optional G0(String str, ryh ryhVar) {
        return d14.t5(str, (String) ryhVar.f44265a).map(new ov9());
    }

    public static /* synthetic */ x6c H0(String str, ryh ryhVar) {
        return d14.b7(str, (String) ryhVar.f44265a).d0(new ru9());
    }

    public static /* synthetic */ boolean I0(Leads leads) {
        return true;
    }

    public static /* synthetic */ Boolean J0(Leads leads, Leads leads2) {
        return Boolean.valueOf(Objects.equals(leads.getContactID(), leads2.getContactID()));
    }

    public static /* synthetic */ boolean K0(Leads leads) {
        return false;
    }

    public static /* synthetic */ PaginatedTokenResults L0(l1 l1Var, QueryContactListInput queryContactListInput, ModelContactFilterInput modelContactFilterInput, int i, x6c x6cVar) {
        PaginatedTokenResults paginatedTokenResults = new PaginatedTokenResults(g0(l1Var), uyh.of(queryContactListInput, modelContactFilterInput), i, x6c.m55693G());
        PaginatedTokenResultsUpdater paginatedTokenResultsUpdater = new PaginatedTokenResultsUpdater(x6cVar, x6c.m55693G(), new ggd() { // from class: o.cw9
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return lw9.I0((Leads) obj);
            }
        }, new jh1() { // from class: o.dw9
            @Override // p001o.jh1
            public final Object apply(Object obj, Object obj2) {
                return lw9.J0((Leads) obj, (Leads) obj2);
            }
        }, new ggd() { // from class: o.ew9
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return lw9.K0((Leads) obj);
            }
        }, Boolean.FALSE, Boolean.TRUE);
        paginatedTokenResults.loadInitial();
        paginatedTokenResults.setPaginatedTokenResultsUpdater(paginatedTokenResultsUpdater);
        return paginatedTokenResults;
    }

    public static /* synthetic */ PaginatedTokenResults M0(x6c x6cVar, PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.addLiveDataObservable(x6cVar, true);
    }

    public static /* synthetic */ Leads N0(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static /* synthetic */ g3e O0(int i, ModelContactFilterInput modelContactFilterInput, l1 l1Var) {
        uni uniVarKC = uni.kC();
        if (!l1Var.yC().booleanValue()) {
            return i1(l1Var, l1Var.Eo(), modelContactFilterInput, i, uniVarKC.bC().P2(l1Var, new Function() { // from class: o.mv9
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lw9.N0((Contact) obj);
                }
            }));
        }
        LeadFilter leadFilter = new LeadFilter();
        leadFilter.setHideClosedLeads(true);
        final x6c x6cVarP2 = uniVarKC.bC().P2(l1Var, new Function() { // from class: o.kv9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.P0((Contact) obj);
            }
        });
        return iu9.q0(leadFilter, i).m47686M(new rl7() { // from class: o.lv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.M0(x6cVarP2, (PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ Leads P0(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static /* synthetic */ boolean Q0(List list, ContactNumberDetail contactNumberDetail) {
        Optional optionalOfNullable = Optional.ofNullable(contactNumberDetail.getPhoneNumber());
        Objects.requireNonNull(list);
        return ((Boolean) optionalOfNullable.map(new lu9(list)).orElse(Boolean.FALSE)).booleanValue();
    }

    public static /* synthetic */ ContactNumberDetail R0(Map map, String str) {
        ContactNumberDetail.BuildStep buildStepBuilder = ContactNumberDetail.builder();
        Boolean bool = Boolean.FALSE;
        return (ContactNumberDetail) map.getOrDefault(str, buildStepBuilder.isPrimary(bool).contactNumberType(ContactNumberType.MOBILE).isValid(Boolean.TRUE).isVerified(bool).phoneNumber(str).isWrongNumber(bool).build());
    }

    /* renamed from: S */
    public static x6c m38016S() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    public static /* synthetic */ boolean S0(Email email) {
        return !Objects.isNull(email);
    }

    /* renamed from: T */
    public static l1 m38017T() {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB == null ? uni.kC().GB(Optional.empty()).m39161k() : l1VarTB;
    }

    public static /* synthetic */ boolean T0(List list, Email email) {
        Optional optionalOfNullable = Optional.ofNullable(email.getEmail());
        Objects.requireNonNull(list);
        return ((Boolean) optionalOfNullable.map(new lu9(list)).orElse(Boolean.FALSE)).booleanValue();
    }

    /* renamed from: U */
    public static ryh m38018U(ryh ryhVar) {
        return uyh.of((List) ((List) ryhVar.f44265a).stream().map(new ov9()).map(new Function() { // from class: o.fw9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.i0((LeadsSummary) obj);
            }
        }).collect(Collectors.toList()), (String) ryhVar.f44266b);
    }

    public static /* synthetic */ boolean U0(Email email) {
        return !StringUtils.isBlank(email.getEmail());
    }

    /* renamed from: V */
    public static x6c m38019V(final List list, final AssignmentOutcome assignmentOutcome) {
        return m38016S().m55717M(new rl7() { // from class: o.jv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.l0(assignmentOutcome, list, (l1) obj);
            }
        });
    }

    public static /* synthetic */ Email V0(Map map, String str) {
        Email.BuildStep buildStepBuilder = Email.builder();
        Boolean bool = Boolean.FALSE;
        Email.BuildStep buildStepIsPrimary = buildStepBuilder.isPrimary(bool);
        Boolean bool2 = Boolean.TRUE;
        return (Email) map.getOrDefault(str, buildStepIsPrimary.isPrimary(bool2).isValid(bool2).isVerified(bool).email(str).build());
    }

    /* renamed from: W */
    public static Optional m38020W(String str) {
        l1 l1VarM38017T;
        if (!uni.gC() || (l1VarM38017T = m38017T()) == null) {
            return null;
        }
        try {
            return Optional.ofNullable((User) l1VarM38017T.e3(str).m47698c());
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public static /* synthetic */ x6c W0(l1 l1Var, LeadsSummary leadsSummary, l1 l1Var2) {
        return l1Var.Eg(leadsSummary.getUnderlyingContact(), leadsSummary.getUserDefinedTags()).d0(new ru9());
    }

    /* renamed from: X */
    public static x6c m38021X(List list, String str) {
        return uni.kC().TB().i2(list, str).d0(new rl7() { // from class: o.yv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.m0((List) obj);
            }
        });
    }

    /* renamed from: Y */
    public static x6c m38022Y(final LeadsSummary leadsSummary) {
        return (leadsSummary.getContactNumbers().isEmpty() && leadsSummary.getEmail().isEmpty() && StringUtils.isBlank(leadsSummary.getName())) ? x6c.c0(leadsSummary) : uni.kC().TB().m17966t(leadsSummary.getUnderlyingContact(), (Business) Optional.ofNullable(leadsSummary.getAddedBusiness()).map(new cv9()).orElse(null)).d0(new ru9()).m55717M(new rl7() { // from class: o.dv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.o0(leadsSummary, (LeadsSummary) obj);
            }
        });
    }

    public static /* synthetic */ LeadsSummary Y0(LeadsSummary leadsSummary, SubmittedFormValues submittedFormValues) {
        return leadsSummary;
    }

    /* renamed from: Z */
    public static x6c m38023Z(String str, final String str2, final String str3, final Long l, final Boolean bool) {
        x6c x6cVarD0 = uni.LB().d0(new gd()).d0(new hd());
        String str4 = (String) Optional.ofNullable(str).map(new u3c()).orElse(null);
        final String str5 = (str4 == null || str4.isEmpty()) ? str2 : str4;
        return x6cVarD0.m55717M(new rl7() { // from class: o.yu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.p0(str5, str2, str3, l, bool, (l1) obj);
            }
        }).d0(new ru9());
    }

    public static /* synthetic */ x8c Z0(LeadsSummary leadsSummary, final LeadsSummary leadsSummary2) {
        if (Objects.isNull(leadsSummary.getSubmittedFormValues())) {
            return x6c.c0(leadsSummary2);
        }
        SubmittedFormValues submittedFormValues = leadsSummary.getSubmittedFormValues();
        submittedFormValues.setContactId(leadsSummary2.getId());
        submittedFormValues.setObjectId(leadsSummary2.getId());
        return swd.L0(submittedFormValues).d0(new rl7() { // from class: o.xv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.Y0(leadsSummary2, (SubmittedFormValues) obj);
            }
        });
    }

    public static x6c a0(final String str) {
        return m38016S().m55717M(new rl7() { // from class: o.vv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.q0(str, (l1) obj);
            }
        });
    }

    public static s47 a1(final l1 l1Var, final ModelContactFilterInput modelContactFilterInput, final int i, final x6c x6cVar) {
        final QueryContactListInput queryContactListInputBuild = QueryContactListInput.builder().accountId(l1Var.on()).queryType(ContactListQueryType.BY_ACCOUNT).build();
        return s47.m47669H(new Callable() { // from class: o.su9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lw9.z0(l1Var, queryContactListInputBuild, modelContactFilterInput, i, x6cVar);
            }
        });
    }

    public static x6c b0() {
        return m38016S().m55717M(new rl7() { // from class: o.nv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((l1) obj).Mu();
            }
        });
    }

    public static s47 b1(ModelContactFilterInput modelContactFilterInput, int i) {
        uni uniVarKC = uni.kC();
        l1 l1VarTB = uniVarKC.TB();
        if (!l1VarTB.yC().booleanValue()) {
            return a1(l1VarTB, modelContactFilterInput, i, uniVarKC.bC().O2(l1VarTB, new Function() { // from class: o.qu9
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lw9.C0((Contact) obj);
                }
            }));
        }
        LeadFilter leadFilter = new LeadFilter();
        leadFilter.setHideClosedLeads(true);
        final x6c x6cVarO2 = uniVarKC.bC().O2(l1VarTB, new Function() { // from class: o.ou9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.A0((Contact) obj);
            }
        });
        return iu9.g0(leadFilter, i).m47686M(new rl7() { // from class: o.pu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.B0(x6cVarO2, (PaginatedTokenResults) obj);
            }
        });
    }

    public static List c0(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getContactNumberDetail()).orElse(Collections.emptyList())).stream().map(new rw3()).collect(Collectors.toList());
    }

    public static s47 c1(final String str) {
        return m38016S().m55717M(new rl7() { // from class: o.mu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.D0(str, (l1) obj);
            }
        }).C0(la1.BUFFER);
    }

    public static List d0(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getContactNumberDetail()).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.fv9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.r0((ContactNumberDetail) obj);
            }
        }).collect(Collectors.toList());
    }

    public static s47 d1(final String str) {
        return m38016S().m55717M(new rl7() { // from class: o.nu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.E0(str, (l1) obj);
            }
        }).C0(la1.BUFFER);
    }

    public static List e0(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getEmails()).orElse(Collections.emptyList())).stream().filter(new Predicate() { // from class: o.jw9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.s0((Email) obj);
            }
        }).map(new hw9()).filter(new Predicate() { // from class: o.kw9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.t0((String) obj);
            }
        }).collect(Collectors.toList());
    }

    public static Optional e1(String str) {
        if (!uni.gC()) {
            return g1(str);
        }
        l1 l1VarM38017T = m38017T();
        return l1VarM38017T == null ? Optional.empty() : l1VarM38017T.gy(str).map(new ov9());
    }

    public static x6c f0(String str) {
        Optional map = tji.f47295d.m50080a().m50078S(str, uni.kC().TB().on()).map(new Function() { // from class: o.ku9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.u0((AccountMembership) obj);
            }
        });
        return map.isPresent() ? x6c.c0((LeadsUser) map.get()) : x6c.m55693G();
    }

    public static x6c f1(String str) {
        if (!uni.gC()) {
            return h1(str);
        }
        l1 l1VarM38017T = m38017T();
        return l1VarM38017T == null ? x6c.m55695I(new idg() { // from class: o.vu9
            @Override // p001o.idg
            public final Object get() {
                return lw9.F0();
            }
        }) : l1VarM38017T.Sg(str).d0(new ru9());
    }

    public static pl7 g0(l1 l1Var) {
        return new pv9(l1Var);
    }

    public static Optional g1(final String str) {
        return (Optional) uni.YB().map(new Function() { // from class: o.rv9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.G0(str, (ryh) obj);
            }
        }).orElse(Optional.empty());
    }

    public static EngagementSummary h0(String str) {
        try {
            Engagement engagement = (Engagement) mrg.d2(str).m47698c();
            if (engagement != null) {
                return new EngagementSummary(engagement);
            }
            return null;
        } catch (Exception unused) {
            String.format("Couldn't find latest engagement by lead id %s", str);
            return null;
        }
    }

    public static x6c h1(final String str) {
        return (x6c) uni.YB().map(new Function() { // from class: o.bv9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.H0(str, (ryh) obj);
            }
        }).orElse(x6c.m55693G());
    }

    public static /* synthetic */ Leads i0(LeadsSummary leadsSummary) {
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static s47 i1(final l1 l1Var, String str, final ModelContactFilterInput modelContactFilterInput, final int i, final x6c x6cVar) {
        final QueryContactListInput queryContactListInputBuild = QueryContactListInput.builder().accountId(l1Var.on()).ownerId(str).queryType(ContactListQueryType.BY_OWNER).build();
        return s47.m47669H(new Callable() { // from class: o.zv9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lw9.L0(l1Var, queryContactListInputBuild, modelContactFilterInput, i, x6cVar);
            }
        });
    }

    public static s47 j1(final ModelContactFilterInput modelContactFilterInput, final int i) {
        return m38016S().C0(la1.BUFFER).m47684F(new rl7() { // from class: o.tu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.O0(i, modelContactFilterInput, (l1) obj);
            }
        });
    }

    public static /* synthetic */ x8c k0(List list, Boolean bool) {
        return x6c.m55699W(list);
    }

    public static s47 k1(l1 l1Var, ryh ryhVar, String str, int i) {
        return l1Var.l0(ryhVar, str, i).m47686M(new rl7() { // from class: o.aw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.m38018U((ryh) obj);
            }
        });
    }

    public static /* synthetic */ x8c l0(AssignmentOutcome assignmentOutcome, final List list, l1 l1Var) {
        ContactAssignmentStatus contactAssignmentStatus;
        String strEo;
        String str;
        if (assignmentOutcome == null) {
            return x6c.m55699W(list);
        }
        if (!l1Var.iB().booleanValue()) {
            return x6c.m55694H(new RuntimeException("You aren't permitted to assign lead"));
        }
        ContactAssignmentStatus contactAssignmentStatus2 = ContactAssignmentStatus.ASSIGNED;
        assignmentOutcome.getAssignedUserId();
        String assignedTeamId = assignmentOutcome.getAssignedTeamId();
        int i = C15162a.f34449a[qq0.valueOf(assignmentOutcome.getAssignmentType()).ordinal()];
        if (i == 1) {
            contactAssignmentStatus = ContactAssignmentStatus.UNASSIGNED;
            strEo = l1Var.Eo();
            str = "UNASSIGNED";
        } else if (i == 2) {
            contactAssignmentStatus = ContactAssignmentStatus.UNASSIGNED;
            strEo = null;
            str = "TEAM";
        } else if (i == 3) {
            contactAssignmentStatus = ContactAssignmentStatus.ASSIGNED;
            strEo = assignmentOutcome.getAssignedUserId();
            str = "USER";
        } else if (i != 4) {
            contactAssignmentStatus = ContactAssignmentStatus.ASSIGNED;
            strEo = assignmentOutcome.getAssignedUserId();
            str = "REPORTEE";
        } else {
            contactAssignmentStatus = ContactAssignmentStatus.ASSIGNED;
            strEo = l1Var.Eo();
            str = "SELF";
        }
        return l1Var.p3((List) list.stream().map(new sv9()).collect(Collectors.toList()), strEo, assignedTeamId, Boolean.valueOf(assignmentOutcome.getAssignOpenDeals()), Boolean.valueOf(assignmentOutcome.getAssignOpenTasks()), Boolean.valueOf(assignmentOutcome.getAssignChats()), contactAssignmentStatus, str).m55714J(new ggd() { // from class: o.tv9
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).m55717M(new rl7() { // from class: o.uv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.k0(list, (Boolean) obj);
            }
        });
    }

    public static x6c l1(String str, String str2) {
        return uni.UB().l9(str, str2).d0(new ru9());
    }

    public static /* synthetic */ List m0(List list) {
        return (List) list.stream().map(new ov9()).collect(Collectors.toList());
    }

    public static Contact m1(Contact contact, List list, final List list2) {
        if (list == null) {
            list = new ArrayList();
        }
        final Map map = (Map) list.stream().filter(new Predicate() { // from class: o.ju9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.Q0(list2, (ContactNumberDetail) obj);
            }
        }).collect(Collectors.toMap(new rw3(), Function.identity()));
        return contact.copyOfBuilder().contactNumberDetail((List<ContactNumberDetail>) list2.stream().map(new Function() { // from class: o.uu9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.R0(map, (String) obj);
            }
        }).collect(Collectors.toList())).build();
    }

    public static /* synthetic */ LeadsSummary n0(LeadsSummary leadsSummary, SubmittedFormValues submittedFormValues) {
        return leadsSummary;
    }

    public static Contact n1(Contact contact, List list, final List list2) {
        if (list == null) {
            list = new ArrayList();
        }
        final Map map = (Map) list.stream().filter(new Predicate() { // from class: o.qv9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.S0((Email) obj);
            }
        }).filter(new Predicate() { // from class: o.bw9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.T0(list2, (Email) obj);
            }
        }).filter(new Predicate() { // from class: o.gw9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lw9.U0((Email) obj);
            }
        }).collect(Collectors.toMap(new hw9(), Function.identity()));
        return contact.copyOfBuilder().emails((List<Email>) list2.stream().map(new Function() { // from class: o.iw9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.V0(map, (String) obj);
            }
        }).collect(Collectors.toList())).build();
    }

    public static /* synthetic */ x8c o0(LeadsSummary leadsSummary, final LeadsSummary leadsSummary2) {
        if (Objects.isNull(leadsSummary.getSubmittedFormValues())) {
            return x6c.c0(leadsSummary2);
        }
        SubmittedFormValues submittedFormValues = leadsSummary.getSubmittedFormValues();
        submittedFormValues.setContactId(leadsSummary2.getId());
        submittedFormValues.setObjectId(leadsSummary2.getId());
        return swd.L0(submittedFormValues).d0(new rl7() { // from class: o.wv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.n0(leadsSummary2, (SubmittedFormValues) obj);
            }
        });
    }

    public static x6c o1(List list, String str, boolean z) {
        return uni.kC().TB().b8(list, str, z);
    }

    public static /* synthetic */ x8c p0(String str, String str2, String str3, Long l, Boolean bool, l1 l1Var) {
        return l1Var.gh(str, Collections.emptyList(), Collections.singletonList(str2), str3, l, bool);
    }

    public static x6c p1(List list, boolean z) {
        return uni.kC().TB().Hg(list, z);
    }

    public static /* synthetic */ x8c q0(String str, l1 l1Var) {
        return l1Var.C3(str);
    }

    public static x6c q1(k04 k04Var, List list, boolean z) {
        return k04Var.Hg(list, z);
    }

    public static /* synthetic */ PhoneDetail r0(ContactNumberDetail contactNumberDetail) {
        PhoneDetail phoneDetail = new PhoneDetail();
        phoneDetail.setNumber(contactNumberDetail.getPhoneNumber());
        phoneDetail.setWhatsapp(Boolean.TRUE.equals(contactNumberDetail.getIsWhatsappNumber()));
        return phoneDetail;
    }

    public static x6c r1(final LeadsSummary leadsSummary) {
        final l1 l1VarTB = uni.kC().TB();
        return (x6c) Optional.ofNullable(l1VarTB).map(new Function() { // from class: o.wu9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.W0(l1VarTB, leadsSummary, (l1) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.xu9
            @Override // java.util.function.Supplier
            public final Object get() {
                return x6c.c0(leadsSummary);
            }
        });
    }

    public static /* synthetic */ boolean s0(Email email) {
        return !Objects.isNull(email);
    }

    public static x6c s1(List list) {
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.zu9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lw9.r1((LeadsSummary) obj);
            }
        }).collect(Collectors.toList())).m55732l(new rr(), new eh1() { // from class: o.av9
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add((LeadsSummary) obj2);
            }
        }).m55027y();
    }

    public static /* synthetic */ boolean t0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static x6c t1(final LeadsSummary leadsSummary) {
        if (StringUtils.isBlank(leadsSummary.getId())) {
            throw new RuntimeException("You must provide lead id for updates");
        }
        return uni.kC().TB().n9(leadsSummary.getUnderlyingContact(), (Business) Optional.ofNullable(leadsSummary.getAddedBusiness()).map(new cv9()).orElse(null)).d0(new ru9()).m55717M(new rl7() { // from class: o.iv9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lw9.Z0(leadsSummary, (LeadsSummary) obj);
            }
        });
    }

    public static /* synthetic */ LeadsUser u0(AccountMembership accountMembership) {
        return new LeadsUser(accountMembership.getUser(), Optional.of(accountMembership), Optional.empty(), null);
    }

    public static /* synthetic */ s47 v0(l1 l1Var, ryh ryhVar, String str, Integer num) {
        return k1(l1Var, ryhVar, str, num.intValue());
    }

    public static /* synthetic */ boolean w0(Leads leads) {
        return true;
    }

    public static /* synthetic */ Boolean x0(Leads leads, Leads leads2) {
        return Boolean.valueOf(Objects.equals(leads.getContactID(), leads2.getContactID()));
    }

    public static /* synthetic */ boolean y0(Leads leads) {
        return false;
    }

    public static /* synthetic */ PaginatedTokenResults z0(l1 l1Var, QueryContactListInput queryContactListInput, ModelContactFilterInput modelContactFilterInput, int i, x6c x6cVar) {
        PaginatedTokenResults paginatedTokenResults = new PaginatedTokenResults(g0(l1Var), uyh.of(queryContactListInput, modelContactFilterInput), i, x6c.m55693G());
        PaginatedTokenResultsUpdater paginatedTokenResultsUpdater = new PaginatedTokenResultsUpdater(x6cVar, x6c.m55693G(), new ggd() { // from class: o.ev9
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return lw9.w0((Leads) obj);
            }
        }, new jh1() { // from class: o.gv9
            @Override // p001o.jh1
            public final Object apply(Object obj, Object obj2) {
                return lw9.x0((Leads) obj, (Leads) obj2);
            }
        }, new ggd() { // from class: o.hv9
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return lw9.y0((Leads) obj);
            }
        }, Boolean.FALSE, Boolean.TRUE);
        paginatedTokenResults.loadInitial();
        paginatedTokenResults.setPaginatedTokenResultsUpdater(paginatedTokenResultsUpdater);
        return paginatedTokenResults;
    }
}
