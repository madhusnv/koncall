package com.websoptimization.callyzerbiz.data.model.response;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AppSettings {

    @InterfaceC4485b("addonTime")
    private final String addonTime;

    @InterfaceC4485b("emailsForTwoStepRegistration")
    private final List<String> emailsForTwoStepRegistration;

    @InterfaceC4485b("isDownloadReport")
    private final boolean isDownloadReport;

    @InterfaceC4485b("isEmployeeCodeMandatory")
    private final boolean isEmployeeCodeMandatory;

    @InterfaceC4485b("isLockRecordingPath")
    private final Boolean isRecordingFolderLock;

    @InterfaceC4485b("isSyncLeadOnly")
    private final boolean isSyncLeadOnly;

    @InterfaceC4485b("isTwoFactorRegistration")
    private final boolean isTwoFactorRegistration;

    @InterfaceC4485b("processTime")
    private final String processTime;

    public AppSettings(boolean z6, boolean z10, boolean z11, List<String> list, String str, String str2, boolean z12, Boolean bool) {
        this.isDownloadReport = z6;
        this.isEmployeeCodeMandatory = z10;
        this.isTwoFactorRegistration = z11;
        this.emailsForTwoStepRegistration = list;
        this.processTime = str;
        this.addonTime = str2;
        this.isSyncLeadOnly = z12;
        this.isRecordingFolderLock = bool;
    }

    /* renamed from: a */
    public final String m4722a() {
        return this.addonTime;
    }

    /* renamed from: b */
    public final List m4723b() {
        return this.emailsForTwoStepRegistration;
    }

    /* renamed from: c */
    public final String m4724c() {
        return this.processTime;
    }

    /* renamed from: d */
    public final boolean m4725d() {
        return this.isDownloadReport;
    }

    /* renamed from: e */
    public final boolean m4726e() {
        return this.isEmployeeCodeMandatory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSettings)) {
            return false;
        }
        AppSettings appSettings = (AppSettings) obj;
        return this.isDownloadReport == appSettings.isDownloadReport && this.isEmployeeCodeMandatory == appSettings.isEmployeeCodeMandatory && this.isTwoFactorRegistration == appSettings.isTwoFactorRegistration && AbstractC4154l.m8918a(this.emailsForTwoStepRegistration, appSettings.emailsForTwoStepRegistration) && AbstractC4154l.m8918a(this.processTime, appSettings.processTime) && AbstractC4154l.m8918a(this.addonTime, appSettings.addonTime) && this.isSyncLeadOnly == appSettings.isSyncLeadOnly && AbstractC4154l.m8918a(this.isRecordingFolderLock, appSettings.isRecordingFolderLock);
    }

    /* renamed from: f */
    public final Boolean m4727f() {
        return this.isRecordingFolderLock;
    }

    /* renamed from: g */
    public final boolean m4728g() {
        return this.isTwoFactorRegistration;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(Boolean.hashCode(this.isDownloadReport) * 31, 31, this.isEmployeeCodeMandatory), 31, this.isTwoFactorRegistration);
        List<String> list = this.emailsForTwoStepRegistration;
        int iHashCode = (iM4558e + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.processTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addonTime;
        int iM4558e2 = AbstractC1452a.m4558e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSyncLeadOnly);
        Boolean bool = this.isRecordingFolderLock;
        return iM4558e2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        boolean z6 = this.isDownloadReport;
        boolean z10 = this.isEmployeeCodeMandatory;
        boolean z11 = this.isTwoFactorRegistration;
        List<String> list = this.emailsForTwoStepRegistration;
        String str = this.processTime;
        String str2 = this.addonTime;
        boolean z12 = this.isSyncLeadOnly;
        Boolean bool = this.isRecordingFolderLock;
        StringBuilder sb2 = new StringBuilder("AppSettings(isDownloadReport=");
        sb2.append(z6);
        sb2.append(", isEmployeeCodeMandatory=");
        sb2.append(z10);
        sb2.append(", isTwoFactorRegistration=");
        sb2.append(z11);
        sb2.append(", emailsForTwoStepRegistration=");
        sb2.append(list);
        sb2.append(", processTime=");
        a1.m14319B(sb2, str, ", addonTime=", str2, ", isSyncLeadOnly=");
        sb2.append(z12);
        sb2.append(", isRecordingFolderLock=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }
}
