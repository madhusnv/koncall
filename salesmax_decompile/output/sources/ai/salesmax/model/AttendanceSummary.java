package ai.salesmax.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Attendance;
import p001o.a81;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;

/* loaded from: classes.dex */
public final class AttendanceSummary {
    private Attendance underlyingAttendance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Attendance newInstance() {
            Attendance attendanceBuild = Attendance.builder().accountId("").userId("").id("").build();
            sq8.m48648g(attendanceBuild, "build(...)");
            return attendanceBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttendanceSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final LeadsUser attendanceUser() {
        String userId = getUserId();
        if (userId != null) {
            return lpi.a0(userId);
        }
        return null;
    }

    public final String getAccountId() {
        return this.underlyingAttendance.getAccountId();
    }

    public final String getCapturedImageUrl() {
        return this.underlyingAttendance.getCapturedImageUrl();
    }

    public final Double getCheckoutLat() {
        return this.underlyingAttendance.getCheckoutLat();
    }

    public final Double getCheckoutLng() {
        return this.underlyingAttendance.getCheckoutLng();
    }

    public final String getCheckoutTime() {
        Temporal.Time checkoutTime = this.underlyingAttendance.getCheckoutTime();
        if (checkoutTime != null) {
            return checkoutTime.format();
        }
        return null;
    }

    public final Long getCreatedAt() {
        Temporal.DateTime createdAt = this.underlyingAttendance.getCreatedAt();
        if (createdAt != null) {
            return a81.m16645F(new Temporal.DateTime(createdAt.format()));
        }
        return null;
    }

    public final String getCreatedById() {
        return this.underlyingAttendance.getCreatedById();
    }

    public final String getDateOfAttendance() {
        Temporal.DateTime dateOfAttendance = this.underlyingAttendance.getDateOfAttendance();
        if (dateOfAttendance != null) {
            return a81.m16656k(dateOfAttendance);
        }
        return null;
    }

    public final String getDateTimeOfAttendance() {
        Temporal.DateTime dateOfAttendance = this.underlyingAttendance.getDateOfAttendance();
        if (dateOfAttendance != null) {
            return dateOfAttendance.format();
        }
        return null;
    }

    public final String getId() {
        return this.underlyingAttendance.getId();
    }

    public final Double getLat() {
        return this.underlyingAttendance.getLat();
    }

    public final Double getLng() {
        return this.underlyingAttendance.getLng();
    }

    public final String getReasonForNonAttendance() {
        return this.underlyingAttendance.getReasonForNonAttendance();
    }

    public final String getTimeOfAttendance() {
        Temporal.Time timeOfAttendance = this.underlyingAttendance.getTimeOfAttendance();
        if (timeOfAttendance != null) {
            return timeOfAttendance.format();
        }
        return null;
    }

    public final Attendance getUnderlyingAttendance() {
        return this.underlyingAttendance;
    }

    public final Long getUpdatedAt() {
        Temporal.DateTime updatedAt = this.underlyingAttendance.getUpdatedAt();
        if (updatedAt != null) {
            return a81.m16645F(new Temporal.DateTime(updatedAt.format()));
        }
        return null;
    }

    public final String getUpdatedById() {
        return this.underlyingAttendance.getUpdatedById();
    }

    public final String getUserId() {
        return this.underlyingAttendance.getUserId();
    }

    public final void setAccountId(String str) {
        Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().accountId(str).build();
        sq8.m48648g(attendanceBuild, "build(...)");
        this.underlyingAttendance = attendanceBuild;
    }

    public final void setCapturedImageUrl(String str) {
        Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().capturedImageUrl(str).build();
        sq8.m48648g(attendanceBuild, "build(...)");
        this.underlyingAttendance = attendanceBuild;
    }

    public final void setCheckoutLat(Double d) {
        if (d != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().checkoutLat(Double.valueOf(d.doubleValue())).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setCheckoutLng(Double d) {
        if (d != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().checkoutLng(Double.valueOf(d.doubleValue())).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setCheckoutTime(String str) {
        if (str != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().checkoutTime(new Temporal.Time(str)).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setDateTimeOfAttendance(String str) {
        if (str != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().dateOfAttendance(new Temporal.DateTime(str)).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setId(String str) {
        Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().id(str).build();
        sq8.m48648g(attendanceBuild, "build(...)");
        this.underlyingAttendance = attendanceBuild;
    }

    public final void setLat(Double d) {
        if (d != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().lat(Double.valueOf(d.doubleValue())).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setLng(Double d) {
        if (d != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().lng(Double.valueOf(d.doubleValue())).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setReasonForNonAttendance(String str) {
        Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().reasonForNonAttendance(str).build();
        sq8.m48648g(attendanceBuild, "build(...)");
        this.underlyingAttendance = attendanceBuild;
    }

    public final void setTimeOfAttendance(String str) {
        if (str != null) {
            Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().timeOfAttendance(new Temporal.Time(str)).build();
            sq8.m48648g(attendanceBuild, "build(...)");
            this.underlyingAttendance = attendanceBuild;
        }
    }

    public final void setUnderlyingAttendance(Attendance attendance) {
        sq8.m48649h(attendance, "<set-?>");
        this.underlyingAttendance = attendance;
    }

    public final void setUserId(String str) {
        Attendance attendanceBuild = this.underlyingAttendance.copyOfBuilder().userId(str).build();
        sq8.m48648g(attendanceBuild, "build(...)");
        this.underlyingAttendance = attendanceBuild;
    }

    public final AttendanceInfo toAttendanceInfo() {
        return new AttendanceInfo(getId(), getAccountId(), getUserId(), getDateTimeOfAttendance(), getDateOfAttendance(), getTimeOfAttendance(), getLat(), getLng(), getCheckoutLat(), getCheckoutLng(), getCheckoutTime(), getReasonForNonAttendance(), getCapturedImageUrl(), getUpdatedAt(), getCreatedAt());
    }

    public AttendanceSummary(Attendance attendance) {
        sq8.m48649h(attendance, "underlyingAttendance");
        this.underlyingAttendance = attendance;
    }

    public /* synthetic */ AttendanceSummary(Attendance attendance, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : attendance);
    }
}
