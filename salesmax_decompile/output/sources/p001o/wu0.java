package p001o;

import com.amazonaws.amplify.generated.graphql.CreateAttendanceMutation;
import com.amazonaws.amplify.generated.graphql.UpdateAttendanceMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Attendance;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.CreateAttendanceInput;
import type.UpdateAttendanceInput;

/* loaded from: classes.dex */
public interface wu0 extends dw0 {
    static /* synthetic */ Double Cr(Attendance attendance, Double d) {
        return attendance.getLng();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c E6(UpdateAttendanceInput updateAttendanceInput) {
        return graphqlMutation(UpdateAttendanceMutation.builder().input(updateAttendanceInput).build(), UpdateAttendanceMutation.Data.class, new Function() { // from class: o.mu0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateAttendanceMutation.Data) obj).updateAttendance();
            }
        }, Attendance.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Fk(Temporal.DateTime dateTime, String str, Optional optional, Optional optional2) {
        Attendance.BuildStep buildStepId = Attendance.builder().accountId(on()).userId(Eo()).dateOfAttendance(dateTime).timeOfAttendance(a81.m16642C()).reasonForNonAttendance(str).id("");
        Objects.requireNonNull(buildStepId);
        optional.ifPresent(new rt0(buildStepId));
        optional2.map(new cu0()).ifPresent(new nu0(buildStepId));
        optional2.map(new qu0()).ifPresent(new ru0(buildStepId));
        return ca(buildStepId.build());
    }

    static /* synthetic */ CreateAttendanceInput Ml(CreateAttendanceInput.Builder builder, Optional optional) {
        Optional map = optional.map(new cu0());
        Objects.requireNonNull(builder);
        map.ifPresent(new vt0(builder));
        optional.map(new qu0()).ifPresent(new wt0(builder));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Sp(String str, Optional optional, Optional optional2) {
        final Attendance.BuildStep buildStepId = Attendance.builder().accountId(on()).userId(Eo()).dateOfAttendance(a81.m16641B()).timeOfAttendance(a81.m16642C()).createdById(Eo()).updatedById(Eo()).reasonForNonAttendance("").id("");
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(buildStepId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.vu0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepId.capturedImageUrl((String) obj);
            }
        });
        optional.ifPresent(new rt0(buildStepId));
        optional2.map(new cu0()).ifPresent(new nu0(buildStepId));
        optional2.map(new qu0()).ifPresent(new ru0(buildStepId));
        return ca(buildStepId.build());
    }

    static /* synthetic */ UpdateAttendanceInput Zr(UpdateAttendanceInput.Builder builder, Optional optional) {
        Optional map = optional.map(new cu0());
        Objects.requireNonNull(builder);
        map.ifPresent(new hu0(builder));
        optional.map(new qu0()).ifPresent(new iu0(builder));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c iq(Temporal.DateTime dateTime, String str, Optional optional) {
        return Zf(dateTime, str, optional.map(new tu0()));
    }

    static /* synthetic */ boolean mx(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c nw(CreateAttendanceInput createAttendanceInput) {
        return graphqlMutation(CreateAttendanceMutation.builder().input(createAttendanceInput).build(), CreateAttendanceMutation.Data.class, new Function() { // from class: o.ou0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateAttendanceMutation.Data) obj).createAttendance();
            }
        }, Attendance.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c wv(String str, Optional optional) {
        return dc(str, optional.map(new tu0()));
    }

    static /* synthetic */ Double y8(Attendance attendance, Double d) {
        return attendance.getLng();
    }

    default x6c Db(final String str) {
        return Mf(Eo(), new Date()).m55717M(new rl7() { // from class: o.su0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f45928a.wv(str, (Optional) obj);
            }
        });
    }

    default x6c U7(Attendance attendance) {
        return r1(attendance).m55717M(new rl7() { // from class: o.it0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f29208a.E6((UpdateAttendanceInput) obj);
            }
        });
    }

    default x6c Zf(final Temporal.DateTime dateTime, final String str, final Optional optional) {
        return Jh(true).m55717M(new rl7() { // from class: o.gt0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f25775a.Fk(dateTime, str, optional, (Optional) obj);
            }
        });
    }

    default x6c ah(final Attendance attendance) {
        final CreateAttendanceInput.Builder builderUserId = CreateAttendanceInput.builder().accountId(attendance.getAccountId()).userId((String) Optional.ofNullable(attendance.getUserId()).orElseGet(new mt0(this)));
        Optional map = Optional.ofNullable(attendance.getTimeOfAttendance()).map(new ot0());
        Objects.requireNonNull(builderUserId);
        map.ifPresent(new Consumer() { // from class: o.tt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.timeOfAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getDateOfAttendance()).map(new ri()).ifPresent(new Consumer() { // from class: o.ut0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.dateOfAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getLat()).ifPresent(new vt0(builderUserId));
        Optional.ofNullable(attendance.getLng()).ifPresent(new wt0(builderUserId));
        Optional.ofNullable(attendance.getCapturedImageUrl()).ifPresent(new Consumer() { // from class: o.xt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.capturedImageUrl((String) obj);
            }
        });
        Optional.ofNullable(attendance.getReasonForNonAttendance()).ifPresent(new Consumer() { // from class: o.yt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.reasonForNonAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutLat()).ifPresent(new Consumer() { // from class: o.zt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutLat((Double) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutLng()).ifPresent(new Consumer() { // from class: o.nt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutLng((Double) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutTime()).map(new ot0()).ifPresent(new Consumer() { // from class: o.pt0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutTime((String) obj);
            }
        });
        return !Optional.ofNullable(attendance.getLat()).map(new Function() { // from class: o.qt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wu0.y8(attendance, (Double) obj);
            }
        }).isPresent() ? Jh(true).d0(new rl7() { // from class: o.st0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return wu0.Ml(builderUserId, (Optional) obj);
            }
        }) : x6c.c0(builderUserId.build());
    }

    default x6c ca(Attendance attendance) {
        return Optional.ofNullable(attendance.getId()).filter(new Predicate() { // from class: o.ht0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wu0.mx((String) obj);
            }
        }).isPresent() ? U7(attendance) : lt(attendance);
    }

    default x6c dc(final String str, final Optional optional) {
        return Jh(true).m55717M(new rl7() { // from class: o.uu0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f49490a.Sp(str, optional, (Optional) obj);
            }
        });
    }

    default x6c lt(Attendance attendance) {
        return ah(attendance).m55717M(new rl7() { // from class: o.jt0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f31058a.nw((CreateAttendanceInput) obj);
            }
        });
    }

    default x6c r1(final Attendance attendance) {
        final UpdateAttendanceInput.Builder builderUserId = UpdateAttendanceInput.builder().id(attendance.getId()).accountId(attendance.getAccountId()).userId((String) Optional.ofNullable(attendance.getUserId()).orElseGet(new mt0(this)));
        Optional map = Optional.ofNullable(attendance.getTimeOfAttendance()).map(new ot0());
        Objects.requireNonNull(builderUserId);
        map.ifPresent(new Consumer() { // from class: o.fu0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.timeOfAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getDateOfAttendance()).map(new ri()).ifPresent(new Consumer() { // from class: o.gu0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.dateOfAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getLat()).ifPresent(new hu0(builderUserId));
        Optional.ofNullable(attendance.getLng()).ifPresent(new iu0(builderUserId));
        Optional.ofNullable(attendance.getCapturedImageUrl()).ifPresent(new Consumer() { // from class: o.ju0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.capturedImageUrl((String) obj);
            }
        });
        Optional.ofNullable(attendance.getReasonForNonAttendance()).ifPresent(new Consumer() { // from class: o.ku0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.reasonForNonAttendance((String) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutLat()).ifPresent(new Consumer() { // from class: o.lu0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutLat((Double) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutLng()).ifPresent(new Consumer() { // from class: o.au0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutLng((Double) obj);
            }
        });
        Optional.ofNullable(attendance.getCheckoutTime()).map(new ot0()).ifPresent(new Consumer() { // from class: o.bu0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.checkoutTime((String) obj);
            }
        });
        return !Optional.ofNullable(attendance.getLat()).map(new Function() { // from class: o.du0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wu0.Cr(attendance, (Double) obj);
            }
        }).isPresent() ? Jh(true).d0(new rl7() { // from class: o.eu0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return wu0.Zr(builderUserId, (Optional) obj);
            }
        }) : x6c.c0(builderUserId.build());
    }

    default x6c wd(Long l, Long l2, final String str) {
        List list = (List) a81.m16644E(a81.m16658m(l), a81.m16658m(l2)).stream().map(new Function() { // from class: o.kt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f32672a.Gx(str, (Temporal.DateTime) obj);
            }
        }).collect(Collectors.toList());
        return x6c.e0(list).m55733m(new ArrayList(), new lt0()).m55027y();
    }

    /* renamed from: xz, reason: merged with bridge method [inline-methods] */
    default x6c Gx(final Temporal.DateTime dateTime, final String str) {
        return Mf(Eo(), dateTime.toDate()).m55717M(new rl7() { // from class: o.pu0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f40570a.iq(dateTime, str, (Optional) obj);
            }
        });
    }
}
