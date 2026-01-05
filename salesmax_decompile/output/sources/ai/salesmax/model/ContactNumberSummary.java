package ai.salesmax.model;

import ai.salesmax.model.ContactNumberSummary;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactNumber;
import com.amplifyframework.datastore.generated.model.ContactNumberType;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ContactNumberSummary {
    public static final int $stable = 8;
    private ContactNumber contactNumber;
    private boolean isSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactNumberSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_doNotTrackSetByUser_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        Account account = this.contactNumber.getAccount();
        String id = account != null ? account.getId() : null;
        return id == null ? "" : id;
    }

    public final LeadsSummary getContact() {
        Contact contact = this.contactNumber.getContact();
        if (contact != null) {
            return new LeadsSummary(contact);
        }
        return null;
    }

    public final ContactNumber getContactNumber() {
        return this.contactNumber;
    }

    public final String getContactNumberType() {
        ContactNumberType contactNumberType = this.contactNumber.getContactNumberType();
        if (contactNumberType != null) {
            return contactNumberType.name();
        }
        return null;
    }

    public final Long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.contactNumber.getCreatedAt());
        final ContactNumberSummary$createdAt$1 contactNumberSummary$createdAt$1 = ContactNumberSummary$createdAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.oy3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ContactNumberSummary._get_createdAt_$lambda$3(contactNumberSummary$createdAt$1, obj);
            }
        }).orElse(null);
    }

    public final Boolean getDoNotTrack() {
        return this.contactNumber.getDoNotTrack();
    }

    public final String getDoNotTrackSetBy() {
        return this.contactNumber.getDoNotTrackSetBy();
    }

    public final LeadsUser getDoNotTrackSetByUser() {
        Optional optionalOfNullable = Optional.ofNullable(this.contactNumber.getDoNotTrackSetBy());
        final ContactNumberSummary$doNotTrackSetByUser$1 contactNumberSummary$doNotTrackSetByUser$1 = ContactNumberSummary$doNotTrackSetByUser$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.qy3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ContactNumberSummary._get_doNotTrackSetByUser_$lambda$1(contactNumberSummary$doNotTrackSetByUser$1, obj);
            }
        }).orElse(null);
    }

    public final String getId() {
        String id = this.contactNumber.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getPhoneNumber() {
        return this.contactNumber.getPhoneNumber();
    }

    public final Long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.contactNumber.getUpdatedAt());
        final ContactNumberSummary$updatedAt$1 contactNumberSummary$updatedAt$1 = ContactNumberSummary$updatedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.py3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ContactNumberSummary._get_updatedAt_$lambda$2(contactNumberSummary$updatedAt$1, obj);
            }
        }).orElse(null);
    }

    public final Boolean isPrimary() {
        return this.contactNumber.getIsPrimary();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isSpam() {
        return this.contactNumber.getIsSpam();
    }

    public final Boolean isValid() {
        return this.contactNumber.getIsValid();
    }

    public final Boolean isVerified() {
        return this.contactNumber.getIsVerified();
    }

    public final Boolean isWrongNumber() {
        return this.contactNumber.getIsWrongNumber();
    }

    public final void setContactNumber(ContactNumber contactNumber) {
        sq8.m48649h(contactNumber, "<set-?>");
        this.contactNumber = contactNumber;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public ContactNumberSummary(ContactNumber contactNumber) {
        sq8.m48649h(contactNumber, "contactNumber");
        this.contactNumber = contactNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ContactNumberSummary(ContactNumber contactNumber, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            contactNumber = ContactNumber.justId("");
            sq8.m48648g(contactNumber, "justId(...)");
        }
        this(contactNumber);
    }
}
