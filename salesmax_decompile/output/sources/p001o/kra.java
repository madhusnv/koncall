package p001o;

import ai.salesmax.model.SupportResource;
import com.amazonaws.amplify.generated.graphql.MapDataFieldsQuery;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.gson.Gson;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public interface kra extends me1 {
    static Boolean Bl(String str) {
        try {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            return null;
        }
    }

    static /* synthetic */ Object I3(Map map) {
        return map.getOrDefault("isActive", Boolean.TRUE);
    }

    static SupportResource Ju(Map map) {
        final SupportResource supportResourceXl = xl();
        Optional map2 = Optional.ofNullable(map).map(new Function() { // from class: o.dra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.Zk((Map) obj);
            }
        }).map(new ppd());
        Objects.requireNonNull(supportResourceXl);
        map2.ifPresent(new Consumer() { // from class: o.oqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setId((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.xqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.hw((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.yqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setTitle((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.zqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.wy((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.ara
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setDescription((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.cra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.ir((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.era
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setCategory((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.fra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.pt((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.gra
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setSubCategory((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.hra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.I3((Map) obj);
            }
        }).map(new ppd()).map(new Function() { // from class: o.ira
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.Bl((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.jra
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setActive(((Boolean) obj).booleanValue());
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.gqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.V5((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.hqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setFormat((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.iqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.m36128b((Map) obj);
            }
        }).map(new ppd()).map(new Function() { // from class: o.jqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.di((String) obj);
            }
        }).map(new Function() { // from class: o.kqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((Double) obj).longValue());
            }
        }).ifPresent(new Consumer() { // from class: o.lqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setTimeRequired((Long) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.mqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.g3((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.nqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setThumbnailUrl((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.pqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.Vl((Map) obj);
            }
        }).map(new ppd()).ifPresent(new Consumer() { // from class: o.rqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setExternalLinkUrl((String) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.sqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.fj((Map) obj);
            }
        }).map(new Function() { // from class: o.tqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.nm(obj);
            }
        }).ifPresent(new Consumer() { // from class: o.uqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setTags((List) obj);
            }
        });
        Optional.ofNullable(map).map(new Function() { // from class: o.vqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.yp((Map) obj);
            }
        }).map(new Function() { // from class: o.tqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.nm(obj);
            }
        }).ifPresent(new Consumer() { // from class: o.wqa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                supportResourceXl.setRelevantForAuthorization((List) obj);
            }
        });
        return supportResourceXl;
    }

    static /* synthetic */ Object V5(Map map) {
        return map.getOrDefault("format", "");
    }

    static /* synthetic */ Object Vl(Map map) {
        return map.getOrDefault("externalLinkUrl", "");
    }

    static /* synthetic */ Object Zk(Map map) {
        return map.getOrDefault(OutcomeConstants.OUTCOME_ID, "");
    }

    /* renamed from: b */
    static /* synthetic */ Object m36128b(Map map) {
        return map.getOrDefault("timeRequired", "");
    }

    static Double di(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (Exception unused) {
            return null;
        }
    }

    static /* synthetic */ Object fj(Map map) {
        return map.getOrDefault("tags", Collections.emptyList());
    }

    static /* synthetic */ Object g3(Map map) {
        return map.getOrDefault("thumbnailUrl", "");
    }

    static /* synthetic */ Object hw(Map map) {
        return map.getOrDefault(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, "");
    }

    static /* synthetic */ Object ir(Map map) {
        return map.getOrDefault("category", "");
    }

    static List nm(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof List) {
                    return (List) obj;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static /* synthetic */ Map ow(MapDataFieldsQuery.Data data) {
        return r5(data.mapDataFields());
    }

    static /* synthetic */ Object pt(Map map) {
        return map.getOrDefault("subCategory", "");
    }

    static Map r5(String str) {
        String.format("Resolving mapped data fields to map: %s", str);
        return (Map) ja8.f30035c.fromJson(str, Map.class);
    }

    static /* synthetic */ Object wy(Map map) {
        return map.getOrDefault(MediaTrack.ROLE_DESCRIPTION, "");
    }

    /* renamed from: x */
    static ryh m36129x(Map map) {
        String strValueOf = String.valueOf(map.getOrDefault("body", DevicePublicKeyStringDef.NONE));
        List list = (List) ((List) Optional.ofNullable((List) map.getOrDefault("supportResources", Collections.emptyList())).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.bra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.Ju((Map) obj);
            }
        }).collect(Collectors.toList());
        String.format("Resolving mapped data fields to output: %s", strValueOf);
        return uyh.of(strValueOf, list);
    }

    static SupportResource xl() {
        return new SupportResource();
    }

    static /* synthetic */ Object yp(Map map) {
        return map.getOrDefault("relevantForAuthorization", Collections.emptyList());
    }

    default String l8() {
        return "APP_ADMIN_ACTION";
    }

    default x6c sw(String str) {
        MapDataFieldsQuery.Builder builder = MapDataFieldsQuery.builder();
        Gson gson = ja8.f30035c;
        return graphqlQuery(builder.input(gson.toJson(str)).objectModel(gson.toJson(l8())).accountId(on()).userId(Eo()).build(), "query MapDataFields($input: AWSJSON, $objectModel: AWSJSON, $accountId: ID, $userId: ID) {\n  mapDataFields(input: $input, objectModel: $objectModel, accountId: $accountId, userId: $userId)\n}", MapDataFieldsQuery.Data.class, new Function() { // from class: o.fqa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kra.ow((MapDataFieldsQuery.Data) obj);
            }
        }, Map.class).d0(new rl7() { // from class: o.qqa
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kra.m36129x((Map) obj);
            }
        });
    }
}
