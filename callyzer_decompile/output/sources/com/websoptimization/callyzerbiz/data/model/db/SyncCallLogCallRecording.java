package com.websoptimization.callyzerbiz.data.model.db;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import nm.C5107b;
import p020v.a1;
import yv.C8800o;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncCallLogCallRecording {

    /* renamed from: a */
    public final EnumC8994d f7338a;

    /* renamed from: b */
    public final String f7339b;

    /* renamed from: c */
    public final int f7340c;

    @InterfaceC4485b("syncStatus")
    private final EnumC8993c callRecordingSyncStatus;

    @InterfaceC4485b("callType")
    private final String callTypeInString;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    /* renamed from: d */
    public final String f7341d;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC4485b("bucketFileId")
    private final String fileId;

    @InterfaceC4485b("filePath")
    private final String filePath;

    @InterfaceC4485b("fileSize")
    private Long fileSize;

    @InterfaceC4485b("toNumber")
    private final String number;

    @InterfaceC4485b("fromNumber")
    private final String simNumber;

    @InterfaceC4485b("bucketUrl")
    private final String webPath;

    public SyncCallLogCallRecording(String number, String simNumber, int i10, EnumC8994d callType, String dateTime, long j6, EnumC8993c enumC8993c, String str, String str2, String str3, int i11, String companyCode) {
        String string;
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(companyCode, "companyCode");
        this.number = number;
        this.simNumber = simNumber;
        this.countryCode = i10;
        this.f7338a = callType;
        this.dateTime = dateTime;
        this.duration = j6;
        this.callRecordingSyncStatus = enumC8993c;
        this.f7339b = str;
        this.webPath = str2;
        this.fileId = str3;
        this.f7340c = i11;
        this.f7341d = companyCode;
        this.callTypeInString = callType.getTypeName();
        EnumC8993c enumC8993c2 = EnumC8993c.SUCCESS;
        Long lValueOf = null;
        if (enumC8993c == enumC8993c2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(companyCode + "/" + simNumber + "/");
            C8800o c8800o = C8800o.f42459a;
            sb2.append(C8800o.m16213v(dateTime, "yyyyMMdd"));
            sb2.append("/");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(simNumber);
            a1.m14318A(sb3, "_", number, "_");
            sb3.append(C8800o.m16213v(dateTime, "yyyyMMdd"));
            sb3.append("_");
            sb3.append(C8800o.m16213v(dateTime, "HHmmss"));
            sb3.append(".mp3");
            sb2.append(sb3.toString());
            string = sb2.toString();
        } else {
            string = null;
        }
        this.filePath = string;
        if (enumC8993c == enumC8993c2) {
            lValueOf = Long.valueOf(str != null ? new File(str).length() : -1L);
        }
        this.fileSize = lValueOf;
    }

    /* renamed from: a */
    public final EnumC8993c m4624a() {
        return this.callRecordingSyncStatus;
    }

    /* renamed from: b */
    public final String m4625b() {
        return this.dateTime;
    }

    /* renamed from: c */
    public final Long m4626c() {
        return this.fileSize;
    }

    /* renamed from: d */
    public final String m4627d() {
        return this.webPath;
    }

    /* renamed from: e */
    public final boolean m4628e(C5107b c5107b) {
        return this.number.contentEquals(c5107b.f25010a) && this.dateTime.contentEquals(c5107b.f25012c) && this.callTypeInString.contentEquals(c5107b.f25013d) && this.simNumber.contentEquals(c5107b.f25011b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncCallLogCallRecording)) {
            return false;
        }
        SyncCallLogCallRecording syncCallLogCallRecording = (SyncCallLogCallRecording) obj;
        return AbstractC4154l.m8918a(this.number, syncCallLogCallRecording.number) && AbstractC4154l.m8918a(this.simNumber, syncCallLogCallRecording.simNumber) && this.countryCode == syncCallLogCallRecording.countryCode && this.f7338a == syncCallLogCallRecording.f7338a && AbstractC4154l.m8918a(this.dateTime, syncCallLogCallRecording.dateTime) && this.duration == syncCallLogCallRecording.duration && this.callRecordingSyncStatus == syncCallLogCallRecording.callRecordingSyncStatus && AbstractC4154l.m8918a(this.f7339b, syncCallLogCallRecording.f7339b) && AbstractC4154l.m8918a(this.webPath, syncCallLogCallRecording.webPath) && AbstractC4154l.m8918a(this.fileId, syncCallLogCallRecording.fileId) && this.f7340c == syncCallLogCallRecording.f7340c && AbstractC4154l.m8918a(this.f7341d, syncCallLogCallRecording.f7341d);
    }

    /* renamed from: f */
    public final void m4629f(long j6) {
        this.fileSize = Long.valueOf(j6);
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(AbstractC0030c.m113d((this.f7338a.hashCode() + AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.number.hashCode() * 31, 31, this.simNumber), 31)) * 31, 31, this.dateTime), 31, this.duration);
        EnumC8993c enumC8993c = this.callRecordingSyncStatus;
        int iHashCode = (iM4557d + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str = this.f7339b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileId;
        return this.f7341d.hashCode() + AbstractC1452a.m4556c(this.f7340c, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.simNumber;
        int i10 = this.countryCode;
        String str3 = this.dateTime;
        long j6 = this.duration;
        EnumC8993c enumC8993c = this.callRecordingSyncStatus;
        String str4 = this.webPath;
        String str5 = this.fileId;
        StringBuilder sbM127r = AbstractC0030c.m127r("SyncCallLogCallRecording(number=", str, ", simNumber=", str2, ", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", callType=");
        sbM127r.append(this.f7338a);
        sbM127r.append(", dateTime=");
        sbM127r.append(str3);
        sbM127r.append(", duration=");
        sbM127r.append(j6);
        sbM127r.append(", callRecordingSyncStatus=");
        sbM127r.append(enumC8993c);
        sbM127r.append(", compressPath=");
        sbM127r.append(this.f7339b);
        a1.m14319B(sbM127r, ", webPath=", str4, ", fileId=", str5);
        sbM127r.append(", idOfCallLog=");
        sbM127r.append(this.f7340c);
        sbM127r.append(", companyCode=");
        sbM127r.append(this.f7341d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
