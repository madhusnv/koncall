package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.Template;
import ai.salesmax.services.model.ModelUploadedFileConnection;
import com.amazonaws.amplify.generated.graphql.CreateUploadedFileMutation;
import com.amazonaws.amplify.generated.graphql.DeleteUploadedFileMutation;
import com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery;
import com.amazonaws.amplify.generated.graphql.SearchUploadedFilesQuery;
import com.amazonaws.amplify.generated.graphql.UpdateUploadedFileMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.CreateUploadedFileInput;
import type.DeleteUploadedFileInput;
import type.HasParent;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;
import type.SearchableUploadedFileFilterInput;
import type.SearchableUploadedFileSortInput;
import type.SearchableUploadedFileSortableFields;
import type.UpdateUploadedFileInput;

/* loaded from: classes.dex */
public interface cwc extends me1 {
    static /* synthetic */ boolean B2(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Cb(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ SearchUploadedFilesQuery Ck(SearchUploadedFilesQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    static /* synthetic */ Map Cu(Map map) {
        return (Map) map.get("getUploadedFile");
    }

    static /* synthetic */ Map D7(Map map) {
        return (Map) map.get("searchUploadedFiles");
    }

    static /* synthetic */ boolean Dy(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ ryh Gy(ModelUploadedFileConnection modelUploadedFileConnection) {
        return uyh.of(modelUploadedFileConnection.getItems(), modelUploadedFileConnection.getNextToken());
    }

    static /* synthetic */ SearchableUploadedFileFilterInput Hx(String str) {
        return SearchableUploadedFileFilterInput.builder().id(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    static /* synthetic */ boolean Im(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelUploadedFileConnection Iy(Map map) {
        return (ModelUploadedFileConnection) sf(map, ModelUploadedFileConnection.class);
    }

    static /* synthetic */ boolean Mi(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Nl(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Nz(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Oa(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Oo(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Or(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Qn(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean R1(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean T9(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Ti(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Tz(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Xc(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new tvc(this), ryhVar, i);
    }

    static /* synthetic */ boolean Y6(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Z4(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ Map as(Map map) {
        map.remove("childFiles");
        map.remove("associations");
        return map;
    }

    static /* synthetic */ boolean bs(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean dv(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean f0(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean f4(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean fd(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean ix(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean o9(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean ol(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean ox(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean pg(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean qc(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean s7(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default UploadedFile vr(Map map) {
        return (UploadedFile) sf(map, UploadedFile.class);
    }

    static /* synthetic */ boolean w8(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean xj(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean zn(String str) {
        return !StringUtils.isBlank(str);
    }

    default x6c Cm(Template template) {
        final UpdateUploadedFileInput.Builder builderAccountId = UpdateUploadedFileInput.builder().accountId(on());
        Optional optionalFilter = Optional.ofNullable(template.getDescription()).filter(new Predicate() { // from class: o.uuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Tz((String) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        optionalFilter.ifPresent(new ysc(builderAccountId));
        Optional.ofNullable(template.getTemplateType()).filter(new Predicate() { // from class: o.hvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.ox((String) obj);
            }
        }).ifPresent(new usc(builderAccountId));
        Optional.ofNullable(template.getTemplateBody()).filter(new Predicate() { // from class: o.ivc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.f4((String) obj);
            }
        }).ifPresent(new qsc(builderAccountId));
        Optional.ofNullable(template.getTemplateTitle()).filter(new Predicate() { // from class: o.jvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.R1((String) obj);
            }
        }).ifPresent(new ssc(builderAccountId));
        Optional.ofNullable(template.getDocumentCategory()).filter(new Predicate() { // from class: o.kvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.f0((String) obj);
            }
        }).ifPresent(new atc(builderAccountId));
        Optional.ofNullable(template.getFileUrl()).filter(new Predicate() { // from class: o.vuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.pg((String) obj);
            }
        }).ifPresent(new itc(builderAccountId));
        Optional.ofNullable(template.getFileStorageDestination()).filter(new Predicate() { // from class: o.wuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.fd((String) obj);
            }
        }).ifPresent(new zsc(builderAccountId));
        Optional.ofNullable(template.getUploadedById()).filter(new Predicate() { // from class: o.xuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Oa((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.yuc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.uploadedById((String) obj);
            }
        });
        Optional.ofNullable(template.getUploadSource()).filter(new Predicate() { // from class: o.zuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.w8((String) obj);
            }
        }).ifPresent(new lvc(builderAccountId));
        Optional.ofNullable(template.getFileName()).filter(new Predicate() { // from class: o.bvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Oo((String) obj);
            }
        }).ifPresent(new psc(builderAccountId));
        Optional.ofNullable(template.getFileMimeType()).filter(new Predicate() { // from class: o.cvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Qn((String) obj);
            }
        }).ifPresent(new wsc(builderAccountId));
        Optional.ofNullable(template.getId()).filter(new Predicate() { // from class: o.dvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Nl((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.evc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.id((String) obj);
            }
        });
        Optional.ofNullable(template.getScopeId()).filter(new Predicate() { // from class: o.fvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.bs((String) obj);
            }
        }).ifPresent(new wvc(builderAccountId));
        Optional.ofNullable(template.getScopeLevel()).filter(new Predicate() { // from class: o.gvc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.s7((String) obj);
            }
        }).map(new nsc()).ifPresent(new osc(builderAccountId));
        builderAccountId.updatedAt(a81.m16652g(a81.m16641B()));
        return graphqlMutation(UpdateUploadedFileMutation.builder().input(builderAccountId.build()).build(), "mutation UpdateUploadedFile($input: UpdateUploadedFileInput!, $condition: ModelUploadedFileConditionInput) {\n  updateUploadedFile(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n  }\n}", UpdateUploadedFileMutation.Data.class, new msc(), UploadedFile.class);
    }

    default x6c E0(UploadedFile uploadedFile) {
        return graphqlMutation(CreateUploadedFileMutation.builder().input(Y1(uploadedFile)).build(), "mutation CreateUploadedFile($input: CreateUploadedFileInput!, $condition: ModelUploadedFileConditionInput) {\n  createUploadedFile(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n  }\n}", CreateUploadedFileMutation.Data.class, new xsc(), UploadedFile.class);
    }

    default x6c M1(UploadedFile uploadedFile) {
        return graphqlMutation(UpdateUploadedFileMutation.builder().input(Mx(uploadedFile)).build(), "mutation UpdateUploadedFile($input: UpdateUploadedFileInput!, $condition: ModelUploadedFileConditionInput) {\n  updateUploadedFile(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n  }\n}", UpdateUploadedFileMutation.Data.class, new msc(), UploadedFile.class);
    }

    default UpdateUploadedFileInput Mx(UploadedFile uploadedFile) {
        final UpdateUploadedFileInput.Builder builderTemplateType = UpdateUploadedFileInput.builder().id(uploadedFile.getId()).accountId(on()).uploadedById(Eo()).updatedAt(null).templateType(DevicePublicKeyStringDef.NONE);
        Optional optionalOfNullable = Optional.ofNullable(uploadedFile.getFileUrl());
        Objects.requireNonNull(builderTemplateType);
        optionalOfNullable.ifPresent(new itc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileName()).ifPresent(new psc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileMimeType()).ifPresent(new wsc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDescription()).ifPresent(new ysc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileStorageDestination()).ifPresent(new zsc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDocumentCategory()).ifPresent(new atc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDocumentSubCategory()).ifPresent(new Consumer() { // from class: o.btc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.documentSubCategory((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getFileThumbnailUrl()).ifPresent(new Consumer() { // from class: o.ctc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.fileThumbnailUrl((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getFileMetaData()).ifPresent(new Consumer() { // from class: o.dtc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.fileMetaData((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getHasParent()).map(new etc()).map(new ttc()).ifPresent(new Consumer() { // from class: o.euc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.hasParent((HasParent) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getParentFile()).map(new lr2()).filter(new Predicate() { // from class: o.puc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Cb((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.avc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.parentFileId((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getUploadSource()).ifPresent(new lvc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getScopeId()).ifPresent(new wvc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getScopeLevel()).map(new bwc()).map(new nsc()).ifPresent(new osc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateBody()).ifPresent(new qsc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateExternalLink()).ifPresent(new Consumer() { // from class: o.rsc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.templateExternalLink((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getTemplateTitle()).ifPresent(new ssc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateType()).filter(new Predicate() { // from class: o.tsc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.o9((String) obj);
            }
        }).ifPresent(new usc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateBody()).ifPresent(new qsc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateLastUsed()).map(new ri()).ifPresent(new Consumer() { // from class: o.vsc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.templateLastUsed((String) obj);
            }
        });
        return builderTemplateType.build();
    }

    default s47 Xr(ryh ryhVar, String str, int i) {
        return au(Zp(uyh.of((SearchableUploadedFileFilterInput) ryhVar.f44265a, (SearchableUploadedFileSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.uvc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return cwc.Gy((ModelUploadedFileConnection) obj);
            }
        });
    }

    default CreateUploadedFileInput Y1(UploadedFile uploadedFile) {
        final CreateUploadedFileInput.Builder builderTemplateType = CreateUploadedFileInput.builder().accountId(on()).uploadedById(Eo()).updatedAt(null).templateType(DevicePublicKeyStringDef.NONE);
        Optional optionalOfNullable = Optional.ofNullable(uploadedFile.getFileUrl());
        Objects.requireNonNull(builderTemplateType);
        optionalOfNullable.ifPresent(new ftc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileName()).ifPresent(new otc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileMimeType()).ifPresent(new xtc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDescription()).ifPresent(new ytc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getFileStorageDestination()).ifPresent(new ztc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDocumentCategory()).ifPresent(new auc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getDocumentSubCategory()).ifPresent(new Consumer() { // from class: o.buc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.documentSubCategory((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getFileThumbnailUrl()).ifPresent(new Consumer() { // from class: o.cuc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.fileThumbnailUrl((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getFileMetaData()).ifPresent(new Consumer() { // from class: o.duc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.fileMetaData((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getHasParent()).map(new etc()).map(new ttc()).ifPresent(new Consumer() { // from class: o.gtc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.hasParent((HasParent) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getParentFile()).map(new lr2()).filter(new Predicate() { // from class: o.htc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Im((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.jtc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.parentFileId((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getId()).filter(new Predicate() { // from class: o.ktc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.qc((String) obj);
            }
        }).ifPresent(new ltc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getUploadSource()).ifPresent(new mtc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getScopeId()).ifPresent(new ntc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getScopeLevel()).map(new bwc()).map(new nsc()).ifPresent(new ptc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateBody()).ifPresent(new qtc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateExternalLink()).ifPresent(new Consumer() { // from class: o.rtc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.templateExternalLink((String) obj);
            }
        });
        Optional.ofNullable(uploadedFile.getTemplateTitle()).ifPresent(new stc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateType()).filter(new Predicate() { // from class: o.utc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.T9((String) obj);
            }
        }).ifPresent(new vtc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateBody()).ifPresent(new qtc(builderTemplateType));
        Optional.ofNullable(uploadedFile.getTemplateLastUsed()).map(new ri()).ifPresent(new Consumer() { // from class: o.wtc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderTemplateType.templateLastUsed((String) obj);
            }
        });
        return builderTemplateType.build();
    }

    default SimpleGraphQLRequest Zp(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableUploadedFileFilterInput searchableUploadedFileFilterInput = (SearchableUploadedFileFilterInput) ryhVar.f44265a;
        SearchableUploadedFileSortInput searchableUploadedFileSortInput = (SearchableUploadedFileSortInput) ryhVar.f44266b;
        final SearchUploadedFilesQuery.Builder builder = SearchUploadedFilesQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableUploadedFileFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.yvc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filter((SearchableUploadedFileFilterInput) obj);
            }
        });
        Optional.ofNullable(searchableUploadedFileSortInput).ifPresent(new Consumer() { // from class: o.zvc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sort((SearchableUploadedFileSortInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchUploadedFiles($filter: SearchableUploadedFileFilterInput, $sort: SearchableUploadedFileSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchUploadedFiles(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchUploadedFilesQuery) optional.map(new Function() { // from class: o.awc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cwc.Ck(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 au(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(u6()) : executeGraphQL(simpleGraphQLRequest).m55014i(new nvc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.vvc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return cwc.D7((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.xvc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f54362a.Iy((Map) obj);
            }
        }).m27845m();
    }

    default s47 bq(String str) {
        GetUploadedFileQuery getUploadedFileQueryBuild = GetUploadedFileQuery.builder().id(str).build();
        return executeGraphQL(new SimpleGraphQLRequest(getUploadedFileQueryBuild.queryDocument(), toVariablesMap(getUploadedFileQueryBuild), Map.class, new GsonVariablesSerializer())).m55014i(new nvc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ovc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return cwc.Cu((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.pvc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return cwc.as((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.qvc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f42486a.vr((Map) obj);
            }
        }).m27845m();
    }

    default s47 ob(final ryh ryhVar, final int i) {
        return s47.m47669H(new Callable() { // from class: o.svc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f46001a.Xc(ryhVar, i);
            }
        });
    }

    default s47 og(String str, List list, int i, String str2) {
        SearchableUploadedFileFilterInput searchableUploadedFileFilterInputBuild = SearchableUploadedFileFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).or(Arrays.asList(SearchableUploadedFileFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(on()).build()).templateType(SearchableStringFilterInput.builder().eq(str).build()).build(), SearchableUploadedFileFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(Eo()).build()).templateType(SearchableStringFilterInput.builder().eq(str).build()).build())).build();
        if (!StringUtils.isBlank(str2)) {
            String[] strArrSplit = str2.trim().split("\\s+");
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArrSplit) {
                String str4 = "*" + str3 + "*";
                arrayList.add(SearchableUploadedFileFilterInput.builder().templateTitle(SearchableStringFilterInput.builder().wildcard(str4).build()).build());
                arrayList.add(SearchableUploadedFileFilterInput.builder().templateBody(SearchableStringFilterInput.builder().wildcard(str4).build()).build());
            }
            searchableUploadedFileFilterInputBuild = SearchableUploadedFileFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).and(Arrays.asList(searchableUploadedFileFilterInputBuild, SearchableUploadedFileFilterInput.builder().or(arrayList).build())).build();
        }
        List<SearchableUploadedFileFilterInput> list2 = (List) ((List) Optional.ofNullable(list).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.mvc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cwc.Hx((String) obj);
            }
        }).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            searchableUploadedFileFilterInputBuild = SearchableUploadedFileFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).and(Arrays.asList(searchableUploadedFileFilterInputBuild, list2.size() > 1 ? SearchableUploadedFileFilterInput.builder().or(list2).build() : list2.get(0))).build();
        }
        return ob(uyh.of(searchableUploadedFileFilterInputBuild, SearchableUploadedFileSortInput.builder().field(SearchableUploadedFileSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i);
    }

    default x6c os(UploadedFile uploadedFile) {
        return Boolean.valueOf(Optional.ofNullable(uploadedFile.getId()).isPresent()).booleanValue() ? E0(uploadedFile) : M1(uploadedFile);
    }

    default x6c p8(String str) {
        return graphqlMutation(DeleteUploadedFileMutation.builder().input(DeleteUploadedFileInput.builder().id(str).build()).build(), "mutation DeleteUploadedFile($input: DeleteUploadedFileInput!, $condition: ModelUploadedFileConditionInput) {\n  deleteUploadedFile(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n  }\n}", DeleteUploadedFileMutation.Data.class, new Function() { // from class: o.rvc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DeleteUploadedFileMutation.Data) obj).deleteUploadedFile();
            }
        }, UploadedFile.class);
    }

    default ModelUploadedFileConnection u6() {
        return ModelUploadedFileConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default x6c vy(Template template) {
        final CreateUploadedFileInput.Builder builderAccountId = CreateUploadedFileInput.builder().accountId(on());
        Optional optionalOf = Optional.of(template.getDescription());
        Objects.requireNonNull(builderAccountId);
        optionalOf.ifPresent(new ytc(builderAccountId));
        Optional.ofNullable(template.getTemplateType()).filter(new Predicate() { // from class: o.luc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.zn((String) obj);
            }
        }).ifPresent(new vtc(builderAccountId));
        Optional.ofNullable(template.getTemplateBody()).filter(new Predicate() { // from class: o.quc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.ol((String) obj);
            }
        }).ifPresent(new qtc(builderAccountId));
        Optional.ofNullable(template.getTemplateTitle()).filter(new Predicate() { // from class: o.ruc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Ti((String) obj);
            }
        }).ifPresent(new stc(builderAccountId));
        Optional.ofNullable(template.getDocumentCategory()).filter(new Predicate() { // from class: o.suc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Mi((String) obj);
            }
        }).ifPresent(new auc(builderAccountId));
        Optional.ofNullable(template.getFileUrl()).filter(new Predicate() { // from class: o.tuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Dy((String) obj);
            }
        }).ifPresent(new ftc(builderAccountId));
        Optional.ofNullable(template.getFileStorageDestination()).filter(new Predicate() { // from class: o.fuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.B2((String) obj);
            }
        }).ifPresent(new ztc(builderAccountId));
        Optional.ofNullable(template.getUploadedById()).filter(new Predicate() { // from class: o.guc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Z4((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.huc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.uploadedById((String) obj);
            }
        });
        Optional.ofNullable(template.getUploadSource()).filter(new Predicate() { // from class: o.iuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Y6((String) obj);
            }
        }).ifPresent(new mtc(builderAccountId));
        Optional.ofNullable(template.getFileName()).filter(new Predicate() { // from class: o.juc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Or((String) obj);
            }
        }).ifPresent(new otc(builderAccountId));
        Optional.ofNullable(template.getFileMimeType()).filter(new Predicate() { // from class: o.kuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.dv((String) obj);
            }
        }).ifPresent(new xtc(builderAccountId));
        Optional.ofNullable(template.getId()).filter(new Predicate() { // from class: o.muc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.ix((String) obj);
            }
        }).ifPresent(new ltc(builderAccountId));
        Optional.ofNullable(template.getScopeId()).filter(new Predicate() { // from class: o.nuc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.Nz((String) obj);
            }
        }).ifPresent(new ntc(builderAccountId));
        Optional.ofNullable(template.getScopeLevel()).filter(new Predicate() { // from class: o.ouc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cwc.xj((String) obj);
            }
        }).map(new nsc()).ifPresent(new ptc(builderAccountId));
        builderAccountId.updatedAt(a81.m16652g(a81.m16641B()));
        return graphqlMutation(CreateUploadedFileMutation.builder().input(builderAccountId.build()).build(), "mutation CreateUploadedFile($input: CreateUploadedFileInput!, $condition: ModelUploadedFileConditionInput) {\n  createUploadedFile(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n  }\n}", CreateUploadedFileMutation.Data.class, new xsc(), UploadedFile.class);
    }
}
