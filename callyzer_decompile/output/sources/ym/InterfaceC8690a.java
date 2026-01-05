package ym;

import com.sun.mail.imap.IMAPStore;
import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest;
import com.websoptimization.callyzerbiz.data.model.request.FetchUpdatedCallNoteRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadCallLogDetailsRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadNoteSaveRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadNumberVerificationRequest;
import com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest;
import com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest;
import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import com.websoptimization.callyzerbiz.data.model.request.TotalDueLeadRequest;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadListRequest;
import com.websoptimization.callyzerbiz.data.model.request.message_template_request.FetchAllMessageTemplateRequest;
import com.websoptimization.callyzerbiz.data.model.request.note_template_request.FetchCallNoteTemplatesRequest;
import com.websoptimization.callyzerbiz.data.model.request.note_template_request.TemplateRequest;
import com.websoptimization.callyzerbiz.data.model.request.quick_call.ConnectExtensionRequest;
import com.websoptimization.callyzerbiz.data.model.request.quick_call.DisConnectExtensionRequest;
import com.websoptimization.callyzerbiz.data.model.request.quick_call.FetchActiveStatusRequest;
import com.websoptimization.callyzerbiz.data.model.response.AddDeviceResponse;
import com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse;
import com.websoptimization.callyzerbiz.data.model.response.AuthTokenResponse;
import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import com.websoptimization.callyzerbiz.data.model.response.BizSettingsResponse;
import com.websoptimization.callyzerbiz.data.model.response.CallLogDetailsData;
import com.websoptimization.callyzerbiz.data.model.response.CallLogNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse;
import com.websoptimization.callyzerbiz.data.model.response.CallRecordingSuggestedPathResponse;
import com.websoptimization.callyzerbiz.data.model.response.ExcludeNumber;
import com.websoptimization.callyzerbiz.data.model.response.FeatureStatusResponse;
import com.websoptimization.callyzerbiz.data.model.response.FetchUpdatedCallLogsNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.FetchUpdatedCallNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.IsLeadNumberResponse;
import com.websoptimization.callyzerbiz.data.model.response.LeadCallLogNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.LeadNoteSaveResponse;
import com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.LeadStatusResponse;
import com.websoptimization.callyzerbiz.data.model.response.Subscription;
import com.websoptimization.callyzerbiz.data.model.response.SyncResponse;
import com.websoptimization.callyzerbiz.data.model.response.call_note_templates_response.FetchAllTemplateResponse;
import com.websoptimization.callyzerbiz.data.model.response.call_note_templates_response.TemplateSyncResponse;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadByNumberResponse;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadCallHistory;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadCallHistoryCountDetails;
import com.websoptimization.callyzerbiz.data.model.response.lead.LeadResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.VerifiedExistingLeadNumbersResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.AllSubscriptionResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse;
import com.websoptimization.callyzerbiz.data.model.response.message_template.FetchAllMessageTemplateResponse;
import com.websoptimization.callyzerbiz.data.model.response.message_template.FetchMessageTemplateTagResponse;
import com.websoptimization.callyzerbiz.data.model.response.message_template.MessageTemplateResponse;
import com.websoptimization.callyzerbiz.data.model.response.quick_call.ConnectExtensionResponse;
import com.websoptimization.callyzerbiz.data.model.response.quick_call.FetchActiveStatusResponse;
import im.f1;
import java.util.List;
import java.util.Map;
import k00.InterfaceC3901a;
import k00.InterfaceC3903c;
import k00.InterfaceC3904d;
import k00.InterfaceC3905e;
import k00.InterfaceC3906f;
import k00.InterfaceC3910j;
import k00.InterfaceC3911k;
import k00.InterfaceC3915o;
import k00.InterfaceC3920t;
import k00.InterfaceC3925y;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.a */
/* loaded from: classes3.dex */
public interface InterfaceC8690a {
    @InterfaceC3915o("quickcall/connect")
    /* renamed from: A */
    Object m16047A(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a ConnectExtensionRequest connectExtensionRequest, InterfaceC7559c<? super f1<BaseResponse<ConnectExtensionResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("feature/subscription")
    /* renamed from: B */
    Object m16048B(@InterfaceC3910j Map<String, String> map, @InterfaceC3903c(IMAPStore.ID_NAME) String str, InterfaceC7559c<? super f1<BaseResponse<Subscription>>> interfaceC7559c);

    @InterfaceC3915o("callLog/sync")
    /* renamed from: C */
    Object m16049C(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a SyncCallLogRequest syncCallLogRequest, InterfaceC7559c<? super f1<BaseResponse<SyncResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/settings/save")
    /* renamed from: D */
    Object m16050D(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<String>>> interfaceC7559c);

    @InterfaceC3915o("quickcall/fetch/active")
    /* renamed from: E */
    Object m16051E(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a FetchActiveStatusRequest fetchActiveStatusRequest, InterfaceC7559c<? super f1<BaseResponse<List<FetchActiveStatusResponse>>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("callRecording/suggestPaths")
    /* renamed from: F */
    Object m16052F(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<CallRecordingSuggestedPathResponse>>> interfaceC7559c);

    @InterfaceC3915o("callRecording/availableSpace")
    /* renamed from: G */
    Object m16053G(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<Long>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/get/callLogs")
    /* renamed from: H */
    Object m16054H(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, Object> map2, InterfaceC7559c<? super f1<BaseResponse<List<CallLogDetailsData>>>> interfaceC7559c);

    @InterfaceC3915o("callLog/sync/note")
    /* renamed from: I */
    Object m16055I(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a NotesSyncRequest notesSyncRequest, InterfaceC7559c<? super f1<BaseResponse<List<CallLogNoteResponse>>>> interfaceC7559c);

    @InterfaceC3915o
    /* renamed from: J */
    Object m16056J(@InterfaceC3925y String str, @InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadNumberVerificationRequest leadNumberVerificationRequest, InterfaceC7559c<? super f1<BaseResponse<VerifiedExistingLeadNumbersResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/validateNumber")
    /* renamed from: K */
    Object m16057K(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3915o("employee/get/customer/employees")
    /* renamed from: L */
    Object m16058L(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<List<AllEmployeeResponse>>>> interfaceC7559c);

    @InterfaceC3915o("lead/notContacted")
    /* renamed from: M */
    Object m16059M(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadListRequest leadListRequest, InterfaceC7559c<? super f1<BaseResponse<LeadResponse>>> interfaceC7559c);

    @InterfaceC3915o("lead/getData")
    /* renamed from: N */
    Object m16060N(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadListRequest leadListRequest, InterfaceC7559c<? super f1<BaseResponse<LeadResponse>>> interfaceC7559c);

    @InterfaceC3915o("callnote/template/save")
    /* renamed from: O */
    Object m16061O(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a List<TemplateRequest> list, InterfaceC7559c<? super f1<BaseResponse<List<TemplateSyncResponse>>>> interfaceC7559c);

    @InterfaceC3906f("app/getSettings")
    /* renamed from: P */
    Object m16062P(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<BizSettingsResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/updateFCM")
    /* renamed from: Q */
    Object m16063Q(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<String>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("lead/callLogs/getActive")
    /* renamed from: R */
    Object m16064R(@InterfaceC3910j Map<String, String> map, @InterfaceC3903c("leadId") String str, @InterfaceC3903c("pageNo") int i10, @InterfaceC3903c("pageSize") int i11, InterfaceC7559c<? super f1<BaseResponse<List<LeadCallHistory>>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("callLog/getByNotesUpdatedAtWeb")
    /* renamed from: S */
    Object m16065S(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, Object> map2, InterfaceC7559c<? super f1<BaseResponse<List<FetchUpdatedCallLogsNoteResponse>>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3911k({"Authorization: Basic Y2FsbHl6ZXItY2xpZW50OmNhbGx5emVyLXNlY3JldA=="})
    @InterfaceC3915o("oauth/token")
    /* renamed from: T */
    Object m16066T(@InterfaceC3903c("username") String str, @InterfaceC3903c("password") String str2, @InterfaceC3903c("grant_type") String str3, InterfaceC7559c<? super f1<AuthTokenResponse>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("lead/isDeleted")
    /* renamed from: U */
    Object m16067U(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3915o("callLog/getDetails")
    /* renamed from: a */
    Object m16068a(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a FetchUpdatedCallNoteRequest fetchUpdatedCallNoteRequest, InterfaceC7559c<? super f1<BaseResponse<FetchUpdatedCallNoteResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/register/sendOTP")
    /* renamed from: b */
    Object m16069b(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<String>>> interfaceC7559c);

    @InterfaceC3915o("lead/saveNote")
    /* renamed from: c */
    Object m16070c(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadNoteSaveRequest leadNoteSaveRequest, InterfaceC7559c<? super f1<BaseResponse<LeadNoteSaveResponse>>> interfaceC7559c);

    @InterfaceC3915o("messagetemplate/fetchAll")
    /* renamed from: d */
    Object m16071d(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a FetchAllMessageTemplateRequest fetchAllMessageTemplateRequest, InterfaceC7559c<? super f1<BaseResponse<FetchAllMessageTemplateResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("lead/recent/notes")
    /* renamed from: e */
    Object m16072e(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<List<LeadRecentNoteResponse>>>> interfaceC7559c);

    @InterfaceC3915o("quickcall/disconnect")
    /* renamed from: f */
    Object m16073f(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a DisConnectExtensionRequest disConnectExtensionRequest, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3915o("lead/save")
    /* renamed from: g */
    Object m16074g(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a SaveLeadRequest saveLeadRequest, InterfaceC7559c<? super f1<BaseResponse<String>>> interfaceC7559c);

    @InterfaceC3915o("lead/isAssignedToMe")
    /* renamed from: h */
    Object m16075h(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadNumberVerificationRequest leadNumberVerificationRequest, InterfaceC7559c<? super f1<BaseResponse<IsLeadNumberResponse>>> interfaceC7559c);

    @InterfaceC3906f("feature/getStatus")
    /* renamed from: i */
    Object m16076i(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<FeatureStatusResponse>>> interfaceC7559c);

    @InterfaceC3906f("messagetemplate/fetch")
    /* renamed from: j */
    Object m16077j(@InterfaceC3910j Map<String, String> map, @InterfaceC3920t("messageTemplateId") String str, InterfaceC7559c<? super f1<BaseResponse<MessageTemplateResponse>>> interfaceC7559c);

    @InterfaceC3906f("messagetemplate/tag/fetchAll")
    /* renamed from: k */
    Object m16078k(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<FetchMessageTemplateTagResponse>>> interfaceC7559c);

    @InterfaceC3915o("employee/subscriptionDetail")
    /* renamed from: l */
    Object m16079l(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<AllSubscriptionResponse>>> interfaceC7559c);

    @InterfaceC3915o("lead/form/getDynamicComponentDetails")
    /* renamed from: m */
    Object m16080m(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<LeadFormResponse>>> interfaceC7559c);

    @InterfaceC3915o("callnote/template/fetchAll")
    /* renamed from: n */
    Object m16081n(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a FetchCallNoteTemplatesRequest fetchCallNoteTemplatesRequest, InterfaceC7559c<? super f1<BaseResponse<FetchAllTemplateResponse>>> interfaceC7559c);

    @InterfaceC3915o("callRecording/sync")
    /* renamed from: o */
    Object m16082o(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a CallRecordingSyncRequest callRecordingSyncRequest, InterfaceC7559c<? super f1<BaseResponse<List<CallRecordingResponse>>>> interfaceC7559c);

    @InterfaceC3915o("employee/customer/excludeList")
    /* renamed from: p */
    Object m16083p(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<List<ExcludeNumber>>>> interfaceC7559c);

    @InterfaceC3915o("lead/note")
    /* renamed from: q */
    Object m16084q(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a LeadCallLogDetailsRequest leadCallLogDetailsRequest, InterfaceC7559c<? super f1<BaseResponse<LeadCallLogNoteResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("lead/getByNumber")
    /* renamed from: r */
    Object m16085r(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<LeadByNumberResponse>>> interfaceC7559c);

    @InterfaceC3915o("callnote/template/delete")
    /* renamed from: s */
    Object m16086s(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a List<String> list, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("lead/callLogs/getSummary")
    /* renamed from: t */
    Object m16087t(@InterfaceC3910j Map<String, String> map, @InterfaceC3903c("leadId") String str, InterfaceC7559c<? super f1<BaseResponse<LeadCallHistoryCountDetails>>> interfaceC7559c);

    @InterfaceC3915o("lead/allTags")
    /* renamed from: u */
    Object m16088u(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<List<String>>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("employee/register/verifyOTP")
    /* renamed from: v */
    Object m16089v(@InterfaceC3910j Map<String, String> map, @InterfaceC3904d Map<String, String> map2, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3915o("employee/register")
    /* renamed from: w */
    Object m16090w(@InterfaceC3901a AddDeviceRequest addDeviceRequest, InterfaceC7559c<? super f1<BaseResponse<AddDeviceResponse>>> interfaceC7559c);

    @InterfaceC3915o("lead/callBack/totalDue")
    /* renamed from: x */
    Object m16091x(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a TotalDueLeadRequest totalDueLeadRequest, InterfaceC7559c<? super f1<BaseResponse<Integer>>> interfaceC7559c);

    @InterfaceC3915o("lead/restore")
    /* renamed from: y */
    Object m16092y(@InterfaceC3910j Map<String, String> map, @InterfaceC3901a SaveLeadRequest saveLeadRequest, InterfaceC7559c<? super f1<BaseResponse<String>>> interfaceC7559c);

    @InterfaceC3915o("lead/status")
    /* renamed from: z */
    Object m16093z(@InterfaceC3910j Map<String, String> map, InterfaceC7559c<? super f1<BaseResponse<List<LeadStatusResponse>>>> interfaceC7559c);
}
