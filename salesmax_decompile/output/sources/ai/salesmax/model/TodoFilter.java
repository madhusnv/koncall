package ai.salesmax.model;

import ai.salesmax.model.TodoFilter;
import androidx.lifecycle.AbstractC2145n;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import p001o.a81;
import p001o.ch3;
import p001o.gge;
import p001o.hpb;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.sq8;
import p001o.wi0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import type.SearchableEngagementFilterInput;
import type.SearchableEngagementSortInput;
import type.SearchableEngagementSortableFields;
import type.SearchableIntFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public final class TodoFilter {
    private static TodoFilter _instance;
    private Long dueDateFrom;
    private Long dueDateTo;
    private Long lastWorkedFrom;
    private Long lastWorkedTo;
    private Integer numDaysOverdueSince;
    private Integer numTaskAttempts;
    private String sortByField;
    private String sortDirection;
    private String taskType;
    private List<PropertyOptions> taskTypeList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final TodoFilter get_instance() {
            return TodoFilter._instance;
        }

        public final synchronized TodoFilter instance() {
            TodoFilter todoFilter;
            if (get_instance() == null) {
                set_instance(new TodoFilter(null, null, null, null, null, null, null, null, null, null, 1023, null));
            }
            todoFilter = get_instance();
            sq8.m48647f(todoFilter, "null cannot be cast to non-null type ai.salesmax.model.TodoFilter");
            return todoFilter;
        }

        public final void set_instance(TodoFilter todoFilter) {
            TodoFilter._instance = todoFilter;
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$1 */
    public static final class C02561 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02561(gge ggeVar) {
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
            ((SearchableEngagementFilterInput.Builder) this.$builder.f25106a).taskType(SearchableStringFilterInput.builder().eq(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$10, reason: invalid class name */
    public static final class AnonymousClass10 extends kf9 implements xk7 {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableEngagementFilterInput invoke(String str) {
            return SearchableEngagementFilterInput.builder().taskEngagementActionsUpdatedAt(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$11, reason: invalid class name */
    public static final class AnonymousClass11 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableEngagementFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableEngagementFilterInput searchableEngagementFilterInput) {
            sq8.m48649h(searchableEngagementFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableEngagementFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$12, reason: invalid class name */
    public static final class AnonymousClass12 extends kf9 implements xk7 {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$13, reason: invalid class name */
    public static final class AnonymousClass13 extends kf9 implements xk7 {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableEngagementFilterInput invoke(String str) {
            return SearchableEngagementFilterInput.builder().dueDateTime(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$14, reason: invalid class name */
    public static final class AnonymousClass14 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableEngagementFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableEngagementFilterInput searchableEngagementFilterInput) {
            sq8.m48649h(searchableEngagementFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableEngagementFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$15, reason: invalid class name */
    public static final class AnonymousClass15 extends kf9 implements xk7 {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$16, reason: invalid class name */
    public static final class AnonymousClass16 extends kf9 implements xk7 {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableEngagementFilterInput invoke(String str) {
            return SearchableEngagementFilterInput.builder().dueDateTime(SearchableStringFilterInput.builder().gte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$17, reason: invalid class name */
    public static final class AnonymousClass17 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableEngagementFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableEngagementFilterInput searchableEngagementFilterInput) {
            sq8.m48649h(searchableEngagementFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableEngagementFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$2 */
    public static final class C02572 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02572(gge ggeVar) {
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
            ((SearchableEngagementFilterInput.Builder) this.$builder.f25106a).taskEngagementActionCount(SearchableIntFilterInput.builder().gte(num).build());
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$3 */
    public static final class C02583 extends kf9 implements xk7 {
        public static final C02583 INSTANCE = new C02583();

        public C02583() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Integer num) {
            return Long.valueOf(a81.m16659n(num));
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$4 */
    public static final class C02594 extends kf9 implements xk7 {
        public static final C02594 INSTANCE = new C02594();

        public C02594() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$5 */
    public static final class C02605 extends kf9 implements xk7 {
        final /* synthetic */ gge $builder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02605(gge ggeVar) {
            super(1);
            this.$builder = ggeVar;
        }

        @Override // p001o.xk7
        public final SearchableEngagementFilterInput.Builder invoke(String str) {
            return ((SearchableEngagementFilterInput.Builder) this.$builder.f25106a).dueDateTime(SearchableStringFilterInput.builder().gte(str).build());
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$6 */
    public static final class C02616 extends kf9 implements xk7 {
        public static final C02616 INSTANCE = new C02616();

        public C02616() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$7 */
    public static final class C02627 extends kf9 implements xk7 {
        public static final C02627 INSTANCE = new C02627();

        public C02627() {
            super(1);
        }

        @Override // p001o.xk7
        public final SearchableEngagementFilterInput invoke(String str) {
            return SearchableEngagementFilterInput.builder().taskEngagementActionsUpdatedAt(SearchableStringFilterInput.builder().lte(str).build()).build();
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$8 */
    public static final class C02638 extends kf9 implements xk7 {
        final /* synthetic */ gge $andConditions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02638(gge ggeVar) {
            super(1);
            this.$andConditions = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchableEngagementFilterInput) obj);
            return y3i.f54824a;
        }

        public final void invoke(SearchableEngagementFilterInput searchableEngagementFilterInput) {
            sq8.m48649h(searchableEngagementFilterInput, "it");
            ((List) this.$andConditions.f25106a).add(searchableEngagementFilterInput);
        }
    }

    /* renamed from: ai.salesmax.model.TodoFilter$getSearchableTasksFilterInput$9 */
    public static final class C02649 extends kf9 implements xk7 {
        public static final C02649 INSTANCE = new C02649();

        public C02649() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Long l) {
            return a81.m16653h(l);
        }
    }

    public TodoFilter() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ SearchableEngagementFilterInput getSearchableTasksFilterInput$default(TodoFilter todoFilter, SearchableEngagementFilterInput.Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = null;
        }
        return todoFilter.getSearchableTasksFilterInput(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSearchableTasksFilterInput$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableEngagementFilterInput getSearchableTasksFilterInput$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableEngagementFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSearchableTasksFilterInput$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableEngagementFilterInput getSearchableTasksFilterInput$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableEngagementFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getSearchableTasksFilterInput$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSearchableTasksFilterInput$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableEngagementFilterInput.Builder getSearchableTasksFilterInput$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableEngagementFilterInput.Builder) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSearchableTasksFilterInput$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableEngagementFilterInput getSearchableTasksFilterInput$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableEngagementFilterInput) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSearchableTasksFilterInput$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSearchableTasksFilterInput$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchableEngagementFilterInput getSearchableTasksFilterInput$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SearchableEngagementFilterInput) xk7Var.invoke(obj);
    }

    public final void clear() {
        this.taskType = null;
        this.numTaskAttempts = null;
        this.numDaysOverdueSince = null;
        this.lastWorkedFrom = null;
        this.lastWorkedTo = null;
        this.dueDateFrom = null;
        this.dueDateTo = null;
        this.sortByField = null;
        this.sortDirection = null;
    }

    public final TodoFilter clone() {
        TodoFilter todoFilter = new TodoFilter(null, null, null, null, null, null, null, null, null, null, 1023, null);
        todoFilter.taskType = this.taskType;
        todoFilter.numTaskAttempts = this.numTaskAttempts;
        todoFilter.numDaysOverdueSince = this.numDaysOverdueSince;
        todoFilter.lastWorkedFrom = this.lastWorkedFrom;
        todoFilter.lastWorkedTo = this.lastWorkedTo;
        todoFilter.dueDateFrom = this.dueDateFrom;
        todoFilter.dueDateTo = this.dueDateTo;
        todoFilter.sortByField = this.sortByField;
        todoFilter.sortDirection = this.sortDirection;
        return todoFilter;
    }

    public final String component1() {
        return this.taskType;
    }

    public final String component10() {
        return this.sortDirection;
    }

    public final List<PropertyOptions> component2() {
        return this.taskTypeList;
    }

    public final Integer component3() {
        return this.numTaskAttempts;
    }

    public final Integer component4() {
        return this.numDaysOverdueSince;
    }

    public final Long component5() {
        return this.lastWorkedFrom;
    }

    public final Long component6() {
        return this.lastWorkedTo;
    }

    public final Long component7() {
        return this.dueDateFrom;
    }

    public final Long component8() {
        return this.dueDateTo;
    }

    public final String component9() {
        return this.sortByField;
    }

    public final TodoFilter copy(String str, List<PropertyOptions> list, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, String str2, String str3) {
        return new TodoFilter(str, list, num, num2, l, l2, l3, l4, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoFilter)) {
            return false;
        }
        TodoFilter todoFilter = (TodoFilter) obj;
        return sq8.m48644c(this.taskType, todoFilter.taskType) && sq8.m48644c(this.taskTypeList, todoFilter.taskTypeList) && sq8.m48644c(this.numTaskAttempts, todoFilter.numTaskAttempts) && sq8.m48644c(this.numDaysOverdueSince, todoFilter.numDaysOverdueSince) && sq8.m48644c(this.lastWorkedFrom, todoFilter.lastWorkedFrom) && sq8.m48644c(this.lastWorkedTo, todoFilter.lastWorkedTo) && sq8.m48644c(this.dueDateFrom, todoFilter.dueDateFrom) && sq8.m48644c(this.dueDateTo, todoFilter.dueDateTo) && sq8.m48644c(this.sortByField, todoFilter.sortByField) && sq8.m48644c(this.sortDirection, todoFilter.sortDirection);
    }

    public final Long getDueDateFrom() {
        return this.dueDateFrom;
    }

    public final Long getDueDateTo() {
        return this.dueDateTo;
    }

    public final Long getLastWorkedFrom() {
        return this.lastWorkedFrom;
    }

    public final Long getLastWorkedTo() {
        return this.lastWorkedTo;
    }

    public final Integer getNumDaysOverdueSince() {
        return this.numDaysOverdueSince;
    }

    public final Integer getNumTaskAttempts() {
        return this.numTaskAttempts;
    }

    public final List<String> getProperty(String str) {
        sq8.m48649h(str, "propertyName");
        if (!sq8.m48644c(str, "taskType")) {
            return new ArrayList();
        }
        String str2 = this.taskType;
        ArrayList arrayListM21242g = str2 != null ? ch3.m21242g(str2) : null;
        return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
    }

    public final SearchableEngagementSortInput getSearchableContactSortInput() {
        String strName = this.sortDirection;
        if (strName == null) {
            strName = SearchableSortDirection.desc.name();
        }
        String strName2 = this.sortByField;
        if (strName2 == null) {
            strName2 = SearchableEngagementSortableFields.createdAt.name();
        }
        SearchableEngagementSortInput searchableEngagementSortInputBuild = SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.valueOf(strName2)).direction(SearchableSortDirection.valueOf(strName)).build();
        sq8.m48648g(searchableEngagementSortInputBuild, "build(...)");
        return searchableEngagementSortInputBuild;
    }

    public final SearchableEngagementFilterInput getSearchableTasksFilterInput(SearchableEngagementFilterInput.Builder builder) {
        gge ggeVar = new gge();
        if (builder == null) {
            builder = SearchableEngagementFilterInput.builder();
            sq8.m48648g(builder, "builder(...)");
        }
        ggeVar.f25106a = builder;
        gge ggeVar2 = new gge();
        ggeVar2.f25106a = new ArrayList();
        Optional optionalOfNullable = Optional.ofNullable(this.taskType);
        final C02561 c02561 = new C02561(ggeVar);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.mnh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$0(c02561, obj);
            }
        });
        Optional optionalOfNullable2 = Optional.ofNullable(this.numTaskAttempts);
        final C02572 c02572 = new C02572(ggeVar);
        optionalOfNullable2.ifPresent(new Consumer() { // from class: o.boh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$1(c02572, obj);
            }
        });
        Optional optionalOfNullable3 = Optional.ofNullable(this.numDaysOverdueSince);
        final C02583 c02583 = C02583.INSTANCE;
        Optional map = optionalOfNullable3.map(new Function() { // from class: o.coh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$2(c02583, obj);
            }
        });
        final C02594 c02594 = C02594.INSTANCE;
        Optional map2 = map.map(new Function() { // from class: o.nnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$3(c02594, obj);
            }
        });
        final C02605 c02605 = new C02605(ggeVar);
        map2.map(new Function() { // from class: o.onh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$4(c02605, obj);
            }
        });
        Optional optionalOfNullable4 = Optional.ofNullable(this.lastWorkedTo);
        final C02616 c02616 = C02616.INSTANCE;
        Optional map3 = optionalOfNullable4.map(new Function() { // from class: o.pnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$5(c02616, obj);
            }
        });
        final C02627 c02627 = C02627.INSTANCE;
        Optional map4 = map3.map(new Function() { // from class: o.qnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$6(c02627, obj);
            }
        });
        final C02638 c02638 = new C02638(ggeVar2);
        map4.ifPresent(new Consumer() { // from class: o.rnh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$7(c02638, obj);
            }
        });
        Optional optionalOfNullable5 = Optional.ofNullable(this.lastWorkedFrom);
        final C02649 c02649 = C02649.INSTANCE;
        Optional map5 = optionalOfNullable5.map(new Function() { // from class: o.snh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$8(c02649, obj);
            }
        });
        final AnonymousClass10 anonymousClass10 = AnonymousClass10.INSTANCE;
        Optional map6 = map5.map(new Function() { // from class: o.tnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$9(anonymousClass10, obj);
            }
        });
        final AnonymousClass11 anonymousClass11 = new AnonymousClass11(ggeVar2);
        map6.ifPresent(new Consumer() { // from class: o.unh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$10(anonymousClass11, obj);
            }
        });
        Optional optionalOfNullable6 = Optional.ofNullable(this.dueDateTo);
        final AnonymousClass12 anonymousClass12 = AnonymousClass12.INSTANCE;
        Optional map7 = optionalOfNullable6.map(new Function() { // from class: o.vnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$11(anonymousClass12, obj);
            }
        });
        final AnonymousClass13 anonymousClass13 = AnonymousClass13.INSTANCE;
        Optional map8 = map7.map(new Function() { // from class: o.wnh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$12(anonymousClass13, obj);
            }
        });
        final AnonymousClass14 anonymousClass14 = new AnonymousClass14(ggeVar2);
        map8.ifPresent(new Consumer() { // from class: o.xnh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$13(anonymousClass14, obj);
            }
        });
        Optional optionalOfNullable7 = Optional.ofNullable(this.dueDateFrom);
        final AnonymousClass15 anonymousClass15 = AnonymousClass15.INSTANCE;
        Optional map9 = optionalOfNullable7.map(new Function() { // from class: o.ynh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$14(anonymousClass15, obj);
            }
        });
        final AnonymousClass16 anonymousClass16 = AnonymousClass16.INSTANCE;
        Optional map10 = map9.map(new Function() { // from class: o.znh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TodoFilter.getSearchableTasksFilterInput$lambda$15(anonymousClass16, obj);
            }
        });
        final AnonymousClass17 anonymousClass17 = new AnonymousClass17(ggeVar2);
        map10.ifPresent(new Consumer() { // from class: o.aoh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TodoFilter.getSearchableTasksFilterInput$lambda$16(anonymousClass17, obj);
            }
        });
        List<SearchableEngagementFilterInput> list = (List) ggeVar2.f25106a;
        if (!list.isEmpty()) {
            ((SearchableEngagementFilterInput.Builder) ggeVar.f25106a).and(list);
        }
        SearchableEngagementFilterInput searchableEngagementFilterInputBuild = ((SearchableEngagementFilterInput.Builder) ggeVar.f25106a).build();
        sq8.m48648g(searchableEngagementFilterInputBuild, "build(...)");
        return searchableEngagementFilterInputBuild;
    }

    public final String getSortByField() {
        return this.sortByField;
    }

    public final String getSortDirection() {
        return this.sortDirection;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public final List<PropertyOptions> getTaskTypeList() {
        return this.taskTypeList;
    }

    public int hashCode() {
        String str = this.taskType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PropertyOptions> list = this.taskTypeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.numTaskAttempts;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numDaysOverdueSince;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.lastWorkedFrom;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastWorkedTo;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.dueDateFrom;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.dueDateTo;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.sortByField;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sortDirection;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.taskType == null && this.numTaskAttempts == null && this.numDaysOverdueSince == null && this.lastWorkedFrom == null && this.lastWorkedTo == null && this.dueDateFrom == null && this.dueDateTo == null && this.sortByField == null && this.sortDirection == null;
    }

    public final AbstractC2145n propertyDefinitionAsync(String str) {
        sq8.m48649h(str, "propertyName");
        if (sq8.m48644c(str, "taskType")) {
            return wi0.g0(str);
        }
        return new hpb(yne.C18447a.m58027b(yne.f55736e, null, "Not supported property in lead filter " + str, null, 4, null));
    }

    public final void setDueDateFrom(Long l) {
        this.dueDateFrom = l;
    }

    public final void setDueDateTo(Long l) {
        this.dueDateTo = l;
    }

    public final void setLastWorkedFrom(Long l) {
        this.lastWorkedFrom = l;
    }

    public final void setLastWorkedTo(Long l) {
        this.lastWorkedTo = l;
    }

    public final void setNumDaysOverdueSince(Integer num) {
        this.numDaysOverdueSince = num;
    }

    public final void setNumTaskAttempts(Integer num) {
        this.numTaskAttempts = num;
    }

    public final void setProperty(String str, List<PropertyOptions> list) {
        sq8.m48649h(str, "propertyName");
        sq8.m48649h(list, "propertyOptions");
        if (sq8.m48644c(str, "taskType")) {
            PropertyOptions propertyOptions = (PropertyOptions) kh3.h0(list);
            this.taskType = propertyOptions != null ? propertyOptions.getValue() : null;
        }
    }

    public final void setPropertyOptions(String str, List<PropertyOptions> list) {
        sq8.m48649h(str, "propertyName");
        sq8.m48649h(list, "propertyOptions");
        if (sq8.m48644c(str, "taskType")) {
            this.taskTypeList = list;
        }
    }

    public final void setSortByField(String str) {
        this.sortByField = str;
    }

    public final void setSortDirection(String str) {
        this.sortDirection = str;
    }

    public final void setTaskType(String str) {
        this.taskType = str;
    }

    public final void setTaskTypeList(List<PropertyOptions> list) {
        this.taskTypeList = list;
    }

    public String toString() {
        return "TodoFilter(taskType=" + this.taskType + ", taskTypeList=" + this.taskTypeList + ", numTaskAttempts=" + this.numTaskAttempts + ", numDaysOverdueSince=" + this.numDaysOverdueSince + ", lastWorkedFrom=" + this.lastWorkedFrom + ", lastWorkedTo=" + this.lastWorkedTo + ", dueDateFrom=" + this.dueDateFrom + ", dueDateTo=" + this.dueDateTo + ", sortByField=" + this.sortByField + ", sortDirection=" + this.sortDirection + ")";
    }

    public TodoFilter(String str, List<PropertyOptions> list, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, String str2, String str3) {
        this.taskType = str;
        this.taskTypeList = list;
        this.numTaskAttempts = num;
        this.numDaysOverdueSince = num2;
        this.lastWorkedFrom = l;
        this.lastWorkedTo = l2;
        this.dueDateFrom = l3;
        this.dueDateTo = l4;
        this.sortByField = str2;
        this.sortDirection = str3;
    }

    public /* synthetic */ TodoFilter(String str, List list, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : str2, (i & 512) == 0 ? str3 : null);
    }
}
