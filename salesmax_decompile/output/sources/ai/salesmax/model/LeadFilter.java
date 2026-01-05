package ai.salesmax.model;

import ai.salesmax.model.LeadFilter;
import ai.salesmax.model.LeadSource;
import ai.salesmax.services.model.SavedTableViewInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2145n;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.objectweb.asm.Opcodes;
import p001o.a81;
import p001o.ch3;
import p001o.dh3;
import p001o.e4f;
import p001o.f9g;
import p001o.gge;
import p001o.h8g;
import p001o.hpb;
import p001o.hq9;
import p001o.id5;
import p001o.ja8;
import p001o.kf9;
import p001o.kh3;
import p001o.mge;
import p001o.ryh;
import p001o.sq8;
import p001o.u91;
import p001o.uni;
import p001o.uyh;
import p001o.v1f;
import p001o.wi0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import type.LeadLifecycleStage;
import type.SearchableContactFilterInput;
import type.SearchableContactSortInput;
import type.SearchableContactSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableIntFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public final class LeadFilter implements Parcelable {
    private static LeadFilter _instance;
    private List<EntityListInfo> bulkLoadReferences;
    private String businessName;
    private List<PropertyOptions> callOutcomeTypeList;
    private String contactSource;
    private String contactSourceDrillDownOne;
    private List<PropertyOptions> contactSourceOptions;
    private FormFields formFields;
    private boolean hideClosedLeads;
    private Boolean isCustomer;
    private String lastCallOutcome;
    private Long lastCalledTimeFrom;
    private Long lastCalledTimeTo;
    private Long lastEngagedFrom;
    private Long lastEngagedTo;
    private Long lastLeadAssignmentDateTimeFrom;
    private Long lastLeadAssignmentDateTimeTo;
    private Long lastLeadCreateDateTimeFrom;
    private Long lastLeadCreateDateTimeTo;
    private String leadFilterType;
    private String leadLifecycleStage;
    private Boolean openPayment;
    private Boolean opnTask;
    private Integer prospectingAttempts;
    private SavedTableViewInfo savedTableView;
    private String searchText;
    private String selectedTeamId;
    private String selectedUserId;
    private String sortByField;
    private String sortDirection;
    private String unconnectedLastCallOutcome;
    private Integer unsuccessfulCallAttempts;
    private boolean useSavedTableView;
    private List<PropertyOptions> userDefinedTagOptions;
    private List<String> userDefinedTags;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeadFilter> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final LeadFilter fromJson(String str) {
            sq8.m48649h(str, "jsonObj");
            return ((LeadFilter) ja8.f30035c.fromJson(str, LeadFilter.class)).clone();
        }

        public final LeadFilter get_instance() {
            return LeadFilter._instance;
        }

        public final synchronized LeadFilter instance() {
            LeadFilter leadFilter;
            if (get_instance() == null) {
                set_instance(new LeadFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, 3, null));
            }
            leadFilter = get_instance();
            sq8.m48647f(leadFilter, "null cannot be cast to non-null type ai.salesmax.model.LeadFilter");
            return leadFilter;
        }

        public final void set_instance(LeadFilter leadFilter) {
            LeadFilter._instance = leadFilter;
        }

        public final String toJson(LeadFilter leadFilter) {
            sq8.m48649h(leadFilter, "leadFilter");
            String json = ja8.f30035c.toJson(leadFilter.clone());
            sq8.m48648g(json, "toJson(...)");
            return json;
        }
    }

    public static final class Creator implements Parcelable.Creator<LeadFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadFilter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PropertyOptions.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList5.add(PropertyOptions.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList5;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList6.add(PropertyOptions.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList6;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            SavedTableViewInfo savedTableViewInfoCreateFromParcel = parcel.readInt() == 0 ? null : SavedTableViewInfo.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList7.add(EntityListInfo.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList4 = arrayList7;
            }
            return new LeadFilter(string, string2, arrayList, arrayListCreateStringArrayList, arrayList2, string3, string4, arrayList3, numValueOf, numValueOf2, boolValueOf, boolValueOf2, boolValueOf3, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, string5, string6, z, savedTableViewInfoCreateFromParcel, string7, arrayList4, parcel.readInt() != 0, parcel.readInt() == 0 ? null : FormFields.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadFilter[] newArray(int i) {
            return new LeadFilter[i];
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$10, reason: invalid class name */
    public static final class AnonymousClass10 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            if ("ANY_UNCONTACTED_CALLS".equals(str)) {
                ((SearchableContactFilterInput.Builder) this.$builder.f25106a).lastCallDuration(SearchableIntFilterInput.builder().eq(0).build());
            } else {
                ((SearchableContactFilterInput.Builder) this.$builder.f25106a).lastCallOutcome(SearchableStringFilterInput.builder().eq(str).build());
            }
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$11, reason: invalid class name */
    public static final class AnonymousClass11 extends kf9 implements xk7 {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$12, reason: invalid class name */
    public static final class AnonymousClass12 extends kf9 implements xk7 {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastLeadAssignmentDateTime(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$13, reason: invalid class name */
    public static final class AnonymousClass13 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$14, reason: invalid class name */
    public static final class AnonymousClass14 extends kf9 implements xk7 {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(Long.valueOf(a81.m16668w(a81.m16658m(l).toDate(), 1).getTime()));
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$15, reason: invalid class name */
    public static final class AnonymousClass15 extends kf9 implements xk7 {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastLeadAssignmentDateTime(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$16, reason: invalid class name */
    public static final class AnonymousClass16 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$17, reason: invalid class name */
    public static final class AnonymousClass17 extends kf9 implements xk7 {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$18, reason: invalid class name */
    public static final class AnonymousClass18 extends kf9 implements xk7 {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().createdAt(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$19, reason: invalid class name */
    public static final class AnonymousClass19 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$2 */
    public static final class C02372 extends kf9 implements xk7 {
        public static final C02372 INSTANCE = new C02372();

        public C02372() {
            super(1);
        }

        @Override // p001o.xk7
        public final List<String> invoke(String str) {
            LeadSource.Companion companion = LeadSource.Companion;
            sq8.m48646e(str);
            return companion.relatedLeadSources(str);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$20, reason: invalid class name */
    public static final class AnonymousClass20 extends kf9 implements xk7 {
        public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

        public AnonymousClass20() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(Long.valueOf(a81.m16668w(a81.m16658m(l).toDate(), 1).getTime()));
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$21, reason: invalid class name */
    public static final class AnonymousClass21 extends kf9 implements xk7 {
        public static final AnonymousClass21 INSTANCE = new AnonymousClass21();

        public AnonymousClass21() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().createdAt(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$22, reason: invalid class name */
    public static final class AnonymousClass22 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$23, reason: invalid class name */
    public static final class AnonymousClass23 extends kf9 implements xk7 {
        public static final AnonymousClass23 INSTANCE = new AnonymousClass23();

        public AnonymousClass23() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$24, reason: invalid class name */
    public static final class AnonymousClass24 extends kf9 implements xk7 {
        public static final AnonymousClass24 INSTANCE = new AnonymousClass24();

        public AnonymousClass24() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastCalledTime(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$25, reason: invalid class name */
    public static final class AnonymousClass25 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass25(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$26, reason: invalid class name */
    public static final class AnonymousClass26 extends kf9 implements xk7 {
        public static final AnonymousClass26 INSTANCE = new AnonymousClass26();

        public AnonymousClass26() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(Long.valueOf(a81.m16668w(a81.m16658m(l).toDate(), 1).getTime()));
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$27, reason: invalid class name */
    public static final class AnonymousClass27 extends kf9 implements xk7 {
        public static final AnonymousClass27 INSTANCE = new AnonymousClass27();

        public AnonymousClass27() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastCalledTime(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$28, reason: invalid class name */
    public static final class AnonymousClass28 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass28(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$29, reason: invalid class name */
    public static final class AnonymousClass29 extends kf9 implements xk7 {
        public static final AnonymousClass29 INSTANCE = new AnonymousClass29();

        public AnonymousClass29() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$3 */
    public static final class C02383 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02383(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) obj);
            return y3i.f54824a;
        }

        public final void invoke(List<String> list) {
            sq8.m48649h(list, "it");
            if (list.size() == 1) {
                ((SearchableContactFilterInput.Builder) this.$builder.f25106a).contactSource(SearchableStringFilterInput.builder().eq(list.get(0)).build());
                return;
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SearchableContactFilterInput.builder().contactSource(SearchableStringFilterInput.builder().eq((String) it.next()).build()).build());
            }
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).or(arrayList);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$30, reason: invalid class name */
    public static final class AnonymousClass30 extends kf9 implements xk7 {
        public static final AnonymousClass30 INSTANCE = new AnonymousClass30();

        public AnonymousClass30() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastEngagementFromAccount(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$31, reason: invalid class name */
    public static final class AnonymousClass31 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass31(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$32, reason: invalid class name */
    public static final class AnonymousClass32 extends kf9 implements xk7 {
        public static final AnonymousClass32 INSTANCE = new AnonymousClass32();

        public AnonymousClass32() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(Long.valueOf(a81.m16668w(a81.m16658m(l).toDate(), 1).getTime()));
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$33, reason: invalid class name */
    public static final class AnonymousClass33 extends kf9 implements xk7 {
        public static final AnonymousClass33 INSTANCE = new AnonymousClass33();

        public AnonymousClass33() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            return SearchableContactFilterInput.builder().lastEngagementFromAccount(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$34, reason: invalid class name */
    public static final class AnonymousClass34 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass34(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$35, reason: invalid class name */
    public static final class AnonymousClass35 extends kf9 implements xk7 {
        public static final AnonymousClass35 INSTANCE = new AnonymousClass35();

        public AnonymousClass35() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(Boolean bool) {
            sq8.m48646e(bool);
            return bool;
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$36, reason: invalid class name */
    public static final class AnonymousClass36 extends kf9 implements xk7 {
        public static final AnonymousClass36 INSTANCE = new AnonymousClass36();

        public AnonymousClass36() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(Boolean bool) {
            return SearchableContactFilterInput.builder().leadLifecycleStage(SearchableStringFilterInput.builder().ne(LeadLifecycleStage.CLOSED.name()).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$37, reason: invalid class name */
    public static final class AnonymousClass37 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass37(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$38, reason: invalid class name */
    public static final class AnonymousClass38 extends kf9 implements xk7 {
        public static final AnonymousClass38 INSTANCE = new AnonymousClass38();

        public AnonymousClass38() {
            super(1);
        }

        @Override // p001o.xk7
        public final Map<String, Object> invoke(FormFields formFields) {
            return formFields.toSavedTableFilterCriterias();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$39, reason: invalid class name */
    public static final class AnonymousClass39 extends kf9 implements xk7 {
        public static final AnonymousClass39 INSTANCE = new AnonymousClass39();

        public AnonymousClass39() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(Map<String, ? extends Object> map) {
            sq8.m48646e(map);
            return Boolean.valueOf(!map.isEmpty());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$40, reason: invalid class name */
    public static final class AnonymousClass40 extends kf9 implements xk7 {
        public static final AnonymousClass40 INSTANCE = new AnonymousClass40();

        public AnonymousClass40() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(Map<String, ? extends Object> map) {
            return e4f.Dv(map, null);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$41, reason: invalid class name */
    public static final class AnonymousClass41 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass41(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$42, reason: invalid class name */
    public static final class AnonymousClass42 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass42(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Integer) obj);
            return y3i.f54824a;
        }

        public final void invoke(Integer num) {
            sq8.m48649h(num, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).prospectingAttempts(SearchableIntFilterInput.builder().gte(num).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$43, reason: invalid class name */
    public static final class AnonymousClass43 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass43(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Integer) obj);
            return y3i.f54824a;
        }

        public final void invoke(Integer num) {
            sq8.m48649h(num, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).unsuccessfulCallAttempts(SearchableIntFilterInput.builder().gte(num).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$44, reason: invalid class name */
    public static final class AnonymousClass44 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass44(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return y3i.f54824a;
        }

        public final void invoke(Boolean bool) {
            sq8.m48649h(bool, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).openTaskDetail__taskType(SearchableStringFilterInput.builder().exists(bool).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$45, reason: invalid class name */
    public static final class AnonymousClass45 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass45(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return y3i.f54824a;
        }

        public final void invoke(Boolean bool) {
            sq8.m48649h(bool, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).paymentRequestDetail(SearchableStringFilterInput.builder().exists(bool).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$46, reason: invalid class name */
    public static final class AnonymousClass46 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass46(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).businessDetail__name(SearchableStringFilterInput.builder().eq(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$47, reason: invalid class name */
    public static final class AnonymousClass47 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass47(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).contactSourceDrillDownOne(SearchableStringFilterInput.builder().eq(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$48, reason: invalid class name */
    public static final class AnonymousClass48 extends kf9 implements xk7 {
        public static final AnonymousClass48 INSTANCE = new AnonymousClass48();

        public AnonymousClass48() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Boolean bool) {
            sq8.m48646e(bool);
            return bool.booleanValue() ? "true" : "false";
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$49, reason: invalid class name */
    public static final class AnonymousClass49 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass49(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).isCustomer(SearchableStringFilterInput.builder().eq(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$50, reason: invalid class name */
    public static final class AnonymousClass50 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass50(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            ((SearchableContactFilterInput.Builder) this.$builder.f25106a).leadLifecycleStage(SearchableStringFilterInput.builder().eq(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$51, reason: invalid class name */
    public static final class AnonymousClass51 extends kf9 implements xk7 {
        public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

        public AnonymousClass51() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48646e(str);
            return Boolean.valueOf(!f9g.d0(str));
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$52, reason: invalid class name */
    public static final class AnonymousClass52 extends kf9 implements xk7 {
        public AnonymousClass52() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(String str) {
            LeadFilter leadFilter = LeadFilter.this;
            sq8.m48646e(str);
            return leadFilter.searchableContactFilterInputForInputSearchText(str);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$53, reason: invalid class name */
    public static final class AnonymousClass53 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass53(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$7 */
    public static final class C02397 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02397(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) obj);
            return y3i.f54824a;
        }

        public final void invoke(List<String> list) {
            SearchableContactFilterInput.Builder builder = SearchableContactFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
            sq8.m48646e(list);
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SearchableContactFilterInput.builder().userDefinedTags(SearchableStringFilterInput.builder().eq((String) it.next()).build()).build());
            }
            List<SearchableContactFilterInput> listQ0 = kh3.Q0(arrayList);
            gge ggeVar = this.$andConditions;
            if (listQ0.isEmpty()) {
                return;
            }
            builder.or(listQ0);
            List list2 = (List) ggeVar.f25106a;
            SearchableContactFilterInput searchableContactFilterInputBuild = builder.build();
            sq8.m48648g(searchableContactFilterInputBuild, "build(...)");
            list2.add(searchableContactFilterInputBuild);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$8 */
    public static final class C02408 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02408(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<EntityListInfo>) obj);
            return y3i.f54824a;
        }

        public final void invoke(List<EntityListInfo> list) {
            SearchableContactFilterInput.Builder builder = SearchableContactFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
            sq8.m48646e(list);
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SearchableContactFilterInput.builder().bulkUploadReference(SearchableStringFilterInput.builder().eq(((EntityListInfo) it.next()).getId()).build()).build());
            }
            List<SearchableContactFilterInput> listQ0 = kh3.Q0(arrayList);
            gge ggeVar = this.$andConditions;
            if (listQ0.isEmpty()) {
                return;
            }
            builder.or(listQ0);
            List list2 = (List) ggeVar.f25106a;
            SearchableContactFilterInput searchableContactFilterInputBuild = builder.build();
            sq8.m48648g(searchableContactFilterInputBuild, "build(...)");
            list2.add(searchableContactFilterInputBuild);
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getCustomSearchableContactFilterInput$9 */
    public static final class C02419 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02419(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            if ("ANY_UNCONTACTED_CALLS".equals(str)) {
                ((SearchableContactFilterInput.Builder) this.$builder.f25106a).lastCallDuration(SearchableIntFilterInput.builder().eq(0).build());
            } else {
                ((SearchableContactFilterInput.Builder) this.$builder.f25106a).lastCallOutcome(SearchableStringFilterInput.builder().eq(str).build());
            }
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getSearchableContactFilterInputFromSavedViews$2 */
    public static final class C02422 extends kf9 implements xk7 {
        public static final C02422 INSTANCE = new C02422();

        public C02422() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(Boolean bool) {
            sq8.m48646e(bool);
            return bool;
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getSearchableContactFilterInputFromSavedViews$3 */
    public static final class C02433 extends kf9 implements xk7 {
        public static final C02433 INSTANCE = new C02433();

        public C02433() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableContactFilterInput invoke(Boolean bool) {
            return SearchableContactFilterInput.builder().leadLifecycleStage(SearchableStringFilterInput.builder().ne(LeadLifecycleStage.CLOSED.name()).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.LeadFilter$getSearchableContactFilterInputFromSavedViews$4 */
    public static final class C02444 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02444(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableContactFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
            sq8.m48649h(searchableContactFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
        }
    }

    public LeadFilter() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, 3, null);
    }

    public static /* synthetic */ SearchableContactFilterInput getCustomSearchableContactFilterInput$default(LeadFilter leadFilter, SearchableContactFilterInput.Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = null;
        }
        return leadFilter.getCustomSearchableContactFilterInput(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3i getCustomSearchableContactFilterInput$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (y3i) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3i getCustomSearchableContactFilterInput$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (y3i) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$17(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$18(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$19(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$20(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$21(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$22(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$23(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$24(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$25(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$26(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$27(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$28(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$29(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$30(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$31(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$32(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$33(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$34(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$35(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$36(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$37(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$38(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$39(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$40(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCustomSearchableContactFilterInput$lambda$41(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$42(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$43(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getCustomSearchableContactFilterInput$lambda$44(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Map) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCustomSearchableContactFilterInput$lambda$45(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$46(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$47(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$48(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$49(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$50(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$51(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$52(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$53(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCustomSearchableContactFilterInput$lambda$54(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$55(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$56(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCustomSearchableContactFilterInput$lambda$57(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getCustomSearchableContactFilterInput$lambda$58(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$59(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCustomSearchableContactFilterInput$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (List) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCustomSearchableContactFilterInput$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static /* synthetic */ SearchableContactFilterInput getSearchableContactFilterInput$default(LeadFilter leadFilter, SearchableContactFilterInput.Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = null;
        }
        return leadFilter.getSearchableContactFilterInput(builder);
    }

    public static /* synthetic */ SearchableContactFilterInput getSearchableContactFilterInputFromSavedViews$default(LeadFilter leadFilter, SearchableContactFilterInput.Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = null;
        }
        return leadFilter.getSearchableContactFilterInputFromSavedViews(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSearchableContactFilterInputFromSavedViews$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableContactFilterInput getSearchableContactFilterInputFromSavedViews$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableContactFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableContactFilterInputFromSavedViews$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchableContactFilterInput searchableContactFilterInputForInputSearchText(String str) {
        List listM21246k;
        List listM38998j = new mge("[\\s,]+").m38998j(str, 0);
        if (listM38998j.isEmpty()) {
            listM21246k = ch3.m21246k();
        } else {
            ListIterator listIterator = listM38998j.listIterator(listM38998j.size());
            while (listIterator.hasPrevious()) {
                if (!(((String) listIterator.previous()).length() == 0)) {
                    listM21246k = kh3.J0(listM38998j, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM21246k = ch3.m21246k();
        }
        String[] strArr = (String[]) listM21246k.toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            SearchableContactFilterInput.Builder builder = SearchableContactFilterInput.builder();
            SearchableStringFilterInput.Builder builder2 = SearchableStringFilterInput.builder();
            h8g h8gVar = h8g.f26398a;
            String str3 = String.format("*%s*", Arrays.copyOf(new Object[]{str2}, 1));
            sq8.m48648g(str3, "format(...)");
            SearchableContactFilterInput searchableContactFilterInputBuild = builder.name(builder2.wildcard(str3).build()).build();
            sq8.m48648g(searchableContactFilterInputBuild, "build(...)");
            SearchableContactFilterInput.Builder builder3 = SearchableContactFilterInput.builder();
            SearchableStringFilterInput.Builder builder4 = SearchableStringFilterInput.builder();
            String str4 = String.format("*%s*", Arrays.copyOf(new Object[]{str2}, 1));
            sq8.m48648g(str4, "format(...)");
            SearchableContactFilterInput searchableContactFilterInputBuild2 = builder3.contactNumberDetail__phoneNumber(builder4.wildcard(str4).build()).build();
            sq8.m48648g(searchableContactFilterInputBuild2, "build(...)");
            SearchableContactFilterInput.Builder builder5 = SearchableContactFilterInput.builder();
            SearchableStringFilterInput.Builder builder6 = SearchableStringFilterInput.builder();
            String str5 = String.format("*%s*", Arrays.copyOf(new Object[]{str2}, 1));
            sq8.m48648g(str5, "format(...)");
            SearchableContactFilterInput searchableContactFilterInputBuild3 = builder5.businessDetail__name(builder6.wildcard(str5).build()).build();
            sq8.m48648g(searchableContactFilterInputBuild3, "build(...)");
            SearchableContactFilterInput searchableContactFilterInputBuild4 = SearchableContactFilterInput.builder().or(Arrays.asList(searchableContactFilterInputBuild, searchableContactFilterInputBuild2, searchableContactFilterInputBuild3)).build();
            sq8.m48648g(searchableContactFilterInputBuild4, "build(...)");
            arrayList.add(searchableContactFilterInputBuild4);
        }
        return SearchableContactFilterInput.builder().and(arrayList).build();
    }

    public final void clear() {
        this.leadLifecycleStage = null;
        this.contactSource = null;
        this.userDefinedTags = null;
        this.lastCallOutcome = null;
        this.unconnectedLastCallOutcome = null;
        this.callOutcomeTypeList = null;
        this.prospectingAttempts = null;
        this.unsuccessfulCallAttempts = null;
        this.isCustomer = null;
        this.opnTask = null;
        this.openPayment = null;
        this.lastEngagedFrom = null;
        this.lastEngagedTo = null;
        this.lastCalledTimeFrom = null;
        this.lastCalledTimeTo = null;
        this.lastLeadAssignmentDateTimeFrom = null;
        this.lastLeadAssignmentDateTimeTo = null;
        this.lastLeadCreateDateTimeFrom = null;
        this.lastLeadCreateDateTimeTo = null;
        this.sortByField = null;
        this.sortDirection = null;
        this.useSavedTableView = false;
        this.savedTableView = null;
        this.searchText = null;
        this.bulkLoadReferences = null;
        this.hideClosedLeads = false;
        this.formFields = null;
        this.selectedTeamId = null;
        this.selectedUserId = null;
        this.businessName = null;
        this.contactSourceDrillDownOne = null;
    }

    public final LeadFilter clone() {
        Long l = null;
        LeadFilter leadFilter = new LeadFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, l, l, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, 3, null);
        leadFilter.leadLifecycleStage = this.leadLifecycleStage;
        leadFilter.contactSource = this.contactSource;
        leadFilter.userDefinedTags = this.userDefinedTags;
        leadFilter.lastCallOutcome = this.lastCallOutcome;
        leadFilter.unconnectedLastCallOutcome = this.unconnectedLastCallOutcome;
        leadFilter.callOutcomeTypeList = this.callOutcomeTypeList;
        leadFilter.prospectingAttempts = this.prospectingAttempts;
        leadFilter.unsuccessfulCallAttempts = this.unsuccessfulCallAttempts;
        leadFilter.isCustomer = this.isCustomer;
        leadFilter.opnTask = this.opnTask;
        leadFilter.openPayment = this.openPayment;
        leadFilter.lastEngagedFrom = this.lastEngagedFrom;
        leadFilter.lastEngagedTo = this.lastEngagedTo;
        leadFilter.lastCalledTimeFrom = this.lastCalledTimeFrom;
        leadFilter.lastCalledTimeTo = this.lastCalledTimeTo;
        leadFilter.lastLeadAssignmentDateTimeFrom = this.lastLeadAssignmentDateTimeFrom;
        leadFilter.lastLeadAssignmentDateTimeTo = this.lastLeadAssignmentDateTimeTo;
        leadFilter.lastLeadCreateDateTimeFrom = this.lastLeadCreateDateTimeFrom;
        leadFilter.lastLeadCreateDateTimeTo = this.lastLeadCreateDateTimeTo;
        leadFilter.sortByField = this.sortByField;
        leadFilter.sortDirection = this.sortDirection;
        leadFilter.useSavedTableView = this.useSavedTableView;
        leadFilter.savedTableView = this.savedTableView;
        leadFilter.searchText = this.searchText;
        leadFilter.bulkLoadReferences = this.bulkLoadReferences;
        leadFilter.hideClosedLeads = this.hideClosedLeads;
        leadFilter.formFields = this.formFields;
        leadFilter.selectedTeamId = this.selectedTeamId;
        leadFilter.selectedUserId = this.selectedUserId;
        leadFilter.businessName = this.businessName;
        leadFilter.contactSourceDrillDownOne = this.contactSourceDrillDownOne;
        return leadFilter;
    }

    public final String component1() {
        return this.leadLifecycleStage;
    }

    public final Integer component10() {
        return this.unsuccessfulCallAttempts;
    }

    public final Boolean component11() {
        return this.isCustomer;
    }

    public final Boolean component12() {
        return this.opnTask;
    }

    public final Boolean component13() {
        return this.openPayment;
    }

    public final Long component14() {
        return this.lastEngagedFrom;
    }

    public final Long component15() {
        return this.lastEngagedTo;
    }

    public final Long component16() {
        return this.lastCalledTimeFrom;
    }

    public final Long component17() {
        return this.lastCalledTimeTo;
    }

    public final Long component18() {
        return this.lastLeadAssignmentDateTimeFrom;
    }

    public final Long component19() {
        return this.lastLeadAssignmentDateTimeTo;
    }

    public final String component2() {
        return this.contactSource;
    }

    public final Long component20() {
        return this.lastLeadCreateDateTimeFrom;
    }

    public final Long component21() {
        return this.lastLeadCreateDateTimeTo;
    }

    public final String component22() {
        return this.sortByField;
    }

    public final String component23() {
        return this.sortDirection;
    }

    public final boolean component24() {
        return this.useSavedTableView;
    }

    public final SavedTableViewInfo component25() {
        return this.savedTableView;
    }

    public final String component26() {
        return this.searchText;
    }

    public final List<EntityListInfo> component27() {
        return this.bulkLoadReferences;
    }

    public final boolean component28() {
        return this.hideClosedLeads;
    }

    public final FormFields component29() {
        return this.formFields;
    }

    public final List<PropertyOptions> component3() {
        return this.contactSourceOptions;
    }

    public final String component30() {
        return this.selectedTeamId;
    }

    public final String component31() {
        return this.selectedUserId;
    }

    public final String component32() {
        return this.leadFilterType;
    }

    public final String component33() {
        return this.businessName;
    }

    public final String component34() {
        return this.contactSourceDrillDownOne;
    }

    public final List<String> component4() {
        return this.userDefinedTags;
    }

    public final List<PropertyOptions> component5() {
        return this.userDefinedTagOptions;
    }

    public final String component6() {
        return this.lastCallOutcome;
    }

    public final String component7() {
        return this.unconnectedLastCallOutcome;
    }

    public final List<PropertyOptions> component8() {
        return this.callOutcomeTypeList;
    }

    public final Integer component9() {
        return this.prospectingAttempts;
    }

    public final LeadFilter copy(String str, String str2, List<PropertyOptions> list, List<String> list2, List<PropertyOptions> list3, String str3, String str4, List<PropertyOptions> list4, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str5, String str6, boolean z, SavedTableViewInfo savedTableViewInfo, String str7, List<EntityListInfo> list5, boolean z2, FormFields formFields, String str8, String str9, String str10, String str11, String str12) {
        return new LeadFilter(str, str2, list, list2, list3, str3, str4, list4, num, num2, bool, bool2, bool3, l, l2, l3, l4, l5, l6, l7, l8, str5, str6, z, savedTableViewInfo, str7, list5, z2, formFields, str8, str9, str10, str11, str12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFilter)) {
            return false;
        }
        LeadFilter leadFilter = (LeadFilter) obj;
        return sq8.m48644c(this.leadLifecycleStage, leadFilter.leadLifecycleStage) && sq8.m48644c(this.contactSource, leadFilter.contactSource) && sq8.m48644c(this.contactSourceOptions, leadFilter.contactSourceOptions) && sq8.m48644c(this.userDefinedTags, leadFilter.userDefinedTags) && sq8.m48644c(this.userDefinedTagOptions, leadFilter.userDefinedTagOptions) && sq8.m48644c(this.lastCallOutcome, leadFilter.lastCallOutcome) && sq8.m48644c(this.unconnectedLastCallOutcome, leadFilter.unconnectedLastCallOutcome) && sq8.m48644c(this.callOutcomeTypeList, leadFilter.callOutcomeTypeList) && sq8.m48644c(this.prospectingAttempts, leadFilter.prospectingAttempts) && sq8.m48644c(this.unsuccessfulCallAttempts, leadFilter.unsuccessfulCallAttempts) && sq8.m48644c(this.isCustomer, leadFilter.isCustomer) && sq8.m48644c(this.opnTask, leadFilter.opnTask) && sq8.m48644c(this.openPayment, leadFilter.openPayment) && sq8.m48644c(this.lastEngagedFrom, leadFilter.lastEngagedFrom) && sq8.m48644c(this.lastEngagedTo, leadFilter.lastEngagedTo) && sq8.m48644c(this.lastCalledTimeFrom, leadFilter.lastCalledTimeFrom) && sq8.m48644c(this.lastCalledTimeTo, leadFilter.lastCalledTimeTo) && sq8.m48644c(this.lastLeadAssignmentDateTimeFrom, leadFilter.lastLeadAssignmentDateTimeFrom) && sq8.m48644c(this.lastLeadAssignmentDateTimeTo, leadFilter.lastLeadAssignmentDateTimeTo) && sq8.m48644c(this.lastLeadCreateDateTimeFrom, leadFilter.lastLeadCreateDateTimeFrom) && sq8.m48644c(this.lastLeadCreateDateTimeTo, leadFilter.lastLeadCreateDateTimeTo) && sq8.m48644c(this.sortByField, leadFilter.sortByField) && sq8.m48644c(this.sortDirection, leadFilter.sortDirection) && this.useSavedTableView == leadFilter.useSavedTableView && sq8.m48644c(this.savedTableView, leadFilter.savedTableView) && sq8.m48644c(this.searchText, leadFilter.searchText) && sq8.m48644c(this.bulkLoadReferences, leadFilter.bulkLoadReferences) && this.hideClosedLeads == leadFilter.hideClosedLeads && sq8.m48644c(this.formFields, leadFilter.formFields) && sq8.m48644c(this.selectedTeamId, leadFilter.selectedTeamId) && sq8.m48644c(this.selectedUserId, leadFilter.selectedUserId) && sq8.m48644c(this.leadFilterType, leadFilter.leadFilterType) && sq8.m48644c(this.businessName, leadFilter.businessName) && sq8.m48644c(this.contactSourceDrillDownOne, leadFilter.contactSourceDrillDownOne);
    }

    public final List<EntityListInfo> getBulkLoadReferences() {
        return this.bulkLoadReferences;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final List<PropertyOptions> getCallOutcomeTypeList() {
        return this.callOutcomeTypeList;
    }

    public final String getContactSource() {
        return this.contactSource;
    }

    public final String getContactSourceDrillDownOne() {
        return this.contactSourceDrillDownOne;
    }

    public final List<PropertyOptions> getContactSourceOptions() {
        return this.contactSourceOptions;
    }

    public final SearchableContactFilterInput getCustomSearchableContactFilterInput(SearchableContactFilterInput.Builder builder) {
        String str;
        gge ggeVar = new gge();
        if (builder == null) {
            builder = SearchableContactFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
        }
        ggeVar.f25106a = builder;
        gge ggeVar2 = new gge();
        ggeVar2.f25106a = new ArrayList();
        String strOn = uni.UB().on();
        if (strOn != null) {
            ((SearchableContactFilterInput.Builder) ggeVar.f25106a).accountId(SearchableIDFilterInput.builder().eq(strOn).build());
        }
        Optional optionalOfNullable = Optional.ofNullable(this.contactSource);
        final C02372 c02372 = C02372.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.is9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$8(c02372, obj);
            }
        });
        final C02383 c02383 = new C02383(ggeVar);
        map.ifPresent(new Consumer() { // from class: o.qq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$9(c02383, obj);
            }
        });
        if (sq8.m48644c(this.leadFilterType, "ALL")) {
            String str2 = this.selectedTeamId;
            if (str2 != null) {
                ((SearchableContactFilterInput.Builder) ggeVar.f25106a).primaryTeamId(SearchableIDFilterInput.builder().eq(str2).build());
            }
            String str3 = this.selectedUserId;
            if (str3 != null) {
                ((SearchableContactFilterInput.Builder) ggeVar.f25106a).ownerId(SearchableIDFilterInput.builder().eq(str3).build());
            }
        }
        if (sq8.m48644c(this.leadFilterType, "TEAM") && (str = this.selectedUserId) != null) {
            ((SearchableContactFilterInput.Builder) ggeVar.f25106a).ownerId(SearchableIDFilterInput.builder().eq(str).build());
        }
        Optional optionalOfNullable2 = Optional.ofNullable(this.userDefinedTags);
        final C02397 c02397 = new C02397(ggeVar2);
        optionalOfNullable2.map(new Function() { // from class: o.cr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$13(c02397, obj);
            }
        });
        Optional optionalOfNullable3 = Optional.ofNullable(this.bulkLoadReferences);
        final C02408 c02408 = new C02408(ggeVar2);
        optionalOfNullable3.map(new Function() { // from class: o.pr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$14(c02408, obj);
            }
        });
        if (hq9.m30994a(Optional.ofNullable(this.unconnectedLastCallOutcome))) {
            Optional optionalOfNullable4 = Optional.ofNullable(this.lastCallOutcome);
            final C02419 c02419 = new C02419(ggeVar);
            optionalOfNullable4.ifPresent(new Consumer() { // from class: o.bs9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    LeadFilter.getCustomSearchableContactFilterInput$lambda$15(c02419, obj);
                }
            });
        }
        Optional optionalOfNullable5 = Optional.ofNullable(this.unconnectedLastCallOutcome);
        final AnonymousClass10 anonymousClass10 = new AnonymousClass10(ggeVar);
        optionalOfNullable5.ifPresent(new Consumer() { // from class: o.cs9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$16(anonymousClass10, obj);
            }
        });
        Optional optionalOfNullable6 = Optional.ofNullable(this.lastLeadAssignmentDateTimeFrom);
        final AnonymousClass11 anonymousClass11 = AnonymousClass11.INSTANCE;
        Optional map2 = optionalOfNullable6.map(new Function() { // from class: o.ds9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$17(anonymousClass11, obj);
            }
        });
        final AnonymousClass12 anonymousClass12 = AnonymousClass12.INSTANCE;
        Optional map3 = map2.map(new Function() { // from class: o.es9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$18(anonymousClass12, obj);
            }
        });
        final AnonymousClass13 anonymousClass13 = new AnonymousClass13(ggeVar2);
        map3.ifPresent(new Consumer() { // from class: o.fs9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$19(anonymousClass13, obj);
            }
        });
        Optional optionalOfNullable7 = Optional.ofNullable(this.lastLeadAssignmentDateTimeTo);
        final AnonymousClass14 anonymousClass14 = AnonymousClass14.INSTANCE;
        Optional map4 = optionalOfNullable7.map(new Function() { // from class: o.js9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$20(anonymousClass14, obj);
            }
        });
        final AnonymousClass15 anonymousClass15 = AnonymousClass15.INSTANCE;
        Optional map5 = map4.map(new Function() { // from class: o.ks9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$21(anonymousClass15, obj);
            }
        });
        final AnonymousClass16 anonymousClass16 = new AnonymousClass16(ggeVar2);
        map5.ifPresent(new Consumer() { // from class: o.iq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$22(anonymousClass16, obj);
            }
        });
        Optional optionalOfNullable8 = Optional.ofNullable(this.lastLeadCreateDateTimeFrom);
        final AnonymousClass17 anonymousClass17 = AnonymousClass17.INSTANCE;
        Optional map6 = optionalOfNullable8.map(new Function() { // from class: o.jq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$23(anonymousClass17, obj);
            }
        });
        final AnonymousClass18 anonymousClass18 = AnonymousClass18.INSTANCE;
        Optional map7 = map6.map(new Function() { // from class: o.kq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$24(anonymousClass18, obj);
            }
        });
        final AnonymousClass19 anonymousClass19 = new AnonymousClass19(ggeVar2);
        map7.ifPresent(new Consumer() { // from class: o.lq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$25(anonymousClass19, obj);
            }
        });
        Optional optionalOfNullable9 = Optional.ofNullable(this.lastLeadCreateDateTimeTo);
        final AnonymousClass20 anonymousClass20 = AnonymousClass20.INSTANCE;
        Optional map8 = optionalOfNullable9.map(new Function() { // from class: o.mq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$26(anonymousClass20, obj);
            }
        });
        final AnonymousClass21 anonymousClass21 = AnonymousClass21.INSTANCE;
        Optional map9 = map8.map(new Function() { // from class: o.nq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$27(anonymousClass21, obj);
            }
        });
        final AnonymousClass22 anonymousClass22 = new AnonymousClass22(ggeVar2);
        map9.ifPresent(new Consumer() { // from class: o.oq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$28(anonymousClass22, obj);
            }
        });
        Optional optionalOfNullable10 = Optional.ofNullable(this.lastCalledTimeFrom);
        final AnonymousClass23 anonymousClass23 = AnonymousClass23.INSTANCE;
        Optional map10 = optionalOfNullable10.map(new Function() { // from class: o.pq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$29(anonymousClass23, obj);
            }
        });
        final AnonymousClass24 anonymousClass24 = AnonymousClass24.INSTANCE;
        Optional map11 = map10.map(new Function() { // from class: o.rq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$30(anonymousClass24, obj);
            }
        });
        final AnonymousClass25 anonymousClass25 = new AnonymousClass25(ggeVar2);
        map11.ifPresent(new Consumer() { // from class: o.tq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$31(anonymousClass25, obj);
            }
        });
        Optional optionalOfNullable11 = Optional.ofNullable(this.lastCalledTimeTo);
        final AnonymousClass26 anonymousClass26 = AnonymousClass26.INSTANCE;
        Optional map12 = optionalOfNullable11.map(new Function() { // from class: o.uq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$32(anonymousClass26, obj);
            }
        });
        final AnonymousClass27 anonymousClass27 = AnonymousClass27.INSTANCE;
        Optional map13 = map12.map(new Function() { // from class: o.vq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$33(anonymousClass27, obj);
            }
        });
        final AnonymousClass28 anonymousClass28 = new AnonymousClass28(ggeVar2);
        map13.ifPresent(new Consumer() { // from class: o.wq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$34(anonymousClass28, obj);
            }
        });
        Optional optionalOfNullable12 = Optional.ofNullable(this.lastEngagedFrom);
        final AnonymousClass29 anonymousClass29 = AnonymousClass29.INSTANCE;
        Optional map14 = optionalOfNullable12.map(new Function() { // from class: o.xq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$35(anonymousClass29, obj);
            }
        });
        final AnonymousClass30 anonymousClass30 = AnonymousClass30.INSTANCE;
        Optional map15 = map14.map(new Function() { // from class: o.yq9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$36(anonymousClass30, obj);
            }
        });
        final AnonymousClass31 anonymousClass31 = new AnonymousClass31(ggeVar2);
        map15.ifPresent(new Consumer() { // from class: o.zq9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$37(anonymousClass31, obj);
            }
        });
        Optional optionalOfNullable13 = Optional.ofNullable(this.lastEngagedTo);
        final AnonymousClass32 anonymousClass32 = AnonymousClass32.INSTANCE;
        Optional map16 = optionalOfNullable13.map(new Function() { // from class: o.ar9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$38(anonymousClass32, obj);
            }
        });
        final AnonymousClass33 anonymousClass33 = AnonymousClass33.INSTANCE;
        Optional map17 = map16.map(new Function() { // from class: o.br9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$39(anonymousClass33, obj);
            }
        });
        final AnonymousClass34 anonymousClass34 = new AnonymousClass34(ggeVar2);
        map17.ifPresent(new Consumer() { // from class: o.er9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$40(anonymousClass34, obj);
            }
        });
        Optional optionalOfNullable14 = Optional.ofNullable(Boolean.valueOf(this.hideClosedLeads));
        final AnonymousClass35 anonymousClass35 = AnonymousClass35.INSTANCE;
        Optional optionalFilter = optionalOfNullable14.filter(new Predicate() { // from class: o.fr9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$41(anonymousClass35, obj);
            }
        });
        final AnonymousClass36 anonymousClass36 = AnonymousClass36.INSTANCE;
        Optional map18 = optionalFilter.map(new Function() { // from class: o.gr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$42(anonymousClass36, obj);
            }
        });
        final AnonymousClass37 anonymousClass37 = new AnonymousClass37(ggeVar2);
        map18.ifPresent(new Consumer() { // from class: o.hr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$43(anonymousClass37, obj);
            }
        });
        Optional optionalOfNullable15 = Optional.ofNullable(this.formFields);
        final AnonymousClass38 anonymousClass38 = AnonymousClass38.INSTANCE;
        Optional map19 = optionalOfNullable15.map(new Function() { // from class: o.ir9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$44(anonymousClass38, obj);
            }
        });
        final AnonymousClass39 anonymousClass39 = AnonymousClass39.INSTANCE;
        Optional optionalFilter2 = map19.filter(new Predicate() { // from class: o.jr9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$45(anonymousClass39, obj);
            }
        });
        final AnonymousClass40 anonymousClass40 = AnonymousClass40.INSTANCE;
        Optional map20 = optionalFilter2.map(new Function() { // from class: o.kr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$46(anonymousClass40, obj);
            }
        });
        final AnonymousClass41 anonymousClass41 = new AnonymousClass41(ggeVar2);
        map20.ifPresent(new Consumer() { // from class: o.lr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$47(anonymousClass41, obj);
            }
        });
        Optional optionalOfNullable16 = Optional.ofNullable(this.prospectingAttempts);
        final AnonymousClass42 anonymousClass42 = new AnonymousClass42(ggeVar);
        optionalOfNullable16.ifPresent(new Consumer() { // from class: o.mr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$48(anonymousClass42, obj);
            }
        });
        Optional optionalOfNullable17 = Optional.ofNullable(this.unsuccessfulCallAttempts);
        final AnonymousClass43 anonymousClass43 = new AnonymousClass43(ggeVar);
        optionalOfNullable17.ifPresent(new Consumer() { // from class: o.nr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$49(anonymousClass43, obj);
            }
        });
        Optional optionalOfNullable18 = Optional.ofNullable(this.opnTask);
        final AnonymousClass44 anonymousClass44 = new AnonymousClass44(ggeVar);
        optionalOfNullable18.ifPresent(new Consumer() { // from class: o.qr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$50(anonymousClass44, obj);
            }
        });
        Optional optionalOfNullable19 = Optional.ofNullable(this.openPayment);
        final AnonymousClass45 anonymousClass45 = new AnonymousClass45(ggeVar);
        optionalOfNullable19.ifPresent(new Consumer() { // from class: o.rr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$51(anonymousClass45, obj);
            }
        });
        Optional optionalOfNullable20 = Optional.ofNullable(this.businessName);
        final AnonymousClass46 anonymousClass46 = new AnonymousClass46(ggeVar);
        optionalOfNullable20.ifPresent(new Consumer() { // from class: o.sr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$52(anonymousClass46, obj);
            }
        });
        Optional optionalOfNullable21 = Optional.ofNullable(this.contactSourceDrillDownOne);
        final AnonymousClass47 anonymousClass47 = new AnonymousClass47(ggeVar);
        optionalOfNullable21.ifPresent(new Consumer() { // from class: o.tr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$53(anonymousClass47, obj);
            }
        });
        Optional optionalOfNullable22 = Optional.ofNullable(this.isCustomer);
        final AnonymousClass48 anonymousClass48 = AnonymousClass48.INSTANCE;
        Optional map21 = optionalOfNullable22.map(new Function() { // from class: o.ur9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$54(anonymousClass48, obj);
            }
        });
        final AnonymousClass49 anonymousClass49 = new AnonymousClass49(ggeVar);
        map21.ifPresent(new Consumer() { // from class: o.vr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$55(anonymousClass49, obj);
            }
        });
        Optional optionalOfNullable23 = Optional.ofNullable(this.leadLifecycleStage);
        final AnonymousClass50 anonymousClass50 = new AnonymousClass50(ggeVar);
        optionalOfNullable23.ifPresent(new Consumer() { // from class: o.wr9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$56(anonymousClass50, obj);
            }
        });
        Optional optionalOfNullable24 = Optional.ofNullable(this.searchText);
        final AnonymousClass51 anonymousClass51 = AnonymousClass51.INSTANCE;
        Optional optionalFilter3 = optionalOfNullable24.filter(new Predicate() { // from class: o.xr9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$57(anonymousClass51, obj);
            }
        });
        final AnonymousClass52 anonymousClass52 = new AnonymousClass52();
        Optional map22 = optionalFilter3.map(new Function() { // from class: o.yr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getCustomSearchableContactFilterInput$lambda$58(anonymousClass52, obj);
            }
        });
        final AnonymousClass53 anonymousClass53 = new AnonymousClass53(ggeVar2);
        map22.ifPresent(new Consumer() { // from class: o.as9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getCustomSearchableContactFilterInput$lambda$59(anonymousClass53, obj);
            }
        });
        List<SearchableContactFilterInput> list = (List) ggeVar2.f25106a;
        if (!list.isEmpty()) {
            ((SearchableContactFilterInput.Builder) ggeVar.f25106a).and(list);
        }
        SearchableContactFilterInput searchableContactFilterInputBuild = ((SearchableContactFilterInput.Builder) ggeVar.f25106a).build();
        sq8.m48648g(searchableContactFilterInputBuild, "build(...)");
        return searchableContactFilterInputBuild;
    }

    public final SearchableContactSortInput getCustomSearchableContactSortInput() {
        if (Objects.isNull(this.sortByField) && Objects.isNull(this.sortDirection)) {
            return null;
        }
        String strName = this.sortDirection;
        if (strName == null) {
            strName = SearchableSortDirection.desc.name();
        }
        String strName2 = this.sortByField;
        if (strName2 == null) {
            strName2 = SearchableContactSortableFields.updatedAt.name();
        }
        return SearchableContactSortInput.builder().field(SearchableContactSortableFields.valueOf(strName2)).direction(SearchableSortDirection.valueOf(strName)).build();
    }

    public final FormFields getFormFields() {
        return this.formFields;
    }

    public final boolean getHideClosedLeads() {
        return this.hideClosedLeads;
    }

    public final String getLastCallOutcome() {
        return this.lastCallOutcome;
    }

    public final Long getLastCalledTimeFrom() {
        return this.lastCalledTimeFrom;
    }

    public final Long getLastCalledTimeTo() {
        return this.lastCalledTimeTo;
    }

    public final Long getLastEngagedFrom() {
        return this.lastEngagedFrom;
    }

    public final Long getLastEngagedTo() {
        return this.lastEngagedTo;
    }

    public final Long getLastLeadAssignmentDateTimeFrom() {
        return this.lastLeadAssignmentDateTimeFrom;
    }

    public final Long getLastLeadAssignmentDateTimeTo() {
        return this.lastLeadAssignmentDateTimeTo;
    }

    public final Long getLastLeadCreateDateTimeFrom() {
        return this.lastLeadCreateDateTimeFrom;
    }

    public final Long getLastLeadCreateDateTimeTo() {
        return this.lastLeadCreateDateTimeTo;
    }

    public final String getLeadFilterType() {
        return this.leadFilterType;
    }

    public final String getLeadLifecycleStage() {
        return this.leadLifecycleStage;
    }

    public final Boolean getOpenPayment() {
        return this.openPayment;
    }

    public final Boolean getOpnTask() {
        return this.opnTask;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final List<String> getProperty(String str) {
        ArrayList arrayListM21242g;
        sq8.m48649h(str, "propertyName");
        switch (str.hashCode()) {
            case -1519952108:
                if (str.equals("callOutcome")) {
                    String str2 = this.lastCallOutcome;
                    arrayListM21242g = str2 != null ? ch3.m21242g(str2) : null;
                    return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
                }
                break;
            case -3683228:
                if (str.equals("unconnectedCallOutcome")) {
                    String str3 = this.unconnectedLastCallOutcome;
                    arrayListM21242g = str3 != null ? ch3.m21242g(str3) : null;
                    return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
                }
                break;
            case 50338462:
                if (str.equals("leadTag")) {
                    List<String> list = this.userDefinedTags;
                    return list == null ? ch3.m21246k() : list;
                }
                break;
            case 674365079:
                if (str.equals("leadSource")) {
                    String str4 = this.contactSource;
                    arrayListM21242g = str4 != null ? ch3.m21242g(str4) : null;
                    return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
                }
                break;
        }
        return new ArrayList();
    }

    public final Integer getProspectingAttempts() {
        return this.prospectingAttempts;
    }

    public final SavedTableViewInfo getSavedTableView() {
        return this.savedTableView;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final SearchableContactFilterInput getSearchableContactFilterInput(SearchableContactFilterInput.Builder builder) {
        return this.useSavedTableView ? getSearchableContactFilterInputFromSavedViews(builder) : getCustomSearchableContactFilterInput(builder);
    }

    public final SearchableContactFilterInput getSearchableContactFilterInputFromSavedViews(SearchableContactFilterInput.Builder builder) {
        if (builder == null) {
            builder = SearchableContactFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = new ArrayList();
        u91 u91VarUB = uni.UB();
        builder.accountId(SearchableIDFilterInput.builder().eq(u91VarUB.on()).build());
        SavedTableViewInfo savedTableViewInfo = this.savedTableView;
        SearchableContactFilterInput searchableContactFilterInputM52253o = v1f.m52253o(u91VarUB, savedTableViewInfo != null ? savedTableViewInfo.toSavedTableViewSummary() : null);
        sq8.m48648g(searchableContactFilterInputM52253o, "getSearchableFilterConta…putFromSaveTableView(...)");
        ((List) ggeVar.f25106a).add(searchableContactFilterInputM52253o);
        Optional optionalOfNullable = Optional.ofNullable(this.searchText);
        final LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1 leadFilter$getSearchableContactFilterInputFromSavedViews$1$1 = LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1.INSTANCE;
        Optional optionalFilter = optionalOfNullable.filter(new Predicate() { // from class: o.sq9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$0(leadFilter$getSearchableContactFilterInputFromSavedViews$1$1, obj);
            }
        });
        final LeadFilter$getSearchableContactFilterInputFromSavedViews$1$2 leadFilter$getSearchableContactFilterInputFromSavedViews$1$2 = new LeadFilter$getSearchableContactFilterInputFromSavedViews$1$2(this);
        Optional map = optionalFilter.map(new Function() { // from class: o.dr9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$1(leadFilter$getSearchableContactFilterInputFromSavedViews$1$2, obj);
            }
        });
        final LeadFilter$getSearchableContactFilterInputFromSavedViews$1$3 leadFilter$getSearchableContactFilterInputFromSavedViews$1$3 = new LeadFilter$getSearchableContactFilterInputFromSavedViews$1$3(ggeVar);
        map.ifPresent(new Consumer() { // from class: o.or9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$3$lambda$2(leadFilter$getSearchableContactFilterInputFromSavedViews$1$3, obj);
            }
        });
        Optional optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(this.hideClosedLeads));
        final C02422 c02422 = C02422.INSTANCE;
        Optional optionalFilter2 = optionalOfNullable2.filter(new Predicate() { // from class: o.zr9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$4(c02422, obj);
            }
        });
        final C02433 c02433 = C02433.INSTANCE;
        Optional map2 = optionalFilter2.map(new Function() { // from class: o.gs9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$5(c02433, obj);
            }
        });
        final C02444 c02444 = new C02444(ggeVar);
        map2.ifPresent(new Consumer() { // from class: o.hs9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadFilter.getSearchableContactFilterInputFromSavedViews$lambda$6(c02444, obj);
            }
        });
        builder.and((List) ggeVar.f25106a);
        SearchableContactFilterInput searchableContactFilterInputBuild = builder.build();
        sq8.m48648g(searchableContactFilterInputBuild, "build(...)");
        return searchableContactFilterInputBuild;
    }

    public final ryh getSearchableContactSortInput(SearchableContactFilterInput searchableContactFilterInput) {
        if (this.useSavedTableView) {
            return getSearchableContactSortInputFromSavedViews(searchableContactFilterInput);
        }
        ryh ryhVarOf = uyh.of(searchableContactFilterInput, getCustomSearchableContactSortInput());
        sq8.m48648g(ryhVarOf, "of(...)");
        return ryhVarOf;
    }

    public final ryh getSearchableContactSortInputFromSavedViews(SearchableContactFilterInput searchableContactFilterInput) {
        u91 u91VarUB = uni.UB();
        SavedTableViewInfo savedTableViewInfo = this.savedTableView;
        ryh ryhVarM52254p = v1f.m52254p(u91VarUB, savedTableViewInfo != null ? savedTableViewInfo.toSavedTableViewSummary() : null, searchableContactFilterInput);
        sq8.m48648g(ryhVarM52254p, "getSearchableSortContact…putFromSaveTableView(...)");
        return ryhVarM52254p;
    }

    public final String getSelectedTeamId() {
        return this.selectedTeamId;
    }

    public final String getSelectedUserId() {
        return this.selectedUserId;
    }

    public final String getSortByField() {
        return this.sortByField;
    }

    public final String getSortDirection() {
        return this.sortDirection;
    }

    public final String getUnconnectedLastCallOutcome() {
        return this.unconnectedLastCallOutcome;
    }

    public final Integer getUnsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts;
    }

    public final boolean getUseSavedTableView() {
        return this.useSavedTableView;
    }

    public final List<PropertyOptions> getUserDefinedTagOptions() {
        return this.userDefinedTagOptions;
    }

    public final List<String> getUserDefinedTags() {
        return this.userDefinedTags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.leadLifecycleStage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PropertyOptions> list = this.contactSourceOptions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.userDefinedTags;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PropertyOptions> list3 = this.userDefinedTagOptions;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.lastCallOutcome;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unconnectedLastCallOutcome;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PropertyOptions> list4 = this.callOutcomeTypeList;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.prospectingAttempts;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unsuccessfulCallAttempts;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isCustomer;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.opnTask;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.openPayment;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.lastEngagedFrom;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastEngagedTo;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.lastCalledTimeFrom;
        int iHashCode16 = (iHashCode15 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.lastCalledTimeTo;
        int iHashCode17 = (iHashCode16 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.lastLeadAssignmentDateTimeFrom;
        int iHashCode18 = (iHashCode17 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.lastLeadAssignmentDateTimeTo;
        int iHashCode19 = (iHashCode18 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.lastLeadCreateDateTimeFrom;
        int iHashCode20 = (iHashCode19 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.lastLeadCreateDateTimeTo;
        int iHashCode21 = (iHashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str5 = this.sortByField;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sortDirection;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.useSavedTableView;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode23 + i) * 31;
        SavedTableViewInfo savedTableViewInfo = this.savedTableView;
        int iHashCode24 = (i2 + (savedTableViewInfo == null ? 0 : savedTableViewInfo.hashCode())) * 31;
        String str7 = this.searchText;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<EntityListInfo> list5 = this.bulkLoadReferences;
        int iHashCode26 = (iHashCode25 + (list5 == null ? 0 : list5.hashCode())) * 31;
        boolean z2 = this.hideClosedLeads;
        int i3 = (iHashCode26 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        FormFields formFields = this.formFields;
        int iHashCode27 = (i3 + (formFields == null ? 0 : formFields.hashCode())) * 31;
        String str8 = this.selectedTeamId;
        int iHashCode28 = (iHashCode27 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.selectedUserId;
        int iHashCode29 = (iHashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.leadFilterType;
        int iHashCode30 = (iHashCode29 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.businessName;
        int iHashCode31 = (iHashCode30 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.contactSourceDrillDownOne;
        return iHashCode31 + (str12 != null ? str12.hashCode() : 0);
    }

    public final Boolean isCustomer() {
        return this.isCustomer;
    }

    public final boolean isEmpty() {
        return isFilterEmpty() && isSortEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isFilterEmpty() {
        Map<String, Object> submittedFormValuesAfter;
        if (this.useSavedTableView) {
            return this.savedTableView == null;
        }
        if (this.leadLifecycleStage == null && this.contactSource == null && this.userDefinedTags == null && this.lastCallOutcome == null && this.unconnectedLastCallOutcome == null && this.prospectingAttempts == null && this.unsuccessfulCallAttempts == null && this.isCustomer == null && this.opnTask == null && this.openPayment == null && this.lastEngagedFrom == null && this.lastEngagedTo == null && this.lastCalledTimeTo == null && this.lastCalledTimeFrom == null && this.lastLeadAssignmentDateTimeFrom == null && this.lastLeadAssignmentDateTimeTo == null && this.lastLeadCreateDateTimeFrom == null && this.lastLeadCreateDateTimeTo == null) {
            String str = this.searchText;
            if (str == null || f9g.d0(str)) {
                String str2 = this.businessName;
                if (str2 == null || f9g.d0(str2)) {
                    String str3 = this.contactSourceDrillDownOne;
                    if (str3 == null || f9g.d0(str3)) {
                        List<EntityListInfo> list = this.bulkLoadReferences;
                        if (list != null) {
                            if (list != null && list.size() == 0) {
                            }
                        } else if (!this.hideClosedLeads) {
                            FormFields formFields = this.formFields;
                            if (((formFields == null || (submittedFormValuesAfter = formFields.getSubmittedFormValuesAfter()) == null) ? true : submittedFormValuesAfter.isEmpty()) && isTeamAndUserFilterEmpty()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean isSortEmpty() {
        return this.useSavedTableView ? this.savedTableView == null : this.sortByField == null && this.sortDirection == null;
    }

    public final boolean isTeamAndUserFilterEmpty() {
        return sq8.m48644c(this.leadFilterType, "ALL") ? this.selectedTeamId == null && this.selectedUserId == null : !sq8.m48644c(this.leadFilterType, "TEAM") || this.selectedUserId == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final AbstractC2145n propertyDefinitionAsync(String str) {
        sq8.m48649h(str, "propertyName");
        switch (str.hashCode()) {
            case -1519952108:
                if (str.equals("callOutcome")) {
                    return wi0.g0(str);
                }
                break;
            case -410128801:
                if (str.equals("taskType")) {
                    return wi0.g0(str);
                }
                break;
            case -3683228:
                if (str.equals("unconnectedCallOutcome")) {
                    return wi0.g0(str);
                }
                break;
            case 50338462:
                if (str.equals("leadTag")) {
                    return wi0.b0(str);
                }
                break;
            case 674365079:
                if (str.equals("leadSource")) {
                    return wi0.i0();
                }
                break;
        }
        return new hpb(yne.C18447a.m58027b(yne.f55736e, null, "Not supported property in lead filter " + str, null, 4, null));
    }

    public final void setBulkLoadReferences(List<EntityListInfo> list) {
        this.bulkLoadReferences = list;
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }

    public final void setCallOutcomeTypeList(List<PropertyOptions> list) {
        this.callOutcomeTypeList = list;
    }

    public final void setContactSource(String str) {
        this.contactSource = str;
    }

    public final void setContactSourceDrillDownOne(String str) {
        this.contactSourceDrillDownOne = str;
    }

    public final void setContactSourceOptions(List<PropertyOptions> list) {
        this.contactSourceOptions = list;
    }

    public final void setCustomer(Boolean bool) {
        this.isCustomer = bool;
    }

    public final void setFormFields(FormFields formFields) {
        this.formFields = formFields;
    }

    public final void setHideClosedLeads(boolean z) {
        this.hideClosedLeads = z;
    }

    public final void setLastCallOutcome(String str) {
        this.lastCallOutcome = str;
    }

    public final void setLastCalledTimeFrom(Long l) {
        this.lastCalledTimeFrom = l;
    }

    public final void setLastCalledTimeTo(Long l) {
        this.lastCalledTimeTo = l;
    }

    public final void setLastEngagedFrom(Long l) {
        this.lastEngagedFrom = l;
    }

    public final void setLastEngagedTo(Long l) {
        this.lastEngagedTo = l;
    }

    public final void setLastLeadAssignmentDateTimeFrom(Long l) {
        this.lastLeadAssignmentDateTimeFrom = l;
    }

    public final void setLastLeadAssignmentDateTimeTo(Long l) {
        this.lastLeadAssignmentDateTimeTo = l;
    }

    public final void setLastLeadCreateDateTimeFrom(Long l) {
        this.lastLeadCreateDateTimeFrom = l;
    }

    public final void setLastLeadCreateDateTimeTo(Long l) {
        this.lastLeadCreateDateTimeTo = l;
    }

    public final void setLeadFilterType(String str) {
        this.leadFilterType = str;
    }

    public final void setLeadLifecycleStage(String str) {
        this.leadLifecycleStage = str;
    }

    public final void setOpenPayment(Boolean bool) {
        this.openPayment = bool;
    }

    public final void setOpnTask(Boolean bool) {
        this.opnTask = bool;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setProperty(String str, List<PropertyOptions> list) {
        sq8.m48649h(str, "propertyName");
        sq8.m48649h(list, "propertyOptions");
        switch (str.hashCode()) {
            case -1519952108:
                if (str.equals("callOutcome")) {
                    PropertyOptions propertyOptions = (PropertyOptions) kh3.h0(list);
                    this.lastCallOutcome = propertyOptions != null ? propertyOptions.getValue() : null;
                    break;
                }
                break;
            case -3683228:
                if (str.equals("unconnectedCallOutcome")) {
                    PropertyOptions propertyOptions2 = (PropertyOptions) kh3.h0(list);
                    this.unconnectedLastCallOutcome = propertyOptions2 != null ? propertyOptions2.getValue() : null;
                    break;
                }
                break;
            case 50338462:
                if (str.equals("leadTag")) {
                    ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        String value = ((PropertyOptions) it.next()).getValue();
                        if (value == null) {
                            value = "";
                        }
                        arrayList.add(value);
                    }
                    this.userDefinedTags = kh3.Q0(arrayList);
                    break;
                }
                break;
            case 674365079:
                if (str.equals("leadSource")) {
                    PropertyOptions propertyOptions3 = (PropertyOptions) kh3.h0(list);
                    this.contactSource = propertyOptions3 != null ? propertyOptions3.getValue() : null;
                    break;
                }
                break;
        }
    }

    public final void setPropertyOptions(String str, List<PropertyOptions> list) {
        sq8.m48649h(str, "propertyName");
        sq8.m48649h(list, "propertyOptions");
        int iHashCode = str.hashCode();
        if (iHashCode == -1519952108) {
            if (str.equals("callOutcome")) {
                this.callOutcomeTypeList = list;
            }
        } else if (iHashCode == 50338462) {
            if (str.equals("leadTag")) {
                this.userDefinedTagOptions = list;
            }
        } else if (iHashCode == 674365079 && str.equals("leadSource")) {
            this.contactSourceOptions = list;
        }
    }

    public final void setProspectingAttempts(Integer num) {
        this.prospectingAttempts = num;
    }

    public final void setSavedTableView(SavedTableViewInfo savedTableViewInfo) {
        this.savedTableView = savedTableViewInfo;
    }

    public final void setSearchText(String str) {
        this.searchText = str;
    }

    public final void setSelectedTeamId(String str) {
        this.selectedTeamId = str;
    }

    public final void setSelectedUserId(String str) {
        this.selectedUserId = str;
    }

    public final void setSortByField(String str) {
        this.sortByField = str;
    }

    public final void setSortDirection(String str) {
        this.sortDirection = str;
    }

    public final void setUnconnectedLastCallOutcome(String str) {
        this.unconnectedLastCallOutcome = str;
    }

    public final void setUnsuccessfulCallAttempts(Integer num) {
        this.unsuccessfulCallAttempts = num;
    }

    public final void setUseSavedTableView(boolean z) {
        this.useSavedTableView = z;
    }

    public final void setUserDefinedTagOptions(List<PropertyOptions> list) {
        this.userDefinedTagOptions = list;
    }

    public final void setUserDefinedTags(List<String> list) {
        this.userDefinedTags = list;
    }

    public String toString() {
        return "LeadFilter(leadLifecycleStage=" + this.leadLifecycleStage + ", contactSource=" + this.contactSource + ", contactSourceOptions=" + this.contactSourceOptions + ", userDefinedTags=" + this.userDefinedTags + ", userDefinedTagOptions=" + this.userDefinedTagOptions + ", lastCallOutcome=" + this.lastCallOutcome + ", unconnectedLastCallOutcome=" + this.unconnectedLastCallOutcome + ", callOutcomeTypeList=" + this.callOutcomeTypeList + ", prospectingAttempts=" + this.prospectingAttempts + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", isCustomer=" + this.isCustomer + ", opnTask=" + this.opnTask + ", openPayment=" + this.openPayment + ", lastEngagedFrom=" + this.lastEngagedFrom + ", lastEngagedTo=" + this.lastEngagedTo + ", lastCalledTimeFrom=" + this.lastCalledTimeFrom + ", lastCalledTimeTo=" + this.lastCalledTimeTo + ", lastLeadAssignmentDateTimeFrom=" + this.lastLeadAssignmentDateTimeFrom + ", lastLeadAssignmentDateTimeTo=" + this.lastLeadAssignmentDateTimeTo + ", lastLeadCreateDateTimeFrom=" + this.lastLeadCreateDateTimeFrom + ", lastLeadCreateDateTimeTo=" + this.lastLeadCreateDateTimeTo + ", sortByField=" + this.sortByField + ", sortDirection=" + this.sortDirection + ", useSavedTableView=" + this.useSavedTableView + ", savedTableView=" + this.savedTableView + ", searchText=" + this.searchText + ", bulkLoadReferences=" + this.bulkLoadReferences + ", hideClosedLeads=" + this.hideClosedLeads + ", formFields=" + this.formFields + ", selectedTeamId=" + this.selectedTeamId + ", selectedUserId=" + this.selectedUserId + ", leadFilterType=" + this.leadFilterType + ", businessName=" + this.businessName + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.leadLifecycleStage);
        parcel.writeString(this.contactSource);
        List<PropertyOptions> list = this.contactSourceOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PropertyOptions> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.userDefinedTags);
        List<PropertyOptions> list2 = this.userDefinedTagOptions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PropertyOptions> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.lastCallOutcome);
        parcel.writeString(this.unconnectedLastCallOutcome);
        List<PropertyOptions> list3 = this.callOutcomeTypeList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<PropertyOptions> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.prospectingAttempts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.unsuccessfulCallAttempts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.isCustomer;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.opnTask;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.openPayment;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l = this.lastEngagedFrom;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.lastEngagedTo;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.lastCalledTimeFrom;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.lastCalledTimeTo;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Long l5 = this.lastLeadAssignmentDateTimeFrom;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Long l6 = this.lastLeadAssignmentDateTimeTo;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        Long l7 = this.lastLeadCreateDateTimeFrom;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        Long l8 = this.lastLeadCreateDateTimeTo;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        parcel.writeString(this.sortByField);
        parcel.writeString(this.sortDirection);
        parcel.writeInt(this.useSavedTableView ? 1 : 0);
        SavedTableViewInfo savedTableViewInfo = this.savedTableView;
        if (savedTableViewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            savedTableViewInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.searchText);
        List<EntityListInfo> list4 = this.bulkLoadReferences;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<EntityListInfo> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.hideClosedLeads ? 1 : 0);
        FormFields formFields = this.formFields;
        if (formFields == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formFields.writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectedTeamId);
        parcel.writeString(this.selectedUserId);
        parcel.writeString(this.leadFilterType);
        parcel.writeString(this.businessName);
        parcel.writeString(this.contactSourceDrillDownOne);
    }

    public LeadFilter(String str, String str2, List<PropertyOptions> list, List<String> list2, List<PropertyOptions> list3, String str3, String str4, List<PropertyOptions> list4, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str5, String str6, boolean z, SavedTableViewInfo savedTableViewInfo, String str7, List<EntityListInfo> list5, boolean z2, FormFields formFields, String str8, String str9, String str10, String str11, String str12) {
        this.leadLifecycleStage = str;
        this.contactSource = str2;
        this.contactSourceOptions = list;
        this.userDefinedTags = list2;
        this.userDefinedTagOptions = list3;
        this.lastCallOutcome = str3;
        this.unconnectedLastCallOutcome = str4;
        this.callOutcomeTypeList = list4;
        this.prospectingAttempts = num;
        this.unsuccessfulCallAttempts = num2;
        this.isCustomer = bool;
        this.opnTask = bool2;
        this.openPayment = bool3;
        this.lastEngagedFrom = l;
        this.lastEngagedTo = l2;
        this.lastCalledTimeFrom = l3;
        this.lastCalledTimeTo = l4;
        this.lastLeadAssignmentDateTimeFrom = l5;
        this.lastLeadAssignmentDateTimeTo = l6;
        this.lastLeadCreateDateTimeFrom = l7;
        this.lastLeadCreateDateTimeTo = l8;
        this.sortByField = str5;
        this.sortDirection = str6;
        this.useSavedTableView = z;
        this.savedTableView = savedTableViewInfo;
        this.searchText = str7;
        this.bulkLoadReferences = list5;
        this.hideClosedLeads = z2;
        this.formFields = formFields;
        this.selectedTeamId = str8;
        this.selectedUserId = str9;
        this.leadFilterType = str10;
        this.businessName = str11;
        this.contactSourceDrillDownOne = str12;
    }

    public /* synthetic */ LeadFilter(String str, String str2, List list, List list2, List list3, String str3, String str4, List list4, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str5, String str6, boolean z, SavedTableViewInfo savedTableViewInfo, String str7, List list5, boolean z2, FormFields formFields, String str8, String str9, String str10, String str11, String str12, int i, int i2, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list4, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : l, (i & Opcodes.ACC_ENUM) != 0 ? null : l2, (i & 32768) != 0 ? null : l3, (i & 65536) != 0 ? null : l4, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : l5, (i & 262144) != 0 ? null : l6, (i & Opcodes.ASM8) != 0 ? null : l7, (i & 1048576) != 0 ? null : l8, (i & 2097152) != 0 ? null : str5, (i & 4194304) != 0 ? null : str6, (i & 8388608) != 0 ? false : z, (i & 16777216) != 0 ? null : savedTableViewInfo, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str7, (i & 67108864) != 0 ? null : list5, (i & 134217728) == 0 ? z2 : false, (i & 268435456) != 0 ? null : formFields, (i & 536870912) != 0 ? null : str8, (i & 1073741824) != 0 ? null : str9, (i & Integer.MIN_VALUE) != 0 ? "ALL" : str10, (i2 & 1) != 0 ? null : str11, (i2 & 2) != 0 ? null : str12);
    }
}
