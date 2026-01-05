package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchUpdatedCallNoteResponse {

    @InterfaceC4485b("bucketUrl")
    private final String callRecordBucketUrl;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("isLeadCallLog")
    private final boolean isLeadCallLog;

    @InterfaceC4485b("noteDetails")
    private final NoteDetails noteDetails;

    @InterfaceC4485b("syncStatus")
    private final EnumC8993c syncStatus;

    @InterfaceC4485b("toName")
    private final String toName;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public FetchUpdatedCallNoteResponse(String toName, String callType, String fromNumber, String toNumber, String dateTime, int i10, int i11, EnumC8993c enumC8993c, String str, NoteDetails noteDetails, boolean z6) {
        AbstractC4154l.m8923f(toName, "toName");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(noteDetails, "noteDetails");
        this.toName = toName;
        this.callType = callType;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.dateTime = dateTime;
        this.duration = i10;
        this.countryCode = i11;
        this.syncStatus = enumC8993c;
        this.callRecordBucketUrl = str;
        this.noteDetails = noteDetails;
        this.isLeadCallLog = z6;
    }

    /* renamed from: a */
    public final String m4790a() {
        return this.callType;
    }

    /* renamed from: b */
    public final int m4791b() {
        return this.countryCode;
    }

    /* renamed from: c */
    public final String m4792c() {
        return this.dateTime;
    }

    /* renamed from: d */
    public final NoteDetails m4793d() {
        return this.noteDetails;
    }

    /* renamed from: e */
    public final String m4794e() {
        return this.toName;
    }

    /* renamed from: f */
    public final String m4795f() {
        return this.toNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FetchUpdatedCallNoteResponse(String str, String str2, String str3, String str4, String str5, int i10, int i11, EnumC8993c enumC8993c, String str6, NoteDetails noteDetails, boolean z6, int i12, AbstractC4148f abstractC4148f) {
        boolean z10;
        NoteDetails noteDetails2;
        String str7;
        enumC8993c = (i12 & 128) != 0 ? null : enumC8993c;
        if ((i12 & 256) != 0) {
            z10 = z6;
            noteDetails2 = noteDetails;
            str7 = null;
        } else {
            z10 = z6;
            noteDetails2 = noteDetails;
            str7 = str6;
        }
        this(str, str2, str3, str4, str5, i10, i11, enumC8993c, str7, noteDetails2, z10);
    }
}
