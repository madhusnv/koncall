package ai.salesmax.model;

import android.net.Uri;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Deal;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.datastore.generated.model.fileObjectRelationship;
import p001o.a81;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FileObjectRelationshipSummary {
    private fileObjectRelationship underlyingFileObjectRelationship;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final fileObjectRelationship newInstance() {
            fileObjectRelationship fileobjectrelationshipBuild = fileObjectRelationship.builder().id("").file(UploadedFile.justId("")).account(Account.justId("")).build();
            sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
            return fileobjectrelationshipBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileObjectRelationshipSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FileData toFileData$default(FileObjectRelationshipSummary fileObjectRelationshipSummary, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fileObjectRelationshipSummary.toFileData(i);
    }

    public final String getAccountId() {
        Account account = this.underlyingFileObjectRelationship.getAccount();
        String id = account != null ? account.getId() : null;
        return id == null ? "" : id;
    }

    public final BusinessSummary getBusiness() {
        Business business = this.underlyingFileObjectRelationship.getBusiness();
        if (business != null) {
            return new BusinessSummary(business);
        }
        return null;
    }

    public final String getBusinessId() {
        Business business = this.underlyingFileObjectRelationship.getBusiness();
        if (business != null) {
            return business.getId();
        }
        return null;
    }

    public final LeadsSummary getContact() {
        Contact contact = this.underlyingFileObjectRelationship.getContact();
        if (contact != null) {
            return new LeadsSummary(contact);
        }
        return null;
    }

    public final String getContactId() {
        Contact contact = this.underlyingFileObjectRelationship.getContact();
        if (contact != null) {
            return contact.getId();
        }
        return null;
    }

    public final Long getCreatedAt() {
        Temporal.DateTime createdAt = this.underlyingFileObjectRelationship.getCreatedAt();
        if (createdAt != null) {
            return a81.m16645F(createdAt);
        }
        return null;
    }

    public final LeadsDeal getDeal() {
        Deal deal = this.underlyingFileObjectRelationship.getDeal();
        if (deal != null) {
            return new LeadsDeal(deal);
        }
        return null;
    }

    public final String getDealId() {
        Deal deal = this.underlyingFileObjectRelationship.getDeal();
        if (deal != null) {
            return deal.getId();
        }
        return null;
    }

    public final EngagementSummary getEngagement() {
        Engagement engagement = this.underlyingFileObjectRelationship.getEngagement();
        if (engagement != null) {
            return new EngagementSummary(engagement);
        }
        return null;
    }

    public final String getEngagementId() {
        Engagement engagement = this.underlyingFileObjectRelationship.getEngagement();
        if (engagement != null) {
            return engagement.getId();
        }
        return null;
    }

    public final String getFieldName() {
        return this.underlyingFileObjectRelationship.getFieldName();
    }

    public final UploadedFileSummary getFile() {
        UploadedFile file = this.underlyingFileObjectRelationship.getFile();
        if (file != null) {
            return new UploadedFileSummary(file);
        }
        return null;
    }

    public final String getFileId() {
        UploadedFile file = this.underlyingFileObjectRelationship.getFile();
        if (file != null) {
            return file.getId();
        }
        return null;
    }

    public final String getId() {
        String id = this.underlyingFileObjectRelationship.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getInputContext() {
        return this.underlyingFileObjectRelationship.getInputContext();
    }

    public final String getParentObjectId() {
        return this.underlyingFileObjectRelationship.getParentObjectId();
    }

    public final String getParentObjectType() {
        return this.underlyingFileObjectRelationship.getParentObjectType();
    }

    public final String getTranscription() {
        return this.underlyingFileObjectRelationship.getTranscription();
    }

    public final String getTranslatedTranscription() {
        return this.underlyingFileObjectRelationship.getTranslatedTranscription();
    }

    public final fileObjectRelationship getUnderlyingFileObjectRelationship() {
        return this.underlyingFileObjectRelationship;
    }

    public final Long getUpdatedAt() {
        Temporal.DateTime updatedAt = this.underlyingFileObjectRelationship.getUpdatedAt();
        if (updatedAt != null) {
            return a81.m16645F(updatedAt);
        }
        return null;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "value");
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().account(Account.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setBusiness(BusinessSummary businessSummary) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().business(Business.justId(businessSummary != null ? businessSummary.getCompanyId() : null)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setBusinessId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().business(Business.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setContact(LeadsSummary leadsSummary) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().contact(Contact.justId(leadsSummary != null ? leadsSummary.getId() : null)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setContactId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().contact(Contact.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setDeal(LeadsDeal leadsDeal) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().deal(Deal.justId(leadsDeal != null ? leadsDeal.getId() : null)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setDealId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().deal(Deal.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setEngagement(EngagementSummary engagementSummary) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().engagement(Engagement.justId(engagementSummary != null ? engagementSummary.getId() : null)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setEngagementId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().engagement(Engagement.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setFieldName(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().fieldName(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setFile(UploadedFileSummary uploadedFileSummary) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().file(UploadedFile.justId(uploadedFileSummary != null ? uploadedFileSummary.getId() : null)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setFileId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().file(UploadedFile.justId(str)).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().id(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setInputContext(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().inputContext(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setParentObjectId(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().parentObjectId(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setParentObjectType(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().parentObjectType(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setTranscription(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().transcription(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setTranslatedTranscription(String str) {
        fileObjectRelationship fileobjectrelationshipBuild = this.underlyingFileObjectRelationship.copyOfBuilder().translatedTranscription(str).build();
        sq8.m48648g(fileobjectrelationshipBuild, "build(...)");
        this.underlyingFileObjectRelationship = fileobjectrelationshipBuild;
    }

    public final void setUnderlyingFileObjectRelationship(fileObjectRelationship fileobjectrelationship) {
        sq8.m48649h(fileobjectrelationship, "<set-?>");
        this.underlyingFileObjectRelationship = fileobjectrelationship;
    }

    public final FileData toFileData(int i) {
        Uri uri = null;
        UploadedFileSummary file = getFile();
        String fileName = file != null ? file.getFileName() : null;
        String str = fileName == null ? "" : fileName;
        UploadedFileSummary file2 = getFile();
        String fileMimeType = file2 != null ? file2.getFileMimeType() : null;
        String str2 = fileMimeType == null ? "" : fileMimeType;
        UploadedFileSummary file3 = getFile();
        String fileUrl = file3 != null ? file3.getFileUrl() : null;
        String str3 = fileUrl == null ? "" : fileUrl;
        UploadedFileSummary file4 = getFile();
        String fileThumbnailUrl = file4 != null ? file4.getFileThumbnailUrl() : null;
        String str4 = fileThumbnailUrl == null ? "" : fileThumbnailUrl;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        String fileId = getFileId();
        String id = getId();
        String engagementId = getEngagementId();
        String contactId = getContactId();
        String dealId = getDealId();
        String businessId = getBusinessId();
        UploadedFileSummary file5 = getFile();
        String documentCategory = file5 != null ? file5.getDocumentCategory() : null;
        UploadedFileSummary file6 = getFile();
        return new FileData(i, uri, str, str2, str3, str4, z, z2, z3, fileId, id, engagementId, contactId, dealId, businessId, documentCategory, file6 != null ? file6.getDocumentSubCategory() : null, null, null, false, null, null, null, null, null, null, null, null, 268304384, null);
    }

    public FileObjectRelationshipSummary(fileObjectRelationship fileobjectrelationship) {
        sq8.m48649h(fileobjectrelationship, "underlyingFileObjectRelationship");
        this.underlyingFileObjectRelationship = fileobjectrelationship;
    }

    public /* synthetic */ FileObjectRelationshipSummary(fileObjectRelationship fileobjectrelationship, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : fileobjectrelationship);
    }
}
