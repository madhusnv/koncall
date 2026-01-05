package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class AttendanceInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AttendanceInfo> CREATOR = new Creator();
    private String accountId;
    private String capturedImageUrl;
    private Double checkoutLat;
    private Double checkoutLng;
    private String checkoutTime;
    private Long createdAt;
    private String dateOfAttendance;
    private String dateTimeOfAttendance;
    private String id;
    private Double lat;
    private Double lng;
    private String reasonForNonAttendance;
    private String timeOfAttendance;
    private Long updatedAt;
    private String userId;

    public static final class Creator implements Parcelable.Creator<AttendanceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttendanceInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new AttendanceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttendanceInfo[] newArray(int i) {
            return new AttendanceInfo[i];
        }
    }

    public AttendanceInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final LeadsUser attendanceUser() {
        String str = this.userId;
        if (str != null) {
            return lpi.a0(str);
        }
        return null;
    }

    public final String component1() {
        return this.id;
    }

    public final Double component10() {
        return this.checkoutLng;
    }

    public final String component11() {
        return this.checkoutTime;
    }

    public final String component12() {
        return this.reasonForNonAttendance;
    }

    public final String component13() {
        return this.capturedImageUrl;
    }

    public final Long component14() {
        return this.updatedAt;
    }

    public final Long component15() {
        return this.createdAt;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.dateTimeOfAttendance;
    }

    public final String component5() {
        return this.dateOfAttendance;
    }

    public final String component6() {
        return this.timeOfAttendance;
    }

    public final Double component7() {
        return this.lat;
    }

    public final Double component8() {
        return this.lng;
    }

    public final Double component9() {
        return this.checkoutLat;
    }

    public final AttendanceInfo copy(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Double d3, Double d4, String str7, String str8, String str9, Long l, Long l2) {
        return new AttendanceInfo(str, str2, str3, str4, str5, str6, d, d2, d3, d4, str7, str8, str9, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttendanceInfo)) {
            return false;
        }
        AttendanceInfo attendanceInfo = (AttendanceInfo) obj;
        return sq8.m48644c(this.id, attendanceInfo.id) && sq8.m48644c(this.accountId, attendanceInfo.accountId) && sq8.m48644c(this.userId, attendanceInfo.userId) && sq8.m48644c(this.dateTimeOfAttendance, attendanceInfo.dateTimeOfAttendance) && sq8.m48644c(this.dateOfAttendance, attendanceInfo.dateOfAttendance) && sq8.m48644c(this.timeOfAttendance, attendanceInfo.timeOfAttendance) && sq8.m48644c(this.lat, attendanceInfo.lat) && sq8.m48644c(this.lng, attendanceInfo.lng) && sq8.m48644c(this.checkoutLat, attendanceInfo.checkoutLat) && sq8.m48644c(this.checkoutLng, attendanceInfo.checkoutLng) && sq8.m48644c(this.checkoutTime, attendanceInfo.checkoutTime) && sq8.m48644c(this.reasonForNonAttendance, attendanceInfo.reasonForNonAttendance) && sq8.m48644c(this.capturedImageUrl, attendanceInfo.capturedImageUrl) && sq8.m48644c(this.updatedAt, attendanceInfo.updatedAt) && sq8.m48644c(this.createdAt, attendanceInfo.createdAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCapturedImageUrl() {
        return this.capturedImageUrl;
    }

    public final Double getCheckoutLat() {
        return this.checkoutLat;
    }

    public final Double getCheckoutLng() {
        return this.checkoutLng;
    }

    public final String getCheckoutTime() {
        return this.checkoutTime;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDateOfAttendance() {
        return this.dateOfAttendance;
    }

    public final String getDateTimeOfAttendance() {
        return this.dateTimeOfAttendance;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLng() {
        return this.lng;
    }

    public final String getReasonForNonAttendance() {
        return this.reasonForNonAttendance;
    }

    public final String getTimeOfAttendance() {
        return this.timeOfAttendance;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateTimeOfAttendance;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dateOfAttendance;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeOfAttendance;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.lat;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.lng;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.checkoutLat;
        int iHashCode9 = (iHashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.checkoutLng;
        int iHashCode10 = (iHashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str7 = this.checkoutTime;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.reasonForNonAttendance;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.capturedImageUrl;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.updatedAt;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode14 + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setCapturedImageUrl(String str) {
        this.capturedImageUrl = str;
    }

    public final void setCheckoutLat(Double d) {
        this.checkoutLat = d;
    }

    public final void setCheckoutLng(Double d) {
        this.checkoutLng = d;
    }

    public final void setCheckoutTime(String str) {
        this.checkoutTime = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDateOfAttendance(String str) {
        this.dateOfAttendance = str;
    }

    public final void setDateTimeOfAttendance(String str) {
        this.dateTimeOfAttendance = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLat(Double d) {
        this.lat = d;
    }

    public final void setLng(Double d) {
        this.lng = d;
    }

    public final void setReasonForNonAttendance(String str) {
        this.reasonForNonAttendance = str;
    }

    public final void setTimeOfAttendance(String str) {
        this.timeOfAttendance = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final AttendanceSummary toAttendanceSummary() {
        AttendanceSummary attendanceSummary = new AttendanceSummary(null, 1, null);
        attendanceSummary.setId(this.id);
        attendanceSummary.setAccountId(this.accountId);
        attendanceSummary.setDateTimeOfAttendance(this.dateTimeOfAttendance);
        attendanceSummary.setTimeOfAttendance(this.timeOfAttendance);
        attendanceSummary.setReasonForNonAttendance(this.reasonForNonAttendance);
        attendanceSummary.setCapturedImageUrl(this.capturedImageUrl);
        attendanceSummary.setLat(this.lat);
        attendanceSummary.setLng(this.lng);
        attendanceSummary.setCheckoutLat(this.checkoutLat);
        attendanceSummary.setCheckoutLng(this.checkoutLng);
        attendanceSummary.setCheckoutTime(this.checkoutTime);
        return attendanceSummary;
    }

    public String toString() {
        return "AttendanceInfo(id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", dateTimeOfAttendance=" + this.dateTimeOfAttendance + ", dateOfAttendance=" + this.dateOfAttendance + ", timeOfAttendance=" + this.timeOfAttendance + ", lat=" + this.lat + ", lng=" + this.lng + ", checkoutLat=" + this.checkoutLat + ", checkoutLng=" + this.checkoutLng + ", checkoutTime=" + this.checkoutTime + ", reasonForNonAttendance=" + this.reasonForNonAttendance + ", capturedImageUrl=" + this.capturedImageUrl + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.userId);
        parcel.writeString(this.dateTimeOfAttendance);
        parcel.writeString(this.dateOfAttendance);
        parcel.writeString(this.timeOfAttendance);
        Double d = this.lat;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.lng;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.checkoutLat;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.checkoutLng;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        parcel.writeString(this.checkoutTime);
        parcel.writeString(this.reasonForNonAttendance);
        parcel.writeString(this.capturedImageUrl);
        Long l = this.updatedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.createdAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ AttendanceInfo(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Double d3, Double d4, String str7, String str8, String str9, Long l, Long l2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : d3, (i & 512) != 0 ? null : d4, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : l, (i & Opcodes.ACC_ENUM) == 0 ? l2 : null);
    }

    public AttendanceInfo(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Double d3, Double d4, String str7, String str8, String str9, Long l, Long l2) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.dateTimeOfAttendance = str4;
        this.dateOfAttendance = str5;
        this.timeOfAttendance = str6;
        this.lat = d;
        this.lng = d2;
        this.checkoutLat = d3;
        this.checkoutLng = d4;
        this.checkoutTime = str7;
        this.reasonForNonAttendance = str8;
        this.capturedImageUrl = str9;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
