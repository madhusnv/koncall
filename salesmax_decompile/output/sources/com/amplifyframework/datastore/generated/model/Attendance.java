package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "dateOfAttendance", "userId"}, name = "attendanceByAccountAndUser"), @Index(fields = {"accountId", "userId", "dateOfAttendance"}, name = "attendanceForUserByDate")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "Attendances")
/* loaded from: classes5.dex */
public final class Attendance implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String capturedImageUrl;

    @ModelField(targetType = "Float")
    private final Double checkoutLat;

    @ModelField(targetType = "Float")
    private final Double checkoutLng;

    @ModelField(targetType = "AWSTime")
    private final Temporal.Time checkoutTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dateOfAttendance;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Float")
    private final Double lat;

    @ModelField(targetType = "Float")
    private final Double lng;

    @ModelField(targetType = "String")
    private final String reasonForNonAttendance;

    @ModelField(targetType = "AWSTime")
    private final Temporal.Time timeOfAttendance;

    @ModelField(targetType = "Int")
    private final Integer totalDurationInMinutes;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("Attendance", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("Attendance", "accountId");
    public static final QueryField USER_ID = QueryField.field("Attendance", "userId");
    public static final QueryField DATE_OF_ATTENDANCE = QueryField.field("Attendance", "dateOfAttendance");
    public static final QueryField TIME_OF_ATTENDANCE = QueryField.field("Attendance", "timeOfAttendance");
    public static final QueryField CHECKOUT_TIME = QueryField.field("Attendance", "checkoutTime");
    public static final QueryField TOTAL_DURATION_IN_MINUTES = QueryField.field("Attendance", "totalDurationInMinutes");
    public static final QueryField LAT = QueryField.field("Attendance", "lat");
    public static final QueryField LNG = QueryField.field("Attendance", "lng");
    public static final QueryField CHECKOUT_LAT = QueryField.field("Attendance", "checkoutLat");
    public static final QueryField CHECKOUT_LNG = QueryField.field("Attendance", "checkoutLng");
    public static final QueryField REASON_FOR_NON_ATTENDANCE = QueryField.field("Attendance", "reasonForNonAttendance");
    public static final QueryField CAPTURED_IMAGE_URL = QueryField.field("Attendance", "capturedImageUrl");
    public static final QueryField CREATED_BY_ID = QueryField.field("Attendance", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Attendance", "updatedById");
    public static final QueryField CREATED_AT = QueryField.field("Attendance", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Attendance", "updatedAt");

    public interface AccountIdStep {
        UserIdStep accountId(String str);
    }

    public interface BuildStep {
        Attendance build();

        BuildStep capturedImageUrl(String str);

        BuildStep checkoutLat(Double d);

        BuildStep checkoutLng(Double d);

        BuildStep checkoutTime(Temporal.Time time);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep dateOfAttendance(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep lat(Double d);

        BuildStep lng(Double d);

        BuildStep reasonForNonAttendance(String str);

        BuildStep timeOfAttendance(Temporal.Time time);

        BuildStep totalDurationInMinutes(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, UserIdStep, BuildStep {
        private String accountId;
        private String capturedImageUrl;
        private Double checkoutLat;
        private Double checkoutLng;
        private Temporal.Time checkoutTime;
        private Temporal.DateTime createdAt;
        private String createdById;
        private Temporal.DateTime dateOfAttendance;
        private String id;
        private Double lat;
        private Double lng;
        private String reasonForNonAttendance;
        private Temporal.Time timeOfAttendance;
        private Integer totalDurationInMinutes;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.Attendance.AccountIdStep
        public UserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public Attendance build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Attendance(string, this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep capturedImageUrl(String str) {
            this.capturedImageUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep checkoutLat(Double d) {
            this.checkoutLat = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep checkoutLng(Double d) {
            this.checkoutLng = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep checkoutTime(Temporal.Time time) {
            this.checkoutTime = time;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep dateOfAttendance(Temporal.DateTime dateTime) {
            this.dateOfAttendance = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep lat(Double d) {
            this.lat = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep lng(Double d) {
            this.lng = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep reasonForNonAttendance(String str) {
            this.reasonForNonAttendance = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep timeOfAttendance(Temporal.Time time) {
            this.timeOfAttendance = time;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep totalDurationInMinutes(Integer num) {
            this.totalDurationInMinutes = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.UserIdStep
        public BuildStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.Time time, Temporal.Time time2, Integer num, Double d, Double d2, Double d3, Double d4, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.dateOfAttendance = dateTime;
            this.timeOfAttendance = time;
            this.checkoutTime = time2;
            this.totalDurationInMinutes = num;
            this.lat = d;
            this.lng = d2;
            this.checkoutLat = d3;
            this.checkoutLng = d4;
            this.reasonForNonAttendance = str4;
            this.capturedImageUrl = str5;
            this.createdById = str6;
            this.updatedById = str7;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.Time time, Temporal.Time time2, Integer num, Double d, Double d2, Double d3, Double d4, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, dateTime, time, time2, num, d, d2, d3, d4, str4, str5, str6, str7, dateTime2, dateTime3);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder capturedImageUrl(String str) {
            return (CopyOfBuilder) super.capturedImageUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder checkoutLat(Double d) {
            return (CopyOfBuilder) super.checkoutLat(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder checkoutLng(Double d) {
            return (CopyOfBuilder) super.checkoutLng(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder checkoutTime(Temporal.Time time) {
            return (CopyOfBuilder) super.checkoutTime(time);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder dateOfAttendance(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dateOfAttendance(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder lat(Double d) {
            return (CopyOfBuilder) super.lat(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder lng(Double d) {
            return (CopyOfBuilder) super.lng(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder reasonForNonAttendance(String str) {
            return (CopyOfBuilder) super.reasonForNonAttendance(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder timeOfAttendance(Temporal.Time time) {
            return (CopyOfBuilder) super.timeOfAttendance(time);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder totalDurationInMinutes(Integer num) {
            return (CopyOfBuilder) super.totalDurationInMinutes(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Attendance.Builder, com.amplifyframework.datastore.generated.model.Attendance.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface UserIdStep {
        BuildStep userId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Attendance justId(String str) {
        return new Attendance(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Attendance.class != obj.getClass()) {
            return false;
        }
        Attendance attendance = (Attendance) obj;
        return s6c.m47909a(getId(), attendance.getId()) && s6c.m47909a(getAccountId(), attendance.getAccountId()) && s6c.m47909a(getUserId(), attendance.getUserId()) && s6c.m47909a(getDateOfAttendance(), attendance.getDateOfAttendance()) && s6c.m47909a(getTimeOfAttendance(), attendance.getTimeOfAttendance()) && s6c.m47909a(getCheckoutTime(), attendance.getCheckoutTime()) && s6c.m47909a(getTotalDurationInMinutes(), attendance.getTotalDurationInMinutes()) && s6c.m47909a(getLat(), attendance.getLat()) && s6c.m47909a(getLng(), attendance.getLng()) && s6c.m47909a(getCheckoutLat(), attendance.getCheckoutLat()) && s6c.m47909a(getCheckoutLng(), attendance.getCheckoutLng()) && s6c.m47909a(getReasonForNonAttendance(), attendance.getReasonForNonAttendance()) && s6c.m47909a(getCapturedImageUrl(), attendance.getCapturedImageUrl()) && s6c.m47909a(getCreatedById(), attendance.getCreatedById()) && s6c.m47909a(getUpdatedById(), attendance.getUpdatedById()) && s6c.m47909a(getCreatedAt(), attendance.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), attendance.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCapturedImageUrl() {
        return this.capturedImageUrl;
    }

    public Double getCheckoutLat() {
        return this.checkoutLat;
    }

    public Double getCheckoutLng() {
        return this.checkoutLng;
    }

    public Temporal.Time getCheckoutTime() {
        return this.checkoutTime;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public Temporal.DateTime getDateOfAttendance() {
        return this.dateOfAttendance;
    }

    public String getId() {
        return this.id;
    }

    public Double getLat() {
        return this.lat;
    }

    public Double getLng() {
        return this.lng;
    }

    public String getReasonForNonAttendance() {
        return this.reasonForNonAttendance;
    }

    public Temporal.Time getTimeOfAttendance() {
        return this.timeOfAttendance;
    }

    public Integer getTotalDurationInMinutes() {
        return this.totalDurationInMinutes;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getDateOfAttendance() + getTimeOfAttendance() + getCheckoutTime() + getTotalDurationInMinutes() + getLat() + getLng() + getCheckoutLat() + getCheckoutLng() + getReasonForNonAttendance() + getCapturedImageUrl() + getCreatedById() + getUpdatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Attendance {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("dateOfAttendance=" + String.valueOf(getDateOfAttendance()) + ", ");
        sb.append("timeOfAttendance=" + String.valueOf(getTimeOfAttendance()) + ", ");
        sb.append("checkoutTime=" + String.valueOf(getCheckoutTime()) + ", ");
        sb.append("totalDurationInMinutes=" + String.valueOf(getTotalDurationInMinutes()) + ", ");
        sb.append("lat=" + String.valueOf(getLat()) + ", ");
        sb.append("lng=" + String.valueOf(getLng()) + ", ");
        sb.append("checkoutLat=" + String.valueOf(getCheckoutLat()) + ", ");
        sb.append("checkoutLng=" + String.valueOf(getCheckoutLng()) + ", ");
        sb.append("reasonForNonAttendance=" + String.valueOf(getReasonForNonAttendance()) + ", ");
        sb.append("capturedImageUrl=" + String.valueOf(getCapturedImageUrl()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Attendance(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.Time time, Temporal.Time time2, Integer num, Double d, Double d2, Double d3, Double d4, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.dateOfAttendance = dateTime;
        this.timeOfAttendance = time;
        this.checkoutTime = time2;
        this.totalDurationInMinutes = num;
        this.lat = d;
        this.lng = d2;
        this.checkoutLat = d3;
        this.checkoutLng = d4;
        this.reasonForNonAttendance = str4;
        this.capturedImageUrl = str5;
        this.createdById = str6;
        this.updatedById = str7;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
