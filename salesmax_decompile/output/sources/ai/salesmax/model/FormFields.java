package ai.salesmax.model;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.event.ItemChangeEvent;
import ai.salesmax.model.event.ItemChangeListener;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.util.StringUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.ch3;
import p001o.dh3;
import p001o.gge;
import p001o.hh3;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.rl7;
import p001o.sq8;
import p001o.swd;
import p001o.x6c;
import p001o.xk7;
import p001o.y3i;
import p001o.yfe;

/* loaded from: classes.dex */
public final class FormFields extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FormFields> CREATOR = new Creator();
    private String accountId;
    private String createdById;
    private String displayName;
    private FormAttachCondition formAttachCondition;
    private ArrayList<List<FormField>> formFieldList;
    private String formName;
    private List<FormStepSchema> formSchema;
    private String formTitle;
    private String id;
    private transient HashMap<ItemChangeListener<List<FormField>>, Boolean> listeners;
    private SubmittedFormValues submittedFormValues;
    private String updatedById;

    public static final class Creator implements Parcelable.Creator<FormFields> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormFields createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FormFields(parcel.readInt() == 0 ? null : FormAttachCondition.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SubmittedFormValues.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormFields[] newArray(int i) {
            return new FormFields[i];
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getFormFieldsWithProperties$1 */
    public static final class C02171 extends kf9 implements xk7 {
        public static final C02171 INSTANCE = new C02171();

        public C02171() {
            super(1);
        }

        @Override // p001o.xk7
        public final Stream<? extends FormField> invoke(List<FormField> list) {
            return list.stream();
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getFormFieldsWithProperties$2 */
    public static final class C02182 extends kf9 implements xk7 {
        final /* synthetic */ String $businessId;
        final /* synthetic */ String $contactId;
        final /* synthetic */ String $engagementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02182(String str, String str2, String str3) {
            super(1);
            this.$engagementId = str;
            this.$contactId = str2;
            this.$businessId = str3;
        }

        @Override // p001o.xk7
        public final x6c invoke(final FormField formField) {
            String str = this.$engagementId;
            if (sq8.m48644c(formField.getFieldParentObjectType(), PropertyDefinitionRepository.f290m)) {
                str = this.$engagementId;
            }
            if (sq8.m48644c(formField.getFieldParentObjectType(), PropertyDefinitionRepository.f288k)) {
                str = this.$contactId;
            }
            if (sq8.m48644c(formField.getFieldParentObjectType(), PropertyDefinitionRepository.f289l)) {
                str = this.$businessId;
            }
            return swd.b0(str, formField.getPropertyDefinitionId()).d0(new rl7() { // from class: ai.salesmax.model.FormFields.getFormFieldsWithProperties.2.1
                @Override // p001o.rl7
                public final FormField apply(PropertyValue propertyValue) {
                    sq8.m48649h(propertyValue, "it3");
                    formField.setPropertyValue(propertyValue);
                    return formField;
                }
            });
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getSubmittedFormValuesAfter$1 */
    public static final class C02201 extends kf9 implements xk7 {
        public static final C02201 INSTANCE = new C02201();

        public C02201() {
            super(1);
        }

        @Override // p001o.xk7
        public final Stream<? extends FormField> invoke(List<FormField> list) {
            return list.stream();
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getSubmittedFormValuesAfter$2 */
    public static final class C02212 extends kf9 implements xk7 {
        public static final C02212 INSTANCE = new C02212();

        public C02212() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(!StringUtils.isBlank(formField.getFieldName()));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getSubmittedFormValuesAfter$3 */
    public static final class C02223 extends kf9 implements xk7 {
        public static final C02223 INSTANCE = new C02223();

        public C02223() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(formField.isVisible().m5959i());
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$getSubmittedFormValuesAfter$4 */
    public static final class C02234 extends kf9 implements xk7 {
        final /* synthetic */ HashMap<String, Object> $submittedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02234(HashMap<String, Object> map) {
            super(1);
            this.$submittedValues = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FormField) obj);
            return y3i.f54824a;
        }

        public final void invoke(FormField formField) {
            HashMap<String, Object> map = this.$submittedValues;
            String fieldName = formField.getFieldName();
            sq8.m48646e(fieldName);
            map.put(fieldName, formField.getSubmittedPropertyValue());
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$listAllFormField$1 */
    public static final class C02241 extends kf9 implements xk7 {
        public static final C02241 INSTANCE = new C02241();

        public C02241() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(!StringUtils.isBlank(formField.getFieldName()));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$setFormFieldValue$1 */
    public static final class C02251 extends kf9 implements xk7 {
        public static final C02251 INSTANCE = new C02251();

        public C02251() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(!StringUtils.isBlank(formField.getFieldName()));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$setFormFieldValue$2 */
    public static final class C02262 extends kf9 implements xk7 {
        public static final C02262 INSTANCE = new C02262();

        public C02262() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(formField.isVisible().m5959i());
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$setFormFieldValue$3 */
    public static final class C02273 extends kf9 implements xk7 {
        final /* synthetic */ HashMap<String, Object> $submittedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02273(HashMap<String, Object> map) {
            super(1);
            this.$submittedValues = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FormField) obj);
            return y3i.f54824a;
        }

        public final void invoke(FormField formField) {
            HashMap<String, Object> map = this.$submittedValues;
            String fieldName = formField.getFieldName();
            sq8.m48646e(fieldName);
            map.put(fieldName, formField.getSubmittedPropertyValue());
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$setFormFieldValue$4 */
    public static final class C02284 extends kf9 implements xk7 {
        final /* synthetic */ HashMap<String, Object> $submittedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02284(HashMap<String, Object> map) {
            super(1);
            this.$submittedValues = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FormField) obj);
            return y3i.f54824a;
        }

        public final void invoke(FormField formField) {
            formField.evaluateVisibility(this.$submittedValues);
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$toSavedTableFilterCriterias$1 */
    public static final class C02291 extends kf9 implements xk7 {
        public static final C02291 INSTANCE = new C02291();

        public C02291() {
            super(1);
        }

        @Override // p001o.xk7
        public final Stream<? extends FormField> invoke(List<FormField> list) {
            return list.stream();
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$toSavedTableFilterCriterias$2 */
    public static final class C02302 extends kf9 implements xk7 {
        final /* synthetic */ Map<String, Object> $filterCriterias;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02302(Map<String, Object> map) {
            super(1);
            this.$filterCriterias = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FormField) obj);
            return y3i.f54824a;
        }

        public final void invoke(FormField formField) {
            boolean zIsCustom = formField.isCustom();
            String fieldName = formField.getFieldName();
            if (fieldName == null) {
                fieldName = "";
            }
            if (zIsCustom) {
                fieldName = "##CUSTOM##" + fieldName;
            }
            Map<String, Object> savedTableFilterCriteria = formField.toSavedTableFilterCriteria();
            if (savedTableFilterCriteria.isEmpty()) {
                return;
            }
            this.$filterCriterias.put(fieldName, savedTableFilterCriteria);
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$1 */
    public static final class C02311 extends kf9 implements xk7 {
        public static final C02311 INSTANCE = new C02311();

        public C02311() {
            super(1);
        }

        @Override // p001o.xk7
        public final Stream<? extends FormField> invoke(List<FormField> list) {
            return list.stream();
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$2 */
    public static final class C02322 extends kf9 implements xk7 {
        public static final C02322 INSTANCE = new C02322();

        public C02322() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(!StringUtils.isBlank(formField.getFieldName()));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$3 */
    public static final class C02333 extends kf9 implements xk7 {
        public static final C02333 INSTANCE = new C02333();

        public C02333() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(formField.isVisible().m5959i());
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$4 */
    public static final class C02344 extends kf9 implements xk7 {
        public static final C02344 INSTANCE = new C02344();

        public C02344() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(sq8.m48644c(formField.isMandatory(), Boolean.TRUE));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$5 */
    public static final class C02355 extends kf9 implements xk7 {
        public static final C02355 INSTANCE = new C02355();

        public C02355() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(FormField formField) {
            return Boolean.valueOf(Objects.isNull(formField.getSubmittedPropertyValue()) || "".equals(formField.getSubmittedPropertyValue()));
        }
    }

    /* renamed from: ai.salesmax.model.FormFields$validateSubmittedFormValuesAfter$6 */
    public static final class C02366 extends kf9 implements xk7 {
        final /* synthetic */ gge $errorMessages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02366(gge ggeVar) {
            super(1);
            this.$errorMessages = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FormField) obj);
            return y3i.f54824a;
        }

        public final void invoke(FormField formField) {
            ArrayList arrayList = (ArrayList) this.$errorMessages.f25106a;
            PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
            arrayList.add((propertyDefinition != null ? propertyDefinition.getDisplayName() : null) + " is missing");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormFields() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FormFields copy$default(FormFields formFields, FormAttachCondition formAttachCondition, SubmittedFormValues submittedFormValues, int i, Object obj) {
        if ((i & 1) != 0) {
            formAttachCondition = formFields.formAttachCondition;
        }
        if ((i & 2) != 0) {
            submittedFormValues = formFields.submittedFormValues;
        }
        return formFields.copy(formAttachCondition, submittedFormValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stream getFormFieldsWithProperties$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Stream) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x6c getFormFieldsWithProperties$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (x6c) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stream getSubmittedFormValuesAfter$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Stream) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSubmittedFormValuesAfter$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSubmittedFormValuesAfter$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSubmittedFormValuesAfter$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stream listAllFormField$lambda$18(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Stream) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$19(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$20(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$23(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$24(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listAllFormField$lambda$33$lambda$32(FormFields formFields, gge ggeVar, List list, gge ggeVar2, ItemChangeEvent itemChangeEvent) {
        sq8.m48649h(formFields, "this$0");
        sq8.m48649h(ggeVar, "$submittedValues");
        sq8.m48649h(ggeVar2, "$allFormFieldsPublishable");
        synchronized (formFields) {
            ggeVar.f25106a = new HashMap();
            Stream stream = list.stream();
            final FormFields$listAllFormField$4$1$1$1 formFields$listAllFormField$4$1$1$1 = FormFields$listAllFormField$4$1$1$1.INSTANCE;
            Stream streamFilter = stream.filter(new Predicate() { // from class: o.jd7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return FormFields.listAllFormField$lambda$33$lambda$32$lambda$31$lambda$25(formFields$listAllFormField$4$1$1$1, obj);
                }
            });
            final FormFields$listAllFormField$4$1$1$2 formFields$listAllFormField$4$1$1$2 = FormFields$listAllFormField$4$1$1$2.INSTANCE;
            Object objCollect = streamFilter.filter(new Predicate() { // from class: o.ud7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return FormFields.listAllFormField$lambda$33$lambda$32$lambda$31$lambda$26(formFields$listAllFormField$4$1$1$2, obj);
                }
            }).collect(Collectors.toList());
            sq8.m48648g(objCollect, "collect(...)");
            for (FormField formField : (Iterable) objCollect) {
                HashMap map = (HashMap) ggeVar.f25106a;
                String fieldName = formField.getFieldName();
                sq8.m48646e(fieldName);
                map.put(fieldName, formField.getSubmittedPropertyValue());
            }
            List<FormField> list2 = (List) ggeVar2.f25106a;
            sq8.m48646e(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FormField) it.next()).evaluateVisibility((HashMap) ggeVar.f25106a);
            }
            Stream stream2 = list.stream();
            final FormFields$listAllFormField$4$1$1$5 formFields$listAllFormField$4$1$1$5 = FormFields$listAllFormField$4$1$1$5.INSTANCE;
            Stream streamFilter2 = stream2.filter(new Predicate() { // from class: o.de7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return FormFields.listAllFormField$lambda$33$lambda$32$lambda$31$lambda$29(formFields$listAllFormField$4$1$1$5, obj);
                }
            });
            final FormFields$listAllFormField$4$1$1$6 formFields$listAllFormField$4$1$1$6 = FormFields$listAllFormField$4$1$1$6.INSTANCE;
            Object objCollect2 = streamFilter2.filter(new Predicate() { // from class: o.ee7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return FormFields.listAllFormField$lambda$33$lambda$32$lambda$31$lambda$30(formFields$listAllFormField$4$1$1$6, obj);
                }
            }).collect(Collectors.toList());
            ggeVar2.f25106a = objCollect2;
            if (!Objects.equals(list2, objCollect2)) {
                formFields.fireItemChangeEvent(list2, (List) ggeVar2.f25106a);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$33$lambda$32$lambda$31$lambda$25(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$33$lambda$32$lambda$31$lambda$26(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$33$lambda$32$lambda$31$lambda$29(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAllFormField$lambda$33$lambda$32$lambda$31$lambda$30(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFormFieldValue$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFormFieldValue$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFormFieldValue$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFormFieldValue$lambda$17(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stream toSavedTableFilterCriterias$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Stream) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSavedTableFilterCriterias$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateSubmittedFormValuesAfter$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateSubmittedFormValuesAfter$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateSubmittedFormValuesAfter$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateSubmittedFormValuesAfter$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stream validateSubmittedFormValuesAfter$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Stream) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateSubmittedFormValuesAfter$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    public final void addListener(ItemChangeListener<List<FormField>> itemChangeListener) {
        sq8.m48649h(itemChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.put(itemChangeListener, Boolean.TRUE);
    }

    public final void clear() {
        this.listeners.clear();
    }

    public final FormAttachCondition component1() {
        return this.formAttachCondition;
    }

    public final SubmittedFormValues component2() {
        return this.submittedFormValues;
    }

    public final FormFields copy(FormAttachCondition formAttachCondition, SubmittedFormValues submittedFormValues) {
        return new FormFields(formAttachCondition, submittedFormValues);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormFields)) {
            return false;
        }
        FormFields formFields = (FormFields) obj;
        return sq8.m48644c(this.formAttachCondition, formFields.formAttachCondition) && sq8.m48644c(this.submittedFormValues, formFields.submittedFormValues);
    }

    public final void fireItemChangeEvent(List<FormField> list, List<FormField> list2) {
        ItemChangeEvent itemChangeEvent = new ItemChangeEvent(list2, list);
        Set<ItemChangeListener<List<FormField>>> setKeySet = this.listeners.keySet();
        sq8.m48648g(setKeySet, "<get-keys>(...)");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            ((ItemChangeListener) it.next()).onItemChanged(itemChangeEvent);
        }
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final FormAttachCondition getFormAttachCondition() {
        return this.formAttachCondition;
    }

    public final ArrayList<List<FormField>> getFormFieldList() {
        return this.formFieldList;
    }

    public final Map<String, List<FormField>> getFormFields(String str, String str2, String str3) {
        FormDefinition formDefinition;
        FormAttachCondition formAttachCondition = this.formAttachCondition;
        List<FormStepSchema> formSchema = (formAttachCondition == null || (formDefinition = formAttachCondition.getFormDefinition()) == null) ? null : formDefinition.getFormSchema();
        if (formSchema == null) {
            formSchema = ch3.m21246k();
        }
        ArrayList arrayList = new ArrayList();
        for (FormStepSchema formStepSchema : formSchema) {
            List<Field> fields = formStepSchema.getFields();
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(fields, 10));
            for (Field field : fields) {
                sq8.m48644c(field.getFieldParentObjectType(), PropertyDefinitionRepository.f290m);
                String str4 = sq8.m48644c(field.getFieldParentObjectType(), PropertyDefinitionRepository.f288k) ? str2 : str;
                if (sq8.m48644c(field.getFieldParentObjectType(), PropertyDefinitionRepository.f289l)) {
                    str4 = str3;
                }
                String stepTitle = formStepSchema.getStepTitle();
                if (stepTitle == null) {
                    stepTitle = "";
                }
                if (str4 == null) {
                    str4 = this.accountId;
                }
                arrayList2.add(new FormField(stepTitle, field, str4));
            }
            hh3.m30441A(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String groupName = ((FormField) obj).getGroupName();
            Object arrayList3 = linkedHashMap.get(groupName);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(groupName, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        return linkedHashMap;
    }

    public final x6c getFormFieldsWithProperties(String str, String str2, String str3) {
        FormFields$getFormFieldsWithProperties$x$1 formFields$getFormFieldsWithProperties$x$1 = FormFields$getFormFieldsWithProperties$x$1.INSTANCE;
        Stream<List<FormField>> stream = this.formFieldList.stream();
        final C02171 c02171 = C02171.INSTANCE;
        Stream<R> streamFlatMap = stream.flatMap(new Function() { // from class: o.je7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.getFormFieldsWithProperties$lambda$0(c02171, obj);
            }
        });
        final C02182 c02182 = new C02182(str, str2, str3);
        x6c x6cVarD0 = x6c.e0((Iterable) streamFlatMap.map(new Function() { // from class: o.ke7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.getFormFieldsWithProperties$lambda$1(c02182, obj);
            }
        }).collect(Collectors.toList())).m55733m(new ArrayList(), new C0215x47a56f63(formFields$getFormFieldsWithProperties$x$1)).m55027y().d0(new rl7() { // from class: ai.salesmax.model.FormFields.getFormFieldsWithProperties.3
            @Override // p001o.rl7
            public final FormFields apply(ArrayList<FormField> arrayList) {
                sq8.m48649h(arrayList, "it");
                return FormFields.this;
            }
        });
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    public final String getFormName() {
        return this.formName;
    }

    public final List<FormStepSchema> getFormSchema() {
        return this.formSchema;
    }

    public final String getFormTitle() {
        return this.formTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final HashMap<ItemChangeListener<List<FormField>>, Boolean> getListeners() {
        return this.listeners;
    }

    public final SubmittedFormValues getSubmittedFormValues() {
        return this.submittedFormValues;
    }

    public final Map<String, Object> getSubmittedFormValuesAfter() {
        HashMap map = new HashMap();
        Stream<List<FormField>> stream = this.formFieldList.stream();
        final C02201 c02201 = C02201.INSTANCE;
        Stream<R> streamFlatMap = stream.flatMap(new Function() { // from class: o.fe7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.getSubmittedFormValuesAfter$lambda$2(c02201, obj);
            }
        });
        final C02212 c02212 = C02212.INSTANCE;
        Stream streamFilter = streamFlatMap.filter(new Predicate() { // from class: o.ge7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.getSubmittedFormValuesAfter$lambda$3(c02212, obj);
            }
        });
        final C02223 c02223 = C02223.INSTANCE;
        Stream streamFilter2 = streamFilter.filter(new Predicate() { // from class: o.he7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.getSubmittedFormValuesAfter$lambda$4(c02223, obj);
            }
        });
        final C02234 c02234 = new C02234(map);
        streamFilter2.forEach(new Consumer() { // from class: o.ie7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FormFields.getSubmittedFormValuesAfter$lambda$5(c02234, obj);
            }
        });
        this.listeners.clear();
        return map;
    }

    public final String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        FormAttachCondition formAttachCondition = this.formAttachCondition;
        int iHashCode = (formAttachCondition == null ? 0 : formAttachCondition.hashCode()) * 31;
        SubmittedFormValues submittedFormValues = this.submittedFormValues;
        return iHashCode + (submittedFormValues != null ? submittedFormValues.hashCode() : 0);
    }

    public final List<FormField> listAllFormField() {
        Stream<List<FormField>> stream = this.formFieldList.stream();
        final FormFields$listAllFormField$allFormFields$1 formFields$listAllFormField$allFormFields$1 = FormFields$listAllFormField$allFormFields$1.INSTANCE;
        Stream<R> streamFlatMap = stream.flatMap(new Function() { // from class: o.xd7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.listAllFormField$lambda$18(formFields$listAllFormField$allFormFields$1, obj);
            }
        });
        final FormFields$listAllFormField$allFormFields$2 formFields$listAllFormField$allFormFields$2 = FormFields$listAllFormField$allFormFields$2.INSTANCE;
        final List list = (List) streamFlatMap.filter(new Predicate() { // from class: o.yd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.listAllFormField$lambda$19(formFields$listAllFormField$allFormFields$2, obj);
            }
        }).collect(Collectors.toList());
        final gge ggeVar = new gge();
        ggeVar.f25106a = new HashMap();
        Stream stream2 = list.stream();
        final C02241 c02241 = C02241.INSTANCE;
        Object objCollect = stream2.filter(new Predicate() { // from class: o.zd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.listAllFormField$lambda$20(c02241, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        for (FormField formField : (Iterable) objCollect) {
            HashMap map = (HashMap) ggeVar.f25106a;
            String fieldName = formField.getFieldName();
            sq8.m48646e(fieldName);
            map.put(fieldName, formField.getSubmittedPropertyValue());
        }
        sq8.m48646e(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FormField) it.next()).evaluateVisibility((HashMap) ggeVar.f25106a);
        }
        final gge ggeVar2 = new gge();
        Stream stream3 = list.stream();
        final FormFields$listAllFormField$allFormFieldsPublishable$1 formFields$listAllFormField$allFormFieldsPublishable$1 = FormFields$listAllFormField$allFormFieldsPublishable$1.INSTANCE;
        Stream streamFilter = stream3.filter(new Predicate() { // from class: o.ae7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.listAllFormField$lambda$23(formFields$listAllFormField$allFormFieldsPublishable$1, obj);
            }
        });
        final FormFields$listAllFormField$allFormFieldsPublishable$2 formFields$listAllFormField$allFormFieldsPublishable$2 = FormFields$listAllFormField$allFormFieldsPublishable$2.INSTANCE;
        ggeVar2.f25106a = streamFilter.filter(new Predicate() { // from class: o.be7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.listAllFormField$lambda$24(formFields$listAllFormField$allFormFieldsPublishable$2, obj);
            }
        }).collect(Collectors.toList());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((FormField) it2.next()).setListener(new ItemChangeListener() { // from class: o.ce7
                @Override // ai.salesmax.model.event.ItemChangeListener
                public final void onItemChanged(ItemChangeEvent itemChangeEvent) {
                    FormFields.listAllFormField$lambda$33$lambda$32(this.f17987a, ggeVar, list, ggeVar2, itemChangeEvent);
                }
            });
        }
        Object obj = ggeVar2.f25106a;
        sq8.m48648g(obj, "element");
        return (List) obj;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setCreatedById(String str) {
        this.createdById = str;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setFormAttachCondition(FormAttachCondition formAttachCondition) {
        this.formAttachCondition = formAttachCondition;
    }

    public final void setFormFieldList(ArrayList<List<FormField>> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.formFieldList = arrayList;
    }

    public final void setFormFieldValue(List<FormField> list, int i, Object obj) {
        sq8.m48649h(list, "allFormFields");
        list.get(i).setSubmittedPropertyValue(obj);
        HashMap map = new HashMap();
        Stream<FormField> stream = list.stream();
        final C02251 c02251 = C02251.INSTANCE;
        Stream<FormField> streamFilter = stream.filter(new Predicate() { // from class: o.kd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return FormFields.setFormFieldValue$lambda$14(c02251, obj2);
            }
        });
        final C02262 c02262 = C02262.INSTANCE;
        Stream<FormField> streamFilter2 = streamFilter.filter(new Predicate() { // from class: o.ld7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return FormFields.setFormFieldValue$lambda$15(c02262, obj2);
            }
        });
        final C02273 c02273 = new C02273(map);
        streamFilter2.forEach(new Consumer() { // from class: o.md7
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                FormFields.setFormFieldValue$lambda$16(c02273, obj2);
            }
        });
        Stream<FormField> stream2 = list.stream();
        final C02284 c02284 = new C02284(map);
        stream2.forEach(new Consumer() { // from class: o.nd7
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                FormFields.setFormFieldValue$lambda$17(c02284, obj2);
            }
        });
    }

    public final void setFormName(String str) {
        this.formName = str;
    }

    public final void setFormSchema(List<FormStepSchema> list) {
        sq8.m48649h(list, "<set-?>");
        this.formSchema = list;
    }

    public final void setFormTitle(String str) {
        this.formTitle = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setListeners(HashMap<ItemChangeListener<List<FormField>>, Boolean> map) {
        sq8.m48649h(map, "<set-?>");
        this.listeners = map;
    }

    public final void setSubmittedFormValues(SubmittedFormValues submittedFormValues) {
        this.submittedFormValues = submittedFormValues;
    }

    public final void setUpdatedById(String str) {
        this.updatedById = str;
    }

    public final Map<String, Object> toSavedTableFilterCriterias() {
        HashMap map = new HashMap();
        Stream<List<FormField>> stream = this.formFieldList.stream();
        final C02291 c02291 = C02291.INSTANCE;
        Stream<R> streamFlatMap = stream.flatMap(new Function() { // from class: o.od7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.toSavedTableFilterCriterias$lambda$6(c02291, obj);
            }
        });
        final C02302 c02302 = new C02302(map);
        streamFlatMap.forEach(new Consumer() { // from class: o.pd7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FormFields.toSavedTableFilterCriterias$lambda$7(c02302, obj);
            }
        });
        return map;
    }

    public String toString() {
        return "FormFields(formAttachCondition=" + this.formAttachCondition + ", submittedFormValues=" + this.submittedFormValues + ")";
    }

    public final String validateSubmittedFormValuesAfter() {
        gge ggeVar = new gge();
        ggeVar.f25106a = new ArrayList();
        Stream<List<FormField>> stream = this.formFieldList.stream();
        final C02311 c02311 = C02311.INSTANCE;
        Stream<R> streamFlatMap = stream.flatMap(new Function() { // from class: o.qd7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FormFields.validateSubmittedFormValuesAfter$lambda$8(c02311, obj);
            }
        });
        final C02322 c02322 = C02322.INSTANCE;
        Stream streamFilter = streamFlatMap.filter(new Predicate() { // from class: o.rd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.validateSubmittedFormValuesAfter$lambda$9(c02322, obj);
            }
        });
        final C02333 c02333 = C02333.INSTANCE;
        Stream streamFilter2 = streamFilter.filter(new Predicate() { // from class: o.sd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.validateSubmittedFormValuesAfter$lambda$10(c02333, obj);
            }
        });
        final C02344 c02344 = C02344.INSTANCE;
        Stream streamFilter3 = streamFilter2.filter(new Predicate() { // from class: o.td7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.validateSubmittedFormValuesAfter$lambda$11(c02344, obj);
            }
        });
        final C02355 c02355 = C02355.INSTANCE;
        Stream streamFilter4 = streamFilter3.filter(new Predicate() { // from class: o.vd7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FormFields.validateSubmittedFormValuesAfter$lambda$12(c02355, obj);
            }
        });
        final C02366 c02366 = new C02366(ggeVar);
        streamFilter4.forEach(new Consumer() { // from class: o.wd7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FormFields.validateSubmittedFormValuesAfter$lambda$13(c02366, obj);
            }
        });
        return kh3.p0((Iterable) ggeVar.f25106a, "\n", null, null, 0, null, null, 62, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        FormAttachCondition formAttachCondition = this.formAttachCondition;
        if (formAttachCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formAttachCondition.writeToParcel(parcel, i);
        }
        SubmittedFormValues submittedFormValues = this.submittedFormValues;
        if (submittedFormValues == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            submittedFormValues.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FormFields(FormAttachCondition formAttachCondition, SubmittedFormValues submittedFormValues, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : formAttachCondition, (i & 2) != 0 ? null : submittedFormValues);
    }

    public FormFields(FormAttachCondition formAttachCondition, SubmittedFormValues submittedFormValues) {
        FormDefinition formDefinition;
        FormDefinition formDefinition2;
        FormDefinition formDefinition3;
        FormDefinition formDefinition4;
        FormDefinition formDefinition5;
        FormDefinition formDefinition6;
        FormDefinition formDefinition7;
        this.formAttachCondition = formAttachCondition;
        this.submittedFormValues = submittedFormValues;
        String createdById = null;
        this.id = (formAttachCondition == null || (formDefinition7 = formAttachCondition.getFormDefinition()) == null) ? null : formDefinition7.getId();
        FormAttachCondition formAttachCondition2 = this.formAttachCondition;
        String accountId = formAttachCondition2 != null ? formAttachCondition2.getAccountId() : null;
        this.accountId = accountId == null ? "" : accountId;
        FormAttachCondition formAttachCondition3 = this.formAttachCondition;
        this.formName = (formAttachCondition3 == null || (formDefinition6 = formAttachCondition3.getFormDefinition()) == null) ? null : formDefinition6.getFormName();
        FormAttachCondition formAttachCondition4 = this.formAttachCondition;
        this.displayName = (formAttachCondition4 == null || (formDefinition5 = formAttachCondition4.getFormDefinition()) == null) ? null : formDefinition5.getDisplayName();
        FormAttachCondition formAttachCondition5 = this.formAttachCondition;
        this.formTitle = (formAttachCondition5 == null || (formDefinition4 = formAttachCondition5.getFormDefinition()) == null) ? null : formDefinition4.getFormTitle();
        FormAttachCondition formAttachCondition6 = this.formAttachCondition;
        List<FormStepSchema> formSchema = (formAttachCondition6 == null || (formDefinition3 = formAttachCondition6.getFormDefinition()) == null) ? null : formDefinition3.getFormSchema();
        this.formSchema = formSchema == null ? ch3.m21246k() : formSchema;
        FormAttachCondition formAttachCondition7 = this.formAttachCondition;
        this.updatedById = (formAttachCondition7 == null || (formDefinition2 = formAttachCondition7.getFormDefinition()) == null) ? null : formDefinition2.getUpdatedById();
        FormAttachCondition formAttachCondition8 = this.formAttachCondition;
        if (formAttachCondition8 != null && (formDefinition = formAttachCondition8.getFormDefinition()) != null) {
            createdById = formDefinition.getCreatedById();
        }
        this.createdById = createdById;
        this.formFieldList = new ArrayList<>();
        this.listeners = new HashMap<>();
    }
}
