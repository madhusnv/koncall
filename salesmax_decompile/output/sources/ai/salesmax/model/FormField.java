package ai.salesmax.model;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.FormField;
import ai.salesmax.model.event.ItemChangeEvent;
import ai.salesmax.model.event.ItemChangeListener;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.ObservableBoolean;
import com.amplifyframework.core.model.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import p001o.a81;
import p001o.e9g;
import p001o.f9g;
import p001o.gge;
import p001o.kf9;
import p001o.sq8;
import p001o.swd;
import p001o.x6c;
import p001o.xk7;
import p001o.y3i;
import p001o.yfe;

/* loaded from: classes.dex */
public final class FormField extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FormField> CREATOR = new Creator();
    private Object _submittedPropertyValue;
    private Field field;
    private String fieldName;
    private String fieldParentObjectId;
    private String fieldParentObjectType;
    private String groupName;
    private FieldDisplayCondition hideCondition;
    private String hintText;
    private Boolean isHidden;
    private Boolean isMandatory;
    private Boolean isViewOnly;
    private transient ObservableBoolean isVisible;
    private transient ItemChangeListener<Object> listener;
    private String parentObjectId;
    private String preSetValue;
    private PropertyDefinition propertyDefinition;
    private String propertyDefinitionId;
    private x6c propertyDefinitionObservable;
    private PropertyValue propertyValue;
    private x6c propertyValueObservable;
    private FieldDisplayCondition showCondition;
    private String title;
    private String viewType;

    public static final class Creator implements Parcelable.Creator<FormField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormField createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FormField(parcel.readString(), Field.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormField[] newArray(int i) {
            return new FormField[i];
        }
    }

    /* renamed from: ai.salesmax.model.FormField$toSavedTableFilterCriteria$1 */
    public static final class C02161 extends kf9 implements xk7 {
        final /* synthetic */ HashMap<String, String> $possibleValuesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02161(HashMap<String, String> map) {
            super(1);
            this.$possibleValuesMap = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PropertyOptions) obj);
            return y3i.f54824a;
        }

        public final void invoke(PropertyOptions propertyOptions) {
            String viewValue = propertyOptions.getViewValue();
            if (viewValue != null) {
                HashMap<String, String> map = this.$possibleValuesMap;
                map.put(propertyOptions.getValue(), viewValue);
                map.put(viewValue, propertyOptions.getValue());
            }
        }
    }

    public FormField(String str, Field field, String str2) {
        sq8.m48649h(field, "field");
        this.title = str;
        this.field = field;
        this.parentObjectId = str2;
        this.groupName = str == null ? "" : str;
        this.fieldName = field.getFieldName();
        this.fieldParentObjectType = this.field.getFieldParentObjectType();
        this.viewType = this.field.getViewType();
        this.isMandatory = this.field.isMandatory();
        this.isViewOnly = this.field.isViewOnly();
        this.hintText = this.field.getHintText();
        this.preSetValue = this.field.getPreSetValue();
        this.isHidden = this.field.isHidden();
        this.propertyDefinitionId = this.field.getPropertyDefinitionId();
        this.propertyDefinition = this.field.getPropertyDefinition();
        this.fieldParentObjectId = this.parentObjectId;
        String propertyDefinitionId = this.field.getPropertyDefinitionId();
        this.propertyDefinitionObservable = propertyDefinitionId != null ? PropertyDefinitionRepository.o0().k0(this.field.getFieldParentObjectType(), propertyDefinitionId) : null;
        String str3 = this.parentObjectId;
        this.propertyValueObservable = str3 != null ? swd.b0(str3, this.propertyDefinitionId) : null;
        this.showCondition = this.field.getShowCondition();
        this.hideCondition = this.field.getHideCondition();
        this.isVisible = new ObservableBoolean(true);
    }

    public static /* synthetic */ FormField copy$default(FormField formField, String str, Field field, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formField.title;
        }
        if ((i & 2) != 0) {
            field = formField.field;
        }
        if ((i & 4) != 0) {
            str2 = formField.parentObjectId;
        }
        return formField.copy(str, field, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSavedTableFilterCriteria$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSavedTableFilterCriteria$lambda$6(gge ggeVar, ArrayList arrayList, HashMap map, Object obj) {
        String str;
        sq8.m48649h(ggeVar, "$filterType");
        sq8.m48649h(arrayList, "$conditions");
        sq8.m48649h(map, "$possibleValuesMap");
        HashMap map2 = new HashMap();
        map2.put("filterType", ggeVar.f25106a);
        map2.put("type", "selection");
        map2.put("filter", obj);
        if (obj != null) {
            arrayList.add(map2);
        }
        if (!map.containsKey(obj) || (str = (String) map.get(obj)) == null) {
            return;
        }
        HashMap map3 = new HashMap();
        map3.put("filterType", ggeVar.f25106a);
        map3.put("type", "selection");
        map3.put("filter", str);
        if (sq8.m48644c(str, obj)) {
            return;
        }
        arrayList.add(map3);
    }

    public final String component1() {
        return this.title;
    }

    public final Field component2() {
        return this.field;
    }

    public final String component3() {
        return this.parentObjectId;
    }

    public final FormField copy(String str, Field field, String str2) {
        sq8.m48649h(field, "field");
        return new FormField(str, field, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        return sq8.m48644c(this.title, formField.title) && sq8.m48644c(this.field, formField.field) && sq8.m48644c(this.parentObjectId, formField.parentObjectId);
    }

    public final void evaluateVisibility(HashMap<String, Object> map) {
        sq8.m48649h(map, "submittedValues");
        if (sq8.m48644c(this.isHidden, Boolean.TRUE)) {
            return;
        }
        if (this.showCondition != null) {
            boolean zM5959i = this.isVisible.m5959i();
            FieldDisplayCondition fieldDisplayCondition = this.showCondition;
            if (fieldDisplayCondition != null) {
                this.isVisible.m5960j(fieldDisplayCondition.evaluateRule(map));
            }
            if (zM5959i != this.isVisible.m5959i()) {
                Object obj = this._submittedPropertyValue;
                fireItemChangeEvent(obj, obj);
                return;
            }
            return;
        }
        if (this.hideCondition != null) {
            boolean zM5959i2 = this.isVisible.m5959i();
            if (this.hideCondition != null) {
                this.isVisible.m5960j(!r1.evaluateRule(map));
            }
            if (zM5959i2 != this.isVisible.m5959i()) {
                Object obj2 = this._submittedPropertyValue;
                fireItemChangeEvent(obj2, obj2);
            }
        }
    }

    public final void fireItemChangeEvent(Object obj, Object obj2) {
        ItemChangeEvent<Object> itemChangeEvent = new ItemChangeEvent<>(obj2, obj);
        ItemChangeListener<Object> itemChangeListener = this.listener;
        if (itemChangeListener != null) {
            itemChangeListener.onItemChanged(itemChangeEvent);
        }
    }

    public final Field getField() {
        return this.field;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getFieldParentObjectId() {
        return this.fieldParentObjectId;
    }

    public final String getFieldParentObjectType() {
        return this.fieldParentObjectType;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final FieldDisplayCondition getHideCondition() {
        return this.hideCondition;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final ItemChangeListener<Object> getListener() {
        return this.listener;
    }

    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    public final String getPreSetValue() {
        return this.preSetValue;
    }

    public final PropertyDefinition getPropertyDefinition() {
        return this.propertyDefinition;
    }

    public final String getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public final x6c getPropertyDefinitionObservable() {
        return this.propertyDefinitionObservable;
    }

    public final PropertyValue getPropertyValue() {
        return this.propertyValue;
    }

    public final x6c getPropertyValueObservable() {
        return this.propertyValueObservable;
    }

    public final FieldDisplayCondition getShowCondition() {
        return this.showCondition;
    }

    public final Object getSubmittedPropertyValue() {
        String str;
        Object obj = this._submittedPropertyValue;
        return (obj != null || (str = this.preSetValue) == null) ? obj : str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewType() {
        return this.viewType;
    }

    public final Object get_submittedPropertyValue() {
        return this._submittedPropertyValue;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.field.hashCode()) * 31;
        String str2 = this.parentObjectId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean initVisibility() {
        if (this.showCondition != null) {
            this.isVisible = new ObservableBoolean(false);
        } else {
            this.isVisible = new ObservableBoolean(!(this.isHidden != null ? r0.booleanValue() : false));
        }
        return true;
    }

    public final boolean isCustom() {
        String str = this.propertyDefinitionId;
        return !(str == null || f9g.d0(str));
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isMandatory() {
        return this.isMandatory;
    }

    public final Boolean isViewOnly() {
        return this.isViewOnly;
    }

    public final ObservableBoolean isVisible() {
        return this.isVisible;
    }

    public final void setField(Field field) {
        sq8.m48649h(field, "<set-?>");
        this.field = field;
    }

    public final void setFieldName(String str) {
        this.fieldName = str;
    }

    public final void setFieldParentObjectId(String str) {
        this.fieldParentObjectId = str;
    }

    public final void setFieldParentObjectType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fieldParentObjectType = str;
    }

    public final void setGroupName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.groupName = str;
    }

    public final void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    public final void setHideCondition(FieldDisplayCondition fieldDisplayCondition) {
        this.hideCondition = fieldDisplayCondition;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }

    public final void setListener(ItemChangeListener<Object> itemChangeListener) {
        this.listener = itemChangeListener;
    }

    public final void setMandatory(Boolean bool) {
        this.isMandatory = bool;
    }

    public final void setParentObjectId(String str) {
        this.parentObjectId = str;
    }

    public final void setPreSetValue(String str) {
        this.preSetValue = str;
    }

    public final void setPropertyDefinition(PropertyDefinition propertyDefinition) {
        this.propertyDefinition = propertyDefinition;
    }

    public final void setPropertyDefinitionId(String str) {
        this.propertyDefinitionId = str;
    }

    public final void setPropertyDefinitionObservable(x6c x6cVar) {
        this.propertyDefinitionObservable = x6cVar;
    }

    public final void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    public final void setPropertyValueObservable(x6c x6cVar) {
        this.propertyValueObservable = x6cVar;
    }

    public final void setShowCondition(FieldDisplayCondition fieldDisplayCondition) {
        this.showCondition = fieldDisplayCondition;
    }

    public final void setSubmittedPropertyValue(Object obj) {
        Object obj2 = this._submittedPropertyValue;
        this._submittedPropertyValue = obj;
        fireItemChangeEvent(obj2, obj);
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setViewOnly(Boolean bool) {
        this.isViewOnly = bool;
    }

    public final void setViewType(String str) {
        this.viewType = str;
    }

    public final void setVisible(ObservableBoolean observableBoolean) {
        sq8.m48649h(observableBoolean, "<set-?>");
        this.isVisible = observableBoolean;
    }

    public final void set_submittedPropertyValue(Object obj) {
        this._submittedPropertyValue = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map] */
    public final Map<String, Object> toSavedTableFilterCriteria() {
        String scalarType;
        List<PropertyOptions> possibleValues;
        Stream<PropertyOptions> stream;
        final gge ggeVar = new gge();
        PropertyDefinition propertyDefinition = this.propertyDefinition;
        if (propertyDefinition == null || (scalarType = propertyDefinition.getScalarType()) == null) {
            scalarType = "text";
        }
        ggeVar.f25106a = scalarType;
        ggeVar.f25106a = e9g.m24606x(scalarType, "option", true) ? "selection" : (String) ggeVar.f25106a;
        PropertyDefinition propertyDefinition2 = this.propertyDefinition;
        if (propertyDefinition2 != null) {
            propertyDefinition2.isMultiple();
        }
        final HashMap map = new HashMap();
        PropertyDefinition propertyDefinition3 = this.propertyDefinition;
        if (propertyDefinition3 != null && (possibleValues = propertyDefinition3.getPossibleValues()) != null && (stream = possibleValues.stream()) != null) {
            final C02161 c02161 = new C02161(map);
            stream.forEach(new Consumer() { // from class: o.hd7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FormField.toSavedTableFilterCriteria$lambda$4(c02161, obj);
                }
            });
        }
        String str = e9g.m24606x("text", (String) ggeVar.f25106a, true) ? "contains" : "equals";
        Object submittedPropertyValue = getSubmittedPropertyValue();
        if (submittedPropertyValue instanceof List) {
            final ArrayList arrayList = new ArrayList();
            ((List) submittedPropertyValue).stream().forEach(new Consumer() { // from class: o.id7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FormField.toSavedTableFilterCriteria$lambda$6(ggeVar, arrayList, map, obj);
                }
            });
            HashMap map2 = new HashMap();
            HashMap map3 = map2;
            if (arrayList.size() > 0) {
                map2.put("conditions", arrayList);
                map2.put("operator", "OR");
                HashMap map4 = map2;
                if (arrayList.size() == 1) {
                    map4 = (Map) arrayList.get(0);
                }
                sq8.m48646e(map4);
                map3 = map4;
            }
            return map3;
        }
        HashMap map5 = new HashMap();
        if (submittedPropertyValue != null && !sq8.m48644c(submittedPropertyValue, "")) {
            map5.put("filterType", ggeVar.f25106a);
            map5.put("type", str);
            map5.put("filter", submittedPropertyValue);
            if (e9g.m24606x("dateTime", (String) ggeVar.f25106a, true) || e9g.m24606x("date", (String) ggeVar.f25106a, true)) {
                String strM16651f = a81.m16651f(new Temporal.Date(new Temporal.DateTime((String) submittedPropertyValue).toDate()));
                map5.put("filterType", "date");
                map5.put("dateFrom", strM16651f);
                map5.put("dateTo", strM16651f);
            }
        }
        return map5;
    }

    public String toString() {
        return "FormField(title=" + this.title + ", field=" + this.field + ", parentObjectId=" + this.parentObjectId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.title);
        this.field.writeToParcel(parcel, i);
        parcel.writeString(this.parentObjectId);
    }
}
