package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ResponseField {
    public static final String VARIABLE_IDENTIFIER_KEY = "kind";
    public static final String VARIABLE_IDENTIFIER_VALUE = "Variable";
    public static final String VARIABLE_NAME_KEY = "variableName";
    private final Map<String, Object> arguments;
    private final List<Condition> conditions;
    private final String fieldName;
    private final boolean optional;
    private final String responseName;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58140type;

    public static final class BooleanCondition extends Condition {
        private final boolean inverted;
        private final String variableName;

        public BooleanCondition(String str, boolean z) {
            this.variableName = (String) Utils.checkNotNull(str, "variableName == null");
            this.inverted = z;
        }

        public boolean inverted() {
            return this.inverted;
        }

        public String variableName() {
            return this.variableName;
        }
    }

    public static class Condition {
        public static BooleanCondition booleanCondition(String str, boolean z) {
            return new BooleanCondition(str, z);
        }

        public static TypeNameCondition typeCondition(String str) {
            return new TypeNameCondition(str);
        }
    }

    public static final class CustomTypeField extends ResponseField {
        private final ScalarType scalarType;

        public CustomTypeField(String str, String str2, Map<String, Object> map, boolean z, ScalarType scalarType, List<Condition> list) {
            super(Type.CUSTOM, str, str2, map, z, list);
            this.scalarType = scalarType;
        }

        public ScalarType scalarType() {
            return this.scalarType;
        }
    }

    public enum Type {
        STRING,
        INT,
        LONG,
        DOUBLE,
        BOOLEAN,
        ENUM,
        OBJECT,
        LIST,
        CUSTOM,
        FRAGMENT,
        INLINE_FRAGMENT
    }

    public static final class TypeNameCondition extends Condition {
        private final String typeName;

        public TypeNameCondition(String str) {
            this.typeName = (String) Utils.checkNotNull(str, "typeName == null");
        }

        public String typeName() {
            return this.typeName;
        }
    }

    public static ResponseField forBoolean(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.BOOLEAN, str, str2, map, z, list);
    }

    public static CustomTypeField forCustomType(String str, String str2, Map<String, Object> map, boolean z, ScalarType scalarType, List<Condition> list) {
        return new CustomTypeField(str, str2, map, z, scalarType, list);
    }

    public static ResponseField forDouble(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.DOUBLE, str, str2, map, z, list);
    }

    public static ResponseField forEnum(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.ENUM, str, str2, map, z, list);
    }

    public static ResponseField forFragment(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Condition.typeCondition(it.next()));
        }
        return new ResponseField(Type.FRAGMENT, str, str2, Collections.emptyMap(), false, arrayList);
    }

    public static ResponseField forInlineFragment(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Condition.typeCondition(it.next()));
        }
        return new ResponseField(Type.INLINE_FRAGMENT, str, str2, Collections.emptyMap(), false, arrayList);
    }

    public static ResponseField forInt(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.INT, str, str2, map, z, list);
    }

    public static ResponseField forList(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.LIST, str, str2, map, z, list);
    }

    public static ResponseField forLong(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.LONG, str, str2, map, z, list);
    }

    public static ResponseField forObject(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.OBJECT, str, str2, map, z, list);
    }

    public static ResponseField forString(String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        return new ResponseField(Type.STRING, str, str2, map, z, list);
    }

    public static boolean isArgumentValueVariableType(Map<String, Object> map) {
        return map.containsKey(VARIABLE_IDENTIFIER_KEY) && map.get(VARIABLE_IDENTIFIER_KEY).equals(VARIABLE_IDENTIFIER_VALUE) && map.containsKey(VARIABLE_NAME_KEY);
    }

    private String orderIndependentKey(Map<String, Object> map, Operation.Variables variables) {
        if (isArgumentValueVariableType(map)) {
            return orderIndependentKeyForVariableArgument(map, variables);
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Object>>() { // from class: com.apollographql.apollo.api.ResponseField.1
            @Override // java.util.Comparator
            public int compare(Map.Entry<String, Object> entry, Map.Entry<String, Object> entry2) {
                return entry.getKey().compareTo(entry2.getKey());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            if (entry.getValue() instanceof Map) {
                Map<String, Object> map2 = (Map) entry.getValue();
                boolean zIsArgumentValueVariableType = isArgumentValueVariableType(map2);
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(zIsArgumentValueVariableType ? "" : "[");
                sb.append(orderIndependentKey(map2, variables));
                sb.append(zIsArgumentValueVariableType ? "" : "]");
            } else {
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().toString());
            }
            if (i < arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private String orderIndependentKeyForVariableArgument(Map<String, Object> map, Operation.Variables variables) {
        Object obj = variables.valueMap().get(map.get(VARIABLE_NAME_KEY));
        if (obj == null) {
            return null;
        }
        return obj instanceof Map ? orderIndependentKey((Map) obj, variables) : obj.toString();
    }

    public Map<String, Object> arguments() {
        return this.arguments;
    }

    public String cacheKey(Operation.Variables variables) {
        return this.arguments.isEmpty() ? fieldName() : String.format("%s(%s)", fieldName(), orderIndependentKey(this.arguments, variables));
    }

    public List<Condition> conditions() {
        return this.conditions;
    }

    public String fieldName() {
        return this.fieldName;
    }

    public boolean optional() {
        return this.optional;
    }

    public Object resolveArgument(String str, Operation.Variables variables) {
        Utils.checkNotNull(str, "name == null");
        Utils.checkNotNull(variables, "variables == null");
        Map<String, Object> mapValueMap = variables.valueMap();
        Object obj = this.arguments.get(str);
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (isArgumentValueVariableType(map)) {
            return mapValueMap.get(map.get(VARIABLE_NAME_KEY).toString());
        }
        return null;
    }

    public String responseName() {
        return this.responseName;
    }

    public Type type() {
        return this.f58140type;
    }

    private ResponseField(Type type2, String str, String str2, Map<String, Object> map, boolean z, List<Condition> list) {
        this.f58140type = type2;
        this.responseName = str;
        this.fieldName = str2;
        this.arguments = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
        this.optional = z;
        this.conditions = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
