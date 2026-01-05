package ai.salesmax.model;

import ai.salesmax.model.EngagementUpdateSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.EngagementUpdate;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import p001o.a81;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EngagementUpdateSummary {
    private long createdAt;
    private EngagementUpdate engagementUpdate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final EngagementUpdate newInstance() {
            Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(System.currentTimeMillis()));
            EngagementUpdate engagementUpdateBuild = EngagementUpdate.builder().accountId("").updatedAt(dateTimeM16658m).createdAt(dateTimeM16658m).build();
            sq8.m48648g(engagementUpdateBuild, "build(...)");
            return engagementUpdateBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EngagementUpdateSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary _get_contact_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_dueDateChangedFrom_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_dueDateChangedTo_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EngagementSummary _get_engagement_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (EngagementSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_updatedBy_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_updatedBy_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_updatedBy_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long createdAt$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final LeadsSummary getContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagementUpdate.getContact());
        final EngagementUpdateSummary$contact$1 engagementUpdateSummary$contact$1 = EngagementUpdateSummary$contact$1.INSTANCE;
        return (LeadsSummary) optionalOfNullable.map(new Function() { // from class: o.jf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._get_contact_$lambda$1(engagementUpdateSummary$contact$1, obj);
            }
        }).orElse(null);
    }

    public final String getContactId() {
        Contact contact = this.engagementUpdate.getContact();
        String id = contact != null ? contact.getId() : null;
        return id == null ? "" : id;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final Long getDueDateChangedFrom() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagementUpdate.getDueDateTimeChangedFrom());
        final EngagementUpdateSummary$dueDateChangedFrom$1 engagementUpdateSummary$dueDateChangedFrom$1 = EngagementUpdateSummary$dueDateChangedFrom$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.kf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._get_dueDateChangedFrom_$lambda$2(engagementUpdateSummary$dueDateChangedFrom$1, obj);
            }
        }).orElse(null);
    }

    public final Long getDueDateChangedTo() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagementUpdate.getDueDateTimeChangedTo());
        final EngagementUpdateSummary$dueDateChangedTo$1 engagementUpdateSummary$dueDateChangedTo$1 = EngagementUpdateSummary$dueDateChangedTo$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.nf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._get_dueDateChangedTo_$lambda$3(engagementUpdateSummary$dueDateChangedTo$1, obj);
            }
        }).orElse(null);
    }

    public final EngagementSummary getEngagement() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagementUpdate.getEngagement());
        final EngagementUpdateSummary$engagement$1 engagementUpdateSummary$engagement$1 = EngagementUpdateSummary$engagement$1.INSTANCE;
        return (EngagementSummary) optionalOfNullable.map(new Function() { // from class: o.of6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._get_engagement_$lambda$0(engagementUpdateSummary$engagement$1, obj);
            }
        }).orElse(null);
    }

    public final String getEngagementId() {
        Engagement engagement = this.engagementUpdate.getEngagement();
        String id = engagement != null ? engagement.getId() : null;
        return id == null ? "" : id;
    }

    public final EngagementUpdate getEngagementUpdate() {
        return this.engagementUpdate;
    }

    public final String getEventType() {
        return this.engagementUpdate.getEventType();
    }

    public final String getNote() {
        String note = this.engagementUpdate.getNote();
        return note == null ? "" : note;
    }

    public final LeadsUser getUpdatedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagementUpdate.getUpdatedBy());
        final EngagementUpdateSummary$updatedBy$1 engagementUpdateSummary$updatedBy$1 = EngagementUpdateSummary$updatedBy$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.mf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._get_updatedBy_$lambda$5(engagementUpdateSummary$updatedBy$1, obj);
            }
        }).orElse(lpi.a0(getUpdatedById()));
    }

    public final String getUpdatedById() {
        return (String) Optional.ofNullable(this.engagementUpdate.getUpdatedById()).orElse(null);
    }

    public final void setContact(LeadsSummary leadsSummary) {
        if (leadsSummary != null) {
            Engagement engagement = this.engagementUpdate.getEngagement();
            if (Objects.equals(engagement != null ? engagement.getId() : null, leadsSummary.getId())) {
                return;
            }
            EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().contact(Contact.justId(leadsSummary.getId())).build();
            sq8.m48648g(engagementUpdateBuild, "build(...)");
            this.engagementUpdate = engagementUpdateBuild;
        }
    }

    public final void setContactId(String str) {
        if (str != null) {
            Contact contact = this.engagementUpdate.getContact();
            if (Objects.equals(contact != null ? contact.getId() : null, str)) {
                return;
            }
            EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().contact(Contact.justId(str)).build();
            sq8.m48648g(engagementUpdateBuild, "build(...)");
            this.engagementUpdate = engagementUpdateBuild;
        }
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setDueDateChangedFrom(Long l) {
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().dueDateTimeChangedFrom(a81.m16658m(l)).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public final void setDueDateChangedTo(Long l) {
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().dueDateTimeChangedTo(a81.m16658m(l)).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public final void setEngagement(EngagementSummary engagementSummary) {
        if (engagementSummary != null) {
            Engagement engagement = this.engagementUpdate.getEngagement();
            if (Objects.equals(engagement != null ? engagement.getId() : null, engagementSummary.getId())) {
                return;
            }
            EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().engagement(Engagement.justId(engagementSummary.getId())).build();
            sq8.m48648g(engagementUpdateBuild, "build(...)");
            this.engagementUpdate = engagementUpdateBuild;
        }
    }

    public final void setEngagementId(String str) {
        sq8.m48649h(str, "value");
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().engagement(Engagement.justId(str)).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public final void setEngagementUpdate(EngagementUpdate engagementUpdate) {
        sq8.m48649h(engagementUpdate, "<set-?>");
        this.engagementUpdate = engagementUpdate;
    }

    public final void setEventType(String str) {
        if (str == null || Objects.equals(this.engagementUpdate.getEventType(), str)) {
            return;
        }
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().eventType(str).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public final void setNote(String str) {
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().note(str).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public final void setUpdatedBy(LeadsUser leadsUser) {
        Optional optionalOfNullable = Optional.ofNullable(leadsUser);
        final EngagementUpdateSummary$updatedBy$2 engagementUpdateSummary$updatedBy$2 = EngagementUpdateSummary$updatedBy$2.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.hf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary._set_updatedBy_$lambda$6(engagementUpdateSummary$updatedBy$2, obj);
            }
        });
        final EngagementUpdateSummary$updatedBy$3 engagementUpdateSummary$updatedBy$3 = new EngagementUpdateSummary$updatedBy$3(this);
        map.ifPresent(new Consumer() { // from class: o.if6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                EngagementUpdateSummary._set_updatedBy_$lambda$7(engagementUpdateSummary$updatedBy$3, obj);
            }
        });
    }

    public final void setUpdatedById(String str) {
        EngagementUpdate engagementUpdateBuild = this.engagementUpdate.copyOfBuilder().updatedById(str).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        this.engagementUpdate = engagementUpdateBuild;
    }

    public EngagementUpdateSummary(EngagementUpdate engagementUpdate) {
        sq8.m48649h(engagementUpdate, "engagementUpdate");
        this.engagementUpdate = engagementUpdate;
        Optional optionalOfNullable = Optional.ofNullable(engagementUpdate.getCreatedAt());
        final EngagementUpdateSummary$createdAt$1 engagementUpdateSummary$createdAt$1 = EngagementUpdateSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.lf6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementUpdateSummary.createdAt$lambda$4(engagementUpdateSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        this.createdAt = ((Number) objOrElse).longValue();
    }

    public /* synthetic */ EngagementUpdateSummary(EngagementUpdate engagementUpdate, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : engagementUpdate);
    }
}
