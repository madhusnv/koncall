package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.e9g;
import p001o.id5;
import p001o.kf9;
import p001o.qgb;
import p001o.sq8;
import p001o.uk7;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class Model implements IEventNotifier<IModelChangedHandler> {
    private Model _parentModel;
    private final String _parentProperty;
    private final EventProducer<IModelChangedHandler> changeNotifier;
    private final Map<String, Object> data;

    /* renamed from: com.onesignal.common.modeling.Model$notifyChanged$1 */
    public static final class C115801 extends kf9 implements xk7 {
        final /* synthetic */ ModelChangedArgs $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115801(ModelChangedArgs modelChangedArgs, String str) {
            super(1);
            this.$changeArgs = modelChangedArgs;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IModelChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IModelChangedHandler iModelChangedHandler) {
            sq8.m48649h(iModelChangedHandler, "it");
            iModelChangedHandler.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Model() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getAnyProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getAnyProperty(str, uk7Var);
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getBigDecimalProperty(str, uk7Var);
    }

    public static /* synthetic */ boolean getBooleanProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getBooleanProperty(str, uk7Var);
    }

    public static /* synthetic */ double getDoubleProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getDoubleProperty(str, uk7Var);
    }

    public static /* synthetic */ float getFloatProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getFloatProperty(str, uk7Var);
    }

    public static /* synthetic */ int getIntProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getIntProperty(str, uk7Var);
    }

    public static /* synthetic */ List getListProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getListProperty(str, uk7Var);
    }

    public static /* synthetic */ long getLongProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getLongProperty(str, uk7Var);
    }

    public static /* synthetic */ MapModel getMapModelProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getMapModelProperty(str, uk7Var);
    }

    public static /* synthetic */ Object getOptAnyProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptAnyProperty(str, uk7Var);
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptBigDecimalProperty(str, uk7Var);
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptBooleanProperty(str, uk7Var);
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptDoubleProperty(str, uk7Var);
    }

    public static /* synthetic */ Float getOptFloatProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptFloatProperty(str, uk7Var);
    }

    public static /* synthetic */ Integer getOptIntProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptIntProperty(str, uk7Var);
    }

    public static /* synthetic */ List getOptListProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptListProperty(str, uk7Var);
    }

    public static /* synthetic */ Long getOptLongProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptLongProperty(str, uk7Var);
    }

    public static /* synthetic */ MapModel getOptMapModelProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptMapModelProperty(str, uk7Var);
    }

    public static /* synthetic */ String getOptStringProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getOptStringProperty(str, uk7Var);
    }

    public static /* synthetic */ String getStringProperty$default(Model model, String str, uk7 uk7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i & 2) != 0) {
            uk7Var = null;
        }
        return model.getStringProperty(str, uk7Var);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new C115801(new ModelChangedArgs(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            Model model = this._parentModel;
            sq8.m48646e(model);
            model.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(Model model, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(Model model, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setBooleanProperty$default(Model model, String str, boolean z, String str2, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        model.setBooleanProperty(str, z, str2, z2);
    }

    public static /* synthetic */ void setDoubleProperty$default(Model model, String str, double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        model.setDoubleProperty(str, d, str3, z);
    }

    public static /* synthetic */ void setEnumProperty$default(Model model, String str, Enum r2, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        sq8.m48649h(str, "name");
        sq8.m48649h(r2, "value");
        sq8.m48649h(str2, "tag");
        model.setOptAnyProperty(str, r2.toString(), str2, z);
    }

    public static /* synthetic */ void setFloatProperty$default(Model model, String str, float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setIntProperty$default(Model model, String str, int i, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setIntProperty(str, i, str2, z);
    }

    public static /* synthetic */ void setListProperty$default(Model model, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setLongProperty$default(Model model, String str, long j, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        model.setLongProperty(str, j, str3, z);
    }

    public static /* synthetic */ void setMapModelProperty$default(Model model, String str, MapModel mapModel, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setMapModelProperty(str, mapModel, str2, z);
    }

    public static /* synthetic */ void setOptAnyProperty$default(Model model, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(Model model, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(Model model, String str, Boolean bool, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptBooleanProperty(str, bool, str2, z);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(Model model, String str, Double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptDoubleProperty(str, d, str2, z);
    }

    public static /* synthetic */ void setOptEnumProperty$default(Model model, String str, Enum r2, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        model.setOptAnyProperty(str, r2 != null ? r2.toString() : null, str2, z);
    }

    public static /* synthetic */ void setOptFloatProperty$default(Model model, String str, Float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setOptIntProperty$default(Model model, String str, Integer num, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptIntProperty(str, num, str2, z);
    }

    public static /* synthetic */ void setOptListProperty$default(Model model, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setOptLongProperty$default(Model model, String str, Long l, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptLongProperty(str, l, str2, z);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(Model model, String str, MapModel mapModel, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptMapModelProperty(str, mapModel, str2, z);
    }

    public static /* synthetic */ void setOptStringProperty$default(Model model, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setOptStringProperty(str, str2, str3, z);
    }

    public static /* synthetic */ void setStringProperty$default(Model model, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = ModelChangeTags.NORMAL;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        model.setStringProperty(str, str2, str3, z);
    }

    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        sq8.m48649h(str, "property");
        sq8.m48649h(jSONArray, "jsonArray");
        return null;
    }

    public Model createModelForProperty(String str, JSONObject jSONObject) {
        sq8.m48649h(str, "property");
        sq8.m48649h(jSONObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        sq8.m48647f(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(str, uk7Var);
        sq8.m48647f(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(str, uk7Var);
        sq8.m48647f(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Double optDoubleProperty = getOptDoubleProperty(str, uk7Var);
        sq8.m48647f(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String str) {
        sq8.m48649h(str, "name");
        T t = null;
        Object optAnyProperty$default = getOptAnyProperty$default(this, str, null, 2, null);
        if (optAnyProperty$default != null) {
            sq8.m48655n(3, "T");
            if (optAnyProperty$default instanceof Enum) {
                t = (T) optAnyProperty$default;
            } else if (optAnyProperty$default instanceof String) {
                sq8.m48655n(5, "T");
                t = (T) Enum.valueOf(null, (String) optAnyProperty$default);
            } else {
                sq8.m48655n(1, "T");
                t = (T) optAnyProperty$default;
            }
        }
        sq8.m48655n(1, "T");
        return t;
    }

    public final float getFloatProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Float optFloatProperty = getOptFloatProperty(str, uk7Var);
        sq8.m48647f(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, OutcomeConstants.OUTCOME_ID, null, 2, null);
    }

    public final int getIntProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Integer optIntProperty = getOptIntProperty(str, uk7Var);
        sq8.m48647f(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        List<T> optListProperty = getOptListProperty(str, uk7Var);
        sq8.m48647f(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Long optLongProperty = getOptLongProperty(str, uk7Var);
        sq8.m48647f(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> MapModel<T> getMapModelProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        MapModel<T> optMapModelProperty = getOptMapModelProperty(str, uk7Var);
        sq8.m48647f(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String str, uk7 uk7Var) {
        Object objInvoke;
        sq8.m48649h(str, "name");
        synchronized (this.data) {
            if (this.data.containsKey(str) || uk7Var == null) {
                objInvoke = this.data.get(str);
            } else {
                objInvoke = uk7Var.invoke();
                this.data.put(str, objInvoke);
            }
        }
        return objInvoke;
    }

    public final BigDecimal getOptBigDecimalProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? new BigDecimal(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? new BigDecimal(((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? new BigDecimal(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? new BigDecimal(((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        return (Boolean) getOptAnyProperty(str, uk7Var);
    }

    public final Double getOptDoubleProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Double ? (Double) optAnyProperty : optAnyProperty instanceof Float ? Double.valueOf(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Integer ? Double.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String str) {
        sq8.m48649h(str, "name");
        Object optAnyProperty$default = getOptAnyProperty$default(this, str, null, 2, null);
        if (optAnyProperty$default == null) {
            return null;
        }
        sq8.m48655n(3, "T");
        if (optAnyProperty$default instanceof Enum) {
            return (T) optAnyProperty$default;
        }
        if (optAnyProperty$default instanceof String) {
            sq8.m48655n(5, "T");
            return (T) Enum.valueOf(null, (String) optAnyProperty$default);
        }
        sq8.m48655n(1, "T");
        return (T) optAnyProperty$default;
    }

    public final Float getOptFloatProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Float ? (Float) optAnyProperty : optAnyProperty instanceof Double ? Float.valueOf((float) ((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof Integer ? Float.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? (Integer) optAnyProperty : optAnyProperty instanceof Long ? Integer.valueOf((int) ((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? Integer.valueOf((int) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        return (List) getOptAnyProperty(str, uk7Var);
    }

    public final Long getOptLongProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, uk7Var);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Long ? (Long) optAnyProperty : optAnyProperty instanceof Integer ? Long.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Float ? Long.valueOf((long) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> MapModel<T> getOptMapModelProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        return (MapModel) getOptAnyProperty(str, uk7Var);
    }

    public final String getOptStringProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        return (String) getOptAnyProperty(str, uk7Var);
    }

    public final String getStringProperty(String str, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        String optStringProperty = getOptStringProperty(str, uk7Var);
        sq8.m48647f(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String str) {
        sq8.m48649h(str, "name");
        return this.data.containsKey(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: all -> 0x019b, LOOP:1: B:18:0x0064->B:30:0x009d, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x0016, B:7:0x001c, B:9:0x002a, B:11:0x0037, B:12:0x003d, B:14:0x0041, B:16:0x004e, B:17:0x0054, B:20:0x0068, B:22:0x0076, B:24:0x007c, B:33:0x00a3, B:34:0x00a7, B:39:0x00b9, B:40:0x00cd, B:45:0x00df, B:46:0x00f3, B:51:0x0105, B:52:0x011a, B:57:0x012c, B:58:0x0140, B:63:0x0152, B:64:0x0166, B:69:0x0177, B:70:0x0187, B:67:0x016f, B:61:0x014a, B:55:0x0124, B:49:0x00fd, B:43:0x00d7, B:37:0x00b1, B:30:0x009d, B:71:0x0197), top: B:77:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initializeFromJson(JSONObject jSONObject) {
        boolean zM48644c;
        Method method;
        boolean z;
        sq8.m48649h(jSONObject, "jsonObject");
        synchronized (this.data) {
            this.data.clear();
            Iterator<String> itKeys = jSONObject.keys();
            sq8.m48648g(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    sq8.m48648g(next, "property");
                    Model modelCreateModelForProperty = createModelForProperty(next, (JSONObject) obj);
                    if (modelCreateModelForProperty != null) {
                        this.data.put(next, modelCreateModelForProperty);
                    }
                } else if (obj instanceof JSONArray) {
                    sq8.m48648g(next, "property");
                    List<?> listCreateListForProperty = createListForProperty(next, (JSONArray) obj);
                    if (listCreateListForProperty != null) {
                        this.data.put(next, listCreateListForProperty);
                    }
                } else {
                    Method[] methods = getClass().getMethods();
                    sq8.m48648g(methods, "this.javaClass.methods");
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        zM48644c = true;
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i];
                        if (sq8.m48644c(method.getReturnType(), Void.class) || qgb.m45432a(method) != 0) {
                            z = false;
                            if (!z) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            if (e9g.m24606x(method.getName(), "get" + next, true)) {
                                z = true;
                            }
                            if (!z) {
                            }
                        }
                    }
                    Class<?> returnType = method != null ? method.getReturnType() : null;
                    if (sq8.m48644c(returnType, Double.TYPE) ? true : sq8.m48644c(returnType, Double.class)) {
                        Map<String, Object> map = this.data;
                        sq8.m48648g(next, "property");
                        map.put(next, Double.valueOf(jSONObject.getDouble(next)));
                    } else {
                        if (sq8.m48644c(returnType, Long.TYPE) ? true : sq8.m48644c(returnType, Long.class)) {
                            Map<String, Object> map2 = this.data;
                            sq8.m48648g(next, "property");
                            map2.put(next, Long.valueOf(jSONObject.getLong(next)));
                        } else {
                            if (sq8.m48644c(returnType, Float.TYPE) ? true : sq8.m48644c(returnType, Float.class)) {
                                Map<String, Object> map3 = this.data;
                                sq8.m48648g(next, "property");
                                map3.put(next, Float.valueOf((float) jSONObject.getDouble(next)));
                            } else {
                                if (sq8.m48644c(returnType, Integer.TYPE) ? true : sq8.m48644c(returnType, Integer.class)) {
                                    Map<String, Object> map4 = this.data;
                                    sq8.m48648g(next, "property");
                                    map4.put(next, Integer.valueOf(jSONObject.getInt(next)));
                                } else {
                                    if (sq8.m48644c(returnType, Boolean.TYPE) ? true : sq8.m48644c(returnType, Boolean.class)) {
                                        Map<String, Object> map5 = this.data;
                                        sq8.m48648g(next, "property");
                                        map5.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
                                    } else {
                                        if (!sq8.m48644c(returnType, String.class)) {
                                            zM48644c = sq8.m48644c(returnType, String.class);
                                        }
                                        if (zM48644c) {
                                            Map<String, Object> map6 = this.data;
                                            sq8.m48648g(next, "property");
                                            map6.put(next, jSONObject.getString(next));
                                        } else {
                                            Map<String, Object> map7 = this.data;
                                            sq8.m48648g(next, "property");
                                            map7.put(next, jSONObject.get(next));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void initializeFromModel(String str, Model model) {
        sq8.m48649h(model, "model");
        Map<? extends String, ? extends Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : model.data.entrySet()) {
            if (entry.getValue() instanceof Model) {
                Object value = entry.getValue();
                sq8.m48647f(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                Model model2 = (Model) value;
                model2._parentModel = this;
                sq8.m48648g(mapSynchronizedMap, "newData");
                mapSynchronizedMap.put(entry.getKey(), model2);
            } else {
                sq8.m48648g(mapSynchronizedMap, "newData");
                mapSynchronizedMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (str != null) {
            sq8.m48648g(mapSynchronizedMap, "newData");
            mapSynchronizedMap.put(OutcomeConstants.OUTCOME_ID, str);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            sq8.m48648g(mapSynchronizedMap, "newData");
            map.putAll(mapSynchronizedMap);
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void setAnyProperty(String str, Object obj, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(obj, "value");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, obj, str2, z);
    }

    public final void setBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(bigDecimal, "value");
        sq8.m48649h(str2, "tag");
        setOptBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public final void setBooleanProperty(String str, boolean z, String str2, boolean z2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptBooleanProperty(str, Boolean.valueOf(z), str2, z2);
    }

    public final void setDoubleProperty(String str, double d, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptDoubleProperty(str, Double.valueOf(d), str2, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String str, T t, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(t, "value");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, t.toString(), str2, z);
    }

    public final void setFloatProperty(String str, float f, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptFloatProperty(str, Float.valueOf(f), str2, z);
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        setStringProperty$default(this, OutcomeConstants.OUTCOME_ID, str, null, false, 12, null);
    }

    public final void setIntProperty(String str, int i, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptIntProperty(str, Integer.valueOf(i), str2, z);
    }

    public final <T> void setListProperty(String str, List<? extends T> list, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(list, "value");
        sq8.m48649h(str2, "tag");
        setOptListProperty(str, list, str2, z);
    }

    public final void setLongProperty(String str, long j, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptLongProperty(str, Long.valueOf(j), str2, z);
    }

    public final <T> void setMapModelProperty(String str, MapModel<T> mapModel, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(mapModel, "value");
        sq8.m48649h(str2, "tag");
        setOptMapModelProperty(str, mapModel, str2, z);
    }

    public final void setOptAnyProperty(String str, Object obj, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        Object obj2 = this.data.get(str);
        synchronized (this.data) {
            if (!sq8.m48644c(obj2, obj) || z) {
                if (obj != null) {
                    this.data.put(str, obj);
                } else if (this.data.containsKey(str)) {
                    this.data.remove(str);
                }
                y3i y3iVar = y3i.f54824a;
                notifyChanged(str, str, str2, obj2, obj);
            }
        }
    }

    public final void setOptBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, bigDecimal != null ? bigDecimal.toString() : null, str2, z);
    }

    public final void setOptBooleanProperty(String str, Boolean bool, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, bool, str2, z);
    }

    public final void setOptDoubleProperty(String str, Double d, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, d, str2, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String str, T t, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, t != null ? t.toString() : null, str2, z);
    }

    public final void setOptFloatProperty(String str, Float f, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, f, str2, z);
    }

    public final void setOptIntProperty(String str, Integer num, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, num, str2, z);
    }

    public final <T> void setOptListProperty(String str, List<? extends T> list, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, list, str2, z);
    }

    public final void setOptLongProperty(String str, Long l, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, l, str2, z);
    }

    public final <T> void setOptMapModelProperty(String str, MapModel<T> mapModel, String str2, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "tag");
        setOptAnyProperty(str, mapModel, str2, z);
    }

    public final void setOptStringProperty(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str3, "tag");
        setOptAnyProperty(str, str2, str3, z);
    }

    public final void setStringProperty(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        sq8.m48649h(str3, "tag");
        setOptStringProperty(str, str2, str3, z);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Model) {
                    jSONObject.put(entry.getKey(), ((Model) value).toJSON());
                } else if (value instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object obj : (List) value) {
                        if (obj instanceof Model) {
                            jSONArray.put(((Model) obj).toJSON());
                        } else {
                            jSONArray.put(obj);
                        }
                    }
                    jSONObject.put(entry.getKey(), jSONArray);
                } else {
                    jSONObject.put(entry.getKey(), value);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
        return jSONObject;
    }

    public Model(Model model, String str) throws Exception {
        this._parentModel = model;
        this._parentProperty = str;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        sq8.m48648g(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.data = mapSynchronizedMap;
        this.changeNotifier = new EventProducer<>();
        Model model2 = this._parentModel;
        if (model2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (model2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(IModelChangedHandler iModelChangedHandler) {
        sq8.m48649h(iModelChangedHandler, "handler");
        this.changeNotifier.subscribe(iModelChangedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(IModelChangedHandler iModelChangedHandler) {
        sq8.m48649h(iModelChangedHandler, "handler");
        this.changeNotifier.unsubscribe(iModelChangedHandler);
    }

    public /* synthetic */ Model(Model model, String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : model, (i & 2) != 0 ? null : str);
    }
}
