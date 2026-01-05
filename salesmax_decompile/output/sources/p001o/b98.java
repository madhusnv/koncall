package p001o;

import ai.salesmax.services.model.ModelProductServiceConnection;
import com.amazonaws.amplify.generated.graphql.CreateProductServiceMutation;
import com.amazonaws.amplify.generated.graphql.ListChildProductsQuery;
import com.amazonaws.amplify.generated.graphql.ListProductServicesQuery;
import com.amazonaws.amplify.generated.graphql.UpdateProductServiceMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.ProductService;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import type.CreateProductServiceInput;
import type.ModelIDInput;
import type.ModelProductServiceFilterInput;
import type.ProductServiceType;
import type.UpdateProductServiceInput;

/* loaded from: classes.dex */
public interface b98 extends me1 {
    static /* synthetic */ boolean Ca(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Ec(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Et(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Gi(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Iz(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelProductServiceConnection O3(Map map) {
        return (ModelProductServiceConnection) sf(map.get("listChildProducts"), ModelProductServiceConnection.class);
    }

    static /* synthetic */ boolean P8(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ ryh R2(ModelProductServiceConnection modelProductServiceConnection) {
        return uyh.of(modelProductServiceConnection.getItems(), modelProductServiceConnection.getNextToken());
    }

    static /* synthetic */ boolean Tx(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Uj(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Uq(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ ryh Zg(ModelProductServiceConnection modelProductServiceConnection) {
        return uyh.of(modelProductServiceConnection.getItems(), modelProductServiceConnection.getNextToken());
    }

    static /* synthetic */ boolean Zw(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 ax(String str, String str2, int i, String str3) {
        return Gf(uyh.of(str, str2), str3, i);
    }

    static /* synthetic */ boolean bw(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean c3(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean da(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean et(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean hi(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelProductServiceConnection hn(Map map) {
        return (ModelProductServiceConnection) sf(map.get("listProductServices"), ModelProductServiceConnection.class);
    }

    static /* synthetic */ boolean hy(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean km(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean kq(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean rc(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean rp(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean vm(String str) {
        return !StringUtils.isBlank(str);
    }

    default s47 El(final String str) {
        final String strOn = on();
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.l88
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f33443a.ax(strOn, str, i, (String) obj);
            }
        });
    }

    default x6c G6(ProductService productService) {
        return StringUtils.isBlank(productService.getId()) ? ar(productService) : br(productService);
    }

    default s47 Gf(ryh ryhVar, String str, int i) {
        final ListChildProductsQuery.Builder builderParentProductId = ListChildProductsQuery.builder().filter(ModelProductServiceFilterInput.builder().accountId(ModelIDInput.builder().eq((String) ryhVar.f44265a).build()).build()).limit(Integer.valueOf(i)).parentProductId((String) ryhVar.f44266b);
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(builderParentProductId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.t88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderParentProductId.nextToken((String) obj);
            }
        });
        ListChildProductsQuery listChildProductsQueryBuild = builderParentProductId.build();
        return graphqlQuery(listChildProductsQueryBuild, listChildProductsQueryBuild.queryDocument(), Map.class, new Function() { // from class: o.u88
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f48555a.O3((Map) obj);
            }
        }, ModelProductServiceConnection.class).d0(new rl7() { // from class: o.v88
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return b98.Zg((ModelProductServiceConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default CreateProductServiceInput T8(ProductService productService) {
        final CreateProductServiceInput.Builder builder = CreateProductServiceInput.builder();
        Optional optionalOfNullable = Optional.ofNullable(on());
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.s78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.accountId((String) obj);
            }
        });
        Optional.ofNullable(Eo()).filter(new Predicate() { // from class: o.d88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.rc((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.k88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.createdBy((String) obj);
            }
        });
        Optional.ofNullable(Eo()).filter(new Predicate() { // from class: o.m88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.da((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.n88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.updatedBy((String) obj);
            }
        });
        Optional.ofNullable(productService.getProductPicture()).filter(new Predicate() { // from class: o.o88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Et((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.p88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.productPicture((String) obj);
            }
        });
        Optional.ofNullable(productService.getDescription()).filter(new Predicate() { // from class: o.q88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.bw((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.r88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.description((String) obj);
            }
        });
        Optional.ofNullable(productService.getName()).filter(new Predicate() { // from class: o.s88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Tx((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.t78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.name((String) obj);
            }
        });
        Optional.ofNullable(productService.getCurrency()).filter(new Predicate() { // from class: o.u78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.hi((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.v78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.currency((String) obj);
            }
        });
        Optional.ofNullable(productService.getStandardPricePerUnit()).filter(new Predicate() { // from class: o.w78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Uj((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.x78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.standardPricePerUnit((String) obj);
            }
        });
        Optional.ofNullable(productService.getSkuCode()).filter(new Predicate() { // from class: o.y78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.vm((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.z78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.skuCode((String) obj);
            }
        });
        Optional.ofNullable(productService.getIncrementBy()).ifPresent(new Consumer() { // from class: o.b88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.incrementBy((Integer) obj);
            }
        });
        Optional.ofNullable(productService.getParentProduct()).map(new w68()).filter(new Predicate() { // from class: o.c88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.kq((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.e88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.parentProductId((String) obj);
            }
        });
        Optional.ofNullable(productService.getMeasurementUnit()).filter(new Predicate() { // from class: o.f88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Ca((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.g88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.measurementUnit((String) obj);
            }
        });
        Optional.ofNullable(productService.getHsCode()).filter(new Predicate() { // from class: o.h88
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Ec((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.i88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.hsCode((String) obj);
            }
        });
        Optional.ofNullable(productService.getType()).map(new f78()).map(new h78()).ifPresent(new Consumer() { // from class: o.j88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.type((ProductServiceType) obj);
            }
        });
        return builder.build();
    }

    default x6c ar(ProductService productService) {
        return graphqlMutation(CreateProductServiceMutation.builder().input(T8(productService)).build(), "mutation CreateProductService($input: CreateProductServiceInput!, $condition: ModelProductServiceConditionInput) {\n  createProductService(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n  }\n}", CreateProductServiceMutation.Data.class, new Function() { // from class: o.w88
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateProductServiceMutation.Data) obj).createProductService();
            }
        }, ProductService.class);
    }

    default x6c br(ProductService productService) {
        return graphqlMutation(UpdateProductServiceMutation.builder().input(df(productService)).build(), "mutation UpdateProductService($input: UpdateProductServiceInput!, $condition: ModelProductServiceConditionInput) {\n  updateProductService(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n  }\n}", UpdateProductServiceMutation.Data.class, new Function() { // from class: o.x88
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateProductServiceMutation.Data) obj).updateProductService();
            }
        }, ProductService.class);
    }

    default UpdateProductServiceInput df(ProductService productService) {
        final UpdateProductServiceInput.Builder builderId = UpdateProductServiceInput.builder().id(productService.getId());
        Optional optionalOfNullable = Optional.ofNullable(Eo());
        Objects.requireNonNull(builderId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.y88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.updatedBy((String) obj);
            }
        });
        Optional.ofNullable(productService.getProductPicture()).filter(new Predicate() { // from class: o.c78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.P8((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.j78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.productPicture((String) obj);
            }
        });
        Optional.ofNullable(productService.getDescription()).filter(new Predicate() { // from class: o.k78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.c3((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.l78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.description((String) obj);
            }
        });
        Optional.ofNullable(productService.getName()).filter(new Predicate() { // from class: o.m78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Zw((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.n78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.name((String) obj);
            }
        });
        Optional.ofNullable(productService.getCurrency()).filter(new Predicate() { // from class: o.o78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Iz((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.q78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.currency((String) obj);
            }
        });
        Optional.ofNullable(productService.getStandardPricePerUnit()).filter(new Predicate() { // from class: o.r78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.hy((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.z88
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.standardPricePerUnit((String) obj);
            }
        });
        Optional.ofNullable(productService.getSkuCode()).filter(new Predicate() { // from class: o.a98
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Uq((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.u68
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.skuCode((String) obj);
            }
        });
        Optional.ofNullable(productService.getIncrementBy()).ifPresent(new Consumer() { // from class: o.v68
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.incrementBy((Integer) obj);
            }
        });
        Optional.ofNullable(productService.getParentProduct()).map(new w68()).filter(new Predicate() { // from class: o.x68
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.et((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.y68
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.parentProductId((String) obj);
            }
        });
        Optional.ofNullable(productService.getMeasurementUnit()).filter(new Predicate() { // from class: o.z68
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.km((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.a78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.measurementUnit((String) obj);
            }
        });
        Optional.ofNullable(productService.getHsCode()).filter(new Predicate() { // from class: o.b78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.rp((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.d78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.hsCode((String) obj);
            }
        });
        Optional.ofNullable(productService.getType()).map(new f78()).filter(new Predicate() { // from class: o.g78
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b98.Gi((String) obj);
            }
        }).map(new h78()).ifPresent(new Consumer() { // from class: o.i78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.type((ProductServiceType) obj);
            }
        });
        return builderId.build();
    }

    /* renamed from: m3, reason: merged with bridge method [inline-methods] */
    default s47 Te(String str, String str2, int i) {
        final ListProductServicesQuery.Builder builderLimit = ListProductServicesQuery.builder().filter(ModelProductServiceFilterInput.builder().accountId(ModelIDInput.builder().eq(str).build()).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.e78
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        ListProductServicesQuery listProductServicesQueryBuild = builderLimit.build();
        return graphqlQuery(listProductServicesQueryBuild, listProductServicesQueryBuild.queryDocument(), Map.class, new Function() { // from class: o.p78
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f39512a.hn((Map) obj);
            }
        }, ModelProductServiceConnection.class).d0(new rl7() { // from class: o.a88
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return b98.R2((ModelProductServiceConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default s47 wk() {
        final String strOn = on();
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.t68
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f46501a.Te(strOn, i, (String) obj);
            }
        });
    }
}
