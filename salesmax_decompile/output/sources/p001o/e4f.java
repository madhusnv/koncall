package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelSavedTableViewsConnection;
import com.amazonaws.amplify.generated.graphql.SearchSavedTableViewssQuery;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.SavedTableViews;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import type.LeadLifecycleStage;
import type.SearchableBooleanFilterInput;
import type.SearchableContactFilterInput;
import type.SearchableContactSortInput;
import type.SearchableContactSortableFields;
import type.SearchableCustomAttributeFilterInput;
import type.SearchableIDFilterInput;
import type.SearchableIntFilterInput;
import type.SearchableSavedTableViewsFilterInput;
import type.SearchableSavedTableViewsSortInput;
import type.SearchableSavedTableViewsSortableFields;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public interface e4f extends u2f {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ryh Al(SearchableContactFilterInput searchableContactFilterInput, Map map) {
        String str = (String) map.get("colId");
        String str2 = (String) map.get("sort");
        if (str.startsWith("##CUSTOM##")) {
            final SearchableContactFilterInput.Builder builderCustomAttributesSortable = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).customAttributesSortable(SearchableIDFilterInput.builder().eq(str.replace("##CUSTOM##", "")).build());
            Optional.ofNullable(searchableContactFilterInput).ifPresent(new Consumer() { // from class: o.k3f
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    e4f.t7(builderCustomAttributesSortable, (SearchableContactFilterInput) obj);
                }
            });
            searchableContactFilterInput = builderCustomAttributesSortable.build();
            str = "updatedAt";
        }
        return uyh.of(searchableContactFilterInput, SearchableContactSortInput.builder().direction(SearchableSortDirection.valueOf(str2)).field(SearchableContactSortableFields.valueOf(str)).build());
    }

    static SearchableStringFilterInput Dm(String str, String str2) {
        return "exists".equals(str) ? nj(str, str2, N0(str2).booleanValue(), Collections.emptyList()) : nj(str, str2, true, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 Dr(SearchableSavedTableViewsFilterInput searchableSavedTableViewsFilterInput, int i, String str) {
        return O4(uyh.of(searchableSavedTableViewsFilterInput, null), str, i);
    }

    static SearchableContactFilterInput Dv(Map map, String str) {
        return T2(map, str, Optional.empty());
    }

    static String Gh(vk7 vk7Var) {
        try {
            return (String) vk7Var.apply();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static /* synthetic */ Number Gk(Object obj) {
        return (Number) obj;
    }

    static /* synthetic */ Map Hd(Object obj) {
        return Xx((Map) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Ki(SearchableSavedTableViewsFilterInput searchableSavedTableViewsFilterInput, SearchableSavedTableViewsSortInput searchableSavedTableViewsSortInput, int i) {
        return new PaginatedTokenResults(new w3f(this), uyh.of(searchableSavedTableViewsFilterInput, searchableSavedTableViewsSortInput), i);
    }

    static SearchableIntFilterInput Lq(String str, Integer num, List list) {
        str.hashCode();
        switch (str) {
            case "eq":
                return SearchableIntFilterInput.builder().eq(num).build();
            case "gt":
                return SearchableIntFilterInput.builder().gt(num).build();
            case "lt":
                return SearchableIntFilterInput.builder().lt(num).build();
            case "ne":
                return SearchableIntFilterInput.builder().ne(num).build();
            case "gte":
                return SearchableIntFilterInput.builder().gte(num).build();
            case "lte":
                return SearchableIntFilterInput.builder().lte(num).build();
            case "range":
                return SearchableIntFilterInput.builder().range(list).build();
            default:
                return SearchableIntFilterInput.builder().eq(num).build();
        }
    }

    static Boolean N0(final Object obj) {
        try {
            return (Boolean) Optional.ofNullable(obj).filter(new Predicate() { // from class: o.x2f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return e4f.ee(obj2);
                }
            }).map(new Function() { // from class: o.y2f
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return e4f.lk(obj2);
                }
            }).orElseGet(new Supplier() { // from class: o.z2f
                @Override // java.util.function.Supplier
                public final Object get() {
                    return e4f.nv(obj);
                }
            });
        } catch (Throwable unused) {
            String.format("Couldn't parse text %s as noolean", obj);
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ Temporal.Date Nb(String str) {
        return new Temporal.Date(str);
    }

    static /* synthetic */ boolean Qi(Object obj) {
        return obj instanceof String;
    }

    static /* synthetic */ ryh Rl(SearchableContactFilterInput searchableContactFilterInput) {
        return uyh.of(searchableContactFilterInput, SearchableContactSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableContactSortableFields.updatedAt).build());
    }

    static /* synthetic */ boolean S1(Map map) {
        return !StringUtils.isBlank((String) map.getOrDefault("sort", ""));
    }

    static SearchableContactFilterInput T2(Map map, String str, Optional optional) {
        Set<String> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList((Collection) optional.orElse(Collections.emptyList()));
        for (String str2 : setKeySet) {
            Map map2 = (Map) map.get(str2);
            if (map2.containsKey("conditions")) {
                String str3 = (String) map2.getOrDefault("operator", "OR");
                List list = (List) map2.getOrDefault("conditions", Collections.emptyList());
                if (list.size() > 0) {
                    arrayList.add(e8(str2, list, str3));
                }
            } else {
                Map mapNu = nu(str2, map2);
                Gson gson = ja8.f30035c;
                arrayList.add(((SearchableContactFilterInput.Builder) gson.fromJson(gson.toJson(mapNu), SearchableContactFilterInput.Builder.class)).build());
            }
        }
        final SearchableContactFilterInput.Builder builder = SearchableContactFilterInput.builder();
        Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.v2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                e4f.ss(builder, (String) obj);
            }
        });
        Optional optionalFilter = Optional.of(arrayList).filter(new Predicate() { // from class: o.g3f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return e4f.qe((List) obj);
            }
        });
        Objects.requireNonNull(builder);
        optionalFilter.ifPresent(new Consumer() { // from class: o.r3f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.and((List) obj);
            }
        });
        return builder.build();
    }

    static /* synthetic */ SearchableContactFilterInput.Builder Wc(String str) {
        return (SearchableContactFilterInput.Builder) ja8.f30035c.fromJson(str, SearchableContactFilterInput.Builder.class);
    }

    static /* synthetic */ boolean Xm(Object obj) {
        return obj instanceof Number;
    }

    static Map Xx(Map map) {
        Set<String> setKeySet = map.keySet();
        HashMap map2 = new HashMap();
        for (String str : setKeySet) {
            HashMap map3 = new HashMap();
            Object orDefault = map.getOrDefault(str, null);
            map3.put("defined", Boolean.valueOf(!Objects.isNull(orDefault)));
            if (orDefault instanceof Map) {
                orDefault = Xx((Map) orDefault);
            } else if (orDefault instanceof List) {
                Stream map4 = ((List) orDefault).stream().map(new Function() { // from class: o.e3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return e4f.Hd(obj);
                    }
                });
                final Gson gson = ja8.f30035c;
                Objects.requireNonNull(gson);
                orDefault = map4.map(new Function() { // from class: o.f3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return gson.toJson((Map) obj);
                    }
                }).map(new Function() { // from class: o.h3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return e4f.Wc((String) obj);
                    }
                }).map(new Function() { // from class: o.i3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((SearchableContactFilterInput.Builder) obj).build();
                    }
                }).collect(Collectors.toList());
            }
            map3.put("value", orDefault);
            map2.put(str, map3);
        }
        return map2;
    }

    static /* synthetic */ ryh Yc(ModelSavedTableViewsConnection modelSavedTableViewsConnection) {
        return uyh.of(modelSavedTableViewsConnection.getItems(), modelSavedTableViewsConnection.getNextToken());
    }

    static /* synthetic */ String a4(String str, final String str2) {
        return a81.m16653h(Long.valueOf(a81.m16661p(((Temporal.Date) Optional.ofNullable(str).map(new Function() { // from class: o.d4f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Temporal.Date((String) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.w2f
            @Override // java.util.function.Supplier
            public final Object get() {
                return e4f.Nb(str2);
            }
        })).toDate())));
    }

    /* renamed from: c */
    static /* synthetic */ List m24300c(SearchableContactFilterInput searchableContactFilterInput) {
        return Arrays.asList(searchableContactFilterInput);
    }

    static SearchableContactFilterInput e8(String str, List list, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapNu = nu(str, (Map) it.next());
            Gson gson = ja8.f30035c;
            arrayList.add(((SearchableContactFilterInput.Builder) gson.fromJson(gson.toJson(mapNu), SearchableContactFilterInput.Builder.class)).build());
        }
        return "OR".equalsIgnoreCase(str2) ? SearchableContactFilterInput.builder().or(arrayList).build() : SearchableContactFilterInput.builder().and(arrayList).build();
    }

    static /* synthetic */ boolean ee(Object obj) {
        return obj instanceof Boolean;
    }

    static /* synthetic */ boolean ei(Object obj) {
        return obj instanceof String;
    }

    static /* synthetic */ Integer lg(Object obj) {
        return Integer.valueOf(Integer.parseInt((String) obj));
    }

    static /* synthetic */ Boolean lk(Object obj) {
        return (Boolean) obj;
    }

    static /* synthetic */ String mA(String str) {
        return a81.m16653h(Long.valueOf(a81.m16665t(new Temporal.Date(str).toDate())));
    }

    static SearchableStringFilterInput nj(String str, String str2, boolean z, List list) {
        str.hashCode();
        switch (str) {
            case "exists":
                return SearchableStringFilterInput.builder().exists(Boolean.valueOf(z)).build();
            case "matchPhrasePrefix":
                return SearchableStringFilterInput.builder().matchPhrasePrefix(str2).build();
            case "wildcard":
                return str2.matches("^\\*+$") ? SearchableStringFilterInput.builder().wildcard("*").build() : SearchableStringFilterInput.builder().wildcard(str2).build();
            case "eq":
                return SearchableStringFilterInput.builder().eq(str2).build();
            case "gt":
                return SearchableStringFilterInput.builder().gt(str2).build();
            case "lt":
                return SearchableStringFilterInput.builder().lt(str2).build();
            case "ne":
                return SearchableStringFilterInput.builder().ne(str2).build();
            case "gte":
                return SearchableStringFilterInput.builder().gte(str2).build();
            case "lte":
                return SearchableStringFilterInput.builder().lte(str2).build();
            case "range":
                return SearchableStringFilterInput.builder().range(list).build();
            default:
                return SearchableStringFilterInput.builder().eq(str2).build();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Map nu(String str, Map map) {
        Object objGh;
        Object objGh2;
        Object obj;
        SearchableIntFilterInput searchableIntFilterInputLq;
        SearchableStringFilterInput searchableStringFilterInputDm;
        SearchableStringFilterInput searchableStringFilterInputNj;
        String strValueOf;
        String strY0;
        SearchableStringFilterInput searchableStringFilterInputNj2;
        List listAsList = Arrays.asList("addedBy", "owner", "assignedTo", "updatedBy", "lastCallUser", "lastVisitUser", "lastEmailUser", "lastWhatsappUser", "lastNoteUser", "lastTaskDoneUser", "primaryTeam", "conversationInitiatedByUser");
        HashMap map2 = new HashMap();
        String str2 = (String) map.get("filterType");
        String str3 = (String) map.get("type");
        if ("text".equalsIgnoreCase(str2)) {
            strValueOf = String.valueOf(map.get("filter"));
            strY0 = y0(str3);
            Dm(strY0, strValueOf.toLowerCase());
            strY0.hashCode();
            switch (strY0) {
                case "exists":
                    searchableStringFilterInputNj2 = nj("exists", "", true, Collections.emptyList());
                    break;
                case "wildcard":
                    searchableStringFilterInputNj2 = Dm(strY0, String.format("*%s*", strValueOf.toLowerCase()));
                    break;
                case "not-exists":
                    searchableStringFilterInputNj2 = nj("exists", "", false, Collections.emptyList());
                    break;
                default:
                    searchableStringFilterInputNj2 = Dm(strY0, strValueOf.toLowerCase());
                    break;
            }
            if (!str.startsWith("##CUSTOM##")) {
                if (!listAsList.contains(str)) {
                    switch (str) {
                        case "contactName":
                            map2.put("contactId", searchableStringFilterInputNj2);
                            break;
                        case "doNotTrackSetByName":
                            map2.put("doNotTrackSetBy", searchableStringFilterInputNj2);
                            break;
                        case "contactNameConversation":
                            map2.put("recipientId", searchableStringFilterInputNj2);
                            break;
                        case "engagementOwner":
                            map2.put("ownerId", searchableStringFilterInputNj2);
                            break;
                        default:
                            map2.put(str, searchableStringFilterInputNj2);
                            break;
                    }
                } else {
                    map2.put(str + JsonDocumentFields.POLICY_ID, searchableStringFilterInputNj2);
                }
            } else {
                map2.put("customAttributes", SearchableCustomAttributeFilterInput.builder().fieldName(SearchableIDFilterInput.builder().eq(str.replace("##CUSTOM##", "")).build()).fieldValue(searchableStringFilterInputNj2).build());
            }
        } else if ("selection".equalsIgnoreCase(str2)) {
            String strValueOf2 = String.valueOf(map.get("filter"));
            String strY02 = y0(str3);
            Dm(strY02, strValueOf2);
            strY02.hashCode();
            switch (strY02.hashCode()) {
                case -1289358244:
                    if (strY02.equals("exists")) {
                        break;
                    }
                    break;
                case -1173015078:
                    if (strY02.equals("wildcard")) {
                        break;
                    }
                    break;
                case 1390506134:
                    if (strY02.equals("not-exists")) {
                        break;
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instructions count: 3238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p001o.e4f.nu(java.lang.String, java.util.Map):java.util.Map");
        }

        static /* synthetic */ Boolean nv(Object obj) {
            return (Boolean) Optional.ofNullable(obj).filter(new Predicate() { // from class: o.l3f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return e4f.ei(obj2);
                }
            }).map(new Function() { // from class: o.m3f
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return e4f.yx(obj2);
                }
            }).orElse(Boolean.FALSE);
        }

        static /* synthetic */ boolean qe(List list) {
            return !list.isEmpty();
        }

        static /* synthetic */ Integer sd(Object obj) {
            return (Integer) Optional.ofNullable(obj).filter(new Predicate() { // from class: o.n3f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return e4f.Qi(obj2);
                }
            }).map(new Function() { // from class: o.o3f
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return e4f.lg(obj2);
                }
            }).orElse(0);
        }

        static /* synthetic */ void ss(SearchableContactFilterInput.Builder builder, String str) {
            builder.accountId(SearchableIDFilterInput.builder().eq(str).build());
        }

        static /* synthetic */ void t7(SearchableContactFilterInput.Builder builder, SearchableContactFilterInput searchableContactFilterInput) {
            builder.and(Arrays.asList(searchableContactFilterInput));
        }

        static String y0(String str) {
            str.hashCode();
            switch (str) {
            }
            return "exists";
        }

        static Number yr(final Object obj) {
            try {
                return (Number) Optional.ofNullable(obj).filter(new Predicate() { // from class: o.a3f
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return e4f.Xm(obj2);
                    }
                }).map(new Function() { // from class: o.b3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return e4f.Gk(obj2);
                    }
                }).map(new Function() { // from class: o.c3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((Number) obj2).intValue());
                    }
                }).orElseGet(new Supplier() { // from class: o.d3f
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return e4f.sd(obj);
                    }
                });
            } catch (Throwable unused) {
                String.format("Couldn't parse text %s as number", obj);
                return 0;
            }
        }

        static /* synthetic */ Boolean yx(Object obj) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }

        default s47 O4(ryh ryhVar, String str, int i) {
            final SearchSavedTableViewssQuery.Builder builderLimit = SearchSavedTableViewssQuery.builder().filter((SearchableSavedTableViewsFilterInput) ryhVar.f44265a).sort((SearchableSavedTableViewsSortInput) Optional.ofNullable((SearchableSavedTableViewsSortInput) ryhVar.f44266b).orElse(SearchableSavedTableViewsSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableSavedTableViewsSortableFields.createdAt).build())).limit(Integer.valueOf(i));
            Optional optionalOfNullable = Optional.ofNullable(str);
            Objects.requireNonNull(builderLimit);
            optionalOfNullable.ifPresent(new Consumer() { // from class: o.s3f
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    builderLimit.nextToken((String) obj);
                }
            });
            return graphqlQuery(builderLimit.build(), "query SearchSavedTableViewss($filter: SearchableSavedTableViewsFilterInput, $sort: SearchableSavedTableViewsSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchSavedTableViewss(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n    __typename\n    accountId\n    ownerId\n    tableName\n    viewName\n    isSystemCreated\n    includeAll\n    filterModel\n    columnState\n    sortModel\n    hiddenColumnms\n    scopeLevel\n    scopeId\n    showMetricsInApp\n    addedToAppHomeOn\n    createdAt\n    updatedAt\n    }\n    nextToken\n    total\n  }\n}", SearchSavedTableViewssQuery.Data.class, new Function() { // from class: o.t3f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((SearchSavedTableViewssQuery.Data) obj).searchSavedTableViewss();
                }
            }, ModelSavedTableViewsConnection.class).d0(new rl7() { // from class: o.u3f
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return e4f.Yc((ModelSavedTableViewsConnection) obj);
                }
            }).C0(la1.BUFFER);
        }

        default ryh bh(SavedTableViews savedTableViews, final SearchableContactFilterInput searchableContactFilterInput) {
            return (ryh) ((List) ja8.f30034b.fromJson(savedTableViews.getColumnState(), List.class)).stream().filter(new Predicate() { // from class: o.x3f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return e4f.S1((Map) obj);
                }
            }).map(new Function() { // from class: o.y3f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f54822a.Al(searchableContactFilterInput, (Map) obj);
                }
            }).findFirst().orElseGet(new Supplier() { // from class: o.z3f
                @Override // java.util.function.Supplier
                public final Object get() {
                    return e4f.Rl(searchableContactFilterInput);
                }
            });
        }

        default s47 g6(final int i) {
            final SearchableSavedTableViewsFilterInput searchableSavedTableViewsFilterInputBuild = SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).tableName(SearchableStringFilterInput.builder().matchPhrasePrefix("CONTACT").build()).showMetricsInApp(SearchableBooleanFilterInput.builder().eq(Boolean.TRUE).build()).or(Arrays.asList(SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(on()).build()).build(), SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(Eo()).build()).build(), SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).ownerId(SearchableIDFilterInput.builder().eq(Eo()).build()).build())).build();
            final SearchableSavedTableViewsSortInput searchableSavedTableViewsSortInputBuild = SearchableSavedTableViewsSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableSavedTableViewsSortableFields.addedToAppHomeOn).build();
            return s47.m47669H(new Callable() { // from class: o.v3f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f49830a.Ki(searchableSavedTableViewsFilterInputBuild, searchableSavedTableViewsSortInputBuild, i);
                }
            });
        }

        /* renamed from: k */
        default SearchableContactFilterInput m24301k(SavedTableViews savedTableViews) {
            String filterModel = savedTableViews.getFilterModel();
            String tableName = savedTableViews.getTableName();
            Boolean includeAll = savedTableViews.getIncludeAll();
            Map map = (Map) ja8.f30034b.fromJson(filterModel, Map.class);
            if ("CONTACT_ACTIVE".equalsIgnoreCase(tableName) || "CONTACT_INACTIVE".equalsIgnoreCase(tableName)) {
                return T2(map, on(), Optional.ofNullable((!"CONTACT_ACTIVE".equalsIgnoreCase(tableName) || (includeAll != null && includeAll.booleanValue())) ? (!"CONTACT_INACTIVE".equalsIgnoreCase(tableName) || (includeAll != null && includeAll.booleanValue())) ? null : SearchableContactFilterInput.builder().leadLifecycleStage(SearchableStringFilterInput.builder().eq(LeadLifecycleStage.CLOSED.name()).build()).build() : SearchableContactFilterInput.builder().leadLifecycleStage(SearchableStringFilterInput.builder().ne(LeadLifecycleStage.CLOSED.name()).build()).build()).map(new Function() { // from class: o.j3f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return e4f.m24300c((SearchableContactFilterInput) obj);
                    }
                }));
            }
            return SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).build();
        }

        default x6c sm(final int i) {
            final SearchableSavedTableViewsFilterInput searchableSavedTableViewsFilterInputBuild = SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).tableName(SearchableStringFilterInput.builder().matchPhrasePrefix("CONTACT").build()).or(Arrays.asList(SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(on()).build()).build(), SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).scopeId(SearchableIDFilterInput.builder().eq(Eo()).build()).build(), SearchableSavedTableViewsFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).ownerId(SearchableIDFilterInput.builder().eq(Eo()).build()).build())).build();
            return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.p3f
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f39287a.Dr(searchableSavedTableViewsFilterInputBuild, i, (String) obj);
                }
            }).m47707o(new ArrayList(), new eh1() { // from class: o.q3f
                @Override // p001o.eh1
                public final void accept(Object obj, Object obj2) {
                    ((ArrayList) obj).add((SavedTableViews) obj2);
                }
            }).m55027y();
        }
    }
