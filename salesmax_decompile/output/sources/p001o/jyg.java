package p001o;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.FileObjectRelationshipSummary;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.SubmittedFormValues;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Address;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.EngagementType;
import com.amplifyframework.datastore.generated.model.NoteAdditionMethod;
import com.amplifyframework.datastore.generated.model.TaskActivityType;
import com.amplifyframework.datastore.generated.model.TeamMember;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.AddressInput;
import type.ContactAssignmentStatus;
import type.CreateEngagementInput;
import type.EngagementStatus;
import type.SearchableEngagementFilterInput;
import type.SearchableEngagementSortInput;
import type.SearchableEngagementSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;
import type.UpdateEngagementInput;

/* loaded from: classes.dex */
public abstract class jyg {

    /* renamed from: o.jyg$a */
    public static /* synthetic */ class C14681a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31261a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f31262b;

        static {
            int[] iArr = new int[EngagementType.values().length];
            f31262b = iArr;
            try {
                iArr[EngagementType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31262b[EngagementType.NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31262b[EngagementType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31262b[EngagementType.WHATSAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31262b[EngagementType.TASK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31262b[EngagementType.VISIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[qq0.values().length];
            f31261a = iArr2;
            try {
                iArr2[qq0.assign_later.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31261a[qq0.assign_to_team.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31261a[qq0.assign_to_user.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31261a[qq0.assign_to_yourself.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static /* synthetic */ void A1(CreateEngagementInput.Builder builder, Contact contact) {
        builder.contactId(contact.getId());
        builder.contactOwnerId(contact.getOwnerId());
        builder.contactPrimaryTeamId(contact.getPrimaryTeamId());
    }

    public static /* synthetic */ x8c A2(final SubmittedFormValues submittedFormValues, Engagement engagement, l1 l1Var, final EngagementSummary engagementSummary) {
        final String id = engagementSummary.getId();
        if (submittedFormValues != null) {
            submittedFormValues.setObjectId(id);
        }
        return Optional.ofNullable(engagement.getNextStepTask()).isPresent() ? x6c.c0(engagement) : l1Var.u9(UpdateEngagementInput.builder().id(engagement.getId()).nextStepTaskId(id).build()).m55717M(new rl7() { // from class: o.utg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.z2(submittedFormValues, id, engagementSummary, (Engagement) obj);
            }
        });
    }

    public static /* synthetic */ boolean B1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c B2(final Engagement engagement, final String str, final Long l, final Long l2, final String str2, AssignmentOutcome assignmentOutcome, String str3, final SubmittedFormValues submittedFormValues, final l1 l1Var) {
        return (Optional.ofNullable(engagement.getNextStepTask()).map(new Function() { // from class: o.cwg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Engagement) obj).getTaskType();
            }
        }).filter(new Predicate() { // from class: o.dwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.equals(str, (String) obj);
            }
        }).isPresent() || Optional.ofNullable(engagement.getNextStepTask()).map(new Function() { // from class: o.ewg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Engagement) obj).getDueDateTime();
            }
        }).filter(new Predicate() { // from class: o.gwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.u2(l, (Temporal.DateTime) obj);
            }
        }).isPresent() || Optional.ofNullable(engagement.getNextStepTask()).map(new Function() { // from class: o.hwg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Engagement) obj).getReminderDateTime();
            }
        }).filter(new Predicate() { // from class: o.iwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.v2(l2, (Temporal.DateTime) obj);
            }
        }).isPresent() || !((Optional.ofNullable(engagement.getNextStepTask()).isPresent() && hq9.m30994a(Optional.ofNullable(engagement.getNextStepTask()).map(new Function() { // from class: o.yvg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Engagement) obj).getId();
            }
        }))) || !StringUtils.isBlank(str)) || Optional.ofNullable(engagement.getNextStepTask()).map(new Function() { // from class: o.jwg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Engagement) obj).getCustomTaskInputData();
            }
        }).filter(new Predicate() { // from class: o.kwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.w2(str2, (String) obj);
            }
        }).isPresent()) ? x6c.c0(engagement) : ((x6c) Optional.ofNullable(engagement.getNextStepTask()).map(new kvg()).map(new Function() { // from class: o.zvg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.x2(str, (EngagementSummary) obj);
            }
        }).map(new Function() { // from class: o.awg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.e3((EngagementSummary) obj);
            }
        }).orElse(T0(engagement, str, l, l2, assignmentOutcome, str2, str3))).m55717M(new rl7() { // from class: o.bwg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.A2(submittedFormValues, engagement, l1Var, (EngagementSummary) obj);
            }
        });
    }

    public static /* synthetic */ boolean C1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c C2(String str, l1 l1Var) {
        return l1Var.na(str).d0(new yrg());
    }

    public static /* synthetic */ boolean D1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ PaginatedTokenResults D2(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new kvg()).map(new lvg());
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ boolean E1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ Engagement E2(Engagement engagement) {
        return engagement;
    }

    public static /* synthetic */ boolean F1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ PaginatedTokenResults F2(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new kvg()).map(new lvg());
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ boolean G1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ Engagement G2(Engagement engagement) {
        return engagement;
    }

    public static /* synthetic */ boolean H1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean H2(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean I1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ SearchableEngagementFilterInput I2(String str, String str2) {
        return SearchableEngagementFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    public static /* synthetic */ boolean J1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ PaginatedTokenResults J2(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new kvg()).map(new lvg());
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ boolean K1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ Engagement K2(Engagement engagement) {
        return engagement;
    }

    public static /* synthetic */ boolean L1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x6c L2(EngagementSummary engagementSummary, Engagement engagement) {
        return c1(engagement, engagementSummary.getNextTaskType(), Long.valueOf(engagementSummary.getNextTaskDueDateTime()), Long.valueOf(engagementSummary.getNextTaskReminderTime()), engagementSummary.getNextTaskAssignmentOutcome(), engagementSummary.getCustomNextStepTaskInputData(), engagementSummary.getSubmittedFormValuesNextStepTask(), engagementSummary.getContactID());
    }

    public static /* synthetic */ boolean M1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c M2(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ boolean N1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ EngagementSummary N2(EngagementSummary engagementSummary, LeadsSummary leadsSummary) {
        return engagementSummary;
    }

    public static /* synthetic */ boolean O1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x6c O2(final EngagementSummary engagementSummary, AssignmentOutcome assignmentOutcome) {
        assignmentOutcome.setAssignedTeamId(engagementSummary.getTeamId());
        return lw9.m38019V(Arrays.asList(engagementSummary.getContact()), assignmentOutcome).d0(new rl7() { // from class: o.stg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.N2(engagementSummary, (LeadsSummary) obj);
            }
        });
    }

    public static /* synthetic */ boolean P1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c P2(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        SubmittedFormValues submittedFormValues = engagementSummary.getSubmittedFormValues();
        if (submittedFormValues != null && (submittedFormValues.getObjectId() == null || submittedFormValues.getObjectId().isEmpty())) {
            submittedFormValues.setObjectId(engagementSummary2.getId());
        }
        return engagementSummary.getTransferLeadOnNextStepTask() ? (x8c) Optional.ofNullable(engagementSummary.getNextTaskAssignmentOutcome()).map(new Function() { // from class: o.svg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.O2(engagementSummary2, (AssignmentOutcome) obj);
            }
        }).orElse(x6c.c0(engagementSummary2)) : x6c.c0(engagementSummary2);
    }

    public static /* synthetic */ boolean Q1(Integer num) {
        return num.intValue() >= 0;
    }

    public static /* synthetic */ EngagementSummary Q2(EngagementSummary engagementSummary, List list) {
        return engagementSummary;
    }

    public static /* synthetic */ boolean R1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c R2(List list, final EngagementSummary engagementSummary) {
        return fz6.m27786D((String) Optional.ofNullable(engagementSummary.getContact()).map(new sv9()).orElse(""), engagementSummary.getId(), list).d0(new rl7() { // from class: o.qvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.Q2(engagementSummary, (List) obj);
            }
        });
    }

    public static x6c S0() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    public static /* synthetic */ boolean S1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ EngagementSummary S2(EngagementSummary engagementSummary, List list) {
        return engagementSummary;
    }

    public static x6c T0(final Engagement engagement, final String str, final Long l, final Long l2, final AssignmentOutcome assignmentOutcome, final String str2, final String str3) {
        return S0().m55717M(new rl7() { // from class: o.xtg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.o1(engagement, str3, l, l2, str2, str, assignmentOutcome, (l1) obj);
            }
        });
    }

    public static /* synthetic */ boolean T1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c T2(List list, final EngagementSummary engagementSummary) {
        return fz6.m27801o(list).d0(new rl7() { // from class: o.rvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.S2(engagementSummary, (List) obj);
            }
        });
    }

    public static x6c U0(final l1 l1Var, final String str, String str2) {
        return (x6c) Optional.ofNullable(str2).filter(new Predicate() { // from class: o.dug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.p1((String) obj);
            }
        }).map(new ev2()).orElseGet(new Supplier() { // from class: o.eug
            @Override // java.util.function.Supplier
            public final Object get() {
                return jyg.r1(str, l1Var);
            }
        });
    }

    public static /* synthetic */ boolean U1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ EngagementSummary U2(EngagementSummary engagementSummary, SubmittedFormValues submittedFormValues) {
        return engagementSummary;
    }

    public static x6c V0(l1 l1Var, AssignmentOutcome assignmentOutcome) {
        final String strEo = null;
        if (assignmentOutcome == null) {
            return x6c.c0(uyh.of(null, null, null));
        }
        final ContactAssignmentStatus contactAssignmentStatus = ContactAssignmentStatus.UNASSIGNED;
        String assignedUserId = assignmentOutcome.getAssignedUserId();
        String assignedTeamId = assignmentOutcome.getAssignedTeamId();
        int i = C14681a.f31261a[qq0.valueOf(assignmentOutcome.getAssignmentType()).ordinal()];
        if (i == 1) {
            strEo = l1Var.Eo();
        } else if (i != 2) {
            if (i == 3) {
                contactAssignmentStatus = ContactAssignmentStatus.ASSIGNED;
            } else if (i == 4) {
                contactAssignmentStatus = ContactAssignmentStatus.ASSIGNED;
                strEo = l1Var.Eo();
            }
            strEo = assignedUserId;
        }
        return U0(l1Var, strEo, assignedTeamId).d0(new rl7() { // from class: o.wtg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.s1(strEo, contactAssignmentStatus, (String) obj);
            }
        });
    }

    public static /* synthetic */ boolean V1(Integer num) {
        return !Objects.isNull(num);
    }

    public static /* synthetic */ x8c V2(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        return d3(engagementSummary.getSubmittedFormValues()).d0(new rl7() { // from class: o.pvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.U2(engagementSummary2, (SubmittedFormValues) obj);
            }
        });
    }

    public static x6c W0(final EngagementSummary engagementSummary, final String str, String str2, final ContactAssignmentStatus contactAssignmentStatus) {
        final l1 l1VarTB = uni.kC().TB();
        return U0(l1VarTB, str, str2).m55717M(new rl7() { // from class: o.aug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.u1(engagementSummary, contactAssignmentStatus, l1VarTB, str, (String) obj);
            }
        });
    }

    public static /* synthetic */ boolean W1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c W2(final EngagementSummary engagementSummary, l1 l1Var) {
        final ArrayList<FileObjectRelationshipSummary> addedLinkedFiles = engagementSummary.getAddedLinkedFiles();
        final ArrayList<String> deletedLinkedFiles = engagementSummary.getDeletedLinkedFiles();
        UpdateEngagementInput.Builder builderUpdatedById = engagementSummary.getUpdates().id(engagementSummary.getId()).accountId(l1Var.on()).engagementStatus(EngagementStatus.valueOf(engagementSummary.getEngagementStatus())).engagementType(type.EngagementType.valueOf(engagementSummary.getEngagementType())).updatedAt(a81.m16653h(Long.valueOf(System.currentTimeMillis()))).updatedById(l1Var.Eo());
        if (!StringUtils.isBlank(engagementSummary.getCallRecordingUrl())) {
            builderUpdatedById.callRecordingUrl(engagementSummary.getCallRecordingUrl());
        }
        return l1Var.u9(builderUpdatedById.build()).d0(new rl7() { // from class: o.qtg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.L2(engagementSummary, (Engagement) obj);
            }
        }).m55717M(new rl7() { // from class: o.bug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.M2((x6c) obj);
            }
        }).d0(new yrg()).m55717M(new rl7() { // from class: o.mug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.P2(engagementSummary, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.vug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.R2(addedLinkedFiles, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.wug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.T2(deletedLinkedFiles, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.xug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.V2(engagementSummary, (EngagementSummary) obj);
            }
        });
    }

    public static x6c X0(final List list, final AssignmentOutcome assignmentOutcome) {
        return S0().m55717M(new rl7() { // from class: o.nvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.x1(assignmentOutcome, list, (l1) obj);
            }
        });
    }

    public static /* synthetic */ boolean X1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 X2(l1 l1Var, int i, x6c x6cVar) {
        return l1Var.uk(uyh.of(SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(type.EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build()).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i, x6cVar).m47686M(new rl7() { // from class: o.ftg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.D2((PaginatedTokenResults) obj);
            }
        });
    }

    public static x6c Y0(String str, final String str2) {
        return e1(str).d0(new rl7() { // from class: o.nrg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.y1(str2, (EngagementSummary) obj);
            }
        }).d0(new rl7() { // from class: o.yug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.e3((EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.jvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.z1((x6c) obj);
            }
        });
    }

    public static /* synthetic */ boolean Y1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 Y2(int i) {
        l1 l1VarTB = uni.kC().TB();
        return X2(l1VarTB, i, uni.kC().bC().T2(l1VarTB, new Function() { // from class: o.fwg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.E2((Engagement) obj);
            }
        }));
    }

    public static CreateEngagementInput.Builder Z0(final l1 l1Var, Engagement engagement, String str) {
        String str2 = (String) Optional.ofNullable(engagement.getContact()).map(new hu2()).orElse("");
        if (StringUtils.isBlank(str2) && !engagement.getTaskType().equals("AD_HOC_TASK")) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            str = null;
        }
        final CreateEngagementInput.Builder builderUl = l1Var.ul((type.EngagementType) Optional.of(engagement.getEngagementType()).map(new Function() { // from class: o.rxg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EngagementType) obj).name();
            }
        }).map(new voc()).orElse(null), (EngagementStatus) Optional.of(engagement.getEngagementStatus()).map(new Function() { // from class: o.org
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.amplifyframework.datastore.generated.model.EngagementStatus) obj).name();
            }
        }).map(new Function() { // from class: o.trg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementStatus.valueOf((String) obj);
            }
        }).orElse(EngagementStatus.ACTIVE), engagement.getBody(), str2, str);
        Optional map = Optional.ofNullable(engagement.getNoteAdditionMethod()).map(new Function() { // from class: o.esg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((NoteAdditionMethod) obj).name();
            }
        }).map(new Function() { // from class: o.nsg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return type.NoteAdditionMethod.valueOf((String) obj);
            }
        });
        Objects.requireNonNull(builderUl);
        map.ifPresent(new Consumer() { // from class: o.xsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.noteAdditionMethod((type.NoteAdditionMethod) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskActivityType()).map(new Function() { // from class: o.htg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TaskActivityType) obj).name();
            }
        }).map(new Function() { // from class: o.rtg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return type.TaskActivityType.valueOf((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.wwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskActivityType((type.TaskActivityType) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskType()).ifPresent(new hxg(builderUl));
        Optional.ofNullable(engagement.getCallConnectStatus()).map(new Function() { // from class: o.ixg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CallConnectStatus) obj).name();
            }
        }).map(new Function() { // from class: o.jxg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return type.CallConnectStatus.valueOf((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.kxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callConnectStatus((type.CallConnectStatus) obj);
            }
        });
        Optional.ofNullable(engagement.getCallDirection()).map(new Function() { // from class: o.lxg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CallDirection) obj).name();
            }
        }).map(new Function() { // from class: o.nxg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return type.CallDirection.valueOf((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.oxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callDirection((type.CallDirection) obj);
            }
        });
        Optional.ofNullable(engagement.getCallOutcome()).ifPresent(new Consumer() { // from class: o.pxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callOutcome((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCallOutcomeNature()).ifPresent(new Consumer() { // from class: o.qxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callOutcomeNature((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskPriority()).ifPresent(new Consumer() { // from class: o.sxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskPriority((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVisitOutcome()).ifPresent(new Consumer() { // from class: o.txg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitOutcome((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVisitOutcomeNature()).ifPresent(new Consumer() { // from class: o.uxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitOutcomeNature((String) obj);
            }
        });
        Optional.ofNullable(engagement.getContact()).ifPresent(new Consumer() { // from class: o.vxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jyg.A1(builderUl, (Contact) obj);
            }
        });
        Optional.ofNullable(engagement.getBody()).filter(new Predicate() { // from class: o.wxg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.B1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.yxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.body((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVisitNote()).filter(new Predicate() { // from class: o.zxg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.C1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.ayg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitNote((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVideoCallOutcome()).ifPresent(new Consumer() { // from class: o.byg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.videoCallOutcome((String) obj);
            }
        });
        Optional.ofNullable(engagement.getNextFollowUpSetBy()).ifPresent(new Consumer() { // from class: o.cyg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.nextFollowUpSetBy((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCallRecordingUrl()).ifPresent(new Consumer() { // from class: o.dyg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callRecordingUrl((String) obj);
            }
        });
        Optional.ofNullable(engagement.getParentEngagement()).map(new pj3()).filter(new Predicate() { // from class: o.eyg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.D1((String) obj);
            }
        }).ifPresent(new qa6(builderUl));
        Optional.ofNullable(engagement.getNextStepTask()).map(new pj3()).filter(new Predicate() { // from class: o.fyg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.E1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gyg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.nextStepTaskId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVisitTime()).map(new la6()).ifPresent(new Consumer() { // from class: o.hyg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitTime((String) obj);
            }
        });
        Optional.ofNullable(engagement.getDueDateTime()).map(new la6()).ifPresent(new na6(builderUl));
        Optional.ofNullable(engagement.getNextFollowUpOn()).map(new la6()).ifPresent(new Consumer() { // from class: o.prg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.nextFollowUpOn((String) obj);
            }
        });
        Optional.ofNullable(engagement.getReminderDateTime()).map(new la6()).ifPresent(new oa6(builderUl));
        Optional.ofNullable(engagement.getCallStartTime()).map(new la6()).ifPresent(new Consumer() { // from class: o.qrg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callStartTime((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCallEndTime()).map(new la6()).ifPresent(new Consumer() { // from class: o.rrg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callEndTime((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCustomCallOutcomeData()).filter(new Predicate() { // from class: o.srg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.F1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.urg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.customCallOutcomeData((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCustomTaskCompletionData()).filter(new Predicate() { // from class: o.vrg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.G1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.wrg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.customTaskCompletionData((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCustomVisitOutcomeData()).filter(new Predicate() { // from class: o.xrg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.H1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.zrg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.customVisitOutcomeData((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCustomTaskInputData()).filter(new Predicate() { // from class: o.asg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.I1((String) obj);
            }
        }).ifPresent(new bsg(builderUl));
        Optional.ofNullable(engagement.getVisitNote()).filter(new Predicate() { // from class: o.csg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.J1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.ayg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitNote((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVisitLocation()).map(new Function() { // from class: o.dsg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1Var.Pn((Address) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.fsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.visitLocation((AddressInput) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskLocation()).map(new Function() { // from class: o.dsg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1Var.Pn((Address) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskLocation((AddressInput) obj);
            }
        });
        Optional.ofNullable(engagement.getUserNumber()).filter(new Predicate() { // from class: o.hsg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.K1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.isg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.userNumber((String) obj);
            }
        });
        Optional.ofNullable(engagement.getExternalNumber()).filter(new Predicate() { // from class: o.ksg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.L1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.lsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.externalNumber((String) obj);
            }
        });
        Optional.ofNullable(engagement.getNextStepTask()).map(new pj3()).ifPresent(new Consumer() { // from class: o.gyg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.nextStepTaskId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskHeading()).filter(new Predicate() { // from class: o.msg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.M1((String) obj);
            }
        }).ifPresent(new osg(builderUl));
        Optional.ofNullable(engagement.getTaskInputNote()).filter(new Predicate() { // from class: o.psg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.N1((String) obj);
            }
        }).ifPresent(new n96(builderUl));
        Optional.ofNullable(engagement.getTaskCompletionNote()).filter(new Predicate() { // from class: o.qsg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.O1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.rsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskCompletionNote((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskCompletionTime()).map(new ri()).ifPresent(new Consumer() { // from class: o.ssg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskCompletionTime((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskCompletionType()).filter(new Predicate() { // from class: o.tsg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.P1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.vsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.taskCompletionType((String) obj);
            }
        });
        Optional.ofNullable(engagement.getIsManualTask()).ifPresent(new Consumer() { // from class: o.wsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.isManualTask((Boolean) obj);
            }
        });
        Optional.ofNullable(engagement.getUploadedFiledUrl()).ifPresent(new Consumer() { // from class: o.ysg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.uploadedFiledUrl((String) obj);
            }
        });
        Optional.ofNullable(engagement.getSyncStatus()).ifPresent(new Consumer() { // from class: o.zsg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.syncStatus((Boolean) obj);
            }
        });
        Optional.ofNullable((String) Optional.ofNullable(engagement.getPrimaryTeamId()).orElse(str)).ifPresent(new ea6(builderUl));
        Optional.ofNullable(engagement.getContactPrimaryTeamId()).ifPresent(new Consumer() { // from class: o.atg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.contactPrimaryTeamId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getContactOwnerId()).ifPresent(new Consumer() { // from class: o.btg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.contactOwnerId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getNoteHeading()).ifPresent(new Consumer() { // from class: o.ctg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.noteHeading((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTaskHeading()).ifPresent(new osg(builderUl));
        Optional.ofNullable(engagement.getOwnerId()).ifPresent(new dtg(builderUl));
        Optional.ofNullable(engagement.getDurationInMillis()).filter(new Predicate() { // from class: o.etg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.Q1((Integer) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gtg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.durationInMillis((Integer) obj);
            }
        });
        Optional.ofNullable(engagement.getCampaignRun()).ifPresent(new Consumer() { // from class: o.itg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.campaignRun((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCampaignId()).ifPresent(new Consumer() { // from class: o.jtg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.campaignId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getEngagementSource()).ifPresent(new Consumer() { // from class: o.ktg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.engagementSource((String) obj);
            }
        });
        Optional.ofNullable(engagement.getEngagementSourceType()).ifPresent(new Consumer() { // from class: o.ltg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.engagementSourceType((String) obj);
            }
        });
        Optional.ofNullable(engagement.getEngagementSourceLevelTwo()).ifPresent(new Consumer() { // from class: o.mtg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.engagementSourceLevelTwo((String) obj);
            }
        });
        Optional.ofNullable(engagement.getParentEngagement()).map(new pj3()).ifPresent(new qa6(builderUl));
        Optional.of(engagement.getId()).filter(new Predicate() { // from class: o.ntg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.R1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.otg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.id((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVideoCallPlatform()).filter(new Predicate() { // from class: o.ptg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.S1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.lwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.videoCallPlatform((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVideoCallLink()).filter(new Predicate() { // from class: o.mwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.T1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.nwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.videoCallLink((String) obj);
            }
        });
        Optional.ofNullable(engagement.getVideoCallMetadata()).filter(new Predicate() { // from class: o.owg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.U1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.pwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.videoCallMetadata((String) obj);
            }
        });
        Optional.ofNullable(engagement.getTotalCallDuration()).filter(new Predicate() { // from class: o.rwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.V1((Integer) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.swg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.totalCallDuration((Integer) obj);
            }
        });
        Optional.ofNullable(engagement.getCloudProvider()).filter(new Predicate() { // from class: o.twg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.W1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.uwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.cloudProvider((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCloudProviderNumber()).filter(new Predicate() { // from class: o.vwg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.X1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.xwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.cloudProviderNumber((String) obj);
            }
        });
        Optional.ofNullable(engagement.getHangupReason()).filter(new Predicate() { // from class: o.ywg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.Y1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.zwg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.hangupReason((String) obj);
            }
        });
        Optional.ofNullable(engagement.getCallType()).filter(new Predicate() { // from class: o.axg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.Z1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.cxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.callType((String) obj);
            }
        });
        Optional.ofNullable(engagement.getPhoneCallLogId()).filter(new Predicate() { // from class: o.dxg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.a2((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.exg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.phoneCallLogId((String) obj);
            }
        });
        Optional.ofNullable(engagement.getDeviceId()).filter(new Predicate() { // from class: o.fxg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.b2((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gxg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUl.deviceId((String) obj);
            }
        });
        return builderUl;
    }

    public static /* synthetic */ boolean Z1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 Z2(l1 l1Var, String str, int i, x6c x6cVar) {
        return l1Var.uk(uyh.of(SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).ownerId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(type.EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build()).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i, x6cVar).m47686M(new rl7() { // from class: o.iyg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.F2((PaginatedTokenResults) obj);
            }
        });
    }

    public static x6c a1(final EngagementSummary engagementSummary) {
        final ArrayList<FileObjectRelationshipSummary> addedLinkedFiles = engagementSummary.getAddedLinkedFiles();
        final ArrayList<String> deletedLinkedFiles = engagementSummary.getDeletedLinkedFiles();
        return S0().m55717M(new rl7() { // from class: o.qwg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.o2(engagementSummary, addedLinkedFiles, deletedLinkedFiles, (l1) obj);
            }
        });
    }

    public static /* synthetic */ boolean a2(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 a3(int i) {
        l1 l1VarTB = uni.kC().TB();
        return Z2(l1VarTB, l1VarTB.Eo(), i, uni.kC().bC().U2(l1VarTB, new Function() { // from class: o.uvg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.G2((Engagement) obj);
            }
        }));
    }

    public static x6c b1(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        return a1(engagementSummary).d0(new rl7() { // from class: o.jsg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.q2(engagementSummary2, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.usg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.r2((x6c) obj);
            }
        });
    }

    public static /* synthetic */ boolean b2(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 b3(l1 l1Var, final String str, List list, int i, x6c x6cVar) {
        SearchableEngagementFilterInput.Builder builderEngagementStatus = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(type.EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build());
        return l1Var.uk(uyh.of(((StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) ? builderEngagementStatus.or((List) list.stream().filter(new Predicate() { // from class: o.zug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.H2((String) obj);
            }
        }).map(new Function() { // from class: o.avg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.I2(str, (String) obj);
            }
        }).collect(Collectors.toList())) : builderEngagementStatus.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i, x6cVar).m47686M(new rl7() { // from class: o.bvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.J2((PaginatedTokenResults) obj);
            }
        });
    }

    public static x6c c1(final Engagement engagement, final String str, final Long l, final Long l2, final AssignmentOutcome assignmentOutcome, final String str2, final SubmittedFormValues submittedFormValues, final String str3) {
        return S0().m55717M(new rl7() { // from class: o.ovg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.B2(engagement, str, l, l2, str2, assignmentOutcome, str3, submittedFormValues, (l1) obj);
            }
        });
    }

    public static /* synthetic */ x6c c2(EngagementSummary engagementSummary, Engagement engagement) {
        return c1(engagement, engagementSummary.getNextTaskType(), Long.valueOf(engagementSummary.getNextTaskDueDateTime()), Long.valueOf(engagementSummary.getNextTaskReminderTime()), engagementSummary.getNextTaskAssignmentOutcome(), engagementSummary.getCustomNextStepTaskInputData(), engagementSummary.getSubmittedFormValuesNextStepTask(), engagementSummary.getContactID());
    }

    public static s47 c3(String str, List list, int i) {
        l1 l1VarTB = uni.kC().TB();
        return b3(l1VarTB, str, list, i, uni.kC().bC().V2(l1VarTB, str, list, new Function() { // from class: o.xxg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.K2((Engagement) obj);
            }
        }));
    }

    public static x6c d1(String str) {
        return uni.kC().TB().tu(str).d0(new yrg());
    }

    public static /* synthetic */ x8c d2(x6c x6cVar) {
        return x6cVar;
    }

    public static x6c d3(SubmittedFormValues submittedFormValues) {
        return Objects.isNull(submittedFormValues) ? x6c.c0(new SubmittedFormValues()) : swd.L0(submittedFormValues);
    }

    public static x6c e1(final String str) {
        return S0().m55717M(new rl7() { // from class: o.mxg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.C2(str, (l1) obj);
            }
        });
    }

    public static /* synthetic */ EngagementSummary e2(EngagementSummary engagementSummary, LeadsSummary leadsSummary) {
        return engagementSummary;
    }

    public static x6c e3(final EngagementSummary engagementSummary) {
        if (StringUtils.isBlank(engagementSummary.getId()) || StringUtils.isBlank(engagementSummary.getEngagementType()) || StringUtils.isBlank(engagementSummary.getEngagementStatus())) {
            throw new RuntimeException("You must provide task id, task type, task status for updates");
        }
        return S0().m55717M(new rl7() { // from class: o.bxg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.W2(engagementSummary, (l1) obj);
            }
        });
    }

    public static /* synthetic */ boolean f1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x6c f2(final EngagementSummary engagementSummary, AssignmentOutcome assignmentOutcome) {
        assignmentOutcome.setAssignedTeamId(engagementSummary.getTeamId());
        return lw9.m38019V(Arrays.asList(engagementSummary.getContact()), assignmentOutcome).d0(new rl7() { // from class: o.ytg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.e2(engagementSummary, (LeadsSummary) obj);
            }
        });
    }

    public static /* synthetic */ String g1(String str, String str2) {
        return StringUtils.isBlank(str) ? String.format("Next Step For Call On : %s", str2) : th1.m49853e(str.toLowerCase());
    }

    public static /* synthetic */ x8c g2(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        SubmittedFormValues submittedFormValues = engagementSummary.getSubmittedFormValues();
        if (submittedFormValues != null && (submittedFormValues.getObjectId() == null || submittedFormValues.getObjectId().isEmpty())) {
            submittedFormValues.setObjectId(engagementSummary2.getId());
        }
        return engagementSummary.getTransferLeadOnNextStepTask() ? (x8c) Optional.ofNullable(engagementSummary.getNextTaskAssignmentOutcome()).map(new Function() { // from class: o.xvg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.f2(engagementSummary2, (AssignmentOutcome) obj);
            }
        }).orElse(x6c.c0(engagementSummary2)) : x6c.c0(engagementSummary2);
    }

    public static /* synthetic */ String h1(String str, String str2) {
        return StringUtils.isBlank(str) ? String.format("Next Step For Note : %s", str2) : th1.m49853e(str.toLowerCase());
    }

    public static /* synthetic */ EngagementSummary h2(EngagementSummary engagementSummary, List list) {
        return engagementSummary;
    }

    public static /* synthetic */ String i1(String str, String str2) {
        return StringUtils.isBlank(str) ? String.format("Next Step Task", new Object[0]) : th1.m49853e(str.toLowerCase());
    }

    public static /* synthetic */ x8c i2(List list, final EngagementSummary engagementSummary) {
        return fz6.m27786D((String) Optional.ofNullable(engagementSummary.getContact()).map(new sv9()).orElse(""), engagementSummary.getId(), list).d0(new rl7() { // from class: o.ttg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.h2(engagementSummary, (List) obj);
            }
        });
    }

    public static /* synthetic */ String j1(String str, String str2) {
        return StringUtils.isBlank(str) ? String.format("Next Step After Visit On : %s", str2) : th1.m49853e(str.toLowerCase());
    }

    public static /* synthetic */ EngagementSummary j2(EngagementSummary engagementSummary, List list) {
        return engagementSummary;
    }

    public static /* synthetic */ boolean k1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c k2(List list, final EngagementSummary engagementSummary) {
        return fz6.m27801o(list).d0(new rl7() { // from class: o.vvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.j2(engagementSummary, (List) obj);
            }
        });
    }

    public static /* synthetic */ boolean l1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ EngagementSummary l2(EngagementSummary engagementSummary, SubmittedFormValues submittedFormValues) {
        return engagementSummary;
    }

    public static /* synthetic */ x8c m1(final CreateEngagementInput.Builder builder, l1 l1Var, syh syhVar) {
        Optional optionalFilter = Optional.ofNullable((String) syhVar.f46121a).filter(new Predicate() { // from class: o.sug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.k1((String) obj);
            }
        });
        Objects.requireNonNull(builder);
        optionalFilter.ifPresent(new dtg(builder));
        Optional.ofNullable((String) syhVar.f46122b).filter(new Predicate() { // from class: o.tug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.l1((String) obj);
            }
        }).ifPresent(new ea6(builder));
        Optional.ofNullable((ContactAssignmentStatus) syhVar.f46123c).ifPresent(new Consumer() { // from class: o.uug
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.toBeAssigned((ContactAssignmentStatus) obj);
            }
        });
        return l1Var.Ho(builder.build()).d0(new yrg());
    }

    public static /* synthetic */ x8c m2(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        return d3(engagementSummary.getSubmittedFormValues()).d0(new rl7() { // from class: o.wvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.l2(engagementSummary2, (SubmittedFormValues) obj);
            }
        });
    }

    public static /* synthetic */ x8c n1(final l1 l1Var, Engagement engagement, String str, Long l, Long l2, String str2, final String str3, AssignmentOutcome assignmentOutcome, String str4) {
        final CreateEngagementInput.Builder builderUl = l1Var.ul(type.EngagementType.TASK, EngagementStatus.ACTIVE, engagement.getBody(), str, str4);
        builderUl.parentEngagementId(engagement.getId());
        Optional.ofNullable(engagement.getPrimaryTeamId()).filter(new Predicate() { // from class: o.iug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.f1((String) obj);
            }
        }).ifPresent(new ea6(builderUl));
        Optional.ofNullable(l).map(new ko()).ifPresent(new na6(builderUl));
        Optional.ofNullable(l2).map(new ko()).ifPresent(new oa6(builderUl));
        Optional.ofNullable(str2).ifPresent(new bsg(builderUl));
        switch (C14681a.f31262b[engagement.getEngagementType().ordinal()]) {
            case 1:
                Optional.of((String) Optional.ofNullable(engagement.getCallStartTime()).map(new Function() { // from class: o.lug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return a81.m16654i((Temporal.DateTime) obj);
                    }
                }).orElse("")).map(new Function() { // from class: o.pug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return jyg.g1(str3, (String) obj);
                    }
                }).ifPresent(new osg(builderUl));
                Optional.ofNullable(engagement.getBody()).ifPresent(new n96(builderUl));
                break;
            case 2:
            case 3:
            case 4:
                Optional.of((String) Optional.ofNullable(engagement.getNoteHeading()).orElse("")).map(new Function() { // from class: o.jug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return jyg.h1(str3, (String) obj);
                    }
                }).ifPresent(new osg(builderUl));
                Optional.ofNullable(engagement.getBody()).ifPresent(new n96(builderUl));
                break;
            case 5:
                Optional.of((String) Optional.ofNullable(engagement.getTaskType()).orElse("")).map(new Function() { // from class: o.kug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return jyg.i1(str3, (String) obj);
                    }
                }).ifPresent(new osg(builderUl));
                Optional.ofNullable(engagement.getTaskCompletionNote()).ifPresent(new n96(builderUl));
                break;
            case 6:
                Optional.of((String) Optional.ofNullable(engagement.getVisitTime()).map(new Function() { // from class: o.lug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return a81.m16654i((Temporal.DateTime) obj);
                    }
                }).orElse("")).map(new Function() { // from class: o.nug
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return jyg.j1(str3, (String) obj);
                    }
                }).ifPresent(new osg(builderUl));
                Optional.ofNullable(engagement.getBody()).ifPresent(new n96(builderUl));
                break;
        }
        Optional.ofNullable(str3).ifPresent(new hxg(builderUl));
        return V0(l1Var, assignmentOutcome).m55717M(new rl7() { // from class: o.oug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.m1(builderUl, l1Var, (syh) obj);
            }
        });
    }

    public static /* synthetic */ x8c n2(l1 l1Var, final EngagementSummary engagementSummary, final List list, final List list2, String str) {
        CreateEngagementInput.Builder builderZ0 = Z0(l1Var, engagementSummary.getEngagement(), str);
        return builderZ0 == null ? x6c.m55694H(new RuntimeException("Couldn't construct engagement input, check if contact id specified")) : l1Var.Ho(builderZ0.build()).d0(new rl7() { // from class: o.dvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.c2(engagementSummary, (Engagement) obj);
            }
        }).m55717M(new rl7() { // from class: o.evg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.d2((x6c) obj);
            }
        }).d0(new yrg()).m55717M(new rl7() { // from class: o.fvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.g2(engagementSummary, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.gvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.i2(list, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.hvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.k2(list2, (EngagementSummary) obj);
            }
        }).m55717M(new rl7() { // from class: o.ivg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.m2(engagementSummary, (EngagementSummary) obj);
            }
        });
    }

    public static /* synthetic */ x8c o1(final Engagement engagement, final String str, final Long l, final Long l2, final String str2, final String str3, final AssignmentOutcome assignmentOutcome, final l1 l1Var) {
        return l1Var.tn().m55717M(new rl7() { // from class: o.cug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.n1(l1Var, engagement, str, l, l2, str2, str3, assignmentOutcome, (String) obj);
            }
        });
    }

    public static /* synthetic */ x8c o2(final EngagementSummary engagementSummary, final List list, final List list2, final l1 l1Var) {
        return l1Var.tn().m55717M(new rl7() { // from class: o.cvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.n2(l1Var, engagementSummary, list, list2, (String) obj);
            }
        });
    }

    public static /* synthetic */ boolean p1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ EngagementSummary p2(EngagementSummary engagementSummary, EngagementSummary engagementSummary2) {
        return engagementSummary;
    }

    public static /* synthetic */ String q1(List list) {
        return (String) list.stream().findFirst().map(new Function() { // from class: o.rug
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TeamMember) obj).getTeamId();
            }
        }).orElse("");
    }

    public static /* synthetic */ x6c q2(EngagementSummary engagementSummary, final EngagementSummary engagementSummary2) {
        engagementSummary.setNextTask(engagementSummary2.getId());
        engagementSummary.setNextTaskType(engagementSummary2.getTaskType());
        engagementSummary.setNextTaskDueDateTime(engagementSummary2.getNextTaskDueDateTime());
        return e3(engagementSummary).d0(new rl7() { // from class: o.mvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.p2(engagementSummary2, (EngagementSummary) obj);
            }
        });
    }

    public static /* synthetic */ x6c r1(String str, l1 l1Var) {
        return (StringUtils.isBlank(str) || Objects.equals(str, l1Var.Eo())) ? x6c.c0(l1Var.zz()) : l1Var.Qp(str, l1Var.on()).d0(new rl7() { // from class: o.qug
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.q1((List) obj);
            }
        });
    }

    public static /* synthetic */ x8c r2(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ syh s1(String str, ContactAssignmentStatus contactAssignmentStatus, String str2) {
        return uyh.of(str, str2, contactAssignmentStatus);
    }

    public static /* synthetic */ boolean t1(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ x8c u1(EngagementSummary engagementSummary, ContactAssignmentStatus contactAssignmentStatus, l1 l1Var, String str, String str2) {
        final UpdateEngagementInput.Builder builderUpdatedAt = UpdateEngagementInput.builder().id(engagementSummary.getId()).toBeAssigned(contactAssignmentStatus).accountId(l1Var.on()).engagementStatus(EngagementStatus.valueOf(engagementSummary.getEngagementStatus())).engagementType(type.EngagementType.valueOf(engagementSummary.getEngagementType())).updatedById(l1Var.Eo()).updatedAt(a81.m16653h(Long.valueOf(System.currentTimeMillis())));
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(builderUpdatedAt);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.fug
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.ownerId((String) obj);
            }
        });
        Optional.ofNullable(str2).filter(new Predicate() { // from class: o.gug
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jyg.t1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hug
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.primaryTeamId((String) obj);
            }
        });
        return l1Var.u9(builderUpdatedAt.build()).d0(new yrg());
    }

    public static /* synthetic */ boolean u2(Long l, Temporal.DateTime dateTime) {
        return Objects.equals(l, Long.valueOf(dateTime.toDate().getTime()));
    }

    public static /* synthetic */ x6c v1(String str, String str2, ContactAssignmentStatus contactAssignmentStatus, EngagementSummary engagementSummary) {
        return W0(engagementSummary, str, str2, contactAssignmentStatus);
    }

    public static /* synthetic */ boolean v2(Long l, Temporal.DateTime dateTime) {
        return Objects.equals(l, Long.valueOf(dateTime.toDate().getTime()));
    }

    public static /* synthetic */ x8c w1(List list, syh syhVar) {
        final String str = (String) syhVar.f46121a;
        final String str2 = (String) syhVar.f46122b;
        final ContactAssignmentStatus contactAssignmentStatus = (ContactAssignmentStatus) syhVar.f46123c;
        return x6c.m55704n((List) list.stream().map(new Function() { // from class: o.vtg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jyg.v1(str, str2, contactAssignmentStatus, (EngagementSummary) obj);
            }
        }).collect(Collectors.toList()));
    }

    public static /* synthetic */ boolean w2(String str, String str2) {
        return Objects.equals(Optional.ofNullable(str).orElse(""), Optional.ofNullable(str2).orElse(""));
    }

    public static /* synthetic */ x8c x1(AssignmentOutcome assignmentOutcome, final List list, l1 l1Var) {
        return V0(l1Var, assignmentOutcome).m55717M(new rl7() { // from class: o.tvg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.w1(list, (syh) obj);
            }
        });
    }

    public static /* synthetic */ EngagementSummary x2(String str, EngagementSummary engagementSummary) {
        engagementSummary.setTaskType(str);
        return engagementSummary;
    }

    public static /* synthetic */ EngagementSummary y1(String str, EngagementSummary engagementSummary) {
        engagementSummary.setCallRecordingUrl(str);
        return engagementSummary;
    }

    public static /* synthetic */ x8c y2(EngagementSummary engagementSummary, SubmittedFormValues submittedFormValues) {
        return x6c.c0(engagementSummary.getEngagement());
    }

    public static /* synthetic */ x8c z1(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ x8c z2(SubmittedFormValues submittedFormValues, String str, final EngagementSummary engagementSummary, Engagement engagement) {
        if (submittedFormValues == null) {
            return x6c.c0(engagementSummary.getEngagement());
        }
        submittedFormValues.setObjectId(str);
        return d3(submittedFormValues).m55717M(new rl7() { // from class: o.ztg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jyg.y2(engagementSummary, (SubmittedFormValues) obj);
            }
        });
    }
}
