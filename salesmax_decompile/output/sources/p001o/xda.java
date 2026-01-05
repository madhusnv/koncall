package p001o;

import ai.salesmax.model.TrackingUrl;
import com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation;
import com.amplifyframework.datastore.generated.model.LinkShare;
import java.util.Objects;
import java.util.function.Function;
import type.CreateLinkShareInput;

/* loaded from: classes.dex */
public interface xda extends me1 {
    default x6c T1(TrackingUrl trackingUrl) {
        CreateLinkShareInput.Builder builderSharedById = CreateLinkShareInput.builder().accountId(on()).sharedById(Eo());
        String engagementId = trackingUrl.getEngagementId();
        Objects.requireNonNull(engagementId);
        CreateLinkShareInput.Builder builderEngagementId = builderSharedById.engagementId(engagementId);
        String contactId = trackingUrl.getContactId();
        Objects.requireNonNull(contactId);
        return graphqlMutation(CreateLinkShareMutation.builder().input(builderEngagementId.contactId(contactId).fileKey(trackingUrl.getFileKey()).mimeType(trackingUrl.getMimeType()).contactName(trackingUrl.getContactName()).templateTitle(trackingUrl.getTemplateTitle()).sharedByName(trackingUrl.getSharedByName()).sharedByEmail(trackingUrl.getSharedByEmail()).sharedByNumber(trackingUrl.getSharedByNumber()).accountName(trackingUrl.getAccountName()).accountLogoUrl(trackingUrl.getAccountLogoUrl()).accountWebsite(trackingUrl.getAccountWebsite()).build()).build(), CreateLinkShareMutation.Data.class, new Function() { // from class: o.wda
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateLinkShareMutation.Data) obj).createLinkShare();
            }
        }, LinkShare.class);
    }
}
