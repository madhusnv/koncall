package p001o;

import ai.salesmax.services.model.ModelFileObjectRelationshipConnection;
import com.amazonaws.amplify.generated.graphql.CreateFileObjectRelationshipMutation;
import com.amazonaws.amplify.generated.graphql.DeleteFileObjectRelationshipMutation;
import com.amazonaws.amplify.generated.graphql.GetFilesByContactQuery;
import com.amazonaws.amplify.generated.graphql.GetFilesByEngagementQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Deal;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.datastore.generated.model.fileObjectRelationship;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import type.CreateFileObjectRelationshipInput;
import type.DeleteFileObjectRelationshipInput;
import type.ModelSortDirection;

/* loaded from: classes.dex */
public interface py6 extends me1 {
    static /* synthetic */ boolean Lx(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean O8(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: R */
    static /* synthetic */ Map m44282R(Map map) {
        return (Map) map.get("getFilesByEngagement");
    }

    static /* synthetic */ ryh S8(ModelFileObjectRelationshipConnection modelFileObjectRelationshipConnection) {
        return uyh.of(modelFileObjectRelationshipConnection.getItems(), modelFileObjectRelationshipConnection.getNextToken());
    }

    static /* synthetic */ Map X7(Map map) {
        return (Map) map.get("getFilesByContact");
    }

    static /* synthetic */ boolean d2(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: g */
    static /* synthetic */ boolean m44283g(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ ryh j7(ModelFileObjectRelationshipConnection modelFileObjectRelationshipConnection) {
        return uyh.of(modelFileObjectRelationshipConnection.getItems(), modelFileObjectRelationshipConnection.getNextToken());
    }

    static /* synthetic */ boolean ut(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean w4(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean y6(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean zv(String str) {
        return !StringUtils.isBlank(str);
    }

    default x6c Jv(final String str) {
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.jy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f31249a.zk(str, i, (String) obj);
            }
        }).h0();
    }

    default x6c Kl(String str) {
        return graphqlMutation(DeleteFileObjectRelationshipMutation.builder().input(DeleteFileObjectRelationshipInput.builder().id(str).build()).build(), DeleteFileObjectRelationshipMutation.Data.class, new Function() { // from class: o.ky6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DeleteFileObjectRelationshipMutation.Data) obj).deleteFileObjectRelationship();
            }
        }, fileObjectRelationship.class);
    }

    default x6c V0(final String str) {
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.zw6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f57807a.Lj(str, i, (String) obj);
            }
        }).h0();
    }

    /* renamed from: gc, reason: merged with bridge method [inline-methods] */
    default s47 zk(String str, String str2, int i) {
        final GetFilesByContactQuery.Builder builderSortDirection = GetFilesByContactQuery.builder().contactId(str).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.ly6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderSortDirection.build(), "query GetFilesByContact($contactId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelfileObjectRelationshipFilterInput, $limit: Int, $nextToken: String) {\n  getFilesByContact(contactId: $contactId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n    __typename\n    id\n      contactId\n      engagementId\n      businessId\n      dealId\n      fileId\n    accountId\n    createdAt\n    updatedAt\n    file {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n  }\n}", Map.class, new Function() { // from class: o.my6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return py6.X7((Map) obj);
            }
        }, ModelFileObjectRelationshipConnection.class).d0(new rl7() { // from class: o.ny6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return py6.S8((ModelFileObjectRelationshipConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c pe(fileObjectRelationship fileobjectrelationship) {
        return graphqlMutation(CreateFileObjectRelationshipMutation.builder().input(y4(fileobjectrelationship)).build(), "mutation CreateFileObjectRelationship($input: CreateFileObjectRelationshipInput!, $condition: ModelfileObjectRelationshipConditionInput) {\n  createFileObjectRelationship(input: $input, condition: $condition) {\n    id\n    accountId\n    fileId\n    fileUrl\n    contactId\n    engagementId\n    businessId\n    dealId\n    productId\n    createdAt\n    updatedAt\n    parentObjectId\n    parentObjectType\n    fieldName\n    inputContext\n    transcription\n    translatedTranscription\n  }\n}", CreateFileObjectRelationshipMutation.Data.class, new Function() { // from class: o.ux6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateFileObjectRelationshipMutation.Data) obj).createFileObjectRelationship();
            }
        }, fileObjectRelationship.class);
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    default s47 Lj(String str, String str2, int i) {
        final GetFilesByEngagementQuery.Builder builderSortDirection = GetFilesByEngagementQuery.builder().engagementId(str).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.kx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderSortDirection.build(), "query GetFilesByEngagement($engagementId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelfileObjectRelationshipFilterInput, $limit: Int, $nextToken: String) {\n  getFilesByEngagement(engagementId: $engagementId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n    __typename\n    id\n      contactId\n      engagementId\n      businessId\n      dealId\n      fileId\n    accountId\n    createdAt\n    updatedAt\n    file {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n  }\n}", Map.class, new Function() { // from class: o.vx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return py6.m44282R((Map) obj);
            }
        }, ModelFileObjectRelationshipConnection.class).d0(new rl7() { // from class: o.gy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return py6.j7((ModelFileObjectRelationshipConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c ui(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        final fileObjectRelationship.BuildStep buildStepAccount = fileObjectRelationship.builder().file(UploadedFile.justId(str5)).account(Account.justId(on()));
        if (StringUtils.isBlank(str6) && "Engagement".equals(str7)) {
            buildStepAccount.parentObjectId(str4);
        } else {
            Optional optionalFilter = Optional.ofNullable(str6).filter(new Predicate() { // from class: o.oy6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return py6.O8((String) obj);
                }
            });
            Objects.requireNonNull(buildStepAccount);
            optionalFilter.ifPresent(new Consumer() { // from class: o.lx6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    buildStepAccount.parentObjectId((String) obj);
                }
            });
        }
        Optional map = Optional.ofNullable(str).filter(new Predicate() { // from class: o.mx6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.y6((String) obj);
            }
        }).map(new Function() { // from class: o.nx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Contact.justId((String) obj);
            }
        });
        Objects.requireNonNull(buildStepAccount);
        map.ifPresent(new Consumer() { // from class: o.ox6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.contact((Contact) obj);
            }
        });
        Optional.ofNullable(str2).filter(new Predicate() { // from class: o.px6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.w4((String) obj);
            }
        }).map(new Function() { // from class: o.qx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Business.justId((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.rx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.business((Business) obj);
            }
        });
        Optional.ofNullable(str4).filter(new Predicate() { // from class: o.sx6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.d2((String) obj);
            }
        }).map(new Function() { // from class: o.tx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Engagement.justId((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.ax6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.engagement((Engagement) obj);
            }
        });
        Optional.ofNullable(str3).filter(new Predicate() { // from class: o.bx6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.m44283g((String) obj);
            }
        }).map(new Function() { // from class: o.cx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Deal.justId((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.dx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.deal((Deal) obj);
            }
        });
        Optional.ofNullable(str7).filter(new Predicate() { // from class: o.ex6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.Lx((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.fx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.parentObjectType((String) obj);
            }
        });
        Optional.ofNullable(str8).filter(new Predicate() { // from class: o.gx6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.zv((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.fieldName((String) obj);
            }
        });
        Optional.ofNullable(str9).filter(new Predicate() { // from class: o.ix6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return py6.ut((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.jx6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buildStepAccount.inputContext((String) obj);
            }
        });
        return pe(buildStepAccount.build());
    }

    default CreateFileObjectRelationshipInput y4(fileObjectRelationship fileobjectrelationship) {
        final CreateFileObjectRelationshipInput.Builder builder = CreateFileObjectRelationshipInput.builder();
        builder.accountId(on());
        Optional.ofNullable(fileobjectrelationship.getBusiness()).map(new Function() { // from class: o.wx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Business) obj).getId();
            }
        }).ifPresent(new Consumer() { // from class: o.cy6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.businessId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getContact()).map(new hu2()).ifPresent(new Consumer() { // from class: o.dy6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.contactId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getDeal()).map(new Function() { // from class: o.ey6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Deal) obj).getId();
            }
        }).ifPresent(new Consumer() { // from class: o.fy6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.dealId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getEngagement()).map(new pj3()).ifPresent(new Consumer() { // from class: o.hy6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.engagementId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getFile()).map(new lr2()).ifPresent(new Consumer() { // from class: o.iy6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.fileId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getId()).map(new Function() { // from class: o.xx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builder.id((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getParentObjectId()).map(new Function() { // from class: o.yx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builder.parentObjectId((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getParentObjectType()).map(new Function() { // from class: o.zx6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builder.parentObjectType((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getInputContext()).map(new Function() { // from class: o.ay6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builder.inputContext((String) obj);
            }
        });
        Optional.ofNullable(fileobjectrelationship.getFieldName()).map(new Function() { // from class: o.by6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builder.fieldName((String) obj);
            }
        });
        return builder.build();
    }
}
