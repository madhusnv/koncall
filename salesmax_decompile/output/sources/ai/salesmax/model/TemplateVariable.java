package ai.salesmax.model;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.TemplateVariable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.ch3;
import p001o.id5;
import p001o.kf9;
import p001o.rl7;
import p001o.sq8;
import p001o.x6c;
import p001o.xk7;
import type.PropertyMap;

/* loaded from: classes.dex */
public final class TemplateVariable implements Parcelable {
    private static List<VariableMapEntry> __defaultVariableMap;
    private static boolean isVariableMapFinalized;
    private static List<VariableMapEntry> variableMap;
    private String evaluatedValue;
    private String fallBackValue;
    private Integer index;
    private String mappedObject;
    private String mappedObjectId;
    private String mappedProperty;
    private String sub_type;
    private String taType;
    private String variableId;
    private String viewValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TemplateVariable> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final List<VariableMapEntry> getVariableMap() {
            return TemplateVariable.variableMap;
        }

        public final List<VariableMapEntry> get__defaultVariableMap() {
            return TemplateVariable.__defaultVariableMap;
        }

        public final boolean isVariableMapFinalized() {
            return TemplateVariable.isVariableMapFinalized;
        }

        public final void reset() {
            setVariableMapFinalized(false);
            setVariableMap(get__defaultVariableMap());
        }

        public final void setVariableMap(List<VariableMapEntry> list) {
            sq8.m48649h(list, "<set-?>");
            TemplateVariable.variableMap = list;
        }

        public final void setVariableMapFinalized(boolean z) {
            TemplateVariable.isVariableMapFinalized = z;
        }

        public final void set__defaultVariableMap(List<VariableMapEntry> list) {
            sq8.m48649h(list, "<set-?>");
            TemplateVariable.__defaultVariableMap = list;
        }
    }

    public static final class Creator implements Parcelable.Creator<TemplateVariable> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateVariable createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new TemplateVariable(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateVariable[] newArray(int i) {
            return new TemplateVariable[i];
        }
    }

    /* renamed from: ai.salesmax.model.TemplateVariable$getAllVariableEntries$2 */
    public static final class C02542<T, R> implements rl7 {
        public static final C02542<T, R> INSTANCE = new C02542<>();

        /* renamed from: ai.salesmax.model.TemplateVariable$getAllVariableEntries$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(PropertyDefinition propertyDefinition) {
                return Boolean.valueOf((propertyDefinition.isSystemProperty() || propertyDefinition.isArchived()) ? false : true);
            }
        }

        /* renamed from: ai.salesmax.model.TemplateVariable$getAllVariableEntries$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends kf9 implements xk7 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p001o.xk7
            public final VariableMapEntry invoke(PropertyDefinition propertyDefinition) {
                String upperCase = propertyDefinition.getParentObjectType().toUpperCase();
                sq8.m48648g(upperCase, "toUpperCase(...)");
                return new VariableMapEntry(upperCase, "customAttributes." + propertyDefinition.getPropertyName(), propertyDefinition.getDisplayName() + " (Custom)", "", false, 16, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$0(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VariableMapEntry apply$lambda$1(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (VariableMapEntry) xk7Var.invoke(obj);
        }

        @Override // p001o.rl7
        public final List<VariableMapEntry> apply(Collection<PropertyDefinition> collection) {
            sq8.m48649h(collection, "it");
            Stream<PropertyDefinition> stream = collection.stream();
            final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            Stream<PropertyDefinition> streamFilter = stream.filter(new Predicate() { // from class: ai.salesmax.model.g
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return TemplateVariable.C02542.apply$lambda$0(anonymousClass1, obj);
                }
            });
            final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            return (List) streamFilter.map(new Function() { // from class: ai.salesmax.model.h
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return TemplateVariable.C02542.apply$lambda$1(anonymousClass2, obj);
                }
            }).collect(Collectors.toList());
        }
    }

    static {
        List<VariableMapEntry> listM21249n = ch3.m21249n(new VariableMapEntry("CONTACT", "name", "Full Name", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "gender", "Gender", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "salutation", "Salutation", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "contactSource", "Contact Source", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "business.name", "Business Name", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "business.website", "Business Website", "Sir/Madam", false, 16, null), new VariableMapEntry("CONTACT", "business.industry", "Industry", "Sir/Madam", false, 16, null), new VariableMapEntry("ACCOUNTMEMBERSHIP", "signature", "Sender - Signature", "", false, 16, null), new VariableMapEntry("USER", "name", "Lead Owner - Name", "", false, 16, null), new VariableMapEntry("USER", "registeredNumber", "Lead Owner - Mobile Number", "", false, 16, null), new VariableMapEntry("USER", "registeredEmail", "Lead Owner - Email", "", false, 16, null), new VariableMapEntry("USER", "name", "Sender - Name", "", false, 16, null), new VariableMapEntry("USER", "registeredNumber", "Sender - Mobile Number", "", false, 16, null), new VariableMapEntry("USER", "registeredEmail", "Sender - Email", "", false, 16, null), new VariableMapEntry("ACCOUNT", "accountName", "Sender - Account Name", "", false, 16, null), new VariableMapEntry("ACCOUNT", "nameOfBusiness", "Sender - Business Name", "", false, 16, null), new VariableMapEntry("ACCOUNT", "website", "Sender - Website", "", false, 16, null), new VariableMapEntry("CONTACT", "paymentRequestDetail.paymentLinkUrl", "Last Open Payment Link", "", false, 16, null), new VariableMapEntry("CONTACT", "paymentRequestDetail.paymentProvider", "Last Open Payment Link Provider", "", false, 16, null), new VariableMapEntry("CONTACT", "paymentRequestDetail.amount", "Last Open Payment Amount", "", false, 16, null), new VariableMapEntry("CONTACT", "paymentRequestDetail.currency", "Last Open Payment Currency", "", false, 16, null));
        __defaultVariableMap = listM21249n;
        variableMap = listM21249n;
    }

    public TemplateVariable() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ PropertyMap toPropertyMap$default(TemplateVariable templateVariable, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return templateVariable.toPropertyMap(str);
    }

    public final String component1() {
        return this.taType;
    }

    public final String component10() {
        return this.sub_type;
    }

    public final String component2() {
        return this.variableId;
    }

    public final String component3() {
        return this.mappedObject;
    }

    public final String component4() {
        return this.mappedObjectId;
    }

    public final String component5() {
        return this.mappedProperty;
    }

    public final String component6() {
        return this.fallBackValue;
    }

    public final String component7() {
        return this.viewValue;
    }

    public final String component8() {
        return this.evaluatedValue;
    }

    public final Integer component9() {
        return this.index;
    }

    public final TemplateVariable copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9) {
        sq8.m48649h(str, "taType");
        sq8.m48649h(str2, "variableId");
        sq8.m48649h(str3, "mappedObject");
        sq8.m48649h(str4, "mappedObjectId");
        sq8.m48649h(str5, "mappedProperty");
        sq8.m48649h(str6, "fallBackValue");
        sq8.m48649h(str7, "viewValue");
        sq8.m48649h(str8, "evaluatedValue");
        return new TemplateVariable(str, str2, str3, str4, str5, str6, str7, str8, num, str9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateVariable)) {
            return false;
        }
        TemplateVariable templateVariable = (TemplateVariable) obj;
        return sq8.m48644c(this.taType, templateVariable.taType) && sq8.m48644c(this.variableId, templateVariable.variableId) && sq8.m48644c(this.mappedObject, templateVariable.mappedObject) && sq8.m48644c(this.mappedObjectId, templateVariable.mappedObjectId) && sq8.m48644c(this.mappedProperty, templateVariable.mappedProperty) && sq8.m48644c(this.fallBackValue, templateVariable.fallBackValue) && sq8.m48644c(this.viewValue, templateVariable.viewValue) && sq8.m48644c(this.evaluatedValue, templateVariable.evaluatedValue) && sq8.m48644c(this.index, templateVariable.index) && sq8.m48644c(this.sub_type, templateVariable.sub_type);
    }

    public final x6c getAllVariableEntries() {
        if (isVariableMapFinalized()) {
            x6c x6cVarC0 = x6c.c0(getVariableMap());
            sq8.m48648g(x6cVarC0, "just(...)");
            return x6cVarC0;
        }
        x6c x6cVarD0 = PropertyDefinitionRepository.o0().i1().d0(new rl7() { // from class: ai.salesmax.model.TemplateVariable.getAllVariableEntries.1
            @Override // p001o.rl7
            public final Collection<PropertyDefinition> apply(Map<String, PropertyDefinition> map) {
                sq8.m48649h(map, "it");
                return map.values();
            }
        }).d0(C02542.INSTANCE).d0(new rl7() { // from class: ai.salesmax.model.TemplateVariable.getAllVariableEntries.3
            @Override // p001o.rl7
            public final List<VariableMapEntry> apply(List<VariableMapEntry> list) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(TemplateVariable.Companion.get__defaultVariableMap());
                arrayList.addAll(list);
                TemplateVariable.this.setVariableMap(arrayList);
                TemplateVariable.this.setVariableMapFinalized(true);
                return arrayList;
            }
        });
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    public final String getEvaluatedValue() {
        return this.evaluatedValue;
    }

    public final String getFallBackValue() {
        return this.fallBackValue;
    }

    public final String getId() {
        return this.taType + this.variableId;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getMappedObject() {
        return this.mappedObject;
    }

    public final String getMappedObjectId() {
        return this.mappedObjectId;
    }

    public final String getMappedProperty() {
        return this.mappedProperty;
    }

    public final String getSub_type() {
        return this.sub_type;
    }

    public final String getTaType() {
        return this.taType;
    }

    public final String getVariableId() {
        return this.variableId;
    }

    public final List<VariableMapEntry> getVariableMap() {
        return variableMap;
    }

    public final String getViewValue() {
        return this.viewValue;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.taType.hashCode() * 31) + this.variableId.hashCode()) * 31) + this.mappedObject.hashCode()) * 31) + this.mappedObjectId.hashCode()) * 31) + this.mappedProperty.hashCode()) * 31) + this.fallBackValue.hashCode()) * 31) + this.viewValue.hashCode()) * 31) + this.evaluatedValue.hashCode()) * 31;
        Integer num = this.index;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.sub_type;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isVariableMapFinalized() {
        return isVariableMapFinalized;
    }

    public final void setEvaluatedValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.evaluatedValue = str;
    }

    public final void setFallBackValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fallBackValue = str;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setMappedObject(String str) {
        sq8.m48649h(str, "<set-?>");
        this.mappedObject = str;
    }

    public final void setMappedObjectId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.mappedObjectId = str;
    }

    public final void setMappedProperty(String str) {
        sq8.m48649h(str, "<set-?>");
        this.mappedProperty = str;
    }

    public final void setSub_type(String str) {
        this.sub_type = str;
    }

    public final void setTaType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taType = str;
    }

    public final void setVariableId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.variableId = str;
    }

    public final void setVariableMap(List<VariableMapEntry> list) {
        sq8.m48649h(list, "value");
        variableMap = list;
    }

    public final void setVariableMapFinalized(boolean z) {
        isVariableMapFinalized = z;
    }

    public final void setViewValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.viewValue = str;
    }

    public final PropertyMap toPropertyMap(String str) {
        if (str == null) {
            str = this.mappedObjectId;
        }
        PropertyMap propertyMapBuild = PropertyMap.builder().name(getId()).table(this.mappedObject).value(str).defaultValue(this.fallBackValue).property(this.mappedProperty).build();
        sq8.m48648g(propertyMapBuild, "build(...)");
        return propertyMapBuild;
    }

    public String toString() {
        return "TemplateVariable(taType=" + this.taType + ", variableId=" + this.variableId + ", mappedObject=" + this.mappedObject + ", mappedObjectId=" + this.mappedObjectId + ", mappedProperty=" + this.mappedProperty + ", fallBackValue=" + this.fallBackValue + ", viewValue=" + this.viewValue + ", evaluatedValue=" + this.evaluatedValue + ", index=" + this.index + ", sub_type=" + this.sub_type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.taType);
        parcel.writeString(this.variableId);
        parcel.writeString(this.mappedObject);
        parcel.writeString(this.mappedObjectId);
        parcel.writeString(this.mappedProperty);
        parcel.writeString(this.fallBackValue);
        parcel.writeString(this.viewValue);
        parcel.writeString(this.evaluatedValue);
        Integer num = this.index;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sub_type);
    }

    public TemplateVariable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9) {
        sq8.m48649h(str, "taType");
        sq8.m48649h(str2, "variableId");
        sq8.m48649h(str3, "mappedObject");
        sq8.m48649h(str4, "mappedObjectId");
        sq8.m48649h(str5, "mappedProperty");
        sq8.m48649h(str6, "fallBackValue");
        sq8.m48649h(str7, "viewValue");
        sq8.m48649h(str8, "evaluatedValue");
        this.taType = str;
        this.variableId = str2;
        this.mappedObject = str3;
        this.mappedObjectId = str4;
        this.mappedProperty = str5;
        this.fallBackValue = str6;
        this.viewValue = str7;
        this.evaluatedValue = str8;
        this.index = num;
        this.sub_type = str9;
    }

    public /* synthetic */ TemplateVariable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : num, (i & 512) == 0 ? str9 : null);
    }
}
