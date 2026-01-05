package ai.salesmax.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DisplayConstants {
    private static final Map<String, String> ENUM_DISPLAY_MAP;

    static {
        HashMap map = new HashMap();
        ENUM_DISPLAY_MAP = map;
        map.put("CALL_DISPOSITION_ADDED", "Added Call Outcome");
        map.put("EMAIL_SENT", "Sent Email");
        map.put("WHATSAPP_MESSAGE_SENT", "Whatsapp Message Sent");
        map.put("SMS_SENT", "SMS Sent");
        map.put("TASK_CREATED", "Created A Task");
        map.put("TASK_ASSIGNED", "Assigned A Task");
        map.put("TASK_COMPLETED", "Completed A Task");
        map.put("TASK_COMPLETED_SUCCESS", "Completed A Task In Success");
        map.put("TASK_COMPLETED_FAILURE", "Completed A Task In Failure");
        map.put("TASK_COMPLETED_EXPIRY", "Task Expired");
        map.put("TASK_UPDATED", "Updated A Task");
        map.put("DEAL_CREATED", "New Deal Created");
        map.put("DEAL_STAGE_CHANGED", "Deal Stage Changed");
        map.put("DEAL_WON", "Deal Won");
        map.put("DEAL_LOST", "Deal Lost");
        map.put("PAYMENT_REQUESTED", "Payment Requested");
        map.put("PAYMENT_RECEIVED", "Payment Received");
        map.put("PAYMENT_CANCELLED", "Payment Cancelled");
        map.put("COMMENT_ADDED", "Added Comment");
        map.put("COMMENT_MENTIONED", "Mentioned In A Comment");
        map.put("CONTACT_ASSIGNED", "Assigned A Lead");
        map.put("CALL_LOGGED", "Call with Lead Logged");
        map.put("CALL_LATER", "Call Later");
        map.put("CALL_RECORD_AVAILABLE", "Call Recording Available");
        map.put("VISIT_LOGGED", "Logged A Visit");
        map.put("NOTE_ADDED", "Added A Note");
        map.put("USER_ADDED", "New User Added To Organization");
        map.put("TEAM_CREATED", "Created A Team");
        map.put("TEAM_MEMBER_ADDED", "New Team Member Added");
        map.put("CONTACT_CREATED", "Leads Created");
        map.put("CONNECTED_CALL_LOGGED", "Connected Calls Logged");
        map.put("INCOMING_CALL_LOGGED", "Incoming Call Logged");
        map.put("OUTGOING_CALL_LOGGED", "Outgoing Call Logged");
        map.put("CALL_DURATION", "Total Call Duration");
        map.put("CALL_DURATION_INCOMING", "Incoming Call Duration");
        map.put("CALL_DURATION_OUTGOING", "Outgoing Call Duration");
        map.put("CONVERSATION_STARTED", "Started a Conversation");
        map.put("CALL_OUTCOME_LOGGED", "Call Outcome Logged");
        map.put("VISIT_OUTCOME_LOGGED", "Visit Outcome Logged");
        map.put("VIDEO_CALL_COMPLETED_SUCCESSFULLY", "Video Call Completed");
        map.put("GET_DOCUMENTS", "Get Documents");
        map.put("FOLLOW_UP", "Follow Up");
        map.put("USER_CREATED", "Created By User");
        map.put("BULK_UPLOAD", "Bulk Uploaded");
        map.put("CONTACT_RE_CHURNED", "Lead Re-churned");
        map.put("AUTOMATIC_FOR_CAMPAIGN", "System Created For Campaign");
        map.put("TEAM_TRIAL", "Team");
        map.put("INDIVIDUAL", "Personal");
        map.put("TEAM", "Team");
        map.put("INTERESTED", "Interested");
        map.put("NOT_INTERESTED", "Not Interested");
        map.put("SELF_SIGNUP_WEB", "Signed Up On Web");
        map.put("SELF_SIGNUP_ANDROID", "Signed Up On App");
        map.put("SELF_SIGNUP_IOS", "Signed Up On App");
        map.put("ADMIN_ADDED", "Added By Admin");
        map.put("MANAGER_INVITED", "Invited By Manager");
        map.put("CONFIRMED", "Confirmed");
        map.put("IS_DELETED", "Deleted");
        map.put("VERY_HIGH", "Very High");
        map.put("HIGH", "High");
        map.put("MEDIUM", "Medium");
        map.put("LOW", "Low");
        map.put("VERY_LOW", "Very Low");
        map.put("REPORTEE", "Reportee");
        map.put("TEAM_LEADER", "Team Leader");
        map.put("CALL_NOT_ANSWERED", "Last Call from lead was not answered");
        map.put("CALL_DISPOSITION_NOT_RECORDED", "Outcome of last successfull call was not recorded");
        map.put("VISIT_NOT_ADDED", "Meeting/Visit with lead has not yet been recorded");
        map.put("VISIT_DISPOSITION_NOT_RECORDED", "Outcome of last Meeting/Visit was not recorded");
    }

    public static String getDisplayValue(String str) {
        return ENUM_DISPLAY_MAP.getOrDefault(str, str);
    }
}
