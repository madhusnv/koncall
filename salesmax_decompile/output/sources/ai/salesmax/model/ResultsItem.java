package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ResultsItem {
    public static final int $stable = 0;
    private final String formatted_address;
    private final Geometry geometry;
    private final String icon;
    private final String icon_background_color;
    private final String name;

    public ResultsItem(String str, String str2, Geometry geometry, String str3, String str4) {
        sq8.m48649h(str, "formatted_address");
        sq8.m48649h(str2, "name");
        sq8.m48649h(geometry, "geometry");
        sq8.m48649h(str3, "icon");
        sq8.m48649h(str4, "icon_background_color");
        this.formatted_address = str;
        this.name = str2;
        this.geometry = geometry;
        this.icon = str3;
        this.icon_background_color = str4;
    }

    public static /* synthetic */ ResultsItem copy$default(ResultsItem resultsItem, String str, String str2, Geometry geometry, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resultsItem.formatted_address;
        }
        if ((i & 2) != 0) {
            str2 = resultsItem.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            geometry = resultsItem.geometry;
        }
        Geometry geometry2 = geometry;
        if ((i & 8) != 0) {
            str3 = resultsItem.icon;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = resultsItem.icon_background_color;
        }
        return resultsItem.copy(str, str5, geometry2, str6, str4);
    }

    public final String component1() {
        return this.formatted_address;
    }

    public final String component2() {
        return this.name;
    }

    public final Geometry component3() {
        return this.geometry;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.icon_background_color;
    }

    public final ResultsItem copy(String str, String str2, Geometry geometry, String str3, String str4) {
        sq8.m48649h(str, "formatted_address");
        sq8.m48649h(str2, "name");
        sq8.m48649h(geometry, "geometry");
        sq8.m48649h(str3, "icon");
        sq8.m48649h(str4, "icon_background_color");
        return new ResultsItem(str, str2, geometry, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultsItem)) {
            return false;
        }
        ResultsItem resultsItem = (ResultsItem) obj;
        return sq8.m48644c(this.formatted_address, resultsItem.formatted_address) && sq8.m48644c(this.name, resultsItem.name) && sq8.m48644c(this.geometry, resultsItem.geometry) && sq8.m48644c(this.icon, resultsItem.icon) && sq8.m48644c(this.icon_background_color, resultsItem.icon_background_color);
    }

    public final String getFormatted_address() {
        return this.formatted_address;
    }

    public final Geometry getGeometry() {
        return this.geometry;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIcon_background_color() {
        return this.icon_background_color;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((this.formatted_address.hashCode() * 31) + this.name.hashCode()) * 31) + this.geometry.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.icon_background_color.hashCode();
    }

    public String toString() {
        return "ResultsItem(formatted_address=" + this.formatted_address + ", name=" + this.name + ", geometry=" + this.geometry + ", icon=" + this.icon + ", icon_background_color=" + this.icon_background_color + ")";
    }

    public /* synthetic */ ResultsItem(String str, String str2, Geometry geometry, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, geometry, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
