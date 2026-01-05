package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.isa;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PropertyOperationHelper {
    public static final PropertyOperationHelper INSTANCE = new PropertyOperationHelper();

    private PropertyOperationHelper() {
    }

    public final PropertiesObject createPropertiesFromOperation(SetTagOperation setTagOperation, PropertiesObject propertiesObject) {
        sq8.m48649h(setTagOperation, "operation");
        sq8.m48649h(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        Map mapM32696w = tags != null ? isa.m32696w(tags) : null;
        if (mapM32696w == null) {
            mapM32696w = new LinkedHashMap();
        }
        Map map = mapM32696w;
        map.put(setTagOperation.getKey(), setTagOperation.getValue());
        return new PropertiesObject(map, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final PropertiesObject createPropertiesFromOperation(DeleteTagOperation deleteTagOperation, PropertiesObject propertiesObject) {
        sq8.m48649h(deleteTagOperation, "operation");
        sq8.m48649h(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        Map mapM32696w = tags != null ? isa.m32696w(tags) : null;
        if (mapM32696w == null) {
            mapM32696w = new LinkedHashMap();
        }
        Map map = mapM32696w;
        map.put(deleteTagOperation.getKey(), null);
        return new PropertiesObject(map, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final PropertiesObject createPropertiesFromOperation(SetPropertyOperation setPropertyOperation, PropertiesObject propertiesObject) {
        String string;
        String string2;
        sq8.m48649h(setPropertyOperation, "operation");
        sq8.m48649h(propertiesObject, "propertiesObject");
        String property = setPropertyOperation.getProperty();
        Double dValueOf = null;
        dValueOf = null;
        Double dValueOf2 = null;
        dValueOf = null;
        if (sq8.m48644c(property, "language")) {
            Map<String, String> tags = propertiesObject.getTags();
            Object value = setPropertyOperation.getValue();
            return new PropertiesObject(tags, value != null ? value.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (sq8.m48644c(property, "timezone")) {
            Map<String, String> tags2 = propertiesObject.getTags();
            String language = propertiesObject.getLanguage();
            Object value2 = setPropertyOperation.getValue();
            return new PropertiesObject(tags2, language, value2 != null ? value2.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (sq8.m48644c(property, "country")) {
            Map<String, String> tags3 = propertiesObject.getTags();
            String language2 = propertiesObject.getLanguage();
            String timezoneId = propertiesObject.getTimezoneId();
            Object value3 = setPropertyOperation.getValue();
            return new PropertiesObject(tags3, language2, timezoneId, value3 != null ? value3.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (sq8.m48644c(property, "locationLatitude")) {
            Map<String, String> tags4 = propertiesObject.getTags();
            String language3 = propertiesObject.getLanguage();
            String timezoneId2 = propertiesObject.getTimezoneId();
            String country = propertiesObject.getCountry();
            Object value4 = setPropertyOperation.getValue();
            if (value4 != null && (string2 = value4.toString()) != null) {
                dValueOf2 = Double.valueOf(Double.parseDouble(string2));
            }
            return new PropertiesObject(tags4, language3, timezoneId2, country, dValueOf2, propertiesObject.getLongitude());
        }
        if (sq8.m48644c(property, "locationLongitude")) {
            Map<String, String> tags5 = propertiesObject.getTags();
            String language4 = propertiesObject.getLanguage();
            String timezoneId3 = propertiesObject.getTimezoneId();
            String country2 = propertiesObject.getCountry();
            Double latitude = propertiesObject.getLatitude();
            Object value5 = setPropertyOperation.getValue();
            if (value5 != null && (string = value5.toString()) != null) {
                dValueOf = Double.valueOf(Double.parseDouble(string));
            }
            return new PropertiesObject(tags5, language4, timezoneId3, country2, latitude, dValueOf);
        }
        return new PropertiesObject(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
