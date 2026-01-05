package p001o;

import ai.salesmax.services.model.DatedAttendance;
import ai.salesmax.services.model.ModelAttendanceConnection;
import com.amazonaws.amplify.generated.graphql.GetAttendanceByAccountAndUserQuery;
import com.amazonaws.amplify.generated.graphql.GetAttendanceForUserByDateQuery;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Attendance;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.C19026x17de864e;
import type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput;
import type.ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput;
import type.ModelAttendanceAttendanceForUserByDateCompositeKeyInput;
import type.ModelAttendanceFilterInput;
import type.ModelSortDirection;

/* loaded from: classes.dex */
public interface dw0 extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List Bg(List list, final String str, List list2) {
        final HashMap map = new HashMap((Map) list2.stream().collect(Collectors.toMap(new Function() { // from class: o.dv0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f20571a.jo((Attendance) obj);
            }
        }, new Function() { // from class: o.ev0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dw0.sq((Attendance) obj);
            }
        }, new BinaryOperator() { // from class: o.fv0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return dw0.bl((Attendance) obj, (Attendance) obj2);
            }
        })));
        list.stream().filter(new Predicate() { // from class: o.gv0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f25814a.ii(map, (Temporal.DateTime) obj);
            }
        }).map(new Function() { // from class: o.hv0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f27572a.Ej(str, (Temporal.DateTime) obj);
            }
        }).forEach(new Consumer() { // from class: o.iv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f29255a.ur(map, (Attendance) obj);
            }
        });
        return (List) map.values().stream().collect(Collectors.toList());
    }

    static /* synthetic */ Date D5(Date date, int i, Integer num) {
        return a81.m16668w(date, Integer.valueOf(i * num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Attendance Ej(String str, Temporal.DateTime dateTime) {
        return DatedAttendance.emptyAttendance(on(), str, dateTime);
    }

    static /* synthetic */ ryh Kv(ModelAttendanceConnection modelAttendanceConnection) {
        return uyh.of(modelAttendanceConnection.getItems(), modelAttendanceConnection.getNextToken());
    }

    static /* synthetic */ DatedAttendance Pr(Date date, List list) {
        return (DatedAttendance) list.stream().findFirst().orElse(DatedAttendance.empty(date));
    }

    static /* synthetic */ Temporal.DateTime Wq(Date date) {
        return a81.m16658m(Long.valueOf(date.getTime()));
    }

    static /* synthetic */ Attendance bl(Attendance attendance, Attendance attendance2) {
        return attendance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x6c d1(int i, final Temporal.DateTime dateTime) {
        String strM16652g = a81.m16652g(dateTime);
        String strM16653h = a81.m16653h(Long.valueOf(a81.m16668w(dateTime.toDate(), 1).getTime()));
        return f2(uyh.of(C19026x17de864e.builder().between(Arrays.asList(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.builder().dateOfAttendance(strM16652g).build(), ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.builder().dateOfAttendance(strM16653h).build())).build(), null), i).m47686M(new rl7() { // from class: o.cw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return DatedAttendance.of(dateTime, (List) obj);
            }
        }).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean ii(Map map, Temporal.DateTime dateTime) {
        return !map.containsKey(Uc(dateTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default String jo(Attendance attendance) {
        return Uc(attendance.getDateOfAttendance());
    }

    static /* synthetic */ Optional mm(List list) {
        return list.stream().findFirst();
    }

    static /* synthetic */ Attendance sq(Attendance attendance) {
        return attendance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void ur(Map map, Attendance attendance) {
        map.put(Uc(attendance.getDateOfAttendance()), attendance);
    }

    static /* synthetic */ ryh v1(ModelAttendanceConnection modelAttendanceConnection) {
        return uyh.of(modelAttendanceConnection.getItems(), modelAttendanceConnection.getNextToken());
    }

    default GetAttendanceByAccountAndUserQuery Do(C19026x17de864e c19026x17de864e, ModelAttendanceFilterInput modelAttendanceFilterInput, Optional optional, int i) {
        final GetAttendanceByAccountAndUserQuery.Builder builderSortDirection = GetAttendanceByAccountAndUserQuery.builder().accountId(on()).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(c19026x17de864e);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.bv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.dateOfAttendanceUserId((C19026x17de864e) obj);
            }
        });
        optional.ifPresent(new Consumer() { // from class: o.mv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.nextToken((String) obj);
            }
        });
        Optional.ofNullable(modelAttendanceFilterInput).ifPresent(new Consumer() { // from class: o.vv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.filter((ModelAttendanceFilterInput) obj);
            }
        });
        return builderSortDirection.build();
    }

    default x6c Mf(String str, Date date) {
        String strM16653h = a81.m16653h(Long.valueOf(a81.m16665t(date)));
        String strM16653h2 = a81.m16653h(Long.valueOf(a81.m16661p(date)));
        return graphqlQuery(GetAttendanceForUserByDateQuery.builder().userIdDateOfAttendance(ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.builder().between(Arrays.asList(ModelAttendanceAttendanceForUserByDateCompositeKeyInput.builder().userId(str).dateOfAttendance(strM16653h).build(), ModelAttendanceAttendanceForUserByDateCompositeKeyInput.builder().userId(str).dateOfAttendance(strM16653h2).build())).build()).accountId(on()).limit(1).build(), GetAttendanceForUserByDateQuery.Data.class, new kv0(), ModelAttendanceConnection.class).d0(new rl7() { // from class: o.tv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ModelAttendanceConnection) obj).getItems();
            }
        }).d0(new rl7() { // from class: o.uv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.mm((List) obj);
            }
        });
    }

    default String Uc(Temporal.DateTime dateTime) {
        return (String) Optional.ofNullable(dateTime.toDate()).map(new nv0(new SimpleDateFormat("ddMMYYYY"))).orElse(null);
    }

    default x6c Vk(final String str, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInputBuild = ModelAttendanceAttendanceForUserByDateCompositeKeyInput.builder().userId(str).dateOfAttendance(a81.m16652g(dateTime2)).build();
        ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput modelAttendanceAttendanceForUserByDateCompositeKeyConditionInputBuild = ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.builder().between(Arrays.asList(ModelAttendanceAttendanceForUserByDateCompositeKeyInput.builder().userId(str).dateOfAttendance(a81.m16652g(dateTime)).build(), modelAttendanceAttendanceForUserByDateCompositeKeyInputBuild)).build();
        final List listM16644E = a81.m16644E(dateTime, dateTime2);
        return W4(uyh.of(modelAttendanceAttendanceForUserByDateCompositeKeyConditionInputBuild, null), 100).m47686M(new rl7() { // from class: o.xv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f54320a.Bg(listM16644E, str, (List) obj);
            }
        }).h0();
    }

    default s47 W4(final ryh ryhVar, final int i) {
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.cv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f18678a.pr(ryhVar, i, (String) obj);
            }
        }).m47706n(new rr(), new lt0()).m55026x();
    }

    default x6c ex(final Date date, final int i, int i2) {
        s47 s47VarM47686M = s47.m47675V(0, i2).m47686M(new rl7() { // from class: o.yv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.D5(date, i, (Integer) obj);
            }
        }).m47686M(new rl7() { // from class: o.zv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.Wq((Date) obj);
            }
        });
        final int i3 = 100;
        return x6c.f0(s47VarM47686M.m47686M(new rl7() { // from class: o.aw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f15294a.d1(i3, (Temporal.DateTime) obj);
            }
        }).h0()).m55732l(new rr(), new eh1() { // from class: o.bw0
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add((DatedAttendance) obj2);
            }
        }).m55027y();
    }

    default s47 f2(final ryh ryhVar, final int i) {
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.jv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f31135a.L0(ryhVar, i, (String) obj);
            }
        }).m47706n(new rr(), new lt0()).m55026x();
    }

    /* renamed from: qa, reason: merged with bridge method [inline-methods] */
    default s47 L0(ryh ryhVar, String str, int i) {
        return graphqlQuery(Do((C19026x17de864e) ryhVar.f44265a, (ModelAttendanceFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), GetAttendanceByAccountAndUserQuery.Data.class, new Function() { // from class: o.rv0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetAttendanceByAccountAndUserQuery.Data) obj).getAttendanceByAccountAndUser();
            }
        }, ModelAttendanceConnection.class).d0(new rl7() { // from class: o.sv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.Kv((ModelAttendanceConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    /* renamed from: qf, reason: merged with bridge method [inline-methods] */
    default s47 pr(ryh ryhVar, String str, int i) {
        return graphqlQuery(r2((ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput) ryhVar.f44265a, (ModelAttendanceFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), GetAttendanceForUserByDateQuery.Data.class, new kv0(), ModelAttendanceConnection.class).d0(new rl7() { // from class: o.lv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.v1((ModelAttendanceConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default GetAttendanceForUserByDateQuery r2(ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput modelAttendanceAttendanceForUserByDateCompositeKeyConditionInput, ModelAttendanceFilterInput modelAttendanceFilterInput, Optional optional, int i) {
        final GetAttendanceForUserByDateQuery.Builder builderSortDirection = GetAttendanceForUserByDateQuery.builder().accountId(on()).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(modelAttendanceAttendanceForUserByDateCompositeKeyConditionInput);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.ov0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.userIdDateOfAttendance((ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput) obj);
            }
        });
        optional.ifPresent(new Consumer() { // from class: o.pv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.nextToken((String) obj);
            }
        });
        Optional.ofNullable(modelAttendanceFilterInput).ifPresent(new Consumer() { // from class: o.qv0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.filter((ModelAttendanceFilterInput) obj);
            }
        });
        return builderSortDirection.build();
    }

    default x6c y1(final Date date) {
        return ex(date, 1, 1).d0(new rl7() { // from class: o.wv0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return dw0.Pr(date, (List) obj);
            }
        });
    }
}
