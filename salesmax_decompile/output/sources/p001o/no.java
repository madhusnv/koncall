package p001o;

import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.datastore.generated.model.Activity;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.ActivityType;
import type.SearchableActivityFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public class no extends e07 {

    /* renamed from: f */
    public static Map f37083f = new LinkedHashMap();

    /* renamed from: g */
    public static Map f37084g = new LinkedHashMap();

    static {
        f37083f.put("Call Dispositions Added", ActivityType.CALL_DISPOSITION_ADDED);
        f37083f.put("Call Recording Available", ActivityType.CALL_RECORD_AVAILABLE);
        f37083f.put("Call Logged", ActivityType.CALL_LOGGED);
        f37083f.put("Email Sent", ActivityType.EMAIL_SENT);
        f37083f.put("Whatsapp Sent", ActivityType.WHATSAPP_MESSAGE_SENT);
        f37083f.put("Note Added", ActivityType.NOTE_ADDED);
        f37083f.put("Visit Logged", ActivityType.VISIT_LOGGED);
        f37083f.put("Deal Created", ActivityType.DEAL_CREATED);
        f37083f.put("Deal Moved", ActivityType.DEAL_STAGE_CHANGED);
        f37083f.put("Deal Won", ActivityType.DEAL_WON);
        f37083f.put("Deal Lost", ActivityType.DEAL_LOST);
        f37083f.put("Payment Requested", ActivityType.PAYMENT_REQUESTED);
        f37083f.put("Payment Received", ActivityType.PAYMENT_RECEIVED);
        f37083f.put("Payment Cancelled", ActivityType.PAYMENT_CANCELLED);
        f37083f.put("Contact Uploaded", ActivityType.BULK_UPLOAD_COMPLETED);
        f37083f.put("Contact Assigned", ActivityType.CONTACT_ASSIGNED);
        f37083f.put("Task Assigned", ActivityType.TASK_ASSIGNED);
        f37083f.put("Task Completed", ActivityType.TASK_COMPLETED);
        f37083f.put("Task Completed Successfully", ActivityType.TASK_COMPLETED_SUCCESS);
        f37083f.put("Task Completed In Failure", ActivityType.TASK_COMPLETED_FAILURE);
        f37083f.put("Task Expired", ActivityType.TASK_COMPLETED_EXPIRY);
        f37083f.put("Task Created", ActivityType.TASK_CREATED);
        f37083f.put("Task Updated", ActivityType.TASK_UPDATED);
        f37083f.put("Team Created", ActivityType.TEAM_CREATED);
        f37083f.put("Team Member Added", ActivityType.TEAM_MEMBER_ADDED);
        f37083f.put("User Added", ActivityType.USER_ADDED);
        f37083f.put("Comment Mentioned", ActivityType.COMMENT_MENTIONED);
        f37083f.put("Comment Added", ActivityType.COMMENT_ADDED);
        f37084g.put("Activity Date", Activity.CREATED_AT);
    }

    /* renamed from: i */
    public static ActivityType m40812i(String str) {
        return (ActivityType) f37083f.get(str);
    }

    /* renamed from: j */
    public static SearchableActivityFilterInput.Builder m40813j(SearchableActivityFilterInput.Builder builder, tz4 tz4Var) {
        if (tz4Var.m50798d()) {
            return builder;
        }
        final SearchableStringFilterInput.Builder builder2 = SearchableStringFilterInput.builder();
        Optional map = Optional.ofNullable(tz4Var.m50797c()).map(new ko());
        Objects.requireNonNull(builder2);
        map.ifPresent(new Consumer() { // from class: o.lo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.gte((String) obj);
            }
        });
        Optional.ofNullable(tz4Var.m50796b()).map(new ko()).ifPresent(new Consumer() { // from class: o.mo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.lte((String) obj);
            }
        });
        String string = ((QueryField) f37084g.getOrDefault(tz4Var.m50795a(), Activity.CREATED_AT)).toString();
        string.hashCode();
        if (string.equals("createdAt")) {
            builder.createdAt(builder2.build());
        } else {
            builder.createdAt(builder2.build());
        }
        return builder;
    }

    /* renamed from: k */
    public static SearchableActivityFilterInput.Builder m40814k(SearchableActivityFilterInput.Builder builder, ActivityType activityType) {
        return builder.activityType(SearchableStringFilterInput.builder().eq(activityType.name()).build());
    }

    /* renamed from: l */
    public static Collection m40815l() {
        return f37083f.keySet();
    }

    /* renamed from: m */
    public Optional m40816m() {
        List list = (List) ((List) this.f20702a.orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.jo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return no.m40812i((String) obj);
            }
        }).collect(Collectors.toList());
        return list.size() > 0 ? Optional.of(list) : Optional.empty();
    }
}
