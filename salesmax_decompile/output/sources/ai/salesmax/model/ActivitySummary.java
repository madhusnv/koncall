package ai.salesmax.model;

import ai.salesmax.model.ActivitySummary;
import com.amplifyframework.datastore.generated.model.Activity;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;
import p001o.f9g;
import p001o.kf9;
import p001o.lpi;
import p001o.sq8;
import p001o.tpb;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary {
    public static final int $stable = 8;
    private final Activity activity;

    /* renamed from: ai.salesmax.model.ActivitySummary$toActivities$6 */
    public static final class C00956 extends kf9 implements xk7 {
        public static final C00956 INSTANCE = new C00956();

        public C00956() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(ArrayList<String> arrayList) {
            return arrayList.toString();
        }
    }

    public ActivitySummary(Activity activity) {
        sq8.m48649h(activity, "activity");
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_activityCategory_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_activityDoneByUser_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_activityType_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary _get_contact_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Leads _get_contact_$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Leads) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_owner_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsTeam _get_primaryTeam_$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsTeam) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_relatedObjectType_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toActivities$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toActivities$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toActivities$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toActivities$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList toActivities$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (ArrayList) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toActivities$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        String accountId = this.activity.getAccountId();
        sq8.m48648g(accountId, "getAccountId(...)");
        return accountId;
    }

    public final String getActivityCategory() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getActivityCategory());
        final ActivitySummary$activityCategory$1 activitySummary$activityCategory$1 = ActivitySummary$activityCategory$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.lu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_activityCategory_$lambda$1(activitySummary$activityCategory$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getActivityDoneById() {
        String activityDoneByUserId = this.activity.getActivityDoneByUserId();
        return activityDoneByUserId == null ? "" : activityDoneByUserId;
    }

    public final String getActivityDoneByName() {
        LeadsUser activityDoneByUser = getActivityDoneByUser();
        String name = activityDoneByUser != null ? activityDoneByUser.getName() : null;
        return name == null ? "" : name;
    }

    public final String getActivityDoneByProfile() {
        LeadsUser activityDoneByUser = getActivityDoneByUser();
        String profilePic = activityDoneByUser != null ? activityDoneByUser.getProfilePic() : null;
        return profilePic == null ? "" : profilePic;
    }

    public final LeadsUser getActivityDoneByUser() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getActivityDoneByUser());
        final ActivitySummary$activityDoneByUser$1 activitySummary$activityDoneByUser$1 = ActivitySummary$activityDoneByUser$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.ku
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_activityDoneByUser_$lambda$4(activitySummary$activityDoneByUser$1, obj);
            }
        }).orElse(lpi.a0(getActivityDoneById()));
    }

    public final String getActivityId() {
        String id = this.activity.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getActivityTitle() {
        String displayValue = DisplayConstants.getDisplayValue(getActivityType());
        sq8.m48648g(displayValue, "getDisplayValue(...)");
        return displayValue;
    }

    public final String getActivityType() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getActivityType());
        final ActivitySummary$activityType$1 activitySummary$activityType$1 = ActivitySummary$activityType$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.fu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_activityType_$lambda$2(activitySummary$activityType$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getBody() {
        String body = this.activity.getBody();
        return body == null ? "" : body;
    }

    public final Optional<Leads> getContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getContact());
        final ActivitySummary$contact$1 activitySummary$contact$1 = ActivitySummary$contact$1.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.hu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_contact_$lambda$7(activitySummary$contact$1, obj);
            }
        });
        final ActivitySummary$contact$2 activitySummary$contact$2 = ActivitySummary$contact$2.INSTANCE;
        Optional<Leads> map2 = map.map(new Function() { // from class: o.iu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_contact_$lambda$8(activitySummary$contact$2, obj);
            }
        });
        sq8.m48648g(map2, "map(...)");
        return map2;
    }

    public final long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getCreatedAt());
        final ActivitySummary$createdAt$1 activitySummary$createdAt$1 = ActivitySummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.eu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_createdAt_$lambda$5(activitySummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getDescription() {
        String body = this.activity.getBody();
        sq8.m48648g(body, "getBody(...)");
        return body;
    }

    public final String getNote() {
        String note = this.activity.getNote();
        return note == null ? "" : note;
    }

    public final LeadsUser getOwner() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getUser());
        final ActivitySummary$owner$1 activitySummary$owner$1 = ActivitySummary$owner$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.ju
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_owner_$lambda$3(activitySummary$owner$1, obj);
            }
        }).orElse(lpi.a0(this.activity.getOwnerId()));
    }

    public final String getOwnerId() {
        String ownerId = this.activity.getOwnerId();
        sq8.m48648g(ownerId, "getOwnerId(...)");
        return ownerId;
    }

    public final Optional<LeadsTeam> getPrimaryTeam() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getPrimaryTeam());
        final ActivitySummary$primaryTeam$1 activitySummary$primaryTeam$1 = ActivitySummary$primaryTeam$1.INSTANCE;
        Optional<LeadsTeam> map = optionalOfNullable.map(new Function() { // from class: o.wt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_primaryTeam_$lambda$9(activitySummary$primaryTeam$1, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    public final String getRelatedObjectId() {
        Object objOrElse = Optional.ofNullable(this.activity.getActivityRelatedObjectId()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getRelatedObjectType() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getActivityRelatedObjectType());
        final ActivitySummary$relatedObjectType$1 activitySummary$relatedObjectType$1 = ActivitySummary$relatedObjectType$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.du
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_relatedObjectType_$lambda$0(activitySummary$relatedObjectType$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTeamId() {
        return this.activity.getPrimaryTeamId();
    }

    public final long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.activity.getUpdatedAt());
        final ActivitySummary$updatedAt$1 activitySummary$updatedAt$1 = ActivitySummary$updatedAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.gu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary._get_updatedAt_$lambda$6(activitySummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final Activities toActivities() {
        String activityId = getActivityId();
        long createdAt = getUpdatedAt() <= 0 ? getCreatedAt() : getUpdatedAt();
        String activityTitle = getActivityTitle();
        String body = getBody();
        String string = f9g.Z0(getNote()).toString();
        String activityType = getActivityType();
        String activityCategory = getActivityCategory();
        Optional<Leads> contact = getContact();
        final C00901 c00901 = new tpb() { // from class: ai.salesmax.model.ActivitySummary.toActivities.1
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((Leads) obj).getName();
            }

            public void set(Object obj, Object obj2) {
                ((Leads) obj).setName((String) obj2);
            }
        };
        String str = (String) contact.map(new Function() { // from class: o.xt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$10(c00901, obj);
            }
        }).orElse("");
        Optional<Leads> contact2 = getContact();
        final C00912 c00912 = new tpb() { // from class: ai.salesmax.model.ActivitySummary.toActivities.2
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((Leads) obj).getContactID();
            }

            public void set(Object obj, Object obj2) {
                ((Leads) obj).setContactID((String) obj2);
            }
        };
        String str2 = (String) contact2.map(new Function() { // from class: o.yt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$11(c00912, obj);
            }
        }).orElse("");
        Optional<Leads> contact3 = getContact();
        final C00923 c00923 = new tpb() { // from class: ai.salesmax.model.ActivitySummary.toActivities.3
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((Leads) obj).getProfilePic();
            }

            public void set(Object obj, Object obj2) {
                ((Leads) obj).setProfilePic((String) obj2);
            }
        };
        String str3 = (String) contact3.map(new Function() { // from class: o.zt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$12(c00923, obj);
            }
        }).orElse("");
        Optional<Leads> contact4 = getContact();
        final C00934 c00934 = new tpb() { // from class: ai.salesmax.model.ActivitySummary.toActivities.4
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((Leads) obj).getContactSource();
            }

            public void set(Object obj, Object obj2) {
                ((Leads) obj).setContactSource((String) obj2);
            }
        };
        String str4 = (String) contact4.map(new Function() { // from class: o.au
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$13(c00934, obj);
            }
        }).orElse("");
        Optional<Leads> contact5 = getContact();
        final C00945 c00945 = new tpb() { // from class: ai.salesmax.model.ActivitySummary.toActivities.5
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((Leads) obj).getPhoneNumbers();
            }

            public void set(Object obj, Object obj2) {
                ((Leads) obj).setPhoneNumbers((ArrayList) obj2);
            }
        };
        Optional<U> map = contact5.map(new Function() { // from class: o.bu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$14(c00945, obj);
            }
        });
        final C00956 c00956 = C00956.INSTANCE;
        String str5 = (String) map.map(new Function() { // from class: o.cu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivitySummary.toActivities$lambda$15(c00956, obj);
            }
        }).orElse("");
        String relatedObjectType = getRelatedObjectType();
        String relatedObjectId = getRelatedObjectId();
        String activityDoneByName = getActivityDoneByName();
        String activityDoneByProfile = getActivityDoneByProfile();
        String activityDoneById = getActivityDoneById();
        long updatedAt = getUpdatedAt();
        long createdAt2 = getCreatedAt();
        sq8.m48646e(str5);
        return new Activities(activityId, createdAt, activityTitle, body, string, activityType, activityCategory, str, str2, str3, str4, str5, "", relatedObjectType, relatedObjectId, false, false, activityDoneByName, activityDoneById, activityDoneByProfile, Long.valueOf(updatedAt), Long.valueOf(createdAt2), 65536, null);
    }
}
