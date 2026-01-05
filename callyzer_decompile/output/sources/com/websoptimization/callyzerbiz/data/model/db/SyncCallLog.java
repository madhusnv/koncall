package com.websoptimization.callyzerbiz.data.model.db;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import java.io.File;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import nm.C5107b;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import ym.InterfaceC8701l;
import yv.C8800o;
import zm.EnumC8991a;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncCallLog {

    /* renamed from: a */
    public final EnumC8994d f7331a;

    /* renamed from: b */
    public final String f7332b;

    /* renamed from: c */
    public final String f7333c;

    @InterfaceC4485b("bucketFileId")
    private final String callRecordFileId;

    @InterfaceC4485b("syncStatus")
    private final EnumC8993c callRecordSyncStatus;

    @InterfaceC4485b("bucketUrl")
    private final String callRecordWebPath;

    @InterfaceC4485b("callType")
    private final String callTypeInString;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    /* renamed from: d */
    public final EnumSet f7334d;

    @InterfaceC4485b("dateTime")
    private final String datetime;

    @InterfaceC4485b("duration")
    private final long duration;

    /* renamed from: e */
    public final int f7335e;

    /* renamed from: f */
    public final String f7336f;

    @InterfaceC4485b("filePath")
    private final String filePath;

    @InterfaceC4485b("fileSize")
    private final Long fileSize;

    /* renamed from: g */
    public final long f7337g;

    @InterfaceC4485b("toName")
    private final String name;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("note")
    private final String notes;

    @InterfaceC4485b("toNumber")
    private final String number;

    @InterfaceC4485b("fromNumber")
    private final String simNumber;

    public SyncCallLog(String name, String number, int i10, EnumC8994d callType, String datetime, String simNumber, long j6, EnumC8993c enumC8993c, String str, String str2, String str3, String str4, LocalDateTime localDateTime, String tableName, EnumSet<EnumC8991a> callLogSyncStatus, int i11, String companyCode, long j10) {
        String string;
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(datetime, "datetime");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(tableName, "tableName");
        AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
        AbstractC4154l.m8923f(companyCode, "companyCode");
        this.name = name;
        this.number = number;
        this.countryCode = i10;
        this.f7331a = callType;
        this.datetime = datetime;
        this.simNumber = simNumber;
        this.duration = j6;
        this.callRecordSyncStatus = enumC8993c;
        this.f7332b = str;
        this.callRecordWebPath = str2;
        this.callRecordFileId = str3;
        this.notes = str4;
        this.noteModifiedDateTime = localDateTime;
        this.f7333c = tableName;
        this.f7334d = callLogSyncStatus;
        this.f7335e = i11;
        this.f7336f = companyCode;
        this.f7337g = j10;
        this.callTypeInString = callType.getTypeName();
        Long lValueOf = null;
        if (enumC8993c != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(companyCode + "/" + simNumber + "/");
            C8800o c8800o = C8800o.f42459a;
            sb2.append(C8800o.m16213v(datetime, "yyyyMMdd"));
            sb2.append("/");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(simNumber);
            a1.m14318A(sb3, "_", number, "_");
            sb3.append(C8800o.m16213v(datetime, "yyyyMMdd"));
            sb3.append("_");
            sb3.append(C8800o.m16213v(datetime, "HHmmss"));
            sb2.append(sb3.toString());
            string = sb2.toString();
        } else {
            string = null;
        }
        this.filePath = string;
        if (enumC8993c != null) {
            lValueOf = Long.valueOf(str != null ? new File(str).length() : -1L);
        }
        this.fileSize = lValueOf;
    }

    /* renamed from: a */
    public final String m4619a() {
        return this.datetime;
    }

    /* renamed from: b */
    public final String m4620b() {
        return this.name;
    }

    /* renamed from: c */
    public final boolean m4621c() {
        return this.callRecordSyncStatus != null;
    }

    /* renamed from: d */
    public final boolean m4622d(C5107b c5107b) {
        return this.number.contentEquals(c5107b.f25010a) && this.datetime.contentEquals(c5107b.f25012c) && this.simNumber.contentEquals(c5107b.f25011b) && this.f7331a.getTypeName().contentEquals(c5107b.f25013d);
    }

    /* renamed from: e */
    public final boolean m4623e() {
        return this.notes != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncCallLog)) {
            return false;
        }
        SyncCallLog syncCallLog = (SyncCallLog) obj;
        return AbstractC4154l.m8918a(this.name, syncCallLog.name) && AbstractC4154l.m8918a(this.number, syncCallLog.number) && this.countryCode == syncCallLog.countryCode && this.f7331a == syncCallLog.f7331a && AbstractC4154l.m8918a(this.datetime, syncCallLog.datetime) && AbstractC4154l.m8918a(this.simNumber, syncCallLog.simNumber) && this.duration == syncCallLog.duration && this.callRecordSyncStatus == syncCallLog.callRecordSyncStatus && AbstractC4154l.m8918a(this.f7332b, syncCallLog.f7332b) && AbstractC4154l.m8918a(this.callRecordWebPath, syncCallLog.callRecordWebPath) && AbstractC4154l.m8918a(this.callRecordFileId, syncCallLog.callRecordFileId) && AbstractC4154l.m8918a(this.notes, syncCallLog.notes) && AbstractC4154l.m8918a(this.noteModifiedDateTime, syncCallLog.noteModifiedDateTime) && AbstractC4154l.m8918a(this.f7333c, syncCallLog.f7333c) && AbstractC4154l.m8918a(this.f7334d, syncCallLog.f7334d) && this.f7335e == syncCallLog.f7335e && AbstractC4154l.m8918a(this.f7336f, syncCallLog.f7336f) && this.f7337g == syncCallLog.f7337g;
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(AbstractC0030c.m113d(AbstractC0030c.m113d((this.f7331a.hashCode() + AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.name.hashCode() * 31, 31, this.number), 31)) * 31, 31, this.datetime), 31, this.simNumber), 31, this.duration);
        EnumC8993c enumC8993c = this.callRecordSyncStatus;
        int iHashCode = (iM4557d + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str = this.f7332b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callRecordWebPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.callRecordFileId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.notes;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        return Long.hashCode(this.f7337g) + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f7335e, (this.f7334d.hashCode() + AbstractC0030c.m113d((iHashCode5 + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31, 31, this.f7333c)) * 31, 31), 31, this.f7336f);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.number;
        int i10 = this.countryCode;
        String str3 = this.datetime;
        String str4 = this.simNumber;
        long j6 = this.duration;
        EnumC8993c enumC8993c = this.callRecordSyncStatus;
        String str5 = this.callRecordWebPath;
        String str6 = this.callRecordFileId;
        String str7 = this.notes;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("SyncCallLog(name=", str, ", number=", str2, ", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", callType=");
        sbM127r.append(this.f7331a);
        sbM127r.append(", datetime=");
        a1.m14319B(sbM127r, str3, ", simNumber=", str4, ", duration=");
        sbM127r.append(j6);
        sbM127r.append(", callRecordSyncStatus=");
        sbM127r.append(enumC8993c);
        a1.m14319B(sbM127r, ", callRecordCompressPath=", this.f7332b, ", callRecordWebPath=", str5);
        a1.m14319B(sbM127r, ", callRecordFileId=", str6, ", notes=", str7);
        sbM127r.append(", noteModifiedDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", tableName=");
        sbM127r.append(this.f7333c);
        sbM127r.append(", callLogSyncStatus=");
        sbM127r.append(this.f7334d);
        sbM127r.append(", id=");
        sbM127r.append(this.f7335e);
        a1.m14318A(sbM127r, ", companyCode=", this.f7336f, ", callLogId=");
        return AbstractC0030c.m116g(this.f7337g, ")", sbM127r);
    }

    public /* synthetic */ SyncCallLog(String str, String str2, int i10, EnumC8994d enumC8994d, String str3, String str4, long j6, EnumC8993c enumC8993c, String str5, String str6, String str7, String str8, LocalDateTime localDateTime, String str9, EnumSet enumSet, int i11, String str10, long j10, int i12, AbstractC4148f abstractC4148f) {
        this(str, str2, i10, enumC8994d, str3, str4, j6, (i12 & 128) != 0 ? null : enumC8993c, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? null : str7, (i12 & NewHope.SENDB_BYTES) != 0 ? null : str8, (i12 & 4096) != 0 ? null : localDateTime, str9, enumSet, i11, str10, j10);
    }
}
