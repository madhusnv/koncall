package p001o;

import ai.salesmax.model.TemplateVariable;
import ai.salesmax.model.VariableMapEntry;
import com.amazonaws.amplify.generated.graphql.EnrichPropertiesQuery;
import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import type.PropertyMap;
import type.PropertyMapInput;

/* loaded from: classes.dex */
public interface rrd extends me1 {
    static x6c Bz(final List list, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, final Optional optional5) {
        final TemplateVariable templateVariable = new TemplateVariable();
        return templateVariable.getAllVariableEntries().d0(new rl7() { // from class: o.hrd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.Cy(templateVariable, list, optional, optional4, optional3, optional5, optional2, (List) obj);
            }
        });
    }

    static /* synthetic */ Map Cy(TemplateVariable templateVariable, List list, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, List list2) {
        TemplateVariable templateVariable2;
        Map map = (Map) templateVariable.getVariableMap().stream().collect(Collectors.toMap(new Function() { // from class: o.nqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((VariableMapEntry) obj).getValue();
            }
        }, new Function() { // from class: o.oqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rrd.Ig((VariableMapEntry) obj);
            }
        }, new BinaryOperator() { // from class: o.pqd
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return rrd.yz((VariableMapEntry) obj, (VariableMapEntry) obj2);
            }
        }));
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            VariableMapEntry variableMapEntry = (VariableMapEntry) map.getOrDefault(str, null);
            if (variableMapEntry != null) {
                int i2 = i + 1;
                String.format("Index_%s", Integer.valueOf(i));
                templateVariable2 = new TemplateVariable();
                templateVariable2.setVariableId(variableMapEntry.getValue());
                templateVariable2.setTaType("");
                templateVariable2.setMappedObject(variableMapEntry.getObject());
                templateVariable2.setMappedProperty(variableMapEntry.getKey());
                templateVariable2.setFallBackValue(variableMapEntry.getFallBackValue());
                String object = variableMapEntry.getObject();
                object.hashCode();
                switch (object) {
                    case "ACCOUNT":
                        optional2.ifPresent(new qqd(templateVariable2));
                        break;
                    case "BUSINESS":
                        optional5.ifPresent(new qqd(templateVariable2));
                        break;
                    case "ACCOUNTMEMBERSHIP":
                        optional4.ifPresent(new qqd(templateVariable2));
                        break;
                    case "USER":
                        optional3.ifPresent(new qqd(templateVariable2));
                        break;
                    case "CONTACT":
                        optional.ifPresent(new qqd(templateVariable2));
                        break;
                }
                map2.put(str, templateVariable2);
                i = i2;
            }
        }
        return map2;
    }

    static /* synthetic */ VariableMapEntry Ig(VariableMapEntry variableMapEntry) {
        return variableMapEntry;
    }

    static /* synthetic */ Map Op(String str) {
        return (Map) ja8.f30035c.fromJson(str, Map.class);
    }

    static /* synthetic */ List Q4(List list, final Map map) {
        list.stream().forEach(new Consumer() { // from class: o.grd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                rrd.hz(map, (TemplateVariable) obj);
            }
        });
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PropertyMap Qq(String str, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, String str2) {
        final PropertyMap.Builder builderDefaultValue;
        builderDefaultValue = PropertyMap.builder().property(str.replaceFirst(str2 + "__", "")).name(str).defaultValue("");
        str2.hashCode();
        switch (str2) {
            case "ENGAGEMENT":
                builderDefaultValue.table(str2);
                optional3.ifPresent(new Consumer() { // from class: o.frd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderDefaultValue.value((String) obj);
                    }
                });
                break;
            case "ACCOUNT":
                builderDefaultValue.table(str2);
                builderDefaultValue.value((String) optional5.orElse(on()));
                break;
            case "BUSINESS":
                builderDefaultValue.table(str2);
                optional2.ifPresent(new Consumer() { // from class: o.frd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderDefaultValue.value((String) obj);
                    }
                });
                break;
            case "USER":
                builderDefaultValue.table(str2);
                builderDefaultValue.value((String) optional4.orElse(Eo()));
                break;
            case "CONTACT":
                builderDefaultValue.table(str2);
                optional.ifPresent(new Consumer() { // from class: o.frd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderDefaultValue.value((String) obj);
                    }
                });
                break;
            default:
                builderDefaultValue.table("CONTACT");
                optional.ifPresent(new Consumer() { // from class: o.frd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderDefaultValue.value((String) obj);
                    }
                });
                break;
        }
        return builderDefaultValue.build();
    }

    static /* synthetic */ String Qr(Map map) {
        return (String) map.getOrDefault("body", "{}");
    }

    static /* synthetic */ List Qt(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strReplace = (String) it.next();
            for (Map.Entry entry : map.entrySet()) {
                strReplace = strReplace.replace(String.format("{{%s}}", entry.getKey()), (CharSequence) entry.getValue());
            }
            arrayList.add(strReplace);
        }
        return arrayList;
    }

    static /* synthetic */ Map V4(String str) {
        return (Map) ja8.f30035c.fromJson(str, Map.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Wb(List list, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, final Optional optional5, final Optional optional6, final Map map) {
        return x6c.g0(Bq((List) map.values().stream().map(new Function() { // from class: o.nrd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rrd.zw((TemplateVariable) obj);
            }
        }).collect(Collectors.toList())).d0(new rl7() { // from class: o.ord
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.q0((List) obj);
            }
        }), x6c.c0((List) ((List) list.stream().filter(new Predicate() { // from class: o.krd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return rrd.ft(map, (String) obj);
            }
        }).collect(Collectors.toList())).stream().map(new Function() { // from class: o.lrd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f34308a.R3(optional, optional2, optional3, optional4, optional5, optional6, (String) obj);
            }
        }).filter(new Predicate() { // from class: o.mrd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return rrd.Y5((PropertyMap) obj);
            }
        }).collect(Collectors.toList())).m55714J(new ggd() { // from class: o.prd
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return rrd.cz((List) obj);
            }
        }).m55717M(new rl7() { // from class: o.qrd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f42343a.bk((List) obj);
            }
        })).l0(new HashMap(), new jh1() { // from class: o.mqd
            @Override // p001o.jh1
            public final Object apply(Object obj, Object obj2) {
                return rrd.c1((HashMap) obj, (Map) obj2);
            }
        }).m55027y();
    }

    static /* synthetic */ boolean Y5(PropertyMap propertyMap) {
        return !Objects.isNull(propertyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c bk(List list) {
        return graphqlQuery(EnrichPropertiesQuery.builder().input(PropertyMapInput.builder().parameters(list).build()).build(), EnrichPropertiesQuery.Data.class, new rqd(), Map.class).d0(new rl7() { // from class: o.sqd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.kf((Map) obj);
            }
        }).d0(new rl7() { // from class: o.tqd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.V4((String) obj);
            }
        });
    }

    static /* synthetic */ HashMap c1(HashMap map, Map map2) {
        map.putAll(map2);
        return map;
    }

    static /* synthetic */ boolean cz(List list) {
        return !list.isEmpty();
    }

    static /* synthetic */ boolean ft(Map map, String str) {
        return !map.containsKey(str);
    }

    static /* synthetic */ PropertyMap gl(TemplateVariable templateVariable) {
        return templateVariable.toPropertyMap(null);
    }

    static /* synthetic */ boolean hr(PropertyMap propertyMap) {
        return !StringUtils.isBlank(propertyMap.value());
    }

    static /* synthetic */ void hz(Map map, final TemplateVariable templateVariable) {
        if (map.containsKey(templateVariable.getId())) {
            Optional.ofNullable(map.getOrDefault(templateVariable.getId(), null)).map(new ppd()).ifPresent(new Consumer() { // from class: o.jrd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    templateVariable.setEvaluatedValue((String) obj);
                }
            });
        }
    }

    static /* synthetic */ String kf(Map map) {
        return (String) map.getOrDefault("body", "{}");
    }

    static /* synthetic */ TemplateVariable o7(ryh ryhVar) {
        TemplateVariable templateVariable = (TemplateVariable) ryhVar.f44265a;
        Optional optionalFilter = Optional.ofNullable((String) ryhVar.f44266b).filter(new Predicate() { // from class: o.ird
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return rrd.sh((String) obj);
            }
        });
        Objects.requireNonNull(templateVariable);
        optionalFilter.ifPresent(new qqd(templateVariable));
        return templateVariable;
    }

    static /* synthetic */ Map q0(List list) {
        return (Map) list.stream().collect(Collectors.toMap(new Function() { // from class: o.yqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TemplateVariable) obj).getId();
            }
        }, new Function() { // from class: o.zqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TemplateVariable) obj).getEvaluatedValue();
            }
        }));
    }

    static /* synthetic */ boolean sh(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ VariableMapEntry yz(VariableMapEntry variableMapEntry, VariableMapEntry variableMapEntry2) {
        return variableMapEntry;
    }

    static /* synthetic */ ryh zw(TemplateVariable templateVariable) {
        return uyh.of(templateVariable, "");
    }

    default x6c Bq(List list) {
        final List list2 = (List) list.stream().map(new Function() { // from class: o.ard
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rrd.o7((ryh) obj);
            }
        }).collect(Collectors.toList());
        List<PropertyMap> list3 = (List) list2.stream().map(new Function() { // from class: o.brd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rrd.gl((TemplateVariable) obj);
            }
        }).collect(Collectors.toList());
        if (list3.isEmpty()) {
            return x6c.m55693G();
        }
        return graphqlQuery(EnrichPropertiesQuery.builder().input(PropertyMapInput.builder().parameters(list3).build()).build(), EnrichPropertiesQuery.Data.class, new rqd(), Map.class).d0(new rl7() { // from class: o.crd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.Qr((Map) obj);
            }
        }).d0(new rl7() { // from class: o.drd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.Op((String) obj);
            }
        }).d0(new rl7() { // from class: o.erd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.Q4(list2, (Map) obj);
            }
        });
    }

    default x6c Oz(final List list, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        return Wa(optional, optional2, optional3, optional4, optional5, optional6, m47101f(list)).d0(new rl7() { // from class: o.lqd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return rrd.Qt(list, (Map) obj);
            }
        });
    }

    default x6c Wa(final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, final Optional optional5, final Optional optional6, final List list) {
        return list.isEmpty() ? x6c.c0(Collections.emptyMap()) : Bz(list, optional, optional2, optional3, optional4, optional5).m55717M(new rl7() { // from class: o.wqd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f52510a.Wb(list, optional, optional2, optional3, optional4, optional5, optional6, (Map) obj);
            }
        });
    }

    /* renamed from: f */
    default List m47101f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile("\\{\\{([^}]+)\\}\\}").matcher((String) it.next());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        return arrayList;
    }

    /* renamed from: ql, reason: merged with bridge method [inline-methods] */
    default PropertyMap R3(final String str, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, Optional optional5, final Optional optional6) {
        return (PropertyMap) Arrays.stream(str.split("__")).findFirst().map(new uqd()).map(new Function() { // from class: o.vqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f50720a.Qq(str, optional, optional2, optional6, optional3, optional4, (String) obj);
            }
        }).filter(new Predicate() { // from class: o.xqd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return rrd.hr((PropertyMap) obj);
            }
        }).orElse(null);
    }
}
