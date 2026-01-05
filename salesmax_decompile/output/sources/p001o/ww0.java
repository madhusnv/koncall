package p001o;

import ai.salesmax.model.AttendanceSummary;
import ai.salesmax.model.Location;
import ai.salesmax.services.model.DatedAttendance;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Attendance;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class ww0 {
    /* renamed from: A */
    public static /* synthetic */ Attendance m55251A(l1 l1Var, Date date, String str) {
        return DatedAttendance.emptyAttendance(l1Var.on(), str, date);
    }

    /* renamed from: B */
    public static /* synthetic */ List m55252B(List list, final Date date, final l1 l1Var) {
        return (List) list.stream().map(new Function() { // from class: o.sw0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ww0.m55251A(l1Var, date, (String) obj);
            }
        }).map(new rw0()).collect(Collectors.toList());
    }

    /* renamed from: C */
    public static /* synthetic */ x8c m55253C(Long l, l1 l1Var) {
        return l1Var.pa(l, true);
    }

    /* renamed from: D */
    public static /* synthetic */ Location m55254D(android.location.Location location) {
        return new Location(location.getLongitude(), location.getLatitude());
    }

    /* renamed from: E */
    public static /* synthetic */ Optional m55255E(Optional optional) {
        return optional.map(new Function() { // from class: o.kw0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ww0.m55254D((android.location.Location) obj);
            }
        });
    }

    /* renamed from: F */
    public static /* synthetic */ x8c m55256F(String str, l1 l1Var) {
        return l1Var.Db(str);
    }

    /* renamed from: G */
    public static /* synthetic */ x8c m55257G(Long l, Long l2, String str, l1 l1Var) {
        return l1Var.wd(l, l2, str);
    }

    /* renamed from: H */
    public static /* synthetic */ List m55258H(List list) {
        return (List) list.stream().map(new rw0()).collect(Collectors.toList());
    }

    /* renamed from: I */
    public static /* synthetic */ void m55259I(AttendanceSummary attendanceSummary, Location location) {
        attendanceSummary.setCheckoutLat(Double.valueOf(location.getLat()));
        attendanceSummary.setCheckoutLng(Double.valueOf(location.getLng()));
    }

    /* renamed from: J */
    public static /* synthetic */ x8c m55260J(AttendanceSummary attendanceSummary, l1 l1Var) {
        return l1Var.ca(attendanceSummary.getUnderlyingAttendance());
    }

    /* renamed from: K */
    public static /* synthetic */ x8c m55261K(final AttendanceSummary attendanceSummary, Optional optional) {
        optional.ifPresent(new Consumer() { // from class: o.iw0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ww0.m55259I(attendanceSummary, (Location) obj);
            }
        });
        return m55281q().m55717M(new rl7() { // from class: o.jw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55260J(attendanceSummary, (l1) obj);
            }
        }).d0(new nw0());
    }

    /* renamed from: L */
    public static x6c m55262L(final String str) {
        return m55281q().m55717M(new rl7() { // from class: o.ew0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55256F(str, (l1) obj);
            }
        }).d0(new nw0());
    }

    /* renamed from: M */
    public static x6c m55263M(final Long l, final Long l2, final String str) {
        return m55281q().m55717M(new rl7() { // from class: o.lw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55257G(l, l2, str, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.mw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55258H((List) obj);
            }
        });
    }

    /* renamed from: N */
    public static x6c m55264N(final AttendanceSummary attendanceSummary) {
        return m55285u(1000L).m55717M(new rl7() { // from class: o.vw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55261K(attendanceSummary, (Optional) obj);
            }
        });
    }

    /* renamed from: q */
    public static x6c m55281q() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: r */
    public static x6c m55282r(final Date date) {
        return m55281q().m55717M(new rl7() { // from class: o.pw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55286v(date, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.qw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55287w((DatedAttendance) obj);
            }
        });
    }

    /* renamed from: s */
    public static x6c m55283s(final String str, final Date date, final Date date2) {
        return m55281q().m55717M(new rl7() { // from class: o.tw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55289y(date2, date, str, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.uw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55290z((List) obj);
            }
        });
    }

    /* renamed from: t */
    public static x6c m55284t(final List list, final Date date) {
        return m55281q().d0(new rl7() { // from class: o.ow0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55252B(list, date, (l1) obj);
            }
        });
    }

    /* renamed from: u */
    public static x6c m55285u(final Long l) {
        return m55281q().m55717M(new rl7() { // from class: o.fw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55253C(l, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.gw0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ww0.m55255E((Optional) obj);
            }
        });
    }

    /* renamed from: v */
    public static /* synthetic */ x8c m55286v(Date date, l1 l1Var) {
        return l1Var.y1(new Date(a81.m16665t(date)));
    }

    /* renamed from: w */
    public static /* synthetic */ List m55287w(DatedAttendance datedAttendance) {
        return (List) datedAttendance.getAllAttendance().values().stream().map(new rw0()).collect(Collectors.toList());
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m55288x(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: y */
    public static /* synthetic */ x8c m55289y(Date date, Date date2, String str, l1 l1Var) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(a81.m16661p(date)));
        return l1Var.Vk((String) Optional.ofNullable(str).filter(new Predicate() { // from class: o.hw0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ww0.m55288x((String) obj);
            }
        }).orElse(l1Var.Eo()), a81.m16658m(Long.valueOf(a81.m16665t(date2))), dateTimeM16658m);
    }

    /* renamed from: z */
    public static /* synthetic */ List m55290z(List list) {
        return (List) list.stream().map(new rw0()).collect(Collectors.toList());
    }
}
