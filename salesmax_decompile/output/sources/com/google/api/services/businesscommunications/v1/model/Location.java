package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Location extends GenericJson {

    @Key
    private String agent;

    @Key
    private Map<String, ConversationalSetting> conversationalSettings;

    @Key
    private String defaultLocale;

    @Key
    private List<LocationEntryPointConfig> locationEntryPointConfigs;

    @Key
    private String locationTestUrl;

    @Key
    private String name;

    @Key
    private String placeId;

    @Key
    private List<TestUrl> testUrls;

    static {
        Data.nullOf(ConversationalSetting.class);
        Data.nullOf(TestUrl.class);
    }

    public String getAgent() {
        return this.agent;
    }

    public Map<String, ConversationalSetting> getConversationalSettings() {
        return this.conversationalSettings;
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }

    public List<LocationEntryPointConfig> getLocationEntryPointConfigs() {
        return this.locationEntryPointConfigs;
    }

    public String getLocationTestUrl() {
        return this.locationTestUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getPlaceId() {
        return this.placeId;
    }

    public List<TestUrl> getTestUrls() {
        return this.testUrls;
    }

    public Location setAgent(String str) {
        this.agent = str;
        return this;
    }

    public Location setConversationalSettings(Map<String, ConversationalSetting> map) {
        this.conversationalSettings = map;
        return this;
    }

    public Location setDefaultLocale(String str) {
        this.defaultLocale = str;
        return this;
    }

    public Location setLocationEntryPointConfigs(List<LocationEntryPointConfig> list) {
        this.locationEntryPointConfigs = list;
        return this;
    }

    public Location setLocationTestUrl(String str) {
        this.locationTestUrl = str;
        return this;
    }

    public Location setName(String str) {
        this.name = str;
        return this;
    }

    public Location setPlaceId(String str) {
        this.placeId = str;
        return this;
    }

    public Location setTestUrls(List<TestUrl> list) {
        this.testUrls = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Location set(String str, Object obj) {
        return (Location) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Location clone() {
        return (Location) super.clone();
    }
}
