package com.onesignal.user.internal.properties;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.Model;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PropertiesModel extends Model {
    public PropertiesModel() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.Model
    public Model createModelForProperty(String str, JSONObject jSONObject) throws JSONException {
        sq8.m48649h(str, "property");
        sq8.m48649h(jSONObject, "jsonObject");
        if (!sq8.m48644c(str, "tags")) {
            return null;
        }
        MapModel mapModel = new MapModel(this, "tags");
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sq8.m48648g(next, TransferTable.COLUMN_KEY);
            String string = jSONObject.getString(next);
            sq8.m48648g(string, "jsonObject.getString(key)");
            Model.setStringProperty$default(mapModel, next, string, null, false, 12, null);
        }
        return mapModel;
    }

    public final String getCountry() {
        return getStringProperty("country", PropertiesModel$country$2.INSTANCE);
    }

    public final String getLanguage() {
        return Model.getOptStringProperty$default(this, "language", null, 2, null);
    }

    public final Float getLocationAccuracy() {
        return Model.getOptFloatProperty$default(this, "locationAccuracy", null, 2, null);
    }

    public final Boolean getLocationBackground() {
        return Model.getOptBooleanProperty$default(this, "locationBackground", null, 2, null);
    }

    public final Double getLocationLatitude() {
        return Model.getOptDoubleProperty$default(this, "locationLatitude", null, 2, null);
    }

    public final Double getLocationLongitude() {
        return Model.getOptDoubleProperty$default(this, "locationLongitude", null, 2, null);
    }

    public final Long getLocationTimestamp() {
        return Model.getOptLongProperty$default(this, "locationTimestamp", null, 2, null);
    }

    public final Integer getLocationType() {
        return Model.getOptIntProperty$default(this, "locationType", null, 2, null);
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final MapModel<String> getTags() {
        return getMapModelProperty("tags", new PropertiesModel$tags$2(this));
    }

    public final String getTimezone() {
        return Model.getOptStringProperty$default(this, "timezone", null, 2, null);
    }

    public final void setCountry(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "country", str, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        Model.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f) {
        Model.setOptFloatProperty$default(this, "locationAccuracy", f, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        Model.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d) {
        Model.setOptDoubleProperty$default(this, "locationLatitude", d, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d) {
        Model.setOptDoubleProperty$default(this, "locationLongitude", d, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l) {
        Model.setOptLongProperty$default(this, "locationTimestamp", l, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        Model.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        Model.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
