package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class ListLocationsResponse extends GenericJson {

    @Key
    private List<Location> locations;

    @Key
    private String nextPageToken;

    static {
        Data.nullOf(Location.class);
    }

    public List<Location> getLocations() {
        return this.locations;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLocationsResponse setLocations(List<Location> list) {
        this.locations = list;
        return this;
    }

    public ListLocationsResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ListLocationsResponse set(String str, Object obj) {
        return (ListLocationsResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ListLocationsResponse clone() {
        return (ListLocationsResponse) super.clone();
    }
}
