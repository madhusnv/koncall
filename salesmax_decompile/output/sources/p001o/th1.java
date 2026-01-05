package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.BusinessSummary;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsAddress;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.Tasks;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class th1 {

    /* renamed from: o.th1$a */
    public static final class C17110a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f47116a;

        public C17110a(View view) {
            this.f47116a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            sq8.m48649h(animator, "p0");
            this.f47116a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sq8.m48649h(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            sq8.m48649h(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            sq8.m48649h(animator, "p0");
            this.f47116a.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static final String m49850b(String str) {
        sq8.m48649h(str, "<this>");
        List listD0 = f9g.D0(str, new String[]{" "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listD0, 10));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(m49851c((String) it.next()));
        }
        return kh3.p0(arrayList, " ", null, null, 0, null, null, 62, null);
    }

    /* renamed from: c */
    public static final String m49851c(String str) {
        String strValueOf;
        sq8.m48649h(str, "<this>");
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            strValueOf = ph2.m43654d(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* renamed from: d */
    public static final void m49852d(View view, boolean z) {
        sq8.m48649h(view, "<this>");
        if (z) {
            view.setAlpha(1.0f);
            view.setClickable(true);
            view.setFocusableInTouchMode(true);
            view.setFocusable(true);
            view.setEnabled(true);
            return;
        }
        view.setAlpha(0.5f);
        view.setClickable(false);
        view.setFocusableInTouchMode(false);
        view.setFocusable(false);
        view.setEnabled(false);
    }

    /* renamed from: e */
    public static final String m49853e(String str) {
        sq8.m48649h(str, "<this>");
        return f9g.Z0(m49850b(e9g.m24593G(str, "_", " ", false, 4, null))).toString();
    }

    /* renamed from: f */
    public static final String m49854f(String str) {
        sq8.m48649h(str, "<this>");
        return f9g.Z0(m49851c(e9g.m24593G(str, "_", " ", false, 4, null))).toString();
    }

    /* renamed from: g */
    public static final String m49855g(String str) {
        sq8.m48649h(str, "name");
        if (f9g.D0(str, new String[]{"\\w+"}, false, 0, 6, null).size() <= 1) {
            return str;
        }
        String strSubstring = str.substring(0, f9g.g0(str, TokenParser.SP, 0, false, 6, null));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h */
    public static final String m49856h() {
        Calendar calendar = Calendar.getInstance();
        sq8.m48648g(calendar, "getInstance(...)");
        int i = calendar.get(11);
        if (i >= 0 && i < 12) {
            return "Good Morning";
        }
        if (12 <= i && i < 16) {
            return "Good Afternoon";
        }
        return 16 <= i && i < 21 ? "Good Evening" : "";
    }

    /* renamed from: i */
    public static final String m49857i(String str) {
        sq8.m48649h(str, "name");
        if (f9g.D0(str, new String[]{"\\w+"}, false, 0, 6, null).size() <= 1) {
            return "";
        }
        String strSubstring = str.substring(f9g.h0(str, " ", 0, false, 6, null) + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: j */
    public static final void m49858j(View view) {
        sq8.m48649h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    public static final String m49859k(String str) {
        sq8.m48649h(str, "<this>");
        String upperCase = e9g.m24593G(f9g.Z0(str).toString(), " ", "_", false, 4, null).toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.lang.String, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.reflect.Method] */
    /* renamed from: l */
    public static final BusinessSummary m49860l(BusinessInfo businessInfo, BusinessSummary businessSummary) {
        sq8.m48649h(businessInfo, "<this>");
        int i = 1;
        BusinessSummary businessSummary2 = businessSummary;
        if (businessSummary == null) {
            businessSummary2 = new BusinessSummary(null, i, false ? 1 : 0);
        }
        String id = businessInfo.getId();
        if (!(id == null || f9g.d0(id))) {
            businessSummary2.setCompanyId(businessInfo.getId());
        }
        ?? FindMethod = businessInfo.findMethod(1, 1, 1);
        if (!(FindMethod == 0 || f9g.d0(FindMethod))) {
            ?? FindMethod2 = businessInfo.findMethod(1, 1, 1);
            sq8.m48646e(FindMethod2);
            businessSummary2.setCompanyName(FindMethod2);
        }
        String priority = businessInfo.getPriority();
        if (!(priority == null || f9g.d0(priority))) {
            businessSummary2.setPriority(businessInfo.getPriority());
        }
        String industry = businessInfo.getIndustry();
        if (!(industry == null || f9g.d0(industry))) {
            businessSummary2.setCompanyId(businessInfo.getIndustry());
        }
        String website = businessInfo.getWebsite();
        if (website != null && !f9g.d0(website)) {
            i = 0;
        }
        if (i == 0) {
            businessSummary2.setWebsite(businessInfo.getWebsite());
        }
        return businessSummary2;
    }

    /* renamed from: m */
    public static /* synthetic */ BusinessSummary m49861m(BusinessInfo businessInfo, BusinessSummary businessSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            businessSummary = null;
        }
        return m49860l(businessInfo, businessSummary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v189 */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v230 */
    /* JADX WARN: Type inference failed for: r0v231 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* renamed from: n */
    public static final EngagementSummary m49862n(Tasks tasks, EngagementSummary engagementSummary) {
        sq8.m48649h(tasks, "<this>");
        Engagement engagement = null;
        ?? r0 = 0;
        int i = 1;
        if (engagementSummary == null) {
            engagementSummary = new EngagementSummary(engagement, i, r0 == true ? 1 : 0);
        }
        String id = tasks.getId();
        if ((id == null || f9g.d0(id)) == false) {
            String id2 = tasks.getId();
            sq8.m48646e(id2);
            engagementSummary.setId(id2);
        }
        if (!f9g.d0(tasks.getTaskStatus())) {
            engagementSummary.setTaskStatus(tasks.getTaskStatus());
        }
        if (!f9g.d0(tasks.getClientID())) {
            engagementSummary.setContact(tasks.getClientID());
        }
        if (!f9g.d0(tasks.getTaskAssignedToID())) {
            engagementSummary.setOwner(tasks.getTaskAssignedToID());
        }
        if (!f9g.d0(tasks.getTaskTitle())) {
            engagementSummary.setTaskHeadings(tasks.getTaskTitle());
        }
        if (!f9g.d0(tasks.getNoteHeading())) {
            engagementSummary.setNoteHeading(tasks.getNoteHeading());
        }
        if (!f9g.d0(tasks.getTaskContent())) {
            engagementSummary.setTaskInputNotes(tasks.getTaskContent());
        }
        if (!f9g.d0(tasks.getTaskPriority())) {
            engagementSummary.setPriority(m49859k(tasks.getTaskPriority()));
        }
        if (!f9g.d0(tasks.getNoteAdditionMethod())) {
            engagementSummary.setNoteAdditionMethod(tasks.getNoteAdditionMethod());
        }
        if (!f9g.d0(tasks.getTaskStatus())) {
            engagementSummary.setTaskStatus(m49859k(tasks.getTaskStatus()));
        }
        if (!f9g.d0(tasks.getTaskCompletionNote())) {
            engagementSummary.setTaskCompletionNote(tasks.getTaskCompletionNote());
        }
        if (!f9g.d0(tasks.getTaskCompletionType())) {
            engagementSummary.setTaskCompletionType(tasks.getTaskCompletionType());
        }
        if (tasks.getTaskDateTimeInMillis() > 0) {
            engagementSummary.setDueDateTime(tasks.getTaskDateTimeInMillis());
        }
        if (tasks.getNextTaskDateTimeInMillis() > 0) {
            engagementSummary.setNextTaskDueDateTime(tasks.getNextTaskDateTimeInMillis());
        }
        if ((tasks.getTaskLat() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == false) {
            LeadsAddress leadsAddress = new LeadsAddress(null, 1, null);
            leadsAddress.setLatitude(String.valueOf(tasks.getTaskLat()));
            leadsAddress.setLongitude(String.valueOf(tasks.getTaskLng()));
            leadsAddress.setRawAddressText(tasks.getTaskLocation());
            engagementSummary.setTaskLocation(leadsAddress);
        }
        if (!f9g.d0(tasks.getTaskContactMode())) {
            engagementSummary.setTaskActivityType(m49859k(tasks.getTaskContactMode()));
        }
        if (!f9g.d0(tasks.getTaskTag())) {
            engagementSummary.setTaskType(m49859k(tasks.getTaskTag()));
        }
        if (tasks.getAssignmentStatus() != null) {
            String assignmentStatus = tasks.getAssignmentStatus();
            sq8.m48646e(assignmentStatus);
            engagementSummary.setAssignmentStatus(assignmentStatus);
        }
        if (tasks.getPrimaryTeamId() != null) {
            String primaryTeamId = tasks.getPrimaryTeamId();
            sq8.m48646e(primaryTeamId);
            engagementSummary.setTeamId(primaryTeamId);
        }
        String parentEngagementId = tasks.getParentEngagementId();
        if ((parentEngagementId == null || f9g.d0(parentEngagementId)) == false) {
            String parentEngagementId2 = tasks.getParentEngagementId();
            sq8.m48646e(parentEngagementId2);
            engagementSummary.setParentEngagement(parentEngagementId2);
        }
        if (!tasks.getFileList().isEmpty()) {
            engagementSummary.setLinkedFiles(tasks.getFileList(), tasks.getOldFileList());
        } else {
            engagementSummary.setLinkedFiles(ch3.m21246k(), tasks.getOldFileList());
        }
        if (!StringUtils.isBlank(tasks.getTaskEngagementType())) {
            engagementSummary.setEngagementType(tasks.getTaskEngagementType());
        }
        if (sq8.m48644c(tasks.getTaskEngagementType(), "CALL")) {
            if (tasks.getCallTimeInMillis() > 0) {
                engagementSummary.setCallTime(tasks.getCallTimeInMillis());
            }
            if (tasks.getCallDurationInMillis() >= 0) {
                engagementSummary.setCallDuration((int) tasks.getCallDurationInMillis());
            }
            if (tasks.getCallStartTime() > 0) {
                engagementSummary.setCallStartTime(tasks.getCallStartTime());
            }
            if (tasks.getCallEndTime() > 0) {
                engagementSummary.setCallEndTime(tasks.getCallEndTime());
            }
            if (!f9g.d0(tasks.getCallDirection())) {
                engagementSummary.setCallDirection(m49859k(tasks.getCallDirection()));
            }
            if (!f9g.d0(tasks.getCallConnectionStatus())) {
                engagementSummary.setCallConnectStatus(m49859k(tasks.getCallConnectionStatus()));
            }
            if (!f9g.d0(tasks.getCallOutcome())) {
                engagementSummary.setCallOutcome(m49859k(tasks.getCallOutcome()));
            }
            if (!f9g.d0(tasks.getCallOutcomeNature())) {
                engagementSummary.setCallOutcomeNature(tasks.getCallOutcomeNature());
            }
            if (!f9g.d0(tasks.getCallNextStep())) {
                engagementSummary.setNextTaskType(m49859k(tasks.getCallNextStep()));
            }
            if (!f9g.d0(tasks.getCallInputNotes())) {
                engagementSummary.setBody(tasks.getCallInputNotes());
            }
            String callPlacementId = tasks.getCallPlacementId();
            if ((callPlacementId == null || f9g.d0(callPlacementId)) == false) {
                engagementSummary.setEngagementPlacementId(tasks.getCallPlacementId());
            }
            String clientContactNumber = tasks.getClientContactNumber();
            if ((clientContactNumber == null || f9g.d0(clientContactNumber)) == false) {
                engagementSummary.setExternalNumber(tasks.getClientContactNumber());
            }
            String userNumber = tasks.getUserNumber();
            if ((userNumber == null || f9g.d0(userNumber)) == false) {
                String userNumber2 = tasks.getUserNumber();
                sq8.m48646e(userNumber2);
                engagementSummary.setUserNumber(userNumber2);
            }
            String deviceId = tasks.getDeviceId();
            if ((deviceId == null || f9g.d0(deviceId)) == false) {
                String deviceId2 = tasks.getDeviceId();
                sq8.m48646e(deviceId2);
                engagementSummary.setDeviceId(deviceId2);
            }
            String callRecordingUrl = tasks.getCallRecordingUrl();
            if ((callRecordingUrl == null || callRecordingUrl.length() == 0) == false) {
                engagementSummary.setCallRecordingUrl(tasks.getCallRecordingUrl());
            }
            String cloudProvider = tasks.getCloudProvider();
            if ((cloudProvider == null || cloudProvider.length() == 0) == false) {
                engagementSummary.setCloudProvider(tasks.getCloudProvider());
            }
            String cloudProviderNumber = tasks.getCloudProviderNumber();
            if ((cloudProviderNumber == null || cloudProviderNumber.length() == 0) == false) {
                engagementSummary.setCloudProviderNumber(tasks.getCloudProviderNumber());
            }
            if (tasks.getTotalCallDuration() != null) {
                Long totalCallDuration = tasks.getTotalCallDuration();
                engagementSummary.setTotalCallDuration(totalCallDuration != null ? (int) totalCallDuration.longValue() : 0);
            }
            String callType = tasks.getCallType();
            if ((callType == null || callType.length() == 0) == false) {
                engagementSummary.setCallType(tasks.getCallType());
            }
            String hangupReason = tasks.getHangupReason();
            if ((hangupReason == null || hangupReason.length() == 0) == false) {
                engagementSummary.setHangupReason(tasks.getHangupReason());
            }
            String phoneCallLogId = tasks.getPhoneCallLogId();
            if ((phoneCallLogId == null || phoneCallLogId.length() == 0) == false) {
                engagementSummary.setPhoneCallLogId(tasks.getPhoneCallLogId());
            }
            engagementSummary.setInflightCall(tasks.getInFlightCall());
        } else if (sq8.m48644c(tasks.getTaskEngagementType(), "VISIT")) {
            if (tasks.getVisitDateInMillis() > 0) {
                engagementSummary.setVisitDate(tasks.getVisitDateInMillis());
            }
            if (!f9g.d0(tasks.getVisitNotes())) {
                engagementSummary.setVisitNote(tasks.getVisitNotes());
            }
            if (!f9g.d0(tasks.getVisitOutcome())) {
                engagementSummary.setVisitOutcome(m49859k(tasks.getVisitOutcome()));
            }
            if (!f9g.d0(tasks.getVisitOutcomeNature())) {
                engagementSummary.setVisitOutcomeNature(tasks.getVisitOutcomeNature());
            }
            if (!f9g.d0(tasks.getVisitNextStep())) {
                engagementSummary.setNextTaskType(m49859k(tasks.getVisitNextStep()));
            }
        } else if (sq8.m48644c(tasks.getTaskEngagementType(), "VIDEO")) {
            if (!f9g.d0(tasks.getBody())) {
                engagementSummary.setBody(tasks.getBody());
            }
            String videoCallPlatform = tasks.getVideoCallPlatform();
            if ((videoCallPlatform == null || f9g.d0(videoCallPlatform)) == false) {
                String videoCallPlatform2 = tasks.getVideoCallPlatform();
                sq8.m48646e(videoCallPlatform2);
                engagementSummary.setVideoCallPlatform(videoCallPlatform2);
            }
            String videoCallLink = tasks.getVideoCallLink();
            if ((videoCallLink == null || f9g.d0(videoCallLink)) == false) {
                String videoCallLink2 = tasks.getVideoCallLink();
                sq8.m48646e(videoCallLink2);
                engagementSummary.setVideoCallLink(videoCallLink2);
            }
            if (!f9g.d0(tasks.getVideoCallMetadata())) {
                String videoCallMetadata = tasks.getVideoCallMetadata();
                sq8.m48646e(videoCallMetadata);
                engagementSummary.setVideoCallMetadata(videoCallMetadata);
            }
            String videoCallOutcome = tasks.getVideoCallOutcome();
            if ((videoCallOutcome == null || f9g.d0(videoCallOutcome)) == false) {
                String videoCallOutcome2 = tasks.getVideoCallOutcome();
                sq8.m48646e(videoCallOutcome2);
                engagementSummary.setVideoCallOutcome(videoCallOutcome2);
            }
        } else if (sq8.m48644c(tasks.getTaskEngagementType(), "NOTE")) {
            if (!f9g.d0(tasks.getBody())) {
                engagementSummary.setBody(tasks.getBody());
            }
            if (!f9g.d0(tasks.getNoteNextStep())) {
                engagementSummary.setNextTaskType(m49859k(tasks.getNoteNextStep()));
            }
        } else if (sq8.m48644c(tasks.getTaskEngagementType(), "TASK") && (!f9g.d0(tasks.getTaskNextStep()))) {
            engagementSummary.setNextTaskType(m49859k(tasks.getTaskNextStep()));
        }
        String engagementSourceType = tasks.getEngagementSourceType();
        if ((engagementSourceType == null || f9g.d0(engagementSourceType)) == false) {
            String engagementSourceType2 = tasks.getEngagementSourceType();
            sq8.m48646e(engagementSourceType2);
            engagementSummary.setEngagementSourceType(engagementSourceType2);
        }
        String engagementSource = tasks.getEngagementSource();
        if ((engagementSource == null || f9g.d0(engagementSource)) == false) {
            String engagementSource2 = tasks.getEngagementSource();
            sq8.m48646e(engagementSource2);
            engagementSummary.setEngagementSource(engagementSource2);
        }
        String engagementSourceLevelTwo = tasks.getEngagementSourceLevelTwo();
        if (!(engagementSourceLevelTwo == null || f9g.d0(engagementSourceLevelTwo))) {
            String engagementSourceLevelTwo2 = tasks.getEngagementSourceLevelTwo();
            sq8.m48646e(engagementSourceLevelTwo2);
            engagementSummary.setEngagementSourceLevelTwo(engagementSourceLevelTwo2);
        }
        String customCallOutcomeData = tasks.getCustomCallOutcomeData();
        if (customCallOutcomeData != null) {
            engagementSummary.setCustomCallOutcomeData(customCallOutcomeData);
        }
        String customVisitOutcomeData = tasks.getCustomVisitOutcomeData();
        if (customVisitOutcomeData != null) {
            engagementSummary.setCustomVisitOutcomeData(customVisitOutcomeData);
        }
        String customTaskCompletionData = tasks.getCustomTaskCompletionData();
        if (customTaskCompletionData != null) {
            engagementSummary.setCustomTaskCompletionData(customTaskCompletionData);
        }
        String customTaskInputData = tasks.getCustomTaskInputData();
        if (customTaskInputData != null) {
            engagementSummary.setCustomTaskInputData(customTaskInputData);
        }
        String customNextStepTaskInputData = tasks.getCustomNextStepTaskInputData();
        if (customNextStepTaskInputData != null) {
            engagementSummary.setCustomNextStepTaskInputData(customNextStepTaskInputData);
        }
        String customVideoCallInputData = tasks.getCustomVideoCallInputData();
        if (customVideoCallInputData != null) {
            engagementSummary.setCustomVideoCallInputData(customVideoCallInputData);
        }
        Long nextFollowUpOn = tasks.getNextFollowUpOn();
        if (nextFollowUpOn != null) {
            engagementSummary.setNextFollowUpOn(Long.valueOf(nextFollowUpOn.longValue()));
        }
        String nextFollowUpSetBy = tasks.getNextFollowUpSetBy();
        if (nextFollowUpSetBy != null) {
            engagementSummary.setNextFollowUpSetBy(nextFollowUpSetBy);
        }
        if (tasks.getTaskReminderTimeInMillis() >= 0) {
            engagementSummary.setReminderTimeOffset(tasks.getTaskReminderTimeInMillis());
        }
        if (tasks.getAssignmentOutcome() != null) {
            engagementSummary.setNextStepTaskAssignmentOutcome(tasks.getAssignmentOutcome());
        }
        if (tasks.getTransferLead()) {
            engagementSummary.setTransferLeadOnNextStepTask(tasks.getTransferLead());
        }
        engagementSummary.setCreateNewDeal(tasks.getCreateNewDeal());
        return engagementSummary;
    }

    /* renamed from: o */
    public static /* synthetic */ EngagementSummary m49863o(Tasks tasks, EngagementSummary engagementSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            engagementSummary = null;
        }
        return m49862n(tasks, engagementSummary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* renamed from: p */
    public static final LeadsSummary m49864p(Leads leads, LeadsSummary leadsSummary) {
        sq8.m48649h(leads, "<this>");
        Contact contact = null;
        ?? r0 = 0;
        int i = 1;
        if (leadsSummary == null) {
            leadsSummary = new LeadsSummary(contact, i, r0 == true ? 1 : 0);
        }
        leadsSummary.setName(leads.getName());
        if (!f9g.d0(leads.getContactID())) {
            leadsSummary.setId(leads.getContactID());
        }
        if (!f9g.d0(leads.getDesignation())) {
            leadsSummary.setDesignation(leads.getDesignation());
        }
        if (!f9g.d0(leads.getContactSource())) {
            leadsSummary.setContactSource(leads.getContactSource());
        }
        if (!leads.getEmails().isEmpty()) {
            leadsSummary.setEmail(leads.getEmails());
        }
        String leadLifecycleStage = leads.getLeadLifecycleStage();
        if ((leadLifecycleStage == null || leadLifecycleStage.length() == 0) == false) {
            leadsSummary.setLeadLifecycleStage(leads.getLeadLifecycleStage());
        }
        String leadLifecycleStageSubCategory = leads.getLeadLifecycleStageSubCategory();
        if ((leadLifecycleStageSubCategory == null || leadLifecycleStageSubCategory.length() == 0) == false) {
            leadsSummary.setLeadLifecycleStageSubCategory(leads.getLeadLifecycleStageSubCategory());
        }
        if (!leads.getRecentEngagements().isEmpty()) {
            leadsSummary.setRecentActions(leads.getRecentEngagements());
        }
        String lastDealStageType = leads.getLastDealStageType();
        if ((lastDealStageType == null || lastDealStageType.length() == 0) == false) {
            leadsSummary.setLastDealStageType(leads.getLastDealStageType());
        }
        String activeDealStage = leads.getActiveDealStage();
        if ((activeDealStage == null || activeDealStage.length() == 0) == false) {
            leadsSummary.setActiveDealStage(leads.getActiveDealStage());
        }
        if (leads.getOpenTaskDetail() != null) {
            leadsSummary.setOpenTaskDetail(leads.getOpenTaskDetail());
        }
        String latestRemark = leads.getLatestRemark();
        if ((latestRemark == null || latestRemark.length() == 0) == false) {
            leadsSummary.setLatestRemark(leads.getLatestRemark());
        }
        String freshLeadTag = leads.getFreshLeadTag();
        if ((freshLeadTag == null || freshLeadTag.length() == 0) == false) {
            leadsSummary.setFreshLeadTag(leads.getFreshLeadTag());
        }
        String strIsCustomer = leads.isCustomer();
        if ((strIsCustomer == null || strIsCustomer.length() == 0) == false) {
            leadsSummary.setLatestRemark(leads.isCustomer());
        }
        if (leads.getLastLeadAssignmentDateTimeInMillis() != -1) {
            leadsSummary.getLastLeadAssignmentDateTime();
        }
        if (!leads.getPhoneNumbers().isEmpty()) {
            leadsSummary.setContactNumbers(leads.getPhoneNumbers());
        }
        if (!f9g.d0(leads.getName())) {
            leadsSummary.setName(leads.getName());
        }
        if (!f9g.d0(leads.getContactPriority())) {
            leadsSummary.setPriority(leads.getContactPriority());
        }
        if (!f9g.d0(leads.getBulkUploadReference())) {
            leadsSummary.setBulkUploadReference(leads.getBulkUploadReference());
        }
        if (!f9g.d0(leads.getProfilePic())) {
            leadsSummary.setProfilePicURL(leads.getProfilePic());
        }
        if (leads.getAddedBusiness() != null) {
            BusinessInfo addedBusiness = leads.getAddedBusiness();
            leadsSummary.setAddedBusiness(addedBusiness != null ? m49861m(addedBusiness, null, 1, null) : null);
        }
        if (!(leads.getContactLat() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            LeadsAddress leadsAddress = new LeadsAddress(null, 1, null);
            leadsAddress.setLatitude(String.valueOf(leads.getContactLat()));
            leadsAddress.setLongitude(String.valueOf(leads.getContactLng()));
            leadsAddress.setRawAddressText(leads.getContactLocation());
            leadsSummary.setPrimaryAddress(leadsAddress);
        } else if (!f9g.d0(leads.getContactLocation())) {
            LeadsAddress leadsAddress2 = new LeadsAddress(null, 1, null);
            leadsAddress2.setRawAddressText(leads.getContactLocation());
            leadsSummary.setPrimaryAddress(leadsAddress2);
        }
        leadsSummary.setCustomDataAddedFromAddContactForm(leads.getCustomDataAddedFromAddContactForm());
        if (leads.getSubmittedFormValues() != null) {
            leadsSummary.setSubmittedFormValues(leads.getSubmittedFormValues());
        }
        leadsSummary.setUserDefinedTags(leads.getUserDefinedTags());
        leadsSummary.setNextProspectingDueOn(leads.getNextProspectingDueOn());
        leadsSummary.setNextProspectingSetBy(leads.getNextProspectingSetBy());
        leadsSummary.setCustomAttributes(leads.getCustomAttributes());
        return leadsSummary;
    }

    /* renamed from: q */
    public static /* synthetic */ LeadsSummary m49865q(Leads leads, LeadsSummary leadsSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            leadsSummary = null;
        }
        return m49864p(leads, leadsSummary);
    }

    /* renamed from: r */
    public static final String m49866r(String str) throws IOException {
        sq8.m48649h(str, "<this>");
        String strM24593G = e9g.m24593G(str, "+91", "", false, 4, null);
        StringBuilder sb = new StringBuilder();
        int length = strM24593G.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strM24593G.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: s */
    public static final void m49867s(final View view, final boolean z) {
        sq8.m48649h(view, "<this>");
        view.post(new Runnable() { // from class: o.sh1
            @Override // java.lang.Runnable
            public final void run() {
                th1.m49868t(z, view);
            }
        });
    }

    /* renamed from: t */
    public static final void m49868t(boolean z, View view) {
        sq8.m48649h(view, "$this_visibilityBottom");
        if (!z) {
            view.setVisibility(8);
            return;
        }
        view.setTranslationY(-view.getContext().getResources().getDimensionPixelSize(k7e.grid_3));
        ViewPropertyAnimator listener = view.animate().translationY(0.0f).setListener(new C17110a(view));
        sq8.m48648g(listener, "setListener(...)");
        listener.setDuration(300L);
        listener.start();
    }
}
