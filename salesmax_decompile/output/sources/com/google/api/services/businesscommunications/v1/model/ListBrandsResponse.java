package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class ListBrandsResponse extends GenericJson {

    @Key
    private List<Brand> brands;

    @Key
    private String nextPageToken;

    static {
        Data.nullOf(Brand.class);
    }

    public List<Brand> getBrands() {
        return this.brands;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListBrandsResponse setBrands(List<Brand> list) {
        this.brands = list;
        return this;
    }

    public ListBrandsResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ListBrandsResponse set(String str, Object obj) {
        return (ListBrandsResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ListBrandsResponse clone() {
        return (ListBrandsResponse) super.clone();
    }
}
